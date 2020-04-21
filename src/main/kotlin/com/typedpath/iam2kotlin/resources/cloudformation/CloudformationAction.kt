
package com.typedpath.iam2kotlin.resources.cloudformation

import com.typedpath.iam2kotlin.IamPolicy

class CloudformationAction() {

    companion object { 
        val All = IamPolicy.Action("cloudformation:*")    
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html 
        //  Cancels an update on the specified stack.    
        val CancelUpdateStack = _CancelUpdateStack() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ContinueUpdateRollback.html 
        //  For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state.    
        val ContinueUpdateRollback = _ContinueUpdateRollback() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateChangeSet.html 
        //  Creates a list of changes for a stack.    
        val CreateChangeSet = _CreateChangeSet() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStack.html 
        //  Creates a stack as specified in the template.    
        val CreateStack = _CreateStack() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateUploadBucket.html 
        //  ???    
        val CreateUploadBucket = _CreateUploadBucket() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeleteStack.html 
        //  Deletes a specified stack.    
        val DeleteStack = _DeleteStack() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeAccountLimits.html 
        //  Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in your account.    
        val DescribeAccountLimits = _DescribeAccountLimits() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeChangeSet.html 
        //  Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the change set.    
        val DescribeChangeSet = _DescribeChangeSet() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackEvents.html 
        //  Returns all stack related events for a specified stack in reverse chronological order.    
        val DescribeStackEvents = _DescribeStackEvents() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackResource.html 
        //  Returns a description of the specified resource in the specified stack.    
        val DescribeStackResource = _DescribeStackResource() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackResources.html 
        //  Returns AWS resource descriptions for running and deleted stacks.    
        val DescribeStackResources = _DescribeStackResources() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStacks.html 
        //  Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.    
        val DescribeStacks = _DescribeStacks() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_EstimateTemplateCost.html 
        //  Returns the estimated monthly cost of a template.    
        val EstimateTemplateCost = _EstimateTemplateCost() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ExecuteChangeSet.html 
        //  Updates a stack using the input information that was provided when the specified change set was created.    
        val ExecuteChangeSet = _ExecuteChangeSet() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetStackPolicy.html 
        //  Returns the stack policy for a specified stack.    
        val GetStackPolicy = _GetStackPolicy() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetTemplate.html 
        //  Returns the template body for a specified stack.    
        val GetTemplate = _GetTemplate() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetTemplateSummary.html 
        //  Returns information about a new or existing template.    
        val GetTemplateSummary = _GetTemplateSummary() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListChangeSets.html 
        //  Returns the ID and status of each active change set for a stack.    
        val ListChangeSets = _ListChangeSets() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackResources.html 
        //  Returns descriptions of all resources of the specified stack.    
        val ListStackResources = _ListStackResources() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStacks.html 
        //  Returns the summary information for stacks whose status matches the specified StackStatusFilter.    
        val ListStacks = _ListStacks() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_PreviewStackUpdate.html 
        //  ???    
        val PreviewStackUpdate = _PreviewStackUpdate() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetStackPolicy.html 
        //  Sets a stack policy for a specified stack.    
        val SetStackPolicy = _SetStackPolicy() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SignalResource.html 
        //  Sends a signal to the specified resource with a success or failure status.    
        val SignalResource = _SignalResource() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStack.html 
        //  Updates a stack as specified in the template.    
        val UpdateStack = _UpdateStack() 
        // see http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ValidateTemplate.html 
        //  Validates a specified template.    
        val ValidateTemplate = _ValidateTemplate()
    }
      class _CancelUpdateStack : IamPolicy.Action("cloudformation:CancelUpdateStack") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _ContinueUpdateRollback : IamPolicy.Action("cloudformation:ContinueUpdateRollback") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _CreateChangeSet : IamPolicy.Action("cloudformation:CreateChangeSet") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _CreateStack : IamPolicy.Action("cloudformation:CreateStack") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _CreateUploadBucket : IamPolicy.Action("cloudformation:CreateUploadBucket") {

         }       
 
      class _DeleteStack : IamPolicy.Action("cloudformation:DeleteStack") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _DescribeAccountLimits : IamPolicy.Action("cloudformation:DescribeAccountLimits") {

         }       
 
      class _DescribeChangeSet : IamPolicy.Action("cloudformation:DescribeChangeSet") {

         }       
 
      class _DescribeStackEvents : IamPolicy.Action("cloudformation:DescribeStackEvents") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _DescribeStackResource : IamPolicy.Action("cloudformation:DescribeStackResource") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _DescribeStackResources : IamPolicy.Action("cloudformation:DescribeStackResources") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _DescribeStacks : IamPolicy.Action("cloudformation:DescribeStacks") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _EstimateTemplateCost : IamPolicy.Action("cloudformation:EstimateTemplateCost") {

         }       
 
      class _ExecuteChangeSet : IamPolicy.Action("cloudformation:ExecuteChangeSet") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _GetStackPolicy : IamPolicy.Action("cloudformation:GetStackPolicy") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _GetTemplate : IamPolicy.Action("cloudformation:GetTemplate") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _GetTemplateSummary : IamPolicy.Action("cloudformation:GetTemplateSummary") {

         }       
 
      class _ListChangeSets : IamPolicy.Action("cloudformation:ListChangeSets") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _ListStackResources : IamPolicy.Action("cloudformation:ListStackResources") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _ListStacks : IamPolicy.Action("cloudformation:ListStacks") {

         }       
 
      class _PreviewStackUpdate : IamPolicy.Action("cloudformation:PreviewStackUpdate") {

         }       
 
      class _SetStackPolicy : IamPolicy.Action("cloudformation:SetStackPolicy") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _SignalResource : IamPolicy.Action("cloudformation:SignalResource") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _UpdateStack : IamPolicy.Action("cloudformation:UpdateStack") {
             //arn:aws:cloudformation:$region:$account:stack/$stack-name/*"
            fun stack_all_byRegionAccountStackname(region: String, account: String, stackname: String) = IamPolicy.Resource("arn:aws:cloudformation:$region:$account:stack/$stackname/*")
         }       
 
      class _ValidateTemplate : IamPolicy.Action("cloudformation:ValidateTemplate") {

         }       


}        
