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


public class M3FieldMgr_inverseOFmetaFieldMgrBMgr extends EAIBranchMgr {


  public M3FieldMgr_inverseOFmetaFieldMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFmetaFieldMgr( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaFieldMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aFieldMgr = null;
      try { aFieldMgr = (com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aFieldMgr == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = null;
      try { someInverseOFmetaFieldMgr = aFieldMgr.getInverseOFmetaFieldMgr( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFmetaFieldMgr;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFmetaFieldMgr"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFmetaFieldMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3FieldMgr_inverseOFmetaFieldMgr_addChosen_AttributeConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFmetaFieldMgr ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3FieldMgr_inverseOFmetaFieldMgr_remove.class
        }
      )
    };
  }



}


