
package com.typedpath.iam2kotlin.resources.lightsail

import com.typedpath.iam2kotlin.IamPolicy

class LightsailAction() {

    companion object { 
        val All = IamPolicy.Action("lightsail:*")    
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_AllocateStaticIp.html 
        //  Allocates a static IP address.    
        val AllocateStaticIp = _AllocateStaticIp() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_AttachStaticIp.html 
        //  Attaches a static IP address to a specific Amazon Lightsail instance.    
        val AttachStaticIp = _AttachStaticIp() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CloseInstancePublicPorts.html 
        //  Closes the public ports on a specific Amazon Lightsail instance.    
        val CloseInstancePublicPorts = _CloseInstancePublicPorts() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateDomain.html 
        //  Creates a domain resource for the specified domain (e.    
        val CreateDomain = _CreateDomain() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateDomainEntry.html 
        //  Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX record.    
        val CreateDomainEntry = _CreateDomainEntry() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateInstanceSnapshot.html 
        //  Creates a snapshot of a specific virtual private server, or instance.    
        val CreateInstanceSnapshot = _CreateInstanceSnapshot() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateInstances.html 
        //  Creates one or more Amazon Lightsail virtual private servers, or instances.    
        val CreateInstances = _CreateInstances() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateInstancesFromSnapshot.html 
        //  Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical configuration.    
        val CreateInstancesFromSnapshot = _CreateInstancesFromSnapshot() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateKeyPair.html 
        //  Creates sn SSH key pair.    
        val CreateKeyPair = _CreateKeyPair() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DeleteDomain.html 
        //  Deletes the specified domain recordset and all of its domain records.    
        val DeleteDomain = _DeleteDomain() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DeleteDomainEntry.html 
        //  Deletes a specific domain entry.    
        val DeleteDomainEntry = _DeleteDomainEntry() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DeleteInstance.html 
        //  Deletes a specific Amazon Lightsail virtual private server, or instance.    
        val DeleteInstance = _DeleteInstance() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DeleteInstanceSnapshot.html 
        //  Deletes a specific snapshot of a virtual private server (or instance).    
        val DeleteInstanceSnapshot = _DeleteInstanceSnapshot() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DeleteKeyPair.html 
        //  Deletes a specific SSH key pair.    
        val DeleteKeyPair = _DeleteKeyPair() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DetachStaticIp.html 
        //  Detaches a static IP from the Amazon Lightsail instance to which it is attached.    
        val DetachStaticIp = _DetachStaticIp() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_DownloadDefaultKeyPair.html 
        //  Downloads the default SSH key pair from the user's account.    
        val DownloadDefaultKeyPair = _DownloadDefaultKeyPair() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetActiveNames.html 
        //  Returns the names of all active (not deleted) resources.    
        val GetActiveNames = _GetActiveNames() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetBlueprints.html 
        //  Returns the list of available instance images, or blueprints.    
        val GetBlueprints = _GetBlueprints() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetBundles.html 
        //  Returns the list of bundles that are available for purchase.    
        val GetBundles = _GetBundles() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetDomain.html 
        //  Returns information about a specific domain recordset.    
        val GetDomain = _GetDomain() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetDomains.html 
        //  Returns a list of all domains in the user's account.    
        val GetDomains = _GetDomains() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstance.html 
        //  Returns information about a specific Amazon Lightsail instance, which is a virtual private server.    
        val GetInstance = _GetInstance() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstanceAccessDetails.html 
        //  Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance.    
        val GetInstanceAccessDetails = _GetInstanceAccessDetails() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstanceMetricData.html 
        //  Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.    
        val GetInstanceMetricData = _GetInstanceMetricData() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstancePortStates.html 
        //  Returns the port states for a specific virtual private server, or instance.    
        val GetInstancePortStates = _GetInstancePortStates() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstanceSnapshot.html 
        //  Returns information about a specific instance snapshot.    
        val GetInstanceSnapshot = _GetInstanceSnapshot() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstanceSnapshots.html 
        //  Returns all instance snapshots for the user's account.    
        val GetInstanceSnapshots = _GetInstanceSnapshots() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstanceState.html 
        //  Returns the state of a specific instance.    
        val GetInstanceState = _GetInstanceState() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetInstances.html 
        //  Returns information about all Amazon Lightsail virtual private servers, or instances.    
        val GetInstances = _GetInstances() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetKeyPair.html 
        //  Returns information about a specific key pair.    
        val GetKeyPair = _GetKeyPair() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetKeyPairs.html 
        //  Returns information about all key pairs in the user's account.    
        val GetKeyPairs = _GetKeyPairs() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetOperation.html 
        //  Returns information about a specific operation.    
        val GetOperation = _GetOperation() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetOperations.html 
        //  Returns information about all operations.    
        val GetOperations = _GetOperations() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetOperationsForResource.html 
        //  Gets operations for a specific resource (e.    
        val GetOperationsForResource = _GetOperationsForResource() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html 
        //  Returns a list of all valid regions for Amazon Lightsail.    
        val GetRegions = _GetRegions() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetStaticIp.html 
        //  Returns information about a specific static IP.    
        val GetStaticIp = _GetStaticIp() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetStaticIps.html 
        //  Returns information about all static IPs in the user's account.    
        val GetStaticIps = _GetStaticIps() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_ImportKeyPair.html 
        //  Imports a public SSH key from a specific key pair.    
        val ImportKeyPair = _ImportKeyPair() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_IsVpcPeered.html 
        //  Returns a Boolean value indicating whether your Lightsail VPC is peered.    
        val IsVpcPeered = _IsVpcPeered() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_OpenInstancePublicPorts.html 
        //  Adds public ports to an Amazon Lightsail instance.    
        val OpenInstancePublicPorts = _OpenInstancePublicPorts() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_PeerVpc.html 
        //  Tries to peer the Lightsail VPC with the user's default VPC.    
        val PeerVpc = _PeerVpc() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_RebootInstance.html 
        //  Restarts a specific instance.    
        val RebootInstance = _RebootInstance() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_ReleaseStaticIp.html 
        //  Deletes a specific static IP from your account.    
        val ReleaseStaticIp = _ReleaseStaticIp() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_StartInstance.html 
        //  Starts a specific Amazon Lightsail instance from a stopped state.    
        val StartInstance = _StartInstance() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_StopInstance.html 
        //  Stops a specific Amazon Lightsail instance that is currently running.    
        val StopInstance = _StopInstance() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_UnpeerVpc.html 
        //  Attempts to unpeer the Lightsail VPC from the user's default VPC.    
        val UnpeerVpc = _UnpeerVpc() 
        // see http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_UpdateDomainEntry.html 
        //  Updates a domain recordset after it is created.    
        val UpdateDomainEntry = _UpdateDomainEntry()
    }
      class _AllocateStaticIp : IamPolicy.Action("lightsail:AllocateStaticIp") {

         }       
 
