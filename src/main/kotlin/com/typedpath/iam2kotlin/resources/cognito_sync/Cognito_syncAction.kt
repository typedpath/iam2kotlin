
package com.typedpath.iam2kotlin.resources.cognito_sync

import com.typedpath.iam2kotlin.IamPolicy

class Cognito_syncAction() {

    companion object { 
        val All = IamPolicy.Action("cognito_sync:*")    
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_BulkPublish.html 
        //  Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream.    
        val BulkPublish = _BulkPublish() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_DeleteDataset.html 
        //  Deletes the specific dataset.    
        val DeleteDataset = _DeleteDataset() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_DescribeDataset.html 
        //  Gets meta data about a dataset by identity and dataset name.    
        val DescribeDataset = _DescribeDataset() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_DescribeIdentityUsage.html 
        //  Gets usage information for an identity, including number of datasets and data usage.    
        val DescribeIdentityUsage = _DescribeIdentityUsage() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_DescribeIdentityPoolUsage.html 
        //  Gets usage details (for example, data storage) about a particular identity pool.    
        val DescribeIdentityPoolUsage = _DescribeIdentityPoolUsage() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_GetBulkPublishDetails.html 
        //  Get the status of the last BulkPublish operation for an identity pool.    
        val GetBulkPublishDetails = _GetBulkPublishDetails() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_GetCognitoEvents.html 
        //  Gets the events and the corresponding Lambda functions associated with an identity pool.    
        val GetCognitoEvents = _GetCognitoEvents() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_GetIdentityPoolConfiguration.html 
        //  Gets the configuration settings of an identity pool.    
        val GetIdentityPoolConfiguration = _GetIdentityPoolConfiguration() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_ListDatasets.html 
        //  Lists datasets for an identity.    
        val ListDatasets = _ListDatasets() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_ListIdentityPoolUsage.html 
        //  Gets a list of identity pools registered with Cognito.    
        val ListIdentityPoolUsage = _ListIdentityPoolUsage() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_ListRecords.html 
        //  Gets paginated records, optionally changed after a particular sync count for a dataset and identity.    
        val ListRecords = _ListRecords() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_RegisterDevice.html 
        //  Registers a device to receive push sync notifications.    
        val RegisterDevice = _RegisterDevice() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_SetCognitoEvents.html 
        //  Sets the AWS Lambda function for a given event type for an identity pool.    
        val SetCognitoEvents = _SetCognitoEvents() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_SetIdentityPoolConfiguration.html 
        //  Sets the necessary configuration for push sync.    
        val SetIdentityPoolConfiguration = _SetIdentityPoolConfiguration() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_SubscribeToDataset.html 
        //  Subscribes to receive notifications when a dataset is modified by another device.    
        val SubscribeToDataset = _SubscribeToDataset() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_UpdateRecords.html 
        //  Posts updates to records and adds and deletes records for a dataset and user.    
        val UpdateRecords = _UpdateRecords() 
        // see http://docs.aws.amazon.com/cognitosync/latest/APIReference/API_UnsubscribeFromDataset.html 
        //  Unsubscribes from receiving notifications when a dataset is modified by another device.    
        val UnsubscribeFromDataset = _UnsubscribeFromDataset()
    }
      class _BulkPublish : IamPolicy.Action("cognito-sync:BulkPublish") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _DeleteDataset : IamPolicy.Action("cognito-sync:DeleteDataset") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _DescribeDataset : IamPolicy.Action("cognito-sync:DescribeDataset") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _DescribeIdentityUsage : IamPolicy.Action("cognito-sync:DescribeIdentityUsage") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id"
            fun byRegionAccountIdentitypoolidIdentityid(region: String, account: String, identitypoolid: String, identityid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid")
         }       
 
      class _DescribeIdentityPoolUsage : IamPolicy.Action("cognito-sync:DescribeIdentityPoolUsage") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _GetBulkPublishDetails : IamPolicy.Action("cognito-sync:GetBulkPublishDetails") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _GetCognitoEvents : IamPolicy.Action("cognito-sync:GetCognitoEvents") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _GetIdentityPoolConfiguration : IamPolicy.Action("cognito-sync:GetIdentityPoolConfiguration") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _ListDatasets : IamPolicy.Action("cognito-sync:ListDatasets") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _ListIdentityPoolUsage : IamPolicy.Action("cognito-sync:ListIdentityPoolUsage") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _ListRecords : IamPolicy.Action("cognito-sync:ListRecords") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _RegisterDevice : IamPolicy.Action("cognito-sync:RegisterDevice") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id"
            fun byRegionAccountIdentitypoolidIdentityid(region: String, account: String, identitypoolid: String, identityid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid")
         }       
 
      class _SetCognitoEvents : IamPolicy.Action("cognito-sync:SetCognitoEvents") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _SetIdentityPoolConfiguration : IamPolicy.Action("cognito-sync:SetIdentityPoolConfiguration") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _SubscribeToDataset : IamPolicy.Action("cognito-sync:SubscribeToDataset") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _UpdateRecords : IamPolicy.Action("cognito-sync:UpdateRecords") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       
 
      class _UnsubscribeFromDataset : IamPolicy.Action("cognito-sync:UnsubscribeFromDataset") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id/identity/$identity-id/dataset/$dataset-name"
            fun byRegionAccountIdentitypoolidIdentityidDatasetname(region: String, account: String, identitypoolid: String, identityid: String, datasetname: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid/identity/$identityid/dataset/$datasetname")
         }       


}        
