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

import com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc;
import com.dosmil_e.m3.traversal.impl.M3BranchConfigImpl;


public class M3BranchConfigNMgr extends EAINodeMgr {


  public M3BranchConfigNMgr() {
    super();
  }



  public boolean isEditable( EAITreeNode theTargetNode) {
    return false;
  }






  protected void initIcon() {

    vIcon = new ImageIcon("images/BranchConfig.gif");

  }








    public String composeLabel( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
      try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBranchConfig == null) { return null;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = null;
      try { aM3Relationship = ( com.dosmil_e.m3.core.ifc.M3RelationshipIfc) aBranchConfig.getMetaRelationship( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aM3Relationship == null) { return null;}

      EAIMMNameIfc aName = null;
      try { aName = aM3Relationship.getName();} catch( EAIException anEx) {}
      if( aName == null) { return null;}

      String aLabel = aName.getString();

      return aLabel;
    }



    protected void observePropertiesForLabel( EAITreeNode theNode) {
      super.observePropertiesForLabel( theNode);

      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "MetaRelationship"}, gLabelAspect);
    }





    protected void observeOtherPropertiesForLabel( EAITreeNode theNode) {

      if( theNode == null) { return;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return;}

      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfig = null;
      try { aBranchConfig = (com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBranchConfig == null) { return;}

      com.dosmil_e.m3.core.ifc.M3RelationshipIfc aM3Relationship = null;
      try { aM3Relationship = ( com.dosmil_e.m3.core.ifc.M3RelationshipIfc) aBranchConfig.getMetaRelationship( aCtxt); }
      catch( EAIException anEx) {}
      catch( ClassCastException anEx) {}
      if( aM3Relationship == null) { return;}

      theNode.observeOtherForAspect( aM3Relationship, new String[] { "Name"}, gLabelAspect);
    }





  public EAIActionsMgrIfc[] getNodeActionsMgrs( ) {
    return new EAIActionsMgrIfc[] {  new EAIBranchConfigActionsMgr() };
  }







   protected class EAIBranchConfigActionsMgr extends EAIActionsMgr {

      protected EAIActionIfc[] getActions( EAITreeNode theNode) {
        if( theNode == null) { return null;}
        return new EAIActionIfc[] {
//          new EAIAction_BranchConfig_delete( theNode)
        };
      }

    }








      protected class EAIAction_BranchConfig_delete extends EAIAction {
        public EAIActionIfc cloneBase() throws CloneNotSupportedException {
		  EAIAction_BranchConfig_delete anAction = new EAIAction_BranchConfig_delete( vTargetNode);
		  anAction.setIcon( getIcon());
		  anAction.setName( getName());
		  return anAction;
		}

        public EAIAction_BranchConfig_delete( EAITreeNode theNode) {
          super( theNode);
        }


        protected void initIcon() {
          vIcon = new ImageIcon("images/delete.gif");
        }


        protected void initName() {
          vName = new String("Delete the BranchConfig");
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

          M3BranchConfigImpl aBranchConfig = null;
          try { aBranchConfig = (M3BranchConfigImpl) aNodeUserObject;} catch( ClassCastException anEx) {}
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
            nls("M3BranchConfigNMgr.delete.actionPerformed.Delete_Confirmation.message",
              "Do you really want to delete the BranchConfig " + aName +  " ?"),
            nls("M3BranchConfigNMgr.delete.actionPerformed.Delete_Confirmation.title",
              "Delete BranchConfig and contents confirmation"),
            JOptionPane.YES_NO_CANCEL_OPTION);
          if( aConfirmResult != JOptionPane.YES_OPTION) { return;}

          try { aBranchConfig.delete( aCtxt);} catch( EAIException anEx) {}
        }

      }






  public EAIEditorPanelsSetIfc getNodeEditorPanelsSet() {
    EAIEditorPanelsSetIfc anEditorPanelsSet = new EAIEditorPanelsSet();

    EAIEditorPanelsFactoryIfc aPanelsFactory = new com.dosmil_e.m3.browser.custommgrs.M3MMElement_PFac();
    anEditorPanelsSet.add( aPanelsFactory);
    return anEditorPanelsSet;
  }




}

