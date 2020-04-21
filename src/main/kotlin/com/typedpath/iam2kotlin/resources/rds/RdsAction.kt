
package com.typedpath.iam2kotlin.resources.rds

import com.typedpath.iam2kotlin.IamPolicy

class RdsAction() {

    companion object { 
        val All = IamPolicy.Action("rds:*")    
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_AddSourceIdentifierToSubscription.html 
        //  Adds a source identifier to an existing RDS event notification subscription.    
        val AddSourceIdentifierToSubscription = _AddSourceIdentifierToSubscription() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_AddTagsToResource.html 
        //  Adds metadata tags to an Amazon RDS resource.    
        val AddTagsToResource = _AddTagsToResource() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ApplyPendingMaintenanceAction.html 
        //  Applies a pending maintenance action to a resource (for example, to a DB instance).    
        val ApplyPendingMaintenanceAction = _ApplyPendingMaintenanceAction() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_AuthorizeDBSecurityGroupIngress.html 
        //  Enables ingress to a DBSecurityGroup using one of two forms of authorization.    
        val AuthorizeDBSecurityGroupIngress = _AuthorizeDBSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CopyDBClusterSnapshot.html 
        //  Creates a snapshot of a DB cluster.    
        val CopyDBClusterSnapshot = _CopyDBClusterSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CopyDBParameterGroup.html 
        //  Copies the specified DB parameter group.    
        val CopyDBParameterGroup = _CopyDBParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CopyDBSnapshot.html 
        //  Copies the specified DB snapshot.    
        val CopyDBSnapshot = _CopyDBSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CopyOptionGroup.html 
        //  Copies the specified option group.    
        val CopyOptionGroup = _CopyOptionGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBCluster.html 
        //  Creates a new Amazon Aurora DB cluster.    
        val CreateDBCluster = _CreateDBCluster() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html 
        //  Creates a new DB cluster parameter group.    
        val CreateDBClusterParameterGroup = _CreateDBClusterParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBClusterSnapshot.html 
        //  Creates a snapshot of a DB cluster.    
        val CreateDBClusterSnapshot = _CreateDBClusterSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html 
        //  Creates a new DB instance.    
        val CreateDBInstance = _CreateDBInstance() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html 
        //  Creates a DB instance for a DB instance running MySQL, MariaDB, or PostgreSQL that acts as a Read Replica of a source DB instance.    
        val CreateDBInstanceReadReplica = _CreateDBInstanceReadReplica() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBParameterGroup.html 
        //  Creates a new DB parameter group.    
        val CreateDBParameterGroup = _CreateDBParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBSecurityGroup.html 
        //  Creates a new DB security group.    
        val CreateDBSecurityGroup = _CreateDBSecurityGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBSnapshot.html 
        //  Creates a DBSnapshot.    
        val CreateDBSnapshot = _CreateDBSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBSubnetGroup.html 
        //  Creates a new DB subnet group.    
        val CreateDBSubnetGroup = _CreateDBSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateEventSubscription.html 
        //  Creates an RDS event notification subscription.    
        val CreateEventSubscription = _CreateEventSubscription() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateOptionGroup.html 
        //  Creates a new option group.    
        val CreateOptionGroup = _CreateOptionGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBCluster.html 
        //  The DeleteDBCluster action deletes a previously provisioned DB cluster.    
        val DeleteDBCluster = _DeleteDBCluster() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBClusterParameterGroup.html 
        //  Deletes a specified DB cluster parameter group.    
        val DeleteDBClusterParameterGroup = _DeleteDBClusterParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBClusterSnapshot.html 
        //  Deletes a DB cluster snapshot.    
        val DeleteDBClusterSnapshot = _DeleteDBClusterSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBInstance.html 
        //  The DeleteDBInstance action deletes a previously provisioned DB instance.    
        val DeleteDBInstance = _DeleteDBInstance() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBParameterGroup.html 
        //  Deletes a specified DBParameterGroup.    
        val DeleteDBParameterGroup = _DeleteDBParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBSecurityGroup.html 
        //  Deletes a DB security group.    
        val DeleteDBSecurityGroup = _DeleteDBSecurityGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBSnapshot.html 
        //  Deletes a DBSnapshot.    
        val DeleteDBSnapshot = _DeleteDBSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteDBSubnetGroup.html 
        //  Deletes a DB subnet group.    
        val DeleteDBSubnetGroup = _DeleteDBSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteEventSubscription.html 
        //  Deletes an RDS event notification subscription.    
        val DeleteEventSubscription = _DeleteEventSubscription() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DeleteOptionGroup.html 
        //  Deletes an existing option group.    
        val DeleteOptionGroup = _DeleteOptionGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeAccountAttributes.html 
        //  Lists all of the attributes for a customer account.    
        val DescribeAccountAttributes = _DescribeAccountAttributes() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeCertificates.html 
        //  Lists the set of CA certificates provided by Amazon RDS for this AWS account.    
        val DescribeCertificates = _DescribeCertificates() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusterParameterGroups.html 
        //  Returns a list of DBClusterParameterGroup descriptions.    
        val DescribeDBClusterParameterGroups = _DescribeDBClusterParameterGroups() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusterParameters.html 
        //  Returns the detailed parameter list for a particular DB cluster parameter group.    
        val DescribeDBClusterParameters = _DescribeDBClusterParameters() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusters.html 
        //  Returns information about provisioned Aurora DB clusters.    
        val DescribeDBClusters = _DescribeDBClusters() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusterSnapshotAttributes.html 
        //  Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.    
        val DescribeDBClusterSnapshotAttributes = _DescribeDBClusterSnapshotAttributes() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBEngineVersions.html 
        //  Returns a list of the available DB engines.    
        val DescribeDBEngineVersions = _DescribeDBEngineVersions() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBInstances.html 
        //  Returns information about provisioned RDS instances.    
        val DescribeDBInstances = _DescribeDBInstances() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBLogFiles.html 
        //  Returns a list of DB log files for the DB instance.    
        val DescribeDBLogFiles = _DescribeDBLogFiles() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBParameterGroups.html 
        //  Returns a list of DBParameterGroup descriptions.    
        val DescribeDBParameterGroups = _DescribeDBParameterGroups() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBParameters.html 
        //  Returns the detailed parameter list for a particular DB parameter group.    
        val DescribeDBParameters = _DescribeDBParameters() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBSecurityGroups.html 
        //  Returns a list of DBSecurityGroup descriptions.    
        val DescribeDBSecurityGroups = _DescribeDBSecurityGroups() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBSnapshotAttributes.html 
        //  Returns a list of DB snapshot attribute names and values for a manual DB snapshot.    
        val DescribeDBSnapshotAttributes = _DescribeDBSnapshotAttributes() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBSnapshots.html 
        //  Returns information about DB snapshots.    
        val DescribeDBSnapshots = _DescribeDBSnapshots() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBSubnetGroups.html 
        //  Returns a list of DBSubnetGroup descriptions.    
        val DescribeDBSubnetGroups = _DescribeDBSubnetGroups() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeEngineDefaultClusterParameters.html 
        //  Returns the default engine and system parameter information for the cluster database engine.    
        val DescribeEngineDefaultClusterParameters = _DescribeEngineDefaultClusterParameters() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeEngineDefaultParameters.html 
        //  Returns the default engine and system parameter information for the specified database engine.    
        val DescribeEngineDefaultParameters = _DescribeEngineDefaultParameters() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeEventCategories.html 
        //  Displays a list of categories for all event source types, or, if specified, for a specified source type.    
        val DescribeEventCategories = _DescribeEventCategories() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeEvents.html 
        //  Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14 days.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeEventSubscriptions.html 
        //  Lists all the subscription descriptions for a customer account.    
        val DescribeEventSubscriptions = _DescribeEventSubscriptions() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeOptionGroupOptions.html 
        //  Describes all available options.    
        val DescribeOptionGroupOptions = _DescribeOptionGroupOptions() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeOptionGroups.html 
        //  Describes the available option groups.    
        val DescribeOptionGroups = _DescribeOptionGroups() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeOrderableDBInstanceOptions.html 
        //  Returns a list of orderable DB instance options for the specified engine.    
        val DescribeOrderableDBInstanceOptions = _DescribeOrderableDBInstanceOptions() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribePendingMaintenanceActions.html 
        //  Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.    
        val DescribePendingMaintenanceActions = _DescribePendingMaintenanceActions() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeReservedDBInstances.html 
        //  Returns information about reserved DB instances for this account, or about a specified reserved DB instance.    
        val DescribeReservedDBInstances = _DescribeReservedDBInstances() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeReservedDBInstancesOfferings.html 
        //  Lists available reserved DB instance offerings.    
        val DescribeReservedDBInstancesOfferings = _DescribeReservedDBInstancesOfferings() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/RESTReference.html#RESTReference.DownloadCompleteDBLogFile 
        //   Downloads the contents of the specified database log file.    
        val DownloadCompleteDBLogFile = _DownloadCompleteDBLogFile() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DownloadDBLogFilePortion.html 
        //  Downloads all or a portion of the specified log file, up to 1 MB in size.    
        val DownloadDBLogFilePortion = _DownloadDBLogFilePortion() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_FailoverDBCluster.html 
        //  Forces a failover for a DB cluster.    
        val FailoverDBCluster = _FailoverDBCluster() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ListTagsForResource.html 
        //  Lists all tags on an Amazon RDS resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBCluster.html 
        //  Modify a setting for an Amazon Aurora DB cluster.    
        val ModifyDBCluster = _ModifyDBCluster() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBClusterParameterGroup.html 
        //  ???    
        val ModifyDBClusterParameterGroup = _ModifyDBClusterParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBClusterSnapshotAttribute.html 
        //  Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.    
        val ModifyDBClusterSnapshotAttribute = _ModifyDBClusterSnapshotAttribute() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBInstance.html 
        //  Modify settings for a DB instance.    
        val ModifyDBInstance = _ModifyDBInstance() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBParameterGroup.html 
        //  Modifies the parameters of a DB parameter group.    
        val ModifyDBParameterGroup = _ModifyDBParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBSnapshotAttribute.html 
        //  Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.    
        val ModifyDBSnapshotAttribute = _ModifyDBSnapshotAttribute() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBSubnetGroup.html 
        //  Modifies an existing DB subnet group.    
        val ModifyDBSubnetGroup = _ModifyDBSubnetGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyEventSubscription.html 
        //  Modifies an existing RDS event notification subscription.    
        val ModifyEventSubscription = _ModifyEventSubscription() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyOptionGroup.html 
        //  Modifies an existing option group.    
        val ModifyOptionGroup = _ModifyOptionGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PromoteReadReplica.html 
        //  Promotes a Read Replica DB instance to a standalone DB instance.    
        val PromoteReadReplica = _PromoteReadReplica() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PromoteReadReplicaDBCluster.html 
        //  Promotes a Read Replica DB cluster to a standalone DB cluster.    
        val PromoteReadReplicaDBCluster = _PromoteReadReplicaDBCluster() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PurchaseReservedDBInstancesOffering.html 
        //  Purchases a reserved DB instance offering.    
        val PurchaseReservedDBInstancesOffering = _PurchaseReservedDBInstancesOffering() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RebootDBInstance.html 
        //  Rebooting a DB instance restarts the database engine service.    
        val RebootDBInstance = _RebootDBInstance() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RemoveSourceIdentifierFromSubscription.html 
        //  Removes a source identifier from an existing RDS event notification subscription.    
        val RemoveSourceIdentifierFromSubscription = _RemoveSourceIdentifierFromSubscription() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RemoveTagsFromResource.html 
        //  Removes metadata tags from an Amazon RDS resource.    
        val RemoveTagsFromResource = _RemoveTagsFromResource() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ResetDBClusterParameterGroup.html 
        //  Modifies the parameters of a DB cluster parameter group to the default value.    
        val ResetDBClusterParameterGroup = _ResetDBClusterParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ResetDBParameterGroup.html 
        //  Modifies the parameters of a DB parameter group to the engine/system default value.    
        val ResetDBParameterGroup = _ResetDBParameterGroup() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RestoreDBClusterFromS3.html 
        //  Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket.    
        val RestoreDBClusterFromS3 = _RestoreDBClusterFromS3() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RestoreDBClusterFromSnapshot.html 
        //  Creates a new DB cluster from a DB cluster snapshot.    
        val RestoreDBClusterFromSnapshot = _RestoreDBClusterFromSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RestoreDBClusterToPointInTime.html 
        //  Restores a DB cluster to an arbitrary point in time.    
        val RestoreDBClusterToPointInTime = _RestoreDBClusterToPointInTime() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RestoreDBInstanceFromDBSnapshot.html 
        //  Creates a new DB instance from a DB snapshot.    
        val RestoreDBInstanceFromDBSnapshot = _RestoreDBInstanceFromDBSnapshot() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RestoreDBInstanceToPointInTime.html 
        //  Restores a DB instance to an arbitrary point in time.    
        val RestoreDBInstanceToPointInTime = _RestoreDBInstanceToPointInTime() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_RevokeDBSecurityGroupIngress.html 
        //  Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.    
        val RevokeDBSecurityGroupIngress = _RevokeDBSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DescribeDBClusterSnapshots.html 
        //  Returns information about DB cluster snapshots.    
        val DescribeDBClusterSnapshots = _DescribeDBClusterSnapshots() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstance.html 
        //  Starts a DB instance that was stopped.    
        val StartDBInstance = _StartDBInstance() 
        // see http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StopDBInstance.html 
        //  Stops a DB instance.    
        val StopDBInstance = _StopDBInstance()
    }
      class _AddSourceIdentifierToSubscription : IamPolicy.Action("rds:AddSourceIdentifierToSubscription") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _AddTagsToResource : IamPolicy.Action("rds:AddTagsToResource") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
             //arn:aws:rds:$region:$account:ri:$reserved-db-instance-name"
            fun ri_byRegionAccountReserveddbinstancename(region: String, account: String, reserveddbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:ri:$reserveddbinstancename")
         }       
 
