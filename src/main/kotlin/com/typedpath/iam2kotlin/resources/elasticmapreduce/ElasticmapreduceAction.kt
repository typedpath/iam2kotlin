
package com.typedpath.iam2kotlin.resources.elasticmapreduce

import com.typedpath.iam2kotlin.IamPolicy

class ElasticmapreduceAction() {

    companion object { 
        val All = IamPolicy.Action("elasticmapreduce:*")    
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_AddInstanceFleet.html 
        //  Adds an instance fleet to a running cluster.    
        val AddInstanceFleet = _AddInstanceFleet() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_AddInstanceGroups.html 
        //  AddInstanceGroups adds an instance group to a running cluster.    
        val AddInstanceGroups = _AddInstanceGroups() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_AddJobFlowSteps.html 
        //  AddJobFlowSteps adds new steps to a running job flow.    
        val AddJobFlowSteps = _AddJobFlowSteps() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_AddTags.html 
        //  Adds tags to an Amazon EMR resource.    
        val AddTags = _AddTags() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_CancelSteps.html 
        //  Cancels a pending step or steps in a running cluster.    
        val CancelSteps = _CancelSteps() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_CreateSecurityConfiguration.html 
        //  Creates a security configuration, which is stored in the service and can be specified when a cluster is created.    
        val CreateSecurityConfiguration = _CreateSecurityConfiguration() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_DeleteSecurityConfiguration.html 
        //  Deletes a security configuration.    
        val DeleteSecurityConfiguration = _DeleteSecurityConfiguration() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_DescribeCluster.html 
        //  Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.    
        val DescribeCluster = _DescribeCluster() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_DescribeJobFlows.html 
        //  This API is deprecated and will eventually be removed.    
        val DescribeJobFlows = _DescribeJobFlows() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_DescribeSecurityConfiguration.html 
        //  Provides the details of a security configuration by returning the configuration JSON.    
        val DescribeSecurityConfiguration = _DescribeSecurityConfiguration() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_DescribeStep.html 
        //  Provides more detail about the cluster step.    
        val DescribeStep = _DescribeStep() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListBootstrapActions.html 
        //  Provides information about the bootstrap actions associated with a cluster.    
        val ListBootstrapActions = _ListBootstrapActions() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListClusters.html 
        //  Provides the status of all clusters visible to this AWS account.    
        val ListClusters = _ListClusters() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListInstanceFleets.html 
        //  Lists all available details about the instance fleets in a cluster.    
        val ListInstanceFleets = _ListInstanceFleets() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListInstanceGroups.html 
        //  Provides all available details about the instance groups in a cluster.    
        val ListInstanceGroups = _ListInstanceGroups() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListInstances.html 
        //  Provides information about the cluster instances that Amazon EMR provisions on behalf of a user when it creates the cluster.    
        val ListInstances = _ListInstances() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListSecurityConfigurations.html 
        //  Lists all the security configurations visible to this account, providing their creation dates and times, and their names.    
        val ListSecurityConfigurations = _ListSecurityConfigurations() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ListSteps.html 
        //  Provides a list of steps for the cluster.    
        val ListSteps = _ListSteps() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ModifyInstanceFleet.html 
        //  Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID.    
        val ModifyInstanceFleet = _ModifyInstanceFleet() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_ModifyInstanceGroups.html 
        //  ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group.    
        val ModifyInstanceGroups = _ModifyInstanceGroups() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_PutAutoScalingPolicy.html 
        //  Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster.    
        val PutAutoScalingPolicy = _PutAutoScalingPolicy() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_RemoveAutoScalingPolicy.html 
        //  Removes an automatic scaling policy from a specified instance group within an EMR cluster.    
        val RemoveAutoScalingPolicy = _RemoveAutoScalingPolicy() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_RemoveTags.html 
        //  Removes tags from an Amazon EMR resource.    
        val RemoveTags = _RemoveTags() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_RunJobFlow.html 
        //  RunJobFlow creates and starts running a new job flow.    
        val RunJobFlow = _RunJobFlow() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_SetTerminationProtection.html 
        //  SetTerminationProtection locks a job flow so the Amazon EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error.    
        val SetTerminationProtection = _SetTerminationProtection() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_SetVisibleToAllUsers.html 
        //  Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified job flows.    
        val SetVisibleToAllUsers = _SetVisibleToAllUsers() 
        // see http://docs.aws.amazon.com/ElasticMapReduce/latest/API/API_TerminateJobFlows.html 
        //  TerminateJobFlows shuts a list of job flows down.    
        val TerminateJobFlows = _TerminateJobFlows()
    }
      class _AddInstanceFleet : IamPolicy.Action("elasticmapreduce:AddInstanceFleet") {

         }       
 
