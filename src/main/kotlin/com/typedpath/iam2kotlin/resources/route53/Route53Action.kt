
package com.typedpath.iam2kotlin.resources.route53

import com.typedpath.iam2kotlin.IamPolicy

class Route53Action() {

    companion object { 
        val All = IamPolicy.Action("route53:*")    
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html 
        //  This action associates an additional Amazon VPC with a private hosted zone.    
        val AssociateVPCWithHostedZone = _AssociateVPCWithHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html 
        //  Use ChangeResourceRecordSets to create, update, or delete your authoritative DNS information on all Amazon Route 53 DNS servers.    
        val ChangeResourceRecordSets = _ChangeResourceRecordSets() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeTagsForResource.html 
        //  Adds, edits, or deletes tags for a health check or a hosted zone.    
        val ChangeTagsForResource = _ChangeTagsForResource() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHealthCheck.html 
        //  Creates a new health check.    
        val CreateHealthCheck = _CreateHealthCheck() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html 
        //  This action creates a public hosted zone, which you use to specify how the Domain Name System (DNS) routes traffic on the Internet for a domain, such as example.    
        val CreateHostedZone = _CreateHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html 
        //  Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group.    
        val CreateQueryLoggingConfig = _CreateQueryLoggingConfig() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html 
        //  This action creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones.    
        val CreateReusableDelegationSet = _CreateReusableDelegationSet() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicy.html 
        //  Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.    
        val CreateTrafficPolicy = _CreateTrafficPolicy() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicyInstance.html 
        //  Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version.    
        val CreateTrafficPolicyInstance = _CreateTrafficPolicyInstance() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateTrafficPolicyVersion.html 
        //  Creates a new version of an existing traffic policy.    
        val CreateTrafficPolicyVersion = _CreateTrafficPolicyVersion() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateVPCAssociationAuthorization.html 
        //  Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account.    
        val CreateVPCAssociationAuthorization = _CreateVPCAssociationAuthorization() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteHealthCheck.html 
        //  This action deletes a health check.    
        val DeleteHealthCheck = _DeleteHealthCheck() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteHostedZone.html 
        //  This action deletes a hosted zone.    
        val DeleteHostedZone = _DeleteHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html 
        //  Deletes a configuration for DNS query logging.    
        val DeleteQueryLoggingConfig = _DeleteQueryLoggingConfig() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteReusableDelegationSet.html 
        //  This action deletes a reusable delegation set.    
        val DeleteReusableDelegationSet = _DeleteReusableDelegationSet() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicy.html 
        //  Deletes the specified version of a traffic policy.    
        val DeleteTrafficPolicy = _DeleteTrafficPolicy() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html 
        //  Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.    
        val DeleteTrafficPolicyInstance = _DeleteTrafficPolicyInstance() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteVPCAssociationAuthorization.html 
        //  Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account.    
        val DeleteVPCAssociationAuthorization = _DeleteVPCAssociationAuthorization() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_DisassociateVPCFromHostedZone.html 
        //  This action disassociates an Amazon Virtual Private Cloud from an Amazon Route 53 private hosted zone.    
        val DisassociateVPCFromHostedZone = _DisassociateVPCFromHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html 
        //  This action returns the current status of a change batch request.    
        val GetChange = _GetChange() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetCheckerIpRanges.html 
        //  Gets a list of the IP ranges used by Amazon Route 53 health checkers to check the health of your resources.    
        val GetCheckerIpRanges = _GetCheckerIpRanges() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html 
        //  Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets.    
        val GetGeoLocation = _GetGeoLocation() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHealthCheck.html 
        //  This action gets information about a specified health check.    
        val GetHealthCheck = _GetHealthCheck() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHealthCheckCount.html 
        //  Gets the total number of health checks for the current AWS account.    
        val GetHealthCheckCount = _GetHealthCheckCount() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHealthCheckLastFailureReason.html 
        //  This action gets the reason that a specified health check failed most recently.    
        val GetHealthCheckLastFailureReason = _GetHealthCheckLastFailureReason() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHealthCheckStatus.html 
        //  This action gets the current status of a specified health check endpoint as reported by each of the Amazon Route 53 health checkers.    
        val GetHealthCheckStatus = _GetHealthCheckStatus() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHostedZone.html 
        //  To retrieve information about a public hosted zone, including the four name servers assigned to the hosted zone, send a GET request to the 2013-04-01/hostedzone/Amazon Route 53 hosted zone ID resource.    
        val GetHostedZone = _GetHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetHostedZoneCount.html 
        //  Gets the total number of public and private hosted zones for the current AWS account.    
        val GetHostedZoneCount = _GetHostedZoneCount() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetQueryLoggingConfig.html 
        //  Gets information about a specified configuration for DNS query logging.    
        val GetQueryLoggingConfig = _GetQueryLoggingConfig() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSet.html 
        //  Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.    
        val GetReusableDelegationSet = _GetReusableDelegationSet() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicy.html 
        //  Gets information about a specific traffic policy version.    
        val GetTrafficPolicy = _GetTrafficPolicy() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicyInstance.html 
        //  Gets information about a specified traffic policy instance.    
        val GetTrafficPolicyInstance = _GetTrafficPolicyInstance() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetTrafficPolicyInstanceCount.html 
        //  Gets the number of traffic policy instances that are associated with the current AWS account.    
        val GetTrafficPolicyInstanceCount = _GetTrafficPolicyInstanceCount() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html 
        //  Retrieves a list of supported geo locations.    
        val ListGeoLocations = _ListGeoLocations() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListHealthChecks.html 
        //  This action gets a list of the health checks that are associated with the current AWS account.    
        val ListHealthChecks = _ListHealthChecks() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListHostedZones.html 
        //  To retrieve a list of your public and private hosted zones, send a GET request to the 2013-04-01/hostedzone resource.    
        val ListHostedZones = _ListHostedZones() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListHostedZonesByName.html 
        //  To retrieve a list of your public and private hosted zones in ASCII order by domain name, send a GET request to the 2013-04-01/hostedzonesbyname resource.    
        val ListHostedZonesByName = _ListHostedZonesByName() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html 
        //  Lists the configurations for DNS query logging that are associated with the current AWS account or the configuration that is associated with a specified hosted zone.    
        val ListQueryLoggingConfigs = _ListQueryLoggingConfigs() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListResourceRecordSets.html 
        //  To list your resource record sets, send a GET request to the 2013-04-01/hostedzone/Amazon Route 53 hosted zone ID/rrset resource.    
        val ListResourceRecordSets = _ListResourceRecordSets() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListReusableDelegationSets.html 
        //  To retrieve a list of the reusable delegation sets that are associated with the current AWS account, send a GET request to the 2013-04-01/delegationset resource.    
        val ListReusableDelegationSets = _ListReusableDelegationSets() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTagsForResource.html 
        //  Lists tags for one health check or hosted zone.    
        val ListTagsForResource = _ListTagsForResource() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTagsForResources.html 
        //  Lists tags for up to 10 health checks or hosted zones.    
        val ListTagsForResources = _ListTagsForResources() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicies.html 
        //  Gets information about the latest version for every traffic policy that is associated with the current AWS account.    
        val ListTrafficPolicies = _ListTrafficPolicies() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicyInstances.html 
        //  Gets information about the traffic policy instances that you created by using the current AWS account.    
        val ListTrafficPolicyInstances = _ListTrafficPolicyInstances() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicyInstancesByHostedZone.html 
        //  Gets information about the traffic policy instances that you created in a specified hosted zone.    
        val ListTrafficPolicyInstancesByHostedZone = _ListTrafficPolicyInstancesByHostedZone() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicyInstancesByPolicy.html 
        //  Gets information about the traffic policy instances that you created by using a specify traffic policy version.    
        val ListTrafficPolicyInstancesByPolicy = _ListTrafficPolicyInstancesByPolicy() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListTrafficPolicyVersions.html 
        //  Gets information about all of the versions for a specified traffic policy.    
        val ListTrafficPolicyVersions = _ListTrafficPolicyVersions() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListVPCAssociationAuthorizations.html 
        //  Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.    
        val ListVPCAssociationAuthorizations = _ListVPCAssociationAuthorizations() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_TestDNSAnswer.html 
        //  Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.    
        val TestDNSAnswer = _TestDNSAnswer() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html 
        //  Updates an existing health check.    
        val UpdateHealthCheck = _UpdateHealthCheck() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHostedZoneComment.html 
        //  To update the comment for a hosted zone, send a POST request to the /2013-04-01/hostedzone/hosted zone ID resource.    
        val UpdateHostedZoneComment = _UpdateHostedZoneComment() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateTrafficPolicyComment.html 
        //  Updates the comment for a specified traffic policy version.    
        val UpdateTrafficPolicyComment = _UpdateTrafficPolicyComment() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateTrafficPolicyInstance.html 
        //  Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version.    
        val UpdateTrafficPolicyInstance = _UpdateTrafficPolicyInstance() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_route53.html 
        //  This operation disables automatic renewal of your domain registration before the expiration date. (Deprecated in favor of route53domains:DisableDomainAutoRenew?)    
        val DisableDomainAutoRenew = _DisableDomainAutoRenew() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_route53.html 
        //  This operation enables automatic renewal of your domain registration before the expiration date. (Deprecated in favor of route53domains:EnableDomainAutoRenew?)    
        val EnableDomainAutoRenew = _EnableDomainAutoRenew()
    }
      class _AssociateVPCWithHostedZone : IamPolicy.Action("route53:AssociateVPCWithHostedZone") {
             //arn:aws:route53:::hostedzone/$hosted-zone-id/associatevpc"
            fun hostedzone_associatevpc_byHostedzoneid(hostedzoneid: String) = IamPolicy.Resource("arn:aws:route53:::hostedzone/$hostedzoneid/associatevpc")
         }       
 
