
package com.typedpath.iam2kotlin.resources.elasticache

import com.typedpath.iam2kotlin.IamPolicy

class ElasticacheAction() {

    companion object { 
        val All = IamPolicy.Action("elasticache:*")    
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_AddTagsToResource.html 
        //  The AddTagsToResource action adds up to 10 cost allocation tags to the named resource.    
        val AddTagsToResource = _AddTagsToResource() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_AuthorizeCacheSecurityGroupIngress.html 
        //  The AuthorizeCacheSecurityGroupIngress action allows network ingress to a cache security group.    
        val AuthorizeCacheSecurityGroupIngress = _AuthorizeCacheSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CopySnapshot.html 
        //  The CopySnapshot action makes a copy of an existing snapshot.    
        val CopySnapshot = _CopySnapshot() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheCluster.html 
        //  The CreateCacheCluster action creates a cache cluster.    
        val CreateCacheCluster = _CreateCacheCluster() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheParameterGroup.html 
        //  The CreateCacheParameterGroup action creates a new cache parameter group.    
        val CreateCacheParameterGroup = _CreateCacheParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSecurityGroup.html 
        //  The CreateCacheSecurityGroup action creates a new cache security group.    
        val CreateCacheSecurityGroup = _CreateCacheSecurityGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html 
        //  The CreateCacheSubnetGroup action creates a new cache subnet group.    
        val CreateCacheSubnetGroup = _CreateCacheSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateReplicationGroup.html 
        //  The CreateReplicationGroup action creates a replication group.    
        val CreateReplicationGroup = _CreateReplicationGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateSnapshot.html 
        //  The CreateSnapshot action creates a copy of an entire cache cluster at a specific moment in time.    
        val CreateSnapshot = _CreateSnapshot() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteCacheCluster.html 
        //  The DeleteCacheCluster action deletes a previously provisioned cache cluster.    
        val DeleteCacheCluster = _DeleteCacheCluster() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteCacheParameterGroup.html 
        //  The DeleteCacheParameterGroup action deletes the specified cache parameter group.    
        val DeleteCacheParameterGroup = _DeleteCacheParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteCacheSecurityGroup.html 
        //  The DeleteCacheSecurityGroup action deletes a cache security group.    
        val DeleteCacheSecurityGroup = _DeleteCacheSecurityGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteCacheSubnetGroup.html 
        //  The DeleteCacheSubnetGroup action deletes a cache subnet group.    
        val DeleteCacheSubnetGroup = _DeleteCacheSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteReplicationGroup.html 
        //  The DeleteReplicationGroup action deletes an existing replication group.    
        val DeleteReplicationGroup = _DeleteReplicationGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DeleteSnapshot.html 
        //  The DeleteSnapshot action deletes an existing snapshot.    
        val DeleteSnapshot = _DeleteSnapshot() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheClusters.html 
        //  The DescribeCacheClusters action returns information about all provisioned cache clusters if no cache cluster identifier is specified, or about a specific cache cluster if a cache cluster identifier is supplied.    
        val DescribeCacheClusters = _DescribeCacheClusters() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheEngineVersions.html 
        //  The DescribeCacheEngineVersions action returns a list of the available cache engines and their versions.    
        val DescribeCacheEngineVersions = _DescribeCacheEngineVersions() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheParameterGroups.html 
        //  The DescribeCacheParameterGroups action returns a list of cache parameter group descriptions.    
        val DescribeCacheParameterGroups = _DescribeCacheParameterGroups() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheParameters.html 
        //  The DescribeCacheParameters action returns the detailed parameter list for a particular cache parameter group.    
        val DescribeCacheParameters = _DescribeCacheParameters() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheSecurityGroups.html 
        //  The DescribeCacheSecurityGroups action returns a list of cache security group descriptions.    
        val DescribeCacheSecurityGroups = _DescribeCacheSecurityGroups() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeCacheSubnetGroups.html 
        //  The DescribeCacheSubnetGroups action returns a list of cache subnet group descriptions.    
        val DescribeCacheSubnetGroups = _DescribeCacheSubnetGroups() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEngineDefaultParameters.html 
        //  The DescribeEngineDefaultParameters action returns the default engine and system parameter information for the specified cache engine.    
        val DescribeEngineDefaultParameters = _DescribeEngineDefaultParameters() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html 
        //  The DescribeEvents action returns events related to cache clusters, cache security groups, and cache parameter groups.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeReplicationGroups.html 
        //  The DescribeReplicationGroups action returns information about a particular replication group.    
        val DescribeReplicationGroups = _DescribeReplicationGroups() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeReservedCacheNodes.html 
        //  The DescribeReservedCacheNodes action returns information about reserved cache nodes for this account, or about a specified reserved cache node.    
        val DescribeReservedCacheNodes = _DescribeReservedCacheNodes() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeReservedCacheNodesOfferings.html 
        //  The DescribeReservedCacheNodesOfferings action lists available reserved cache node offerings.    
        val DescribeReservedCacheNodesOfferings = _DescribeReservedCacheNodesOfferings() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeSnapshots.html 
        //  The DescribeSnapshots action returns information about cache cluster snapshots.    
        val DescribeSnapshots = _DescribeSnapshots() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ListAllowedNodeTypeModifications.html 
        //  The ListAllowedNodeTypeModifications action lists all available node types that you can scale your Redis cluster's or replication group's current node type up to.    
        val ListAllowedNodeTypeModifications = _ListAllowedNodeTypeModifications() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ListTagsForResource.html 
        //  The ListTagsForResource action lists all cost allocation tags currently on the named resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheCluster.html 
        //  The ModifyCacheCluster action modifies the settings for a cache cluster.    
        val ModifyCacheCluster = _ModifyCacheCluster() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html 
        //  The ModifyCacheParameterGroup action modifies the parameters of a cache parameter group.    
        val ModifyCacheParameterGroup = _ModifyCacheParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheSubnetGroup.html 
        //  The ModifyCacheSubnetGroup action modifies an existing cache subnet group.    
        val ModifyCacheSubnetGroup = _ModifyCacheSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyReplicationGroup.html 
        //  The ModifyReplicationGroup action modifies the settings for a replication group.    
        val ModifyReplicationGroup = _ModifyReplicationGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_PurchaseReservedCacheNodesOffering.html 
        //  The PurchaseReservedCacheNodesOffering action allows you to purchase a reserved cache node offering.    
        val PurchaseReservedCacheNodesOffering = _PurchaseReservedCacheNodesOffering() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_RebootCacheCluster.html 
        //  The RebootCacheCluster action reboots some, or all, of the cache nodes within a provisioned cache cluster.    
        val RebootCacheCluster = _RebootCacheCluster() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_RemoveTagsFromResource.html 
        //  The RemoveTagsFromResource action removes the tags identified by the TagKeys list from the named resource.    
        val RemoveTagsFromResource = _RemoveTagsFromResource() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ResetCacheParameterGroup.html 
        //  The ResetCacheParameterGroup action modifies the parameters of a cache parameter group to the engine or system default value.    
        val ResetCacheParameterGroup = _ResetCacheParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_RevokeCacheSecurityGroupIngress.html 
        //  The RevokeCacheSecurityGroupIngress action revokes ingress from a cache security group.    
        val RevokeCacheSecurityGroupIngress = _RevokeCacheSecurityGroupIngress()
    }
      class _AddTagsToResource : IamPolicy.Action("elasticache:AddTagsToResource") {

         }       
 
