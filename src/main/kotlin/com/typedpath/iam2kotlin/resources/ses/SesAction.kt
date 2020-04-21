
package com.typedpath.iam2kotlin.resources.ses

import com.typedpath.iam2kotlin.IamPolicy

class SesAction() {

    companion object { 
        val All = IamPolicy.Action("ses:*")    
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_CloneReceiptRuleSet.html 
        //  Creates a receipt rule set by cloning an existing one.    
        val CloneReceiptRuleSet = _CloneReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_CreateReceiptFilter.html 
        //  Creates a new IP address filter.    
        val CreateReceiptFilter = _CreateReceiptFilter() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_CreateReceiptRule.html 
        //  Creates a receipt rule.    
        val CreateReceiptRule = _CreateReceiptRule() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_CreateReceiptRuleSet.html 
        //  Creates an empty receipt rule set.    
        val CreateReceiptRuleSet = _CreateReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteIdentity.html 
        //  Deletes the specified identity (an email address or a domain) from the list of verified identities.    
        val DeleteIdentity = _DeleteIdentity() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteIdentityPolicy.html 
        //  Deletes the specified sending authorization policy for the given identity (an email address or a domain).    
        val DeleteIdentityPolicy = _DeleteIdentityPolicy() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteReceiptFilter.html 
        //  Deletes the specified IP address filter.    
        val DeleteReceiptFilter = _DeleteReceiptFilter() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteReceiptRule.html 
        //  Deletes the specified receipt rule.    
        val DeleteReceiptRule = _DeleteReceiptRule() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteReceiptRuleSet.html 
        //  Deletes the specified receipt rule set and all of the receipt rules it contains.    
        val DeleteReceiptRuleSet = _DeleteReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DeleteVerifiedEmailAddress.html 
        //  Deletes the specified email address from the list of verified addresses.    
        val DeleteVerifiedEmailAddress = _DeleteVerifiedEmailAddress() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DescribeActiveReceiptRuleSet.html 
        //  Returns the metadata and receipt rules for the receipt rule set that is currently active.    
        val DescribeActiveReceiptRuleSet = _DescribeActiveReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DescribeReceiptRule.html 
        //  Returns the details of the specified receipt rule.    
        val DescribeReceiptRule = _DescribeReceiptRule() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_DescribeReceiptRuleSet.html 
        //  Returns the details of the specified receipt rule set.    
        val DescribeReceiptRuleSet = _DescribeReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetIdentityDkimAttributes.html 
        //  Returns the current status of Easy DKIM signing for an entity.    
        val GetIdentityDkimAttributes = _GetIdentityDkimAttributes() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetIdentityNotificationAttributes.html 
        //  Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes.    
        val GetIdentityNotificationAttributes = _GetIdentityNotificationAttributes() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetIdentityPolicies.html 
        //  Returns the requested sending authorization policies for the given identity (an email address or a domain).    
        val GetIdentityPolicies = _GetIdentityPolicies() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetIdentityVerificationAttributes.html 
        //  Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity.    
        val GetIdentityVerificationAttributes = _GetIdentityVerificationAttributes() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetSendQuota.html 
        //  Returns the user's current sending limits.    
        val GetSendQuota = _GetSendQuota() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_GetSendStatistics.html 
        //  Returns the user's sending statistics.    
        val GetSendStatistics = _GetSendStatistics() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ListIdentities.html 
        //  Returns a list containing all of the identities (email addresses and domains) for your AWS account, regardless of verification status.    
        val ListIdentities = _ListIdentities() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ListIdentityPolicies.html 
        //  Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain).    
        val ListIdentityPolicies = _ListIdentityPolicies() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ListReceiptFilters.html 
        //  Lists the IP address filters associated with your AWS account.    
        val ListReceiptFilters = _ListReceiptFilters() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ListReceiptRuleSets.html 
        //  Lists the receipt rule sets that exist under your AWS account.    
        val ListReceiptRuleSets = _ListReceiptRuleSets() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ListVerifiedEmailAddresses.html 
        //  Returns a list containing all of the email addresses that have been verified.    
        val ListVerifiedEmailAddresses = _ListVerifiedEmailAddresses() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_PutIdentityPolicy.html 
        //  Adds or updates a sending authorization policy for the specified identity (an email address or a domain).    
        val PutIdentityPolicy = _PutIdentityPolicy() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_ReorderReceiptRuleSet.html 
        //  Reorders the receipt rules within a receipt rule set.    
        val ReorderReceiptRuleSet = _ReorderReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SendBounce.html 
        //  Generates and sends a bounce message to the sender of an email you received through Amazon SES.    
        val SendBounce = _SendBounce() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SendEmail.html 
        //  Composes an email message based on input data, and then immediately queues the message for sending.    
        val SendEmail = _SendEmail() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SendRawEmail.html 
        //  Sends an email message, with header and content specified by the client.    
        val SendRawEmail = _SendRawEmail() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SetActiveReceiptRuleSet.html 
        //  Sets the specified receipt rule set as the active receipt rule set.    
        val SetActiveReceiptRuleSet = _SetActiveReceiptRuleSet() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityDkimEnabled.html 
        //  ???    
        val SetIdentityDkimEnabled = _SetIdentityDkimEnabled() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityNotificationTopic.html 
        //  Given an identity (an email address or a domain), sets the Amazon Simple Notification Service (Amazon SNS) topic to which Amazon SES will publish bounce, complaint, and/or delivery notifications for emails sent with that identity as the Source.    
        val SetIdentityNotificationTopic = _SetIdentityNotificationTopic() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityFeedbackForwardingEnabled.html 
        //  Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email.    
        val SetIdentityFeedbackForwardingEnabled = _SetIdentityFeedbackForwardingEnabled() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_SetReceiptRulePosition.html 
        //  Sets the position of the specified receipt rule in the receipt rule set.    
        val SetReceiptRulePosition = _SetReceiptRulePosition() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_UpdateReceiptRule.html 
        //  Updates a receipt rule.    
        val UpdateReceiptRule = _UpdateReceiptRule() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_VerifyDomainDkim.html 
        //  Returns a set of DKIM tokens for a domain.    
        val VerifyDomainDkim = _VerifyDomainDkim() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_VerifyDomainIdentity.html 
        //  Verifies a domain.    
        val VerifyDomainIdentity = _VerifyDomainIdentity() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_VerifyEmailAddress.html 
        //  Verifies an email address.    
        val VerifyEmailAddress = _VerifyEmailAddress() 
        // see http://docs.aws.amazon.com/ses/latest/APIReference/API_VerifyEmailIdentity.html 
        //  Verifies an email address.    
        val VerifyEmailIdentity = _VerifyEmailIdentity()
    }
      class _CloneReceiptRuleSet : IamPolicy.Action("ses:CloneReceiptRuleSet") {

         }       
 
