package com.dosmil_e.m3.traversal.custommgrs;

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



public class M3NodeConfig_inverseOFnodeConfig_addChosen_RootTypeNodeConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3NodeConfig_inverseOFnodeConfig_addChosen_RootTypeNodeConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3RootTypeNodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3NodeConfigMeta.vm3RelInverseOFnodeConfig,
      com.dosmil_e.m3.traversal.customconfigs.M3RootTypeNodeConfigChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3NodeConfig_inverseOFnodeConfig_addChosen_RootTypeNodeConfig anAction =
      new M3NodeConfig_inverseOFnodeConfig_addChosen_RootTypeNodeConfig(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseRootTypeNodeConfig.gif");
  }






}