      class _AuthorizeCacheSecurityGroupIngress : IamPolicy.Action("elasticache:AuthorizeCacheSecurityGroupIngress") {

         }       
 
      class _CopySnapshot : IamPolicy.Action("elasticache:CopySnapshot") {

         }       
 
      class _CreateCacheCluster : IamPolicy.Action("elasticache:CreateCacheCluster") {

         }       
 
      class _CreateCacheParameterGroup : IamPolicy.Action("elasticache:CreateCacheParameterGroup") {

         }       
 
      class _CreateCacheSecurityGroup : IamPolicy.Action("elasticache:CreateCacheSecurityGroup") {

         }       
 
      class _CreateCacheSubnetGroup : IamPolicy.Action("elasticache:CreateCacheSubnetGroup") {

         }       
 
      class _CreateReplicationGroup : IamPolicy.Action("elasticache:CreateReplicationGroup") {

         }       
 
      class _CreateSnapshot : IamPolicy.Action("elasticache:CreateSnapshot") {

         }       
 
      class _DeleteCacheCluster : IamPolicy.Action("elasticache:DeleteCacheCluster") {

         }       
 
      class _DeleteCacheParameterGroup : IamPolicy.Action("elasticache:DeleteCacheParameterGroup") {

         }       
 
      class _DeleteCacheSecurityGroup : IamPolicy.Action("elasticache:DeleteCacheSecurityGroup") {

         }       
 
