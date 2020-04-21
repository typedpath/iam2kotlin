
package com.typedpath.iam2kotlin.resources.route53domains

import com.typedpath.iam2kotlin.IamPolicy

class Route53domainsAction() {

    companion object { 
        val All = IamPolicy.Action("route53domains:*")    
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_CheckDomainAvailability.html 
        //  This operation checks the availability of one domain name.    
        val CheckDomainAvailability = _CheckDomainAvailability() 
        // see https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-delete.html 
        //  ???    
        val DeleteDomain = _DeleteDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_DeleteTagsForDomain.html 
        //  This operation deletes the specified tags for a domain.    
        val DeleteTagsForDomain = _DeleteTagsForDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_DisableDomainAutoRenew.html 
        //  This operation disables automatic renewal of domain registration for the specified domain.    
        val DisableDomainAutoRenew = _DisableDomainAutoRenew() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_DisableDomainTransferLock.html 
        //  This operation removes the transfer lock on the domain (specifically the clientTransferProhibited status) to allow domain transfers.    
        val DisableDomainTransferLock = _DisableDomainTransferLock() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_EnableDomainAutoRenew.html 
        //  This operation configures Amazon Route 53 to automatically renew the specified domain before the domain registration expires.    
        val EnableDomainAutoRenew = _EnableDomainAutoRenew() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_EnableDomainTransferLock.html 
        //  This operation sets the transfer lock on the domain (specifically the clientTransferProhibited status) to prevent domain transfers.    
        val EnableDomainTransferLock = _EnableDomainTransferLock() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetContactReachabilityStatus.html 
        //  This operation returns information about whether the registrant contact has responded.    
        val GetContactReachabilityStatus = _GetContactReachabilityStatus() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html 
        //  This operation returns detailed information about the domain.    
        val GetDomainDetail = _GetDomainDetail() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainSuggestions.html 
        //  This operation returns a list of suggested domain names.    
        val GetDomainSuggestions = _GetDomainSuggestions() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html 
        //  This operation returns the current status of an operation that is not completed.    
        val GetOperationDetail = _GetOperationDetail() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListDomains.html 
        //  This operation returns all the domain names that were registered by using Amazon Route 53 for the current AWS account.    
        val ListDomains = _ListDomains() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html 
        //  This operation returns the operation IDs of operations that are not yet complete.    
        val ListOperations = _ListOperations() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListTagsForDomain.html 
        //  This operation lists all of the tags that are associated with a specified domain.    
        val ListTagsForDomain = _ListTagsForDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RegisterDomain.html 
        //  This operation registers a domain.    
        val RegisterDomain = _RegisterDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RenewDomain.html 
        //  This operation renews a domain for the specified number of years.    
        val RenewDomain = _RenewDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ResendContactReachabilityEmail.html 
        //  This operation resends the confirmation email to the current email address for the registrant contact.    
        val ResendContactReachabilityEmail = _ResendContactReachabilityEmail() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RetrieveDomainAuthCode.html 
        //  This operation returns the AuthCode for the domain.    
        val RetrieveDomainAuthCode = _RetrieveDomainAuthCode() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomain.html 
        //  This method transfers a domain from another registrar to Amazon Route 53.    
        val TransferDomain = _TransferDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainContact.html 
        //  This operation updates the contact information for a particular domain.    
        val UpdateDomainContact = _UpdateDomainContact() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainContactPrivacy.html 
        //  This operation updates the specified domain contact's privacy setting.    
        val UpdateDomainContactPrivacy = _UpdateDomainContactPrivacy() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html 
        //  This operation replaces the current set of name servers for the domain with the specified set of name servers.    
        val UpdateDomainNameservers = _UpdateDomainNameservers() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateTagsForDomain.html 
        //  This operation adds or updates tags for a specified domain.    
        val UpdateTagsForDomain = _UpdateTagsForDomain() 
        // see https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ViewBilling.html 
        //  Returns all the domain-related billing records for the current AWS account for a specified period    
        val ViewBilling = _ViewBilling() 
        // see https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/r53-api-permissions-ref.html 
        //  This permission is required for DisableDomainAutoRenew and EnableDomainAutoRenew.    
        val ChangeAutoRenew = _ChangeAutoRenew() 
        // see https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-configure-dnssec.html 
        //  (console only)    
        val ListDnssec = _ListDnssec() 
        // see https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-configure-dnssec.html 
        //  (console only)    
        val AddDnssec = _AddDnssec() 
        // see https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-configure-dnssec.html 
        //  (console only)    
        val RemoveDnssec = _RemoveDnssec()
    }
      class _CheckDomainAvailability : IamPolicy.Action("route53domains:CheckDomainAvailability") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _DeleteDomain : IamPolicy.Action("route53domains:DeleteDomain") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _DeleteTagsForDomain : IamPolicy.Action("route53domains:DeleteTagsForDomain") {
             //arn:aws:route53domains:::tags/*"
            fun arnawsroute53domainstagsAll() = IamPolicy.Resource("arn:aws:route53domains:::tags/*")
         }       
 
