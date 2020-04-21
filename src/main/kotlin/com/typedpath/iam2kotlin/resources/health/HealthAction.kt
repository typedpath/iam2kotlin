
package com.typedpath.iam2kotlin.resources.health

import com.typedpath.iam2kotlin.IamPolicy

class HealthAction() {

    companion object { 
        val All = IamPolicy.Action("health:*")    
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html 
        //  Returns a list of entities that have been affected by the specified events, based on the specified filter criteria.    
        val DescribeAffectedEntities = _DescribeAffectedEntities() 
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEntityAggregates.html 
        //  Returns the number of entities that are affected by each of the specified events.    
        val DescribeEntityAggregates = _DescribeEntityAggregates() 
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventAggregates.html 
        //  Returns the number of events of each event type (issue, scheduled change, and account notification).    
        val DescribeEventAggregates = _DescribeEventAggregates() 
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEvents.html 
        //  Returns information about events that meet the specified filter criteria.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetails.html 
        //  Returns detailed information about one or more specified events.    
        val DescribeEventDetails = _DescribeEventDetails() 
        // see http://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventTypes.html 
        //  Returns the event types that meet the specified filter criteria.    
        val DescribeEventTypes = _DescribeEventTypes()
    }
      class _DescribeAffectedEntities : IamPolicy.Action("health:DescribeAffectedEntities") {

         }       
 
      class _DescribeEntityAggregates : IamPolicy.Action("health:DescribeEntityAggregates") {

         }       
 
      class _DescribeEventAggregates : IamPolicy.Action("health:DescribeEventAggregates") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("health:DescribeEvents") {

         }       
 
      class _DescribeEventDetails : IamPolicy.Action("health:DescribeEventDetails") {

         }       
 
      class _DescribeEventTypes : IamPolicy.Action("health:DescribeEventTypes") {

         }       


}        
