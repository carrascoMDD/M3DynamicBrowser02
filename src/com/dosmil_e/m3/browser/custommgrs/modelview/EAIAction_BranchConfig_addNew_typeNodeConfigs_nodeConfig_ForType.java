package com.dosmil_e.m3.browser.custommgrs.modelview;

// OneToManyManyAggregationBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
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


public class EAIAction_BranchConfig_addNew_typeNodeConfigs_nodeConfig_ForType extends EAIRebindableAction {

  protected com.dosmil_e.m3.core.ifc.M3TypeIfc                  vM3TypeForNewRelated;

  public EAIActionIfc cloneBase() throws CloneNotSupportedException {

    EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType anAction =
      new EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType( vTargetNode, vM3TypeForNewRelated);
    anAction.setIcon( getIcon());
	  anAction.setName( getName());
		return anAction;
  }

  boolean vPackDialogs = false;

  public EAIAction_BranchConfig_addNew_typeNodeConfigs_nodeConfig_ForType(
    EAITreeNode                         theNode,
    com.dosmil_e.m3.core.ifc.M3TypeIfc  theM3TypeForNewRelated) {

    super( theNode);
    vM3TypeForNewRelated  = theM3TypeForNewRelated;
  }


  public  com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeForNewRelated() {
    return vM3TypeForNewRelated;
  }

  protected void initIcon() {
    vIcon = new ImageIcon("images/addrelatedtype.gif");
  }


  protected void initName() {
    vName = new String("Add Related Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRelated();
    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vName = "Add " + aM3TypeNameString + " Related";
        }
      }
    }
  }


  protected void initNameInNestedMenu() {
    vNameInNestedMenu = new String("Related Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRelated();
    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3TypeName = aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vNameInNestedMenu = aM3TypeNameString;
        }
      }
    }
  }

  protected void initNameForToolBar() {
    vNameForToolBar = new String("Add Related Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRelated();
    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3TypeName = aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vNameForToolBar = "Add " + aM3TypeNameString + " Related";
        }
      }
    }
  }

  protected void initNameInMenu() {
    vNameInMenu = new String("Add Related Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRelated();

    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vNameInMenu = "Add " + aM3TypeNameString + " Related";
        }
      }
    }
  }



    // Implementation of the ActionListener process in Action
  public void actionPerformed( ActionEvent theEvent) {
    if( vTargetNode == null) { return;}

    EAIBranchMgr.treeActionsBeforeActionStatic( vTargetNode);

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRelated();
    if( aM3Type == null) { return;}

    EAIMMNameIfc aM3TypeName = null;
    try { aM3TypeName = aM3Type.getName();} catch( EAIException anEx) {}
    if( aM3TypeName == null) { return;}
    String aM3TypeNameString = aM3TypeName.getString();
    if( aM3TypeNameString == null) { return;}

    EAIMMNameIfc aNewRelatedTypeNodeConfigName  = new EAIMMName( aM3TypeNameString + "RelTNCx");
    EAIMMNameIfc aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NCx");

    Object aNodeUserObject = vTargetNode.getUserObject();
    if( aNodeUserObject == null) { return;}

    EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
    if( aCtxt == null) { return;}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       aBranchConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    aTraversalConfig = null;
    try {
      try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
      if( aBranchConfig == null) { return;}

      aTraversalConfig = aBranchConfig.getTraversalConfig( aCtxt);
      if( aTraversalConfig == null) { return;}

      if( aBranchConfig.hasTypeNodeConfigsNamed( aCtxt, aNewRelatedTypeNodeConfigName)) { return;}

      int aCounter  = 0;
      while( aTraversalConfig.hasNodeConfigsNamed( aCtxt, aNewNodeConfigName)) {
        aCounter++;
        aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NC" + aCounter);
      }
    } catch( EAIException anEx) {}


    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc  aNewRelatedTypeNodeConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc             aNewNodeConfig = null;

    try {
      EAIFlatTrxBlockId aBlockId = aCtxt.getFlatTrxMgr().newBlockId();
      if( aBlockId == null) { return;}

      boolean anIsDone = false;
      try {
        try {

          try { aNewRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "RelatedTypeNodeConfig", "traversal", aNewRelatedTypeNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewRelatedTypeNodeConfig == null) { return;}

          try { aNewNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "NodeConfig", "traversal", aNewNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewNodeConfig == null) { return;}

          try {
            aNewRelatedTypeNodeConfig.setMetaType( aCtxt, aM3Type);
            aNewNodeConfig.setMetaType( aCtxt, aM3Type);
            aNewRelatedTypeNodeConfig.setNodeConfig( aCtxt, aNewNodeConfig);
            aBranchConfig.addTypeNodeConfigs( aCtxt, aNewRelatedTypeNodeConfig);
            aTraversalConfig.addNodeConfigs( aCtxt, aNewNodeConfig);
            anIsDone = true;
          } catch( EAIException anEx) {}
        }
        finally {
          if( !anIsDone) {
            aCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
          }
          else {
            aCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
          }
        }
      }
      catch( EAIFlatTransactionCancelException anException) {
        aCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
      }
    } catch( EAIException anEx) {}
    if( aNewRelatedTypeNodeConfig != null) {
      EAIBranchMgr.treeActionsForTargetNewChildObjectStatic( vTargetNode, aNewRelatedTypeNodeConfig);
    }
  }


}


