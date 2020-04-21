
package com.typedpath.iam2kotlin.resources.dms

import com.typedpath.iam2kotlin.IamPolicy

class DmsAction() {

    companion object { 
        val All = IamPolicy.Action("dms:*")    
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_AddTagsToResource.html 
        //  Adds metadata tags to a DMS resource, including replication instance, endpoint, security group, and migration task.    
        val AddTagsToResource = _AddTagsToResource() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_CreateEndpoint.html 
        //  Creates an endpoint using the provided settings.    
        val CreateEndpoint = _CreateEndpoint() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_CreateReplicationInstance.html 
        //  Creates the replication instance using the specified parameters.    
        val CreateReplicationInstance = _CreateReplicationInstance() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_CreateReplicationSubnetGroup.html 
        //  Creates a replication subnet group given a list of the subnet IDs in a VPC.    
        val CreateReplicationSubnetGroup = _CreateReplicationSubnetGroup() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_CreateReplicationTask.html 
        //  Creates a replication task using the specified parameters.    
        val CreateReplicationTask = _CreateReplicationTask() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DeleteEndpoint.html 
        //  Deletes the specified endpoint.    
        val DeleteEndpoint = _DeleteEndpoint() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DeleteReplicationInstance.html 
        //  Deletes the specified replication instance.    
        val DeleteReplicationInstance = _DeleteReplicationInstance() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DeleteReplicationSubnetGroup.html 
        //  Deletes a subnet group.    
        val DeleteReplicationSubnetGroup = _DeleteReplicationSubnetGroup() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DeleteReplicationTask.html 
        //  Deletes the specified replication task.    
        val DeleteReplicationTask = _DeleteReplicationTask() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeAccountAttributes.html 
        //  Lists all of the AWS DMS attributes for a customer account.    
        val DescribeAccountAttributes = _DescribeAccountAttributes() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeConnections.html 
        //  Describes the status of the connections that have been made between the replication instance and an endpoint.    
        val DescribeConnections = _DescribeConnections() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeEndpointTypes.html 
        //  Returns information about the type of endpoints available.    
        val DescribeEndpointTypes = _DescribeEndpointTypes() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeEndpoints.html 
        //  Returns information about the endpoints for your account in the current region.    
        val DescribeEndpoints = _DescribeEndpoints() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeOrderableReplicationInstances.html 
        //  Returns information about the replication instance types that can be created in the specified region.    
        val DescribeOrderableReplicationInstances = _DescribeOrderableReplicationInstances() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeRefreshSchemasStatus.html 
        //  Returns the status of the RefreshSchemas operation.    
        val DescribeRefreshSchemasStatus = _DescribeRefreshSchemasStatus() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeReplicationInstances.html 
        //  Returns information about replication instances for your account in the current region.    
        val DescribeReplicationInstances = _DescribeReplicationInstances() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeReplicationSubnetGroups.html 
        //  Returns information about the replication subnet groups.    
        val DescribeReplicationSubnetGroups = _DescribeReplicationSubnetGroups() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeReplicationTasks.html 
        //  Returns information about replication tasks for your account in the current region.    
        val DescribeReplicationTasks = _DescribeReplicationTasks() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeSchemas.html 
        //  Returns information about the schema for the specified endpoint.    
        val DescribeSchemas = _DescribeSchemas() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_DescribeTableStatistics.html 
        //  Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted.    
        val DescribeTableStatistics = _DescribeTableStatistics() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_ListTagsForResource.html 
        //  Lists all tags for an AWS DMS resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_ModifyEndpoint.html 
        //  Modifies the specified endpoint.    
        val ModifyEndpoint = _ModifyEndpoint() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_ModifyReplicationInstance.html 
        //  Modifies the replication instance to apply new settings.    
        val ModifyReplicationInstance = _ModifyReplicationInstance() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_ModifyReplicationSubnetGroup.html 
        //  Modifies the settings for the specified replication subnet group.    
        val ModifyReplicationSubnetGroup = _ModifyReplicationSubnetGroup() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_RefreshSchemas.html 
        //  Populates the schema for the specified endpoint.    
        val RefreshSchemas = _RefreshSchemas() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_RemoveTagsFromResource.html 
        //  Removes metadata tags from a DMS resource.    
        val RemoveTagsFromResource = _RemoveTagsFromResource() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_StartReplicationTask.html 
        //  Starts the replication task.    
        val StartReplicationTask = _StartReplicationTask() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_StopReplicationTask.html 
        //  Stops the replication task.    
        val StopReplicationTask = _StopReplicationTask() 
        // see http://docs.aws.amazon.com/dms/latest/APIReference//API_TestConnection.html 
        //  Tests the connection between the replication instance and the endpoint.    
        val TestConnection = _TestConnection()
    }
      class _AddTagsToResource : IamPolicy.Action("dms:AddTagsToResource") {

         }       
 
