
package com.typedpath.iam2kotlin.resources.cognito_identity

import com.typedpath.iam2kotlin.IamPolicy

class Cognito_identityAction() {

    companion object { 
        val All = IamPolicy.Action("cognito_identity:*")    
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_CreateIdentityPool.html 
        //  Creates a new identity pool.    
        val CreateIdentityPool = _CreateIdentityPool() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_DeleteIdentityPool.html 
        //  Deletes a user pool.    
        val DeleteIdentityPool = _DeleteIdentityPool() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_DeleteIdentities.html 
        //  Deletes identities from an identity pool.    
        val DeleteIdentities = _DeleteIdentities() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_DescribeIdentity.html 
        //  Returns metadata related to the given identity, including when the identity was created and any associated linked logins.    
        val DescribeIdentity = _DescribeIdentity() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_DescribeIdentityPool.html 
        //  Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users.    
        val DescribeIdentityPool = _DescribeIdentityPool() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetIdentityPoolRoles.html 
        //  Gets the roles for an identity pool.    
        val GetIdentityPoolRoles = _GetIdentityPoolRoles() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetOpenIdTokenForDeveloperIdentity.html 
        //  Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process.    
        val GetOpenIdTokenForDeveloperIdentity = _GetOpenIdTokenForDeveloperIdentity() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_ListIdentities.html 
        //  Lists the identities in a pool.    
        val ListIdentities = _ListIdentities() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_ListIdentityPools.html 
        //  Lists all of the Cognito identity pools registered for your account.    
        val ListIdentityPools = _ListIdentityPools() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_LookupDeveloperIdentity.html 
        //  Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifiers associated with an IdentityId for an existing identity.    
        val LookupDeveloperIdentity = _LookupDeveloperIdentity() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_MergeDeveloperIdentities.html 
        //  Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider.    
        val MergeDeveloperIdentities = _MergeDeveloperIdentities() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_SetIdentityPoolRoles.html 
        //  Sets the roles for an identity pool.    
        val SetIdentityPoolRoles = _SetIdentityPoolRoles() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_UnlinkDeveloperIdentity.html 
        //  Unlinks a DeveloperUserIdentifier from an existing identity.    
        val UnlinkDeveloperIdentity = _UnlinkDeveloperIdentity() 
        // see http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_UpdateIdentityPool.html 
        //  Updates a user pool.    
        val UpdateIdentityPool = _UpdateIdentityPool()
    }
      class _CreateIdentityPool : IamPolicy.Action("cognito-identity:CreateIdentityPool") {

         }       
 
      class _DeleteIdentityPool : IamPolicy.Action("cognito-identity:DeleteIdentityPool") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _DeleteIdentities : IamPolicy.Action("cognito-identity:DeleteIdentities") {

         }       
 
      class _DescribeIdentity : IamPolicy.Action("cognito-identity:DescribeIdentity") {

         }       
 
      class _DescribeIdentityPool : IamPolicy.Action("cognito-identity:DescribeIdentityPool") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _GetIdentityPoolRoles : IamPolicy.Action("cognito-identity:GetIdentityPoolRoles") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _GetOpenIdTokenForDeveloperIdentity : IamPolicy.Action("cognito-identity:GetOpenIdTokenForDeveloperIdentity") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _ListIdentities : IamPolicy.Action("cognito-identity:ListIdentities") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _ListIdentityPools : IamPolicy.Action("cognito-identity:ListIdentityPools") {

         }       
 
      class _LookupDeveloperIdentity : IamPolicy.Action("cognito-identity:LookupDeveloperIdentity") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _MergeDeveloperIdentities : IamPolicy.Action("cognito-identity:MergeDeveloperIdentities") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _SetIdentityPoolRoles : IamPolicy.Action("cognito-identity:SetIdentityPoolRoles") {

         }       
 
      class _UnlinkDeveloperIdentity : IamPolicy.Action("cognito-identity:UnlinkDeveloperIdentity") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       
 
      class _UpdateIdentityPool : IamPolicy.Action("cognito-identity:UpdateIdentityPool") {
             //arn:aws:cognito-sync:$region:$account:identitypool/$identity-pool-id"
            fun byRegionAccountIdentitypoolid(region: String, account: String, identitypoolid: String) = IamPolicy.Resource("arn:aws:cognito-sync:$region:$account:identitypool/$identitypoolid")
         }       


}        
