package com.dosmil_e.m3.browser.customwindows;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
import javax.swing.tree.*;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Properties;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.impl.*;
import com.dosmil_e.modelbase.trx.*;
import com.dosmil_e.modelbase.ifc.*;
import com.dosmil_e.modelbase.flattrx.*;


import com.dosmil_e.m3.core.ifc.M3ModelIfc;
import com.dosmil_e.m3.core.impl.M3ModelImpl;

import com.dosmil_e.browserbase.shell.EAIBrowserFrame;
import com.dosmil_e.browserbase.shell.EAIPilotFrame;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.m3.browser.customconfigs.M3ModelTreeConfigFactory;

import com.dosmil_e.browserbase.configs.EAIConfigIfc;
import com.dosmil_e.browserbase.tree.EAIRootNode;

import com.dosmil_e.modelbase.support.EAIException;


public class M3ModelBrowserFrame extends EAIBrowserFrame {


  public static int     sBrowserFrameWidth     = 756;
  public static int     sBrowserFrameHeight    = 608;

  protected static String sNoProjectRootName  = "?";


  protected JMenu           vMenuProject               = new JMenu();
  protected JMenuItem       vMenuItemProjectSpawn     = new JMenuItem();
  protected JMenuItem       vMenuItemProjectReplicate = new JMenuItem();
  protected JMenuItem       vMenuItemProjectSave      = new JMenuItem();
  protected JMenuItem       vMenuItemProjectSaveAs    = new JMenuItem();
  protected JMenuItem       vMenuItemProjectClose     = new JMenuItem();
  protected JMenu           vMenuWindow               = new JMenu();
  protected JMenu           vMenuActions              = new JMenu();
  protected JMenuItem       vMenuItemActionsUndo     = new JMenuItem();
  protected JMenuItem       vMenuItemActionsRedo     = new JMenuItem();


  protected EAIPilotFrame   vPilotFrame;
  protected EAIMMElementIfc vModel;


  //Construct the frame
  public M3ModelBrowserFrame(
    EAIMMCtxtIfc    theCtxt,
    EAIPilotFrame   thePilotFrame,
    EAIMMElementIfc theProject) {

    this( theCtxt, thePilotFrame, theProject, M3PilotFrame.getTreeConfigForM3( theCtxt));

   }





  //Construct the frame
  public M3ModelBrowserFrame(
    EAIMMCtxtIfc    theCtxt,
    EAIPilotFrame   thePilotFrame,
    EAIMMElementIfc theProject,
    EAIConfigIfc    theConfig) {

    super( theCtxt, theConfig);

    vCtxt             = theCtxt;
    vPilotFrame       = thePilotFrame;
    try { vModel   = (EAIMMElementIfc) theProject;} catch( ClassCastException anException) {}


    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try  {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    initVars();
    doMenuEnablement();

    if( theProject != null) {
      setRoot( theProject);
    }
  }


  protected String getMenuRootText() {
    return "Model";
  }

  protected void initVars() {
  }

  protected int getFrameWidth() {
    return sBrowserFrameWidth;
  }

  protected int getFrameHeight() {
    return sBrowserFrameHeight;
  }

  //Component initialization
  private void jbInit() throws Exception  {

    this.getContentPane().setLayout(vBorderLayout1);
    this.setSize( new Dimension( sBrowserFrameWidth, sBrowserFrameHeight));

    vStatusBar.setText(" ");

    this.populateMenuBar2();
    this.setJMenuBar(vMenuBar1);
    this.getContentPane().add(vStatusBar, BorderLayout.SOUTH);
    this.getContentPane().add(vBrowserPanel, BorderLayout.CENTER);

    vBrowserPanel.setSuperBrowser( this);
  }


  //Help | About action performed
  public void menuItemHelpAbout_actionPerformed(ActionEvent e) {
    M3StudioAboutBox dlg = new M3StudioAboutBox(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.show();
  }


  public void menuItemActionsUndo_actionPerformed(ActionEvent e) {
    undo();
  }


  public void undo() {
    if( vCtxt == null) { return;}
    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();

    if( aTrxMgr == null) { return;}
    try { aTrxMgr.undoTransaction();} catch( EAIException anEx) {}
  }


  public void menuItemActionsRedo_actionPerformed(ActionEvent e) {
    redo();
  }


  public void redo() {
    if( vCtxt == null) { return;}
    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();

    if( aTrxMgr == null) { return;}
    try { aTrxMgr.redoTransaction();} catch( EAIException anEx) {}
  }



  public void menuItemActionsCommit_actionPerformed(ActionEvent e) {

  }

  public void menuItemActionsRollback_actionPerformed(ActionEvent e) {

  }

  protected void populateMenuBar() {
  }

  protected void populateMenuBar2() {

    vMenuActions.setText("Control");
    vMenuActions.setToolTipText("Actions to control overall Project edition");

    vMenuItemActionsUndo.setText("Undo");
    vMenuItemActionsUndo.setToolTipText("Undo effects of last actio");
    vMenuItemActionsUndo.setEnabled(true);
    vMenuItemActionsUndo.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemActionsUndo_actionPerformed(e);
      }
    });
    vMenuActions.add(vMenuItemActionsUndo);

