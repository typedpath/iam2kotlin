
package com.typedpath.iam2kotlin.resources.glacier

import com.typedpath.iam2kotlin.IamPolicy

class GlacierAction() {

    companion object { 
        val All = IamPolicy.Action("glacier:*")    
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-AbortVaultLock.html 
        //  This operation aborts the vault locking process if the vault lock is not in the Locked state.    
        val AbortVaultLock = _AbortVaultLock() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-AddTagsToVault.html 
        //  This operation adds the specified tags to a vault.    
        val AddTagsToVault = _AddTagsToVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html 
        //  This multipart upload operation aborts a multipart upload identified by the upload ID.    
        val AbortMultipartUpload = _AbortMultipartUpload() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-complete-upload.html 
        //  You call this multipart upload operation to inform Amazon Glacier that all the archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts.    
        val CompleteMultipartUpload = _CompleteMultipartUpload() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-CompleteVaultLock.html 
        //  This operation completes the vault locking process by transitioning the vault lock from the InProgress state to the Locked state, which causes the vault lock policy to become unchangeable.    
        val CompleteVaultLock = _CompleteVaultLock() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-put.html 
        //  This operation creates a new vault with the specified name.    
        val CreateVault = _CreateVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html 
        //  This operation deletes an archive from a vault.    
        val DeleteArchive = _DeleteArchive() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-delete.html 
        //  This operation deletes a vault.    
        val DeleteVault = _DeleteVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-DeleteVaultAccessPolicy.html 
        //  This operation deletes the access policy associated with the specified vault.    
        val DeleteVaultAccessPolicy = _DeleteVaultAccessPolicy() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-delete.html 
        //  This operation deletes the notification configuration set for a vault Set Vault Notification Configuration (PUT notification-configuration).    
        val DeleteVaultNotifications = _DeleteVaultNotifications() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-describe-job-get.html 
        //  This operation returns information about a job you previously initiated, including the job initiation date, the user who initiated the job, the job status code/message and the Amazon Simple Notification Service (Amazon SNS) topic to notify after Amazon Glacier completes the job.    
        val DescribeJob = _DescribeJob() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-get.html 
        //  This operation returns information about a vault, including the vault Amazon Resource Name (ARN), the date the vault was created, the number of archives contained within the vault, and the total size of all the archives in the vault.    
        val DescribeVault = _DescribeVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-GetDataRetrievalPolicy.html 
        //  This operation returns the current data retrieval policy for the account and region specified in the GET request.    
        val GetDataRetrievalPolicy = _GetDataRetrievalPolicy() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-job-output-get.html 
        //  This operation downloads the output of the job you initiated using Initiate Job (POST jobs).    
        val GetJobOutput = _GetJobOutput() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-GetVaultAccessPolicy.html 
        //  This operation retrieves the access-policy subresource set on the vault—for more information on setting this subresource, see Set Vault Access Policy (PUT access-policy).    
        val GetVaultAccessPolicy = _GetVaultAccessPolicy() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-GetVaultLock.html 
        //  .    
        val GetVaultLock = _GetVaultLock() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-get.html 
        //  This operation retrieves the notification-configuration subresource set on the vault (see Set Vault Notification Configuration (PUT notification-configuration).    
        val GetVaultNotifications = _GetVaultNotifications() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html 
        //  This operation initiates a job of the specified type, which can be an archive retrieval or vault inventory retrieval.    
        val InitiateJob = _InitiateJob() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-initiate-upload.html 
        //  This operation initiates a multipart upload (see Uploading Large Archives in Parts (Multipart Upload)).    
        val InitiateMultipartUpload = _InitiateMultipartUpload() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-InitiateVaultLock.html 
        //  .    
        val InitiateVaultLock = _InitiateVaultLock() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-jobs-get.html 
        //  This operation lists jobs for a vault including jobs that are in-progress and jobs that have recently finished.    
        val ListJobs = _ListJobs() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-uploads.html 
        //  This multipart upload operation lists in-progress multipart uploads for the specified vault.    
        val ListMultipartUploads = _ListMultipartUploads() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-parts.html 
        //  This multipart upload operation lists the parts of an archive that have been uploaded in a specific multipart upload identified by an upload ID.    
        val ListParts = _ListParts() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-ListTagsForVault.html 
        //  This operation lists all the tags attached to a vault.    
        val ListTagsForVault = _ListTagsForVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vaults-get.html 
        //  This operation lists all vaults owned by the calling user’s account.    
        val ListVaults = _ListVaults() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-RemoveTagsFromVault.html 
        //  This operation removes one or more tags from the set of tags attached to a vault.    
        val RemoveTagsFromVault = _RemoveTagsFromVault() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-SetDataRetrievalPolicy.html 
        //  This operation sets and then enacts a data retrieval policy in the region specified in the PUT request.    
        val SetDataRetrievalPolicy = _SetDataRetrievalPolicy() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-SetVaultAccessPolicy.html 
        //  This operation configures an access policy for a vault and will overwrite an existing policy.    
        val SetVaultAccessPolicy = _SetVaultAccessPolicy() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-put.html 
        //  Retrieving an archive and a vault inventory are asynchronous operations in Amazon Glacier for which you must first initiate a job and wait for the job to complete before you can download the job output.    
        val SetVaultNotifications = _SetVaultNotifications() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html 
        //  This operation adds an archive to a vault.    
        val UploadArchive = _UploadArchive() 
        // see http://docs.aws.amazon.com/amazonglacier/latest/dev/api-upload-part.html 
        //  This multipart upload operation uploads a part of an archive.    
        val UploadMultipartPart = _UploadMultipartPart()
    }
      class _AbortVaultLock : IamPolicy.Action("glacier:AbortVaultLock") {

         }       
 
