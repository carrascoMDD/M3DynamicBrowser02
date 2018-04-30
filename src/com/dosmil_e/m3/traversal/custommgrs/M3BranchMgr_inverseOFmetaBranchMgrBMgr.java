package com.dosmil_e.m3.traversal.custommgrs;

// OneToManyManyBMgr

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


public class M3BranchMgr_inverseOFmetaBranchMgrBMgr extends EAIBranchMgr {


  public M3BranchMgr_inverseOFmetaBranchMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFmetaBranchMgr( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaBranchMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aBranchMgr = null;
      try { aBranchMgr = (com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBranchMgr == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = null;
      try { someInverseOFmetaBranchMgr = aBranchMgr.getInverseOFmetaBranchMgr( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFmetaBranchMgr;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFmetaBranchMgr"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFmetaBranchMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3BranchMgr_inverseOFmetaBranchMgr_addChosen_BranchConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFmetaBranchMgr ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3BranchMgr_inverseOFmetaBranchMgr_remove.class
        }
      )
    };
  }



}


