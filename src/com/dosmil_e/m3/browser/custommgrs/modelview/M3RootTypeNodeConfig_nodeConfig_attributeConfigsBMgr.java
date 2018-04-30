package com.dosmil_e.m3.browser.custommgrs.modelview;

// ManyToManyBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.configs.*;

import java.awt.event.ActionEvent;



import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeNode;

import java.util.Vector;


public class M3RootTypeNodeConfig_nodeConfig_attributeConfigsBMgr extends EAIBranchMgr {


  public M3RootTypeNodeConfig_nodeConfig_attributeConfigsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getNodeConfigAttributeConfigs( theNode);
    }


    protected EAIMMElementIfc[] getNodeConfigAttributeConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
      try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRootTypeNodeConfig == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfig = null;
      try { aNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aRootTypeNodeConfig.getNodeConfig( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aNodeConfig == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = null;
      try { someAttributeConfigs = aNodeConfig.getAttributeConfigs( aCtxt);} catch( EAIException anEx) {}

	    return someAttributeConfigs;
    }





    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}

      theNode.observePropertiesForAspect( new String[] { "NodeConfig"}, gChildrenAspect, this);
      theNode.observePropertiesForAspect( new String[] { "NodeConfig.AttributeConfigs"}, gChildrenAspect, this);
    }

   protected void observeOtherForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}


      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return;}

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
      try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRootTypeNodeConfig == null) { return;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfig = null;
      try { aNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aRootTypeNodeConfig.getNodeConfig( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aNodeConfig == null) { return;}


      theNode.observeOtherForAspect( aNodeConfig, new String[] { "AttributeConfigs"}, gChildrenAspect, this);

   }




    protected com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfig = null;
      try { aNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aNodeConfig == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = null;
      try { someBranchConfigs = aNodeConfig.getBranchConfigs( aCtxt);} catch( EAIException anEx) {}


	    return someBranchConfigs;

    }




    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "";
    }



   static protected class M3NodeConfig_branchConfigsActionsMgr extends EAIActionsMgr {

      public EAIActionsSetIfc getActionsSet( EAITreeNode theNode) {
        if( theNode == null) { return null;}

        EAIActionsSetIfc anActionSet = new EAIActionsSet(
          new EAIActionIfc[] {
			new EAIAction_NodeConfig_addChosen_branchConfigs_BranchConfig( theNode),

        });
        anActionSet.setMenuInliningMode( EAIActionsSetIfc.sMenuInliningModeInline);
        anActionSet.setSubMenuLabel( "branchConfigs ? (N)");

        observePropertiesForActions( theNode);
        return anActionSet;
      }


    }




