
package com.typedpath.iam2kotlin.resources.elastictranscoder

import com.typedpath.iam2kotlin.IamPolicy

class ElastictranscoderAction() {

    companion object { 
        val All = IamPolicy.Action("elastictranscoder:*")    
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/cancel-job.html 
        //  To cancel a job that Elastic Transcoder has not begun to process.    
        val CancelJob = _CancelJob() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/create-job.html 
        //  To create a job.    
        val CreateJob = _CreateJob() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/create-pipeline.html 
        //  To create a pipeline.    
        val CreatePipeline = _CreatePipeline() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/create-preset.html 
        //  To create a preset.    
        val CreatePreset = _CreatePreset() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/delete-pipeline.html 
        //  To delete a pipeline.    
        val DeletePipeline = _DeletePipeline() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/delete-preset.html 
        //  To delete a preset.    
        val DeletePreset = _DeletePreset() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/list-jobs-by-pipeline.html 
        //  To get a list of the jobs that you assigned to a pipeline.    
        val ListJobsByPipeline = _ListJobsByPipeline() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/list-jobs-by-status.html 
        //  To get a list of the jobs that have a specified status.    
        val ListJobsByStatus = _ListJobsByStatus() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/list-pipelines.html 
        //  To get a list of the pipelines associated with the current AWS account.    
        val ListPipelines = _ListPipelines() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/list-presets.html 
        //  To get a list of all presets associated with the current AWS account.    
        val ListPresets = _ListPresets() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/get-job.html 
        //  To get detailed information about a job.    
        val ReadJob = _ReadJob() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/get-pipeline.html 
        //  To get detailed information about a pipeline.    
        val ReadPipeline = _ReadPipeline() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/get-preset.html 
        //  To get detailed information about a preset.    
        val ReadPreset = _ReadPreset() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/test-pipeline-role.html 
        //  To test the settings for a pipeline to ensure that Elastic Transcoder can create and process jobs.    
        val TestRole = _TestRole() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/update-pipeline.html 
        //  To update settings for a pipeline.    
        val UpdatePipeline = _UpdatePipeline() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/update-pipeline-notifications.html 
        //  To update only Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline.    
        val UpdatePipelineNotifications = _UpdatePipelineNotifications() 
        // see http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/update-pipeline-status.html 
        //  To pause or reactivate a pipeline, so the pipeline stops or restarts processing jobs, update the status for the pipeline.    
        val UpdatePipelineStatus = _UpdatePipelineStatus()
    }
      class _CancelJob : IamPolicy.Action("elastictranscoder:CancelJob") {
             //arn:aws:elastictranscoder:$region:$account:job/$job-id"
            fun job_byRegionAccountJobid(region: String, account: String, jobid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:job/$jobid")
         }       
 
      class _CreateJob : IamPolicy.Action("elastictranscoder:CreateJob") {

         }       
 
      class _CreatePipeline : IamPolicy.Action("elastictranscoder:CreatePipeline") {

         }       
 
      class _CreatePreset : IamPolicy.Action("elastictranscoder:CreatePreset") {

         }       
 
      class _DeletePipeline : IamPolicy.Action("elastictranscoder:DeletePipeline") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       
 
      class _DeletePreset : IamPolicy.Action("elastictranscoder:DeletePreset") {
             //arn:aws:elastictranscoder:$region:$account:preset/$preset-id"
            fun preset_byRegionAccountPresetid(region: String, account: String, presetid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:preset/$presetid")
         }       
 
      class _ListJobsByPipeline : IamPolicy.Action("elastictranscoder:ListJobsByPipeline") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       
 
      class _ListJobsByStatus : IamPolicy.Action("elastictranscoder:ListJobsByStatus") {

         }       
 
      class _ListPipelines : IamPolicy.Action("elastictranscoder:ListPipelines") {

         }       
 
      class _ListPresets : IamPolicy.Action("elastictranscoder:ListPresets") {

         }       
 
      class _ReadJob : IamPolicy.Action("elastictranscoder:ReadJob") {
             //arn:aws:elastictranscoder:$region:$account:job/$job-id"
            fun job_byRegionAccountJobid(region: String, account: String, jobid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:job/$jobid")
         }       
 
      class _ReadPipeline : IamPolicy.Action("elastictranscoder:ReadPipeline") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       
 
      class _ReadPreset : IamPolicy.Action("elastictranscoder:ReadPreset") {
             //arn:aws:elastictranscoder:$region:$account:preset/$preset-i"
            fun preset_byRegionAccountPreseti(region: String, account: String, preseti: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:preset/$preseti")
         }       
 
      class _TestRole : IamPolicy.Action("elastictranscoder:TestRole") {

         }       
 
      class _UpdatePipeline : IamPolicy.Action("elastictranscoder:UpdatePipeline") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       
 
      class _UpdatePipelineNotifications : IamPolicy.Action("elastictranscoder:UpdatePipelineNotifications") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       
 
      class _UpdatePipelineStatus : IamPolicy.Action("elastictranscoder:UpdatePipelineStatus") {
             //arn:aws:elastictranscoder:$region:$account:pipeline/$pipeline-id"
            fun pipeline_byRegionAccountPipelineid(region: String, account: String, pipelineid: String) = IamPolicy.Resource("arn:aws:elastictranscoder:$region:$account:pipeline/$pipelineid")
         }       


}        
