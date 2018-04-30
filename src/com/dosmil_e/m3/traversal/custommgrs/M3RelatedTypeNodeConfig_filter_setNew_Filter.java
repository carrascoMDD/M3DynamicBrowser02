package com.dosmil_e.m3.traversal.custommgrs;

// SetNew

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class M3RelatedTypeNodeConfig_filter_setNew_Filter extends
  com.dosmil_e.browserbase.metamgrs.EAISetNewAction {


  public M3RelatedTypeNodeConfig_filter_setNew_Filter(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3FilterMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3RelatedTypeNodeConfigMeta.vm3RelFilter
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3RelatedTypeNodeConfig_filter_setNew_Filter anAction =
      new M3RelatedTypeNodeConfig_filter_setNew_Filter(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }



  protected void initIcon() {
    vIcon = new ImageIcon("images/createFilter.gif");
  }






}







