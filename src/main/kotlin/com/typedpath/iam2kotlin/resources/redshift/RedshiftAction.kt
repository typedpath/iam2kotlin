
package com.typedpath.iam2kotlin.resources.redshift

import com.typedpath.iam2kotlin.IamPolicy

class RedshiftAction() {

    companion object { 
        val All = IamPolicy.Action("redshift:*")    
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_AuthorizeClusterSecurityGroupIngress.html 
        //  ???    
        val AuthorizeClusterSecurityGroupIngress = _AuthorizeClusterSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_AuthorizeSnapshotAccess.html 
        //  ???    
        val AuthorizeSnapshotAccess = _AuthorizeSnapshotAccess() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CancelQuerySession.html 
        //  ???    
        val CancelQuerySession = _CancelQuerySession() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CopyClusterSnapshot.html 
        //  ???    
        val CopyClusterSnapshot = _CopyClusterSnapshot() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateCluster.html 
        //  ???    
        val CreateCluster = _CreateCluster() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterParameterGroup.html 
        //  ???    
        val CreateClusterParameterGroup = _CreateClusterParameterGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSecurityGroup.html 
        //  ???    
        val CreateClusterSecurityGroup = _CreateClusterSecurityGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSnapshot.html 
        //  ???    
        val CreateClusterSnapshot = _CreateClusterSnapshot() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateClusterSubnetGroup.html 
        //  ???    
        val CreateClusterSubnetGroup = _CreateClusterSubnetGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateEventSubscription.html 
        //  ???    
        val CreateEventSubscription = _CreateEventSubscription() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateHsmClientCertificate.html 
        //  ???    
        val CreateHsmClientCertificate = _CreateHsmClientCertificate() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateHsmConfiguration.html 
        //  ???    
        val CreateHsmConfiguration = _CreateHsmConfiguration() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateSnapshotCopyGrant.html 
        //  ???    
        val CreateSnapshotCopyGrant = _CreateSnapshotCopyGrant() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_CreateTags.html 
        //  ???    
        val CreateTags = _CreateTags() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteCluster.html 
        //  ???    
        val DeleteCluster = _DeleteCluster() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteClusterParameterGroup.html 
        //  ???    
        val DeleteClusterParameterGroup = _DeleteClusterParameterGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteClusterSecurityGroup.html 
        //  ???    
        val DeleteClusterSecurityGroup = _DeleteClusterSecurityGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteClusterSnapshot.html 
        //  ???    
        val DeleteClusterSnapshot = _DeleteClusterSnapshot() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteClusterSubnetGroup.html 
        //  ???    
        val DeleteClusterSubnetGroup = _DeleteClusterSubnetGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteEventSubscription.html 
        //  ???    
        val DeleteEventSubscription = _DeleteEventSubscription() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteHsmClientCertificate.html 
        //  ???    
        val DeleteHsmClientCertificate = _DeleteHsmClientCertificate() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteHsmConfiguration.html 
        //  ???    
        val DeleteHsmConfiguration = _DeleteHsmConfiguration() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DeleteTags.html 
        //  ???    
        val DeleteTags = _DeleteTags() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterParameterGroups.html 
        //  ???    
        val DescribeClusterParameterGroups = _DescribeClusterParameterGroups() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterParameters.html 
        //  ???    
        val DescribeClusterParameters = _DescribeClusterParameters() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterSecurityGroups.html 
        //  ???    
        val DescribeClusterSecurityGroups = _DescribeClusterSecurityGroups() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterSnapshots.html 
        //  ???    
        val DescribeClusterSnapshots = _DescribeClusterSnapshots() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterSubnetGroups.html 
        //  ???    
        val DescribeClusterSubnetGroups = _DescribeClusterSubnetGroups() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusterVersions.html 
        //  ???    
        val DescribeClusterVersions = _DescribeClusterVersions() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeClusters.html 
        //  ???    
        val DescribeClusters = _DescribeClusters() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeDefaultClusterParameters.html 
        //  ???    
        val DescribeDefaultClusterParameters = _DescribeDefaultClusterParameters() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeEventCategories.html 
        //  ???    
        val DescribeEventCategories = _DescribeEventCategories() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeEventSubscriptions.html 
        //  ???    
        val DescribeEventSubscriptions = _DescribeEventSubscriptions() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeEvents.html 
        //  ???    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeHsmClientCertificates.html 
        //  ???    
        val DescribeHsmClientCertificates = _DescribeHsmClientCertificates() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeHsmConfigurations.html 
        //  ???    
        val DescribeHsmConfigurations = _DescribeHsmConfigurations() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeLoggingStatus.html 
        //  ???    
        val DescribeLoggingStatus = _DescribeLoggingStatus() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeOrderableClusterOptions.html 
        //  ???    
        val DescribeOrderableClusterOptions = _DescribeOrderableClusterOptions() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeReservedNodeOfferings.html 
        //  ???    
        val DescribeReservedNodeOfferings = _DescribeReservedNodeOfferings() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeReservedNodes.html 
        //  ???    
        val DescribeReservedNodes = _DescribeReservedNodes() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeResize.html 
        //  ???    
        val DescribeResize = _DescribeResize() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeSnapshotCopyGrants.html 
        //  ???    
        val DescribeSnapshotCopyGrants = _DescribeSnapshotCopyGrants() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeTableRestoreStatus.html 
        //  ???    
        val DescribeTableRestoreStatus = _DescribeTableRestoreStatus() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DescribeTags.html 
        //  ???    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DisableLogging.html 
        //  ???    
        val DisableLogging = _DisableLogging() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_DisableSnapshotCopy.html 
        //  ???    
        val DisableSnapshotCopy = _DisableSnapshotCopy() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_EnableLogging.html 
        //  ???    
        val EnableLogging = _EnableLogging() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_EnableSnapshotCopy.html 
        //  ???    
        val EnableSnapshotCopy = _EnableSnapshotCopy() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_GetClusterCredentials.html 
        //  Get a temporary cluster credential for the specified redshift user    
        val GetClusterCredentials = _GetClusterCredentials() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifyCluster.html 
        //  ???    
        val ModifyCluster = _ModifyCluster() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifyClusterIamRoles.html 
        //  ???    
        val ModifyClusterIamRoles = _ModifyClusterIamRoles() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifyClusterParameterGroup.html 
        //  ???    
        val ModifyClusterParameterGroup = _ModifyClusterParameterGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifyClusterSubnetGroup.html 
        //  ???    
        val ModifyClusterSubnetGroup = _ModifyClusterSubnetGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifyEventSubscription.html 
        //  ???    
        val ModifyEventSubscription = _ModifyEventSubscription() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ModifySnapshotCopyRetentionPeriod.html 
        //  ???    
        val ModifySnapshotCopyRetentionPeriod = _ModifySnapshotCopyRetentionPeriod() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_PurchaseReservedNodeOffering.html 
        //  ???    
        val PurchaseReservedNodeOffering = _PurchaseReservedNodeOffering() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RebootCluster.html 
        //  ???    
        val RebootCluster = _RebootCluster() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ResetClusterParameterGroup.html 
        //  ???    
        val ResetClusterParameterGroup = _ResetClusterParameterGroup() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RestoreFromClusterSnapshot.html 
        //  ???    
        val RestoreFromClusterSnapshot = _RestoreFromClusterSnapshot() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RestoreTableFromClusterSnapshot.html 
        //  ???    
        val RestoreTableFromClusterSnapshot = _RestoreTableFromClusterSnapshot() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RevokeClusterSecurityGroupIngress.html 
        //  ???    
        val RevokeClusterSecurityGroupIngress = _RevokeClusterSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RevokeSnapshotAccess.html 
        //  ???    
        val RevokeSnapshotAccess = _RevokeSnapshotAccess() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_RotateEncryptionKey.html 
        //  ???    
        val RotateEncryptionKey = _RotateEncryptionKey() 
        // see http://docs.aws.amazon.com/redshift/latest/APIReference/API_ViewQueriesInConsole.html 
        //  ???    
        val ViewQueriesInConsole = _ViewQueriesInConsole()
    }
      class _AuthorizeClusterSecurityGroupIngress : IamPolicy.Action("redshift:AuthorizeClusterSecurityGroupIngress") {
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
         }       
 
