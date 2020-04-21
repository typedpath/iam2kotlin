
package com.typedpath.iam2kotlin.resources.ssm

import com.typedpath.iam2kotlin.IamPolicy

class SsmAction() {

    companion object { 
        val All = IamPolicy.Action("ssm:*")    
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_AddTagsToResource.html 
        //  Adds or overwrites one or more tags for the specified resource.    
        val AddTagsToResource = _AddTagsToResource() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_CancelCommand.html 
        //  Attempts to cancel the command specified by the Command ID.    
        val CancelCommand = _CancelCommand() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateActivation.html 
        //  Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using Run Command.    
        val CreateActivation = _CreateActivation() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_CreateAssociation.html 
        //  Associates the specified SSM document with the specified instance.    
        val CreateAssociation = _CreateAssociation() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_CreateAssociationBatch.html 
        //  Associates the specified SSM document with the specified instances.    
        val CreateAssociationBatch = _CreateAssociationBatch() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_CreateDocument.html 
        //  Creates an SSM document.    
        val CreateDocument = _CreateDocument() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateMaintenanceWindow.html 
        //  Create an SSM maintenance window.    
        val CreateMaintenanceWindow = _CreateMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreatePatchBaseline.html 
        //  Create a SSM patch baseline.    
        val CreatePatchBaseline = _CreatePatchBaseline() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateResourceDataSync.html 
        //  Creates a resource data sync configuration to a single bucket in Amazon S3.    
        val CreateResourceDataSync = _CreateResourceDataSync() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeleteActivation.html 
        //  Deletes an activation.    
        val DeleteActivation = _DeleteActivation() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DeleteAssociation.html 
        //  Disassociates the specified SSM document from the specified instance.    
        val DeleteAssociation = _DeleteAssociation() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DeleteDocument.html 
        //  Deletes the SSM document and all instance associations to the document.    
        val DeleteDocument = _DeleteDocument() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeleteMaintenanceWindow.html 
        //  Delete an SSM maintenance window.    
        val DeleteMaintenanceWindow = _DeleteMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeleteParameter.html 
        //  Delete a parameter from the system.    
        val DeleteParameter = _DeleteParameter() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeleteParameters.html 
        //  Delete a list of parameters.    
        val DeleteParameters = _DeleteParameters() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeletePatchBaseline.html 
        //  Delete a SSM patch baseline.    
        val DeletePatchBaseline = _DeletePatchBaseline() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeleteResourceDataSync.html 
        //  Deletes a Resource Data Sync configuration.    
        val DeleteResourceDataSync = _DeleteResourceDataSync() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeregisterManagedInstance.html 
        //  Removes the server or virtual machine from the list of registered servers.    
        val DeregisterManagedInstance = _DeregisterManagedInstance() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeregisterPatchBaselineForPatchGroup.html 
        //  Deregister a SSM patch baseline from a patch group.    
        val DeregisterPatchBaselineForPatchGroup = _DeregisterPatchBaselineForPatchGroup() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeregisterTargetFromMaintenanceWindow.html 
        //  Deregister a target from SSM maintenance window.    
        val DeregisterTargetFromMaintenanceWindow = _DeregisterTargetFromMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DeregisterTaskFromMaintenanceWindow.html 
        //  Deregister a task from SSM maintenance window.    
        val DeregisterTaskFromMaintenanceWindow = _DeregisterTaskFromMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeActivations.html 
        //  Details about the activation, including: the date and time the activation was created, the expiration date, the IAM role assigned to the instances in the activation, and the number of instances activated by this registration.    
        val DescribeActivations = _DescribeActivations() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DescribeAssociation.html 
        //  Describes the associations for the specified SSM document or instance.    
        val DescribeAssociation = _DescribeAssociation() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeAvailablePatches.html 
        //  Describes one or more available patches.    
        val DescribeAvailablePatches = _DescribeAvailablePatches() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DescribeDocument.html 
        //  Describes the specified SSM document.    
        val DescribeDocument = _DescribeDocument() 
        // see - 
        //  Describes the parameters for an SSM document.    
        val DescribeDocumentParameters = _DescribeDocumentParameters() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DescribeDocumentPermission.html 
        //  Describes the permissions for an SSM document.    
        val DescribeDocumentPermission = _DescribeDocumentPermission() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeEffectivePatchesForPatchBaseline.html 
        //  Describes the the evaluation of patch baseline for patches and corresponding state.    
        val DescribeEffectivePatchesForPatchBaseline = _DescribeEffectivePatchesForPatchBaseline() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_DescribeInstanceInformation.html 
        //  Describes one or more of your instances.    
        val DescribeInstanceInformation = _DescribeInstanceInformation() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeInstancePatchStates.html 
        //  Describe one or more of your instance patch states. One per each instance ID.    
        val DescribeInstancePatchStates = _DescribeInstancePatchStates() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeInstancePatchStatesForPatchGroup.html 
        //  Describe one or more of your instance patch states over all instances in given patch group.    
        val DescribeInstancePatchStatesForPatchGroup = _DescribeInstancePatchStatesForPatchGroup() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeInstancePatches.html 
        //  Describe one or more of your instance patch states for a given instance ID.    
        val DescribeInstancePatches = _DescribeInstancePatches() 
        // see - 
        //  Describes one or more your instances.    
        val DescribeInstanceProperties = _DescribeInstanceProperties() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeMaintenanceWindowExecutionTaskInvocations.html 
        //  Describe one or more of your maintenance window execution task invocations history.    
        val DescribeMaintenanceWindowExecutionTaskInvocations = _DescribeMaintenanceWindowExecutionTaskInvocations() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeMaintenanceWindowExecutionTasks.html 
        //  Describe one or more of your maintenance window execution tasks history.    
        val DescribeMaintenanceWindowExecutionTasks = _DescribeMaintenanceWindowExecutionTasks() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/PI_DescribeMaintenanceWindowExecutions.html 
        //  Describe one or more of your maintenance window execution history.    
        val DescribeMaintenanceWindowExecutions = _DescribeMaintenanceWindowExecutions() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeMaintenanceWindowTargets.html 
        //  Describe one or more of your maintenance windows targets.    
        val DescribeMaintenanceWindowTargets = _DescribeMaintenanceWindowTargets() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeMaintenanceWindowTasks.html 
        //  Describe one or more of your maintenance windows tasks.    
        val DescribeMaintenanceWindowTasks = _DescribeMaintenanceWindowTasks() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeMaintenanceWindows.html 
        //  Describe one or more of your maintenance windows.    
        val DescribeMaintenanceWindows = _DescribeMaintenanceWindows() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeParameters.html 
        //  Describes one or more parameters in Parameter Store.    
        val DescribeParameters = _DescribeParameters() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchBaselines.html 
        //  Describes one or more SSM patch baselines.    
        val DescribePatchBaselines = _DescribePatchBaselines() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchGroupState.html 
        //  Get a high level patch state report of given patch group.    
        val DescribePatchGroupState = _DescribePatchGroupState() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchGroups.html 
        //  Describes one or more patch group to SSM patch baseline mappings.    
        val DescribePatchGroups = _DescribePatchGroups() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribeSessions.html 
        //  Describe one or more Session Manager sessions.    
        val DescribeSessions = _DescribeSessions() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_AutomationExecution.html 
        //      
        val GetAutomationExecution = _GetAutomationExecution() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetConnectionStatus.html 
        //  Get the connection status for an instance.    
        val GetConnectionStatus = _GetConnectionStatus() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetDefaultPatchBaseline.html 
        //  Get the default SSM patch baseline.    
        val GetDefaultPatchBaseline = _GetDefaultPatchBaseline() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetDeployablePatchSnapshotForInstance.html 
        //  Get the snapshot of patches to be installed for given instances.    
        val GetDeployablePatchSnapshotForInstance = _GetDeployablePatchSnapshotForInstance() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_GetDocument.html 
        //  Gets the contents of the specified SSM document.    
        val GetDocument = _GetDocument() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetMaintenanceWindow.html 
        //  Get a SSM maintenance window.    
        val GetMaintenanceWindow = _GetMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetMaintenanceWindowExecution.html 
        //  Get a SSM maintenance window execution.    
        val GetMaintenanceWindowExecution = _GetMaintenanceWindowExecution() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetMaintenanceWindowExecutionTask.html 
        //  Get a SSM maintenance window execution task.    
        val GetMaintenanceWindowExecutionTask = _GetMaintenanceWindowExecutionTask() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetMaintenanceWindowExecutionTaskInvocation.html 
        //  Get a SSM maintenance window execution task invocation.    
        val GetMaintenanceWindowExecutionTaskInvocation = _GetMaintenanceWindowExecutionTaskInvocation() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetMaintenanceWindowTask.html 
        //  Get a SSM maintenance window task.    
        val GetMaintenanceWindowTask = _GetMaintenanceWindowTask() 
        // see - 
        //  Fetches the installation description for a package.    
        val GetManifest = _GetManifest() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetParameter.html 
        //  Get information about a parameter by using the parameter name.    
        val GetParameter = _GetParameter() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetParameterHistory.html 
        //  Query a list of all parameters used by the AWS account.    
        val GetParameterHistory = _GetParameterHistory() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetParameters.html 
        //  Get details of a parameter.    
        val GetParameters = _GetParameters() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetParametersByPath.html 
        //  Retrieve parameters in a specific hierarchy.    
        val GetParametersByPath = _GetParametersByPath() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetPatchBaseline.html 
        //  Get a SSM patch baseline    
        val GetPatchBaseline = _GetPatchBaseline() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_GetPatchBaselineForPatchGroup.html 
        //  Get the SSM patch baseline associated to the given patch group.    
        val GetPatchBaselineForPatchGroup = _GetPatchBaselineForPatchGroup() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_ListAssociationVersions.html 
        //  Lists versions of the specified association.    
        val ListAssociationVersions = _ListAssociationVersions() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_ListAssociations.html 
        //  Lists the associations for the specified SSM document or instance.    
        val ListAssociations = _ListAssociations() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_ListCommandInvocations.html 
        //  An invocation is copy of a command sent to a specific instance.    
        val ListCommandInvocations = _ListCommandInvocations() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_ListCommands.html 
        //  Lists the commands requested by users of the AWS account.    
        val ListCommands = _ListCommands() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_ListDocuments.html 
        //  Describes one or more of your SSM documents.    
        val ListDocuments = _ListDocuments() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_ListTagsForResource.html 
        //  Returns a list of the tags assigned to the specified resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_ModifyDocumentPermission.html 
        //  Share a document publicly or privately.    
        val ModifyDocumentPermission = _ModifyDocumentPermission() 
        // see - 
        //  Registers a compliance type and other compliance details on a designated resource.    
        val PutComplianceItems = _PutComplianceItems() 
        // see - 
        //  Reports installation result for a package.    
        val PutConfigurePackageResult = _PutConfigurePackageResult() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PutParameter.html 
        //  Add one or more parameters to the system.    
        val PutParameter = _PutParameter() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterDefaultPatchBaseline.html 
        //  Register a SSM patch baseline as the default.    
        val RegisterDefaultPatchBaseline = _RegisterDefaultPatchBaseline() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterPatchBaselineForPatchGroup.html 
        //  Register a SSM patch baseline to a patch group.    
        val RegisterPatchBaselineForPatchGroup = _RegisterPatchBaselineForPatchGroup() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTargetWithMaintenanceWindow.html 
        //  Register a SSM window target to a maintenance window.    
        val RegisterTargetWithMaintenanceWindow = _RegisterTargetWithMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTaskWithMaintenanceWindow.html 
        //  Register a SSM window task to a maintenance window.    
        val RegisterTaskWithMaintenanceWindow = _RegisterTaskWithMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RemoveTagsFromResource.html 
        //  Removes all tags from the specified resource.    
        val RemoveTagsFromResource = _RemoveTagsFromResource() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_ResumeSession.html 
        //  Resume a disconnected SSM session manager connection.    
        val ResumeSession = _ResumeSession() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_SendAutomationSignal.html 
        //      
        val SendAutomationSignal = _SendAutomationSignal() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_SendCommand.html 
        //  Executes commands (via command documents) on one or more remote instances.    
        val SendCommand = _SendCommand() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_StartAutomationExecution.html 
        //  Initiates execution of an Automation document.    
        val StartAutomationExecution = _StartAutomationExecution() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_StartSession.html 
        //  Start a connection to an instance using SSM Session Manager.    
        val StartSession = _StartSession() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_StopAutomationExecution.html 
        //  Stop an Automation that is currently executing.    
        val StopAutomationExecution = _StopAutomationExecution() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_TerminateSession.html 
        //  Terminate an ongoing SSM Session Manager connection.    
        val TerminateSession = _TerminateSession() 
        // see https://docs.aws.amazon.com/ssm/latest/APIReference/API_UpdateAssociationStatus.html 
        //  Updates the status of the SSM document associated with the specified instance.    
        val UpdateAssociationStatus = _UpdateAssociationStatus() 
        // see - 
        //  Updates the status of the SSM document associated with the specified instance.    
        val UpdateInstanceInformation = _UpdateInstanceInformation() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_UpdateMaintenanceWindow.html 
        //  Update a SSM maintenance window.    
        val UpdateMaintenanceWindow = _UpdateMaintenanceWindow() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_UpdateMaintenanceWindowTarget.html 
        //  Update a SSM maintenance window target.    
        val UpdateMaintenanceWindowTarget = _UpdateMaintenanceWindowTarget() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_UpdateMaintenanceWindowTask.html 
        //  Update a SSM maintenance window task.    
        val UpdateMaintenanceWindowTask = _UpdateMaintenanceWindowTask() 
        // see https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_UpdateManagedInstanceRole.html 
        //  Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.    
        val UpdateManagedInstanceRole = _UpdateManagedInstanceRole() 
        // see - 
        //  Update a SSM patch baseline.    
        val UpdatePatchBaseline = _UpdatePatchBaseline()
    }
      class _AddTagsToResource : IamPolicy.Action("ssm:AddTagsToResource") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _CancelCommand : IamPolicy.Action("ssm:CancelCommand") {

         }       
 