      class _AttachStaticIp : IamPolicy.Action("lightsail:AttachStaticIp") {

         }       
 
      class _CloseInstancePublicPorts : IamPolicy.Action("lightsail:CloseInstancePublicPorts") {

         }       
 
      class _CreateDomain : IamPolicy.Action("lightsail:CreateDomain") {

         }       
 
      class _CreateDomainEntry : IamPolicy.Action("lightsail:CreateDomainEntry") {

         }       
 
      class _CreateInstanceSnapshot : IamPolicy.Action("lightsail:CreateInstanceSnapshot") {

         }       
 
      class _CreateInstances : IamPolicy.Action("lightsail:CreateInstances") {

         }       
 
      class _CreateInstancesFromSnapshot : IamPolicy.Action("lightsail:CreateInstancesFromSnapshot") {

         }       
 
      class _CreateKeyPair : IamPolicy.Action("lightsail:CreateKeyPair") {

         }       
 
      class _DeleteDomain : IamPolicy.Action("lightsail:DeleteDomain") {

         }       
 
      class _DeleteDomainEntry : IamPolicy.Action("lightsail:DeleteDomainEntry") {

         }       
 
      class _DeleteInstance : IamPolicy.Action("lightsail:DeleteInstance") {

         }       
 
      class _DeleteInstanceSnapshot : IamPolicy.Action("lightsail:DeleteInstanceSnapshot") {

         }       
 