      class _ApplyPendingMaintenanceAction : IamPolicy.Action("rds:ApplyPendingMaintenanceAction") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _AuthorizeDBSecurityGroupIngress : IamPolicy.Action("rds:AuthorizeDBSecurityGroupIngress") {
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _CopyDBClusterSnapshot : IamPolicy.Action("rds:CopyDBClusterSnapshot") {
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _CopyDBParameterGroup : IamPolicy.Action("rds:CopyDBParameterGroup") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _CopyDBSnapshot : IamPolicy.Action("rds:CopyDBSnapshot") {
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _CopyOptionGroup : IamPolicy.Action("rds:CopyOptionGroup") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _CreateDBCluster : IamPolicy.Action("rds:CreateDBCluster") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _CreateDBClusterParameterGroup : IamPolicy.Action("rds:CreateDBClusterParameterGroup") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _CreateDBClusterSnapshot : IamPolicy.Action("rds:CreateDBClusterSnapshot") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _CreateDBInstance : IamPolicy.Action("rds:CreateDBInstance") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _CreateDBInstanceReadReplica : IamPolicy.Action("rds:CreateDBInstanceReadReplica") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _CreateDBParameterGroup : IamPolicy.Action("rds:CreateDBParameterGroup") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _CreateDBSecurityGroup : IamPolicy.Action("rds:CreateDBSecurityGroup") {
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _CreateDBSnapshot : IamPolicy.Action("rds:CreateDBSnapshot") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _CreateDBSubnetGroup : IamPolicy.Action("rds:CreateDBSubnetGroup") {
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _CreateEventSubscription : IamPolicy.Action("rds:CreateEventSubscription") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _CreateOptionGroup : IamPolicy.Action("rds:CreateOptionGroup") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _DeleteDBCluster : IamPolicy.Action("rds:DeleteDBCluster") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _DeleteDBClusterParameterGroup : IamPolicy.Action("rds:DeleteDBClusterParameterGroup") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _DeleteDBClusterSnapshot : IamPolicy.Action("rds:DeleteDBClusterSnapshot") {
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _DeleteDBInstance : IamPolicy.Action("rds:DeleteDBInstance") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _DeleteDBParameterGroup : IamPolicy.Action("rds:DeleteDBParameterGroup") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _DeleteDBSecurityGroup : IamPolicy.Action("rds:DeleteDBSecurityGroup") {
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _DeleteDBSnapshot : IamPolicy.Action("rds:DeleteDBSnapshot") {
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _DeleteDBSubnetGroup : IamPolicy.Action("rds:DeleteDBSubnetGroup") {
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _DeleteEventSubscription : IamPolicy.Action("rds:DeleteEventSubscription") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _DeleteOptionGroup : IamPolicy.Action("rds:DeleteOptionGroup") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _DescribeAccountAttributes : IamPolicy.Action("rds:DescribeAccountAttributes") {

         }       
 
      class _DescribeCertificates : IamPolicy.Action("rds:DescribeCertificates") {

         }       
 
      class _DescribeDBClusterParameterGroups : IamPolicy.Action("rds:DescribeDBClusterParameterGroups") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _DescribeDBClusterParameters : IamPolicy.Action("rds:DescribeDBClusterParameters") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _DescribeDBClusters : IamPolicy.Action("rds:DescribeDBClusters") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
         }       
 
      class _DescribeDBClusterSnapshotAttributes : IamPolicy.Action("rds:DescribeDBClusterSnapshotAttributes") {
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _DescribeDBEngineVersions : IamPolicy.Action("rds:DescribeDBEngineVersions") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _DescribeDBInstances : IamPolicy.Action("rds:DescribeDBInstances") {

         }       
 
      class _DescribeDBLogFiles : IamPolicy.Action("rds:DescribeDBLogFiles") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _DescribeDBParameterGroups : IamPolicy.Action("rds:DescribeDBParameterGroups") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _DescribeDBParameters : IamPolicy.Action("rds:DescribeDBParameters") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _DescribeDBSecurityGroups : IamPolicy.Action("rds:DescribeDBSecurityGroups") {
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _DescribeDBSnapshotAttributes : IamPolicy.Action("rds:DescribeDBSnapshotAttributes") {
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _DescribeDBSnapshots : IamPolicy.Action("rds:DescribeDBSnapshots") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _DescribeDBSubnetGroups : IamPolicy.Action("rds:DescribeDBSubnetGroups") {
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _DescribeEngineDefaultClusterParameters : IamPolicy.Action("rds:DescribeEngineDefaultClusterParameters") {

         }       
 
      class _DescribeEngineDefaultParameters : IamPolicy.Action("rds:DescribeEngineDefaultParameters") {

         }       
 
      class _DescribeEventCategories : IamPolicy.Action("rds:DescribeEventCategories") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("rds:DescribeEvents") {

         }       
 
      class _DescribeEventSubscriptions : IamPolicy.Action("rds:DescribeEventSubscriptions") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _DescribeOptionGroupOptions : IamPolicy.Action("rds:DescribeOptionGroupOptions") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _DescribeOptionGroups : IamPolicy.Action("rds:DescribeOptionGroups") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _DescribeOrderableDBInstanceOptions : IamPolicy.Action("rds:DescribeOrderableDBInstanceOptions") {

         }       
 
      class _DescribePendingMaintenanceActions : IamPolicy.Action("rds:DescribePendingMaintenanceActions") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _DescribeReservedDBInstances : IamPolicy.Action("rds:DescribeReservedDBInstances") {
             //arn:aws:rds:$region:$account:ri:$reserved-db-instance-name"
            fun ri_byRegionAccountReserveddbinstancename(region: String, account: String, reserveddbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:ri:$reserveddbinstancename")
         }       
 
      class _DescribeReservedDBInstancesOfferings : IamPolicy.Action("rds:DescribeReservedDBInstancesOfferings") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _DownloadCompleteDBLogFile : IamPolicy.Action("rds:DownloadCompleteDBLogFile") {

         }       
 
      class _DownloadDBLogFilePortion : IamPolicy.Action("rds:DownloadDBLogFilePortion") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _FailoverDBCluster : IamPolicy.Action("rds:FailoverDBCluster") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
         }       
 
      class _ListTagsForResource : IamPolicy.Action("rds:ListTagsForResource") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
             //arn:aws:rds:$region:$account:ri:$reserved-db-instance-name"
            fun ri_byRegionAccountReserveddbinstancename(region: String, account: String, reserveddbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:ri:$reserveddbinstancename")
         }       
 
      class _ModifyDBCluster : IamPolicy.Action("rds:ModifyDBCluster") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _ModifyDBClusterParameterGroup : IamPolicy.Action("rds:ModifyDBClusterParameterGroup") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _ModifyDBClusterSnapshotAttribute : IamPolicy.Action("rds:ModifyDBClusterSnapshotAttribute") {
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _ModifyDBInstance : IamPolicy.Action("rds:ModifyDBInstance") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _ModifyDBParameterGroup : IamPolicy.Action("rds:ModifyDBParameterGroup") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _ModifyDBSnapshotAttribute : IamPolicy.Action("rds:ModifyDBSnapshotAttribute") {
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
         }       
 
      class _ModifyDBSubnetGroup : IamPolicy.Action("rds:ModifyDBSubnetGroup") {
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _ModifyEventSubscription : IamPolicy.Action("rds:ModifyEventSubscription") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _ModifyOptionGroup : IamPolicy.Action("rds:ModifyOptionGroup") {
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
         }       
 
      class _PromoteReadReplica : IamPolicy.Action("rds:PromoteReadReplica") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _PromoteReadReplicaDBCluster : IamPolicy.Action("rds:PromoteReadReplicaDBCluster") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-name"
            fun cluster_byRegionAccountDbclustername(region: String, account: String, dbclustername: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclustername")
         }       
 
      class _PurchaseReservedDBInstancesOffering : IamPolicy.Action("rds:PurchaseReservedDBInstancesOffering") {

         }       
 
      class _RebootDBInstance : IamPolicy.Action("rds:RebootDBInstance") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
         }       
 
      class _RemoveSourceIdentifierFromSubscription : IamPolicy.Action("rds:RemoveSourceIdentifierFromSubscription") {
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
         }       
 
      class _RemoveTagsFromResource : IamPolicy.Action("rds:RemoveTagsFromResource") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
             //arn:aws:rds:$region:$account:es:$subscription-name"
            fun es_byRegionAccountSubscriptionname(region: String, account: String, subscriptionname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:es:$subscriptionname")
             //arn:aws:rds:$region:$account:ri:$reserved-db-instance-name"
            fun ri_byRegionAccountReserveddbinstancename(region: String, account: String, reserveddbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:ri:$reserveddbinstancename")
         }       
 
      class _ResetDBClusterParameterGroup : IamPolicy.Action("rds:ResetDBClusterParameterGroup") {
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
         }       
 
      class _ResetDBParameterGroup : IamPolicy.Action("rds:ResetDBParameterGroup") {
             //arn:aws:rds:$region:$account:pg:$parameter-group-name"
            fun pg_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:pg:$parametergroupname")
         }       
 
      class _RestoreDBClusterFromS3 : IamPolicy.Action("rds:RestoreDBClusterFromS3") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-instance-name"
            fun cluster_byRegionAccountDbclusterinstancename(region: String, account: String, dbclusterinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclusterinstancename")
             //arn:aws:rds:$region:$account:cluster-pg:$cluster-parameter-group-name"
            fun clusterpg_byRegionAccountClusterparametergroupname(region: String, account: String, clusterparametergroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-pg:$clusterparametergroupname")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _RestoreDBClusterFromSnapshot : IamPolicy.Action("rds:RestoreDBClusterFromSnapshot") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-instance-name"
            fun cluster_byRegionAccountDbclusterinstancename(region: String, account: String, dbclusterinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclusterinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:cluster-snapshot:$cluster-snapshot-name"
            fun clustersnapshot_byRegionAccountClustersnapshotname(region: String, account: String, clustersnapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster-snapshot:$clustersnapshotname")
         }       
 
      class _RestoreDBClusterToPointInTime : IamPolicy.Action("rds:RestoreDBClusterToPointInTime") {
             //arn:aws:rds:$region:$account:cluster:$db-cluster-instance-name"
            fun cluster_byRegionAccountDbclusterinstancename(region: String, account: String, dbclusterinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:cluster:$dbclusterinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _RestoreDBInstanceFromDBSnapshot : IamPolicy.Action("rds:RestoreDBInstanceFromDBSnapshot") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _RestoreDBInstanceToPointInTime : IamPolicy.Action("rds:RestoreDBInstanceToPointInTime") {
             //arn:aws:rds:$region:$account:db:$db-instance-name"
            fun db_byRegionAccountDbinstancename(region: String, account: String, dbinstancename: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:db:$dbinstancename")
             //arn:aws:rds:$region:$account:og:$option-group-name"
            fun og_byRegionAccountOptiongroupname(region: String, account: String, optiongroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:og:$optiongroupname")
             //arn:aws:rds:$region:$account:snapshot:$snapshot-name"
            fun snapshot_byRegionAccountSnapshotname(region: String, account: String, snapshotname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:snapshot:$snapshotname")
             //arn:aws:rds:$region:$account:subgrp:$subnet-group-name"
            fun subgrp_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:subgrp:$subnetgroupname")
         }       
 
      class _RevokeDBSecurityGroupIngress : IamPolicy.Action("rds:RevokeDBSecurityGroupIngress") {
             //arn:aws:rds:$region:$account:secgrp:$security-group-name"
            fun secgrp_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:rds:$region:$account:secgrp:$securitygroupname")
         }       
 
      class _DescribeDBClusterSnapshots : IamPolicy.Action("rds:DescribeDBClusterSnapshots") {

         }       
 
      class _StartDBInstance : IamPolicy.Action("rds:StartDBInstance") {

         }       
 
      class _StopDBInstance : IamPolicy.Action("rds:StopDBInstance") {

         }       


}        
