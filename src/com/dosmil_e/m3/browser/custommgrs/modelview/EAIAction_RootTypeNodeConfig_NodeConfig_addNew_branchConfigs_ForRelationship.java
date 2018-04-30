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


public class EAIAction_RootTypeNodeConfig_NodeConfig_addNew_branchConfigs_ForRelationship extends EAIRebindableAction {

  protected com.dosmil_e.m3.core.ifc.M3RelationshipIfc       vM3RelationshipForNewBranch;

  public EAIActionIfc cloneBase() throws CloneNotSupportedException {

    EAIAction_RootTypeNodeConfig_NodeConfig_addNew_branchConfigs_ForRelationship anAction =
      new EAIAction_RootTypeNodeConfig_NodeConfig_addNew_branchConfigs_ForRelationship( vTargetNode, vM3RelationshipForNewBranch);
    anAction.setIcon( getIcon());
	  anAction.setName( getName());
		return anAction;
  }

  boolean vPackDialogs = false;

  public EAIAction_RootTypeNodeConfig_NodeConfig_addNew_branchConfigs_ForRelationship(
    EAITreeNode                         theNode,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc  theM3RelationshipForNewBranchConfig) {

    super( theNode);
    vM3RelationshipForNewBranch  = theM3RelationshipForNewBranchConfig;
  }


  public  com.dosmil_e.m3.core.ifc.M3RelationshipIfc getM3RelationshipForNewBranch() {
    return vM3RelationshipForNewBranch;
  }

  protected void initIcon() {
    vIcon = new ImageIcon("images/addrelationship.gif");
  }


  protected void initName() {
    vName = new String("Add Relationship");

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = getM3RelationshipForNewBranch();
    if( aM3Relationship != null) {

      EAIMMNameIfc aM3RelationshipName = null;
      try { aM3Relationship.getName();} catch( EAIException anEx) {}
      if( aM3RelationshipName != null) {
        String aM3RelationshipNameString = aM3RelationshipName.getString();
        if( aM3RelationshipNameString != null) {
          vName = "Add " + aM3RelationshipNameString + " Related";
        }
      }
    }
  }


  protected void initNameInNestedMenu() {
    vNameInNestedMenu = new String("Relationship");

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = getM3RelationshipForNewBranch();
    if( aM3Relationship != null) {

      EAIMMNameIfc aM3RelationshipName = null;
      try { aM3RelationshipName = aM3Relationship.getName();} catch( EAIException anEx) {}
      if( aM3RelationshipName != null) {
        String aM3RelationshipNameString = aM3RelationshipName.getString();
        if( aM3RelationshipNameString != null) {
          vNameInNestedMenu = aM3RelationshipNameString;
        }
      }
    }
  }

  protected void initNameForToolBar() {
    vNameForToolBar = new String("Add Relationship");

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = getM3RelationshipForNewBranch();
    if( aM3Relationship != null) {

      EAIMMNameIfc aM3RelationshipName = null;
      try { aM3RelationshipName = aM3Relationship.getName();} catch( EAIException anEx) {}
      if( aM3RelationshipName != null) {
        String aM3RelationshipNameString = aM3RelationshipName.getString();
        if( aM3RelationshipNameString != null) {
          vNameForToolBar = "Add " + aM3RelationshipNameString + " Related";
        }
      }
    }
  }

  protected void initNameInMenu() {
    vNameInMenu = new String("Add Relationship");

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = getM3RelationshipForNewBranch();

    if( aM3Relationship != null) {

      EAIMMNameIfc aM3RelationshipName = null;
      try { aM3Relationship.getName();} catch( EAIException anEx) {}
      if( aM3RelationshipName != null) {
        String aM3RelationshipNameString = aM3RelationshipName.getString();
        if( aM3RelationshipNameString != null) {
          vNameInMenu = "Add " + aM3RelationshipNameString + " Related";
        }
      }
    }
  }



