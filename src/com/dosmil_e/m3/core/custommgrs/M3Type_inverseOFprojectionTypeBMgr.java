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


public class M3Type_inverseOFprojectionTypeBMgr extends EAIBranchMgr {


  public M3Type_inverseOFprojectionTypeBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFprojectionType( theNode);
    }




    protected com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionType( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3TypeIfc aType = null;
      try { aType = (com.dosmil_e.m3.core.ifc.M3TypeIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aType == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFprojectionType = null;
      try { someInverseOFprojectionType = aType.getInverseOFprojectionType( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFprojectionType;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFprojectionType"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFprojectionType: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Type_inverseOFprojectionType_addChosen_ProjectionConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFprojectionType ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3Type_inverseOFprojectionType_remove.class
        }
      )
    };
  }



}


