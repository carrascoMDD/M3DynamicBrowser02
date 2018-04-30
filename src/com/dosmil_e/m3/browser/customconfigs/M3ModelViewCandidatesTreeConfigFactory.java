



package com.dosmil_e.m3.browser.customconfigs;

// WholeTreeConfigFactory

import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.tree.EAITreeModel;
import com.dosmil_e.browserbase.tree.EAITreeCellRenderer;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.modelbase.ifc.*;

import java.util.Hashtable;


public class M3ModelViewCandidatesTreeConfigFactory {

  public static EAIConfig     gConfig;
  public static Class         gCtxtClass;


  /*******************************************************
   *  Static members holding Node and Branch Managers
   *******************************************************/

	public static com.dosmil_e.m3.core.custommgrs.M3ModelNMgr aModelNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ModelNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Model_treeRootTypeBMgr aModel_treeRootTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Model_treeRootTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ModuleNMgr aModuleNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ModuleNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Module_subModulesBMgr aModule_subModulesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Module_subModulesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Module_typesBMgr aModule_typesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Module_typesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3TypeNMgr aTypeNMgr  = new com.dosmil_e.m3.core.custommgrs.M3TypeNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_attributesBMgr aType_attributesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_attributesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_superTypesBMgr aType_superTypesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_superTypesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_subTypesBMgr aType_subTypesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_subTypesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_relationshipsBMgr aType_relationshipsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_relationshipsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_relatedWithBMgr aType_relatedWithBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_relatedWithBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3RelationshipNMgr aRelationshipNMgr  = new com.dosmil_e.m3.core.custommgrs.M3RelationshipNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_relatedTypeBMgr aRelationship_relatedTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_relatedTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3StructuralFeatureNMgr aStructuralFeatureNMgr  = new com.dosmil_e.m3.core.custommgrs.M3StructuralFeatureNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3AttributeNMgr aAttributeNMgr  = new com.dosmil_e.m3.core.custommgrs.M3AttributeNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Attribute_valueTypeBMgr aAttribute_valueTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Attribute_valueTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr aParameterNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3CommentNMgr aCommentNMgr  = new com.dosmil_e.m3.core.custommgrs.M3CommentNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr aElement_parametersBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr aElement_commentsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr();



  public M3ModelViewCandidatesTreeConfigFactory() {
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

    gConfig     = new EAIConfig( "M3ModelViewCandidatesTreeConfigFactory");
    gCtxtClass  = theCtxt.getClass();

  /*******************************************************
   *  Root node configs
   *******************************************************/

		EAIClassRootNodeConfigIfc     aRootModelRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Model", "core"), aModelNMgr, null);
		gConfig.addClassRootNodeConfig( aRootModelRNC);

		EAIClassRootNodeConfigIfc     aRootModuleRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Module", "core"), aModuleNMgr, null);
		gConfig.addClassRootNodeConfig( aRootModuleRNC);

		EAIClassRootNodeConfigIfc     aRootTypeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type", "core"), aTypeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootTypeRNC);

		EAIClassRootNodeConfigIfc     aRootRelationshipRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship", "core"), aRelationshipNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRelationshipRNC);

		EAIClassRootNodeConfigIfc     aRootStructuralFeatureRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "StructuralFeature", "core"), aStructuralFeatureNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuralFeatureRNC);

		EAIClassRootNodeConfigIfc     aRootAttributeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute", "core"), aAttributeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAttributeRNC);

		EAIClassRootNodeConfigIfc     aRootParameterRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Parameter", "core"), aParameterNMgr, null);
		gConfig.addClassRootNodeConfig( aRootParameterRNC);

		EAIClassRootNodeConfigIfc     aRootCommentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Comment", "core"), aCommentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCommentRNC);



  /*******************************************************
   *  Node and Branch configs
   *******************************************************/

		EAINodeBranchesConfigIfc aModelNBC  = new EAINodeBranchesConfig( aModelNMgr);
