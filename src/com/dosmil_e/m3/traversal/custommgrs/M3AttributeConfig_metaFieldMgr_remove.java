package com.dosmil_e.m3.traversal.custommgrs;

// Remove

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class M3AttributeConfig_metaFieldMgr_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public M3AttributeConfig_metaFieldMgr_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.vm3RelMetaFieldMgr
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3AttributeConfig_metaFieldMgr_remove anAction =
      new M3AttributeConfig_metaFieldMgr_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}







