package com.dosmil_e.m3.core.custommgrs;

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


public class M3Attribute_inverseOFcopiedMetaAttributeBMgr extends EAIBranchMgr {


  public M3Attribute_inverseOFcopiedMetaAttributeBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFcopiedMetaAttribute( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] getInverseOFcopiedMetaAttribute( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3AttributeIfc aAttribute = null;
      try { aAttribute = (com.dosmil_e.m3.core.ifc.M3AttributeIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAttribute == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] someInverseOFcopiedMetaAttribute = null;
      try { someInverseOFcopiedMetaAttribute = aAttribute.getInverseOFcopiedMetaAttribute( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFcopiedMetaAttribute;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFcopiedMetaAttribute"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFcopiedMetaAttribute: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Attribute_inverseOFcopiedMetaAttribute_addChosen_CopyFieldMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFcopiedMetaAttribute ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3Attribute_inverseOFcopiedMetaAttribute_remove.class
        }
      )
    };
  }



}


