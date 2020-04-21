
package com.typedpath.iam2kotlin.resources.codedeploy

import com.typedpath.iam2kotlin.IamPolicy

class CodedeployAction() {

    companion object { 
        val All = IamPolicy.Action("codedeploy:*")    
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_AddTagsToOnPremisesInstances.html 
        //  Adds tags to on-premises instances.    
        val AddTagsToOnPremisesInstances = _AddTagsToOnPremisesInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetApplicationRevisions.html 
        //  Gets information about one or more application revisions.    
        val BatchGetApplicationRevisions = _BatchGetApplicationRevisions() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetApplications.html 
        //  Gets information about one or more applications.    
        val BatchGetApplications = _BatchGetApplications() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetDeploymentGroups.html 
        //  Gets information about one or more deployment groups.    
        val BatchGetDeploymentGroups = _BatchGetDeploymentGroups() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetDeploymentInstances.html 
        //  Gets information about one or more instance that are part of a deployment group.    
        val BatchGetDeploymentInstances = _BatchGetDeploymentInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetDeployments.html 
        //  Gets information about one or more deployments.    
        val BatchGetDeployments = _BatchGetDeployments() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_BatchGetOnPremisesInstances.html 
        //  Gets information about one or more on-premises instances.    
        val BatchGetOnPremisesInstances = _BatchGetOnPremisesInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html 
        //  For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse.    
        val ContinueDeployment = _ContinueDeployment() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateApplication.html 
        //  Creates an application.    
        val CreateApplication = _CreateApplication() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeployment.html 
        //  Deploys an application revision through the specified deployment group.    
        val CreateDeployment = _CreateDeployment() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeploymentConfig.html 
        //  Creates a deployment configuration.    
        val CreateDeploymentConfig = _CreateDeploymentConfig() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeploymentGroup.html 
        //  Creates a deployment group to which application revisions will be deployed.    
        val CreateDeploymentGroup = _CreateDeploymentGroup() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_DeleteApplication.html 
        //  Deletes an application.    
        val DeleteApplication = _DeleteApplication() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_DeleteDeploymentConfig.html 
        //  Deletes a deployment configuration.    
        val DeleteDeploymentConfig = _DeleteDeploymentConfig() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_DeleteDeploymentGroup.html 
        //  Deletes a deployment group.    
        val DeleteDeploymentGroup = _DeleteDeploymentGroup() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_DeregisterOnPremisesInstance.html 
        //  Deregisters an on-premises instance.    
        val DeregisterOnPremisesInstance = _DeregisterOnPremisesInstance() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetApplication.html 
        //  Gets information about an application.    
        val GetApplication = _GetApplication() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetApplicationRevision.html 
        //  Gets information about an application revision.    
        val GetApplicationRevision = _GetApplicationRevision() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetDeployment.html 
        //  Gets information about a deployment.    
        val GetDeployment = _GetDeployment() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetDeploymentConfig.html 
        //  Gets information about a deployment configuration.    
        val GetDeploymentConfig = _GetDeploymentConfig() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetDeploymentGroup.html 
        //  Gets information about a deployment group.    
        val GetDeploymentGroup = _GetDeploymentGroup() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetDeploymentInstance.html 
        //  Gets information about an instance as part of a deployment.    
        val GetDeploymentInstance = _GetDeploymentInstance() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_GetOnPremisesInstance.html 
        //  Gets information about an on-premises instance.    
        val GetOnPremisesInstance = _GetOnPremisesInstance() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListApplicationRevisions.html 
        //  Lists information about revisions for an application.    
        val ListApplicationRevisions = _ListApplicationRevisions() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListApplications.html 
        //  Lists the applications registered with the applicable IAM user or AWS account.    
        val ListApplications = _ListApplications() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListDeploymentConfigs.html 
        //  Lists the deployment configurations with the applicable IAM user or AWS account.    
        val ListDeploymentConfigs = _ListDeploymentConfigs() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListDeploymentGroups.html 
        //  Lists the deployment groups for an application registered with the applicable IAM user or AWS account.    
        val ListDeploymentGroups = _ListDeploymentGroups() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListDeploymentInstances.html 
        //  Lists the instance for a deployment associated with the applicable IAM user or AWS account.    
        val ListDeploymentInstances = _ListDeploymentInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListDeployments.html 
        //  Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS account.    
        val ListDeployments = _ListDeployments() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListGitHubAccountTokenNames.html 
        //  Lists the names of stored connections to GitHub accounts.    
        val ListGitHubAccountTokenNames = _ListGitHubAccountTokenNames() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ListOnPremisesInstances.html 
        //  Gets a list of names for one or more on-premises instances.    
        val ListOnPremisesInstances = _ListOnPremisesInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_RegisterApplicationRevision.html 
        //  Registers with AWS CodeDeploy a revision for the specified application.    
        val RegisterApplicationRevision = _RegisterApplicationRevision() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_RegisterOnPremisesInstance.html 
        //  Registers an on-premises instance.    
        val RegisterOnPremisesInstance = _RegisterOnPremisesInstance() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_RemoveTagsFromOnPremisesInstances.html 
        //  Removes one or more tags from one or more on-premises instances.    
        val RemoveTagsFromOnPremisesInstances = _RemoveTagsFromOnPremisesInstances() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_SkipWaitTimeForInstanceTermination.html 
        //  In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is completed.    
        val SkipWaitTimeForInstanceTermination = _SkipWaitTimeForInstanceTermination() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_StopDeployment.html 
        //  Attempts to stop an ongoing deployment.    
        val StopDeployment = _StopDeployment() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_UpdateApplication.html 
        //  Changes the name of an application.    
        val UpdateApplication = _UpdateApplication() 
        // see http://docs.aws.amazon.com/codedeploy/latest/APIReference/API_UpdateDeploymentGroup.html 
        //  Changes information about a deployment group.    
        val UpdateDeploymentGroup = _UpdateDeploymentGroup()
    }
      class _AddTagsToOnPremisesInstances : IamPolicy.Action("codedeploy:AddTagsToOnPremisesInstances") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _BatchGetApplicationRevisions : IamPolicy.Action("codedeploy:BatchGetApplicationRevisions") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _BatchGetApplications : IamPolicy.Action("codedeploy:BatchGetApplications") {
             //arn:aws:codedeploy:$region:$account:application:*"
            fun application_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:*")
         }       
 