      class _ChangeResourceRecordSets : IamPolicy.Action("route53:ChangeResourceRecordSets") {
             //arn:aws:route53:::hostedzone/$hosted-zone-id"
            fun hostedzone_byHostedzoneid(hostedzoneid: String) = IamPolicy.Resource("arn:aws:route53:::hostedzone/$hostedzoneid")
         }       
 
      class _ChangeTagsForResource : IamPolicy.Action("route53:ChangeTagsForResource") {
             //arn:aws:route53:::tags/healthcheck/$health-check-id"
            fun tags_healthcheck_byHealthcheckid(healthcheckid: String) = IamPolicy.Resource("arn:aws:route53:::tags/healthcheck/$healthcheckid")
             //arn:aws:route53:::tags/hostedzone/$hosted-zone-id"
            fun tags_hostedzone_byHostedzoneid(hostedzoneid: String) = IamPolicy.Resource("arn:aws:route53:::tags/hostedzone/$hostedzoneid")
         }       
 
      class _CreateHealthCheck : IamPolicy.Action("route53:CreateHealthCheck") {

         }       
 
      class _CreateHostedZone : IamPolicy.Action("route53:CreateHostedZone") {

         }       
 
      class _CreateQueryLoggingConfig : IamPolicy.Action("route53:CreateQueryLoggingConfig") {

         }       
 
