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


public class EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType extends EAIRebindableAction {

  protected com.dosmil_e.m3.core.ifc.M3TypeIfc                  vM3TypeForNewRoot;

  public EAIActionIfc cloneBase() throws CloneNotSupportedException {

    EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType anAction =
      new EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType( vTargetNode, vM3TypeForNewRoot);
    anAction.setIcon( getIcon());
	  anAction.setName( getName());
		return anAction;
  }

  boolean vPackDialogs = false;

  public EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType(
    EAITreeNode                         theNode,
    com.dosmil_e.m3.core.ifc.M3TypeIfc  theM3TypeForNewRoot) {

    super( theNode);
    vM3TypeForNewRoot  = theM3TypeForNewRoot;
  }


  public  com.dosmil_e.m3.core.ifc.M3TypeIfc getM3TypeForNewRoot() {
    return vM3TypeForNewRoot;
  }

  protected void initIcon() {
    vIcon = new ImageIcon("images/addroottype.gif");
  }


  protected void initName() {
    vName = new String("Add Root Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRoot();
    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vName = "Add " + aM3TypeNameString + " Root";
        }
      }
    }
  }


  protected void initNameInNestedMenu() {
    vNameInNestedMenu = new String("Root Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRoot();
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
    vNameForToolBar = new String("Add Root Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRoot();
    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3TypeName = aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vNameForToolBar = "Add " + aM3TypeNameString + " Root";
        }
      }
    }
  }

  protected void initNameInMenu() {
    vNameInMenu = new String("Add Root Type");

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRoot();

    if( aM3Type != null) {

      EAIMMNameIfc aM3TypeName = null;
      try { aM3Type.getName();} catch( EAIException anEx) {}
      if( aM3TypeName != null) {
        String aM3TypeNameString = aM3TypeName.getString();
        if( aM3TypeNameString != null) {
          vNameInMenu = "Add " + aM3TypeNameString + " Root";
        }
      }
    }
  }



    // Implementation of the ActionListener process in Action
  public void actionPerformed( ActionEvent theEvent) {
    if( vTargetNode == null) { return;}

    EAIBranchMgr.treeActionsBeforeActionStatic( vTargetNode);

    com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = getM3TypeForNewRoot();
    if( aM3Type == null) { return;}

    EAIMMNameIfc aM3TypeName = null;
    try { aM3TypeName = aM3Type.getName();} catch( EAIException anEx) {}
    if( aM3TypeName == null) { return;}
    String aM3TypeNameString = aM3TypeName.getString();
    if( aM3TypeNameString == null) { return;}

    EAIMMNameIfc aNewRootTypeNodeConfigName  = new EAIMMName( aM3TypeNameString + "RTNC");
    EAIMMNameIfc aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NC");

    Object aNodeUserObject = vTargetNode.getUserObject();
    if( aNodeUserObject == null) { return;}

    EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
    if( aCtxt == null) { return;}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
    try {
      try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
      if( aTraversalConfig == null) { return;}

      if( aTraversalConfig.hasRootTypeNodeConfigsNamed( aCtxt, aNewRootTypeNodeConfigName)) { return;}

      int aCounter  = 0;
      while( aTraversalConfig.hasNodeConfigsNamed( aCtxt, aNewNodeConfigName)) {
        aCounter++;
        aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NC" + aCounter);
      }
    } catch( EAIException anEx) {}

    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aNewRootTypeNodeConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc         aNewNodeConfig = null;

    try {
      EAIFlatTrxBlockId aBlockId = aCtxt.getFlatTrxMgr().newBlockId();
      if( aBlockId == null) { return;}

      boolean anIsDone = false;
      try {
        try {
          try { aNewRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "RootTypeNodeConfig", "traversal", aNewRootTypeNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewRootTypeNodeConfig == null) { return;}

          try { aNewNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "NodeConfig", "traversal", aNewNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewNodeConfig == null) { return;}

          try {
            aNewRootTypeNodeConfig.setMetaType( aCtxt, aM3Type);
            aNewNodeConfig.setMetaType( aCtxt, aM3Type);
            aNewRootTypeNodeConfig.setNodeConfig( aCtxt, aNewNodeConfig);
            aTraversalConfig.addRootTypeNodeConfigs( aCtxt, aNewRootTypeNodeConfig);
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
    if( aNewRootTypeNodeConfig != null) {
      EAIBranchMgr.treeActionsForTargetNewChildObjectStatic( vTargetNode, aNewRootTypeNodeConfig);
    }
  }


}


