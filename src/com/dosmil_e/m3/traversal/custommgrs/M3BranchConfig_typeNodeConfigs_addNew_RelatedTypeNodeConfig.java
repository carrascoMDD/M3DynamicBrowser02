package com.dosmil_e.m3.traversal.custommgrs;

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



public class M3BranchConfig_typeNodeConfigs_addNew_RelatedTypeNodeConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public M3BranchConfig_typeNodeConfigs_addNew_RelatedTypeNodeConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.vm3RelTypeNodeConfigs
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3BranchConfig_typeNodeConfigs_addNew_RelatedTypeNodeConfig anAction =
      new M3BranchConfig_typeNodeConfigs_addNew_RelatedTypeNodeConfig( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createRelatedTypeNodeConfig.gif");
  }






}