      class _CreateEndpoint : IamPolicy.Action("dms:CreateEndpoint") {

         }       
 
      class _CreateReplicationInstance : IamPolicy.Action("dms:CreateReplicationInstance") {

         }       
 
      class _CreateReplicationSubnetGroup : IamPolicy.Action("dms:CreateReplicationSubnetGroup") {

         }       
 
      class _CreateReplicationTask : IamPolicy.Action("dms:CreateReplicationTask") {

         }       
 
      class _DeleteEndpoint : IamPolicy.Action("dms:DeleteEndpoint") {

         }       
 
      class _DeleteReplicationInstance : IamPolicy.Action("dms:DeleteReplicationInstance") {

         }       
 
      class _DeleteReplicationSubnetGroup : IamPolicy.Action("dms:DeleteReplicationSubnetGroup") {

         }       
 
      class _DeleteReplicationTask : IamPolicy.Action("dms:DeleteReplicationTask") {

         }       
 
      class _DescribeAccountAttributes : IamPolicy.Action("dms:DescribeAccountAttributes") {

         }       
 
      class _DescribeConnections : IamPolicy.Action("dms:DescribeConnections") {

         }       
 
      class _DescribeEndpointTypes : IamPolicy.Action("dms:DescribeEndpointTypes") {

         }       
 
      class _DescribeEndpoints : IamPolicy.Action("dms:DescribeEndpoints") {

         }       
 
      class _DescribeOrderableReplicationInstances : IamPolicy.Action("dms:DescribeOrderableReplicationInstances") {

         }       
 
      class _DescribeRefreshSchemasStatus : IamPolicy.Action("dms:DescribeRefreshSchemasStatus") {

         }       
 
      class _DescribeReplicationInstances : IamPolicy.Action("dms:DescribeReplicationInstances") {

         }       
 
      class _DescribeReplicationSubnetGroups : IamPolicy.Action("dms:DescribeReplicationSubnetGroups") {

         }       
 
      class _DescribeReplicationTasks : IamPolicy.Action("dms:DescribeReplicationTasks") {

         }       
 
      class _DescribeSchemas : IamPolicy.Action("dms:DescribeSchemas") {

         }       
 
      class _DescribeTableStatistics : IamPolicy.Action("dms:DescribeTableStatistics") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("dms:ListTagsForResource") {

         }       
 
      class _ModifyEndpoint : IamPolicy.Action("dms:ModifyEndpoint") {

         }       
 
      class _ModifyReplicationInstance : IamPolicy.Action("dms:ModifyReplicationInstance") {

         }       
 
      class _ModifyReplicationSubnetGroup : IamPolicy.Action("dms:ModifyReplicationSubnetGroup") {

         }       
 
      class _RefreshSchemas : IamPolicy.Action("dms:RefreshSchemas") {

         }       
 
      class _RemoveTagsFromResource : IamPolicy.Action("dms:RemoveTagsFromResource") {

         }       
 
      class _StartReplicationTask : IamPolicy.Action("dms:StartReplicationTask") {

         }       
 
      class _StopReplicationTask : IamPolicy.Action("dms:StopReplicationTask") {

         }       
 
      class _TestConnection : IamPolicy.Action("dms:TestConnection") {

         }       


}        
