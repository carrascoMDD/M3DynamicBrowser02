package com.dosmil_e.m3.browser.customapps;

import com.dosmil_e.browserbase.shell.EAIApplication;

import java.util.StringTokenizer;
import java.util.Properties;
import java.util.Enumeration;

import javax.swing.UIManager;
import java.awt.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class M3Application extends EAIApplication {

  public static String  sM3PilotFrameClassName = "com.dosmil_e.m3.browser.customwindows.M3PilotFrame";


    //Construct the application
  public M3Application( String[] theArgs) {
    super( theArgs);
  }


  protected void initVars() {
    super.initVars();
    vDefaultPilotFrameClassName = sM3PilotFrameClassName;
  }


  //Main method
  public static void main(String[] theArgs) {
    try  {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   }
    catch(Exception e) {
    }

    new M3Application( theArgs);
  }





}