      class _CreateActivation : IamPolicy.Action("ssm:CreateActivation") {

         }       
 
      class _CreateAssociation : IamPolicy.Action("ssm:CreateAssociation") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _CreateAssociationBatch : IamPolicy.Action("ssm:CreateAssociationBatch") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _CreateDocument : IamPolicy.Action("ssm:CreateDocument") {

         }       
 
      class _CreateMaintenanceWindow : IamPolicy.Action("ssm:CreateMaintenanceWindow") {

         }       
 
      class _CreatePatchBaseline : IamPolicy.Action("ssm:CreatePatchBaseline") {

         }       
 
      class _CreateResourceDataSync : IamPolicy.Action("ssm:CreateResourceDataSync") {

         }       
 
      class _DeleteActivation : IamPolicy.Action("ssm:DeleteActivation") {

         }       
 
      class _DeleteAssociation : IamPolicy.Action("ssm:DeleteAssociation") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DeleteDocument : IamPolicy.Action("ssm:DeleteDocument") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DeleteMaintenanceWindow : IamPolicy.Action("ssm:DeleteMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DeleteParameter : IamPolicy.Action("ssm:DeleteParameter") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _DeleteParameters : IamPolicy.Action("ssm:DeleteParameters") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _DeletePatchBaseline : IamPolicy.Action("ssm:DeletePatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _DeleteResourceDataSync : IamPolicy.Action("ssm:DeleteResourceDataSync") {

         }       
 
      class _DeregisterManagedInstance : IamPolicy.Action("ssm:DeregisterManagedInstance") {
             //arn:aws:ssm:$region:$account:managed-instance/$managed-instance-name"
            fun managedinstance_byRegionAccountManagedinstancename(region: String, account: String, managedinstancename: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:managed-instance/$managedinstancename")
         }       
 
      class _DeregisterPatchBaselineForPatchGroup : IamPolicy.Action("ssm:DeregisterPatchBaselineForPatchGroup") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _DeregisterTargetFromMaintenanceWindow : IamPolicy.Action("ssm:DeregisterTargetFromMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DeregisterTaskFromMaintenanceWindow : IamPolicy.Action("ssm:DeregisterTaskFromMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DescribeActivations : IamPolicy.Action("ssm:DescribeActivations") {

         }       
 
      class _DescribeAssociation : IamPolicy.Action("ssm:DescribeAssociation") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeAvailablePatches : IamPolicy.Action("ssm:DescribeAvailablePatches") {

         }       
 
      class _DescribeDocument : IamPolicy.Action("ssm:DescribeDocument") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeDocumentParameters : IamPolicy.Action("ssm:DescribeDocumentParameters") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeDocumentPermission : IamPolicy.Action("ssm:DescribeDocumentPermission") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeEffectivePatchesForPatchBaseline : IamPolicy.Action("ssm:DescribeEffectivePatchesForPatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _DescribeInstanceInformation : IamPolicy.Action("ssm:DescribeInstanceInformation") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeInstancePatchStates : IamPolicy.Action("ssm:DescribeInstancePatchStates") {

         }       
 
      class _DescribeInstancePatchStatesForPatchGroup : IamPolicy.Action("ssm:DescribeInstancePatchStatesForPatchGroup") {

         }       
 
      class _DescribeInstancePatches : IamPolicy.Action("ssm:DescribeInstancePatches") {

         }       
 
      class _DescribeInstanceProperties : IamPolicy.Action("ssm:DescribeInstanceProperties") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _DescribeMaintenanceWindowExecutionTaskInvocations : IamPolicy.Action("ssm:DescribeMaintenanceWindowExecutionTaskInvocations") {

         }       
 
      class _DescribeMaintenanceWindowExecutionTasks : IamPolicy.Action("ssm:DescribeMaintenanceWindowExecutionTasks") {

         }       
 
      class _DescribeMaintenanceWindowExecutions : IamPolicy.Action("ssm:DescribeMaintenanceWindowExecutions") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DescribeMaintenanceWindowTargets : IamPolicy.Action("ssm:DescribeMaintenanceWindowTargets") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DescribeMaintenanceWindowTasks : IamPolicy.Action("ssm:DescribeMaintenanceWindowTasks") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _DescribeMaintenanceWindows : IamPolicy.Action("ssm:DescribeMaintenanceWindows") {

         }       
 
      class _DescribeParameters : IamPolicy.Action("ssm:DescribeParameters") {

         }       
 
      class _DescribePatchBaselines : IamPolicy.Action("ssm:DescribePatchBaselines") {

         }       
 
      class _DescribePatchGroupState : IamPolicy.Action("ssm:DescribePatchGroupState") {

         }       
 
      class _DescribePatchGroups : IamPolicy.Action("ssm:DescribePatchGroups") {

         }       
 
      class _DescribeSessions : IamPolicy.Action("ssm:DescribeSessions") {

         }       
 
      class _GetAutomationExecution : IamPolicy.Action("ssm:GetAutomationExecution") {

         }       
 
      class _GetConnectionStatus : IamPolicy.Action("ssm:GetConnectionStatus") {

         }       
 
      class _GetDefaultPatchBaseline : IamPolicy.Action("ssm:GetDefaultPatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _GetDeployablePatchSnapshotForInstance : IamPolicy.Action("ssm:GetDeployablePatchSnapshotForInstance") {

         }       
 
      class _GetDocument : IamPolicy.Action("ssm:GetDocument") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _GetMaintenanceWindow : IamPolicy.Action("ssm:GetMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _GetMaintenanceWindowExecution : IamPolicy.Action("ssm:GetMaintenanceWindowExecution") {

         }       
 
      class _GetMaintenanceWindowExecutionTask : IamPolicy.Action("ssm:GetMaintenanceWindowExecutionTask") {

         }       
 
      class _GetMaintenanceWindowExecutionTaskInvocation : IamPolicy.Action("ssm:GetMaintenanceWindowExecutionTaskInvocation") {

         }       
 
      class _GetMaintenanceWindowTask : IamPolicy.Action("ssm:GetMaintenanceWindowTask") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
             //arn:aws:ssm:$region:$account:windowtask/$resource-id"
            fun windowtask_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:windowtask/$resourceid")
         }       
 
      class _GetManifest : IamPolicy.Action("ssm:GetManifest") {

         }       
 
      class _GetParameter : IamPolicy.Action("ssm:GetParameter") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _GetParameterHistory : IamPolicy.Action("ssm:GetParameterHistory") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _GetParameters : IamPolicy.Action("ssm:GetParameters") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _GetParametersByPath : IamPolicy.Action("ssm:GetParametersByPath") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _GetPatchBaseline : IamPolicy.Action("ssm:GetPatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _GetPatchBaselineForPatchGroup : IamPolicy.Action("ssm:GetPatchBaselineForPatchGroup") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _ListAssociationVersions : IamPolicy.Action("ssm:ListAssociationVersions") {

         }       
 
      class _ListAssociations : IamPolicy.Action("ssm:ListAssociations") {

         }       
 
      class _ListCommandInvocations : IamPolicy.Action("ssm:ListCommandInvocations") {

         }       
 
      class _ListCommands : IamPolicy.Action("ssm:ListCommands") {

         }       
 
      class _ListDocuments : IamPolicy.Action("ssm:ListDocuments") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("ssm:ListTagsForResource") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _ModifyDocumentPermission : IamPolicy.Action("ssm:ModifyDocumentPermission") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _PutComplianceItems : IamPolicy.Action("ssm:PutComplianceItems") {

         }       
 
      class _PutConfigurePackageResult : IamPolicy.Action("ssm:PutConfigurePackageResult") {

         }       
 
      class _PutParameter : IamPolicy.Action("ssm:PutParameter") {
             //arn:aws:ssm:$region:$account:parameter/$name"
            fun parameter_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:parameter/$name")
         }       
 
      class _RegisterDefaultPatchBaseline : IamPolicy.Action("ssm:RegisterDefaultPatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _RegisterPatchBaselineForPatchGroup : IamPolicy.Action("ssm:RegisterPatchBaselineForPatchGroup") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       
 
      class _RegisterTargetWithMaintenanceWindow : IamPolicy.Action("ssm:RegisterTargetWithMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _RegisterTaskWithMaintenanceWindow : IamPolicy.Action("ssm:RegisterTaskWithMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _RemoveTagsFromResource : IamPolicy.Action("ssm:RemoveTagsFromResource") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _ResumeSession : IamPolicy.Action("ssm:ResumeSession") {
             //arn:aws:ssm:$region:$account:session/$resource-id"
            fun session_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:session/$resourceid")
         }       
 
      class _SendAutomationSignal : IamPolicy.Action("ssm:SendAutomationSignal") {

         }       
 
      class _SendCommand : IamPolicy.Action("ssm:SendCommand") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
             //arn:aws:ec2:*:*:instance/*"
            fun arnawsec2AllAllinstanceAll() = IamPolicy.Resource("arn:aws:ec2:*:*:instance/*")
         }       
 
      class _StartAutomationExecution : IamPolicy.Action("ssm:StartAutomationExecution") {

         }       
 
      class _StartSession : IamPolicy.Action("ssm:StartSession") {

         }       
 
      class _StopAutomationExecution : IamPolicy.Action("ssm:StopAutomationExecution") {

         }       
 
      class _TerminateSession : IamPolicy.Action("ssm:TerminateSession") {
             //arn:aws:ssm:$region:$account:session/$resource-id"
            fun session_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:session/$resourceid")
         }       
 
      class _UpdateAssociationStatus : IamPolicy.Action("ssm:UpdateAssociationStatus") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _UpdateInstanceInformation : IamPolicy.Action("ssm:UpdateInstanceInformation") {
             //arn:aws:ssm:$region:$account:document/$name"
            fun document_byRegionAccountName(region: String, account: String, name: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:document/$name")
         }       
 
      class _UpdateMaintenanceWindow : IamPolicy.Action("ssm:UpdateMaintenanceWindow") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _UpdateMaintenanceWindowTarget : IamPolicy.Action("ssm:UpdateMaintenanceWindowTarget") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
             //arn:aws:ssm:$region:$account:windowtarget/$resource-id"
            fun windowtarget_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:windowtarget/$resourceid")
         }       
 
      class _UpdateMaintenanceWindowTask : IamPolicy.Action("ssm:UpdateMaintenanceWindowTask") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
             //arn:aws:ssm:$region:$account:windowtarget/$resource-id"
            fun windowtarget_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:windowtarget/$resourceid")
         }       
 
      class _UpdateManagedInstanceRole : IamPolicy.Action("ssm:UpdateManagedInstanceRole") {
             //arn:aws:ssm:$region:$account:maintenancewindow/$resource-id"
            fun maintenancewindow_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:maintenancewindow/$resourceid")
         }       
 
      class _UpdatePatchBaseline : IamPolicy.Action("ssm:UpdatePatchBaseline") {
             //arn:aws:ssm:$region:$account:patchbaseline/$resource-id"
            fun patchbaseline_byRegionAccountResourceid(region: String, account: String, resourceid: String) = IamPolicy.Resource("arn:aws:ssm:$region:$account:patchbaseline/$resourceid")
         }       


}        
