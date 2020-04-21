
package com.typedpath.iam2kotlin.resources.mobiletargeting

import com.typedpath.iam2kotlin.IamPolicy

class MobiletargetingAction() {

    companion object { 
        val All = IamPolicy.Action("mobiletargeting:*")    
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Import endpoint definitions from Amazon S3 to create a segment.    
        val CreateImportJob = _CreateImportJob() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Create a campaign for an app.    
        val CreateCampaign = _CreateCampaign() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Create a segment that is based on endpoint data reported to Amazon Pinpoint by your app.    
        val CreateSegment = _CreateSegment() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val DeleteAdmChannel = _DeleteAdmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Delete the APNs channel for an app.    
        val DeleteApnsChannel = _DeleteApnsChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val DeleteApnsSandboxChannel = _DeleteApnsSandboxChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Delete a specific campaign.    
        val DeleteCampaign = _DeleteCampaign() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Delete the GCM channel for an app.    
        val DeleteGcmChannel = _DeleteGcmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Delete a specific segment.    
        val DeleteSegment = _DeleteSegment() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val GetAdmChannel = _GetAdmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the APNs channel for an app.    
        val GetApnsChannel = _GetApnsChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val GetApnsSandboxChannel = _GetApnsSandboxChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve the default settings for an app.    
        val GetApplicationSettings = _GetApplicationSettings() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific campaign.    
        val GetCampaign = _GetCampaign() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the activities performed by a campaign.    
        val GetCampaignActivities = _GetCampaignActivities() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about all campaigns for an app.    
        val GetCampaigns = _GetCampaigns() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific campaign version.    
        val GetCampaignVersion = _GetCampaignVersion() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the current and prior versions of a campaign.    
        val GetCampaignVersions = _GetCampaignVersions() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific endpoint.    
        val GetEndpoint = _GetEndpoint() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the GCM channel for an app.    
        val GetGcmChannel = _GetGcmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific import job.    
        val GetImportJob = _GetImportJob() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  etrieve information about all import jobs for an app.    
        val GetImportJobs = _GetImportJobs() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  View analytics in the Amazon Pinpoint console.    
        val GetReports = _GetReports() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific segment.    
        val GetSegment = _GetSegment() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about jobs that create segments by importing endpoint definitions from Amazon S3.    
        val GetSegmentImportJobs = _GetSegmentImportJobs() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the segments for an app.    
        val GetSegments = _GetSegments() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about a specific segment version.    
        val GetSegmentVersion = _GetSegmentVersion() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Retrieve information about the current and prior versions of a segment.    
        val GetSegmentVersions = _GetSegmentVersions() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val UpdateAdmChannel = _UpdateAdmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Update the Apple Push Notification service (APNs) certificate and private key, which allow Amazon Pinpoint to send push notifications to your iOS app.    
        val UpdateApnsChannel = _UpdateApnsChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  ???    
        val UpdateApnsSandboxChannel = _UpdateApnsSandboxChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Update the default settings for an app.    
        val UpdateApplicationSettings = _UpdateApplicationSettings() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Update a specific campaign.    
        val UpdateCampaign = _UpdateCampaign() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Create an endpoint or update the information for an endpoint.    
        val UpdateEndpoint = _UpdateEndpoint() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Create or update endpoints as a batch operation.    
        val UpdateEndpointsBatch = _UpdateEndpointsBatch() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Update the Firebase Cloud Messaging (FCM) or Google Cloud Messaging (GCM) API key, which allows Amazon Pinpoint to send push notifications to your Android app.    
        val UpdateGcmChannel = _UpdateGcmChannel() 
        // see http://docs.aws.amazon.com/pinpoint/latest/developerguide/permissions-actions.html#permissions-actions-apiactions 
        //  Update a specific segment.    
        val UpdateSegment = _UpdateSegment()
    }
      class _CreateImportJob : IamPolicy.Action("mobiletargeting:CreateImportJob") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid")
         }       
 
      class _CreateCampaign : IamPolicy.Action("mobiletargeting:CreateCampaign") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _CreateSegment : IamPolicy.Action("mobiletargeting:CreateSegment") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _DeleteAdmChannel : IamPolicy.Action("mobiletargeting:DeleteAdmChannel") {

         }       
 
      class _DeleteApnsChannel : IamPolicy.Action("mobiletargeting:DeleteApnsChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/apns"
            fun apps_channels_apns_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/apns")
         }       
 
      class _DeleteApnsSandboxChannel : IamPolicy.Action("mobiletargeting:DeleteApnsSandboxChannel") {

         }       
 
      class _DeleteCampaign : IamPolicy.Action("mobiletargeting:DeleteCampaign") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _DeleteGcmChannel : IamPolicy.Action("mobiletargeting:DeleteGcmChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/gcm"
            fun apps_channels_gcm_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/gcm")
         }       
 
      class _DeleteSegment : IamPolicy.Action("mobiletargeting:DeleteSegment") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       
 
      class _GetAdmChannel : IamPolicy.Action("mobiletargeting:GetAdmChannel") {

         }       
 
      class _GetApnsChannel : IamPolicy.Action("mobiletargeting:GetApnsChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/apns"
            fun apps_channels_apns_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/apns")
         }       
 
      class _GetApnsSandboxChannel : IamPolicy.Action("mobiletargeting:GetApnsSandboxChannel") {

         }       
 
      class _GetApplicationSettings : IamPolicy.Action("mobiletargeting:GetApplicationSettings") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _GetCampaign : IamPolicy.Action("mobiletargeting:GetCampaign") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _GetCampaignActivities : IamPolicy.Action("mobiletargeting:GetCampaignActivities") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _GetCampaigns : IamPolicy.Action("mobiletargeting:GetCampaigns") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid")
         }       
 
      class _GetCampaignVersion : IamPolicy.Action("mobiletargeting:GetCampaignVersion") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _GetCampaignVersions : IamPolicy.Action("mobiletargeting:GetCampaignVersions") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _GetEndpoint : IamPolicy.Action("mobiletargeting:GetEndpoint") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/endpoints/$endpoint-id"
            fun apps_endpoints_byRegionAccountApplicationidEndpointid(region: String, account: String, applicationid: String, endpointid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/endpoints/$endpointid")
         }       
 
      class _GetGcmChannel : IamPolicy.Action("mobiletargeting:GetGcmChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/gcm"
            fun apps_channels_gcm_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/gcm")
         }       
 
      class _GetImportJob : IamPolicy.Action("mobiletargeting:GetImportJob") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/jobs/import/$job-id"
            fun apps_jobs_import_byRegionAccountApplicationidJobid(region: String, account: String, applicationid: String, jobid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/jobs/import/$jobid")
         }       
 
      class _GetImportJobs : IamPolicy.Action("mobiletargeting:GetImportJobs") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _GetReports : IamPolicy.Action("mobiletargeting:GetReports") {
             //arn:aws:mobiletargeting:$region:$account:reports"
            fun reports_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:reports")
         }       
 
      class _GetSegment : IamPolicy.Action("mobiletargeting:GetSegment") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       
 
      class _GetSegmentImportJobs : IamPolicy.Action("mobiletargeting:GetSegmentImportJobs") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       
 
      class _GetSegments : IamPolicy.Action("mobiletargeting:GetSegments") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _GetSegmentVersion : IamPolicy.Action("mobiletargeting:GetSegmentVersion") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       
 
      class _GetSegmentVersions : IamPolicy.Action("mobiletargeting:GetSegmentVersions") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       
 
      class _UpdateAdmChannel : IamPolicy.Action("mobiletargeting:UpdateAdmChannel") {

         }       
 
      class _UpdateApnsChannel : IamPolicy.Action("mobiletargeting:UpdateApnsChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/apns"
            fun apps_channels_apns_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/apns")
         }       
 
      class _UpdateApnsSandboxChannel : IamPolicy.Action("mobiletargeting:UpdateApnsSandboxChannel") {

         }       
 
      class _UpdateApplicationSettings : IamPolicy.Action("mobiletargeting:UpdateApplicationSettings") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _UpdateCampaign : IamPolicy.Action("mobiletargeting:UpdateCampaign") {
             //arn:aws:mobiletargeting:$region:$account:/apps/$application-id/campaigns/$campaign-id"
            fun apps_campaigns_byRegionAccountApplicationidCampaignid(region: String, account: String, applicationid: String, campaignid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:/apps/$applicationid/campaigns/$campaignid")
         }       
 
      class _UpdateEndpoint : IamPolicy.Action("mobiletargeting:UpdateEndpoint") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/endpoints/$endpoint-id"
            fun apps_endpoints_byRegionAccountApplicationidEndpointid(region: String, account: String, applicationid: String, endpointid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/endpoints/$endpointid")
         }       
 
      class _UpdateEndpointsBatch : IamPolicy.Action("mobiletargeting:UpdateEndpointsBatch") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id"
            fun apps_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid")
         }       
 
      class _UpdateGcmChannel : IamPolicy.Action("mobiletargeting:UpdateGcmChannel") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/channels/gcm"
            fun apps_channels_gcm_byRegionAccountApplicationid(region: String, account: String, applicationid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/channels/gcm")
         }       
 
      class _UpdateSegment : IamPolicy.Action("mobiletargeting:UpdateSegment") {
             //arn:aws:mobiletargeting:$region:$account:apps/$application-id/segments/$segment-id"
            fun apps_segments_byRegionAccountApplicationidSegmentid(region: String, account: String, applicationid: String, segmentid: String) = IamPolicy.Resource("arn:aws:mobiletargeting:$region:$account:apps/$applicationid/segments/$segmentid")
         }       


}        
