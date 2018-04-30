package com.dosmil_e.m3.core.custommgrs;

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



public class M3Attribute_inverseOFcopiedMetaAttribute_addChosen_CopyFieldMgr extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3Attribute_inverseOFcopiedMetaAttribute_addChosen_CopyFieldMgr(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.core.meta.M3AttributeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3CopyFieldMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3AttributeMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.core.meta.M3AttributeMeta.vm3RelInverseOFcopiedMetaAttribute,
      com.dosmil_e.m3.traversal.customconfigs.M3CopyFieldMgrChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3Attribute_inverseOFcopiedMetaAttribute_addChosen_CopyFieldMgr anAction =
      new M3Attribute_inverseOFcopiedMetaAttribute_addChosen_CopyFieldMgr(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseCopyFieldMgr.gif");
  }






}







