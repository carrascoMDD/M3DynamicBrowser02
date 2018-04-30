package com.dosmil_e.m3.traversal.custommgrs;

// OnoToOneAggregationBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;


import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.metamgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeNode;

import java.util.Vector;


public class M3RelatedTypeNodeConfig_filterBMgr extends EAIBranchMgr {


  public M3RelatedTypeNodeConfig_filterBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getFilter( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.m3.traversal.ifc.M3FilterIfc getFilter( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = null;
      try { aRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelatedTypeNodeConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3FilterIfc aFilter = null;
      try { aFilter = aRelatedTypeNodeConfig.getFilter( aCtxt);} catch( EAIException anEx) {}

	    return aFilter;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Filter"}, gChildrenAspect, this);
    }

    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "filter: ";
    }




  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					M3RelatedTypeNodeConfig_filter_setNew_Filter.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "filter + (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          com.dosmil_e.m3.traversal.custommgrs.M3Filter_delete.class
        }
      )
    };
  }



      
    protected boolean createDummyWhenNullElements() {
      return true;
    }



}


