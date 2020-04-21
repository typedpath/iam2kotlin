
package com.typedpath.iam2kotlin.resources.importexport

import com.typedpath.iam2kotlin.IamPolicy

class ImportexportAction() {

    companion object { 
        val All = IamPolicy.Action("importexport:*")    
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebCreateJob.html 
        //  This action initiates the process of scheduling an upload or download of your data.    
        val CreateJob = _CreateJob() 
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebUpdateJob.html 
        //  You use this action to change the parameters specified in the original manifest file by supplying a new manifest file.    
        val UpdateJob = _UpdateJob() 
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebCancelJob.html 
        //  This action cancels a specified job.    
        val CancelJob = _CancelJob() 
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebListJobs.html 
        //  This action returns the jobs associated with the requester.    
        val ListJobs = _ListJobs() 
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebGetStatus.html 
        //  This action returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job.    
        val GetStatus = _GetStatus() 
        // see http://docs.aws.amazon.com/AWSImportExport/latest/DG/WebGetShippingLabel.html 
        //  This action generates a pre-paid shipping label that you will use to ship your device to AWS for processing.    
        val GetShippingLabel = _GetShippingLabel()
    }
      class _CreateJob : IamPolicy.Action("importexport:CreateJob") {

         }       
 
      class _UpdateJob : IamPolicy.Action("importexport:UpdateJob") {

         }       
 
      class _CancelJob : IamPolicy.Action("importexport:CancelJob") {

         }       
 
      class _ListJobs : IamPolicy.Action("importexport:ListJobs") {

         }       
 
      class _GetStatus : IamPolicy.Action("importexport:GetStatus") {

         }       
 
      class _GetShippingLabel : IamPolicy.Action("importexport:GetShippingLabel") {

         }       


}        
