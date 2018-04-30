package com.dosmil_e.m3.browser.custommgrs.modelview;

// OneToManyManyAggregationBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
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


public class M3BranchConfig_typeNodeConfigsBMgr extends EAIBranchMgr {


  public M3BranchConfig_typeNodeConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getTypeNodeConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] getTypeNodeConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
      try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBranchConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] someTypeNodeConfigs = null;
      try { someTypeNodeConfigs = aBranchConfig.getTypeNodeConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someTypeNodeConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "TypeNodeConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "";
    }



   static protected class M3BranchConfig_typeNodeConfigsActionsMgr extends EAIActionsMgr {

      public EAIActionsSetIfc getActionsSet( EAITreeNode theNode) {
        if( theNode == null) { return null;}

        Object aNodeUserObject = theNode.getUserObject();
        if( aNodeUserObject == null) { return null;}

        EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
        if( aCtxt == null) { return null;}

        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
        try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
        if( aBranchConfig == null) { return null;}

        com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = null;
        try { aM3Relationship = aBranchConfig.getMetaRelationship( aCtxt);} catch( EAIException anEx) {}
        if( aM3Relationship == null) { return null;}

        com.dosmil_e.m3.core.pub.M3RelationshipPub aM3RelationshipPub = null;
        try { aM3RelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aM3Relationship;} catch( ClassCastException anEx) {}
        if( aM3RelationshipPub == null) { return null;}

        EAIActionIfc[] someActions = null;

        com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = null;
        try { someTypes = aM3RelationshipPub.getAllRelatedTypes( aCtxt);} catch( EAIException anEx) {}

        if( someTypes != null) {
          int aNumTypes = someTypes.length;
          someActions = new EAIActionIfc[ aNumTypes];
          for( int anIndex = 0; anIndex < aNumTypes; anIndex++) {
            com.dosmil_e.m3.core.ifc.M3TypeIfc aType = someTypes[ anIndex];
            if( aType != null) {
              EAIActionIfc anAction = new EAIAction_BranchConfig_addNew_typeNodeConfigs_nodeConfig_ForType(
                theNode, aType);
              someActions[ anIndex] = anAction;
            }
          }
        }

        if( someActions == null) {
          someActions = new EAIActionIfc[1];
        }

        EAIActionsSetIfc anActionSet = new EAIActionsSet( someActions);

        anActionSet.setMenuInliningMode( EAIActionsSetIfc.sMenuInliningModeSubMenu);
        anActionSet.setSubMenuLabel( "Add Related Type");

        observePropertiesForActions( theNode);
        return anActionSet;
      }




    }












  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {  new M3BranchConfig_typeNodeConfigsActionsMgr()};
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {  new EAI_typeNodeConfigs_inBranchConfigActionsMgr()};
  }



    static protected class EAI_typeNodeConfigs_inBranchConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] { new EAIAction_typeNodeConfigs_inBranchConfig_delete( theNode)};
      }

    }



      static protected class EAIAction_typeNodeConfigs_inBranchConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		      EAIAction_typeNodeConfigs_inBranchConfig_delete anAction = new EAIAction_typeNodeConfigs_inBranchConfig_delete( vTargetNode);
		      anAction.setIcon( getIcon());
		      anAction.setName( getName());
		      return anAction;
		    }

        public EAIAction_typeNodeConfigs_inBranchConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("X RelatedTypeNodeConfig");
        }

        protected void initNameInMenu() {
          vNameInMenu = new String("X RelatedTypeNodeConfig");

        }

        protected void initNameForToolBar() {
          vNameForToolBar = new String("X RelatedTypeNodeConfig");

        }

        protected void initNameInNestedMenu() {
          vNameInNestedMenu = new String("X RelatedTypeNodeConfig");

        }



          // Implementation of the ActionListener interface in Action

        public void actionPerformed( ActionEvent theEvent) {
          if( vTargetNode == null) { return;}

          Object aNodeUserObject = vTargetNode.getUserObject();
          if( aNodeUserObject == null) { return;}

          EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
          if( aCtxt == null) { return;}

          com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = null;
          try { aRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
          if( aRelatedTypeNodeConfig == null) { return;}

          EAIMMNameIfc aName = null;
          try { aName = aRelatedTypeNodeConfig.getName( aCtxt); } catch( EAIException anEx) {}
          if( aName == null) { return;}

          String aString = aName.getString();

          EAIBrowserFrame aBrowserFrame = null;
          Window aWindow = vTargetNode.getWindow();
          if( aWindow != null) {
            try { aBrowserFrame = (EAIBrowserFrame) aWindow;} catch( ClassCastException anEx) {}
          }

          int aConfirmResult = JOptionPane.showConfirmDialog(
            aBrowserFrame,
            nlsStatic("EAIAction_typeNodeConfigs_inBranchConfig_delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the RelatedTypeNodeConfig " + aName +  " ?"),
            nlsStatic("EAIAction_typeNodeConfigs_inBranchConfig_delete.actionPerformed.Delete_Confirmation.title",
              "Delete RelatedTypeNodeConfig confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aRelatedTypeNodeConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }
      }



}




