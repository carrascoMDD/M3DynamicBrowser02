package com.dosmil_e.m3.core.custommgrs;

// AddChosen

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class M3Relationship_inverseOFreplicatedMetaRelationship_addChosen_ReplicateBranchMgr extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3Relationship_inverseOFreplicatedMetaRelationship_addChosen_ReplicateBranchMgr(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.core.meta.M3RelationshipMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3RelationshipMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.core.meta.M3RelationshipMeta.vm3RelInverseOFreplicatedMetaRelationship,
      com.dosmil_e.m3.replication.customconfigs.M3ReplicateBranchMgrChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3Relationship_inverseOFreplicatedMetaRelationship_addChosen_ReplicateBranchMgr anAction =
      new M3Relationship_inverseOFreplicatedMetaRelationship_addChosen_ReplicateBranchMgr(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseReplicateBranchMgr.gif");
  }






}







