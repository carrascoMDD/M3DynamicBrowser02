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



public class M3FieldMgr_inverseOFmetaFieldMgr_addChosen_AttributeConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3FieldMgr_inverseOFmetaFieldMgr_addChosen_AttributeConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.vm3RelInverseOFmetaFieldMgr,
      com.dosmil_e.m3.traversal.customconfigs.M3AttributeConfigChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3FieldMgr_inverseOFmetaFieldMgr_addChosen_AttributeConfig anAction =
      new M3FieldMgr_inverseOFmetaFieldMgr_addChosen_AttributeConfig(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseAttributeConfig.gif");
  }






}







