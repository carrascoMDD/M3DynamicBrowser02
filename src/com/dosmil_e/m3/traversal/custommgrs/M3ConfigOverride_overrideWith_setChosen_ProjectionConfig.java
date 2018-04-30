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



public class M3ConfigOverride_overrideWith_setChosen_ProjectionConfig extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public M3ConfigOverride_overrideWith_setChosen_ProjectionConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.projection.meta.M3ProjectionConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3ConfigOverrideMeta.vm3RelOverrideWith,
      com.dosmil_e.m3.projection.customconfigs.M3ProjectionConfigChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3ConfigOverride_overrideWith_setChosen_ProjectionConfig anAction =
      new M3ConfigOverride_overrideWith_setChosen_ProjectionConfig(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseProjectionConfig.gif");
  }






}




