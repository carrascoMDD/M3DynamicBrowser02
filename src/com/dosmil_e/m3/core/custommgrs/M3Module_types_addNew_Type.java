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



public class M3Module_types_addNew_Type extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public M3Module_types_addNew_Type(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.core.meta.M3ModuleMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3TypeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.core.meta.M3ModuleMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.core.meta.M3ModuleMeta.vm3RelTypes
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3Module_types_addNew_Type anAction =
      new M3Module_types_addNew_Type( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createType.gif");
  }






}







