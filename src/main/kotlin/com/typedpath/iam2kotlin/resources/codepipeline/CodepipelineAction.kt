
package com.typedpath.iam2kotlin.resources.codepipeline

import com.typedpath.iam2kotlin.IamPolicy

class CodepipelineAction() {

    companion object { 
        val All = IamPolicy.Action("codepipeline:*")    
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_AcknowledgeJob.html 
        //  Returns information about a specified job and whether that job has been received by the job worker.    
        val AcknowledgeJob = _AcknowledgeJob() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_AcknowledgeThirdPartyJob.html 
        //  Confirms a job worker has received the specified job.    
        val AcknowledgeThirdPartyJob = _AcknowledgeThirdPartyJob() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_CreateCustomActionType.html 
        //  Creates a new custom action that can be used in all pipelines associated with the AWS account.    
        val CreateCustomActionType = _CreateCustomActionType() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_CreatePipeline.html 
        //  Creates a pipeline.    
        val CreatePipeline = _CreatePipeline() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_DeleteCustomActionType.html 
        //  Marks a custom action as deleted.    
        val DeleteCustomActionType = _DeleteCustomActionType() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_DeletePipeline.html 
        //  Deletes the specified pipeline.    
        val DeletePipeline = _DeletePipeline() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_DeleteWebhook.html 
        //  Deletes a previously created webhook by name    
        val DeleteWebhook = _DeleteWebhook() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_DeregisterWebhookWithThirdParty.html 
        //  Removes the connection between the webhook that was created by CodePipeline and the external tool with events to be detected.    
        val DeregisterWebhookWithThirdParty = _DeregisterWebhookWithThirdParty() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_DisableStageTransition.html 
        //  Prevents artifacts in a pipeline from transitioning to the next stage in the pipeline.    
        val DisableStageTransition = _DisableStageTransition() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_EnableStageTransition.html 
        //  Enables artifacts in a pipeline to transition to a stage in a pipeline.    
        val EnableStageTransition = _EnableStageTransition() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_GetJobDetails.html 
        //  Returns information about a job.    
        val GetJobDetails = _GetJobDetails() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_GetPipeline.html 
        //  Returns the metadata, structure, stages, and actions of a pipeline.    
        val GetPipeline = _GetPipeline() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_GetPipelineExecution.html 
        //   Returns information about an execution of a pipeline, including details about artifacts, the pipeline execution ID, and the name, version, and status of the pipeline.    
        val GetPipelineExecution = _GetPipelineExecution() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_GetPipelineState.html 
        //  Returns information about the state of a pipeline, including the stages and actions.    
        val GetPipelineState = _GetPipelineState() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_GetThirdPartyJobDetails.html 
        //  Requests the details of a job for a third party action.    
        val GetThirdPartyJobDetails = _GetThirdPartyJobDetails() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_ListActionTypes.html 
        //  Gets a summary of all AWS CodePipeline action types associated with your account.    
        val ListActionTypes = _ListActionTypes() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_ListPipelineExecutions.html 
        //  Gets a summary of the most recent executions for a pipeline.    
        val ListPipelineExecutions = _ListPipelineExecutions() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_ListPipelines.html 
        //  Gets a summary of all of the pipelines associated with your account.    
        val ListPipelines = _ListPipelines() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_ListWebhooks.html 
        //   Gets a listing of all the webhooks in this region for this account.    
        val ListWebhooks = _ListWebhooks() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PollForJobs.html 
        //  Returns information about any jobs for AWS CodePipeline to act upon.    
        val PollForJobs = _PollForJobs() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PollForThirdPartyJobs.html 
        //  Determines whether there are any third party jobs for a job worker to act on.    
        val PollForThirdPartyJobs = _PollForThirdPartyJobs() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutActionRevision.html 
        //  Provides information to AWS CodePipeline about new revisions to a source.    
        val PutActionRevision = _PutActionRevision() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutApprovalResult.html 
        //  Provides the response to a manual approval request to AWS CodePipeline.    
        val PutApprovalResult = _PutApprovalResult() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutJobFailureResult.html 
        //  Represents the failure of a job as returned to the pipeline by a job worker.    
        val PutJobFailureResult = _PutJobFailureResult() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutJobSuccessResult.html 
        //  Represents the success of a job as returned to the pipeline by a job worker.    
        val PutJobSuccessResult = _PutJobSuccessResult() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutThirdPartyJobFailureResult.html 
        //  Represents the failure of a third party job as returned to the pipeline by a job worker.    
        val PutThirdPartyJobFailureResult = _PutThirdPartyJobFailureResult() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutThirdPartyJobSuccessResult.html 
        //  Represents the success of a third party job as returned to the pipeline by a job worker.    
        val PutThirdPartyJobSuccessResult = _PutThirdPartyJobSuccessResult() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutWebhook.html 
        //  Defines a webhook and returns a unique webhook URL generated by CodePipeline.    
        val PutWebhook = _PutWebhook() 
        // see https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_RegisterWebhookWithThirdParty.html 
        //  Configures a connection between the webhook that was created and the external tool with events to be detected.    
        val RegisterWebhookWithThirdParty = _RegisterWebhookWithThirdParty() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_RetryStageExecution.html 
        //  Resumes the pipeline execution by retrying the last failed actions in a stage.    
        val RetryStageExecution = _RetryStageExecution() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_StartPipelineExecution.html 
        //  Starts the specified pipeline.    
        val StartPipelineExecution = _StartPipelineExecution() 
        // see http://docs.aws.amazon.com/codepipeline/latest/APIReference/API_UpdatePipeline.html 
        //  Updates a specified pipeline with edits or changes to its structure.    
        val UpdatePipeline = _UpdatePipeline()
    }
      class _AcknowledgeJob : IamPolicy.Action("codepipeline:AcknowledgeJob") {

         }       
 
