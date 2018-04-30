package com.dosmil_e.m3.browser.customconfigs;

// WholeTreeConfigFactory

import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.tree.EAITreeModel;
import com.dosmil_e.browserbase.tree.EAITreeCellRenderer;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.modelbase.ifc.*;

import java.util.Hashtable;


public class M3ModelTreeConfigFactory {

  public static EAIConfig     gConfig;
  public static Class         gCtxtClass;


  /*******************************************************
   *  Static members holding Node and Branch Managers
   *******************************************************/

	public static com.dosmil_e.m3.core.custommgrs.M3ModelNMgr aModelNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ModelNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Model_treeRootTypeBMgr aModel_treeRootTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Model_treeRootTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Model_traversalConfigsBMgr aModel_traversalConfigsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Model_traversalConfigsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ModuleNMgr aModuleNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ModuleNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Module_subModulesBMgr aModule_subModulesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Module_subModulesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Module_typesBMgr aModule_typesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Module_typesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3TypeNMgr aTypeNMgr  = new com.dosmil_e.m3.core.custommgrs.M3TypeNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFmetaTypeBMgr aType_inverseOFmetaTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFmetaTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_inverse1OFmetaTypeBMgr aType_inverse1OFmetaTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_inverse1OFmetaTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFreplicatedMetaTypeBMgr aType_inverseOFreplicatedMetaTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFreplicatedMetaTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFprojectionTypeBMgr aType_inverseOFprojectionTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFprojectionTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFexclusionTypeBMgr aType_inverseOFexclusionTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_inverseOFexclusionTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_attributesBMgr aType_attributesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_attributesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_typeOfValuesBMgr aType_typeOfValuesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_typeOfValuesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_superTypesBMgr aType_superTypesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_superTypesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_subTypesBMgr aType_subTypesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_subTypesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_relationshipsBMgr aType_relationshipsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_relationshipsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_relatedWithBMgr aType_relatedWithBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_relatedWithBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Type_rootTypeOfModelBMgr aType_rootTypeOfModelBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Type_rootTypeOfModelBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3RelationshipNMgr aRelationshipNMgr  = new com.dosmil_e.m3.core.custommgrs.M3RelationshipNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFmetaRelationshipBMgr aRelationship_inverseOFmetaRelationshipBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFmetaRelationshipBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFreplicatedMetaRelationshipBMgr aRelationship_inverseOFreplicatedMetaRelationshipBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFreplicatedMetaRelationshipBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtargetToTransfomationsBMgr aRelationship_inverseOFtargetToTransfomationsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtargetToTransfomationsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFprojectionToOriginalsBMgr aRelationship_inverseOFprojectionToOriginalsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFprojectionToOriginalsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFprojectedToProjectionsBMgr aRelationship_inverseOFprojectedToProjectionsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFprojectedToProjectionsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtransformationToSourcesBMgr aRelationship_inverseOFtransformationToSourcesBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtransformationToSourcesBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtransformationToSubTransformationsBMgr aRelationship_inverseOFtransformationToSubTransformationsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseOFtransformationToSubTransformationsBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseBMgr aRelationship_inverseBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_inverseBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Relationship_relatedTypeBMgr aRelationship_relatedTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Relationship_relatedTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3StructuralFeatureNMgr aStructuralFeatureNMgr  = new com.dosmil_e.m3.core.custommgrs.M3StructuralFeatureNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3AttributeNMgr aAttributeNMgr  = new com.dosmil_e.m3.core.custommgrs.M3AttributeNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFmetaAttributeBMgr aAttribute_inverseOFmetaAttributeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFmetaAttributeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFcopiedMetaAttributeBMgr aAttribute_inverseOFcopiedMetaAttributeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFcopiedMetaAttributeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFexcludedInRelationshipNamedBMgr aAttribute_inverseOFexcludedInRelationshipNamedBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Attribute_inverseOFexcludedInRelationshipNamedBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Attribute_valueTypeBMgr aAttribute_valueTypeBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Attribute_valueTypeBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr aParameterNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ParameterNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3CommentNMgr aCommentNMgr  = new com.dosmil_e.m3.core.custommgrs.M3CommentNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3ElementNMgr aElementNMgr  = new com.dosmil_e.m3.core.custommgrs.M3ElementNMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr aElement_parametersBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_parametersBMgr();