      class _BatchGetDeploymentGroups : IamPolicy.Action("codedeploy:BatchGetDeploymentGroups") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _BatchGetDeploymentInstances : IamPolicy.Action("codedeploy:BatchGetDeploymentInstances") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _BatchGetDeployments : IamPolicy.Action("codedeploy:BatchGetDeployments") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _BatchGetOnPremisesInstances : IamPolicy.Action("codedeploy:BatchGetOnPremisesInstances") {
             //arn:aws:codedeploy:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:*")
         }       
 
      class _ContinueDeployment : IamPolicy.Action("codedeploy:ContinueDeployment") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _CreateApplication : IamPolicy.Action("codedeploy:CreateApplication") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _CreateDeployment : IamPolicy.Action("codedeploy:CreateDeployment") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _CreateDeploymentConfig : IamPolicy.Action("codedeploy:CreateDeploymentConfig") {
             //arn:aws:codedeploy:$region:$account:deploymentconfig:$deployment-configuration-name"
            fun deploymentconfig_byRegionAccountDeploymentconfigurationname(region: String, account: String, deploymentconfigurationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentconfig:$deploymentconfigurationname")
         }       
 
      class _CreateDeploymentGroup : IamPolicy.Action("codedeploy:CreateDeploymentGroup") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _DeleteApplication : IamPolicy.Action("codedeploy:DeleteApplication") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _DeleteDeploymentConfig : IamPolicy.Action("codedeploy:DeleteDeploymentConfig") {
             //arn:aws:codedeploy:$region:$account:deploymentconfig:$deployment-configuration-name"
            fun deploymentconfig_byRegionAccountDeploymentconfigurationname(region: String, account: String, deploymentconfigurationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentconfig:$deploymentconfigurationname")
         }       
 