      class _DeleteKeyPair : IamPolicy.Action("lightsail:DeleteKeyPair") {

         }       
 
      class _DetachStaticIp : IamPolicy.Action("lightsail:DetachStaticIp") {

         }       
 
      class _DownloadDefaultKeyPair : IamPolicy.Action("lightsail:DownloadDefaultKeyPair") {

         }       
 
      class _GetActiveNames : IamPolicy.Action("lightsail:GetActiveNames") {

         }       
 
      class _GetBlueprints : IamPolicy.Action("lightsail:GetBlueprints") {

         }       
 
      class _GetBundles : IamPolicy.Action("lightsail:GetBundles") {

         }       
 
      class _GetDomain : IamPolicy.Action("lightsail:GetDomain") {

         }       
 
      class _GetDomains : IamPolicy.Action("lightsail:GetDomains") {

         }       
 
      class _GetInstance : IamPolicy.Action("lightsail:GetInstance") {

         }       
 
      class _GetInstanceAccessDetails : IamPolicy.Action("lightsail:GetInstanceAccessDetails") {

         }       
 
      class _GetInstanceMetricData : IamPolicy.Action("lightsail:GetInstanceMetricData") {

         }       
 
      class _GetInstancePortStates : IamPolicy.Action("lightsail:GetInstancePortStates") {

         }       
 
      class _GetInstanceSnapshot : IamPolicy.Action("lightsail:GetInstanceSnapshot") {

         }       
 
      class _GetInstanceSnapshots : IamPolicy.Action("lightsail:GetInstanceSnapshots") {

         }       
 
      class _GetInstanceState : IamPolicy.Action("lightsail:GetInstanceState") {

         }       
 
      class _GetInstances : IamPolicy.Action("lightsail:GetInstances") {

         }       
 
      class _GetKeyPair : IamPolicy.Action("lightsail:GetKeyPair") {

         }       
 
      class _GetKeyPairs : IamPolicy.Action("lightsail:GetKeyPairs") {

         }       
 
      class _GetOperation : IamPolicy.Action("lightsail:GetOperation") {

         }       
 
      class _GetOperations : IamPolicy.Action("lightsail:GetOperations") {

         }       
 
      class _GetOperationsForResource : IamPolicy.Action("lightsail:GetOperationsForResource") {

         }       
 
      class _GetRegions : IamPolicy.Action("lightsail:GetRegions") {

         }       
 
      class _GetStaticIp : IamPolicy.Action("lightsail:GetStaticIp") {

         }       
 
      class _GetStaticIps : IamPolicy.Action("lightsail:GetStaticIps") {

         }       
 
      class _ImportKeyPair : IamPolicy.Action("lightsail:ImportKeyPair") {

         }       
 
      class _IsVpcPeered : IamPolicy.Action("lightsail:IsVpcPeered") {

         }       
 
      class _OpenInstancePublicPorts : IamPolicy.Action("lightsail:OpenInstancePublicPorts") {

         }       
 
      class _PeerVpc : IamPolicy.Action("lightsail:PeerVpc") {

         }       
 
      class _RebootInstance : IamPolicy.Action("lightsail:RebootInstance") {

         }       
 
      class _ReleaseStaticIp : IamPolicy.Action("lightsail:ReleaseStaticIp") {

         }       
 
      class _StartInstance : IamPolicy.Action("lightsail:StartInstance") {

         }       
 
      class _StopInstance : IamPolicy.Action("lightsail:StopInstance") {

         }       
 
      class _UnpeerVpc : IamPolicy.Action("lightsail:UnpeerVpc") {

         }       
 
      class _UpdateDomainEntry : IamPolicy.Action("lightsail:UpdateDomainEntry") {

         }       


}        
