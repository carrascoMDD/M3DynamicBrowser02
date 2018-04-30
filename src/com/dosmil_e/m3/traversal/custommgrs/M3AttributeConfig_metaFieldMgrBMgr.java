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


public class M3AttributeConfig_metaFieldMgrBMgr extends EAIBranchMgr {


  public M3AttributeConfig_metaFieldMgrBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getMetaFieldMgr( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgr( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfig = null;
      try { aAttributeConfig = (com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAttributeConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = null;
      try { aMetaFieldMgr = aAttributeConfig.getMetaFieldMgr( aCtxt);} catch( EAIException anEx) {}

	    return aMetaFieldMgr;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "MetaFieldMgr"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "metaFieldMgr: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3AttributeConfig_metaFieldMgr_setChosen_FieldMgr.class,
					M3AttributeConfig_metaFieldMgr_setChosen_CopyFieldMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "metaFieldMgr ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3AttributeConfig_metaFieldMgr_remove.class
        }
      )
    };
  }



}


