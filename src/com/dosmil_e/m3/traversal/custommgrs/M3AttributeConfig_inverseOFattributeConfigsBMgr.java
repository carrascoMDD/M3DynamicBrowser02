package com.dosmil_e.m3.traversal.custommgrs;

// ManyToManyBMgr

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


public class M3AttributeConfig_inverseOFattributeConfigsBMgr extends EAIBranchMgr {


  public M3AttributeConfig_inverseOFattributeConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getInverseOFattributeConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFattributeConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfig = null;
      try { aAttributeConfig = (com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAttributeConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = null;
      try { someInverseOFattributeConfigs = aAttributeConfig.getInverseOFattributeConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someInverseOFattributeConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InverseOFattributeConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "inverseOFattributeConfigs: ";
    }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3AttributeConfig_inverseOFattributeConfigs_addChosen_NodeConfig.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "inverseOFattributeConfigs ? (N)" // setSubMenuLabel
      )
    };
  }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          M3AttributeConfig_inverseOFattributeConfigs_remove.class
        }
      )
    };
  }













}