      class _AddInstanceGroups : IamPolicy.Action("elasticmapreduce:AddInstanceGroups") {

         }       
 
      class _AddJobFlowSteps : IamPolicy.Action("elasticmapreduce:AddJobFlowSteps") {

         }       
 
      class _AddTags : IamPolicy.Action("elasticmapreduce:AddTags") {

         }       
 
      class _CancelSteps : IamPolicy.Action("elasticmapreduce:CancelSteps") {

         }       
 
      class _CreateSecurityConfiguration : IamPolicy.Action("elasticmapreduce:CreateSecurityConfiguration") {

         }       
 
      class _DeleteSecurityConfiguration : IamPolicy.Action("elasticmapreduce:DeleteSecurityConfiguration") {

         }       
 
      class _DescribeCluster : IamPolicy.Action("elasticmapreduce:DescribeCluster") {

         }       
 
      class _DescribeJobFlows : IamPolicy.Action("elasticmapreduce:DescribeJobFlows") {

         }       
 
      class _DescribeSecurityConfiguration : IamPolicy.Action("elasticmapreduce:DescribeSecurityConfiguration") {

         }       
 
      class _DescribeStep : IamPolicy.Action("elasticmapreduce:DescribeStep") {

         }       
 
      class _ListBootstrapActions : IamPolicy.Action("elasticmapreduce:ListBootstrapActions") {

         }       
 
      class _ListClusters : IamPolicy.Action("elasticmapreduce:ListClusters") {

         }       
 
      class _ListInstanceFleets : IamPolicy.Action("elasticmapreduce:ListInstanceFleets") {

         }       
 
      class _ListInstanceGroups : IamPolicy.Action("elasticmapreduce:ListInstanceGroups") {

         }       
 
      class _ListInstances : IamPolicy.Action("elasticmapreduce:ListInstances") {

         }       
 
      class _ListSecurityConfigurations : IamPolicy.Action("elasticmapreduce:ListSecurityConfigurations") {

         }       
 
      class _ListSteps : IamPolicy.Action("elasticmapreduce:ListSteps") {

         }       
 
      class _ModifyInstanceFleet : IamPolicy.Action("elasticmapreduce:ModifyInstanceFleet") {

         }       
 
      class _ModifyInstanceGroups : IamPolicy.Action("elasticmapreduce:ModifyInstanceGroups") {

         }       
 
      class _PutAutoScalingPolicy : IamPolicy.Action("elasticmapreduce:PutAutoScalingPolicy") {

         }       
 
      class _RemoveAutoScalingPolicy : IamPolicy.Action("elasticmapreduce:RemoveAutoScalingPolicy") {

         }       
 
      class _RemoveTags : IamPolicy.Action("elasticmapreduce:RemoveTags") {

         }       
 
      class _RunJobFlow : IamPolicy.Action("elasticmapreduce:RunJobFlow") {

         }       
 
      class _SetTerminationProtection : IamPolicy.Action("elasticmapreduce:SetTerminationProtection") {

         }       
 
      class _SetVisibleToAllUsers : IamPolicy.Action("elasticmapreduce:SetVisibleToAllUsers") {

         }       
 
      class _TerminateJobFlows : IamPolicy.Action("elasticmapreduce:TerminateJobFlows") {

         }       


}        
