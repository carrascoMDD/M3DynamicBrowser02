package com.dosmil_e.m3.projection.custommgrs;

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


public class M3ProjectionConfig_excludedInRelationshipNamedBMgr extends EAIBranchMgr {


  public M3ProjectionConfig_excludedInRelationshipNamedBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getExcludedInRelationshipNamed( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamed( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc aProjectionConfig = null;
      try { aProjectionConfig = (com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aProjectionConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3AttributeIfc aExcludedInRelationshipNamed = null;
      try { aExcludedInRelationshipNamed = aProjectionConfig.getExcludedInRelationshipNamed( aCtxt);} catch( EAIException anEx) {}

	    return aExcludedInRelationshipNamed;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "ExcludedInRelationshipNamed"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "excludedInRelationshipNamed: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					M3ProjectionConfig_excludedInRelationshipNamed_setChosen_Attribute.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "excludedInRelationshipNamed ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3ProjectionConfig_excludedInRelationshipNamed_remove.class
        }
      )
    };
  }



}


