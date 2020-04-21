
package com.typedpath.iam2kotlin.resources.cloudtrail

import com.typedpath.iam2kotlin.IamPolicy

class CloudtrailAction() {

    companion object { 
        val All = IamPolicy.Action("cloudtrail:*")    
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AddTags.html 
        //  Adds one or more tags to a trail, up to a limit of 50.    
        val AddTags = _AddTags() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_CreateTrail.html 
        //  Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.    
        val CreateTrail = _CreateTrail() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_DeleteTrail.html 
        //  Deletes a trail.    
        val DeleteTrail = _DeleteTrail() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_DescribeTrails.html 
        //  Retrieves settings for the trail associated with the current region for your account.    
        val DescribeTrails = _DescribeTrails() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_GetTrailStatus.html 
        //  Returns a JSON-formatted list of information about the specified trail.    
        val GetTrailStatus = _GetTrailStatus() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_ListPublicKeys.html 
        //  Returns all public keys whose private keys were used to sign the digest files within the specified time range.    
        val ListPublicKeys = _ListPublicKeys() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_ListTags.html 
        //  Lists the tags for the trail in the current region.    
        val ListTags = _ListTags() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_LookupEvents.html 
        //  Looks up API activity events captured by CloudTrail that create, update, or delete resources in your account.    
        val LookupEvents = _LookupEvents() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_RemoveTags.html 
        //  Removes the specified tags from a trail.    
        val RemoveTags = _RemoveTags() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_StartLogging.html 
        //  Starts the recording of AWS API calls and log file delivery for a trail.    
        val StartLogging = _StartLogging() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_StopLogging.html 
        //  Suspends the recording of AWS API calls and log file delivery for the specified trail.    
        val StopLogging = _StopLogging() 
        // see http://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_UpdateTrail.html 
        //  Updates the settings that specify delivery of log files.    
        val UpdateTrail = _UpdateTrail()
    }
      class _AddTags : IamPolicy.Action("cloudtrail:AddTags") {

         }       
 
      class _CreateTrail : IamPolicy.Action("cloudtrail:CreateTrail") {

         }       
 
      class _DeleteTrail : IamPolicy.Action("cloudtrail:DeleteTrail") {

         }       
 
      class _DescribeTrails : IamPolicy.Action("cloudtrail:DescribeTrails") {

         }       
 
      class _GetTrailStatus : IamPolicy.Action("cloudtrail:GetTrailStatus") {

         }       
 
      class _ListPublicKeys : IamPolicy.Action("cloudtrail:ListPublicKeys") {

         }       
 
      class _ListTags : IamPolicy.Action("cloudtrail:ListTags") {

         }       
 
      class _LookupEvents : IamPolicy.Action("cloudtrail:LookupEvents") {

         }       
 
      class _RemoveTags : IamPolicy.Action("cloudtrail:RemoveTags") {

         }       
 
      class _StartLogging : IamPolicy.Action("cloudtrail:StartLogging") {
             //arn:aws:cloudtrail:$region:$account:trail/$trailname"
            fun trail_byRegionAccountTrailname(region: String, account: String, trailname: String) = IamPolicy.Resource("arn:aws:cloudtrail:$region:$account:trail/$trailname")
         }       
 
      class _StopLogging : IamPolicy.Action("cloudtrail:StopLogging") {
             //arn:aws:cloudtrail:$region:$account:trail/$trailname"
            fun trail_byRegionAccountTrailname(region: String, account: String, trailname: String) = IamPolicy.Resource("arn:aws:cloudtrail:$region:$account:trail/$trailname")
         }       
 
      class _UpdateTrail : IamPolicy.Action("cloudtrail:UpdateTrail") {

         }       


}        
