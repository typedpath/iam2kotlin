
package com.typedpath.iam2kotlin.resources.secretsmanager

import com.typedpath.iam2kotlin.IamPolicy

class SecretsmanagerAction() {

    companion object { 
        val All = IamPolicy.Action("secretsmanager:*")    
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CancelRotateSecret.html 
        //  Disables automatic scheduled rotation and cancels the rotation of a secret if one is currently in progress    
        val CancelRotateSecret = _CancelRotateSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html 
        //  Creates a new secret.    
        val CreateSecret = _CreateSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_DeleteResourcePolicy.html 
        //  Deletes the resource-based permission policy that's attached to the secret.    
        val DeleteResourcePolicy = _DeleteResourcePolicy() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_DeleteSecret.html 
        //  Deletes an entire secret and all of its versions.    
        val DeleteSecret = _DeleteSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_DescribeSecret.html 
        //  Retrieves the details of a secret. It does not include the encrypted fields.    
        val DescribeSecret = _DescribeSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_GetRandomPassword.html 
        //  Generates a random password of the specified complexity.    
        val GetRandomPassword = _GetRandomPassword() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_GetResourcePolicy.html 
        //  Retrieves the JSON text of the resource-based policy document that's attached to the specified secret.    
        val GetResourcePolicy = _GetResourcePolicy() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_GetSecretValue.html 
        //  Retrieves the contents of the encrypted fields from the specified version of a secret.    
        val GetSecretValue = _GetSecretValue() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_ListSecrets.html 
        //  Lists all of the secrets that are stored by Secrets Manager in the AWS account.    
        val ListSecrets = _ListSecrets() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_ListSecretVersionIds.html 
        //  Lists all of the versions attached to the specified secret.    
        val ListSecretVersionIds = _ListSecretVersionIds() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_PutResourcePolicy.html 
        //  Attaches the contents of the specified resource-based permission policy to a secret.    
        val PutResourcePolicy = _PutResourcePolicy() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_PutSecretValue.html 
        //  Stores a new encrypted secret value in the specified secret.    
        val PutSecretValue = _PutSecretValue() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_RestoreSecret.html 
        //  Cancels the scheduled deletion of a secret.    
        val RestoreSecret = _RestoreSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_RotateSecret.html 
        //  Configures and starts the asynchronous process of rotating this secret.    
        val RotateSecret = _RotateSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_TagResource.html 
        //  Attaches one or more tags to the specified secret.    
        val TagResource = _TagResource() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_UntagResource.html 
        //  Removes one or more tags from the specified secret.    
        val UntagResource = _UntagResource() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_UpdateSecret.html 
        //  Modifies many of the details of the specified secret    
        val UpdateSecret = _UpdateSecret() 
        // see http://docs.aws.amazon.com/secretsmanager/latest/apireference/API_UpdateSecretVersionStage.html 
        //  Modifies the staging labels attached to a version of a secret.    
        val UpdateSecretVersionStage = _UpdateSecretVersionStage()
    }
      class _CancelRotateSecret : IamPolicy.Action("secretsmanager:CancelRotateSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _CreateSecret : IamPolicy.Action("secretsmanager:CreateSecret") {

         }       
 
      class _DeleteResourcePolicy : IamPolicy.Action("secretsmanager:DeleteResourcePolicy") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _DeleteSecret : IamPolicy.Action("secretsmanager:DeleteSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _DescribeSecret : IamPolicy.Action("secretsmanager:DescribeSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _GetRandomPassword : IamPolicy.Action("secretsmanager:GetRandomPassword") {

         }       
 
      class _GetResourcePolicy : IamPolicy.Action("secretsmanager:GetResourcePolicy") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _GetSecretValue : IamPolicy.Action("secretsmanager:GetSecretValue") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _ListSecrets : IamPolicy.Action("secretsmanager:ListSecrets") {

         }       
 
      class _ListSecretVersionIds : IamPolicy.Action("secretsmanager:ListSecretVersionIds") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _PutResourcePolicy : IamPolicy.Action("secretsmanager:PutResourcePolicy") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _PutSecretValue : IamPolicy.Action("secretsmanager:PutSecretValue") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _RestoreSecret : IamPolicy.Action("secretsmanager:RestoreSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _RotateSecret : IamPolicy.Action("secretsmanager:RotateSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _TagResource : IamPolicy.Action("secretsmanager:TagResource") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _UntagResource : IamPolicy.Action("secretsmanager:UntagResource") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _UpdateSecret : IamPolicy.Action("secretsmanager:UpdateSecret") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       
 
      class _UpdateSecretVersionStage : IamPolicy.Action("secretsmanager:UpdateSecretVersionStage") {
             //arn:aws:secretsmanager:$region:$account:secret:$secret_name"
            fun secret_byRegionAccountSecret_name(region: String, account: String, secret_name: String) = IamPolicy.Resource("arn:aws:secretsmanager:$region:$account:secret:$secret_name")
         }       


}        