      class _CreateReceiptFilter : IamPolicy.Action("ses:CreateReceiptFilter") {

         }       
 
      class _CreateReceiptRule : IamPolicy.Action("ses:CreateReceiptRule") {

         }       
 
      class _CreateReceiptRuleSet : IamPolicy.Action("ses:CreateReceiptRuleSet") {

         }       
 
      class _DeleteIdentity : IamPolicy.Action("ses:DeleteIdentity") {

         }       
 
      class _DeleteIdentityPolicy : IamPolicy.Action("ses:DeleteIdentityPolicy") {

         }       
 
      class _DeleteReceiptFilter : IamPolicy.Action("ses:DeleteReceiptFilter") {

         }       
 
      class _DeleteReceiptRule : IamPolicy.Action("ses:DeleteReceiptRule") {

         }       
 
      class _DeleteReceiptRuleSet : IamPolicy.Action("ses:DeleteReceiptRuleSet") {

         }       
 
      class _DeleteVerifiedEmailAddress : IamPolicy.Action("ses:DeleteVerifiedEmailAddress") {

         }       
 
      class _DescribeActiveReceiptRuleSet : IamPolicy.Action("ses:DescribeActiveReceiptRuleSet") {

         }       
 
      class _DescribeReceiptRule : IamPolicy.Action("ses:DescribeReceiptRule") {

         }       
 
