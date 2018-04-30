package com.dosmil_e.m3.traversal.custommgrs;

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



public class M3NodeConfig_metaNodeMgr_setChosen_ReplicateNodeMgr extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public M3NodeConfig_metaNodeMgr_setChosen_ReplicateNodeMgr(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.replication.meta.M3ReplicateNodeMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelMetaNodeMgr,
      com.dosmil_e.m3.replication.customconfigs.M3ReplicateNodeMgrChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3NodeConfig_metaNodeMgr_setChosen_ReplicateNodeMgr anAction =
      new M3NodeConfig_metaNodeMgr_setChosen_ReplicateNodeMgr(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseReplicateNodeMgr.gif");
  }






}




