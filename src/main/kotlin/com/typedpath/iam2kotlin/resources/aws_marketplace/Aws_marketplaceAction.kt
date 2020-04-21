
package com.typedpath.iam2kotlin.resources.aws_marketplace

import com.typedpath.iam2kotlin.IamPolicy

class Aws_marketplaceAction() {

    companion object { 
        val All = IamPolicy.Action("aws_marketplace:*")    
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //   Allows users to add new software subscriptions on the Your Software page.    
        val Subscribe = _Subscribe() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //  Allows users to remove software subscriptions from the Your Software page.    
        val Unsubscribe = _Unsubscribe() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //  Allows users to see subscribed software. Without this permission, no other permissions will work.    
        val ViewSubscriptions = _ViewSubscriptions() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //  Report usage in batch.    
        val BatchMeterUsage = _BatchMeterUsage() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //  Redeem AWS Marketplace token for a customer identifier and product code.    
        val ResolveCustomer = _ResolveCustomer() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace.html 
        //  Report usage.    
        val MeterUsage = _MeterUsage()
    }
      class _Subscribe : IamPolicy.Action("aws-marketplace:Subscribe") {

         }       
 
      class _Unsubscribe : IamPolicy.Action("aws-marketplace:Unsubscribe") {

         }       
 
      class _ViewSubscriptions : IamPolicy.Action("aws-marketplace:ViewSubscriptions") {

         }       
 
      class _BatchMeterUsage : IamPolicy.Action("aws-marketplace:BatchMeterUsage") {

         }       
 
      class _ResolveCustomer : IamPolicy.Action("aws-marketplace:ResolveCustomer") {

         }       
 
      class _MeterUsage : IamPolicy.Action("aws-marketplace:MeterUsage") {

         }       


}        