      class _AcknowledgeThirdPartyJob : IamPolicy.Action("codepipeline:AcknowledgeThirdPartyJob") {

         }       
 
      class _CreateCustomActionType : IamPolicy.Action("codepipeline:CreateCustomActionType") {
             //arn:aws:codepipeline:$region:$account:actiontype:$action-owner/$action-type/$action-name/$action-version"
            fun actiontype_byRegionAccountActionownerActiontypeActionnameActionversion(region: String, account: String, actionowner: String, actiontype: String, actionname: String, actionversion: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:actiontype:$actionowner/$actiontype/$actionname/$actionversion")
         }       
 
      class _CreatePipeline : IamPolicy.Action("codepipeline:CreatePipeline") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       
 
      class _DeleteCustomActionType : IamPolicy.Action("codepipeline:DeleteCustomActionType") {
             //arn:aws:codepipeline:$region:$account:actiontype:$action-owner/$action-type/$action-name/$action-version"
            fun actiontype_byRegionAccountActionownerActiontypeActionnameActionversion(region: String, account: String, actionowner: String, actiontype: String, actionname: String, actionversion: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:actiontype:$actionowner/$actiontype/$actionname/$actionversion")
         }       
 
      class _DeletePipeline : IamPolicy.Action("codepipeline:DeletePipeline") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       
 
      class _DeleteWebhook : IamPolicy.Action("codepipeline:DeleteWebhook") {

         }       
 
      class _DeregisterWebhookWithThirdParty : IamPolicy.Action("codepipeline:DeregisterWebhookWithThirdParty") {

         }       
 
      class _DisableStageTransition : IamPolicy.Action("codepipeline:DisableStageTransition") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name/$stage-name"
            fun byRegionAccountPipelinenameStagename(region: String, account: String, pipelinename: String, stagename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename/$stagename")
         }       
 
      class _EnableStageTransition : IamPolicy.Action("codepipeline:EnableStageTransition") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name/$stage-name"
            fun byRegionAccountPipelinenameStagename(region: String, account: String, pipelinename: String, stagename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename/$stagename")
         }       
 
