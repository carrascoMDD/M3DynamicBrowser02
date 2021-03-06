package com.dosmil_e.m3.traversal.custommgrs;

// OneToManyOneBMgr

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


public class M3NodeConfig_metaNodeMgrBMgr extends EAIBranchMgr {


  public M3NodeConfig_metaNodeMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getMetaNodeMgr( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfig = null;
      try { aNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aNodeConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aMetaNodeMgr = null;
      try { aMetaNodeMgr = aNodeConfig.getMetaNodeMgr( aCtxt);} catch( EAIException anEx) {}

	    return aMetaNodeMgr;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "MetaNodeMgr"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "metaNodeMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3NodeConfig_metaNodeMgr_setChosen_NodeMgr.class,
					M3NodeConfig_metaNodeMgr_setChosen_ReplicateNodeMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "metaNodeMgr ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3NodeConfig_metaNodeMgr_remove.class
        }
      )
    };
  }



}


