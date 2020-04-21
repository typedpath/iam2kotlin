
package com.typedpath.iam2kotlin.resources.autoscaling

import com.typedpath.iam2kotlin.IamPolicy

class AutoscalingAction() {

    companion object { 
        val All = IamPolicy.Action("autoscaling:*")    
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeAccountLimits.html 
        //  Describes the current Auto Scaling resource limits for your AWS account.    
        val DescribeAccountLimits = _DescribeAccountLimits() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeAdjustmentTypes.html 
        //  Describes the policy adjustment types for use with API_PutScalingPolicy.    
        val DescribeAdjustmentTypes = _DescribeAdjustmentTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeAutoScalingGroups.html 
        //  Describes one or more Auto Scaling groups.    
        val DescribeAutoScalingGroups = _DescribeAutoScalingGroups() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeAutoScalingInstances.html 
        //  Describes one or more Auto Scaling instances.    
        val DescribeAutoScalingInstances = _DescribeAutoScalingInstances() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeAutoScalingNotificationTypes.html 
        //  Describes the notification types that are supported by Auto Scaling.    
        val DescribeAutoScalingNotificationTypes = _DescribeAutoScalingNotificationTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeLaunchConfigurations.html 
        //  Describes one or more launch configurations.    
        val DescribeLaunchConfigurations = _DescribeLaunchConfigurations() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeLifecycleHooks.html 
        //  Describes the lifecycle hooks for the specified Auto Scaling group.    
        val DescribeLifecycleHooks = _DescribeLifecycleHooks() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeLifecycleHookTypes.html 
        //  Describes the available types of lifecycle hooks.    
        val DescribeLifecycleHookTypes = _DescribeLifecycleHookTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeLoadBalancers.html 
        //  Describes the load balancers for the specified Auto Scaling group.    
        val DescribeLoadBalancers = _DescribeLoadBalancers() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeLoadBalancerTargetGroups.html 
        //  Describes the target groups for the specified Auto Scaling group.    
        val DescribeLoadBalancerTargetGroups = _DescribeLoadBalancerTargetGroups() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeMetricCollectionTypes.html 
        //  Describes the available CloudWatch metrics for Auto Scaling.    
        val DescribeMetricCollectionTypes = _DescribeMetricCollectionTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeNotificationConfigurations.html 
        //  Describes the notification actions associated with the specified Auto Scaling group.    
        val DescribeNotificationConfigurations = _DescribeNotificationConfigurations() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribePolicies.html 
        //  Describes the policies for the specified Auto Scaling group.    
        val DescribePolicies = _DescribePolicies() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeScalingActivities.html 
        //  Describes one or more scaling activities for the specified Auto Scaling group.    
        val DescribeScalingActivities = _DescribeScalingActivities() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeScalingProcessTypes.html 
        //  Describes the scaling process types for use with API_ResumeProcesses.    
        val DescribeScalingProcessTypes = _DescribeScalingProcessTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeScheduledActions.html 
        //  Describes the actions scheduled for your Auto Scaling group that haven't run.    
        val DescribeScheduledActions = _DescribeScheduledActions() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeTags.html 
        //  Describes the specified tags.    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeTerminationPolicyTypes.html 
        //  Describes the termination policies supported by Auto Scaling.    
        val DescribeTerminationPolicyTypes = _DescribeTerminationPolicyTypes() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_AttachInstances.html 
        //  Attaches one or more EC2 instances to the specified Auto Scaling group.    
        val AttachInstances = _AttachInstances() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_AttachLoadBalancers.html 
        //  Attaches one or more load balancers to the specified Auto Scaling group.    
        val AttachLoadBalancers = _AttachLoadBalancers() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_AttachLoadBalancerTargetGroups.html 
        //  Attaches one or more target groups to the specified Auto Scaling group.    
        val AttachLoadBalancerTargetGroups = _AttachLoadBalancerTargetGroups() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CompleteLifecycleAction.html 
        //  Completes the lifecycle action for the specified token or instance with the specified result.    
        val CompleteLifecycleAction = _CompleteLifecycleAction() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateAutoScalingGroup.html 
        //  Creates an Auto Scaling group with the specified name and attributes.    
        val CreateAutoScalingGroup = _CreateAutoScalingGroup() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html 
        //  Creates a launch configuration.    
        val CreateLaunchConfiguration = _CreateLaunchConfiguration() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateOrUpdateTags.html 
        //  Creates or updates tags for the specified Auto Scaling group.    
        val CreateOrUpdateTags = _CreateOrUpdateTags() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteAutoScalingGroup.html 
        //  Deletes the specified Auto Scaling group.    
        val DeleteAutoScalingGroup = _DeleteAutoScalingGroup() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteLaunchConfiguration.html 
        //  Deletes the specified launch configuration.    
        val DeleteLaunchConfiguration = _DeleteLaunchConfiguration() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteLifecycleHook.html 
        //  Deletes the specified lifecycle hook.    
        val DeleteLifecycleHook = _DeleteLifecycleHook() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteNotificationConfiguration.html 
        //  Deletes the specified notification.    
        val DeleteNotificationConfiguration = _DeleteNotificationConfiguration() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeletePolicy.html 
        //  Deletes the specified Auto Scaling policy.    
        val DeletePolicy = _DeletePolicy() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteScheduledAction.html 
        //  Deletes the specified scheduled action.    
        val DeleteScheduledAction = _DeleteScheduledAction() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DeleteTags.html 
        //  Deletes the specified tags.    
        val DeleteTags = _DeleteTags() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DetachInstances.html 
        //  Removes one or more instances from the specified Auto Scaling group.    
        val DetachInstances = _DetachInstances() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DetachLoadBalancers.html 
        //  Removes one or more load balancers from the specified Auto Scaling group.    
        val DetachLoadBalancers = _DetachLoadBalancers() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DetachLoadBalancerTargetGroups.html 
        //  Detaches one or more target groups from the specified Auto Scaling group.    
        val DetachLoadBalancerTargetGroups = _DetachLoadBalancerTargetGroups() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DisableMetricsCollection.html 
        //  Disables monitoring of the specified metrics for the specified Auto Scaling group.    
        val DisableMetricsCollection = _DisableMetricsCollection() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_EnableMetricsCollection.html 
        //  Enables monitoring of the specified metrics for the specified Auto Scaling group.    
        val EnableMetricsCollection = _EnableMetricsCollection() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_EnterStandby.html 
        //  Moves the specified instances into Standby mode.    
        val EnterStandby = _EnterStandby() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_ExecutePolicy.html 
        //  Executes the specified policy.    
        val ExecutePolicy = _ExecutePolicy() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_ExitStandby.html 
        //  Moves the specified instances out of Standby mode.    
        val ExitStandby = _ExitStandby() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_PutLifecycleHook.html 
        //  Creates or updates a lifecycle hook for the specified Auto Scaling Group.    
        val PutLifecycleHook = _PutLifecycleHook() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_PutNotificationConfiguration.html 
        //  Configures an Auto Scaling group to send notifications when specified events take place.    
        val PutNotificationConfiguration = _PutNotificationConfiguration() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_PutScalingPolicy.html 
        //  Creates or updates a policy for an Auto Scaling group.    
        val PutScalingPolicy = _PutScalingPolicy() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_PutScheduledUpdateGroupAction.html 
        //  Creates or updates a scheduled scaling action for an Auto Scaling group.    
        val PutScheduledUpdateGroupAction = _PutScheduledUpdateGroupAction() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_RecordLifecycleActionHeartbeat.html 
        //  Records a heartbeat for the lifecycle action associated with the specified token or instance.    
        val RecordLifecycleActionHeartbeat = _RecordLifecycleActionHeartbeat() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_ResumeProcesses.html 
        //  Resumes the specified suspended Auto Scaling processes, or all suspended process, for the specified Auto Scaling group.    
        val ResumeProcesses = _ResumeProcesses() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_SetDesiredCapacity.html 
        //  Sets the size of the specified Auto Scaling group.    
        val SetDesiredCapacity = _SetDesiredCapacity() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_SetInstanceHealth.html 
        //  Sets the health status of the specified instance.    
        val SetInstanceHealth = _SetInstanceHealth() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_SetInstanceProtection.html 
        //  Updates the instance protection settings of the specified instances.    
        val SetInstanceProtection = _SetInstanceProtection() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_SuspendProcesses.html 
        //  Suspends the specified Auto Scaling processes, or all processes, for the specified Auto Scaling group.    
        val SuspendProcesses = _SuspendProcesses() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_TerminateInstanceInAutoScalingGroup.html 
        //  Terminates the specified instance and optionally adjusts the desired group size.    
        val TerminateInstanceInAutoScalingGroup = _TerminateInstanceInAutoScalingGroup() 
        // see http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_UpdateAutoScalingGroup.html 
        //  Updates the configuration for the specified Auto Scaling group.    
        val UpdateAutoScalingGroup = _UpdateAutoScalingGroup()
    }
      class _DescribeAccountLimits : IamPolicy.Action("autoscaling:DescribeAccountLimits") {

         }       
 
