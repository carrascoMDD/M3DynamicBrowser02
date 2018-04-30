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


public class M3NodeMgr_inverseOFmetaNodeMgrBMgr extends EAIBranchMgr {


  public M3NodeMgr_inverseOFmetaNodeMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFmetaNodeMgr( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaNodeMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aNodeMgr = null;
      try { aNodeMgr = (com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aNodeMgr == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = null;
      try { someInverseOFmetaNodeMgr = aNodeMgr.getInverseOFmetaNodeMgr( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFmetaNodeMgr;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFmetaNodeMgr"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFmetaNodeMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3NodeMgr_inverseOFmetaNodeMgr_addChosen_NodeConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFmetaNodeMgr ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3NodeMgr_inverseOFmetaNodeMgr_remove.class
        }
      )
    };
  }



}


