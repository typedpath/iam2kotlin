
package com.typedpath.iam2kotlin.resources.opsworks

import com.typedpath.iam2kotlin.IamPolicy

class OpsworksAction() {

    companion object { 
        val All = IamPolicy.Action("opsworks:*")    
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_AssignVolume.html 
        //  Assigns one of the stack's registered Amazon EBS volumes to a specified instance.    
        val AssignVolume = _AssignVolume() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_AssociateElasticIp.html 
        //  Associates one of the stack's registered Elastic IP addresses with a specified instance.    
        val AssociateElasticIp = _AssociateElasticIp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_AttachElasticLoadBalancer.html 
        //  Attaches an Elastic Load Balancing load balancer to a specified layer.    
        val AttachElasticLoadBalancer = _AttachElasticLoadBalancer() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CloneStack.html 
        //  Creates a clone of a specified stack.    
        val CloneStack = _CloneStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateApp.html 
        //  Creates an app for a specified stack.    
        val CreateApp = _CreateApp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateDeployment.html 
        //  Runs deployment or stack commands.    
        val CreateDeployment = _CreateDeployment() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateInstance.html 
        //  Creates an instance in a specified stack.    
        val CreateInstance = _CreateInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateLayer.html 
        //  Creates a layer.    
        val CreateLayer = _CreateLayer() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateStack.html 
        //  Creates a new stack.    
        val CreateStack = _CreateStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_CreateUserProfile.html 
        //  Creates a new user profile.    
        val CreateUserProfile = _CreateUserProfile() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeleteApp.html 
        //  Deletes a specified app.    
        val DeleteApp = _DeleteApp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeleteInstance.html 
        //  Deletes a specified instance, which terminates the associated Amazon EC2 instance.    
        val DeleteInstance = _DeleteInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeleteLayer.html 
        //  Deletes a specified layer.    
        val DeleteLayer = _DeleteLayer() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeleteStack.html 
        //  Deletes a specified stack.    
        val DeleteStack = _DeleteStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeleteUserProfile.html 
        //  Deletes a user profile.    
        val DeleteUserProfile = _DeleteUserProfile() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeregisterElasticIp.html 
        //  Deregisters a specified Elastic IP address.    
        val DeregisterElasticIp = _DeregisterElasticIp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DeregisterVolume.html 
        //  Deregisters an Amazon EBS volume.    
        val DeregisterVolume = _DeregisterVolume() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeApps.html 
        //  Requests a description of a specified set of apps.    
        val DescribeApps = _DescribeApps() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeCommands.html 
        //  Describes the results of specified commands.    
        val DescribeCommands = _DescribeCommands() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeDeployments.html 
        //  Requests a description of a specified set of deployments.    
        val DescribeDeployments = _DescribeDeployments() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeElasticIps.html 
        //  Describes Elastic IP addresses.    
        val DescribeElasticIps = _DescribeElasticIps() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeElasticLoadBalancers.html 
        //  Describes a stack's Elastic Load Balancing instances.    
        val DescribeElasticLoadBalancers = _DescribeElasticLoadBalancers() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeInstances.html 
        //  Requests a description of a set of instances.    
        val DescribeInstances = _DescribeInstances() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeLayers.html 
        //  Requests a description of one or more layers in a specified stack.    
        val DescribeLayers = _DescribeLayers() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeLoadBasedAutoScaling.html 
        //  Describes load-based auto scaling configurations for specified layers.    
        val DescribeLoadBasedAutoScaling = _DescribeLoadBasedAutoScaling() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribePermissions.html 
        //  Describes the permissions for a specified stack.    
        val DescribePermissions = _DescribePermissions() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeRaidArrays.html 
        //  Describe an instance's RAID arrays.    
        val DescribeRaidArrays = _DescribeRaidArrays() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeRdsDbInstances.html 
        //  Describes Amazon RDS instances.    
        val DescribeRdsDbInstances = _DescribeRdsDbInstances() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeServiceErrors.html 
        //  Describes AWS OpsWorks service errors.    
        val DescribeServiceErrors = _DescribeServiceErrors() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeStacks.html 
        //  Requests a description of one or more stacks.    
        val DescribeStacks = _DescribeStacks() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeTimeBasedAutoScaling.html 
        //  Describes time-based auto scaling configurations for specified instances.    
        val DescribeTimeBasedAutoScaling = _DescribeTimeBasedAutoScaling() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeUserProfiles.html 
        //  Describe specified users.    
        val DescribeUserProfiles = _DescribeUserProfiles() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DescribeVolumes.html 
        //  Describes an instance's Amazon EBS volumes.    
        val DescribeVolumes = _DescribeVolumes() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DetachElasticLoadBalancer.html 
        //  Detaches a specified Elastic Load Balancing instance from its layer.    
        val DetachElasticLoadBalancer = _DetachElasticLoadBalancer() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_DisassociateElasticIp.html 
        //  Disassociates an Elastic IP address from its instance.    
        val DisassociateElasticIp = _DisassociateElasticIp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_GetHostnameSuggestion.html 
        //  Gets a generated host name for the specified layer, based on the current host name theme.    
        val GetHostnameSuggestion = _GetHostnameSuggestion() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_RebootInstance.html 
        //  Reboots a specified instance.    
        val RebootInstance = _RebootInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_RegisterElasticIp.html 
        //  Registers an Elastic IP address with a specified stack.    
        val RegisterElasticIp = _RegisterElasticIp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_RegisterVolume.html 
        //  Registers an Amazon EBS volume with a specified stack.    
        val RegisterVolume = _RegisterVolume() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_SetLoadBasedAutoScaling.html 
        //  Specify the load-based auto scaling configuration for a specified layer.    
        val SetLoadBasedAutoScaling = _SetLoadBasedAutoScaling() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_SetPermission.html 
        //  Specifies a user's permissions.    
        val SetPermission = _SetPermission() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_SetTimeBasedAutoScaling.html 
        //  Specify the time-based auto scaling configuration for a specified instance.    
        val SetTimeBasedAutoScaling = _SetTimeBasedAutoScaling() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_StartInstance.html 
        //  Starts a specified instance.    
        val StartInstance = _StartInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_StartStack.html 
        //  Starts a stack's instances.    
        val StartStack = _StartStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_StopInstance.html 
        //  Stops a specified instance.    
        val StopInstance = _StopInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_StopStack.html 
        //  Stops a specified stack.    
        val StopStack = _StopStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UnassignVolume.html 
        //  Unassigns an assigned Amazon EBS volume.    
        val UnassignVolume = _UnassignVolume() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateApp.html 
        //  Updates a specified app.    
        val UpdateApp = _UpdateApp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateElasticIp.html 
        //  Updates a registered Elastic IP address's name.    
        val UpdateElasticIp = _UpdateElasticIp() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateInstance.html 
        //  Updates a specified instance.    
        val UpdateInstance = _UpdateInstance() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateLayer.html 
        //  Updates a specified layer.    
        val UpdateLayer = _UpdateLayer() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateStack.html 
        //  Updates a specified stack.    
        val UpdateStack = _UpdateStack() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateUserProfile.html 
        //  Updates a specified user profile.    
        val UpdateUserProfile = _UpdateUserProfile() 
        // see http://docs.aws.amazon.com/opsworks/latest/APIReference/API_UpdateVolume.html 
        //  Updates an Amazon EBS volume's name or mount point.    
        val UpdateVolume = _UpdateVolume()
    }
      class _AssignVolume : IamPolicy.Action("opsworks:AssignVolume") {

         }       
 
