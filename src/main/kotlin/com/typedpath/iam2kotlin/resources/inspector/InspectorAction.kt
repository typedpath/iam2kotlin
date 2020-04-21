
package com.typedpath.iam2kotlin.resources.inspector

import com.typedpath.iam2kotlin.IamPolicy

class InspectorAction() {

    companion object { 
        val All = IamPolicy.Action("inspector:*")    
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_AddAttributesToFindings.html 
        //  ???    
        val AddAttributesToFindings = _AddAttributesToFindings() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_AttachAssessmentAndRulesPackage.html 
        //  ???    
        val AttachAssessmentAndRulesPackage = _AttachAssessmentAndRulesPackage() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_CreateApplication.html 
        //  ???    
        val CreateApplication = _CreateApplication() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_CreateAssessment.html 
        //  ???    
        val CreateAssessment = _CreateAssessment() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_CreateResourceGroup.html 
        //  ???    
        val CreateResourceGroup = _CreateResourceGroup() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DeleteApplication.html 
        //  ???    
        val DeleteApplication = _DeleteApplication() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DeleteAssessment.html 
        //  ???    
        val DeleteAssessment = _DeleteAssessment() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DeleteRun.html 
        //  ???    
        val DeleteRun = _DeleteRun() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeApplication.html 
        //  ???    
        val DescribeApplication = _DescribeApplication() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeAssessment.html 
        //  ???    
        val DescribeAssessment = _DescribeAssessment() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeCrossAccountAccessRole.html 
        //  ???    
        val DescribeCrossAccountAccessRole = _DescribeCrossAccountAccessRole() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeFinding.html 
        //  ???    
        val DescribeFinding = _DescribeFinding() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeResourceGroup.html 
        //  ???    
        val DescribeResourceGroup = _DescribeResourceGroup() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeRulesPackage.html 
        //  ???    
        val DescribeRulesPackage = _DescribeRulesPackage() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DescribeRun.html 
        //  ???    
        val DescribeRun = _DescribeRun() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_DetachAssessmentAndRulesPackage.html 
        //  ???    
        val DetachAssessmentAndRulesPackage = _DetachAssessmentAndRulesPackage() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_GetAssessmentTelemetry.html 
        //  ???    
        val GetAssessmentTelemetry = _GetAssessmentTelemetry() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListApplications.html 
        //  ???    
        val ListApplications = _ListApplications() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListAssessmentAgents.html 
        //  ???    
        val ListAssessmentAgents = _ListAssessmentAgents() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListAssessments.html 
        //  ???    
        val ListAssessments = _ListAssessments() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListAttachedAssessments.html 
        //  ???    
        val ListAttachedAssessments = _ListAttachedAssessments() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListAttachedRulesPackages.html 
        //  ???    
        val ListAttachedRulesPackages = _ListAttachedRulesPackages() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListFindings.html 
        //  ???    
        val ListFindings = _ListFindings() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListRulesPackages.html 
        //  ???    
        val ListRulesPackages = _ListRulesPackages() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListRuns.html 
        //  ???    
        val ListRuns = _ListRuns() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_ListTagsForResource.html 
        //  ???    
        val ListTagsForResource = _ListTagsForResource() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_LocalizeText.html 
        //  ???    
        val LocalizeText = _LocalizeText() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_PreviewAgentsForResourceGroup.html 
        //  ???    
        val PreviewAgentsForResourceGroup = _PreviewAgentsForResourceGroup() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_RegisterCrossAccountAccessRole.html 
        //  ???    
        val RegisterCrossAccountAccessRole = _RegisterCrossAccountAccessRole() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_RemoveAttributesFromFindings.html 
        //  ???    
        val RemoveAttributesFromFindings = _RemoveAttributesFromFindings() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_RetireRulesPackage.html 
        //  ???    
        val RetireRulesPackage = _RetireRulesPackage() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_RunAssessment.html 
        //  ???    
        val RunAssessment = _RunAssessment() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_SetTagsForResource.html 
        //  ???    
        val SetTagsForResource = _SetTagsForResource() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_StartDataCollection.html 
        //  ???    
        val StartDataCollection = _StartDataCollection() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_StopDataCollection.html 
        //  ???    
        val StopDataCollection = _StopDataCollection() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_UpdateApplication.html 
        //  ???    
        val UpdateApplication = _UpdateApplication() 
        // see http://docs.aws.amazon.com/inspector/latest/APIReference/API_UpdateAssessment.html 
        //  ???    
        val UpdateAssessment = _UpdateAssessment()
    }
      class _AddAttributesToFindings : IamPolicy.Action("inspector:AddAttributesToFindings") {

         }       
 