      class _CreateReusableDelegationSet : IamPolicy.Action("route53:CreateReusableDelegationSet") {

         }       
 
      class _CreateTrafficPolicy : IamPolicy.Action("route53:CreateTrafficPolicy") {

         }       
 
      class _CreateTrafficPolicyInstance : IamPolicy.Action("route53:CreateTrafficPolicyInstance") {

         }       
 
      class _CreateTrafficPolicyVersion : IamPolicy.Action("route53:CreateTrafficPolicyVersion") {

         }       
 
      class _CreateVPCAssociationAuthorization : IamPolicy.Action("route53:CreateVPCAssociationAuthorization") {

         }       
 
      class _DeleteHealthCheck : IamPolicy.Action("route53:DeleteHealthCheck") {

         }       
 
      class _DeleteHostedZone : IamPolicy.Action("route53:DeleteHostedZone") {

         }       
 
      class _DeleteQueryLoggingConfig : IamPolicy.Action("route53:DeleteQueryLoggingConfig") {

         }       
 
      class _DeleteReusableDelegationSet : IamPolicy.Action("route53:DeleteReusableDelegationSet") {

         }       
 
      class _DeleteTrafficPolicy : IamPolicy.Action("route53:DeleteTrafficPolicy") {

         }       
 
      class _DeleteTrafficPolicyInstance : IamPolicy.Action("route53:DeleteTrafficPolicyInstance") {

         }       
 
      class _DeleteVPCAssociationAuthorization : IamPolicy.Action("route53:DeleteVPCAssociationAuthorization") {

         }       
 
      class _DisassociateVPCFromHostedZone : IamPolicy.Action("route53:DisassociateVPCFromHostedZone") {

         }       
 
      class _GetChange : IamPolicy.Action("route53:GetChange") {

         }       
 
      class _GetCheckerIpRanges : IamPolicy.Action("route53:GetCheckerIpRanges") {

         }       
 
      class _GetGeoLocation : IamPolicy.Action("route53:GetGeoLocation") {

         }       
 
      class _GetHealthCheck : IamPolicy.Action("route53:GetHealthCheck") {

         }       
 
      class _GetHealthCheckCount : IamPolicy.Action("route53:GetHealthCheckCount") {

         }       
 
      class _GetHealthCheckLastFailureReason : IamPolicy.Action("route53:GetHealthCheckLastFailureReason") {

         }       
 
