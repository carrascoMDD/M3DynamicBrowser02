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


public class M3TraversalConfig_nodeMgrsBMgr extends EAIBranchMgr {


  public M3TraversalConfig_nodeMgrsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getNodeMgrs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] getNodeMgrs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
      try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aTraversalConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = null;
      try { someNodeMgrs = aTraversalConfig.getNodeMgrs( aCtxt);} catch( EAIException anEx) {}


	    return someNodeMgrs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "NodeMgrs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "nodeMgrs: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3TraversalConfig_nodeMgrs_addNew_NodeMgr.class,
					M3TraversalConfig_nodeMgrs_addNew_ReplicateNodeMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "nodeMgrs + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          com.dosmil_e.m3.traversal.custommgrs.M3NodeMgr_delete.class
        }
      )
    };
  }






}