      class _GetJobDetails : IamPolicy.Action("codepipeline:GetJobDetails") {

         }       
 
      class _GetPipeline : IamPolicy.Action("codepipeline:GetPipeline") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       
 
      class _GetPipelineExecution : IamPolicy.Action("codepipeline:GetPipelineExecution") {

         }       
 
      class _GetPipelineState : IamPolicy.Action("codepipeline:GetPipelineState") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       
 
      class _GetThirdPartyJobDetails : IamPolicy.Action("codepipeline:GetThirdPartyJobDetails") {

         }       
 
      class _ListActionTypes : IamPolicy.Action("codepipeline:ListActionTypes") {

         }       
 
      class _ListPipelineExecutions : IamPolicy.Action("codepipeline:ListPipelineExecutions") {

         }       
 
      class _ListPipelines : IamPolicy.Action("codepipeline:ListPipelines") {

         }       
 
      class _ListWebhooks : IamPolicy.Action("codepipeline:ListWebhooks") {

         }       
 
      class _PollForJobs : IamPolicy.Action("codepipeline:PollForJobs") {
             //arn:aws:codepipeline:$region:$account:actiontype:$action-owner/$action-type/$action-name/$action-version"
            fun actiontype_byRegionAccountActionownerActiontypeActionnameActionversion(region: String, account: String, actionowner: String, actiontype: String, actionname: String, actionversion: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:actiontype:$actionowner/$actiontype/$actionname/$actionversion")
         }       
 
      class _PollForThirdPartyJobs : IamPolicy.Action("codepipeline:PollForThirdPartyJobs") {

         }       
 
      class _PutActionRevision : IamPolicy.Action("codepipeline:PutActionRevision") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name/$stage-name/$action-name"
            fun byRegionAccountPipelinenameStagenameActionname(region: String, account: String, pipelinename: String, stagename: String, actionname: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename/$stagename/$actionname")
         }       
 
      class _PutApprovalResult : IamPolicy.Action("codepipeline:PutApprovalResult") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name/$pipeline-stage/$pipeline-action"
            fun byRegionAccountPipelinenamePipelinestagePipelineaction(region: String, account: String, pipelinename: String, pipelinestage: String, pipelineaction: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename/$pipelinestage/$pipelineaction")
         }       
 
      class _PutJobFailureResult : IamPolicy.Action("codepipeline:PutJobFailureResult") {

         }       
 
      class _PutJobSuccessResult : IamPolicy.Action("codepipeline:PutJobSuccessResult") {

         }       
 
      class _PutThirdPartyJobFailureResult : IamPolicy.Action("codepipeline:PutThirdPartyJobFailureResult") {

         }       
 
      class _PutThirdPartyJobSuccessResult : IamPolicy.Action("codepipeline:PutThirdPartyJobSuccessResult") {

         }       
 
      class _PutWebhook : IamPolicy.Action("codepipeline:PutWebhook") {

         }       
 
      class _RegisterWebhookWithThirdParty : IamPolicy.Action("codepipeline:RegisterWebhookWithThirdParty") {

         }       
 
      class _RetryStageExecution : IamPolicy.Action("codepipeline:RetryStageExecution") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name/$stage-name"
            fun byRegionAccountPipelinenameStagename(region: String, account: String, pipelinename: String, stagename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename/$stagename")
         }       
 
      class _StartPipelineExecution : IamPolicy.Action("codepipeline:StartPipelineExecution") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       
 
      class _UpdatePipeline : IamPolicy.Action("codepipeline:UpdatePipeline") {
             //arn:aws:codepipeline:$region:$account:$pipeline-name"
            fun byRegionAccountPipelinename(region: String, account: String, pipelinename: String) = IamPolicy.Resource("arn:aws:codepipeline:$region:$account:$pipelinename")
         }       


}        
