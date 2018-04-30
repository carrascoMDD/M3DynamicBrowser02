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


public class M3Relationship_inverseOFreplicatedMetaRelationshipBMgr extends EAIBranchMgr {


  public M3Relationship_inverseOFreplicatedMetaRelationshipBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFreplicatedMetaRelationship( theNode);
    }




    protected com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] getInverseOFreplicatedMetaRelationship( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = null;
      try { aRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelationship == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] someInverseOFreplicatedMetaRelationship = null;
      try { someInverseOFreplicatedMetaRelationship = aRelationship.getInverseOFreplicatedMetaRelationship( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFreplicatedMetaRelationship;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFreplicatedMetaRelationship"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFreplicatedMetaRelationship: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Relationship_inverseOFreplicatedMetaRelationship_addChosen_ReplicateBranchMgr.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFreplicatedMetaRelationship ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3Relationship_inverseOFreplicatedMetaRelationship_remove.class
        }
      )
    };
  }



}