    // Implementation of the ActionListener process in Action
  public void actionPerformed( ActionEvent theEvent) {
    if( vTargetNode == null) { return;}

    EAIBranchMgr.treeActionsBeforeActionStatic( vTargetNode);

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = getM3RelationshipForNewBranch();
    if( aM3Relationship == null) { return;}

    EAIMMNameIfc aM3RelationshipName = null;
    try { aM3RelationshipName = aM3Relationship.getName();} catch( EAIException anEx) {}
    if( aM3RelationshipName == null) { return;}
    String aM3RelationshipNameString = aM3RelationshipName.getString();
    if( aM3RelationshipNameString == null) { return;}

    EAIMMNameIfc aNewBranchConfigName  = new EAIMMName( aM3RelationshipNameString + "BC");

    Object aNodeUserObject = vTargetNode.getUserObject();
    if( aNodeUserObject == null) { return;}

    EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
    if( aCtxt == null) { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub aM3RelationshipPub = null;
    try { aM3RelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aM3Relationship;} catch( ClassCastException anEx) {}
    if( aM3RelationshipPub == null) { return;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = null;
    try { someTypes = aM3RelationshipPub.getAllRelatedTypes( aCtxt);} catch( EAIException anEx) {}


    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc  aRootTypeNodeConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc             aNodeConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc        aTraversalConfig = null;

    try {
      try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
      if( aRootTypeNodeConfig == null) { return;}

      aNodeConfig = aRootTypeNodeConfig.getNodeConfig( aCtxt);
      if( aNodeConfig == null) { return;}

      aTraversalConfig = aNodeConfig.getTraversalConfig( aCtxt);
      if( aTraversalConfig == null) { return;}

      if( aNodeConfig.hasBranchConfigsNamed( aCtxt, aNewBranchConfigName)) { return;}

      int aCounter  = 0;
      while( aTraversalConfig.hasBranchConfigsNamed( aCtxt, aNewBranchConfigName)) {
        aCounter++;
        aNewBranchConfigName  = new EAIMMName( aM3RelationshipNameString + "BC" + aCounter);
      }
    } catch( EAIException anEx) {}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc           aNewBranchConfig = null;
    Object aNewTreeSelection = null;

    try {
      EAIFlatTrxBlockId aBlockId = aCtxt.getFlatTrxMgr().newBlockId();
      if( aBlockId == null) { return;}

      boolean anIsDone = false;
      try {
        try {

          try { aNewBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "BranchConfig", "traversal", aNewBranchConfigName);} catch( ClassCastException anEx) {}
          if( aNewBranchConfig == null) { return;}
          aNewTreeSelection = aNewBranchConfig;

          try {
            aNewBranchConfig.setMetaRelationship( aCtxt, aM3Relationship);
            aTraversalConfig.addBranchConfigs( aCtxt, aNewBranchConfig);
            aNodeConfig.addBranchConfigs( aCtxt, aNewBranchConfig);
            if( someTypes != null) {
              int aNumTypes = someTypes.length;

              if( aNumTypes == 1) {

                com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = someTypes[ 0];

                if( aM3Type != null) {

                  aNewTreeSelection = createRelatedTypeNodeConfig( aCtxt, aTraversalConfig, aNewBranchConfig, aM3Type);

                }

              }

            }

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
    if( aNewBranchConfig != null) {
      vTargetNode.getChildCount();
      EAITreeNode aBranchConfigTreeNode = vTargetNode.getChildTreeNodeFor( aNewBranchConfig);
      if( aBranchConfigTreeNode != null) {
        if( aNewTreeSelection == aNewBranchConfig) {
          EAIBranchMgr.treeActionsForTargetNewChildObjectStatic( vTargetNode, aNewBranchConfig);
        }
        else {
          aBranchConfigTreeNode.getChildCount();
          EAITreeNode aRelatedTypeNodeConfigTreeNode = aBranchConfigTreeNode.getChildTreeNodeFor( aNewTreeSelection);
          EAIBranchMgr.treeActionsForTargetNewChildObjectStatic( aBranchConfigTreeNode, aNewTreeSelection);
        }
      }
    }
  }





  public Object createRelatedTypeNodeConfig(
    EAIMMCtxtIfc                                          theCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    theTraversalConfig,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       theNewBranchConfig,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                    theM3Type) {

    if( theCtxt == null)            { return null;}
    if( theTraversalConfig == null) { return null;}
    if( theNewBranchConfig == null) { return null;}
    if( theM3Type == null)          { return null;}

    EAIMMNameIfc aM3TypeName = null;
    try { aM3TypeName = theM3Type.getName();} catch( EAIException anEx) {}
    if( aM3TypeName == null)        { return null;}
    String aM3TypeNameString = aM3TypeName.getString();
    if( aM3TypeNameString == null)  { return null;}

    EAIMMNameIfc aNewRelatedTypeNodeConfigName  = new EAIMMName( aM3TypeNameString + "RelTNCx");
    EAIMMNameIfc aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NCx");

    EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
    if( aCtxt == null)              { return null;}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       aBranchConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    aTraversalConfig = null;
    try {
      if( theNewBranchConfig.hasTypeNodeConfigsNamed( aCtxt, aNewRelatedTypeNodeConfigName)) { return null;}

      int aCounter  = 0;
      while( theTraversalConfig.hasNodeConfigsNamed( aCtxt, aNewNodeConfigName)) {
        aCounter++;
        aNewNodeConfigName  = new EAIMMName( aM3TypeNameString + "NC" + aCounter);
      }
    } catch( EAIException anEx) {}


    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc  aNewRelatedTypeNodeConfig = null;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc             aNewNodeConfig = null;

    try {
      EAIFlatTrxBlockId aBlockId = aCtxt.getFlatTrxMgr().newBlockId();
      if( aBlockId == null) { return null;}

      boolean anIsDone = false;
      try {
        try {

          try { aNewRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "RelatedTypeNodeConfig", "traversal", aNewRelatedTypeNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewRelatedTypeNodeConfig == null) { return null;}

          try { aNewNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "NodeConfig", "traversal", aNewNodeConfigName);} catch( ClassCastException anEx) {}
          if( aNewNodeConfig == null) { return null;}

          try {
            aNewRelatedTypeNodeConfig.setMetaType( aCtxt, theM3Type);
            aNewNodeConfig.setMetaType( aCtxt, theM3Type);
            aNewRelatedTypeNodeConfig.setNodeConfig( aCtxt, aNewNodeConfig);
            theNewBranchConfig.addTypeNodeConfigs( aCtxt, aNewRelatedTypeNodeConfig);
            theTraversalConfig.addNodeConfigs( aCtxt, aNewNodeConfig);
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
//    if( aNewRelatedTypeNodeConfig != null) {
//      EAIBranchMgr.treeActionsForTargetNewChildObjectStatic( vTargetNode, aNewRelatedTypeNodeConfig);
//    }

    return aNewRelatedTypeNodeConfig;
  }




}