// AddChosenAction


      static protected class EAIAction_NodeConfig_addChosen_branchConfigs_BranchConfig extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		      EAIAction_NodeConfig_addChosen_branchConfigs_BranchConfig anAction = new EAIAction_NodeConfig_addChosen_branchConfigs_BranchConfig( vTargetNode);
		      anAction.setIcon( getIcon());
		      anAction.setName( getName());
		      return anAction;
		    }

        boolean vPackDialogs = false;

        public EAIAction_NodeConfig_addChosen_branchConfigs_BranchConfig( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/chooseBranchConfig.gif");
        }


        protected void initName() {
          vName = new String("Add a choosen BranchConfig to branchConfigs of NodeConfig");
        }

        protected void initNameInNestedMenu() {
          vNameInNestedMenu = new String("BranchConfig");
        }

        protected void initNameForToolBar() {
          vNameForToolBar = new String("branchConfigs ? (N)");

        }

        protected void initNameInMenu() {
          vNameInMenu = new String("branchConfigs ? (N)");

        }


           // Implementation of the ActionListener interface in Action

        public void actionPerformed( ActionEvent theEvent) {
          if( vTargetNode == null) { return;}

          treeActionsBeforeActionStatic( vTargetNode);

          Object aNodeUserObject = vTargetNode.getUserObject();
          if( aNodeUserObject == null) { return;}

          EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
          if( aCtxt == null) { return;}


          com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfig = null;
          try { aNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
          if( aNodeConfig == null) { return;}

          EAIBrowserFrame aBrowserFrame = null;
          Window aWindow = vTargetNode.getWindow();
          if( aWindow != null) {
            try { aBrowserFrame = (EAIBrowserFrame) aWindow;} catch( ClassCastException anEx) {}
          }


          com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = null;
          try { aModel = (com.dosmil_e.m3.core.ifc.M3ModelIfc) aNodeConfig.getTreeRoot( aCtxt);} catch( ClassCastException anEx) {}
          if( aModel == null) { return;}



          treeActionsBeforeOpeningChooserStatic( vTargetNode);

          EAIChooserDialog aChooseInterfaceTypeDialog = new EAIChooserDialog(
            "Choose BranchConfig for the branchConfigs of NodeConfig",
            aCtxt,  aBrowserFrame,
            com.dosmil_e.m3.traversal.customconfigs.M3BranchConfigChooserTreeConfigFactory.getConfig( aCtxt), aModel);

            //Validate frames that have preset sizes
            //Pack frames that have useful preferred size info, e.g. from their layout
          if (vPackDialogs)  {
            aChooseInterfaceTypeDialog.pack();
          }
          else {
            aChooseInterfaceTypeDialog.validate();
          }
            //Center the window
          Dimension aScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
          Dimension aFrameSize = aChooseInterfaceTypeDialog.getSize();
          if (aFrameSize.height > aScreenSize.height)
            aFrameSize.height = aScreenSize.height;
          if (aFrameSize.width > aScreenSize.width)
            aFrameSize.width = aScreenSize.width;
          aChooseInterfaceTypeDialog.setLocation((aScreenSize.width - aFrameSize.width) / 2, (aScreenSize.height - aFrameSize.height) / 2);
          aChooseInterfaceTypeDialog.setVisible(true);


          EAIChooserSelectionHolder aChooserSelectionHolder = aChooseInterfaceTypeDialog.getSelectionHolder();
          if( aChooserSelectionHolder == null) { return;}

          boolean anAccepted = aChooseInterfaceTypeDialog.getAccepted();
          if( !anAccepted ) { return;}

          Object aSelectionObject = aChooserSelectionHolder.getSelection();
          if( aSelectionObject == null) { return;}

          EAITreeNode aTreeNode = null;
          try { aTreeNode = (EAITreeNode) aSelectionObject;} catch( ClassCastException anEx) {}
          if( aTreeNode == null) { return;}

          Object aUserObject = aTreeNode.getUserObject();
          if( aUserObject == null) { return;}

          com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aChosenBranchConfig = null;
          try { aChosenBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
          if( aChosenBranchConfig == null) { return;}


          try { aNodeConfig.addBranchConfigs( aCtxt, aChosenBranchConfig);} catch( EAIException anEx) {}
        }

      }














  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {  new M3NodeConfig_branchConfigsActionsMgr()};
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {  new EAI_branchConfigs_inNodeConfigActionsMgr()};
  }



    static protected class EAI_branchConfigs_inNodeConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] { new EAIAction_branchConfigs_inNodeConfig_remove( theNode)};
      }

    }



      static protected class EAIAction_branchConfigs_inNodeConfig_remove extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		      EAIAction_branchConfigs_inNodeConfig_remove anAction = new EAIAction_branchConfigs_inNodeConfig_remove( vTargetNode);
		      anAction.setIcon( getIcon());
		      anAction.setName( getName());
		      return anAction;
		    }

        public EAIAction_branchConfigs_inNodeConfig_remove( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/remove.gif");
        }


        protected void initName() {
          vName = new String("- BranchConfig");
        }

        protected void initNameInMenu() {
          vNameInMenu = new String("- BranchConfig");

        }

        protected void initNameForToolBar() {
          vNameForToolBar = new String("- BranchConfig");

        }

        protected void initNameInNestedMenu() {
          vNameInNestedMenu = new String("- BranchConfig");

        }



          // Implementation of the ActionListener interface in Action

        public void actionPerformed( ActionEvent theEvent) {
          if( vTargetNode == null) { return;}

          TreeNode aParentNode = vTargetNode.getParent();
          if( aParentNode == null) { return;}

          EAITreeNode aParentTreeNode = null;
          try { aParentTreeNode = (EAITreeNode) aParentNode;} catch( ClassCastException anEx) {}
          if( aParentTreeNode == null) { return;}

          Object aParentNodeUserObject = aParentTreeNode.getUserObject();
          if( aParentNodeUserObject == null) { return;}

          com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aParentNodeConfig = null;
          try { aParentNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc) aParentNodeUserObject;} catch( ClassCastException anEx) {}
          if( aParentNodeConfig == null) { return;}

          Object aNodeUserObject = vTargetNode.getUserObject();
          if( aNodeUserObject == null) { return;}

          EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
          if( aCtxt == null) { return;}

          com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
          try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aNodeUserObject;} catch( ClassCastException anEx) {}
          if( aBranchConfig == null) { return;}

          EAIMMNameIfc aName = null;
          try { aName = aBranchConfig.getName( aCtxt); } catch( EAIException anEx) {}
          if( aName == null) { return;}

          String aString = aName.getString();

          EAIBrowserFrame aBrowserFrame = null;
          Window aWindow = vTargetNode.getWindow();
          if( aWindow != null) {
            try { aBrowserFrame = (EAIBrowserFrame) aWindow;} catch( ClassCastException anEx) {}
          }

          int aConfirmResult = JOptionPane.showConfirmDialog(
            aBrowserFrame,
            nlsStatic("EAIAction_branchConfigs_inNodeConfig_remove.actionPerformed.Remove_Confirmation.message",
              "Do you really want to remove the BranchConfig " + aName +  " ?"),
            nlsStatic("EAIAction_branchConfigs_inNodeConfig_remove.actionPerformed.Remove_Confirmation.title",
              "Remove BranchConfig confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aParentNodeConfig.removeBranchConfigs( aCtxt, aBranchConfig);} catch( EAIException anEx) {}
        }
      }



}


