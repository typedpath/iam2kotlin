
package com.typedpath.iam2kotlin.resources.ds

import com.typedpath.iam2kotlin.IamPolicy

class DsAction() {

    companion object { 
        val All = IamPolicy.Action("ds:*")    
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_ConnectDirectory.html 
        //  Creates an AD Connector to connect to an on-premises directory.    
        val ConnectDirectory = _ConnectDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateAlias.html 
        //  Creates an alias for a directory and assigns the alias to the directory.    
        val CreateAlias = _CreateAlias() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateComputer.html 
        //  Creates a computer account in the specified directory, and joins the computer to the directory.    
        val CreateComputer = _CreateComputer() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateConditionalForwarder.html 
        //  Creates a conditional forwarder associated with your AWS directory.    
        val CreateConditionalForwarder = _CreateConditionalForwarder() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateDirectory.html 
        //  Creates a Simple AD directory.    
        val CreateDirectory = _CreateDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateMicrosoftAD.html 
        //  Creates a Microsoft AD in the AWS cloud.    
        val CreateMicrosoftAD = _CreateMicrosoftAD() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateSnapshot.html 
        //  Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.    
        val CreateSnapshot = _CreateSnapshot() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_CreateTrust.html 
        //  AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships.    
        val CreateTrust = _CreateTrust() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DeleteConditionalForwarder.html 
        //  Deletes a conditional forwarder that has been set up for your AWS directory.    
        val DeleteConditionalForwarder = _DeleteConditionalForwarder() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DeleteDirectory.html 
        //  Deletes an AWS Directory Service directory.    
        val DeleteDirectory = _DeleteDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DeleteSnapshot.html 
        //  Deletes a directory snapshot.    
        val DeleteSnapshot = _DeleteSnapshot() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DeleteTrust.html 
        //  Deletes an existing trust relationship between your Microsoft AD in the AWS cloud and an external domain.    
        val DeleteTrust = _DeleteTrust() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DeregisterEventTopic.html 
        //  Removes the specified directory as a publisher to the specified SNS topic.    
        val DeregisterEventTopic = _DeregisterEventTopic() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DescribeConditionalForwarders.html 
        //  Obtains information about the conditional forwarders for this account.    
        val DescribeConditionalForwarders = _DescribeConditionalForwarders() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DescribeDirectories.html 
        //  Obtains information about the directories that belong to this account.    
        val DescribeDirectories = _DescribeDirectories() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DescribeEventTopics.html 
        //  Obtains information about which SNS topics receive status messages from the specified directory.    
        val DescribeEventTopics = _DescribeEventTopics() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DescribeSnapshots.html 
        //  Obtains information about the directory snapshots that belong to this account.    
        val DescribeSnapshots = _DescribeSnapshots() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DescribeTrusts.html 
        //  Obtains information about the trust relationships for this account.    
        val DescribeTrusts = _DescribeTrusts() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DisableRadius.html 
        //  Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector directory.    
        val DisableRadius = _DisableRadius() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_DisableSso.html 
        //  Disables single-sign on for a directory.    
        val DisableSso = _DisableSso() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_EnableRadius.html 
        //  Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector directory.    
        val EnableRadius = _EnableRadius() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_EnableSso.html 
        //  Enables single-sign on for a directory.    
        val EnableSso = _EnableSso() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_GetDirectoryLimits.html 
        //  Obtains directory limit information for the current region.    
        val GetDirectoryLimits = _GetDirectoryLimits() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_GetSnapshotLimits.html 
        //  Obtains the manual snapshot limits for a directory.    
        val GetSnapshotLimits = _GetSnapshotLimits() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_RegisterEventTopic.html 
        //  Associates a directory with an SNS topic.    
        val RegisterEventTopic = _RegisterEventTopic() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_RestoreFromSnapshot.html 
        //  Restores a directory using an existing directory snapshot.    
        val RestoreFromSnapshot = _RestoreFromSnapshot() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_UpdateConditionalForwarder.html 
        //  Updates a conditional forwarder that has been set up for your AWS directory.    
        val UpdateConditionalForwarder = _UpdateConditionalForwarder() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_UpdateRadius.html 
        //  Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector directory.    
        val UpdateRadius = _UpdateRadius() 
        // see http://docs.aws.amazon.com/directoryservice/latest/devguide/API_VerifyTrust.html 
        //  AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.    
        val VerifyTrust = _VerifyTrust()
    }
      class _ConnectDirectory : IamPolicy.Action("ds:ConnectDirectory") {

         }       
 
      class _CreateAlias : IamPolicy.Action("ds:CreateAlias") {

         }       
 
      class _CreateComputer : IamPolicy.Action("ds:CreateComputer") {

         }       
 
      class _CreateConditionalForwarder : IamPolicy.Action("ds:CreateConditionalForwarder") {

         }       
 
      class _CreateDirectory : IamPolicy.Action("ds:CreateDirectory") {

         }       
 
      class _CreateMicrosoftAD : IamPolicy.Action("ds:CreateMicrosoftAD") {

         }       
 
      class _CreateSnapshot : IamPolicy.Action("ds:CreateSnapshot") {

         }       
 
      class _CreateTrust : IamPolicy.Action("ds:CreateTrust") {

         }       
 
      class _DeleteConditionalForwarder : IamPolicy.Action("ds:DeleteConditionalForwarder") {

         }       
 
      class _DeleteDirectory : IamPolicy.Action("ds:DeleteDirectory") {

         }       
 
      class _DeleteSnapshot : IamPolicy.Action("ds:DeleteSnapshot") {

         }       
 
      class _DeleteTrust : IamPolicy.Action("ds:DeleteTrust") {

         }       
 
      class _DeregisterEventTopic : IamPolicy.Action("ds:DeregisterEventTopic") {

         }       
 
      class _DescribeConditionalForwarders : IamPolicy.Action("ds:DescribeConditionalForwarders") {

         }       
 
      class _DescribeDirectories : IamPolicy.Action("ds:DescribeDirectories") {

         }       
 
      class _DescribeEventTopics : IamPolicy.Action("ds:DescribeEventTopics") {

         }       
 
      class _DescribeSnapshots : IamPolicy.Action("ds:DescribeSnapshots") {

         }       
 
      class _DescribeTrusts : IamPolicy.Action("ds:DescribeTrusts") {

         }       
 
      class _DisableRadius : IamPolicy.Action("ds:DisableRadius") {

         }       
 
      class _DisableSso : IamPolicy.Action("ds:DisableSso") {

         }       
 
      class _EnableRadius : IamPolicy.Action("ds:EnableRadius") {

         }       
 
      class _EnableSso : IamPolicy.Action("ds:EnableSso") {

         }       
 
      class _GetDirectoryLimits : IamPolicy.Action("ds:GetDirectoryLimits") {

         }       
 
      class _GetSnapshotLimits : IamPolicy.Action("ds:GetSnapshotLimits") {

         }       
 
      class _RegisterEventTopic : IamPolicy.Action("ds:RegisterEventTopic") {

         }       
 
      class _RestoreFromSnapshot : IamPolicy.Action("ds:RestoreFromSnapshot") {

         }       
 
      class _UpdateConditionalForwarder : IamPolicy.Action("ds:UpdateConditionalForwarder") {

         }       
 
      class _UpdateRadius : IamPolicy.Action("ds:UpdateRadius") {

         }       
 
      class _VerifyTrust : IamPolicy.Action("ds:VerifyTrust") {

         }       


}        
