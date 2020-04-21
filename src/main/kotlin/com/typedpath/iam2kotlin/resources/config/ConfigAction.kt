
package com.typedpath.iam2kotlin.resources.config

import com.typedpath.iam2kotlin.IamPolicy

class ConfigAction() {

    companion object { 
        val All = IamPolicy.Action("config:*")    
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DeleteConfigRule.html 
        //  Deletes the specified AWS Config rule and all of its evaluation results.    
        val DeleteConfigRule = _DeleteConfigRule() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DeleteDeliveryChannel.html 
        //  Deletes the delivery channel.    
        val DeleteDeliveryChannel = _DeleteDeliveryChannel() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DeliverConfigSnapshot.html 
        //  Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel.    
        val DeliverConfigSnapshot = _DeliverConfigSnapshot() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeComplianceByConfigRule.html 
        //  Indicates whether the specified AWS Config rules are compliant.    
        val DescribeComplianceByConfigRule = _DescribeComplianceByConfigRule() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeComplianceByResource.html 
        //  Indicates whether the specified AWS resources are compliant.    
        val DescribeComplianceByResource = _DescribeComplianceByResource() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeConfigRuleEvaluationStatus.html 
        //  Returns status information for each of your AWS managed Config rules.    
        val DescribeConfigRuleEvaluationStatus = _DescribeConfigRuleEvaluationStatus() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeConfigRules.html 
        //  Returns details about your AWS Config rules.    
        val DescribeConfigRules = _DescribeConfigRules() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeConfigurationRecorderStatus.html 
        //  Returns the current status of the specified configuration recorder.    
        val DescribeConfigurationRecorderStatus = _DescribeConfigurationRecorderStatus() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeConfigurationRecorders.html 
        //  Returns the name of one or more specified configuration recorders.    
        val DescribeConfigurationRecorders = _DescribeConfigurationRecorders() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeDeliveryChannelStatus.html 
        //  Returns the current status of the specified delivery channel.    
        val DescribeDeliveryChannelStatus = _DescribeDeliveryChannelStatus() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_DescribeDeliveryChannels.html 
        //  Returns details about the specified delivery channel.    
        val DescribeDeliveryChannels = _DescribeDeliveryChannels() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetComplianceDetailsByConfigRule.html 
        //  Returns the evaluation results for the specified AWS Config rule.    
        val GetComplianceDetailsByConfigRule = _GetComplianceDetailsByConfigRule() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetComplianceDetailsByResource.html 
        //  Returns the evaluation results for the specified AWS resource.    
        val GetComplianceDetailsByResource = _GetComplianceDetailsByResource() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetComplianceSummaryByConfigRule.html 
        //  Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.    
        val GetComplianceSummaryByConfigRule = _GetComplianceSummaryByConfigRule() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetComplianceSummaryByResourceType.html 
        //  Returns the number of resources that are compliant and the number that are noncompliant.    
        val GetComplianceSummaryByResourceType = _GetComplianceSummaryByResourceType() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetResourceConfigHistory.html 
        //  Returns a list of configuration items for the specified resource.    
        val GetResourceConfigHistory = _GetResourceConfigHistory() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetResources.html 
        //  ???    
        val GetResources = _GetResources() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_GetTagKeys.html 
        //  ???    
        val GetTagKeys = _GetTagKeys() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_ListDiscoveredResources.html 
        //  Accepts a resource type and returns a list of resource identifiers for the resources of that type.    
        val ListDiscoveredResources = _ListDiscoveredResources() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_PutConfigRule.html 
        //  Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations.    
        val PutConfigRule = _PutConfigRule() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_PutConfigurationRecorder.html 
        //  Creates a new configuration recorder to record the selected resource configurations.    
        val PutConfigurationRecorder = _PutConfigurationRecorder() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_PutDeliveryChannel.html 
        //  Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic.    
        val PutDeliveryChannel = _PutDeliveryChannel() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_PutEvaluations.html 
        //  Used by an AWS Lambda function to deliver evaluation results to AWS Config.    
        val PutEvaluations = _PutEvaluations() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_StartConfigurationRecorder.html 
        //  Starts recording configurations of the AWS resources you have selected to record in your AWS account.    
        val StartConfigurationRecorder = _StartConfigurationRecorder() 
        // see http://docs.aws.amazon.com/config/latest/APIReference/API_StopConfigurationRecorder.html 
        //  Stops recording configurations of the AWS resources you have selected to record in your AWS account.    
        val StopConfigurationRecorder = _StopConfigurationRecorder()
    }
      class _DeleteConfigRule : IamPolicy.Action("config:DeleteConfigRule") {

         }       
 
      class _DeleteDeliveryChannel : IamPolicy.Action("config:DeleteDeliveryChannel") {

         }       
 
      class _DeliverConfigSnapshot : IamPolicy.Action("config:DeliverConfigSnapshot") {

         }       
 
      class _DescribeComplianceByConfigRule : IamPolicy.Action("config:DescribeComplianceByConfigRule") {

         }       
 
      class _DescribeComplianceByResource : IamPolicy.Action("config:DescribeComplianceByResource") {

         }       
 
      class _DescribeConfigRuleEvaluationStatus : IamPolicy.Action("config:DescribeConfigRuleEvaluationStatus") {

         }       
 
      class _DescribeConfigRules : IamPolicy.Action("config:DescribeConfigRules") {

         }       
 
      class _DescribeConfigurationRecorderStatus : IamPolicy.Action("config:DescribeConfigurationRecorderStatus") {

         }       
 
      class _DescribeConfigurationRecorders : IamPolicy.Action("config:DescribeConfigurationRecorders") {

         }       
 
      class _DescribeDeliveryChannelStatus : IamPolicy.Action("config:DescribeDeliveryChannelStatus") {

         }       
 
      class _DescribeDeliveryChannels : IamPolicy.Action("config:DescribeDeliveryChannels") {

         }       
 
      class _GetComplianceDetailsByConfigRule : IamPolicy.Action("config:GetComplianceDetailsByConfigRule") {

         }       
 
      class _GetComplianceDetailsByResource : IamPolicy.Action("config:GetComplianceDetailsByResource") {

         }       
 
      class _GetComplianceSummaryByConfigRule : IamPolicy.Action("config:GetComplianceSummaryByConfigRule") {

         }       
 
      class _GetComplianceSummaryByResourceType : IamPolicy.Action("config:GetComplianceSummaryByResourceType") {

         }       
 
      class _GetResourceConfigHistory : IamPolicy.Action("config:GetResourceConfigHistory") {

         }       
 
      class _GetResources : IamPolicy.Action("config:GetResources") {

         }       
 
      class _GetTagKeys : IamPolicy.Action("config:GetTagKeys") {

         }       
 
      class _ListDiscoveredResources : IamPolicy.Action("config:ListDiscoveredResources") {

         }       
 
      class _PutConfigRule : IamPolicy.Action("config:PutConfigRule") {

         }       
 
      class _PutConfigurationRecorder : IamPolicy.Action("config:PutConfigurationRecorder") {

         }       
 
      class _PutDeliveryChannel : IamPolicy.Action("config:PutDeliveryChannel") {

         }       
 
      class _PutEvaluations : IamPolicy.Action("config:PutEvaluations") {

         }       
 
      class _StartConfigurationRecorder : IamPolicy.Action("config:StartConfigurationRecorder") {

         }       
 
      class _StopConfigurationRecorder : IamPolicy.Action("config:StopConfigurationRecorder") {

         }       


}        
