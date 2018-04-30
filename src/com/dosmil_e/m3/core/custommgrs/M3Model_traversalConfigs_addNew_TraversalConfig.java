package com.dosmil_e.m3.core.custommgrs;

// AddNew

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class M3Model_traversalConfigs_addNew_TraversalConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public M3Model_traversalConfigs_addNew_TraversalConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.core.meta.M3ModelMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3ModelMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.core.meta.M3ModelMeta.vm3RelTraversalConfigs
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3Model_traversalConfigs_addNew_TraversalConfig anAction =
      new M3Model_traversalConfigs_addNew_TraversalConfig( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createTraversalConfig.gif");
  }






}