      class _AuthorizeSnapshotAccess : IamPolicy.Action("redshift:AuthorizeSnapshotAccess") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
         }       
 
      class _CancelQuerySession : IamPolicy.Action("redshift:CancelQuerySession") {

         }       
 
      class _CopyClusterSnapshot : IamPolicy.Action("redshift:CopyClusterSnapshot") {
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$source-snapshot-name"
            fun snapshot_byRegionAccountClusternameSourcesnapshotname(region: String, account: String, clustername: String, sourcesnapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$sourcesnapshotname")
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$target-snapshot-name"
            fun snapshot_byRegionAccountClusternameTargetsnapshotname(region: String, account: String, clustername: String, targetsnapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$targetsnapshotname")
         }       
 
      class _CreateCluster : IamPolicy.Action("redshift:CreateCluster") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _CreateClusterParameterGroup : IamPolicy.Action("redshift:CreateClusterParameterGroup") {
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
         }       
 
      class _CreateClusterSecurityGroup : IamPolicy.Action("redshift:CreateClusterSecurityGroup") {
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
         }       
 
      class _CreateClusterSnapshot : IamPolicy.Action("redshift:CreateClusterSnapshot") {
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
         }       
 
      class _CreateClusterSubnetGroup : IamPolicy.Action("redshift:CreateClusterSubnetGroup") {
             //arn:aws:redshift:$region:$account:subnetgroup:$subnet-group-name"
            fun subnetgroup_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:subnetgroup:$subnetgroupname")
         }       
 
      class _CreateEventSubscription : IamPolicy.Action("redshift:CreateEventSubscription") {
             //arn:aws:redshift:$region:$account:eventsubscription:$event-subscription-name"
            fun eventsubscription_byRegionAccountEventsubscriptionname(region: String, account: String, eventsubscriptionname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:eventsubscription:$eventsubscriptionname")
         }       
 
      class _CreateHsmClientCertificate : IamPolicy.Action("redshift:CreateHsmClientCertificate") {
             //arn:aws:redshift:$region:$account:hsmclientcertificate:$hsm-client-certificate-id"
            fun hsmclientcertificate_byRegionAccountHsmclientcertificateid(region: String, account: String, hsmclientcertificateid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmclientcertificate:$hsmclientcertificateid")
         }       
 
      class _CreateHsmConfiguration : IamPolicy.Action("redshift:CreateHsmConfiguration") {
             //arn:aws:redshift:$region:$account:hsmconfiguration:$hsm-configuration-id"
            fun hsmconfiguration_byRegionAccountHsmconfigurationid(region: String, account: String, hsmconfigurationid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmconfiguration:$hsmconfigurationid")
         }       
 
      class _CreateSnapshotCopyGrant : IamPolicy.Action("redshift:CreateSnapshotCopyGrant") {
             //arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshot-copy-grant-name"
            fun snapshotcopygrant_byRegionAccountSnapshotcopygrantname(region: String, account: String, snapshotcopygrantname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshotcopygrantname")
         }       
 
      class _CreateTags : IamPolicy.Action("redshift:CreateTags") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
             //arn:aws:redshift:$region:$account:hsmclientcertificate:$hsm-client-certificate-id"
            fun hsmclientcertificate_byRegionAccountHsmclientcertificateid(region: String, account: String, hsmclientcertificateid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmclientcertificate:$hsmclientcertificateid")
             //arn:aws:redshift:$region:$account:hsmconfiguration:$hsm-configuration-id"
            fun hsmconfiguration_byRegionAccountHsmconfigurationid(region: String, account: String, hsmconfigurationid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmconfiguration:$hsmconfigurationid")
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
             //arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshot-copy-grant-name"
            fun snapshotcopygrant_byRegionAccountSnapshotcopygrantname(region: String, account: String, snapshotcopygrantname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshotcopygrantname")
             //arn:aws:redshift:$region:$account:subnetgroup:$subnet-group-name"
            fun subnetgroup_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:subnetgroup:$subnetgroupname")
         }       
 
      class _DeleteCluster : IamPolicy.Action("redshift:DeleteCluster") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _DeleteClusterParameterGroup : IamPolicy.Action("redshift:DeleteClusterParameterGroup") {
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
         }       
 
      class _DeleteClusterSecurityGroup : IamPolicy.Action("redshift:DeleteClusterSecurityGroup") {
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
         }       
 
      class _DeleteClusterSnapshot : IamPolicy.Action("redshift:DeleteClusterSnapshot") {
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
         }       
 
      class _DeleteClusterSubnetGroup : IamPolicy.Action("redshift:DeleteClusterSubnetGroup") {
             //arn:aws:redshift:$region:$account:subnetgroup:$subnet-group-name"
            fun subnetgroup_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:subnetgroup:$subnetgroupname")
         }       
 
      class _DeleteEventSubscription : IamPolicy.Action("redshift:DeleteEventSubscription") {
             //arn:aws:redshift:$region:$account:eventsubscription:$event-subscription-name"
            fun eventsubscription_byRegionAccountEventsubscriptionname(region: String, account: String, eventsubscriptionname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:eventsubscription:$eventsubscriptionname")
         }       
 
      class _DeleteHsmClientCertificate : IamPolicy.Action("redshift:DeleteHsmClientCertificate") {
             //arn:aws:redshift:$region:$account:hsmclientcertificate:$hsm-client-certificate-id"
            fun hsmclientcertificate_byRegionAccountHsmclientcertificateid(region: String, account: String, hsmclientcertificateid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmclientcertificate:$hsmclientcertificateid")
         }       
 
      class _DeleteHsmConfiguration : IamPolicy.Action("redshift:DeleteHsmConfiguration") {
             //arn:aws:redshift:$region:$account:hsmconfiguration:$hsm-configuration-id"
            fun hsmconfiguration_byRegionAccountHsmconfigurationid(region: String, account: String, hsmconfigurationid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmconfiguration:$hsmconfigurationid")
         }       
 
      class _DeleteTags : IamPolicy.Action("redshift:DeleteTags") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
             //arn:aws:redshift:$region:$account:hsmclientcertificate:$hsm-client-certificate-id"
            fun hsmclientcertificate_byRegionAccountHsmclientcertificateid(region: String, account: String, hsmclientcertificateid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmclientcertificate:$hsmclientcertificateid")
             //arn:aws:redshift:$region:$account:hsmconfiguration:$hsm-configuration-id"
            fun hsmconfiguration_byRegionAccountHsmconfigurationid(region: String, account: String, hsmconfigurationid: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:hsmconfiguration:$hsmconfigurationid")
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
             //arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshot-copy-grant-name"
            fun snapshotcopygrant_byRegionAccountSnapshotcopygrantname(region: String, account: String, snapshotcopygrantname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshotcopygrant:$snapshotcopygrantname")
             //arn:aws:redshift:$region:$account:subnetgroup:$subnet-group-name"
            fun subnetgroup_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:subnetgroup:$subnetgroupname")
         }       
 
      class _DescribeClusterParameterGroups : IamPolicy.Action("redshift:DescribeClusterParameterGroups") {

         }       
 
      class _DescribeClusterParameters : IamPolicy.Action("redshift:DescribeClusterParameters") {
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
         }       
 
      class _DescribeClusterSecurityGroups : IamPolicy.Action("redshift:DescribeClusterSecurityGroups") {

         }       
 
      class _DescribeClusterSnapshots : IamPolicy.Action("redshift:DescribeClusterSnapshots") {

         }       
 
      class _DescribeClusterSubnetGroups : IamPolicy.Action("redshift:DescribeClusterSubnetGroups") {

         }       
 
      class _DescribeClusterVersions : IamPolicy.Action("redshift:DescribeClusterVersions") {

         }       
 
      class _DescribeClusters : IamPolicy.Action("redshift:DescribeClusters") {

         }       
 
      class _DescribeDefaultClusterParameters : IamPolicy.Action("redshift:DescribeDefaultClusterParameters") {

         }       
 
      class _DescribeEventCategories : IamPolicy.Action("redshift:DescribeEventCategories") {

         }       
 
      class _DescribeEventSubscriptions : IamPolicy.Action("redshift:DescribeEventSubscriptions") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("redshift:DescribeEvents") {

         }       
 
      class _DescribeHsmClientCertificates : IamPolicy.Action("redshift:DescribeHsmClientCertificates") {

         }       
 
      class _DescribeHsmConfigurations : IamPolicy.Action("redshift:DescribeHsmConfigurations") {

         }       
 
      class _DescribeLoggingStatus : IamPolicy.Action("redshift:DescribeLoggingStatus") {

         }       
 
      class _DescribeOrderableClusterOptions : IamPolicy.Action("redshift:DescribeOrderableClusterOptions") {

         }       
 
      class _DescribeReservedNodeOfferings : IamPolicy.Action("redshift:DescribeReservedNodeOfferings") {

         }       
 
      class _DescribeReservedNodes : IamPolicy.Action("redshift:DescribeReservedNodes") {

         }       
 
      class _DescribeResize : IamPolicy.Action("redshift:DescribeResize") {

         }       
 
      class _DescribeSnapshotCopyGrants : IamPolicy.Action("redshift:DescribeSnapshotCopyGrants") {

         }       
 
      class _DescribeTableRestoreStatus : IamPolicy.Action("redshift:DescribeTableRestoreStatus") {

         }       
 
      class _DescribeTags : IamPolicy.Action("redshift:DescribeTags") {

         }       
 
      class _DisableLogging : IamPolicy.Action("redshift:DisableLogging") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _DisableSnapshotCopy : IamPolicy.Action("redshift:DisableSnapshotCopy") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _EnableLogging : IamPolicy.Action("redshift:EnableLogging") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _EnableSnapshotCopy : IamPolicy.Action("redshift:EnableSnapshotCopy") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _GetClusterCredentials : IamPolicy.Action("redshift:GetClusterCredentials") {
             //arn:aws:redshift:$region:$account:dbuser:$cluster-name/$dbname"
            fun dbuser_byRegionAccountClusternameDbname(region: String, account: String, clustername: String, dbname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:dbuser:$clustername/$dbname")
             //arn:aws:redshift:$region:$account:dbuser:$cluster-name/$dbgroup"
            fun dbuser_byRegionAccountClusternameDbgroup(region: String, account: String, clustername: String, dbgroup: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:dbuser:$clustername/$dbgroup")
             //arn:aws:redshift:$region:$account:dbuser:$cluster-name/$dbuser"
            fun dbuser_byRegionAccountClusternameDbuser(region: String, account: String, clustername: String, dbuser: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:dbuser:$clustername/$dbuser")
         }       
 
      class _ModifyCluster : IamPolicy.Action("redshift:ModifyCluster") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _ModifyClusterIamRoles : IamPolicy.Action("redshift:ModifyClusterIamRoles") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _ModifyClusterParameterGroup : IamPolicy.Action("redshift:ModifyClusterParameterGroup") {
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
         }       
 
      class _ModifyClusterSubnetGroup : IamPolicy.Action("redshift:ModifyClusterSubnetGroup") {
             //arn:aws:redshift:$region:$account:subnetgroup:$subnet-group-name"
            fun subnetgroup_byRegionAccountSubnetgroupname(region: String, account: String, subnetgroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:subnetgroup:$subnetgroupname")
         }       
 
      class _ModifyEventSubscription : IamPolicy.Action("redshift:ModifyEventSubscription") {
             //arn:aws:redshift:$region:$account:eventsubscription:$event-subscription-name"
            fun eventsubscription_byRegionAccountEventsubscriptionname(region: String, account: String, eventsubscriptionname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:eventsubscription:$eventsubscriptionname")
         }       
 
      class _ModifySnapshotCopyRetentionPeriod : IamPolicy.Action("redshift:ModifySnapshotCopyRetentionPeriod") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _PurchaseReservedNodeOffering : IamPolicy.Action("redshift:PurchaseReservedNodeOffering") {

         }       
 
      class _RebootCluster : IamPolicy.Action("redshift:RebootCluster") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _ResetClusterParameterGroup : IamPolicy.Action("redshift:ResetClusterParameterGroup") {
             //arn:aws:redshift:$region:$account:parametergroup:$parameter-group-name"
            fun parametergroup_byRegionAccountParametergroupname(region: String, account: String, parametergroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:parametergroup:$parametergroupname")
         }       
 
      class _RestoreFromClusterSnapshot : IamPolicy.Action("redshift:RestoreFromClusterSnapshot") {
             //arn:aws:redshift:$region:$account:cluster:$target-cluster-name"
            fun cluster_byRegionAccountTargetclustername(region: String, account: String, targetclustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$targetclustername")
             //arn:aws:redshift:$region:$account:snapshot:$snapshot-cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountSnapshotclusternameSnapshotname(region: String, account: String, snapshotclustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$snapshotclustername/$snapshotname")
         }       
 
      class _RestoreTableFromClusterSnapshot : IamPolicy.Action("redshift:RestoreTableFromClusterSnapshot") {
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
         }       
 
      class _RevokeClusterSecurityGroupIngress : IamPolicy.Action("redshift:RevokeClusterSecurityGroupIngress") {
             //arn:aws:redshift:$region:$account:securitygroup:$security-group-name"
            fun securitygroup_byRegionAccountSecuritygroupname(region: String, account: String, securitygroupname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:securitygroup:$securitygroupname")
         }       
 
      class _RevokeSnapshotAccess : IamPolicy.Action("redshift:RevokeSnapshotAccess") {
             //arn:aws:redshift:$region:$account:snapshot:$cluster-name/$snapshot-name"
            fun snapshot_byRegionAccountClusternameSnapshotname(region: String, account: String, clustername: String, snapshotname: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:snapshot:$clustername/$snapshotname")
         }       
 
      class _RotateEncryptionKey : IamPolicy.Action("redshift:RotateEncryptionKey") {
             //arn:aws:redshift:$region:$account:cluster:$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:redshift:$region:$account:cluster:$clustername")
         }       
 
      class _ViewQueriesInConsole : IamPolicy.Action("redshift:ViewQueriesInConsole") {

         }       


}        
