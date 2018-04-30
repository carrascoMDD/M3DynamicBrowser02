package com.dosmil_e.m3.traversal.custommgrs;

// OneToManyManyAggregationBMgr

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


public class M3TraversalConfig_attributeConfigsBMgr extends EAIBranchMgr {


  public M3TraversalConfig_attributeConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getAttributeConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
      try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aTraversalConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = null;
      try { someAttributeConfigs = aTraversalConfig.getAttributeConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someAttributeConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "AttributeConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "attributeConfigs: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3TraversalConfig_attributeConfigs_addNew_AttributeConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "attributeConfigs + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_delete.class
        }
      )
    };
  }






}


