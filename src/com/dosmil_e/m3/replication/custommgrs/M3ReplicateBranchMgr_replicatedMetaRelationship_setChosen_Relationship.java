package com.dosmil_e.m3.replication.custommgrs;

// SetChosen

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class M3ReplicateBranchMgr_replicatedMetaRelationship_setChosen_Relationship extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public M3ReplicateBranchMgr_replicatedMetaRelationship_setChosen_Relationship(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3RelationshipMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.replication.meta.M3ReplicateBranchMgrMeta.vm3RelReplicatedMetaRelationship,
      com.dosmil_e.m3.core.customconfigs.M3RelationshipChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3ReplicateBranchMgr_replicatedMetaRelationship_setChosen_Relationship anAction =
      new M3ReplicateBranchMgr_replicatedMetaRelationship_setChosen_Relationship(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseRelationship.gif");
  }






}




