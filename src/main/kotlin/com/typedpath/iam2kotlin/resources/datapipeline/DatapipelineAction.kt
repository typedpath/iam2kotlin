
package com.typedpath.iam2kotlin.resources.datapipeline

import com.typedpath.iam2kotlin.IamPolicy

class DatapipelineAction() {

    companion object { 
        val All = IamPolicy.Action("datapipeline:*")    
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_ActivatePipeline.html 
        //  Validates the specified pipeline and starts processing pipeline tasks.    
        val ActivatePipeline = _ActivatePipeline() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_AddTags.html 
        //  Adds or modifies tags for the specified pipeline.    
        val AddTags = _AddTags() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_CreatePipeline.html 
        //  Creates a new, empty pipeline.    
        val CreatePipeline = _CreatePipeline() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_DeactivatePipeline.html 
        //  Deactivates the specified running pipeline.    
        val DeactivatePipeline = _DeactivatePipeline() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_DeletePipeline.html 
        //  Deletes a pipeline, its pipeline definition, and its run history.    
        val DeletePipeline = _DeletePipeline() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_DescribeObjects.html 
        //  Gets the object definitions for a set of objects associated with the pipeline.    
        val DescribeObjects = _DescribeObjects() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_DescribePipelines.html 
        //  Retrieves metadata about one or more pipelines.    
        val DescribePipelines = _DescribePipelines() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_EvaluateExpression.html 
        //  Task runners call EvaluateExpression to evaluate a string in the context of the specified object.    
        val EvaluateExpression = _EvaluateExpression() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_GetAccountLimits.html 
        //  ???    
        val GetAccountLimits = _GetAccountLimits() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_GetPipelineDefinition.html 
        //  Gets the definition of the specified pipeline.    
        val GetPipelineDefinition = _GetPipelineDefinition() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_ListPipelines.html 
        //  Lists the pipeline identifiers for all active pipelines that you have permission to access.    
        val ListPipelines = _ListPipelines() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_PollForTask.html 
        //  Task runners call PollForTask to receive a task to perform from AWS Data Pipeline.    
        val PollForTask = _PollForTask() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_PutAccountLimits.html 
        //  ???    
        val PutAccountLimits = _PutAccountLimits() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_PutPipelineDefinition.html 
        //  Adds tasks, schedules, and preconditions to the specified pipeline.    
        val PutPipelineDefinition = _PutPipelineDefinition() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_QueryObjects.html 
        //  Queries the specified pipeline for the names of objects that match the specified set of conditions.    
        val QueryObjects = _QueryObjects() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_RemoveTags.html 
        //  Removes existing tags from the specified pipeline.    
        val RemoveTags = _RemoveTags() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_ReportTaskProgress.html 
        //  Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task.    
        val ReportTaskProgress = _ReportTaskProgress() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_ReportTaskRunnerHeartbeat.html 
        //  Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational.    
        val ReportTaskRunnerHeartbeat = _ReportTaskRunnerHeartbeat() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_SetStatus.html 
        //  Requests that the status of the specified physical or logical pipeline objects be updated in the specified pipeline.    
        val SetStatus = _SetStatus() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_SetTaskStatus.html 
        //  Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status.    
        val SetTaskStatus = _SetTaskStatus() 
        // see http://docs.aws.amazon.com/datapipeline/latest/APIReference/API_ValidatePipelineDefinition.html 
        //  Validates the specified pipeline definition to ensure that it is well formed and can be run without error.    
        val ValidatePipelineDefinition = _ValidatePipelineDefinition()
    }
      class _ActivatePipeline : IamPolicy.Action("datapipeline:ActivatePipeline") {

         }       
 
      class _AddTags : IamPolicy.Action("datapipeline:AddTags") {

         }       
 
      class _CreatePipeline : IamPolicy.Action("datapipeline:CreatePipeline") {

         }       
 
      class _DeactivatePipeline : IamPolicy.Action("datapipeline:DeactivatePipeline") {

         }       
 
      class _DeletePipeline : IamPolicy.Action("datapipeline:DeletePipeline") {

         }       
 
      class _DescribeObjects : IamPolicy.Action("datapipeline:DescribeObjects") {

         }       
 
      class _DescribePipelines : IamPolicy.Action("datapipeline:DescribePipelines") {

         }       
 
      class _EvaluateExpression : IamPolicy.Action("datapipeline:EvaluateExpression") {

         }       
 
      class _GetAccountLimits : IamPolicy.Action("datapipeline:GetAccountLimits") {

         }       
 
      class _GetPipelineDefinition : IamPolicy.Action("datapipeline:GetPipelineDefinition") {

         }       
 
      class _ListPipelines : IamPolicy.Action("datapipeline:ListPipelines") {

         }       
 
      class _PollForTask : IamPolicy.Action("datapipeline:PollForTask") {

         }       
 
      class _PutAccountLimits : IamPolicy.Action("datapipeline:PutAccountLimits") {

         }       
 
      class _PutPipelineDefinition : IamPolicy.Action("datapipeline:PutPipelineDefinition") {

         }       
 
      class _QueryObjects : IamPolicy.Action("datapipeline:QueryObjects") {

         }       
 
      class _RemoveTags : IamPolicy.Action("datapipeline:RemoveTags") {

         }       
 
      class _ReportTaskProgress : IamPolicy.Action("datapipeline:ReportTaskProgress") {

         }       
 
      class _ReportTaskRunnerHeartbeat : IamPolicy.Action("datapipeline:ReportTaskRunnerHeartbeat") {

         }       
 
      class _SetStatus : IamPolicy.Action("datapipeline:SetStatus") {

         }       
 
      class _SetTaskStatus : IamPolicy.Action("datapipeline:SetTaskStatus") {

         }       
 
      class _ValidatePipelineDefinition : IamPolicy.Action("datapipeline:ValidatePipelineDefinition") {

         }       


}        
