
package com.typedpath.iam2kotlin.resources.ecs

import com.typedpath.iam2kotlin.IamPolicy

class EcsAction() {

    companion object { 
        val All = IamPolicy.Action("ecs:*")    
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCluster.html 
        //  Creates a new Amazon ECS cluster.    
        val CreateCluster = _CreateCluster() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html 
        //  Runs and maintains a desired number of tasks from a specified task definition.    
        val CreateService = _CreateService() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteCluster.html 
        //  Deletes the specified cluster.    
        val DeleteCluster = _DeleteCluster() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeleteService.html 
        //  Deletes a specified service within a cluster.    
        val DeleteService = _DeleteService() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeregisterContainerInstance.html 
        //  Deregisters an Amazon ECS container instance from the specified cluster.    
        val DeregisterContainerInstance = _DeregisterContainerInstance() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DeregisterTaskDefinition.html 
        //  Deregisters the specified task definition by family and revision.    
        val DeregisterTaskDefinition = _DeregisterTaskDefinition() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeClusters.html 
        //  Describes one or more of your clusters.    
        val DescribeClusters = _DescribeClusters() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeContainerInstances.html 
        //  Describes Amazon EC2 Container Service container instances.    
        val DescribeContainerInstances = _DescribeContainerInstances() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeServices.html 
        //  Describes the specified services running in your cluster.    
        val DescribeServices = _DescribeServices() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTaskDefinition.html 
        //  Describes a task definition.    
        val DescribeTaskDefinition = _DescribeTaskDefinition() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html 
        //  Describes a specified task or tasks.    
        val DescribeTasks = _DescribeTasks() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DiscoverPollEndpoint.html 
        //  Returns an endpoint for the Amazon EC2 Container Service agent to poll for updates.    
        val DiscoverPollEndpoint = _DiscoverPollEndpoint() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListClusters.html 
        //  Returns a list of existing clusters.    
        val ListClusters = _ListClusters() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListContainerInstances.html 
        //  Returns a list of container instances in a specified cluster.    
        val ListContainerInstances = _ListContainerInstances() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListServices.html 
        //  Lists the services that are running in a specified cluster.    
        val ListServices = _ListServices() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListTaskDefinitionFamilies.html 
        //  Returns a list of task definition families that are registered to your account (which may include task definition families that no longer have any ACTIVE task definition revisions).    
        val ListTaskDefinitionFamilies = _ListTaskDefinitionFamilies() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListTaskDefinitions.html 
        //  Returns a list of task definitions that are registered to your account.    
        val ListTaskDefinitions = _ListTaskDefinitions() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ListTasks.html 
        //  Returns a list of tasks for a specified cluster.    
        val ListTasks = _ListTasks() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Poll.html 
        //  ???    
        val Poll = _Poll() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RegisterContainerInstance.html 
        //  Registers an EC2 instance into the specified cluster.    
        val RegisterContainerInstance = _RegisterContainerInstance() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RegisterTaskDefinition.html 
        //  Registers a new task definition from the supplied family and containerDefinitions.    
        val RegisterTaskDefinition = _RegisterTaskDefinition() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html 
        //  Start a task using random placement and the default Amazon ECS scheduler.    
        val RunTask = _RunTask() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html 
        //  Starts a new task from the specified task definition on the specified container instance or instances.    
        val StartTask = _StartTask() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StopTask.html 
        //  Stops a running task.    
        val StopTask = _StopTask() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTelemetrySession.html 
        //  ???    
        val StartTelemetrySession = _StartTelemetrySession() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_SubmitContainerStateChange.html 
        //  Sent to acknowledge that a container changed states.    
        val SubmitContainerStateChange = _SubmitContainerStateChange() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_SubmitTaskStateChange.html 
        //  Sent to acknowledge that a task changed states.    
        val SubmitTaskStateChange = _SubmitTaskStateChange() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_UpdateContainerAgent.html 
        //  Updates the Amazon ECS container agent on a specified container instance.    
        val UpdateContainerAgent = _UpdateContainerAgent() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_UpdateService.html 
        //  Modifies the desired count, deployment configuration, or task definition used in a service.    
        val UpdateService = _UpdateService() 
        // see http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_UpdateContainerInstancesState.html 
        //  Modifies the status of an Amazon ECS container instance.    
        val UpdateContainerInstancesState = _UpdateContainerInstancesState()
    }
      class _CreateCluster : IamPolicy.Action("ecs:CreateCluster") {

         }       
 
      class _CreateService : IamPolicy.Action("ecs:CreateService") {

         }       
 
