
package com.typedpath.iam2kotlin.resources.trustedadvisor

import com.typedpath.iam2kotlin.IamPolicy

class TrustedadvisorAction() {

    companion object { 
        val All = IamPolicy.Action("trustedadvisor:*")    
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  View details (items in results table). Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val DescribeCheckItems = _DescribeCheckItems() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  ???. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val DescribeCheckRefreshStatuses = _DescribeCheckRefreshStatuses() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  ???. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val DescribeCheckStatusHistoryChanges = _DescribeCheckStatusHistoryChanges() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  ???. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val DescribeCheckSummaries = _DescribeCheckSummaries() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  View information on the notification preferences page. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val DescribeNotificationPreferences = _DescribeNotificationPreferences() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  Change the status of items from included to excluded. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val ExcludeCheckItems = _ExcludeCheckItems() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  Change the status of items from excluded to included. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val IncludeCheckItems = _IncludeCheckItems() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  Refresh checks. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val RefreshCheck = _RefreshCheck() 
        // see https://aws.amazon.com/de/premiumsupport/ta-iam/ 
        //  Change options on the notification preferences page. Note: Applies only to Trusted Advisor in the AWS Management Console; do not apply to the Trusted Advisor-related actions provided by the AWS Support API. To use the Trusted Advisor-related actions provided by the AWS Support API, your policy must include the support:* action; none of the trustedadvisor action permissions restrict your access.    
        val UpdateNotificationPreferences = _UpdateNotificationPreferences()
    }
      class _DescribeCheckItems : IamPolicy.Action("trustedadvisor:DescribeCheckItems") {

         }       
 
      class _DescribeCheckRefreshStatuses : IamPolicy.Action("trustedadvisor:DescribeCheckRefreshStatuses") {

         }       
 
      class _DescribeCheckStatusHistoryChanges : IamPolicy.Action("trustedadvisor:DescribeCheckStatusHistoryChanges") {

         }       
 
      class _DescribeCheckSummaries : IamPolicy.Action("trustedadvisor:DescribeCheckSummaries") {

         }       
 
      class _DescribeNotificationPreferences : IamPolicy.Action("trustedadvisor:DescribeNotificationPreferences") {

         }       
 
      class _ExcludeCheckItems : IamPolicy.Action("trustedadvisor:ExcludeCheckItems") {

         }       
 
      class _IncludeCheckItems : IamPolicy.Action("trustedadvisor:IncludeCheckItems") {

         }       
 
      class _RefreshCheck : IamPolicy.Action("trustedadvisor:RefreshCheck") {

         }       
 
      class _UpdateNotificationPreferences : IamPolicy.Action("trustedadvisor:UpdateNotificationPreferences") {

         }       


}        