//		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_subModulesBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModel_treeRootTypeBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_typesBMgr, null));
		gConfig.addNodeBranchesConfig( aModelNBC);

		EAIBranchClassNodesConfigIfc  aModel_treeRootTypeBCNC  = new EAIBranchClassNodesConfig( aModel_treeRootTypeBMgr);
		aModel_treeRootTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModel_treeRootTypeBCNC);

		EAINodeBranchesConfigIfc aModuleNBC  = new EAINodeBranchesConfig( aModuleNMgr);
//		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_subModulesBMgr, null));
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_typesBMgr, null));
		gConfig.addNodeBranchesConfig( aModuleNBC);

		EAIBranchClassNodesConfigIfc  aModule_subModulesBCNC  = new EAIBranchClassNodesConfig( aModule_subModulesBMgr);
		aModule_subModulesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Module","core"), aModuleNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModule_subModulesBCNC);

		EAIBranchClassNodesConfigIfc  aModule_typesBCNC  = new EAIBranchClassNodesConfig( aModule_typesBMgr);
		aModule_typesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModule_typesBCNC);

		EAINodeBranchesConfigIfc aTypeNBC  = new EAINodeBranchesConfig( aTypeNMgr);
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_attributesBMgr, null));
//		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_relationshipsBMgr, null));
//		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_subTypesBMgr, null));
//		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_superTypesBMgr, null));
		gConfig.addNodeBranchesConfig( aTypeNBC);

		EAIBranchClassNodesConfigIfc  aType_attributesBCNC  = new EAIBranchClassNodesConfig( aType_attributesBMgr);
		aType_attributesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_attributesBCNC);

		EAIBranchClassNodesConfigIfc  aType_superTypesBCNC  = new EAIBranchClassNodesConfig( aType_superTypesBMgr);
		aType_superTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_superTypesBCNC);

		EAIBranchClassNodesConfigIfc  aType_subTypesBCNC  = new EAIBranchClassNodesConfig( aType_subTypesBMgr);
		aType_subTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_subTypesBCNC);

		EAIBranchClassNodesConfigIfc  aType_relationshipsBCNC  = new EAIBranchClassNodesConfig( aType_relationshipsBMgr);
		aType_relationshipsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_relationshipsBCNC);

		EAINodeBranchesConfigIfc aRelationshipNBC  = new EAINodeBranchesConfig( aRelationshipNMgr);
//		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_relatedTypeBMgr, null));
		gConfig.addNodeBranchesConfig( aRelationshipNBC);

		EAIBranchClassNodesConfigIfc  aRelationship_relatedTypeBCNC  = new EAIBranchClassNodesConfig( aRelationship_relatedTypeBMgr);
		aRelationship_relatedTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_relatedTypeBCNC);

		EAINodeBranchesConfigIfc aStructuralFeatureNBC  = new EAINodeBranchesConfig( aStructuralFeatureNMgr);
//		aStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuralFeatureNBC);

		EAINodeBranchesConfigIfc aAttributeNBC  = new EAINodeBranchesConfig( aAttributeNMgr);
//		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
//		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttribute_valueTypeBMgr, null));
		gConfig.addNodeBranchesConfig( aAttributeNBC);

		EAIBranchClassNodesConfigIfc  aAttribute_valueTypeBCNC  = new EAIBranchClassNodesConfig( aAttribute_valueTypeBMgr);
		aAttribute_valueTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttribute_valueTypeBCNC);

		EAINodeBranchesConfigIfc aParameterNBC  = new EAINodeBranchesConfig( aParameterNMgr);
		gConfig.addNodeBranchesConfig( aParameterNBC);

		EAINodeBranchesConfigIfc aCommentNBC  = new EAINodeBranchesConfig( aCommentNMgr);
		gConfig.addNodeBranchesConfig( aCommentNBC);

		EAIBranchClassNodesConfigIfc  aElement_parametersBCNC  = new EAIBranchClassNodesConfig( aElement_parametersBMgr);
		aElement_parametersBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Parameter","core"), aParameterNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_parametersBCNC);

		EAIBranchClassNodesConfigIfc  aElement_commentsBCNC  = new EAIBranchClassNodesConfig( aElement_commentsBMgr);
		aElement_commentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Comment","core"), aCommentNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_commentsBCNC);




    return gConfig;
  }

}