      class _DeleteCluster : IamPolicy.Action("ecs:DeleteCluster") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _DeleteService : IamPolicy.Action("ecs:DeleteService") {

         }       
 
      class _DeregisterContainerInstance : IamPolicy.Action("ecs:DeregisterContainerInstance") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _DeregisterTaskDefinition : IamPolicy.Action("ecs:DeregisterTaskDefinition") {

         }       
 
      class _DescribeClusters : IamPolicy.Action("ecs:DescribeClusters") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _DescribeContainerInstances : IamPolicy.Action("ecs:DescribeContainerInstances") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       
 
      class _DescribeServices : IamPolicy.Action("ecs:DescribeServices") {

         }       
 
      class _DescribeTaskDefinition : IamPolicy.Action("ecs:DescribeTaskDefinition") {

         }       
 
      class _DescribeTasks : IamPolicy.Action("ecs:DescribeTasks") {
             //arn:aws:ecs:$region:$account:task/$task-id"
            fun task_byRegionAccountTaskid(region: String, account: String, taskid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:task/$taskid")
         }       
 
      class _DiscoverPollEndpoint : IamPolicy.Action("ecs:DiscoverPollEndpoint") {

         }       
 
      class _ListClusters : IamPolicy.Action("ecs:ListClusters") {

         }       
 
      class _ListContainerInstances : IamPolicy.Action("ecs:ListContainerInstances") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _ListServices : IamPolicy.Action("ecs:ListServices") {

         }       
 
      class _ListTaskDefinitionFamilies : IamPolicy.Action("ecs:ListTaskDefinitionFamilies") {

         }       
 
      class _ListTaskDefinitions : IamPolicy.Action("ecs:ListTaskDefinitions") {

         }       
 
      class _ListTasks : IamPolicy.Action("ecs:ListTasks") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       
 
      class _Poll : IamPolicy.Action("ecs:Poll") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       
 
      class _RegisterContainerInstance : IamPolicy.Action("ecs:RegisterContainerInstance") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _RegisterTaskDefinition : IamPolicy.Action("ecs:RegisterTaskDefinition") {

         }       
 
      class _RunTask : IamPolicy.Action("ecs:RunTask") {
             //arn:aws:ecs:$region:$account:task-definition/$task-definition-family-name:$task-definition-revision-number"
            fun taskdefinition_byRegionAccountTaskdefinitionfamilynameTaskdefinitionrevisionnumber(region: String, account: String, taskdefinitionfamilyname: String, taskdefinitionrevisionnumber: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:task-definition/$taskdefinitionfamilyname:$taskdefinitionrevisionnumber")
         }       
 
      class _StartTask : IamPolicy.Action("ecs:StartTask") {
             //arn:aws:ecs:$region:$account:task-definition/$task-definition-family-name:$task-definition-revision-number"
            fun taskdefinition_byRegionAccountTaskdefinitionfamilynameTaskdefinitionrevisionnumber(region: String, account: String, taskdefinitionfamilyname: String, taskdefinitionrevisionnumber: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:task-definition/$taskdefinitionfamilyname:$taskdefinitionrevisionnumber")
         }       
 
      class _StopTask : IamPolicy.Action("ecs:StopTask") {
             //arn:aws:ecs:$region:$account:task/$task-id"
            fun task_byRegionAccountTaskid(region: String, account: String, taskid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:task/$taskid")
         }       
 
      class _StartTelemetrySession : IamPolicy.Action("ecs:StartTelemetrySession") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       
 
      class _SubmitContainerStateChange : IamPolicy.Action("ecs:SubmitContainerStateChange") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _SubmitTaskStateChange : IamPolicy.Action("ecs:SubmitTaskStateChange") {
             //arn:aws:ecs:$region:$account:cluster/$cluster-name"
            fun cluster_byRegionAccountClustername(region: String, account: String, clustername: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:cluster/$clustername")
         }       
 
      class _UpdateContainerAgent : IamPolicy.Action("ecs:UpdateContainerAgent") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       
 
      class _UpdateService : IamPolicy.Action("ecs:UpdateService") {

         }       
 
      class _UpdateContainerInstancesState : IamPolicy.Action("ecs:UpdateContainerInstancesState") {
             //arn:aws:ecs:$region:$account:container-instance/$container-instance-id"
            fun containerinstance_byRegionAccountContainerinstanceid(region: String, account: String, containerinstanceid: String) = IamPolicy.Resource("arn:aws:ecs:$region:$account:container-instance/$containerinstanceid")
         }       


}        
