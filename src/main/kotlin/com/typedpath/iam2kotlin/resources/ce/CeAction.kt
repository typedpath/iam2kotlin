
package com.typedpath.iam2kotlin.resources.ce

import com.typedpath.iam2kotlin.IamPolicy

class CeAction() {

    companion object { 
        val All = IamPolicy.Action("ce:*")    
        // see https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetTags.html 
        //  Query for available tag keys and tag values for a specified period.    
        val GetTags = _GetTags() 
        // see https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html 
        //  Retrieve all available filter values for a specific filter over a period of time.    
        val GetDimensionValues = _GetDimensionValues() 
        // see https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetReservationCoverage.html 
        //  Retrieve the Reservation coverage for your account.    
        val GetReservationCoverage = _GetReservationCoverage() 
        // see https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetReservationUtilization.html 
        //  Retrieve the Reservation utilization for your account.    
        val GetReservationUtilization = _GetReservationUtilization() 
        // see https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetCostAndUsage.html 
        //  Retrieve cost and usage metrics for your account.    
        val GetCostAndUsage = _GetCostAndUsage()
    }
      class _GetTags : IamPolicy.Action("ce:GetTags") {

         }       
 
      class _GetDimensionValues : IamPolicy.Action("ce:GetDimensionValues") {

         }       
 
      class _GetReservationCoverage : IamPolicy.Action("ce:GetReservationCoverage") {

         }       
 
      class _GetReservationUtilization : IamPolicy.Action("ce:GetReservationUtilization") {

         }       
 
      class _GetCostAndUsage : IamPolicy.Action("ce:GetCostAndUsage") {

         }       


}        
