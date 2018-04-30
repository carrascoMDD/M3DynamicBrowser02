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

import com.dosmil_e.browserbase.metaconfigs.EAIMetaTreeConfigFactory;

import com.dosmil_e.browserbase.configs.EAIConfigIfc;
import com.dosmil_e.browserbase.tree.EAIRootNode;

import com.dosmil_e.modelbase.support.EAIException;


public class M3ModelMetaBrowserFrame extends M3ModelBrowserFrame {


  //Construct the frame
  public M3ModelMetaBrowserFrame(
    EAIMMCtxtIfc    theCtxt,
    EAIPilotFrame   thePilotFrame,
    EAIMMElementIfc   theProject) {

    super( theCtxt, thePilotFrame, theProject, EAIMetaTreeConfigFactory.getConfig( theCtxt, theProject));
  }




}
