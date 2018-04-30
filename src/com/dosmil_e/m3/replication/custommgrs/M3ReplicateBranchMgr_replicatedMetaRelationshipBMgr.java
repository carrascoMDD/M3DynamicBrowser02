package com.dosmil_e.m3.replication.custommgrs;

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


public class M3ReplicateBranchMgr_replicatedMetaRelationshipBMgr extends EAIBranchMgr {


  public M3ReplicateBranchMgr_replicatedMetaRelationshipBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getReplicatedMetaRelationship( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationship( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aReplicateBranchMgr = null;
      try { aReplicateBranchMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aReplicateBranchMgr == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicatedMetaRelationship = null;
      try { aReplicatedMetaRelationship = aReplicateBranchMgr.getReplicatedMetaRelationship( aCtxt);} catch( EAIException anEx) {}

	    return aReplicatedMetaRelationship;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "ReplicatedMetaRelationship"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "replicatedMetaRelationship: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3ReplicateBranchMgr_replicatedMetaRelationship_setChosen_Relationship.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "replicatedMetaRelationship ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3ReplicateBranchMgr_replicatedMetaRelationship_remove.class
        }
      )
    };
  }



}


