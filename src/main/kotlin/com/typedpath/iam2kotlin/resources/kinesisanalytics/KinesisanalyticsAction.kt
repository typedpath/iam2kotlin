
package com.typedpath.iam2kotlin.resources.kinesisanalytics

import com.typedpath.iam2kotlin.IamPolicy

class KinesisanalyticsAction() {

    companion object { 
        val All = IamPolicy.Action("kinesisanalytics:*")    
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationInput.html 
        //  Adds a streaming source to your Amazon Kinesis application.    
        val AddApplicationInput = _AddApplicationInput() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationOutput.html 
        //  Adds an external destination to your Amazon Kinesis Analytics application.    
        val AddApplicationOutput = _AddApplicationOutput() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_AddApplicationReferenceDataSource.html 
        //  Adds a reference data source to an existing application.    
        val AddApplicationReferenceDataSource = _AddApplicationReferenceDataSource() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_CreateApplication.html 
        //  Creates an Amazon Kinesis Analytics application.    
        val CreateApplication = _CreateApplication() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DeleteApplication.html 
        //  Deletes the specified application.    
        val DeleteApplication = _DeleteApplication() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DeleteApplicationOutput.html 
        //  Deletes output destination configuration from your application configuration.    
        val DeleteApplicationOutput = _DeleteApplicationOutput() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DeleteApplicationReferenceDataSource.html 
        //  Deletes a reference data source configuration from the specified application configuration.    
        val DeleteApplicationReferenceDataSource = _DeleteApplicationReferenceDataSource() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DescribeApplication.html 
        //  Returns information about a specific Amazon Kinesis Analytics application.    
        val DescribeApplication = _DescribeApplication() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_DiscoverInputSchema.html 
        //  Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream).    
        val DiscoverInputSchema = _DiscoverInputSchema() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_ListApplications.html 
        //  Returns a list of Amazon Kinesis Analytics applications in your account.    
        val ListApplications = _ListApplications() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_StartApplication.html 
        //  Starts the specified Amazon Kinesis Analytics application.    
        val StartApplication = _StartApplication() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_StopApplication.html 
        //  Stops the application from processing input data.    
        val StopApplication = _StopApplication() 
        // see http://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html 
        //  Updates an existing Amazon Kinesis Analytics application.    
        val UpdateApplication = _UpdateApplication()
    }
      class _AddApplicationInput : IamPolicy.Action("kinesisanalytics:AddApplicationInput") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _AddApplicationOutput : IamPolicy.Action("kinesisanalytics:AddApplicationOutput") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _AddApplicationReferenceDataSource : IamPolicy.Action("kinesisanalytics:AddApplicationReferenceDataSource") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _CreateApplication : IamPolicy.Action("kinesisanalytics:CreateApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _DeleteApplication : IamPolicy.Action("kinesisanalytics:DeleteApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _DeleteApplicationOutput : IamPolicy.Action("kinesisanalytics:DeleteApplicationOutput") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _DeleteApplicationReferenceDataSource : IamPolicy.Action("kinesisanalytics:DeleteApplicationReferenceDataSource") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _DescribeApplication : IamPolicy.Action("kinesisanalytics:DescribeApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _DiscoverInputSchema : IamPolicy.Action("kinesisanalytics:DiscoverInputSchema") {

         }       
 
      class _ListApplications : IamPolicy.Action("kinesisanalytics:ListApplications") {

         }       
 
      class _StartApplication : IamPolicy.Action("kinesisanalytics:StartApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _StopApplication : IamPolicy.Action("kinesisanalytics:StopApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       
 
      class _UpdateApplication : IamPolicy.Action("kinesisanalytics:UpdateApplication") {
             //arn:aws:kinesisanalytics:$region:$account:application/$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:kinesisanalytics:$region:$account:application/$applicationname")
         }       


}        
