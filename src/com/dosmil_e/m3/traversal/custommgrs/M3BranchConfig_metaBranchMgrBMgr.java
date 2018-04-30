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


public class M3BranchConfig_metaBranchMgrBMgr extends EAIBranchMgr {


  public M3BranchConfig_metaBranchMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getMetaBranchMgr( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
      try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBranchConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aMetaBranchMgr = null;
      try { aMetaBranchMgr = aBranchConfig.getMetaBranchMgr( aCtxt);} catch( EAIException anEx) {}

	    return aMetaBranchMgr;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "MetaBranchMgr"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "metaBranchMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3BranchConfig_metaBranchMgr_setChosen_BranchMgr.class,
					M3BranchConfig_metaBranchMgr_setChosen_ReplicateBranchMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "metaBranchMgr ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3BranchConfig_metaBranchMgr_remove.class
        }
      )
    };
  }



}