      class _DescribeReceiptRuleSet : IamPolicy.Action("ses:DescribeReceiptRuleSet") {

         }       
 
      class _GetIdentityDkimAttributes : IamPolicy.Action("ses:GetIdentityDkimAttributes") {

         }       
 
      class _GetIdentityNotificationAttributes : IamPolicy.Action("ses:GetIdentityNotificationAttributes") {

         }       
 
      class _GetIdentityPolicies : IamPolicy.Action("ses:GetIdentityPolicies") {

         }       
 
      class _GetIdentityVerificationAttributes : IamPolicy.Action("ses:GetIdentityVerificationAttributes") {

         }       
 
      class _GetSendQuota : IamPolicy.Action("ses:GetSendQuota") {

         }       
 
      class _GetSendStatistics : IamPolicy.Action("ses:GetSendStatistics") {

         }       
 
      class _ListIdentities : IamPolicy.Action("ses:ListIdentities") {

         }       
 
      class _ListIdentityPolicies : IamPolicy.Action("ses:ListIdentityPolicies") {

         }       
 
      class _ListReceiptFilters : IamPolicy.Action("ses:ListReceiptFilters") {

         }       
 
      class _ListReceiptRuleSets : IamPolicy.Action("ses:ListReceiptRuleSets") {

         }       
 
      class _ListVerifiedEmailAddresses : IamPolicy.Action("ses:ListVerifiedEmailAddresses") {

         }       
 
      class _PutIdentityPolicy : IamPolicy.Action("ses:PutIdentityPolicy") {

         }       
 
      class _ReorderReceiptRuleSet : IamPolicy.Action("ses:ReorderReceiptRuleSet") {

         }       
 
      class _SendBounce : IamPolicy.Action("ses:SendBounce") {

         }       
 
      class _SendEmail : IamPolicy.Action("ses:SendEmail") {
             //arn:aws:ses:$region:$account:identity/$identity"
            fun identity_byRegionAccountIdentity(region: String, account: String, identity: String) = IamPolicy.Resource("arn:aws:ses:$region:$account:identity/$identity")
         }       
 
      class _SendRawEmail : IamPolicy.Action("ses:SendRawEmail") {
             //arn:aws:ses:$region:$account:identity/$identity"
            fun identity_byRegionAccountIdentity(region: String, account: String, identity: String) = IamPolicy.Resource("arn:aws:ses:$region:$account:identity/$identity")
         }       
 
      class _SetActiveReceiptRuleSet : IamPolicy.Action("ses:SetActiveReceiptRuleSet") {

         }       
 
      class _SetIdentityDkimEnabled : IamPolicy.Action("ses:SetIdentityDkimEnabled") {

         }       
 
      class _SetIdentityNotificationTopic : IamPolicy.Action("ses:SetIdentityNotificationTopic") {

         }       
 
      class _SetIdentityFeedbackForwardingEnabled : IamPolicy.Action("ses:SetIdentityFeedbackForwardingEnabled") {

         }       
 
      class _SetReceiptRulePosition : IamPolicy.Action("ses:SetReceiptRulePosition") {

         }       
 
      class _UpdateReceiptRule : IamPolicy.Action("ses:UpdateReceiptRule") {

         }       
 
      class _VerifyDomainDkim : IamPolicy.Action("ses:VerifyDomainDkim") {

         }       
 
      class _VerifyDomainIdentity : IamPolicy.Action("ses:VerifyDomainIdentity") {

         }       
 
      class _VerifyEmailAddress : IamPolicy.Action("ses:VerifyEmailAddress") {

         }       
 
      class _VerifyEmailIdentity : IamPolicy.Action("ses:VerifyEmailIdentity") {

         }       


}        
