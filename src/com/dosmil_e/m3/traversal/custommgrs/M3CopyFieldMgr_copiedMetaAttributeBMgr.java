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


public class M3CopyFieldMgr_copiedMetaAttributeBMgr extends EAIBranchMgr {


  public M3CopyFieldMgr_copiedMetaAttributeBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getCopiedMetaAttribute( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttribute( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc aCopyFieldMgr = null;
      try { aCopyFieldMgr = (com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aCopyFieldMgr == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3AttributeIfc aCopiedMetaAttribute = null;
      try { aCopiedMetaAttribute = aCopyFieldMgr.getCopiedMetaAttribute( aCtxt);} catch( EAIException anEx) {}

	    return aCopiedMetaAttribute;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "CopiedMetaAttribute"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "copiedMetaAttribute: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3CopyFieldMgr_copiedMetaAttribute_setChosen_Attribute.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "copiedMetaAttribute ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3CopyFieldMgr_copiedMetaAttribute_remove.class
        }
      )
    };
  }



}


