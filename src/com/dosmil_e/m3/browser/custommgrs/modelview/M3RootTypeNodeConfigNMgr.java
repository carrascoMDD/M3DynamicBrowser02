package com.dosmil_e.m3.browser.custommgrs.modelview;

// NMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;


import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.util.Vector;

import com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc;
import com.dosmil_e.m3.traversal.impl.M3RootTypeNodeConfigImpl;


public class M3RootTypeNodeConfigNMgr extends EAINodeMgr {


  public M3RootTypeNodeConfigNMgr() {
    super();
  }





  public boolean isEditable( EAITreeNode theTargetNode) {
    return false;
  }




  protected void initIcon() {

    vIcon = new ImageIcon("images/RootTypeNodeConfig.gif");

  }






    public String composeLabel( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
      try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRootTypeNodeConfig == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
      try { aM3Type = ( com.dosmil_e.m3.core.ifc.M3TypeIfc) aRootTypeNodeConfig.getMetaType( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aM3Type == null) { return null;}

      EAIMMNameIfc aName = null;
      try { aName = aM3Type.getName();} catch( EAIException anEx) {}
      if( aName == null) { return null;}

      String aLabel = aName.getString();

      return aLabel;
    }



    protected void observePropertiesForLabel( EAITreeNode theNode) {
      super.observePropertiesForLabel( theNode);

      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "MetaType"}, gLabelAspect);
    }





    protected void observeOtherPropertiesForLabel( EAITreeNode theNode) {

      if( theNode == null) { return;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return;}

      com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfig = null;
      try { aRootTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRootTypeNodeConfig == null) { return;}

      com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
      try { aM3Type = ( com.dosmil_e.m3.core.ifc.M3TypeIfc) aRootTypeNodeConfig.getMetaType( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aM3Type == null) { return;}

      theNode.observeOtherForAspect( aM3Type, new String[] { "Name"}, gLabelAspect);
    }





  public EAIActionsMgrIfc[] getNodeActionsMgrs( ) {
    return new EAIActionsMgrIfc[] {  new EAIRootTypeNodeConfigActionsMgr() };
  }







   protected class EAIRootTypeNodeConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] {
//          new EAIAction_RootTypeNodeConfig_delete( theNode)
        };
      }

    }








      protected class EAIAction_RootTypeNodeConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		  EAIAction_RootTypeNodeConfig_delete anAction = new EAIAction_RootTypeNodeConfig_delete( vTargetNode);
		  anAction.setIcon( getIcon());
		  anAction.setName( getName());
		  return anAction;
		}

        public EAIAction_RootTypeNodeConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("Delete the RootTypeNodeConfig");
        }

        protected void initNameInMenu() {
          vNameInMenu = new String("Delete");

        }

        protected void initNameForToolBar() {
          vNameForToolBar = new String("Delete");

        }

        protected void initNameInNestedMenu() {
          vNameInNestedMenu = new String("Delete");

        }


          // Implementation of the ActionListener interface in Action

        public void actionPerformed( ActionEvent theEvent) {
          if( vTargetNode == null) { return;}

          Object aNodeUserObject = vTargetNode.getUserObject();
          if( aNodeUserObject == null) { return;}

          EAIMMCtxtIfc aCtxt = vTargetNode.getMMCtxt();
          if( aCtxt == null) { return;}

          M3RootTypeNodeConfigImpl aRootTypeNodeConfig = null;
          try { aRootTypeNodeConfig = (M3RootTypeNodeConfigImpl) aNodeUserObject;} catch( ClassCastException anEx) {}
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
            nls("M3RootTypeNodeConfigNMgr.delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the RootTypeNodeConfig " + aName +  " ?"),
            nls("M3RootTypeNodeConfigNMgr.delete.actionPerformed.Delete_Confirmation.title",
              "Delete RootTypeNodeConfig and contents confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aRootTypeNodeConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }

      }






  public EAIEditorPanelsSetIfc getNodeEditorPanelsSet() {
    EAIEditorPanelsSetIfc anEditorPanelsSet = new EAIEditorPanelsSet();

    EAIEditorPanelsFactoryIfc aPanelsFactory = new com.dosmil_e.m3.browser.custommgrs.M3MMElement_PFac();
    anEditorPanelsSet.add( aPanelsFactory);
    return anEditorPanelsSet;
  }




}

