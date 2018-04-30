package com.dosmil_e.m3.browser.customwindows;



import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.ifc.EAIMMElementIfc;

import com.dosmil_e.browserbase.shell.EAIPilotFrame;


public class M3PilotFrame extends EAIPilotFrame {

  public static final String  sM3MMCtxtClassName            = "com.dosmil_e.m3.support.MMCtxtWithM3";
  public static final String  sM3BrowserFrameClassName      = "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame";
  public static final String  sM3MetaBrowserFrameClassName  = "com.dosmil_e.m3.browser.customwindows.M3ModelMetaBrowserFrame";
  public static final String  sM3NameForNewRoot             = "new M3 model";
  public static final String  sFactoryNameForNewRoot        = "M3";

  public static final String  sM3PilotFrameName       = "M3 Pilot";

  public M3PilotFrame() {
    super();
  }


  protected void initVars() {
    super.initVars();
    
    vDefaultMMCtxtClassName             = sM3MMCtxtClassName;
    vDefaultBrowserFrameClassName       = sM3BrowserFrameClassName;
    vDefaultMetaBrowserFrameClassName   = sM3MetaBrowserFrameClassName;
    vDefaultPilotFrameName              = sM3PilotFrameName;
    vDefaultNameForNewRoot              = sM3NameForNewRoot;
    vDefaultFactoryNameForNewRoot       = sFactoryNameForNewRoot;
  }


  protected void registerFactories( EAIMMCtxtIfc theCtxt) {
    super.registerFactories( theCtxt);

    com.dosmil_e.modelbase.support.EAIMMFactoryIfc aFactory =
      new com.dosmil_e.m3.support.M3MMFactoryStandAlone();
    theCtxt.registerFactory( aFactory);

    com.dosmil_e.m3.support.MMCtxtWithM3Ifc aCtxt = null;
    try { aCtxt = (com.dosmil_e.m3.support.MMCtxtWithM3Ifc) theCtxt;} catch( ClassCastException anEx) {}
    if( aCtxt == null) { return;}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = com.dosmil_e.m3.meta.M3Dynamic02.getM3Model( aCtxt);
    if( aModel == null) { return;}

    aCtxt.registerModel( aModel);
    aCtxt.registerFactoryForModel( aModel, aFactory);
  }


  

  protected EAIMMElementIfc sampleRoot() throws EAIException {

    EAIMMCtxtIfc aCtxt = createMMCtxt();
    if( aCtxt == null) {
      String aMMCtxtClassName = getMMCtxtClassName();
      if( aMMCtxtClassName == null) {
        aMMCtxtClassName = "null MMCtxtClassName - check program arguments";
      }
      showActionStatus( "FAILURE null Ctxt : " + aMMCtxtClassName);
      return null;
    }


    com.dosmil_e.m3.core.ifc.M3ModelIfc aM3Model = com.dosmil_e.m3.meta.M3Dynamic02.getM3Model( aCtxt);

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aReplicationTravCfg = aM3Model.findTraversalConfigsNamed(
      aCtxt, new EAIMMName( "M3ReplicationConfig"));

    openRootBrowserFrameClassNamed( aCtxt, aReplicationTravCfg, sM3BrowserFrameClassName, getTreeConfigForModelViewM3( aCtxt));

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aNewTravCfg =
      (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "TraversalConfig", "traversal",new EAIMMName("New View"));
		aM3Model.addTraversalConfigs( aCtxt, aNewTravCfg);

    openRootBrowserFrameClassNamed( aCtxt, aNewTravCfg, sM3BrowserFrameClassName, getTreeConfigForModelViewM3( aCtxt));

    openRootBrowserFrame( aCtxt, aM3Model);





if( true) { return aM3Model;}
    EAIMMElementIfc aRoot = aM3Model;
    if( aRoot == null) {
      showActionStatus( "FAILURE creating Sample Root");
      return null;
    }

    try { aCtxt.getFlatTrxMgr().justSaved();} catch( EAIException anException) {}

    showActionStatus( "New Root SUCCESSFULLY created");

    com.dosmil_e.m3.visit.M3TraversalCtxtIfc aTravCtxt = new com.dosmil_e.m3.visit.M3TraversalCtxt();
    com.dosmil_e.m3.visit.M3TraversalVisitor aVisitor = new com.dosmil_e.m3.visit.M3TraversalVisitor( aCtxt);

    aVisitor.visit( aCtxt, aTravCtxt, aReplicationTravCfg, aM3Model);

    java.util.Hashtable aReplicatedBySourceDict = aTravCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict != null) {
      Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( aM3Model);
      if( aReplicatedSourceElementObject != null) {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
        try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
        if( aReplicatedSourceElement != null)     {
          openRootBrowserFrame( aCtxt, aReplicatedSourceElement);
        }
      }
    }

    openRootBrowserFrame( aCtxt, aReplicationTravCfg);

//    openRootBrowserFrame( aCtxt, aM3Model);


    return aRoot;
  }



  public static com.dosmil_e.browserbase.configs.EAIConfigIfc getTreeConfigForM3OLD( EAIMMCtxtIfc theCtxt) {

    com.dosmil_e.browserbase.configs.EAIConfigIfc aConfig =
      com.dosmil_e.m3.browser.customconfigs.M3ModelTreeConfigFactory.getConfig( theCtxt);

    if( aConfig != null) {
      aConfig.setClassAlias(
        com.dosmil_e.m3.meta.M3TraversalConfig.class,
        theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

      aConfig.setClassAlias(
        com.dosmil_e.m3.meta.M3ReplicationConfig.class,
        theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));
    }

    return aConfig;
  }


  public static com.dosmil_e.browserbase.configs.EAIConfigIfc getTreeConfigForM3( EAIMMCtxtIfc theCtxt) {

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverridenConfig =
      com.dosmil_e.m3.browser.customconfigs.M3ModelTreeConfigFactory.getConfig( theCtxt);
    if( aOverridenConfig == null) { return null;}

    String aName = aOverridenConfig.getNameOrUnnamed();

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverrideConfig =
      new com.dosmil_e.browserbase.configs.EAIConfig(aName + "_OVR_aliasClassesFor_M3TraversalConfig_&_M3ReplicationConfig");

    aOverrideConfig.setClassAlias(
      com.dosmil_e.m3.meta.M3TraversalConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setClassAlias(
      com.dosmil_e.m3.meta.M3ReplicationConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setOverridenConfig( aOverridenConfig);

    return aOverrideConfig;
  }



  public static com.dosmil_e.browserbase.configs.EAIConfigIfc getTreeConfigForModelViewM3( EAIMMCtxtIfc theCtxt) {

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverridenConfig =
      com.dosmil_e.m3.browser.customconfigs.M3ModelViewTreeConfigFactory.getConfig( theCtxt);
    if( aOverridenConfig == null) { return null;}

    String aName = aOverridenConfig.getNameOrUnnamed();

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverrideConfig =
      new com.dosmil_e.browserbase.configs.EAIConfig(aName + "_OVR_aliasClassesFor_M3TraversalConfig_&_M3ReplicationConfig");

    aOverrideConfig.setClassAlias(
      com.dosmil_e.m3.meta.M3TraversalConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setClassAlias(
      com.dosmil_e.m3.meta.M3ReplicationConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setOverridenConfig( aOverridenConfig);

    return aOverrideConfig;
  }




}