      class _AddTagsToVault : IamPolicy.Action("glacier:AddTagsToVault") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _AbortMultipartUpload : IamPolicy.Action("glacier:AbortMultipartUpload") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _CompleteMultipartUpload : IamPolicy.Action("glacier:CompleteMultipartUpload") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _CompleteVaultLock : IamPolicy.Action("glacier:CompleteVaultLock") {

         }       
 
      class _CreateVault : IamPolicy.Action("glacier:CreateVault") {

         }       
 
      class _DeleteArchive : IamPolicy.Action("glacier:DeleteArchive") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _DeleteVault : IamPolicy.Action("glacier:DeleteVault") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _DeleteVaultAccessPolicy : IamPolicy.Action("glacier:DeleteVaultAccessPolicy") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _DeleteVaultNotifications : IamPolicy.Action("glacier:DeleteVaultNotifications") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _DescribeJob : IamPolicy.Action("glacier:DescribeJob") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _DescribeVault : IamPolicy.Action("glacier:DescribeVault") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _GetDataRetrievalPolicy : IamPolicy.Action("glacier:GetDataRetrievalPolicy") {
             //arn:aws:glacier:$region:$account:policies/retrieval-limit-policy"
            fun policies_retrievallimitpolicy_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:policies/retrieval-limit-policy")
         }       
 
      class _GetJobOutput : IamPolicy.Action("glacier:GetJobOutput") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _GetVaultAccessPolicy : IamPolicy.Action("glacier:GetVaultAccessPolicy") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _GetVaultLock : IamPolicy.Action("glacier:GetVaultLock") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _GetVaultNotifications : IamPolicy.Action("glacier:GetVaultNotifications") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _InitiateJob : IamPolicy.Action("glacier:InitiateJob") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _InitiateMultipartUpload : IamPolicy.Action("glacier:InitiateMultipartUpload") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _InitiateVaultLock : IamPolicy.Action("glacier:InitiateVaultLock") {

         }       
 
      class _ListJobs : IamPolicy.Action("glacier:ListJobs") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _ListMultipartUploads : IamPolicy.Action("glacier:ListMultipartUploads") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _ListParts : IamPolicy.Action("glacier:ListParts") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _ListTagsForVault : IamPolicy.Action("glacier:ListTagsForVault") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _ListVaults : IamPolicy.Action("glacier:ListVaults") {

         }       
 
      class _RemoveTagsFromVault : IamPolicy.Action("glacier:RemoveTagsFromVault") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _SetDataRetrievalPolicy : IamPolicy.Action("glacier:SetDataRetrievalPolicy") {
             //arn:aws:glacier:$region:$account:policies/retrieval-limit-policy"
            fun policies_retrievallimitpolicy_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:policies/retrieval-limit-policy")
         }       
 
      class _SetVaultAccessPolicy : IamPolicy.Action("glacier:SetVaultAccessPolicy") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _SetVaultNotifications : IamPolicy.Action("glacier:SetVaultNotifications") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _UploadArchive : IamPolicy.Action("glacier:UploadArchive") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       
 
      class _UploadMultipartPart : IamPolicy.Action("glacier:UploadMultipartPart") {
             //arn:aws:glacier:$region:$account:vaults/$vault-name"
            fun vaults_byRegionAccountVaultname(region: String, account: String, vaultname: String) = IamPolicy.Resource("arn:aws:glacier:$region:$account:vaults/$vaultname")
         }       


}        
