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



public class M3ReplicateNodeMgr_replicatedMetaType_setChosen_Type extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public M3ReplicateNodeMgr_replicatedMetaType_setChosen_Type(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3TypeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.vm3RelReplicatedMetaType,
      com.dosmil_e.m3.core.customconfigs.M3TypeChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3ReplicateNodeMgr_replicatedMetaType_setChosen_Type anAction =
      new M3ReplicateNodeMgr_replicatedMetaType_setChosen_Type(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseType.gif");
  }






}




