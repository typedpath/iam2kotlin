
package com.typedpath.iam2kotlin.resources.sts

import com.typedpath.iam2kotlin.IamPolicy

class StsAction() {

    companion object { 
        val All = IamPolicy.Action("sts:*")    
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html 
        //  Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) that you can use to access AWS resources that you might not normally have access to.    
        val AssumeRole = _AssumeRole() 
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithSAML.html 
        //  Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication response.    
        val AssumeRoleWithSAML = _AssumeRoleWithSAML() 
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithWebIdentity.html 
        //  Returns a set of temporary security credentials for users who have been authenticated in a mobile or web application with a web identity provider, such as Amazon Cognito, Login with Amazon, Facebook, Google, or any OpenID Connect-compatible identity provider.    
        val AssumeRoleWithWebIdentity = _AssumeRoleWithWebIdentity() 
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_DecodeAuthorizationMessage.html 
        //  Decodes additional information about the authorization status of a request from an encoded message returned in response to an AWS request.    
        val DecodeAuthorizationMessage = _DecodeAuthorizationMessage() 
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_GetFederationToken.html 
        //  Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) for a federated user.    
        val GetFederationToken = _GetFederationToken() 
        // see http://docs.aws.amazon.com/STS/latest/APIReference/API_GetSessionToken.html 
        //  Returns a set of temporary credentials for an AWS account or IAM user.    
        val GetSessionToken = _GetSessionToken()
    }
      class _AssumeRole : IamPolicy.Action("sts:AssumeRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _AssumeRoleWithSAML : IamPolicy.Action("sts:AssumeRoleWithSAML") {

         }       
 
      class _AssumeRoleWithWebIdentity : IamPolicy.Action("sts:AssumeRoleWithWebIdentity") {

         }       
 
      class _DecodeAuthorizationMessage : IamPolicy.Action("sts:DecodeAuthorizationMessage") {

         }       
 
      class _GetFederationToken : IamPolicy.Action("sts:GetFederationToken") {
             //arn:aws:sts::$account:federated-user/$user-name"
            fun federateduser_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:sts::$account:federated-user/$username")
         }       
 
      class _GetSessionToken : IamPolicy.Action("sts:GetSessionToken") {
             //arn:aws:iam::$account:mfa/$virtual-device-name"
            fun byAccountVirtualdevicename(account: String, virtualdevicename: String) = IamPolicy.Resource("arn:aws:iam::$account:mfa/$virtualdevicename")
         }       


}        
