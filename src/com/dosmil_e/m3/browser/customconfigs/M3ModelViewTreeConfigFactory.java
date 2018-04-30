package com.dosmil_e.m3.browser.customconfigs;

// WholeTreeConfigFactory

import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.tree.EAITreeModel;
import com.dosmil_e.browserbase.tree.EAITreeCellRenderer;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.modelbase.ifc.*;

import java.util.Hashtable;


public class M3ModelViewTreeConfigFactory {

  public static EAIConfig     gConfig;
  public static Class         gCtxtClass;


  /*******************************************************
   *  Static members holding Node and Branch Managers
   *******************************************************/

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3TraversalConfigNMgr aTraversalConfigNMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3TraversalConfigNMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3TraversalConfig_rootTypeNodeConfigsBMgr aTraversalConfig_rootTypeNodeConfigsBMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3TraversalConfig_rootTypeNodeConfigsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr aParameterNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3CommentNMgr aCommentNMgr  = new com.dosmil_e.m3.core.custommgrs.M3CommentNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ElementNMgr aElementNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ElementNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr aElement_parametersBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr aElement_commentsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfigNMgr aRootTypeNodeConfigNMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfigNMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3BranchConfigNMgr aBranchConfigNMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3BranchConfigNMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3BranchConfig_typeNodeConfigsBMgr aBranchConfig_typeNodeConfigsBMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3BranchConfig_typeNodeConfigsBMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfigNMgr aRelatedTypeNodeConfigNMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfigNMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3AttributeConfigNMgr aAttributeConfigNMgr  = new com.dosmil_e.m3.browser.custommgrs.modelview.M3AttributeConfigNMgr();



    // Custom MGRS

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfig_nodeConfig_branchConfigsBMgr
    aRootTypeNodeConfig_nodeConfig_branchConfigsBMgr  =
    new com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfig_nodeConfig_branchConfigsBMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfig_nodeConfig_branchConfigsBMgr
    aRelatedTypeNodeConfig_nodeConfig_branchConfigsBMgr  =
    new com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfig_nodeConfig_branchConfigsBMgr();


	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfig_nodeConfig_attributeConfigsBMgr
    aRootTypeNodeConfig_nodeConfig_attributeConfigsBMgr  =
    new com.dosmil_e.m3.browser.custommgrs.modelview.M3RootTypeNodeConfig_nodeConfig_attributeConfigsBMgr();

	public static com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfig_nodeConfig_attributeConfigsBMgr
    aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBMgr  =
    new com.dosmil_e.m3.browser.custommgrs.modelview.M3RelatedTypeNodeConfig_nodeConfig_attributeConfigsBMgr();


  public M3ModelViewTreeConfigFactory() {
  }


  public static EAIConfig getConfig( EAIMMCtxtIfc theCtxt) {
    if( theCtxt == null) { return null;}
    if( gConfig == null) {
      initConfig( theCtxt);
    }
    Class aClass = theCtxt.getClass();
    if( gCtxtClass == null || aClass != gCtxtClass) {
      gConfig    = null;
      gCtxtClass = null;
      initConfig( theCtxt);
    }

    return gConfig;
  }






  public static EAIConfig initConfig( EAIMMCtxtIfc theCtxt) {

    gConfig     = new EAIConfig( "M3ModelViewTreeConfigFactory");
    gCtxtClass  = theCtxt.getClass();

  /*******************************************************
   *  Root node configs
   *******************************************************/

		EAIClassRootNodeConfigIfc     aRootTraversalConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"), aTraversalConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootTraversalConfigRNC);

  /*******************************************************
   *  Node and Branch configs
   *******************************************************/

		EAINodeBranchesConfigIfc aTraversalConfigNBC  = new EAINodeBranchesConfig( aTraversalConfigNMgr);
//		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_rootTypeNodeConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aTraversalConfigNBC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_rootTypeNodeConfigsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_rootTypeNodeConfigsBMgr);
		aTraversalConfig_rootTypeNodeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig","traversal"), aRootTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_rootTypeNodeConfigsBCNC);

		EAINodeBranchesConfigIfc aParameterNBC  = new EAINodeBranchesConfig( aParameterNMgr);
		aParameterNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aParameterNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aParameterNBC);

		EAINodeBranchesConfigIfc aCommentNBC  = new EAINodeBranchesConfig( aCommentNMgr);
		aCommentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aCommentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aCommentNBC);

		EAIBranchClassNodesConfigIfc  aElement_parametersBCNC  = new EAIBranchClassNodesConfig( aElement_parametersBMgr);
		aElement_parametersBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Parameter","core"), aParameterNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_parametersBCNC);

		EAIBranchClassNodesConfigIfc  aElement_commentsBCNC  = new EAIBranchClassNodesConfig( aElement_commentsBMgr);
		aElement_commentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Comment","core"), aCommentNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_commentsBCNC);

		EAINodeBranchesConfigIfc aRootTypeNodeConfigNBC  = new EAINodeBranchesConfig( aRootTypeNodeConfigNMgr);
//		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRootTypeNodeConfig_nodeConfig_attributeConfigsBMgr, null));
		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRootTypeNodeConfig_nodeConfig_branchConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aRootTypeNodeConfigNBC);


		EAIBranchClassNodesConfigIfc  aRootTypeNodeConfig_nodeConfig_attributeConfigsBCNC  = new EAIBranchClassNodesConfig( aRootTypeNodeConfig_nodeConfig_attributeConfigsBMgr);
		aRootTypeNodeConfig_nodeConfig_attributeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRootTypeNodeConfig_nodeConfig_attributeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aRootTypeNodeConfig_nodeConfig_branchConfigsBCNC  = new EAIBranchClassNodesConfig( aRootTypeNodeConfig_nodeConfig_branchConfigsBMgr);
		aRootTypeNodeConfig_nodeConfig_branchConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRootTypeNodeConfig_nodeConfig_branchConfigsBCNC);


		EAINodeBranchesConfigIfc aBranchConfigNBC  = new EAINodeBranchesConfig( aBranchConfigNMgr);
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchConfig_typeNodeConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aBranchConfigNBC);

		EAIBranchClassNodesConfigIfc  aBranchConfig_typeNodeConfigsBCNC  = new EAIBranchClassNodesConfig( aBranchConfig_typeNodeConfigsBMgr);
		aBranchConfig_typeNodeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig","traversal"), aRelatedTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchConfig_typeNodeConfigsBCNC);

		EAINodeBranchesConfigIfc aRelatedTypeNodeConfigNBC  = new EAINodeBranchesConfig( aRelatedTypeNodeConfigNMgr);
//		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBMgr, null));
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelatedTypeNodeConfig_nodeConfig_branchConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aRelatedTypeNodeConfigNBC);

		EAIBranchClassNodesConfigIfc  aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBCNC  = new EAIBranchClassNodesConfig( aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBMgr);
		aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelatedTypeNodeConfig_nodeConfig_attributeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aRelatedTypeNodeConfig_nodeConfig_branchConfigsBCNC  = new EAIBranchClassNodesConfig( aRelatedTypeNodeConfig_nodeConfig_branchConfigsBMgr);
		aRelatedTypeNodeConfig_nodeConfig_branchConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelatedTypeNodeConfig_nodeConfig_branchConfigsBCNC);



		EAINodeBranchesConfigIfc aAttributeConfigNBC  = new EAINodeBranchesConfig( aAttributeConfigNMgr);
		gConfig.addNodeBranchesConfig( aAttributeConfigNBC);


    return gConfig;
  }

}



