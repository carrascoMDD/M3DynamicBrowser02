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


public class M3Relationship_inverseOFtargetToTransfomationsBMgr extends EAIBranchMgr {


  public M3Relationship_inverseOFtargetToTransfomationsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFtargetToTransfomations( theNode);
    }




    protected com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtargetToTransfomations( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = null;
      try { aRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelationship == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtargetToTransfomations = null;
      try { someInverseOFtargetToTransfomations = aRelationship.getInverseOFtargetToTransfomations( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFtargetToTransfomations;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFtargetToTransfomations"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFtargetToTransfomations: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Relationship_inverseOFtargetToTransfomations_addChosen_ProjectionConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFtargetToTransfomations ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3Relationship_inverseOFtargetToTransfomations_remove.class
        }
      )
    };
  }



}


