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



public class M3TraversalConfig_configOverrides_addChosen_RelatedTypeNodeConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3TraversalConfig_configOverrides_addChosen_RelatedTypeNodeConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelConfigOverrides,
      com.dosmil_e.m3.traversal.customconfigs.M3RelatedTypeNodeConfigChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3TraversalConfig_configOverrides_addChosen_RelatedTypeNodeConfig anAction =
      new M3TraversalConfig_configOverrides_addChosen_RelatedTypeNodeConfig(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseRelatedTypeNodeConfig.gif");
  }






}







