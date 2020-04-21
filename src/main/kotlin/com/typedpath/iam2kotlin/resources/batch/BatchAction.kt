
package com.typedpath.iam2kotlin.resources.batch

import com.typedpath.iam2kotlin.IamPolicy

class BatchAction() {

    companion object { 
        val All = IamPolicy.Action("batch:*")    
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_CancelJob.html 
        //  Cancels jobs in an AWS Batch job queue.    
        val CancelJob = _CancelJob() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_CreateComputeEnvironment.html 
        //  Creates an AWS Batch compute environment.    
        val CreateComputeEnvironment = _CreateComputeEnvironment() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_CreateJobQueue.html 
        //  Creates an AWS Batch job queue.    
        val CreateJobQueue = _CreateJobQueue() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DeleteComputeEnvironment.html 
        //  Deletes an AWS Batch compute environment.    
        val DeleteComputeEnvironment = _DeleteComputeEnvironment() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DeleteJobQueue.html 
        //  Deletes the specified job queue.    
        val DeleteJobQueue = _DeleteJobQueue() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DeregisterJobDefinition.html 
        //  Deregisters an AWS Batch job definition.    
        val DeregisterJobDefinition = _DeregisterJobDefinition() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeComputeEnvironments.html 
        //  Describes one or more of your compute environments.    
        val DescribeComputeEnvironments = _DescribeComputeEnvironments() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobDefinitions.html 
        //  Describes a list of job definitions.    
        val DescribeJobDefinitions = _DescribeJobDefinitions() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobQueues.html 
        //  Describes one or more of your job queues.    
        val DescribeJobQueues = _DescribeJobQueues() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_DescribeJobs.html 
        //  Describes a list of AWS Batch jobs.    
        val DescribeJobs = _DescribeJobs() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_ListJobs.html 
        //  Returns a list of task jobs for a specified job queue.    
        val ListJobs = _ListJobs() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html 
        //  Registers an AWS Batch job definition.    
        val RegisterJobDefinition = _RegisterJobDefinition() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_SubmitJob.html 
        //  Submits an AWS Batch job from a job definition.    
        val SubmitJob = _SubmitJob() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_TerminateJob.html 
        //  Terminates jobs in a job queue.    
        val TerminateJob = _TerminateJob() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_UpdateComputeEnvironment.html 
        //  Updates an AWS Batch compute environment.    
        val UpdateComputeEnvironment = _UpdateComputeEnvironment() 
        // see http://docs.aws.amazon.com/batch/latest/APIReference/API_UpdateJobQueue.html 
        //  Updates a job queue.    
        val UpdateJobQueue = _UpdateJobQueue()
    }
      class _CancelJob : IamPolicy.Action("batch:CancelJob") {

         }       
 
      class _CreateComputeEnvironment : IamPolicy.Action("batch:CreateComputeEnvironment") {

         }       
 
      class _CreateJobQueue : IamPolicy.Action("batch:CreateJobQueue") {

         }       
 
      class _DeleteComputeEnvironment : IamPolicy.Action("batch:DeleteComputeEnvironment") {

         }       
 
      class _DeleteJobQueue : IamPolicy.Action("batch:DeleteJobQueue") {

         }       
 
      class _DeregisterJobDefinition : IamPolicy.Action("batch:DeregisterJobDefinition") {

         }       
 
      class _DescribeComputeEnvironments : IamPolicy.Action("batch:DescribeComputeEnvironments") {

         }       
 
      class _DescribeJobDefinitions : IamPolicy.Action("batch:DescribeJobDefinitions") {

         }       
 
      class _DescribeJobQueues : IamPolicy.Action("batch:DescribeJobQueues") {

         }       
 
      class _DescribeJobs : IamPolicy.Action("batch:DescribeJobs") {

         }       
 
      class _ListJobs : IamPolicy.Action("batch:ListJobs") {

         }       
 
      class _RegisterJobDefinition : IamPolicy.Action("batch:RegisterJobDefinition") {

         }       
 
      class _SubmitJob : IamPolicy.Action("batch:SubmitJob") {

         }       
 
      class _TerminateJob : IamPolicy.Action("batch:TerminateJob") {

         }       
 
      class _UpdateComputeEnvironment : IamPolicy.Action("batch:UpdateComputeEnvironment") {

         }       
 
      class _UpdateJobQueue : IamPolicy.Action("batch:UpdateJobQueue") {

         }       


}        