      class _AttachAssessmentAndRulesPackage : IamPolicy.Action("inspector:AttachAssessmentAndRulesPackage") {

         }       
 
      class _CreateApplication : IamPolicy.Action("inspector:CreateApplication") {

         }       
 
      class _CreateAssessment : IamPolicy.Action("inspector:CreateAssessment") {

         }       
 
      class _CreateResourceGroup : IamPolicy.Action("inspector:CreateResourceGroup") {

         }       
 
      class _DeleteApplication : IamPolicy.Action("inspector:DeleteApplication") {

         }       
 
      class _DeleteAssessment : IamPolicy.Action("inspector:DeleteAssessment") {

         }       
 
      class _DeleteRun : IamPolicy.Action("inspector:DeleteRun") {

         }       
 
      class _DescribeApplication : IamPolicy.Action("inspector:DescribeApplication") {

         }       
 
      class _DescribeAssessment : IamPolicy.Action("inspector:DescribeAssessment") {

         }       
 
      class _DescribeCrossAccountAccessRole : IamPolicy.Action("inspector:DescribeCrossAccountAccessRole") {

         }       
 
      class _DescribeFinding : IamPolicy.Action("inspector:DescribeFinding") {

         }       
 
      class _DescribeResourceGroup : IamPolicy.Action("inspector:DescribeResourceGroup") {

         }       
 
      class _DescribeRulesPackage : IamPolicy.Action("inspector:DescribeRulesPackage") {

         }       
 
      class _DescribeRun : IamPolicy.Action("inspector:DescribeRun") {

         }       
 
      class _DetachAssessmentAndRulesPackage : IamPolicy.Action("inspector:DetachAssessmentAndRulesPackage") {

         }       
 
      class _GetAssessmentTelemetry : IamPolicy.Action("inspector:GetAssessmentTelemetry") {

         }       
 
      class _ListApplications : IamPolicy.Action("inspector:ListApplications") {

         }       
 
      class _ListAssessmentAgents : IamPolicy.Action("inspector:ListAssessmentAgents") {

         }       
 
      class _ListAssessments : IamPolicy.Action("inspector:ListAssessments") {

         }       
 
      class _ListAttachedAssessments : IamPolicy.Action("inspector:ListAttachedAssessments") {

         }       
 
      class _ListAttachedRulesPackages : IamPolicy.Action("inspector:ListAttachedRulesPackages") {

         }       
 
      class _ListFindings : IamPolicy.Action("inspector:ListFindings") {

         }       
 
      class _ListRulesPackages : IamPolicy.Action("inspector:ListRulesPackages") {

         }       
 
      class _ListRuns : IamPolicy.Action("inspector:ListRuns") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("inspector:ListTagsForResource") {

         }       
 
      class _LocalizeText : IamPolicy.Action("inspector:LocalizeText") {

         }       
 
      class _PreviewAgentsForResourceGroup : IamPolicy.Action("inspector:PreviewAgentsForResourceGroup") {

         }       
 
      class _RegisterCrossAccountAccessRole : IamPolicy.Action("inspector:RegisterCrossAccountAccessRole") {

         }       
 
      class _RemoveAttributesFromFindings : IamPolicy.Action("inspector:RemoveAttributesFromFindings") {

         }       
 
      class _RetireRulesPackage : IamPolicy.Action("inspector:RetireRulesPackage") {

         }       
 
      class _RunAssessment : IamPolicy.Action("inspector:RunAssessment") {

         }       
 
      class _SetTagsForResource : IamPolicy.Action("inspector:SetTagsForResource") {

         }       
 
      class _StartDataCollection : IamPolicy.Action("inspector:StartDataCollection") {

         }       
 
      class _StopDataCollection : IamPolicy.Action("inspector:StopDataCollection") {

         }       
 
      class _UpdateApplication : IamPolicy.Action("inspector:UpdateApplication") {

         }       
 
      class _UpdateAssessment : IamPolicy.Action("inspector:UpdateAssessment") {

         }       


}        