      class _DescribeAdjustmentTypes : IamPolicy.Action("autoscaling:DescribeAdjustmentTypes") {

         }       
 
      class _DescribeAutoScalingGroups : IamPolicy.Action("autoscaling:DescribeAutoScalingGroups") {

         }       
 
      class _DescribeAutoScalingInstances : IamPolicy.Action("autoscaling:DescribeAutoScalingInstances") {

         }       
 
      class _DescribeAutoScalingNotificationTypes : IamPolicy.Action("autoscaling:DescribeAutoScalingNotificationTypes") {

         }       
 
      class _DescribeLaunchConfigurations : IamPolicy.Action("autoscaling:DescribeLaunchConfigurations") {

         }       
 
      class _DescribeLifecycleHooks : IamPolicy.Action("autoscaling:DescribeLifecycleHooks") {

         }       
 
      class _DescribeLifecycleHookTypes : IamPolicy.Action("autoscaling:DescribeLifecycleHookTypes") {

         }       
 
      class _DescribeLoadBalancers : IamPolicy.Action("autoscaling:DescribeLoadBalancers") {

         }       
 
      class _DescribeLoadBalancerTargetGroups : IamPolicy.Action("autoscaling:DescribeLoadBalancerTargetGroups") {

         }       
 
      class _DescribeMetricCollectionTypes : IamPolicy.Action("autoscaling:DescribeMetricCollectionTypes") {

         }       
 
