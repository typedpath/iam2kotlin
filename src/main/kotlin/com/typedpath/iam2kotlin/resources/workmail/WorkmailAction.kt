
package com.typedpath.iam2kotlin.resources.workmail

import com.typedpath.iam2kotlin.IamPolicy

class WorkmailAction() {

    companion object { 
        val All = IamPolicy.Action("workmail:*")    
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val AddMembersToGroup = _AddMembersToGroup() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val CreateGroup = _CreateGroup() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val CreateMailDomain = _CreateMailDomain() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val CreateMailUser = _CreateMailUser() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val CreateOrganization = _CreateOrganization() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DeleteOrganization = _DeleteOrganization() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DeleteMailDomain = _DeleteMailDomain() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DeleteMobileDevice = _DeleteMobileDevice() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeDirectories = _DescribeDirectories() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeKmsKeys = _DescribeKmsKeys() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeOrganizations = _DescribeOrganizations() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeMailDomains = _DescribeMailDomains() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeMailGroups = _DescribeMailGroups() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DescribeMailUsers = _DescribeMailUsers() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DisableMailGroups = _DisableMailGroups() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val DisableMailUsers = _DisableMailUsers() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val EnableMailDomain = _EnableMailDomain() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val EnableMailUsers = _EnableMailUsers() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val EnableMailGroups = _EnableMailGroups() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMailDomainDetails = _GetMailDomainDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMailGroupDetails = _GetMailGroupDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMailUserDetails = _GetMailUserDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMobileDeviceDetails = _GetMobileDeviceDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMobileDevicesForUser = _GetMobileDevicesForUser() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val GetMobilePolicyDetails = _GetMobilePolicyDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val ListMembersInMailGroup = _ListMembersInMailGroup() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val RemoveMembersFromGroup = _RemoveMembersFromGroup() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val ResetUserPassword = _ResetUserPassword() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SearchMembers = _SearchMembers() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SetAdmin = _SetAdmin() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SetDefaultMailDomain = _SetDefaultMailDomain() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SetMailGroupDetails = _SetMailGroupDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SetMailUserDetails = _SetMailUserDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val SetMobilePolicyDetails = _SetMobilePolicyDetails() 
        // see http://docs.aws.amazon.com/workmail/latest/adminguide/iam_users_groups.html 
        //  ???    
        val WipeMobileDevice = _WipeMobileDevice()
    }
      class _AddMembersToGroup : IamPolicy.Action("workmail:AddMembersToGroup") {

         }       
 
      class _CreateGroup : IamPolicy.Action("workmail:CreateGroup") {

         }       
 
      class _CreateMailDomain : IamPolicy.Action("workmail:CreateMailDomain") {

         }       
 
      class _CreateMailUser : IamPolicy.Action("workmail:CreateMailUser") {

         }       
 
      class _CreateOrganization : IamPolicy.Action("workmail:CreateOrganization") {

         }       
 
      class _DeleteOrganization : IamPolicy.Action("workmail:DeleteOrganization") {

         }       
 
      class _DeleteMailDomain : IamPolicy.Action("workmail:DeleteMailDomain") {

         }       
 
      class _DeleteMobileDevice : IamPolicy.Action("workmail:DeleteMobileDevice") {

         }       
 
      class _DescribeDirectories : IamPolicy.Action("workmail:DescribeDirectories") {

         }       
 
      class _DescribeKmsKeys : IamPolicy.Action("workmail:DescribeKmsKeys") {

         }       
 
      class _DescribeOrganizations : IamPolicy.Action("workmail:DescribeOrganizations") {

         }       
 
      class _DescribeMailDomains : IamPolicy.Action("workmail:DescribeMailDomains") {

         }       
 
      class _DescribeMailGroups : IamPolicy.Action("workmail:DescribeMailGroups") {

         }       
 
      class _DescribeMailUsers : IamPolicy.Action("workmail:DescribeMailUsers") {

         }       
 
      class _DisableMailGroups : IamPolicy.Action("workmail:DisableMailGroups") {

         }       
 
      class _DisableMailUsers : IamPolicy.Action("workmail:DisableMailUsers") {

         }       
 
      class _EnableMailDomain : IamPolicy.Action("workmail:EnableMailDomain") {

         }       
 
      class _EnableMailUsers : IamPolicy.Action("workmail:EnableMailUsers") {

         }       
 
      class _EnableMailGroups : IamPolicy.Action("workmail:EnableMailGroups") {

         }       
 
      class _GetMailDomainDetails : IamPolicy.Action("workmail:GetMailDomainDetails") {

         }       
 
      class _GetMailGroupDetails : IamPolicy.Action("workmail:GetMailGroupDetails") {

         }       
 
      class _GetMailUserDetails : IamPolicy.Action("workmail:GetMailUserDetails") {

         }       
 
      class _GetMobileDeviceDetails : IamPolicy.Action("workmail:GetMobileDeviceDetails") {

         }       
 
      class _GetMobileDevicesForUser : IamPolicy.Action("workmail:GetMobileDevicesForUser") {

         }       
 
      class _GetMobilePolicyDetails : IamPolicy.Action("workmail:GetMobilePolicyDetails") {

         }       
 
      class _ListMembersInMailGroup : IamPolicy.Action("workmail:ListMembersInMailGroup") {

         }       
 
      class _RemoveMembersFromGroup : IamPolicy.Action("workmail:RemoveMembersFromGroup") {

         }       
 
      class _ResetUserPassword : IamPolicy.Action("workmail:ResetUserPassword") {

         }       
 
      class _SearchMembers : IamPolicy.Action("workmail:SearchMembers") {

         }       
 
      class _SetAdmin : IamPolicy.Action("workmail:SetAdmin") {

         }       
 
      class _SetDefaultMailDomain : IamPolicy.Action("workmail:SetDefaultMailDomain") {

         }       
 
      class _SetMailGroupDetails : IamPolicy.Action("workmail:SetMailGroupDetails") {

         }       
 
      class _SetMailUserDetails : IamPolicy.Action("workmail:SetMailUserDetails") {

         }       
 
      class _SetMobilePolicyDetails : IamPolicy.Action("workmail:SetMobilePolicyDetails") {

         }       
 
      class _WipeMobileDevice : IamPolicy.Action("workmail:WipeMobileDevice") {

         }       


}        