    vMenuItemActionsRedo.setText("Redo");
    vMenuItemActionsRedo.setToolTipText("Redo effects of last undone action");
    vMenuItemActionsRedo.setEnabled(true);
    vMenuItemActionsRedo.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemActionsRedo_actionPerformed(e);
      }
    });
    vMenuActions.add(vMenuItemActionsRedo);

    vMenuProject.setText("Model");
    vMenuProject.setToolTipText("Model operations");



    vMenuItemProjectSpawn.setToolTipText("Spawn new window on current Model");
    vMenuItemProjectSpawn.setEnabled( true);
    vMenuItemProjectSpawn.setText("Spawn");
    vMenuItemProjectSpawn.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemProjectSpawn_actionPerformed(e);
      }
    });
    vMenuProject.add(vMenuItemProjectSpawn);

    vMenuItemProjectReplicate.setToolTipText("Replicate current Model");
    vMenuItemProjectReplicate.setEnabled(true);
    vMenuItemProjectReplicate.setText("Replicate");
    vMenuItemProjectReplicate.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemProjectReplicate_actionPerformed(e);
      }
    });
    vMenuProject.add(vMenuItemProjectReplicate);

    vMenuProject.addSeparator();


    vMenuItemProjectSave.setToolTipText("Save current Model in file named as the Model");
    vMenuItemProjectSave.setEnabled(false);
    vMenuItemProjectSave.setText("Save");
    vMenuItemProjectSave.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemProjectSave_actionPerformed(e);
      }
    });
    vMenuProject.add(vMenuItemProjectSave);
    vMenuItemProjectSaveAs.setToolTipText("Save current Model in a new File");
    vMenuItemProjectSaveAs.setEnabled(true);
    vMenuItemProjectSaveAs.setText("Save as ...");
    vMenuItemProjectSaveAs.addActionListener(new java.awt.event.ActionListener() {

      public void actionPerformed(ActionEvent e) {
        menuItemProjectSaveAs_actionPerformed(e);
      }
    });
    vMenuProject.add(vMenuItemProjectSaveAs);

    vMenuProject.addSeparator();

    vMenuItemProjectClose.setText("Close");
    vMenuItemProjectClose.addActionListener(new ActionListener()  {

      public void actionPerformed(ActionEvent e) {
        menuItemProjectClose_actionPerformed(e);
      }
    });
    vMenuProject.add(vMenuItemProjectClose);

    vMenuHelp.setText("Help");
    vMenuItemHelpAbout.setText("About");
    vMenuItemHelpAbout.addActionListener(new ActionListener()  {

      public void actionPerformed(ActionEvent e) {
        menuItemHelpAbout_actionPerformed(e);
      }
    });
    vMenuHelp.add(vMenuItemHelpAbout);

    vMenuHelp.setText("Help");
    vMenuItemHelpAbout.setText("About");
    vMenuItemHelpAbout.addActionListener(new ActionListener()  {

      public void actionPerformed(ActionEvent e) {
        menuItemHelpAbout_actionPerformed(e);
      }
    });
    vMenuWindow.setToolTipText("Manage Windows in the Model");
    vMenuWindow.setText("Windows");

    JMenuItem aMenuItem = new JMenuItem();
    aMenuItem.setText( "Pilot");
    aMenuItem.setEnabled(true);
    aMenuItem.addActionListener(new ActionListener()  {
      public void actionPerformed(ActionEvent e) {
        if( vPilotFrame != null) {
          vPilotFrame.show();
        }
      }
    });
    vMenuWindow.add( aMenuItem);


    vMenuHelp.add(vMenuItemHelpAbout);

    vMenuSelection.setToolTipText("Operations on current selection");
    vMenuSelection.setText("Selection");


    vMenuBar1.add( vMenuProject);
    vMenuBar1.add(vMenuActions);
    vMenuBar1.add(vMenuSelection);
    vMenuBar1.add(vMenuWindow);
    vMenuBar1.add(vMenuHelp);
  }



  //Overridden so we can exit on System Close
  protected void processWindowEvent(WindowEvent e) {
    if(e.getID() == WindowEvent.WINDOW_CLOSING) {
      menuItemProjectClose_actionPerformed(null);
    }
    else {
      super.processWindowEvent(e);
    }

  }








  



  public static String breakInLines( String theMsg, int theMaxLength) {
    java.util.StringTokenizer aTokenizer = new java.util.StringTokenizer( theMsg);

    String aNewMsg = new String();
    int aLineLength = 0;
    while( aTokenizer.hasMoreTokens()) {
      String aToken = aTokenizer.nextToken();
      if( aToken != null) {
        int aTokenLength = aToken.length();
        if( aLineLength + aTokenLength > theMaxLength) {

          if( aTokenLength > theMaxLength) {
            aToken = contractString( aToken, theMaxLength);
            aTokenLength = theMaxLength;
          }
          aNewMsg = aNewMsg + "\n" + aToken;
          aLineLength = aTokenLength;
        }
        else {
          aNewMsg = aNewMsg + " " + aToken;
          aLineLength = aLineLength + aTokenLength;
        }
      }
    }
    return aNewMsg;
  }


  public static String contractString( String theMsg, int theMaxLength) {
    if( theMsg == null) { return null;}
    if( theMaxLength < 1) { return new String();}

    int aLength = theMsg.length();
    if( aLength <= theMaxLength) { return theMsg;}


    int aHalfLength = (theMaxLength / 2) - 2;
    String aContracted = theMsg.substring( 0, aHalfLength - 1) +
      gContractedStringEllipsis +
      theMsg.substring( aLength - aHalfLength -1 , aLength );
    return aContracted;
  }



  void menuItemProjectReplicate_actionPerformed(ActionEvent e) {
    replicate();
  }




  public boolean replicate() {

    if( vModel == null) { return false;}

    showActionStatus("Replicate Model : will open a new Browser on replicated Model");

    EAIMMCtxtIfc aCtxt = getCtxt();
    if( aCtxt == null) { return false;}

    try {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aM3M3Model = com.dosmil_e.m3.meta.M3Dynamic02.getM3Model( aCtxt);
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aM3TravCfg =
      aM3M3Model.findTraversalConfigsNamed( aCtxt, new EAIMMName(com.dosmil_e.m3.meta.M3ReplicationConfig.gTraversalConfigName));

    com.dosmil_e.browserbase.configs.EAIConfigIfc aConfigForM3 = getConfig();

    com.dosmil_e.m3.visit.M3TraversalCtxtIfc aTravCtxt = new com.dosmil_e.m3.visit.M3TraversalCtxt();
    com.dosmil_e.m3.visit.M3TraversalVisitor aVisitor = new com.dosmil_e.m3.visit.M3TraversalVisitor( aCtxt);

    aVisitor.visit( aCtxt, aTravCtxt, aM3TravCfg, (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) vModel);

    java.util.Hashtable aReplicatedBySourceDict = aTravCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict != null) {
      Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( vModel);
      if( aReplicatedSourceElementObject != null) {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
        try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
        if( aReplicatedSourceElement != null)     {
          getPilotFrame().openRootBrowserFrameClassNamed( aCtxt, aReplicatedSourceElement, this.getClass().getName(), getConfig());

        }
      }
    }

  } catch( EAIException anEx) {}

    return true;
  }




  void menuItemProjectSpawn_actionPerformed(ActionEvent e) {
    spawn();
  }


  public boolean spawn() {

    if( vModel == null) { return false;}

    showActionStatus("Spawn Model : will open a new Browser on current Model");

    EAIMMCtxtIfc aCtxt = getCtxt();
    if( aCtxt == null) { return false;}

    getPilotFrame().openRootBrowserFrameClassNamed( aCtxt, vModel, this.getClass().getName(), getConfig());
    return true;
  }



  void menuItemProjectSave_actionPerformed(ActionEvent e) {
    save();
  }



  public boolean save() {
    if( vModel == null) { return false;}

    EAIMMCtxtIfc aCtxt = getCtxt();
    if( aCtxt == null) { return false;}

    EAIMMFactoryIfc aFactory = aCtxt.getMMFactory("M3");
    if( aFactory == null) { return false;}

    boolean aSaveResult = false;
    try { aSaveResult = aFactory.persist( aCtxt, vModel, this);} catch( EAIException anEx) {}

    if( !aSaveResult) {
      String aMessage = "Error saving Project";
      JOptionPane.showMessageDialog(
        this,
        nls("Pilot.Menu.File.Save.IO_Exception.SaveFailed_Error.message",
          "Error saving vModel file\n") + aMessage,
        nls("Pilot.Menu.File.Save.IO_Exception.SaveFailed_Error.title",
          "Save ERROR"),
        JOptionPane.ERROR_MESSAGE);
      return false;
    }

    if( !aSaveResult) {
      showActionStatus( "Model File save FAILED");
      doMenuEnablement();
      return false;
    }

    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();
    if( aTrxMgr != null) {
      try { aTrxMgr.justSaved();} catch( EAIException anException) {}
    }

    showActionStatus( "Model File SUCCESSFULLY saved");
    doMenuEnablement();
    return true;
  }


  void menuItemProjectSaveAs_actionPerformed(ActionEvent e) {
    saveAs();
  }


  public boolean saveAs() {

    if( vModel == null) { return false;}

    showActionStatus("Save Project as : Please choose destination Project file");

    EAIMMCtxtIfc aCtxt = getCtxt();
    if( aCtxt == null) { return false;}

    EAIMMFactoryIfc aFactory = aCtxt.getMMFactory("M3");
    if( aFactory == null) { return false;}

    boolean aSaveResult = false;
    try { aSaveResult = aFactory.persistAs( aCtxt, vModel, this);} catch( EAIException anEx) {}

    if( !aSaveResult) {
      String aMessage = "Error savingAs Project";
      JOptionPane.showMessageDialog(
        this,
        nls("Pilot.Menu.File.SaveAs.IO_Exception.SaveFailed_Error.message",
          "Error saving vModel file\n") + aMessage,
        nls("Pilot.Menu.File.SaveAs.IO_Exception.SaveFailed_Error.title",
          "Save ERROR"),
        JOptionPane.ERROR_MESSAGE);
      return false;
    }

    if( !aSaveResult) {
      showActionStatus( "Model File saveAs FAILED");
      doMenuEnablement();
      return false;
    }

    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();
    if( aTrxMgr != null) {
      try { aTrxMgr.justSaved();} catch( EAIException anException) {}
    }

    showActionStatus( "Model File SUCCESSFULLY saved");
    doMenuEnablement();
    return true;
  }








  public void menuItemProjectClose_actionPerformed(ActionEvent e) {
    closeProject();
  }



  protected boolean closeProject() {
    EAIFlatTransactionMgrIfc aTrxMgr = null;
    boolean aCloseResult = false;

    if( vModel == null) {
      release();
      return true;
    }

    if( vCtxt == null) {
      vModel = null;
      release();
      return true;
    }

    aTrxMgr = vCtxt.getFlatTrxMgr();
    if( aTrxMgr == null) {
      vModel = null;
      release();
      return true;
    }

    boolean aHasUnsavedChanges = false;
    try { aHasUnsavedChanges = aTrxMgr.hasUnsavedChanges();} catch( EAIException anException) {}
    if( aHasUnsavedChanges) {
      int aConfirmResult = JOptionPane.showConfirmDialog(
        this,
        nls("M3ModelBrowserFrame.MenuBar.FileMenu.CloseMenuItem.CancelClose_Exception.DiscardChanges_Confirmation.message",
          "Do you want to discard unsaved changes ?"),
        nls("M3ModelBrowserFrame.MenuBar.FileMenu.CloseMenuItem.CancelClose_Exception.DiscardChanges_Confirmation.title",
          "Discard unsaved changes confirmation"),
        JOptionPane.YES_NO_CANCEL_OPTION);
      if( aConfirmResult != JOptionPane.YES_OPTION) { return false;}
    }

    aCloseResult = true;
    vModel = null;

   try {
    if( !aCloseResult) {
      showActionStatus( "Model File close FAILED");
    }
    else {
      showActionStatus( "Model File SUCCESSFULLY closed");
      try { aTrxMgr.reset();} catch( EAIException anException) {}

    }

    if( vPilotFrame != null) {
      vPilotFrame.browserFrameClosing( this);
    }
   }
   finally {
    release();
   }
    return aCloseResult;

  }


  public void release() {
    if( vPilotFrame != null) {
      vPilotFrame.browserFrameClosing( this);
    }
    if( vCtxt != null) {
      vCtxt.release();
    }
    super.release();
  }




  public EAIPilotFrame getPilotFrame() {
    return vPilotFrame;
  }



  public void setCtxt( EAIMMCtxtIfc theCtxt) {
    vCtxt  = theCtxt;
  }


  public EAIMMCtxtIfc getCtxt() {
    return vCtxt;
  }



  public void setProject( M3ModelIfc theProject) {
    vModel  = theProject;
    setRoot( vModel);
  }



  public EAIMMElementIfc getProject() {
    return vModel;
  }



  public String getRootName() {
    EAIMMElementIfc aProject = getProject();
    if( aProject == null) { return sNoProjectRootName; }

    EAIMMCtxtIfc aCtxt = getCtxt();
    if( aCtxt == null) { return sNoProjectRootName; }

    EAIMMNameIfc aName = null;
    try { aName = vModel.getName(); } catch( EAIException anEx) {}
    if( aName == null) { return "null Project name";}

    String aString = aName.getString();
    if( aString == null) { return "null Project name string";}
    if( aString.length() < 1) { return "empty Project name";}

    return aString;
  }


  public String getRootKindName() {
    String aKind = "";
    return aKind + "M3Model ";
  }




  protected void observePropertiesForTitle() {
    if( vModel == null)     { return;}

    EAIRootNode aRootNode = getRootNode();
    if( aRootNode == null)    { return;}

    aRootNode.observeOtherForAspect( vModel, new String[] { "Name"} , gFrameTitleAspect, getTitleObserver());
  }






  protected void showActionStatus( String theStatus) {
    if( vStatusBar == null) { return;}

    String aStatus = new String(" ");
    if( theStatus != null && theStatus.length() > 0) {
      aStatus = theStatus;
    }
    vStatusBar.setText( aStatus);
  }


  protected void doMenuEnablement() {
    boolean aHasUnsavedChanges = false;
    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();
    try { aHasUnsavedChanges = aTrxMgr.hasUnsavedChanges();} catch( EAIException anException) {}

    vMenuItemProjectSave.setEnabled( true /* aHasUnsavedChanges */);
  }


  class M3ModelFileFilter extends javax.swing.filechooser.FileFilter {
    public boolean accept(File thePathname) {
      return( thePathname.getName().endsWith(".cxp") || thePathname.isDirectory());
    }
    public String getDescription() {
      return( "M3 Projects" );
    }
  } // end class M3ModelFileFilter



  protected String nls( String theSymbol, String theDefault) {
    return theDefault;
  }



  public boolean exitRequest() {
    if( vCtxt == null) { return true;}

    return !hasUnsavedChanges();
  }


  public boolean hasUnsavedChanges() {
    if( vCtxt == null) { return false;}

    EAIFlatTransactionMgrIfc aTrxMgr = vCtxt.getFlatTrxMgr();
    if( aTrxMgr == null) { return false;}

    boolean aHasUnsavedChanges = false;
    try { aHasUnsavedChanges = aTrxMgr.hasUnsavedChanges();} catch( EAIException anException) {}
    return aHasUnsavedChanges;
  }







  protected void clearVars() {
    vMenuProject            = null;
    vMenuItemProjectSave    = null;
    vMenuItemProjectSaveAs  = null;
    vMenuItemProjectClose   = null;
    vMenuWindow             = null;
    vMenuActions            = null;
    vMenuItemActionsUndo    = null;
    vMenuItemActionsRedo    = null;
    vPilotFrame             = null;
    vModel                = null;
    super.clearVars();
  }




}