      class _DescribeNotificationConfigurations : IamPolicy.Action("autoscaling:DescribeNotificationConfigurations") {

         }       
 
      class _DescribePolicies : IamPolicy.Action("autoscaling:DescribePolicies") {

         }       
 
      class _DescribeScalingActivities : IamPolicy.Action("autoscaling:DescribeScalingActivities") {

         }       
 
      class _DescribeScalingProcessTypes : IamPolicy.Action("autoscaling:DescribeScalingProcessTypes") {

         }       
 
      class _DescribeScheduledActions : IamPolicy.Action("autoscaling:DescribeScheduledActions") {

         }       
 
      class _DescribeTags : IamPolicy.Action("autoscaling:DescribeTags") {

         }       
 
      class _DescribeTerminationPolicyTypes : IamPolicy.Action("autoscaling:DescribeTerminationPolicyTypes") {

         }       
 
      class _AttachInstances : IamPolicy.Action("autoscaling:AttachInstances") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _AttachLoadBalancers : IamPolicy.Action("autoscaling:AttachLoadBalancers") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _AttachLoadBalancerTargetGroups : IamPolicy.Action("autoscaling:AttachLoadBalancerTargetGroups") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _CompleteLifecycleAction : IamPolicy.Action("autoscaling:CompleteLifecycleAction") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _CreateAutoScalingGroup : IamPolicy.Action("autoscaling:CreateAutoScalingGroup") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:*:autoScalingGroupName/$name"
            fun autoScalingGroup_all_autoScalingGroupName_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:*:autoScalingGroupName/$name")
         }       
 
      class _CreateLaunchConfiguration : IamPolicy.Action("autoscaling:CreateLaunchConfiguration") {
             //arn:aws:autoscaling:$region:$account:launchConfiguration:*:launchConfigurationName/$name"
            fun launchConfiguration_all_launchConfigurationName_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:launchConfiguration:*:launchConfigurationName/$name")
         }       
 
      class _CreateOrUpdateTags : IamPolicy.Action("autoscaling:CreateOrUpdateTags") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeleteAutoScalingGroup : IamPolicy.Action("autoscaling:DeleteAutoScalingGroup") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeleteLaunchConfiguration : IamPolicy.Action("autoscaling:DeleteLaunchConfiguration") {
             //arn:aws:autoscaling:$region:$account:launchConfiguration:$uuid:launchConfigurationName/$name"
            fun launchConfiguration_launchConfigurationName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:launchConfiguration:$uuid:launchConfigurationName/$name")
         }       
 
      class _DeleteLifecycleHook : IamPolicy.Action("autoscaling:DeleteLifecycleHook") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeleteNotificationConfiguration : IamPolicy.Action("autoscaling:DeleteNotificationConfiguration") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeletePolicy : IamPolicy.Action("autoscaling:DeletePolicy") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeleteScheduledAction : IamPolicy.Action("autoscaling:DeleteScheduledAction") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DeleteTags : IamPolicy.Action("autoscaling:DeleteTags") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DetachInstances : IamPolicy.Action("autoscaling:DetachInstances") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DetachLoadBalancers : IamPolicy.Action("autoscaling:DetachLoadBalancers") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DetachLoadBalancerTargetGroups : IamPolicy.Action("autoscaling:DetachLoadBalancerTargetGroups") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _DisableMetricsCollection : IamPolicy.Action("autoscaling:DisableMetricsCollection") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _EnableMetricsCollection : IamPolicy.Action("autoscaling:EnableMetricsCollection") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _EnterStandby : IamPolicy.Action("autoscaling:EnterStandby") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _ExecutePolicy : IamPolicy.Action("autoscaling:ExecutePolicy") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _ExitStandby : IamPolicy.Action("autoscaling:ExitStandby") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _PutLifecycleHook : IamPolicy.Action("autoscaling:PutLifecycleHook") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _PutNotificationConfiguration : IamPolicy.Action("autoscaling:PutNotificationConfiguration") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _PutScalingPolicy : IamPolicy.Action("autoscaling:PutScalingPolicy") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _PutScheduledUpdateGroupAction : IamPolicy.Action("autoscaling:PutScheduledUpdateGroupAction") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _RecordLifecycleActionHeartbeat : IamPolicy.Action("autoscaling:RecordLifecycleActionHeartbeat") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _ResumeProcesses : IamPolicy.Action("autoscaling:ResumeProcesses") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _SetDesiredCapacity : IamPolicy.Action("autoscaling:SetDesiredCapacity") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _SetInstanceHealth : IamPolicy.Action("autoscaling:SetInstanceHealth") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _SetInstanceProtection : IamPolicy.Action("autoscaling:SetInstanceProtection") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _SuspendProcesses : IamPolicy.Action("autoscaling:SuspendProcesses") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _TerminateInstanceInAutoScalingGroup : IamPolicy.Action("autoscaling:TerminateInstanceInAutoScalingGroup") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       
 
      class _UpdateAutoScalingGroup : IamPolicy.Action("autoscaling:UpdateAutoScalingGroup") {
             //arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name"
            fun autoScalingGroup_autoScalingGroupName_byRegionAccountUuidName(region: String, account: String, uuid: String, name: String) = IamPolicy.Resource("arn:aws:autoscaling:$region:$account:autoScalingGroup:$uuid:autoScalingGroupName/$name")
         }       


}        
