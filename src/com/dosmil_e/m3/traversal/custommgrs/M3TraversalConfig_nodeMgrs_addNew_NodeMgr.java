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



public class M3TraversalConfig_nodeMgrs_addNew_NodeMgr extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public M3TraversalConfig_nodeMgrs_addNew_NodeMgr(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.vm3RelNodeMgrs
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    M3TraversalConfig_nodeMgrs_addNew_NodeMgr anAction =
      new M3TraversalConfig_nodeMgrs_addNew_NodeMgr( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createNodeMgr.gif");
  }






}