      class _GetHealthCheckStatus : IamPolicy.Action("route53:GetHealthCheckStatus") {

         }       
 
      class _GetHostedZone : IamPolicy.Action("route53:GetHostedZone") {

         }       
 
      class _GetHostedZoneCount : IamPolicy.Action("route53:GetHostedZoneCount") {

         }       
 
      class _GetQueryLoggingConfig : IamPolicy.Action("route53:GetQueryLoggingConfig") {

         }       
 
      class _GetReusableDelegationSet : IamPolicy.Action("route53:GetReusableDelegationSet") {

         }       
 
      class _GetTrafficPolicy : IamPolicy.Action("route53:GetTrafficPolicy") {

         }       
 
      class _GetTrafficPolicyInstance : IamPolicy.Action("route53:GetTrafficPolicyInstance") {

         }       
 
      class _GetTrafficPolicyInstanceCount : IamPolicy.Action("route53:GetTrafficPolicyInstanceCount") {

         }       
 
      class _ListGeoLocations : IamPolicy.Action("route53:ListGeoLocations") {

         }       
 
      class _ListHealthChecks : IamPolicy.Action("route53:ListHealthChecks") {

         }       
 
      class _ListHostedZones : IamPolicy.Action("route53:ListHostedZones") {

         }       
 
      class _ListHostedZonesByName : IamPolicy.Action("route53:ListHostedZonesByName") {

         }       
 
      class _ListQueryLoggingConfigs : IamPolicy.Action("route53:ListQueryLoggingConfigs") {

         }       
 
      class _ListResourceRecordSets : IamPolicy.Action("route53:ListResourceRecordSets") {

         }       
 
      class _ListReusableDelegationSets : IamPolicy.Action("route53:ListReusableDelegationSets") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("route53:ListTagsForResource") {
             //arn:aws:route53:::tags/healthcheck/$health-check-id"
            fun tags_healthcheck_byHealthcheckid(healthcheckid: String) = IamPolicy.Resource("arn:aws:route53:::tags/healthcheck/$healthcheckid")
             //arn:aws:route53:::tags/hostedzone/$hosted-zone-id"
            fun tags_hostedzone_byHostedzoneid(hostedzoneid: String) = IamPolicy.Resource("arn:aws:route53:::tags/hostedzone/$hostedzoneid")
         }       
 
      class _ListTagsForResources : IamPolicy.Action("route53:ListTagsForResources") {
             //arn:aws:route53:::tags/healthcheck/*"
            fun arnawsroute53tagshealthcheckAll() = IamPolicy.Resource("arn:aws:route53:::tags/healthcheck/*")
             //arn:aws:route53:::tags/hostedzone/*"
            fun arnawsroute53tagshostedzoneAll() = IamPolicy.Resource("arn:aws:route53:::tags/hostedzone/*")
         }       
 
      class _ListTrafficPolicies : IamPolicy.Action("route53:ListTrafficPolicies") {

         }       
 
      class _ListTrafficPolicyInstances : IamPolicy.Action("route53:ListTrafficPolicyInstances") {

         }       
 
      class _ListTrafficPolicyInstancesByHostedZone : IamPolicy.Action("route53:ListTrafficPolicyInstancesByHostedZone") {

         }       
 
      class _ListTrafficPolicyInstancesByPolicy : IamPolicy.Action("route53:ListTrafficPolicyInstancesByPolicy") {

         }       
 
      class _ListTrafficPolicyVersions : IamPolicy.Action("route53:ListTrafficPolicyVersions") {

         }       
 
      class _ListVPCAssociationAuthorizations : IamPolicy.Action("route53:ListVPCAssociationAuthorizations") {

         }       
 
      class _TestDNSAnswer : IamPolicy.Action("route53:TestDNSAnswer") {

         }       
 
      class _UpdateHealthCheck : IamPolicy.Action("route53:UpdateHealthCheck") {

         }       
 
      class _UpdateHostedZoneComment : IamPolicy.Action("route53:UpdateHostedZoneComment") {

         }       
 
      class _UpdateTrafficPolicyComment : IamPolicy.Action("route53:UpdateTrafficPolicyComment") {

         }       
 
      class _UpdateTrafficPolicyInstance : IamPolicy.Action("route53:UpdateTrafficPolicyInstance") {

         }       
 
      class _DisableDomainAutoRenew : IamPolicy.Action("route53:DisableDomainAutoRenew") {

         }       
 
      class _EnableDomainAutoRenew : IamPolicy.Action("route53:EnableDomainAutoRenew") {

         }       


}        
