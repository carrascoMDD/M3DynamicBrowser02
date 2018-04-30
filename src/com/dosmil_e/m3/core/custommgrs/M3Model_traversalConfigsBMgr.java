package com.dosmil_e.m3.core.custommgrs;

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


public class M3Model_traversalConfigsBMgr extends EAIBranchMgr {


  public M3Model_traversalConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getTraversalConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] getTraversalConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = null;
      try { aModel = (com.dosmil_e.m3.core.ifc.M3ModelIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aModel == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc[] someTraversalConfigs = null;
      try { someTraversalConfigs = aModel.getTraversalConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someTraversalConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "TraversalConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "traversalConfigs: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Model_traversalConfigs_addNew_TraversalConfig.class,
					M3Model_traversalConfigs_addNew_ProjectionConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "traversalConfigs + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_delete.class
        }
      )
    };
  }






}


