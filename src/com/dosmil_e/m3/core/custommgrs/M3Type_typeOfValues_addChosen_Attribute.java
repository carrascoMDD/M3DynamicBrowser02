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



public class M3Type_typeOfValues_addChosen_Attribute extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3Type_typeOfValues_addChosen_Attribute(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.core.meta.M3TypeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3AttributeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3TypeMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.core.meta.M3TypeMeta.vm3RelTypeOfValues,
      com.dosmil_e.m3.core.customconfigs.M3AttributeChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3Type_typeOfValues_addChosen_Attribute anAction =
      new M3Type_typeOfValues_addChosen_Attribute(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseAttribute.gif");
  }






}







