package com.dosmil_e.m3.traversal.custommgrs;

// OneToManyManyAggregationBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.metamgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;



import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeNode;

import java.util.Vector;


public class M3TraversalConfig_branchConfigsBMgr extends EAIBranchMgr {


  public M3TraversalConfig_branchConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getBranchConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
      try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aTraversalConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = null;
      try { someBranchConfigs = aTraversalConfig.getBranchConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someBranchConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "BranchConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "branchConfigs: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3TraversalConfig_branchConfigs_addNew_BranchConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "branchConfigs + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_delete.class
        }
      )
    };
  }






}


