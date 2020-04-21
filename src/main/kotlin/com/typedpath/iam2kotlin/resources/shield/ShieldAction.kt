
package com.typedpath.iam2kotlin.resources.shield

import com.typedpath.iam2kotlin.IamPolicy

class ShieldAction() {

    companion object { 
        val All = IamPolicy.Action("shield:*")    
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateProtection.html 
        //  Enables AWS Shield Advanced for a specific AWS resource.    
        val CreateProtection = _CreateProtection() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html 
        //  Activates AWS Shield Advanced for an account.    
        val CreateSubscription = _CreateSubscription() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_DeleteProtection.html 
        //  Deletes an AWS Shield Advanced Protection.    
        val DeleteProtection = _DeleteProtection() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_DeleteSubscription.html 
        //  Removes AWS Shield Advanced from an account.    
        val DeleteSubscription = _DeleteSubscription() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_DescribeAttack.html 
        //  Describes the details of a DDoS attack.    
        val DescribeAttack = _DescribeAttack() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_DescribeProtection.html 
        //  Lists the details of a Protection object.    
        val DescribeProtection = _DescribeProtection() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_DescribeSubscription.html 
        //  Provides details about the AWS Shield Advanced subscription for an account.    
        val DescribeSubscription = _DescribeSubscription() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_ListAttacks.html 
        //  Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.    
        val ListAttacks = _ListAttacks() 
        // see http://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_ListProtections.html 
        //  Lists all Protection objects for the account.    
        val ListProtections = _ListProtections()
    }
      class _CreateProtection : IamPolicy.Action("shield:CreateProtection") {

         }       
 
      class _CreateSubscription : IamPolicy.Action("shield:CreateSubscription") {

         }       
 
      class _DeleteProtection : IamPolicy.Action("shield:DeleteProtection") {

         }       
 
      class _DeleteSubscription : IamPolicy.Action("shield:DeleteSubscription") {

         }       
 
      class _DescribeAttack : IamPolicy.Action("shield:DescribeAttack") {

         }       
 
      class _DescribeProtection : IamPolicy.Action("shield:DescribeProtection") {

         }       
 
      class _DescribeSubscription : IamPolicy.Action("shield:DescribeSubscription") {

         }       
 
      class _ListAttacks : IamPolicy.Action("shield:ListAttacks") {

         }       
 
      class _ListProtections : IamPolicy.Action("shield:ListProtections") {

         }       


}        