      class _DeleteCacheSubnetGroup : IamPolicy.Action("elasticache:DeleteCacheSubnetGroup") {

         }       
 
      class _DeleteReplicationGroup : IamPolicy.Action("elasticache:DeleteReplicationGroup") {

         }       
 
      class _DeleteSnapshot : IamPolicy.Action("elasticache:DeleteSnapshot") {

         }       
 
      class _DescribeCacheClusters : IamPolicy.Action("elasticache:DescribeCacheClusters") {

         }       
 
      class _DescribeCacheEngineVersions : IamPolicy.Action("elasticache:DescribeCacheEngineVersions") {

         }       
 
      class _DescribeCacheParameterGroups : IamPolicy.Action("elasticache:DescribeCacheParameterGroups") {

         }       
 
      class _DescribeCacheParameters : IamPolicy.Action("elasticache:DescribeCacheParameters") {

         }       
 
      class _DescribeCacheSecurityGroups : IamPolicy.Action("elasticache:DescribeCacheSecurityGroups") {

         }       
 
      class _DescribeCacheSubnetGroups : IamPolicy.Action("elasticache:DescribeCacheSubnetGroups") {

         }       
 
      class _DescribeEngineDefaultParameters : IamPolicy.Action("elasticache:DescribeEngineDefaultParameters") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("elasticache:DescribeEvents") {

         }       
 
      class _DescribeReplicationGroups : IamPolicy.Action("elasticache:DescribeReplicationGroups") {

         }       
 
      class _DescribeReservedCacheNodes : IamPolicy.Action("elasticache:DescribeReservedCacheNodes") {

         }       
 
      class _DescribeReservedCacheNodesOfferings : IamPolicy.Action("elasticache:DescribeReservedCacheNodesOfferings") {

         }       
 
      class _DescribeSnapshots : IamPolicy.Action("elasticache:DescribeSnapshots") {

         }       
 
      class _ListAllowedNodeTypeModifications : IamPolicy.Action("elasticache:ListAllowedNodeTypeModifications") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("elasticache:ListTagsForResource") {

         }       
 
      class _ModifyCacheCluster : IamPolicy.Action("elasticache:ModifyCacheCluster") {

         }       
 
      class _ModifyCacheParameterGroup : IamPolicy.Action("elasticache:ModifyCacheParameterGroup") {

         }       
 
      class _ModifyCacheSubnetGroup : IamPolicy.Action("elasticache:ModifyCacheSubnetGroup") {

         }       
 
      class _ModifyReplicationGroup : IamPolicy.Action("elasticache:ModifyReplicationGroup") {

         }       
 
      class _PurchaseReservedCacheNodesOffering : IamPolicy.Action("elasticache:PurchaseReservedCacheNodesOffering") {

         }       
 
      class _RebootCacheCluster : IamPolicy.Action("elasticache:RebootCacheCluster") {

         }       
 
      class _RemoveTagsFromResource : IamPolicy.Action("elasticache:RemoveTagsFromResource") {

         }       
 
      class _ResetCacheParameterGroup : IamPolicy.Action("elasticache:ResetCacheParameterGroup") {

         }       
 
      class _RevokeCacheSecurityGroupIngress : IamPolicy.Action("elasticache:RevokeCacheSecurityGroupIngress") {

         }       


}        
