
package com.typedpath.iam2kotlin.resources.discovery

import com.typedpath.iam2kotlin.IamPolicy

class DiscoveryAction() {

    companion object { 
        val All = IamPolicy.Action("discovery:*")    
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_CreateTags.html 
        //  Creates one or more tags for configuration items.    
        val CreateTags = _CreateTags() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DeleteTags.html 
        //  Deletes the association between configuration items and one or more tags.    
        val DeleteTags = _DeleteTags() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeAgents.html 
        //  Lists agents or the Connector by ID or lists all agents/Connectors associated with your user account if you did not specify an ID.    
        val DescribeAgents = _DescribeAgents() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeConfigurations.html 
        //  Retrieves a list of attributes for a specific configuration ID.    
        val DescribeConfigurations = _DescribeConfigurations() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportConfigurations.html 
        //  Retrieves the status of a given export process.    
        val DescribeExportConfigurations = _DescribeExportConfigurations() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeTags.html 
        //  Retrieves a list of configuration items that are tagged with a specific tag.    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_ExportConfigurations.html 
        //  Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and evaluate the data.    
        val ExportConfigurations = _ExportConfigurations() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_ListConfigurations.html 
        //  Retrieves a list of configurations items according to the criteria you specify in a filter.    
        val ListConfigurations = _ListConfigurations() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartDataCollectionByAgentIds.html 
        //  Instructs the specified agents or Connectors to start collecting data.    
        val StartDataCollectionByAgentIds = _StartDataCollectionByAgentIds() 
        // see http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StopDataCollectionByAgentIds.html 
        //  Instructs the specified agents or Connectors to stop collecting data.    
        val StopDataCollectionByAgentIds = _StopDataCollectionByAgentIds()
    }
      class _CreateTags : IamPolicy.Action("discovery:CreateTags") {

         }       
 
      class _DeleteTags : IamPolicy.Action("discovery:DeleteTags") {

         }       
 
      class _DescribeAgents : IamPolicy.Action("discovery:DescribeAgents") {

         }       
 
      class _DescribeConfigurations : IamPolicy.Action("discovery:DescribeConfigurations") {

         }       
 
      class _DescribeExportConfigurations : IamPolicy.Action("discovery:DescribeExportConfigurations") {

         }       
 
      class _DescribeTags : IamPolicy.Action("discovery:DescribeTags") {

         }       
 
      class _ExportConfigurations : IamPolicy.Action("discovery:ExportConfigurations") {

         }       
 
      class _ListConfigurations : IamPolicy.Action("discovery:ListConfigurations") {

         }       
 
      class _StartDataCollectionByAgentIds : IamPolicy.Action("discovery:StartDataCollectionByAgentIds") {

         }       
 
      class _StopDataCollectionByAgentIds : IamPolicy.Action("discovery:StopDataCollectionByAgentIds") {

         }       


}        