      class _DeleteDeploymentGroup : IamPolicy.Action("codedeploy:DeleteDeploymentGroup") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _DeregisterOnPremisesInstance : IamPolicy.Action("codedeploy:DeregisterOnPremisesInstance") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _GetApplication : IamPolicy.Action("codedeploy:GetApplication") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _GetApplicationRevision : IamPolicy.Action("codedeploy:GetApplicationRevision") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _GetDeployment : IamPolicy.Action("codedeploy:GetDeployment") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _GetDeploymentConfig : IamPolicy.Action("codedeploy:GetDeploymentConfig") {
             //arn:aws:codedeploy:$region:$account:deploymentconfig:$deployment-configuration-name"
            fun deploymentconfig_byRegionAccountDeploymentconfigurationname(region: String, account: String, deploymentconfigurationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentconfig:$deploymentconfigurationname")
         }       
 
      class _GetDeploymentGroup : IamPolicy.Action("codedeploy:GetDeploymentGroup") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _GetDeploymentInstance : IamPolicy.Action("codedeploy:GetDeploymentInstance") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _GetOnPremisesInstance : IamPolicy.Action("codedeploy:GetOnPremisesInstance") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _ListApplicationRevisions : IamPolicy.Action("codedeploy:ListApplicationRevisions") {
             //arn:aws:codedeploy:$region:$account:application:*"
            fun application_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:*")
         }       
 
      class _ListApplications : IamPolicy.Action("codedeploy:ListApplications") {
             //arn:aws:codedeploy:$region:$account:application:*"
            fun application_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:*")
         }       
 
      class _ListDeploymentConfigs : IamPolicy.Action("codedeploy:ListDeploymentConfigs") {
             //arn:aws:codedeploy:$region:$account:deploymentconfig/*"
            fun deploymentconfig_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentconfig/*")
         }       
 
      class _ListDeploymentGroups : IamPolicy.Action("codedeploy:ListDeploymentGroups") {
             //arn:aws:codedeploy:$region:$account:application:$application-name/*"
            fun application_all_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname/*")
         }       
 
      class _ListDeploymentInstances : IamPolicy.Action("codedeploy:ListDeploymentInstances") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _ListDeployments : IamPolicy.Action("codedeploy:ListDeployments") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _ListGitHubAccountTokenNames : IamPolicy.Action("codedeploy:ListGitHubAccountTokenNames") {
             //arn:aws:codedeploy:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:*")
         }       
 
      class _ListOnPremisesInstances : IamPolicy.Action("codedeploy:ListOnPremisesInstances") {
             //arn:aws:codedeploy:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:*")
         }       
 
      class _RegisterApplicationRevision : IamPolicy.Action("codedeploy:RegisterApplicationRevision") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _RegisterOnPremisesInstance : IamPolicy.Action("codedeploy:RegisterOnPremisesInstance") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _RemoveTagsFromOnPremisesInstances : IamPolicy.Action("codedeploy:RemoveTagsFromOnPremisesInstances") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _SkipWaitTimeForInstanceTermination : IamPolicy.Action("codedeploy:SkipWaitTimeForInstanceTermination") {
             //arn:aws:codedeploy:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:instance/$instanceid")
         }       
 
      class _StopDeployment : IamPolicy.Action("codedeploy:StopDeployment") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       
 
      class _UpdateApplication : IamPolicy.Action("codedeploy:UpdateApplication") {
             //arn:aws:codedeploy:$region:$account:application:$application-name"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:application:$applicationname")
         }       
 
      class _UpdateDeploymentGroup : IamPolicy.Action("codedeploy:UpdateDeploymentGroup") {
             //arn:aws:codedeploy:$region:$account:deploymentgroup:$application-name/$deployment-group-name"
            fun deploymentgroup_byRegionAccountApplicationnameDeploymentgroupname(region: String, account: String, applicationname: String, deploymentgroupname: String) = IamPolicy.Resource("arn:aws:codedeploy:$region:$account:deploymentgroup:$applicationname/$deploymentgroupname")
         }       


}        