	public static com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr aElement_commentsBMgr  = new com.dosmil_e.m3.core.custommgrs.M3Element_commentsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3RootTypeNodeConfigNMgr aRootTypeNodeConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3RootTypeNodeConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfigNMgr aNodeConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_branchConfigsBMgr aNodeConfig_branchConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_branchConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_attributeConfigsBMgr aNodeConfig_attributeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_attributeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_metaTypeBMgr aNodeConfig_metaTypeBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_metaTypeBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_metaNodeMgrBMgr aNodeConfig_metaNodeMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_metaNodeMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_inverseOFnodeConfigBMgr aNodeConfig_inverseOFnodeConfigBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeConfig_inverseOFnodeConfigBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchConfigNMgr aBranchConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_inverseOFbranchConfigsBMgr aBranchConfig_inverseOFbranchConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_inverseOFbranchConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_metaRelationshipBMgr aBranchConfig_metaRelationshipBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_metaRelationshipBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_typeNodeConfigsBMgr aBranchConfig_typeNodeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_typeNodeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_metaBranchMgrBMgr aBranchConfig_metaBranchMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchConfig_metaBranchMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TypeNodeConfig_metaTypeBMgr aTypeNodeConfig_metaTypeBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TypeNodeConfig_metaTypeBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TypeNodeConfig_nodeConfigBMgr aTypeNodeConfig_nodeConfigBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TypeNodeConfig_nodeConfigBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3RelatedTypeNodeConfigNMgr aRelatedTypeNodeConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3RelatedTypeNodeConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3RelatedTypeNodeConfig_filterBMgr aRelatedTypeNodeConfig_filterBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3RelatedTypeNodeConfig_filterBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfigNMgr aTraversalConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_rootTypeNodeConfigsBMgr aTraversalConfig_rootTypeNodeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_rootTypeNodeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_branchConfigsBMgr aTraversalConfig_branchConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_branchConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_nodeConfigsBMgr aTraversalConfig_nodeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_nodeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_attributeConfigsBMgr aTraversalConfig_attributeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_attributeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_configOverridesBMgr aTraversalConfig_configOverridesBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_configOverridesBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_fieldMgrsBMgr aTraversalConfig_fieldMgrsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_fieldMgrsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_branchMgrsBMgr aTraversalConfig_branchMgrsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_branchMgrsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_nodeMgrsBMgr aTraversalConfig_nodeMgrsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3TraversalConfig_nodeMgrsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfigNMgr aAttributeConfigNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfigNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_inverseOFattributeConfigsBMgr aAttributeConfig_inverseOFattributeConfigsBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_inverseOFattributeConfigsBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_metaAttributeBMgr aAttributeConfig_metaAttributeBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_metaAttributeBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_metaFieldMgrBMgr aAttributeConfig_metaFieldMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3AttributeConfig_metaFieldMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3ConfigOverride_overrideWithBMgr aConfigOverride_overrideWithBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3ConfigOverride_overrideWithBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeMgrNMgr aNodeMgrNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeMgrNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3NodeMgr_inverseOFmetaNodeMgrBMgr aNodeMgr_inverseOFmetaNodeMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3NodeMgr_inverseOFmetaNodeMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchMgrNMgr aBranchMgrNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchMgrNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3BranchMgr_inverseOFmetaBranchMgrBMgr aBranchMgr_inverseOFmetaBranchMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3BranchMgr_inverseOFmetaBranchMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3FieldMgrNMgr aFieldMgrNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3FieldMgrNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3FieldMgr_inverseOFmetaFieldMgrBMgr aFieldMgr_inverseOFmetaFieldMgrBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3FieldMgr_inverseOFmetaFieldMgrBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3CopyFieldMgrNMgr aCopyFieldMgrNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3CopyFieldMgrNMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3CopyFieldMgr_copiedMetaAttributeBMgr aCopyFieldMgr_copiedMetaAttributeBMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3CopyFieldMgr_copiedMetaAttributeBMgr();

	public static com.dosmil_e.m3.traversal.custommgrs.M3FilterNMgr aFilterNMgr  = new com.dosmil_e.m3.traversal.custommgrs.M3FilterNMgr();

	public static com.dosmil_e.m3.replication.custommgrs.M3ReplicateBranchMgrNMgr aReplicateBranchMgrNMgr  = new com.dosmil_e.m3.replication.custommgrs.M3ReplicateBranchMgrNMgr();

	public static com.dosmil_e.m3.replication.custommgrs.M3ReplicateBranchMgr_replicatedMetaRelationshipBMgr aReplicateBranchMgr_replicatedMetaRelationshipBMgr  = new com.dosmil_e.m3.replication.custommgrs.M3ReplicateBranchMgr_replicatedMetaRelationshipBMgr();

	public static com.dosmil_e.m3.replication.custommgrs.M3ReplicateNodeMgrNMgr aReplicateNodeMgrNMgr  = new com.dosmil_e.m3.replication.custommgrs.M3ReplicateNodeMgrNMgr();

	public static com.dosmil_e.m3.replication.custommgrs.M3ReplicateNodeMgr_replicatedMetaTypeBMgr aReplicateNodeMgr_replicatedMetaTypeBMgr  = new com.dosmil_e.m3.replication.custommgrs.M3ReplicateNodeMgr_replicatedMetaTypeBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfigNMgr aProjectionConfigNMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfigNMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_targetToTransfomationsBMgr aProjectionConfig_targetToTransfomationsBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_targetToTransfomationsBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectionToOriginalsBMgr aProjectionConfig_projectionToOriginalsBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectionToOriginalsBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectedToProjectionsBMgr aProjectionConfig_projectedToProjectionsBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectedToProjectionsBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_transformationToSourcesBMgr aProjectionConfig_transformationToSourcesBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_transformationToSourcesBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_transformationToSubTransformationsBMgr aProjectionConfig_transformationToSubTransformationsBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_transformationToSubTransformationsBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectionTypeBMgr aProjectionConfig_projectionTypeBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_projectionTypeBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_exclusionTypeBMgr aProjectionConfig_exclusionTypeBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_exclusionTypeBMgr();

