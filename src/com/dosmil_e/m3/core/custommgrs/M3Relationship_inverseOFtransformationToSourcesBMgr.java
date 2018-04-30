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


public class M3Relationship_inverseOFtransformationToSourcesBMgr extends EAIBranchMgr {


  public M3Relationship_inverseOFtransformationToSourcesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFtransformationToSources( theNode);
    }




    protected com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSources( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = null;
      try { aRelationship = (com.dosmil_e.m3.core.ifc.M3RelationshipIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelationship == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] someInverseOFtransformationToSources = null;
      try { someInverseOFtransformationToSources = aRelationship.getInverseOFtransformationToSources( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFtransformationToSources;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFtransformationToSources"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFtransformationToSources: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3Relationship_inverseOFtransformationToSources_addChosen_ProjectionConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFtransformationToSources ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3Relationship_inverseOFtransformationToSources_remove.class
        }
      )
    };
  }



}


