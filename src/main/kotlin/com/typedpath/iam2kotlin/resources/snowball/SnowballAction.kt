
package com.typedpath.iam2kotlin.resources.snowball

import com.typedpath.iam2kotlin.IamPolicy

class SnowballAction() {

    companion object { 
        val All = IamPolicy.Action("snowball:*")    
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_CancelCluster.html 
        //  Cancels a cluster job.    
        val CancelCluster = _CancelCluster() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_CancelJob.html 
        //  Cancels the specified job.    
        val CancelJob = _CancelJob() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_CreateAddress.html 
        //  Creates an address for a Snowball to be shipped to.    
        val CreateAddress = _CreateAddress() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_CreateCluster.html 
        //  Creates an empty cluster.    
        val CreateCluster = _CreateCluster() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_CreateJob.html 
        //  Creates a job to import or export data between Amazon S3 and your on-premises data center.    
        val CreateJob = _CreateJob() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_DescribeAddress.html 
        //  Takes an AddressId and returns specific details about that address in the form of an Address object.    
        val DescribeAddress = _DescribeAddress() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_DescribeAddresses.html 
        //  Returns a specified number of ADDRESS objects.    
        val DescribeAddresses = _DescribeAddresses() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_DescribeCluster.html 
        //  Returns information about a specific cluster including shipping information, cluster status, and other important metadata.    
        val DescribeCluster = _DescribeCluster() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_DescribeJob.html 
        //  Returns information about a specific job including shipping information, job status, and other important metadata.    
        val DescribeJob = _DescribeJob() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_GetJobManifest.html 
        //  Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified JobId value.    
        val GetJobManifest = _GetJobManifest() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_GetJobUnlockCode.html 
        //  Returns the UnlockCode code value for the specified job.    
        val GetJobUnlockCode = _GetJobUnlockCode() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_GetSnowballUsage.html 
        //  Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use.    
        val GetSnowballUsage = _GetSnowballUsage() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_ListClusterJobs.html 
        //  Returns an array of JobListEntry objects of the specified length.    
        val ListClusterJobs = _ListClusterJobs() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_ListClusters.html 
        //  Returns an array of ClusterListEntry objects of the specified length.    
        val ListClusters = _ListClusters() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_ListJobs.html 
        //  Returns an array of JobListEntry objects of the specified length.    
        val ListJobs = _ListJobs() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_UpdateCluster.html 
        //  While a cluster's ClusterState value is in the AwaitingQuorum state, you can update some of the information associated with a cluster.    
        val UpdateCluster = _UpdateCluster() 
        // see http://docs.aws.amazon.com//snowball/latest/api-reference/API_UpdateJob.html 
        //  While a job's JobState value is New, you can update some of the information associated with a job.    
        val UpdateJob = _UpdateJob()
    }
      class _CancelCluster : IamPolicy.Action("snowball:CancelCluster") {

         }       
 
      class _CancelJob : IamPolicy.Action("snowball:CancelJob") {

         }       
 
      class _CreateAddress : IamPolicy.Action("snowball:CreateAddress") {

         }       
 
      class _CreateCluster : IamPolicy.Action("snowball:CreateCluster") {

         }       
 
      class _CreateJob : IamPolicy.Action("snowball:CreateJob") {

         }       
 
      class _DescribeAddress : IamPolicy.Action("snowball:DescribeAddress") {

         }       
 
      class _DescribeAddresses : IamPolicy.Action("snowball:DescribeAddresses") {

         }       
 
      class _DescribeCluster : IamPolicy.Action("snowball:DescribeCluster") {

         }       
 
      class _DescribeJob : IamPolicy.Action("snowball:DescribeJob") {

         }       
 
      class _GetJobManifest : IamPolicy.Action("snowball:GetJobManifest") {

         }       
 
      class _GetJobUnlockCode : IamPolicy.Action("snowball:GetJobUnlockCode") {

         }       
 
      class _GetSnowballUsage : IamPolicy.Action("snowball:GetSnowballUsage") {

         }       
 
      class _ListClusterJobs : IamPolicy.Action("snowball:ListClusterJobs") {

         }       
 
      class _ListClusters : IamPolicy.Action("snowball:ListClusters") {

         }       
 
      class _ListJobs : IamPolicy.Action("snowball:ListJobs") {

         }       
 
      class _UpdateCluster : IamPolicy.Action("snowball:UpdateCluster") {

         }       
 
      class _UpdateJob : IamPolicy.Action("snowball:UpdateJob") {

         }       


}        
