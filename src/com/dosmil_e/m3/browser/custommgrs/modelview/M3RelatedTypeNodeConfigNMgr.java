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

import com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc;
import com.dosmil_e.m3.traversal.impl.M3RelatedTypeNodeConfigImpl;


public class M3RelatedTypeNodeConfigNMgr extends EAINodeMgr {


  public M3RelatedTypeNodeConfigNMgr() {
    super();
  }




  public boolean isEditable( EAITreeNode theTargetNode) {
    return false;
  }





  protected void initIcon() {

    vIcon = new ImageIcon("images/RelatedTypeNodeConfig.gif");

  }





    public String composeLabel( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = null;
      try { aRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelatedTypeNodeConfig == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
      try { aM3Type = ( com.dosmil_e.m3.core.ifc.M3TypeIfc) aRelatedTypeNodeConfig.getMetaType( aCtxt); }
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

      com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeConfig = null;
      try { aRelatedTypeNodeConfig = (com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aRelatedTypeNodeConfig == null) { return;}

      com.dosmil_e.m3.core.ifc.M3TypeIfc aM3Type = null;
      try { aM3Type = ( com.dosmil_e.m3.core.ifc.M3TypeIfc) aRelatedTypeNodeConfig.getMetaType( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aM3Type == null) { return;}

      theNode.observeOtherForAspect( aM3Type, new String[] { "Name"}, gLabelAspect);
    }









  public EAIActionsMgrIfc[] getNodeActionsMgrs( ) {
    return new EAIActionsMgrIfc[] {  new EAIRelatedTypeNodeConfigActionsMgr() };
  }







   protected class EAIRelatedTypeNodeConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] {
//          new EAIAction_RelatedTypeNodeConfig_delete( theNode)
        };
      }

    }








      protected class EAIAction_RelatedTypeNodeConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		  EAIAction_RelatedTypeNodeConfig_delete anAction = new EAIAction_RelatedTypeNodeConfig_delete( vTargetNode);
		  anAction.setIcon( getIcon());
		  anAction.setName( getName());
		  return anAction;
		}

        public EAIAction_RelatedTypeNodeConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("Delete the RelatedTypeNodeConfig");
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

          M3RelatedTypeNodeConfigImpl aRelatedTypeNodeConfig = null;
          try { aRelatedTypeNodeConfig = (M3RelatedTypeNodeConfigImpl) aNodeUserObject;} catch( ClassCastException anEx) {}
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
            nls("M3RelatedTypeNodeConfigNMgr.delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the RelatedTypeNodeConfig " + aName +  " ?"),
            nls("M3RelatedTypeNodeConfigNMgr.delete.actionPerformed.Delete_Confirmation.title",
              "Delete RelatedTypeNodeConfig and contents confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aRelatedTypeNodeConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }

      }






  public EAIEditorPanelsSetIfc getNodeEditorPanelsSet() {
    EAIEditorPanelsSetIfc anEditorPanelsSet = new EAIEditorPanelsSet();

    EAIEditorPanelsFactoryIfc aPanelsFactory = new com.dosmil_e.m3.browser.custommgrs.M3MMElement_PFac();
    anEditorPanelsSet.add( aPanelsFactory);
    return anEditorPanelsSet;
  }




}