      class _DisableDomainAutoRenew : IamPolicy.Action("route53domains:DisableDomainAutoRenew") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _DisableDomainTransferLock : IamPolicy.Action("route53domains:DisableDomainTransferLock") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _EnableDomainAutoRenew : IamPolicy.Action("route53domains:EnableDomainAutoRenew") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _EnableDomainTransferLock : IamPolicy.Action("route53domains:EnableDomainTransferLock") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _GetContactReachabilityStatus : IamPolicy.Action("route53domains:GetContactReachabilityStatus") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _GetDomainDetail : IamPolicy.Action("route53domains:GetDomainDetail") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _GetDomainSuggestions : IamPolicy.Action("route53domains:GetDomainSuggestions") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _GetOperationDetail : IamPolicy.Action("route53domains:GetOperationDetail") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ListDomains : IamPolicy.Action("route53domains:ListDomains") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ListOperations : IamPolicy.Action("route53domains:ListOperations") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ListTagsForDomain : IamPolicy.Action("route53domains:ListTagsForDomain") {
             //arn:aws:route53domains:::tags/*"
            fun arnawsroute53domainstagsAll() = IamPolicy.Resource("arn:aws:route53domains:::tags/*")
         }       
 
      class _RegisterDomain : IamPolicy.Action("route53domains:RegisterDomain") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _RenewDomain : IamPolicy.Action("route53domains:RenewDomain") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ResendContactReachabilityEmail : IamPolicy.Action("route53domains:ResendContactReachabilityEmail") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _RetrieveDomainAuthCode : IamPolicy.Action("route53domains:RetrieveDomainAuthCode") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _TransferDomain : IamPolicy.Action("route53domains:TransferDomain") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _UpdateDomainContact : IamPolicy.Action("route53domains:UpdateDomainContact") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _UpdateDomainContactPrivacy : IamPolicy.Action("route53domains:UpdateDomainContactPrivacy") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _UpdateDomainNameservers : IamPolicy.Action("route53domains:UpdateDomainNameservers") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _UpdateTagsForDomain : IamPolicy.Action("route53domains:UpdateTagsForDomain") {
             //arn:aws:route53domains:::tags/*"
            fun arnawsroute53domainstagsAll() = IamPolicy.Resource("arn:aws:route53domains:::tags/*")
         }       
 
      class _ViewBilling : IamPolicy.Action("route53domains:ViewBilling") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ChangeAutoRenew : IamPolicy.Action("route53domains:ChangeAutoRenew") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _ListDnssec : IamPolicy.Action("route53domains:ListDnssec") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _AddDnssec : IamPolicy.Action("route53domains:AddDnssec") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       
 
      class _RemoveDnssec : IamPolicy.Action("route53domains:RemoveDnssec") {
             //arn:aws:route53domains:::*"
            fun arnawsroute53domainsAll() = IamPolicy.Resource("arn:aws:route53domains:::*")
         }       


}        
