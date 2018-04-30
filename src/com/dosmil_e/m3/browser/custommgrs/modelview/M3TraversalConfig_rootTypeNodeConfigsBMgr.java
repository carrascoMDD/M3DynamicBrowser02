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


public class M3TraversalConfig_rootTypeNodeConfigsBMgr extends EAIBranchMgr {


  public M3TraversalConfig_rootTypeNodeConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getRootTypeNodeConfigs( theNode);
    }




    protected com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] getRootTypeNodeConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
      try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aTraversalConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = null;
      try { someRootTypeNodeConfigs = aTraversalConfig.getRootTypeNodeConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someRootTypeNodeConfigs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "RootTypeNodeConfigs"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "";
    }



   static protected class M3TraversalConfig_rootTypeNodeConfigsActionsMgr extends EAIActionsMgr {

      public EAIActionsSetIfc getActionsSet( EAITreeNode theNode) {
        if( theNode == null) { return null;}

        Object aNodeUserObject = theNode.getUserObject();
        if( aNodeUserObject == null) { return null;}

        EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
        if( aCtxt == null) { return null;}

        com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = null;
        try { aTraversalConfig = (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
        if( aTraversalConfig == null) { return null;}

        com.dosmil_e.m3.core.ifc.M3ModelIfc aM3Model = null;
        try { aM3Model = aTraversalConfig.getModel( aCtxt);}  catch( EAIException anEx) {}
        if( aM3Model == null) { return null;}

        com.dosmil_e.m3.core.pub.M3ModelPub aM3ModelPub = null;
        try { aM3ModelPub = (com.dosmil_e.m3.core.pub.M3ModelPub) aM3Model;} catch( ClassCastException anEx) {}
        if( aM3ModelPub == null) { return null;}

        EAIActionIfc[] someActions = null;

        com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = null;
        try { someTypes = aM3ModelPub.getAllTypes( aCtxt);} catch( EAIException anEx) {}
        
        if( someTypes != null) {
          int aNumTypes = someTypes.length;
          someActions = new EAIActionIfc[ aNumTypes];
          for( int anIndex = 0; anIndex < aNumTypes; anIndex++) {
            com.dosmil_e.m3.core.ifc.M3TypeIfc aType = someTypes[ anIndex];
            if( aType != null) {
              EAIActionIfc anAction = new EAIAction_TraversalConfig_addNew_rootTypeNodeConfigs_nodeConfig_ForType(
                theNode, aType);
              someActions[ anIndex] = anAction;
            }
          }
        }

        if( someActions == null) {
          someActions = new EAIActionIfc[0];
        }

        EAIActionsSetIfc anActionSet = new EAIActionsSet( someActions);

        anActionSet.setMenuInliningMode( EAIActionsSetIfc.sMenuInliningModeSubMenu);
        anActionSet.setSubMenuLabel( "Add Root Type");

        observePropertiesForActions( theNode);
        return anActionSet;
      }



    }













  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {  new M3TraversalConfig_rootTypeNodeConfigsActionsMgr()};
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {  new EAI_rootTypeNodeConfigs_inTraversalConfigActionsMgr()};
  }



    static protected class EAI_rootTypeNodeConfigs_inTraversalConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] { new EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete( theNode)};
      }

    }



      static protected class EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		      EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete anAction = new EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete( vTargetNode);
		      anAction.setIcon( getIcon());
		      anAction.setName( getName());
		      return anAction;
		    }

        public EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("X RootTypeNodeConfig");
        }

        protected void initNameInMenu() {
          vNameInMenu = new String("X RootTypeNodeConfig");

        }

        protected void initNameForToolBar() {
          vNameForToolBar = new String("X RootTypeNodeConfig");

        }

        protected void initNameInNestedMenu() {
          vNameInNestedMenu = new String("X RootTypeNodeConfig");

        }



          // Implementation of the ActionListener interface in Action

        public void actionPerformed( ActionEvent theEvent) {
          if( vTargetNode == null) { return;}

          Object aNodeUserObject = vTargetNode.getUserObject();
          if( aNodeUserObject == null) { return;}

          EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
          if( aCtxt == null) { return;}

          com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
          try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
          if( aRootTypeNodeConfig == null) { return;}

          EAIMMNameIfc aName = null;
          try { aName = aRootTypeNodeConfig.getName( aCtxt); } catch( EAIException anEx) {}
          if( aName == null) { return;}

          String aString = aName.getString();

          EAIBrowserFrame aBrowserFrame = null;
          Window aWindow = vTargetNode.getWindow();
          if( aWindow != null) {
            try { aBrowserFrame = (EAIBrowserFrame) aWindow;} catch( ClassCastException anEx) {}
          }

          int aConfirmResult = JOptionPane.showConfirmDialog(
            aBrowserFrame,
            nlsStatic("EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the RootTypeNodeConfig " + aName +  " ?"),
            nlsStatic("EAIAction_rootTypeNodeConfigs_inTraversalConfig_delete.actionPerformed.Delete_Confirmation.title",
              "Delete RootTypeNodeConfig confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aRootTypeNodeConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }
      }



}



