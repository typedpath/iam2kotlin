
package com.typedpath.iam2kotlin.resources.kms

import com.typedpath.iam2kotlin.IamPolicy

class KmsAction() {

    companion object { 
        val All = IamPolicy.Action("kms:*")    
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_CancelKeyDeletion.html 
        //  Cancels the deletion of a customer master key (CMK).    
        val CancelKeyDeletion = _CancelKeyDeletion() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateAlias.html 
        //  Creates a display name for a customer master key.    
        val CreateAlias = _CreateAlias() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html 
        //  Adds a grant to a key to specify who can use the key and under what conditions.    
        val CreateGrant = _CreateGrant() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_CreateKey.html 
        //  Creates a customer master key (CMK).    
        val CreateKey = _CreateKey() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_Decrypt.html 
        //  Decrypts ciphertext.    
        val Decrypt = _Decrypt() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_DeleteAlias.html 
        //  Deletes the specified alias.    
        val DeleteAlias = _DeleteAlias() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html 
        //  Provides detailed information about the specified customer master key.    
        val DescribeKey = _DescribeKey() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKey.html 
        //  Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations.    
        val DisableKey = _DisableKey() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_DisableKeyRotation.html 
        //  Disables rotation of the specified key.    
        val DisableKeyRotation = _DisableKeyRotation() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKey.html 
        //  Marks a key as enabled, thereby permitting its use.    
        val EnableKey = _EnableKey() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_EnableKeyRotation.html 
        //  Enables rotation of the specified customer master key.    
        val EnableKeyRotation = _EnableKeyRotation() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html 
        //  Encrypts plaintext into ciphertext by using a customer master key.    
        val Encrypt = _Encrypt() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateRandom.html 
        //  Generates an unpredictable byte string.    
        val GenerateRandom = _GenerateRandom() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateDataKey.html 
        //  Generates a data key that you can use in your application to locally encrypt data.    
        val GenerateDataKey = _GenerateDataKey() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateDataKeyWithoutPlaintext.html 
        //  Returns a data key encrypted by a customer master key without the plaintext copy of that key.    
        val GenerateDataKeyWithoutPlaintext = _GenerateDataKeyWithoutPlaintext() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_GetKeyPolicy.html 
        //  Retrieves a policy attached to the specified key.    
        val GetKeyPolicy = _GetKeyPolicy() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_GetKeyRotationStatus.html 
        //  Retrieves a Boolean value that indicates whether key rotation is enabled for the specified key.    
        val GetKeyRotationStatus = _GetKeyRotationStatus() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ListAliases.html 
        //  Lists all of the key aliases in the account.    
        val ListAliases = _ListAliases() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ListGrants.html 
        //  List the grants for a specified key.    
        val ListGrants = _ListGrants() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ListKeyPolicies.html 
        //  Retrieves a list of policies attached to a key.    
        val ListKeyPolicies = _ListKeyPolicies() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ListKeys.html 
        //  Lists the customer master keys.    
        val ListKeys = _ListKeys() 
        // see https://docs.aws.amazon.com/kms/latest/APIReference/API_ListResourceTags.html 
        //  Returns a list of all tags for the specified customer master key (CMK).    
        val ListResourceTags = _ListResourceTags() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ListRetirableGrants.html 
        //  Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified.    
        val ListRetirableGrants = _ListRetirableGrants() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html 
        //  Attaches a key policy to the specified customer master key (CMK).    
        val PutKeyPolicy = _PutKeyPolicy() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ReEncrypt.html 
        //  Encrypts data on the server side with a new customer master key without exposing the plaintext of the data on the client side.    
        val ReEncryptFrom = _ReEncryptFrom() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ReEncrypt.html 
        //  Encrypts data on the server side with a new customer master key without exposing the plaintext of the data on the client side.    
        val ReEncryptTo = _ReEncryptTo() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html 
        //  Retires a grant.    
        val RetireGrant = _RetireGrant() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html 
        //  Revokes a grant.    
        val RevokeGrant = _RevokeGrant() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html 
        //  Schedules the deletion of a customer master key (CMK).    
        val ScheduleKeyDeletion = _ScheduleKeyDeletion() 
        // see https://docs.aws.amazon.com/kms/latest/APIReference/API_TagResource.html 
        //  Adds or overwrites one or more tags for the specified customer master key (CMK).    
        val TagResource = _TagResource() 
        // see https://docs.aws.amazon.com/kms/latest/APIReference/API_UntagResource.html 
        //  Removes the specified tag or tags from the specified customer master key (CMK).    
        val UntagResource = _UntagResource() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_UpdateAlias.html 
        //  Updates an alias to map it to a different key.    
        val UpdateAlias = _UpdateAlias() 
        // see http://docs.aws.amazon.com/kms/latest/APIReference/API_UpdateKeyDescription.html 
        //  Updates the description of a key.    
        val UpdateKeyDescription = _UpdateKeyDescription()
    }
      class _CancelKeyDeletion : IamPolicy.Action("kms:CancelKeyDeletion") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _CreateAlias : IamPolicy.Action("kms:CreateAlias") {
             //arn:aws:kms:$region:$account:alias/$alias-name"
            fun alias_byRegionAccountAliasname(region: String, account: String, aliasname: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:alias/$aliasname")
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _CreateGrant : IamPolicy.Action("kms:CreateGrant") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _CreateKey : IamPolicy.Action("kms:CreateKey") {

         }       
 
      class _Decrypt : IamPolicy.Action("kms:Decrypt") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _DeleteAlias : IamPolicy.Action("kms:DeleteAlias") {
             //arn:aws:kms:$region:$account:alias/$alias-name"
            fun alias_byRegionAccountAliasname(region: String, account: String, aliasname: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:alias/$aliasname")
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _DescribeKey : IamPolicy.Action("kms:DescribeKey") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _DisableKey : IamPolicy.Action("kms:DisableKey") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _DisableKeyRotation : IamPolicy.Action("kms:DisableKeyRotation") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _EnableKey : IamPolicy.Action("kms:EnableKey") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _EnableKeyRotation : IamPolicy.Action("kms:EnableKeyRotation") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _Encrypt : IamPolicy.Action("kms:Encrypt") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _GenerateRandom : IamPolicy.Action("kms:GenerateRandom") {

         }       
 
      class _GenerateDataKey : IamPolicy.Action("kms:GenerateDataKey") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _GenerateDataKeyWithoutPlaintext : IamPolicy.Action("kms:GenerateDataKeyWithoutPlaintext") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _GetKeyPolicy : IamPolicy.Action("kms:GetKeyPolicy") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _GetKeyRotationStatus : IamPolicy.Action("kms:GetKeyRotationStatus") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ListAliases : IamPolicy.Action("kms:ListAliases") {

         }       
 
      class _ListGrants : IamPolicy.Action("kms:ListGrants") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ListKeyPolicies : IamPolicy.Action("kms:ListKeyPolicies") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ListKeys : IamPolicy.Action("kms:ListKeys") {

         }       
 
      class _ListResourceTags : IamPolicy.Action("kms:ListResourceTags") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ListRetirableGrants : IamPolicy.Action("kms:ListRetirableGrants") {

         }       
 
      class _PutKeyPolicy : IamPolicy.Action("kms:PutKeyPolicy") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ReEncryptFrom : IamPolicy.Action("kms:ReEncryptFrom") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ReEncryptTo : IamPolicy.Action("kms:ReEncryptTo") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _RetireGrant : IamPolicy.Action("kms:RetireGrant") {

         }       
 
      class _RevokeGrant : IamPolicy.Action("kms:RevokeGrant") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _ScheduleKeyDeletion : IamPolicy.Action("kms:ScheduleKeyDeletion") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _TagResource : IamPolicy.Action("kms:TagResource") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _UntagResource : IamPolicy.Action("kms:UntagResource") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _UpdateAlias : IamPolicy.Action("kms:UpdateAlias") {
             //arn:aws:kms:$region:$account:alias/$alias-name"
            fun alias_byRegionAccountAliasname(region: String, account: String, aliasname: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:alias/$aliasname")
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       
 
      class _UpdateKeyDescription : IamPolicy.Action("kms:UpdateKeyDescription") {
             //arn:aws:kms:$region:$account:key/$key-id"
            fun key_byRegionAccountKeyid(region: String, account: String, keyid: String) = IamPolicy.Resource("arn:aws:kms:$region:$account:key/$keyid")
         }       


}        
