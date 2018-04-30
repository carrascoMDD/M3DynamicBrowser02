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



public class M3BranchMgr_inverseOFmetaBranchMgr_addChosen_BranchConfig extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public M3BranchMgr_inverseOFmetaBranchMgr_addChosen_BranchConfig(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3BranchConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.vm3RelInverseOFmetaBranchMgr,
      com.dosmil_e.m3.traversal.customconfigs.M3BranchConfigChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3BranchMgr_inverseOFmetaBranchMgr_addChosen_BranchConfig anAction =
      new M3BranchMgr_inverseOFmetaBranchMgr_addChosen_BranchConfig(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseBranchConfig.gif");
  }






}