      class _AssociateElasticIp : IamPolicy.Action("opsworks:AssociateElasticIp") {

         }       
 
      class _AttachElasticLoadBalancer : IamPolicy.Action("opsworks:AttachElasticLoadBalancer") {

         }       
 
      class _CloneStack : IamPolicy.Action("opsworks:CloneStack") {

         }       
 
      class _CreateApp : IamPolicy.Action("opsworks:CreateApp") {

         }       
 
      class _CreateDeployment : IamPolicy.Action("opsworks:CreateDeployment") {

         }       
 
      class _CreateInstance : IamPolicy.Action("opsworks:CreateInstance") {

         }       
 
      class _CreateLayer : IamPolicy.Action("opsworks:CreateLayer") {

         }       
 
      class _CreateStack : IamPolicy.Action("opsworks:CreateStack") {

         }       
 
      class _CreateUserProfile : IamPolicy.Action("opsworks:CreateUserProfile") {

         }       
 
      class _DeleteApp : IamPolicy.Action("opsworks:DeleteApp") {

         }       
 
      class _DeleteInstance : IamPolicy.Action("opsworks:DeleteInstance") {

         }       
 
      class _DeleteLayer : IamPolicy.Action("opsworks:DeleteLayer") {

         }       
 
      class _DeleteStack : IamPolicy.Action("opsworks:DeleteStack") {

         }       
 
      class _DeleteUserProfile : IamPolicy.Action("opsworks:DeleteUserProfile") {

         }       
 
      class _DeregisterElasticIp : IamPolicy.Action("opsworks:DeregisterElasticIp") {

         }       
 
