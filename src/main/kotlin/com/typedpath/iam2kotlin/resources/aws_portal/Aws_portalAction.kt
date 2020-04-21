
package com.typedpath.iam2kotlin.resources.aws_portal

import com.typedpath.iam2kotlin.IamPolicy

class Aws_portalAction() {

    companion object { 
        val All = IamPolicy.Action("aws_portal:*")    
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to modify Account Settings.    
        val ModifyAccount = _ModifyAccount() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to modify the following Billing and Cost Management console pages.    
        val ModifyBilling = _ModifyBilling() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to modify Payment Methods.    
        val ModifyPaymentMethods = _ModifyPaymentMethods() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to view Account Settings.    
        val ViewAccount = _ViewAccount() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to view the following Billing and Cost Management console pages.    
        val ViewBilling = _ViewBilling() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to view Budgets.    
        val ViewBudget = _ViewBudget() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to view Payment Methods.    
        val ViewPaymentMethods = _ViewPaymentMethods() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html 
        //  Allow or deny IAM users permission to view AWS usage Reports.    
        val ViewUsage = _ViewUsage()
    }
      class _ModifyAccount : IamPolicy.Action("aws-portal:ModifyAccount") {

         }       
 
      class _ModifyBilling : IamPolicy.Action("aws-portal:ModifyBilling") {

         }       
 
      class _ModifyPaymentMethods : IamPolicy.Action("aws-portal:ModifyPaymentMethods") {

         }       
 
      class _ViewAccount : IamPolicy.Action("aws-portal:ViewAccount") {

         }       
 
      class _ViewBilling : IamPolicy.Action("aws-portal:ViewBilling") {

         }       
 
      class _ViewBudget : IamPolicy.Action("aws-portal:ViewBudget") {

         }       
 
      class _ViewPaymentMethods : IamPolicy.Action("aws-portal:ViewPaymentMethods") {

         }       
 
      class _ViewUsage : IamPolicy.Action("aws-portal:ViewUsage") {

         }       


}        
