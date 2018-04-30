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

import com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc;
import com.dosmil_e.m3.traversal.impl.M3TraversalConfigImpl;


public class M3TraversalConfigNMgr extends EAINodeMgr {


  public M3TraversalConfigNMgr() {
    super();
  }






  public boolean isEditable( EAITreeNode theTargetNode) {
    return false;
  }



  protected void initIcon() {

    vIcon = new ImageIcon("images/TraversalConfig.gif");

  }










  public EAIActionsMgrIfc[] getNodeActionsMgrs( ) {
    return new EAIActionsMgrIfc[] {  new EAITraversalConfigActionsMgr() };
  }







   protected class EAITraversalConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] {
//          new EAIAction_TraversalConfig_delete( theNode)
        };
      }

    }








      protected class EAIAction_TraversalConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		  EAIAction_TraversalConfig_delete anAction = new EAIAction_TraversalConfig_delete( vTargetNode);
		  anAction.setIcon( getIcon());
		  anAction.setName( getName());
		  return anAction;
		}

        public EAIAction_TraversalConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("Delete the TraversalConfig");
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

          M3TraversalConfigImpl aTraversalConfig = null;
          try { aTraversalConfig = (M3TraversalConfigImpl) aNodeUserObject;} catch( ClassCastException anEx) {}
          if( aTraversalConfig == null) { return;}

          EAIMMNameIfc aName = null;
          try { aName = aTraversalConfig.getName( aCtxt); } catch( EAIException anEx) {}
          if( aName == null) { return;}

          String aString = aName.getString();

          EAIBrowserFrame aBrowserFrame = null;
          Window aWindow = vTargetNode.getWindow();
          if( aWindow != null) {
            try { aBrowserFrame = (EAIBrowserFrame) aWindow;} catch( ClassCastException anEx) {}
          }

          int aConfirmResult = JOptionPane.showConfirmDialog(
            aBrowserFrame,
            nls("M3TraversalConfigNMgr.delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the TraversalConfig " + aName +  " ?"),
            nls("M3TraversalConfigNMgr.delete.actionPerformed.Delete_Confirmation.title",
              "Delete TraversalConfig and contents confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aTraversalConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }

      }






  public EAIEditorPanelsSetIfc getNodeEditorPanelsSet() {
    EAIEditorPanelsSetIfc anEditorPanelsSet = new EAIEditorPanelsSet();

    EAIEditorPanelsFactoryIfc aPanelsFactory = new com.dosmil_e.m3.browser.custommgrs.M3MMElement_PFac();
    anEditorPanelsSet.add( aPanelsFactory);
    return anEditorPanelsSet;
  }




}