      class _DeregisterVolume : IamPolicy.Action("opsworks:DeregisterVolume") {

         }       
 
      class _DescribeApps : IamPolicy.Action("opsworks:DescribeApps") {

         }       
 
      class _DescribeCommands : IamPolicy.Action("opsworks:DescribeCommands") {

         }       
 
      class _DescribeDeployments : IamPolicy.Action("opsworks:DescribeDeployments") {

         }       
 
      class _DescribeElasticIps : IamPolicy.Action("opsworks:DescribeElasticIps") {

         }       
 
      class _DescribeElasticLoadBalancers : IamPolicy.Action("opsworks:DescribeElasticLoadBalancers") {

         }       
 
      class _DescribeInstances : IamPolicy.Action("opsworks:DescribeInstances") {

         }       
 
      class _DescribeLayers : IamPolicy.Action("opsworks:DescribeLayers") {

         }       
 
      class _DescribeLoadBasedAutoScaling : IamPolicy.Action("opsworks:DescribeLoadBasedAutoScaling") {

         }       
 
      class _DescribePermissions : IamPolicy.Action("opsworks:DescribePermissions") {

         }       
 
      class _DescribeRaidArrays : IamPolicy.Action("opsworks:DescribeRaidArrays") {

         }       
 
      class _DescribeRdsDbInstances : IamPolicy.Action("opsworks:DescribeRdsDbInstances") {

         }       
 
      class _DescribeServiceErrors : IamPolicy.Action("opsworks:DescribeServiceErrors") {

         }       
 
      class _DescribeStacks : IamPolicy.Action("opsworks:DescribeStacks") {

         }       
 
      class _DescribeTimeBasedAutoScaling : IamPolicy.Action("opsworks:DescribeTimeBasedAutoScaling") {

         }       
 
      class _DescribeUserProfiles : IamPolicy.Action("opsworks:DescribeUserProfiles") {

         }       
 
      class _DescribeVolumes : IamPolicy.Action("opsworks:DescribeVolumes") {

         }       
 
      class _DetachElasticLoadBalancer : IamPolicy.Action("opsworks:DetachElasticLoadBalancer") {

         }       
 
      class _DisassociateElasticIp : IamPolicy.Action("opsworks:DisassociateElasticIp") {

         }       
 
      class _GetHostnameSuggestion : IamPolicy.Action("opsworks:GetHostnameSuggestion") {

         }       
 
      class _RebootInstance : IamPolicy.Action("opsworks:RebootInstance") {

         }       
 
      class _RegisterElasticIp : IamPolicy.Action("opsworks:RegisterElasticIp") {

         }       
 
      class _RegisterVolume : IamPolicy.Action("opsworks:RegisterVolume") {

         }       
 
      class _SetLoadBasedAutoScaling : IamPolicy.Action("opsworks:SetLoadBasedAutoScaling") {

         }       
 
      class _SetPermission : IamPolicy.Action("opsworks:SetPermission") {

         }       
 
      class _SetTimeBasedAutoScaling : IamPolicy.Action("opsworks:SetTimeBasedAutoScaling") {

         }       
 
      class _StartInstance : IamPolicy.Action("opsworks:StartInstance") {

         }       
 
      class _StartStack : IamPolicy.Action("opsworks:StartStack") {

         }       
 
      class _StopInstance : IamPolicy.Action("opsworks:StopInstance") {
             //arn:aws:opsworks:$region:$account:stack/$stack_id/"
            fun stack_byRegionAccountStack_id(region: String, account: String, stack_id: String) = IamPolicy.Resource("arn:aws:opsworks:$region:$account:stack/$stack_id/")
         }       
 
      class _StopStack : IamPolicy.Action("opsworks:StopStack") {

         }       
 
      class _UnassignVolume : IamPolicy.Action("opsworks:UnassignVolume") {

         }       
 
      class _UpdateApp : IamPolicy.Action("opsworks:UpdateApp") {

         }       
 
      class _UpdateElasticIp : IamPolicy.Action("opsworks:UpdateElasticIp") {

         }       
 
      class _UpdateInstance : IamPolicy.Action("opsworks:UpdateInstance") {

         }       
 
      class _UpdateLayer : IamPolicy.Action("opsworks:UpdateLayer") {

         }       
 
      class _UpdateStack : IamPolicy.Action("opsworks:UpdateStack") {

         }       
 
      class _UpdateUserProfile : IamPolicy.Action("opsworks:UpdateUserProfile") {

         }       
 
      class _UpdateVolume : IamPolicy.Action("opsworks:UpdateVolume") {

         }       


}        