	public static com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_excludedInRelationshipNamedBMgr aProjectionConfig_excludedInRelationshipNamedBMgr  = new com.dosmil_e.m3.projection.custommgrs.M3ProjectionConfig_excludedInRelationshipNamedBMgr();



  public M3ModelTreeConfigFactory() {
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

    gConfig     = new EAIConfig( "M3ModelTreeConfigFactory");
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

		EAIClassRootNodeConfigIfc     aRootElementRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Element", "core"), aElementNMgr, null);
		gConfig.addClassRootNodeConfig( aRootElementRNC);

		EAIClassRootNodeConfigIfc     aRootRootTypeNodeConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig", "traversal"), aRootTypeNodeConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRootTypeNodeConfigRNC);

		EAIClassRootNodeConfigIfc     aRootNodeConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig", "traversal"), aNodeConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootNodeConfigRNC);

		EAIClassRootNodeConfigIfc     aRootBranchConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig", "traversal"), aBranchConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootBranchConfigRNC);

		EAIClassRootNodeConfigIfc     aRootRelatedTypeNodeConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig", "traversal"), aRelatedTypeNodeConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRelatedTypeNodeConfigRNC);

		EAIClassRootNodeConfigIfc     aRootTraversalConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"), aTraversalConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootTraversalConfigRNC);

		EAIClassRootNodeConfigIfc     aRootAttributeConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig", "traversal"), aAttributeConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAttributeConfigRNC);

		EAIClassRootNodeConfigIfc     aRootNodeMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeMgr", "traversal"), aNodeMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootNodeMgrRNC);

		EAIClassRootNodeConfigIfc     aRootBranchMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchMgr", "traversal"), aBranchMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootBranchMgrRNC);

		EAIClassRootNodeConfigIfc     aRootFieldMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "FieldMgr", "traversal"), aFieldMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootFieldMgrRNC);

		EAIClassRootNodeConfigIfc     aRootCopyFieldMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "CopyFieldMgr", "traversal"), aCopyFieldMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCopyFieldMgrRNC);

		EAIClassRootNodeConfigIfc     aRootFilterRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Filter", "traversal"), aFilterNMgr, null);
		gConfig.addClassRootNodeConfig( aRootFilterRNC);

		EAIClassRootNodeConfigIfc     aRootReplicateBranchMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateBranchMgr", "replication"), aReplicateBranchMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootReplicateBranchMgrRNC);

		EAIClassRootNodeConfigIfc     aRootReplicateNodeMgrRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateNodeMgr", "replication"), aReplicateNodeMgrNMgr, null);
		gConfig.addClassRootNodeConfig( aRootReplicateNodeMgrRNC);

		EAIClassRootNodeConfigIfc     aRootProjectionConfigRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig", "projection"), aProjectionConfigNMgr, null);
		gConfig.addClassRootNodeConfig( aRootProjectionConfigRNC);




  /*******************************************************
   *  Node and Branch configs
   *******************************************************/

		EAINodeBranchesConfigIfc aModelNBC  = new EAINodeBranchesConfig( aModelNMgr);
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_subModulesBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModel_traversalConfigsBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModel_treeRootTypeBMgr, null));
		aModelNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_typesBMgr, null));
		gConfig.addNodeBranchesConfig( aModelNBC);

		EAIBranchClassNodesConfigIfc  aModel_treeRootTypeBCNC  = new EAIBranchClassNodesConfig( aModel_treeRootTypeBMgr);
		aModel_treeRootTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModel_treeRootTypeBCNC);

		EAIBranchClassNodesConfigIfc  aModel_traversalConfigsBCNC  = new EAIBranchClassNodesConfig( aModel_traversalConfigsBMgr);
		aModel_traversalConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig","traversal"), aTraversalConfigNMgr, null ));
		aModel_traversalConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModel_traversalConfigsBCNC);

		EAINodeBranchesConfigIfc aModuleNBC  = new EAINodeBranchesConfig( aModuleNMgr);
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_subModulesBMgr, null));
		aModuleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aModule_typesBMgr, null));
		gConfig.addNodeBranchesConfig( aModuleNBC);

		EAIBranchClassNodesConfigIfc  aModule_subModulesBCNC  = new EAIBranchClassNodesConfig( aModule_subModulesBMgr);
		aModule_subModulesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Module","core"), aModuleNMgr, null ));
		aModule_subModulesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Model","core"), aModelNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModule_subModulesBCNC);

		EAIBranchClassNodesConfigIfc  aModule_typesBCNC  = new EAIBranchClassNodesConfig( aModule_typesBMgr);
		aModule_typesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aModule_typesBCNC);

		EAINodeBranchesConfigIfc aTypeNBC  = new EAINodeBranchesConfig( aTypeNMgr);
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_attributesBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_inverse1OFmetaTypeBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_inverseOFexclusionTypeBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_inverseOFmetaTypeBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_inverseOFprojectionTypeBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_inverseOFreplicatedMetaTypeBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_relatedWithBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_relationshipsBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_rootTypeOfModelBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_subTypesBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_superTypesBMgr, null));
		aTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aType_typeOfValuesBMgr, null));
		gConfig.addNodeBranchesConfig( aTypeNBC);

		EAIBranchClassNodesConfigIfc  aType_inverseOFmetaTypeBCNC  = new EAIBranchClassNodesConfig( aType_inverseOFmetaTypeBMgr);
		aType_inverseOFmetaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_inverseOFmetaTypeBCNC);

		EAIBranchClassNodesConfigIfc  aType_inverse1OFmetaTypeBCNC  = new EAIBranchClassNodesConfig( aType_inverse1OFmetaTypeBMgr);
		aType_inverse1OFmetaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig","traversal"), aRootTypeNodeConfigNMgr, null ));
		aType_inverse1OFmetaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig","traversal"), aRelatedTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_inverse1OFmetaTypeBCNC);

		EAIBranchClassNodesConfigIfc  aType_inverseOFreplicatedMetaTypeBCNC  = new EAIBranchClassNodesConfig( aType_inverseOFreplicatedMetaTypeBMgr);
		aType_inverseOFreplicatedMetaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateNodeMgr","replication"), aReplicateNodeMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_inverseOFreplicatedMetaTypeBCNC);

		EAIBranchClassNodesConfigIfc  aType_inverseOFprojectionTypeBCNC  = new EAIBranchClassNodesConfig( aType_inverseOFprojectionTypeBMgr);
		aType_inverseOFprojectionTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_inverseOFprojectionTypeBCNC);

		EAIBranchClassNodesConfigIfc  aType_inverseOFexclusionTypeBCNC  = new EAIBranchClassNodesConfig( aType_inverseOFexclusionTypeBMgr);
		aType_inverseOFexclusionTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_inverseOFexclusionTypeBCNC);

		EAIBranchClassNodesConfigIfc  aType_attributesBCNC  = new EAIBranchClassNodesConfig( aType_attributesBMgr);
		aType_attributesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_attributesBCNC);

		EAIBranchClassNodesConfigIfc  aType_typeOfValuesBCNC  = new EAIBranchClassNodesConfig( aType_typeOfValuesBMgr);
		aType_typeOfValuesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_typeOfValuesBCNC);

		EAIBranchClassNodesConfigIfc  aType_superTypesBCNC  = new EAIBranchClassNodesConfig( aType_superTypesBMgr);
		aType_superTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_superTypesBCNC);

		EAIBranchClassNodesConfigIfc  aType_subTypesBCNC  = new EAIBranchClassNodesConfig( aType_subTypesBMgr);
		aType_subTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_subTypesBCNC);

		EAIBranchClassNodesConfigIfc  aType_relationshipsBCNC  = new EAIBranchClassNodesConfig( aType_relationshipsBMgr);
		aType_relationshipsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_relationshipsBCNC);

		EAIBranchClassNodesConfigIfc  aType_relatedWithBCNC  = new EAIBranchClassNodesConfig( aType_relatedWithBMgr);
		aType_relatedWithBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_relatedWithBCNC);

		EAIBranchClassNodesConfigIfc  aType_rootTypeOfModelBCNC  = new EAIBranchClassNodesConfig( aType_rootTypeOfModelBMgr);
		aType_rootTypeOfModelBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Model","core"), aModelNMgr, null ));
		gConfig.addBranchClassNodesConfig( aType_rootTypeOfModelBCNC);

		EAINodeBranchesConfigIfc aRelationshipNBC  = new EAINodeBranchesConfig( aRelationshipNMgr);
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFmetaRelationshipBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFprojectedToProjectionsBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFprojectionToOriginalsBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFreplicatedMetaRelationshipBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFtargetToTransfomationsBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFtransformationToSourcesBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_inverseOFtransformationToSubTransformationsBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aRelationshipNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelationship_relatedTypeBMgr, null));
		gConfig.addNodeBranchesConfig( aRelationshipNBC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFmetaRelationshipBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFmetaRelationshipBMgr);
		aRelationship_inverseOFmetaRelationshipBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFmetaRelationshipBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFreplicatedMetaRelationshipBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFreplicatedMetaRelationshipBMgr);
		aRelationship_inverseOFreplicatedMetaRelationshipBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateBranchMgr","replication"), aReplicateBranchMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFreplicatedMetaRelationshipBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFtargetToTransfomationsBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFtargetToTransfomationsBMgr);
		aRelationship_inverseOFtargetToTransfomationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFtargetToTransfomationsBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFprojectionToOriginalsBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFprojectionToOriginalsBMgr);
		aRelationship_inverseOFprojectionToOriginalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFprojectionToOriginalsBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFprojectedToProjectionsBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFprojectedToProjectionsBMgr);
		aRelationship_inverseOFprojectedToProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFprojectedToProjectionsBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFtransformationToSourcesBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFtransformationToSourcesBMgr);
		aRelationship_inverseOFtransformationToSourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFtransformationToSourcesBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseOFtransformationToSubTransformationsBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseOFtransformationToSubTransformationsBMgr);
		aRelationship_inverseOFtransformationToSubTransformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseOFtransformationToSubTransformationsBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_inverseBCNC  = new EAIBranchClassNodesConfig( aRelationship_inverseBMgr);
		aRelationship_inverseBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_inverseBCNC);

		EAIBranchClassNodesConfigIfc  aRelationship_relatedTypeBCNC  = new EAIBranchClassNodesConfig( aRelationship_relatedTypeBMgr);
		aRelationship_relatedTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelationship_relatedTypeBCNC);

		EAINodeBranchesConfigIfc aStructuralFeatureNBC  = new EAINodeBranchesConfig( aStructuralFeatureNMgr);
		aStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuralFeatureNBC);

		EAINodeBranchesConfigIfc aAttributeNBC  = new EAINodeBranchesConfig( aAttributeNMgr);
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttribute_inverseOFcopiedMetaAttributeBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttribute_inverseOFexcludedInRelationshipNamedBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttribute_inverseOFmetaAttributeBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttribute_valueTypeBMgr, null));
		gConfig.addNodeBranchesConfig( aAttributeNBC);

		EAIBranchClassNodesConfigIfc  aAttribute_inverseOFmetaAttributeBCNC  = new EAIBranchClassNodesConfig( aAttribute_inverseOFmetaAttributeBMgr);
		aAttribute_inverseOFmetaAttributeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttribute_inverseOFmetaAttributeBCNC);

		EAIBranchClassNodesConfigIfc  aAttribute_inverseOFcopiedMetaAttributeBCNC  = new EAIBranchClassNodesConfig( aAttribute_inverseOFcopiedMetaAttributeBMgr);
		aAttribute_inverseOFcopiedMetaAttributeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "CopyFieldMgr","traversal"), aCopyFieldMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttribute_inverseOFcopiedMetaAttributeBCNC);

		EAIBranchClassNodesConfigIfc  aAttribute_inverseOFexcludedInRelationshipNamedBCNC  = new EAIBranchClassNodesConfig( aAttribute_inverseOFexcludedInRelationshipNamedBMgr);
		aAttribute_inverseOFexcludedInRelationshipNamedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttribute_inverseOFexcludedInRelationshipNamedBCNC);

		EAIBranchClassNodesConfigIfc  aAttribute_valueTypeBCNC  = new EAIBranchClassNodesConfig( aAttribute_valueTypeBMgr);
		aAttribute_valueTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttribute_valueTypeBCNC);

		EAINodeBranchesConfigIfc aParameterNBC  = new EAINodeBranchesConfig( aParameterNMgr);
		aParameterNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aParameterNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aParameterNBC);

		EAINodeBranchesConfigIfc aCommentNBC  = new EAINodeBranchesConfig( aCommentNMgr);
		aCommentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aCommentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aCommentNBC);

		EAINodeBranchesConfigIfc aElementNBC  = new EAINodeBranchesConfig( aElementNMgr);
		aElementNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_commentsBMgr, null));
		aElementNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aElement_parametersBMgr, null));
		gConfig.addNodeBranchesConfig( aElementNBC);

		EAIBranchClassNodesConfigIfc  aElement_parametersBCNC  = new EAIBranchClassNodesConfig( aElement_parametersBMgr);
		aElement_parametersBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Parameter","core"), aParameterNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_parametersBCNC);

		EAIBranchClassNodesConfigIfc  aElement_commentsBCNC  = new EAIBranchClassNodesConfig( aElement_commentsBMgr);
		aElement_commentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Comment","core"), aCommentNMgr, null ));
		gConfig.addBranchClassNodesConfig( aElement_commentsBCNC);

		EAINodeBranchesConfigIfc aRootTypeNodeConfigNBC  = new EAINodeBranchesConfig( aRootTypeNodeConfigNMgr);
		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTypeNodeConfig_metaTypeBMgr, null));
		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTypeNodeConfig_nodeConfigBMgr, null));
		aRootTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aConfigOverride_overrideWithBMgr, null));
		gConfig.addNodeBranchesConfig( aRootTypeNodeConfigNBC);

		EAINodeBranchesConfigIfc aNodeConfigNBC  = new EAINodeBranchesConfig( aNodeConfigNMgr);
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeConfig_attributeConfigsBMgr, null));
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeConfig_branchConfigsBMgr, null));
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeConfig_inverseOFnodeConfigBMgr, null));
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeConfig_metaNodeMgrBMgr, null));
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeConfig_metaTypeBMgr, null));
		aNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aConfigOverride_overrideWithBMgr, null));
		gConfig.addNodeBranchesConfig( aNodeConfigNBC);

		EAIBranchClassNodesConfigIfc  aNodeConfig_branchConfigsBCNC  = new EAIBranchClassNodesConfig( aNodeConfig_branchConfigsBMgr);
		aNodeConfig_branchConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeConfig_branchConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aNodeConfig_attributeConfigsBCNC  = new EAIBranchClassNodesConfig( aNodeConfig_attributeConfigsBMgr);
		aNodeConfig_attributeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeConfig_attributeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aNodeConfig_metaTypeBCNC  = new EAIBranchClassNodesConfig( aNodeConfig_metaTypeBMgr);
		aNodeConfig_metaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeConfig_metaTypeBCNC);

		EAIBranchClassNodesConfigIfc  aNodeConfig_metaNodeMgrBCNC  = new EAIBranchClassNodesConfig( aNodeConfig_metaNodeMgrBMgr);
		aNodeConfig_metaNodeMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeMgr","traversal"), aNodeMgrNMgr, null ));
		aNodeConfig_metaNodeMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateNodeMgr","replication"), aReplicateNodeMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeConfig_metaNodeMgrBCNC);

		EAIBranchClassNodesConfigIfc  aNodeConfig_inverseOFnodeConfigBCNC  = new EAIBranchClassNodesConfig( aNodeConfig_inverseOFnodeConfigBMgr);
		aNodeConfig_inverseOFnodeConfigBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig","traversal"), aRootTypeNodeConfigNMgr, null ));
		aNodeConfig_inverseOFnodeConfigBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig","traversal"), aRelatedTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeConfig_inverseOFnodeConfigBCNC);

		EAINodeBranchesConfigIfc aBranchConfigNBC  = new EAINodeBranchesConfig( aBranchConfigNMgr);
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchConfig_inverseOFbranchConfigsBMgr, null));
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchConfig_metaBranchMgrBMgr, null));
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchConfig_metaRelationshipBMgr, null));
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aConfigOverride_overrideWithBMgr, null));
		aBranchConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchConfig_typeNodeConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aBranchConfigNBC);

		EAIBranchClassNodesConfigIfc  aBranchConfig_inverseOFbranchConfigsBCNC  = new EAIBranchClassNodesConfig( aBranchConfig_inverseOFbranchConfigsBMgr);
		aBranchConfig_inverseOFbranchConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchConfig_inverseOFbranchConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aBranchConfig_metaRelationshipBCNC  = new EAIBranchClassNodesConfig( aBranchConfig_metaRelationshipBMgr);
		aBranchConfig_metaRelationshipBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchConfig_metaRelationshipBCNC);

		EAIBranchClassNodesConfigIfc  aBranchConfig_typeNodeConfigsBCNC  = new EAIBranchClassNodesConfig( aBranchConfig_typeNodeConfigsBMgr);
		aBranchConfig_typeNodeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig","traversal"), aRelatedTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchConfig_typeNodeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aBranchConfig_metaBranchMgrBCNC  = new EAIBranchClassNodesConfig( aBranchConfig_metaBranchMgrBMgr);
		aBranchConfig_metaBranchMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchMgr","traversal"), aBranchMgrNMgr, null ));
		aBranchConfig_metaBranchMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateBranchMgr","replication"), aReplicateBranchMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchConfig_metaBranchMgrBCNC);

		EAIBranchClassNodesConfigIfc  aTypeNodeConfig_metaTypeBCNC  = new EAIBranchClassNodesConfig( aTypeNodeConfig_metaTypeBMgr);
		aTypeNodeConfig_metaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTypeNodeConfig_metaTypeBCNC);

		EAIBranchClassNodesConfigIfc  aTypeNodeConfig_nodeConfigBCNC  = new EAIBranchClassNodesConfig( aTypeNodeConfig_nodeConfigBMgr);
		aTypeNodeConfig_nodeConfigBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTypeNodeConfig_nodeConfigBCNC);

		EAINodeBranchesConfigIfc aRelatedTypeNodeConfigNBC  = new EAINodeBranchesConfig( aRelatedTypeNodeConfigNMgr);
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aRelatedTypeNodeConfig_filterBMgr, null));
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTypeNodeConfig_metaTypeBMgr, null));
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTypeNodeConfig_nodeConfigBMgr, null));
		aRelatedTypeNodeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aConfigOverride_overrideWithBMgr, null));
		gConfig.addNodeBranchesConfig( aRelatedTypeNodeConfigNBC);

		EAIBranchClassNodesConfigIfc  aRelatedTypeNodeConfig_filterBCNC  = new EAIBranchClassNodesConfig( aRelatedTypeNodeConfig_filterBMgr);
		aRelatedTypeNodeConfig_filterBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Filter","traversal"), aFilterNMgr, null ));
		gConfig.addBranchClassNodesConfig( aRelatedTypeNodeConfig_filterBCNC);

		EAINodeBranchesConfigIfc aTraversalConfigNBC  = new EAINodeBranchesConfig( aTraversalConfigNMgr);
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_attributeConfigsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_branchConfigsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_branchMgrsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_configOverridesBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_fieldMgrsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_nodeConfigsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_nodeMgrsBMgr, null));
		aTraversalConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_rootTypeNodeConfigsBMgr, null));
		gConfig.addNodeBranchesConfig( aTraversalConfigNBC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_rootTypeNodeConfigsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_rootTypeNodeConfigsBMgr);
		aTraversalConfig_rootTypeNodeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig","traversal"), aRootTypeNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_rootTypeNodeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_branchConfigsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_branchConfigsBMgr);
		aTraversalConfig_branchConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_branchConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_nodeConfigsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_nodeConfigsBMgr);
		aTraversalConfig_nodeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_nodeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_attributeConfigsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_attributeConfigsBMgr);
		aTraversalConfig_attributeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_attributeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_configOverridesBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_configOverridesBMgr);
		aTraversalConfig_configOverridesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RootTypeNodeConfig","traversal"), aRootTypeNodeConfigNMgr, null ));
		aTraversalConfig_configOverridesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "RelatedTypeNodeConfig","traversal"), aRelatedTypeNodeConfigNMgr, null ));
		aTraversalConfig_configOverridesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		aTraversalConfig_configOverridesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_configOverridesBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_fieldMgrsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_fieldMgrsBMgr);
		aTraversalConfig_fieldMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "FieldMgr","traversal"), aFieldMgrNMgr, null ));
		aTraversalConfig_fieldMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "CopyFieldMgr","traversal"), aCopyFieldMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_fieldMgrsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_branchMgrsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_branchMgrsBMgr);
		aTraversalConfig_branchMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchMgr","traversal"), aBranchMgrNMgr, null ));
		aTraversalConfig_branchMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateBranchMgr","replication"), aReplicateBranchMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_branchMgrsBCNC);

		EAIBranchClassNodesConfigIfc  aTraversalConfig_nodeMgrsBCNC  = new EAIBranchClassNodesConfig( aTraversalConfig_nodeMgrsBMgr);
		aTraversalConfig_nodeMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeMgr","traversal"), aNodeMgrNMgr, null ));
		aTraversalConfig_nodeMgrsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ReplicateNodeMgr","replication"), aReplicateNodeMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTraversalConfig_nodeMgrsBCNC);

		EAINodeBranchesConfigIfc aAttributeConfigNBC  = new EAINodeBranchesConfig( aAttributeConfigNMgr);
		aAttributeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttributeConfig_inverseOFattributeConfigsBMgr, null));
		aAttributeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttributeConfig_metaAttributeBMgr, null));
		aAttributeConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAttributeConfig_metaFieldMgrBMgr, null));
		gConfig.addNodeBranchesConfig( aAttributeConfigNBC);

		EAIBranchClassNodesConfigIfc  aAttributeConfig_inverseOFattributeConfigsBCNC  = new EAIBranchClassNodesConfig( aAttributeConfig_inverseOFattributeConfigsBMgr);
		aAttributeConfig_inverseOFattributeConfigsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttributeConfig_inverseOFattributeConfigsBCNC);

		EAIBranchClassNodesConfigIfc  aAttributeConfig_metaAttributeBCNC  = new EAIBranchClassNodesConfig( aAttributeConfig_metaAttributeBMgr);
		aAttributeConfig_metaAttributeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttributeConfig_metaAttributeBCNC);

		EAIBranchClassNodesConfigIfc  aAttributeConfig_metaFieldMgrBCNC  = new EAIBranchClassNodesConfig( aAttributeConfig_metaFieldMgrBMgr);
		aAttributeConfig_metaFieldMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "FieldMgr","traversal"), aFieldMgrNMgr, null ));
		aAttributeConfig_metaFieldMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "CopyFieldMgr","traversal"), aCopyFieldMgrNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAttributeConfig_metaFieldMgrBCNC);

		EAIBranchClassNodesConfigIfc  aConfigOverride_overrideWithBCNC  = new EAIBranchClassNodesConfig( aConfigOverride_overrideWithBMgr);
		aConfigOverride_overrideWithBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig","traversal"), aTraversalConfigNMgr, null ));
		aConfigOverride_overrideWithBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "ProjectionConfig","projection"), aProjectionConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aConfigOverride_overrideWithBCNC);

		EAINodeBranchesConfigIfc aNodeMgrNBC  = new EAINodeBranchesConfig( aNodeMgrNMgr);
		aNodeMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeMgr_inverseOFmetaNodeMgrBMgr, null));
		gConfig.addNodeBranchesConfig( aNodeMgrNBC);

		EAIBranchClassNodesConfigIfc  aNodeMgr_inverseOFmetaNodeMgrBCNC  = new EAIBranchClassNodesConfig( aNodeMgr_inverseOFmetaNodeMgrBMgr);
		aNodeMgr_inverseOFmetaNodeMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "NodeConfig","traversal"), aNodeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aNodeMgr_inverseOFmetaNodeMgrBCNC);

		EAINodeBranchesConfigIfc aBranchMgrNBC  = new EAINodeBranchesConfig( aBranchMgrNMgr);
		aBranchMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchMgr_inverseOFmetaBranchMgrBMgr, null));
		gConfig.addNodeBranchesConfig( aBranchMgrNBC);

		EAIBranchClassNodesConfigIfc  aBranchMgr_inverseOFmetaBranchMgrBCNC  = new EAIBranchClassNodesConfig( aBranchMgr_inverseOFmetaBranchMgrBMgr);
		aBranchMgr_inverseOFmetaBranchMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "BranchConfig","traversal"), aBranchConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBranchMgr_inverseOFmetaBranchMgrBCNC);

		EAINodeBranchesConfigIfc aFieldMgrNBC  = new EAINodeBranchesConfig( aFieldMgrNMgr);
		aFieldMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aFieldMgr_inverseOFmetaFieldMgrBMgr, null));
		gConfig.addNodeBranchesConfig( aFieldMgrNBC);

		EAIBranchClassNodesConfigIfc  aFieldMgr_inverseOFmetaFieldMgrBCNC  = new EAIBranchClassNodesConfig( aFieldMgr_inverseOFmetaFieldMgrBMgr);
		aFieldMgr_inverseOFmetaFieldMgrBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "AttributeConfig","traversal"), aAttributeConfigNMgr, null ));
		gConfig.addBranchClassNodesConfig( aFieldMgr_inverseOFmetaFieldMgrBCNC);

		EAINodeBranchesConfigIfc aCopyFieldMgrNBC  = new EAINodeBranchesConfig( aCopyFieldMgrNMgr);
		aCopyFieldMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aCopyFieldMgr_copiedMetaAttributeBMgr, null));
		aCopyFieldMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aFieldMgr_inverseOFmetaFieldMgrBMgr, null));
		gConfig.addNodeBranchesConfig( aCopyFieldMgrNBC);

		EAIBranchClassNodesConfigIfc  aCopyFieldMgr_copiedMetaAttributeBCNC  = new EAIBranchClassNodesConfig( aCopyFieldMgr_copiedMetaAttributeBMgr);
		aCopyFieldMgr_copiedMetaAttributeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aCopyFieldMgr_copiedMetaAttributeBCNC);

		EAINodeBranchesConfigIfc aFilterNBC  = new EAINodeBranchesConfig( aFilterNMgr);
		gConfig.addNodeBranchesConfig( aFilterNBC);

		EAINodeBranchesConfigIfc aReplicateBranchMgrNBC  = new EAINodeBranchesConfig( aReplicateBranchMgrNMgr);
		aReplicateBranchMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBranchMgr_inverseOFmetaBranchMgrBMgr, null));
		aReplicateBranchMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aReplicateBranchMgr_replicatedMetaRelationshipBMgr, null));
		gConfig.addNodeBranchesConfig( aReplicateBranchMgrNBC);

		EAIBranchClassNodesConfigIfc  aReplicateBranchMgr_replicatedMetaRelationshipBCNC  = new EAIBranchClassNodesConfig( aReplicateBranchMgr_replicatedMetaRelationshipBMgr);
		aReplicateBranchMgr_replicatedMetaRelationshipBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aReplicateBranchMgr_replicatedMetaRelationshipBCNC);

		EAINodeBranchesConfigIfc aReplicateNodeMgrNBC  = new EAINodeBranchesConfig( aReplicateNodeMgrNMgr);
		aReplicateNodeMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aNodeMgr_inverseOFmetaNodeMgrBMgr, null));
		aReplicateNodeMgrNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aReplicateNodeMgr_replicatedMetaTypeBMgr, null));
		gConfig.addNodeBranchesConfig( aReplicateNodeMgrNBC);

		EAIBranchClassNodesConfigIfc  aReplicateNodeMgr_replicatedMetaTypeBCNC  = new EAIBranchClassNodesConfig( aReplicateNodeMgr_replicatedMetaTypeBMgr);
		aReplicateNodeMgr_replicatedMetaTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aReplicateNodeMgr_replicatedMetaTypeBCNC);

		EAINodeBranchesConfigIfc aProjectionConfigNBC  = new EAINodeBranchesConfig( aProjectionConfigNMgr);
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_attributeConfigsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_branchConfigsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_branchMgrsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_configOverridesBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_excludedInRelationshipNamedBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_exclusionTypeBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_fieldMgrsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_nodeConfigsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_nodeMgrsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_projectedToProjectionsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_projectionToOriginalsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_projectionTypeBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTraversalConfig_rootTypeNodeConfigsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_targetToTransfomationsBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_transformationToSourcesBMgr, null));
		aProjectionConfigNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectionConfig_transformationToSubTransformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aProjectionConfigNBC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_targetToTransfomationsBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_targetToTransfomationsBMgr);
		aProjectionConfig_targetToTransfomationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_targetToTransfomationsBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_projectionToOriginalsBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_projectionToOriginalsBMgr);
		aProjectionConfig_projectionToOriginalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_projectionToOriginalsBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_projectedToProjectionsBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_projectedToProjectionsBMgr);
		aProjectionConfig_projectedToProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_projectedToProjectionsBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_transformationToSourcesBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_transformationToSourcesBMgr);
		aProjectionConfig_transformationToSourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_transformationToSourcesBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_transformationToSubTransformationsBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_transformationToSubTransformationsBMgr);
		aProjectionConfig_transformationToSubTransformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Relationship","core"), aRelationshipNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_transformationToSubTransformationsBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_projectionTypeBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_projectionTypeBMgr);
		aProjectionConfig_projectionTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_projectionTypeBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_exclusionTypeBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_exclusionTypeBMgr);
		aProjectionConfig_exclusionTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Type","core"), aTypeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_exclusionTypeBCNC);

		EAIBranchClassNodesConfigIfc  aProjectionConfig_excludedInRelationshipNamedBCNC  = new EAIBranchClassNodesConfig( aProjectionConfig_excludedInRelationshipNamedBMgr);
		aProjectionConfig_excludedInRelationshipNamedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("M3").getClassForType( theCtxt, "Attribute","core"), aAttributeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectionConfig_excludedInRelationshipNamedBCNC);





    return gConfig;
  }

}
