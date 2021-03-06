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



public class M3CopyFieldMgr_copiedMetaAttribute_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public M3CopyFieldMgr_copiedMetaAttribute_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.vm3RelCopiedMetaAttribute
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3CopyFieldMgr_copiedMetaAttribute_remove anAction =
      new M3CopyFieldMgr_copiedMetaAttribute_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}







