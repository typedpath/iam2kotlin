
package com.typedpath.iam2kotlin.resources.iam

import com.typedpath.iam2kotlin.IamPolicy

class IamAction() {

    companion object { 
        val All = IamPolicy.Action("iam:*")    
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AddRoleToInstanceProfile.html 
        //  Adds the specified IAM role to the specified instance profile.    
        val AddRoleToInstanceProfile = _AddRoleToInstanceProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AddUserToGroup.html 
        //  Adds the specified user to the specified group.    
        val AddUserToGroup = _AddUserToGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AddClientIDToOpenIDConnectProvider.html 
        //  Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource.    
        val AddClientIDToOpenIDConnectProvider = _AddClientIDToOpenIDConnectProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachGroupPolicy.html 
        //  Attaches the specified managed policy to the specified IAM group.    
        val AttachGroupPolicy = _AttachGroupPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachRolePolicy.html 
        //  Attaches the specified managed policy to the specified IAM role.    
        val AttachRolePolicy = _AttachRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_AttachUserPolicy.html 
        //  Attaches the specified managed policy to the specified user.    
        val AttachUserPolicy = _AttachUserPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html 
        //  Changes the password of the IAM user who is calling this action.    
        val ChangePassword = _ChangePassword() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateAccessKey.html 
        //  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user.    
        val CreateAccessKey = _CreateAccessKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateAccountAlias.html 
        //  Creates an alias for your AWS account.    
        val CreateAccountAlias = _CreateAccountAlias() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateGroup.html 
        //  Creates a new group.    
        val CreateGroup = _CreateGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateInstanceProfile.html 
        //  Creates a new instance profile.    
        val CreateInstanceProfile = _CreateInstanceProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateLoginProfile.html 
        //  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console.    
        val CreateLoginProfile = _CreateLoginProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html 
        //  Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC).    
        val CreateOpenIDConnectProvider = _CreateOpenIDConnectProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicy.html 
        //  Creates a new managed policy for your AWS account.    
        val CreatePolicy = _CreatePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreatePolicyVersion.html 
        //  Creates a new version of the specified managed policy.    
        val CreatePolicyVersion = _CreatePolicyVersion() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html 
        //  Creates a new role for your AWS account.    
        val CreateRole = _CreateRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateSAMLProvider.html 
        //  Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.    
        val CreateSAMLProvider = _CreateSAMLProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateUser.html 
        //  Creates a new IAM user for your AWS account.    
        val CreateUser = _CreateUser() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateVirtualMFADevice.html 
        //  Creates a new virtual MFA device for the AWS account.    
        val CreateVirtualMFADevice = _CreateVirtualMFADevice() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeactivateMFADevice.html 
        //  Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.    
        val DeactivateMFADevice = _DeactivateMFADevice() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteAccessKey.html 
        //  Deletes the access key pair associated with the specified IAM user.    
        val DeleteAccessKey = _DeleteAccessKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteAccountAlias.html 
        //  Deletes the specified AWS account alias.    
        val DeleteAccountAlias = _DeleteAccountAlias() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteAccountPasswordPolicy.html 
        //  Deletes the password policy for the AWS account.    
        val DeleteAccountPasswordPolicy = _DeleteAccountPasswordPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteGroup.html 
        //  Deletes the specified IAM group.    
        val DeleteGroup = _DeleteGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteGroupPolicy.html 
        //  Deletes the specified inline policy that is embedded in the specified IAM group.    
        val DeleteGroupPolicy = _DeleteGroupPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteInstanceProfile.html 
        //  Deletes the specified instance profile.    
        val DeleteInstanceProfile = _DeleteInstanceProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteLoginProfile.html 
        //  Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.    
        val DeleteLoginProfile = _DeleteLoginProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteOpenIDConnectProvider.html 
        //  Deletes an OpenID Connect identity provider (IdP) resource object in IAM.    
        val DeleteOpenIDConnectProvider = _DeleteOpenIDConnectProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeletePolicy.html 
        //  Deletes the specified managed policy.    
        val DeletePolicy = _DeletePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeletePolicyVersion.html 
        //  Deletes the specified version from the specified managed policy.    
        val DeletePolicyVersion = _DeletePolicyVersion() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteRole.html 
        //  Deletes the specified role.    
        val DeleteRole = _DeleteRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteRolePolicy.html 
        //  Deletes the specified inline policy that is embedded in the specified IAM role.    
        val DeleteRolePolicy = _DeleteRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteSAMLProvider.html 
        //  Deletes a SAML provider resource in IAM.    
        val DeleteSAMLProvider = _DeleteSAMLProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteSSHPublicKey.html 
        //  Deletes the specified SSH public key.    
        val DeleteSSHPublicKey = _DeleteSSHPublicKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteServerCertificate.html 
        //  Deletes the specified server certificate.    
        val DeleteServerCertificate = _DeleteServerCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteSigningCertificate.html 
        //  Deletes a signing certificate associated with the specified IAM user.    
        val DeleteSigningCertificate = _DeleteSigningCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteUser.html 
        //  Deletes the specified IAM user.    
        val DeleteUser = _DeleteUser() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteUserPolicy.html 
        //  Deletes the specified inline policy that is embedded in the specified IAM user.    
        val DeleteUserPolicy = _DeleteUserPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteVirtualMFADevice.html 
        //  Deletes a virtual MFA device.    
        val DeleteVirtualMFADevice = _DeleteVirtualMFADevice() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DetachGroupPolicy.html 
        //  Removes the specified managed policy from the specified IAM group.    
        val DetachGroupPolicy = _DetachGroupPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DetachRolePolicy.html 
        //  Removes the specified managed policy from the specified role.    
        val DetachRolePolicy = _DetachRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DetachUserPolicy.html 
        //  Removes the specified managed policy from the specified user.    
        val DetachUserPolicy = _DetachUserPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_EnableMFADevice.html 
        //  Enables the specified MFA device and associates it with the specified IAM user.    
        val EnableMFADevice = _EnableMFADevice() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GenerateCredentialReport.html 
        //  Generates a credential report for the AWS account.    
        val GenerateCredentialReport = _GenerateCredentialReport() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetAccessKeyLastUsed.html 
        //  Retrieves information about when the specified access key was last used.    
        val GetAccessKeyLastUsed = _GetAccessKeyLastUsed() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetAccountAuthorizationDetails.html 
        //  Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another.    
        val GetAccountAuthorizationDetails = _GetAccountAuthorizationDetails() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetAccountPasswordPolicy.html 
        //  Retrieves the password policy for the AWS account.    
        val GetAccountPasswordPolicy = _GetAccountPasswordPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetAccountSummary.html 
        //  Retrieves information about IAM entity usage and IAM quotas in the AWS account.    
        val GetAccountSummary = _GetAccountSummary() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetContextKeysForCustomPolicy.html 
        //  Gets a list of all of the context keys referenced in the input policies.    
        val GetContextKeysForCustomPolicy = _GetContextKeysForCustomPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetContextKeysForPrincipalPolicy.html 
        //  Gets a list of all of the context keys referenced in all of the IAM policies attached to the specified IAM entity.    
        val GetContextKeysForPrincipalPolicy = _GetContextKeysForPrincipalPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetCredentialReport.html 
        //  Retrieves a credential report for the AWS account.    
        val GetCredentialReport = _GetCredentialReport() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetGroup.html 
        //  Returns a list of IAM users that are in the specified IAM group.    
        val GetGroup = _GetGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetGroupPolicy.html 
        //  Retrieves the specified inline policy document that is embedded in the specified IAM group.    
        val GetGroupPolicy = _GetGroupPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetInstanceProfile.html 
        //  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role.    
        val GetInstanceProfile = _GetInstanceProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetLoginProfile.html 
        //  Retrieves the user name and password-creation date for the specified IAM user.    
        val GetLoginProfile = _GetLoginProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetOpenIDConnectProvider.html 
        //  Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.    
        val GetOpenIDConnectProvider = _GetOpenIDConnectProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetPolicy.html 
        //  Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached.    
        val GetPolicy = _GetPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetPolicyVersion.html 
        //  Retrieves information about the specified version of the specified managed policy, including the policy document.    
        val GetPolicyVersion = _GetPolicyVersion() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetRole.html 
        //  Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role.    
        val GetRole = _GetRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetRolePolicy.html 
        //  Retrieves the specified inline policy document that is embedded with the specified IAM role.    
        val GetRolePolicy = _GetRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetSAMLProvider.html 
        //  Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.    
        val GetSAMLProvider = _GetSAMLProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetSSHPublicKey.html 
        //  Retrieves the specified SSH public key, including metadata about the key.    
        val GetSSHPublicKey = _GetSSHPublicKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetServerCertificate.html 
        //  Retrieves information about the specified server certificate stored in IAM.    
        val GetServerCertificate = _GetServerCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access_policies_access-advisor-viewing 
        //  View access advisor information, this is an IAM policy permission only, not an API action that can be called.    
        val GetServiceLastAccessedDetailsWithEntities = _GetServiceLastAccessedDetailsWithEntities() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetUser.html 
        //  Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.    
        val GetUser = _GetUser() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetUserPolicy.html 
        //  Retrieves the specified inline policy document that is embedded in the specified IAM user.    
        val GetUserPolicy = _GetUserPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListAccessKeys.html 
        //  Returns information about the access key IDs associated with the specified IAM user.    
        val ListAccessKeys = _ListAccessKeys() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListAccountAliases.html 
        //  Lists the account alias associated with the AWS account (Note: you can have only one).    
        val ListAccountAliases = _ListAccountAliases() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListAttachedGroupPolicies.html 
        //  Lists all managed policies that are attached to the specified IAM group.    
        val ListAttachedGroupPolicies = _ListAttachedGroupPolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListAttachedRolePolicies.html 
        //  Lists all managed policies that are attached to the specified IAM role.    
        val ListAttachedRolePolicies = _ListAttachedRolePolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListAttachedUserPolicies.html 
        //  Lists all managed policies that are attached to the specified IAM user.    
        val ListAttachedUserPolicies = _ListAttachedUserPolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListEntitiesForPolicy.html 
        //  Lists all IAM users, groups, and roles that the specified managed policy is attached to.    
        val ListEntitiesForPolicy = _ListEntitiesForPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListGroupPolicies.html 
        //  Lists the names of the inline policies that are embedded in the specified IAM group.    
        val ListGroupPolicies = _ListGroupPolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListGroups.html 
        //  Lists the IAM groups that have the specified path prefix.    
        val ListGroups = _ListGroups() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListGroupsForUser.html 
        //  Lists the IAM groups that the specified IAM user belongs to.    
        val ListGroupsForUser = _ListGroupsForUser() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListInstanceProfiles.html 
        //  Lists the instance profiles that have the specified path prefix.    
        val ListInstanceProfiles = _ListInstanceProfiles() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListInstanceProfilesForRole.html 
        //  Lists the instance profiles that have the specified associated IAM role.    
        val ListInstanceProfilesForRole = _ListInstanceProfilesForRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListMFADevices.html 
        //  Lists the MFA devices for an IAM user.    
        val ListMFADevices = _ListMFADevices() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListOpenIDConnectProviders.html 
        //  Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.    
        val ListOpenIDConnectProviders = _ListOpenIDConnectProviders() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListPolicies.html 
        //  Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies.    
        val ListPolicies = _ListPolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access_policies_access-advisor-viewing 
        //  View access advisor information, this is an IAM policy permission only, not an API action that can be called.    
        val ListPoliciesGrantingServiceAccess = _ListPoliciesGrantingServiceAccess() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListPolicyVersions.html 
        //  Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version.    
        val ListPolicyVersions = _ListPolicyVersions() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListRolePolicies.html 
        //  Lists the names of the inline policies that are embedded in the specified IAM role.    
        val ListRolePolicies = _ListRolePolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListRoles.html 
        //  Lists the IAM roles that have the specified path prefix.    
        val ListRoles = _ListRoles() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListSAMLProviders.html 
        //  Lists the SAML provider resource objects defined in IAM in the account.    
        val ListSAMLProviders = _ListSAMLProviders() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListSSHPublicKeys.html 
        //  Returns information about the SSH public keys associated with the specified IAM user.    
        val ListSSHPublicKeys = _ListSSHPublicKeys() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListServerCertificates.html 
        //  Lists the server certificates stored in IAM that have the specified path prefix.    
        val ListServerCertificates = _ListServerCertificates() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListSigningCertificates.html 
        //  Returns information about the signing certificates associated with the specified IAM user.    
        val ListSigningCertificates = _ListSigningCertificates() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListUserPolicies.html 
        //  Lists the names of the inline policies embedded in the specified IAM user.    
        val ListUserPolicies = _ListUserPolicies() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListUsers.html 
        //  Lists the IAM users that have the specified path prefix.    
        val ListUsers = _ListUsers() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListVirtualMFADevices.html 
        //  Lists the virtual MFA devices defined in the AWS account by assignment status.    
        val ListVirtualMFADevices = _ListVirtualMFADevices() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_PutGroupPolicy.html 
        //  Adds or updates an inline policy document that is embedded in the specified IAM group.    
        val PutGroupPolicy = _PutGroupPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_PutRolePolicy.html 
        //  Adds or updates an inline policy document that is embedded in the specified IAM role.    
        val PutRolePolicy = _PutRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_PutUserPolicy.html 
        //  Adds or updates an inline policy document that is embedded in the specified IAM user.    
        val PutUserPolicy = _PutUserPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_RemoveClientIDFromOpenIDConnectProvider.html 
        //  Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object.    
        val RemoveClientIDFromOpenIDConnectProvider = _RemoveClientIDFromOpenIDConnectProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_RemoveRoleFromInstanceProfile.html 
        //  Removes the specified IAM role from the specified EC2 instance profile.    
        val RemoveRoleFromInstanceProfile = _RemoveRoleFromInstanceProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_RemoveUserFromGroup.html 
        //  Removes the specified user from the specified group.    
        val RemoveUserFromGroup = _RemoveUserFromGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ResyncMFADevice.html 
        //  Synchronizes the specified MFA device with its IAM resource object on the AWS servers.    
        val ResyncMFADevice = _ResyncMFADevice() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_SetDefaultPolicyVersion.html 
        //  Sets the specified version of the specified policy as the policy's default (operative) version.    
        val SetDefaultPolicyVersion = _SetDefaultPolicyVersion() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_SimulateCustomPolicy.html 
        //  Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API actions and AWS resources to determine the policies' effective permissions.    
        val SimulateCustomPolicy = _SimulateCustomPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_SimulatePrincipalPolicy.html 
        //  Simulate how a set of IAM policies attached to an IAM entity works with a list of API actions and AWS resources to determine the policies' effective permissions.    
        val SimulatePrincipalPolicy = _SimulatePrincipalPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAccessKey.html 
        //  Changes the status of the specified access key from Active to Inactive, or vice versa.    
        val UpdateAccessKey = _UpdateAccessKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAccountPasswordPolicy.html 
        //  Updates the password policy settings for the AWS account.    
        val UpdateAccountPasswordPolicy = _UpdateAccountPasswordPolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateAssumeRolePolicy.html 
        //  Updates the policy that grants an IAM entity permission to assume a role.    
        val UpdateAssumeRolePolicy = _UpdateAssumeRolePolicy() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateGroup.html 
        //  Updates the name and/or the path of the specified IAM group.    
        val UpdateGroup = _UpdateGroup() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateLoginProfile.html 
        //  Changes the password for the specified IAM user.    
        val UpdateLoginProfile = _UpdateLoginProfile() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateOpenIDConnectProviderThumbprint.html 
        //  Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints.    
        val UpdateOpenIDConnectProviderThumbprint = _UpdateOpenIDConnectProviderThumbprint() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateSAMLProvider.html 
        //  Updates the metadata document for an existing SAML provider resource object.    
        val UpdateSAMLProvider = _UpdateSAMLProvider() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateSSHPublicKey.html 
        //  Sets the status of an IAM user's SSH public key to active or inactive.    
        val UpdateSSHPublicKey = _UpdateSSHPublicKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateServerCertificate.html 
        //  Updates the name and/or the path of the specified server certificate stored in IAM.    
        val UpdateServerCertificate = _UpdateServerCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateSigningCertificate.html 
        //  Changes the status of the specified user signing certificate from active to disabled, or vice versa.    
        val UpdateSigningCertificate = _UpdateSigningCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateUser.html 
        //  Updates the name and/or the path of the specified IAM user.    
        val UpdateUser = _UpdateUser() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UploadSSHPublicKey.html 
        //  Uploads an SSH public key and associates it with the specified IAM user.    
        val UploadSSHPublicKey = _UploadSSHPublicKey() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UploadServerCertificate.html 
        //  Uploads a server certificate entity for the AWS account.    
        val UploadServerCertificate = _UploadServerCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UploadSigningCertificate.html 
        //  Uploads an X.509 signing certificate and associates it with the specified IAM user.    
        val UploadSigningCertificate = _UploadSigningCertificate() 
        // see http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access_policies_access-advisor-viewing 
        //  View access advisor information, this is an IAM policy permission only, not an API action that can be called.    
        val GenerateServiceLastAccessedDetails = _GenerateServiceLastAccessedDetails() 
        // see http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access_policies_access-advisor-viewing 
        //  View access advisor information, this is an IAM policy permission only, not an API action that can be called.    
        val GetServiceLastAccessedDetails = _GetServiceLastAccessedDetails() 
        // see https://blogs.aws.amazon.com/security/post/Tx3M0IFB5XBOCQX/Granting-Permission-to-Launch-EC2-Instances-with-IAM-Roles-PassRole-Permission 
        //  This is an IAM policy permission only, not an API action that can be called.    
        val PassRole = _PassRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateServiceLinkedRole.html 
        //  Creates an IAM role that is linked to a specific AWS service.    
        val CreateServiceLinkedRole = _CreateServiceLinkedRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateServiceSpecificCredential.html 
        //  Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request.    
        val CreateServiceSpecificCredential = _CreateServiceSpecificCredential() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteServiceLinkedRole.html 
        //  Submits a service-linked role deletion request.    
        val DeleteServiceLinkedRole = _DeleteServiceLinkedRole() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_DeleteServiceSpecificCredential.html 
        //  Deletes the specified service-specific credential.    
        val DeleteServiceSpecificCredential = _DeleteServiceSpecificCredential() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_GetServiceLinkedRoleDeletionStatus.html 
        //  Retrieves the status of your service-linked role deletion.    
        val GetServiceLinkedRoleDeletionStatus = _GetServiceLinkedRoleDeletionStatus() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ListServiceSpecificCredentials.html 
        //  Returns information about the service-specific credentials associated with the specified IAM user.    
        val ListServiceSpecificCredentials = _ListServiceSpecificCredentials() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_ResetServiceSpecificCredential.html 
        //  Resets the password for a service-specific credential.    
        val ResetServiceSpecificCredential = _ResetServiceSpecificCredential() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateRoleDescription.html 
        //  Modifies the description of a role.    
        val UpdateRoleDescription = _UpdateRoleDescription() 
        // see http://docs.aws.amazon.com/IAM/latest/APIReference/API_UpdateServiceSpecificCredential.html 
        //  Sets the status of a service-specific credential to Active or Inactive.    
        val UpdateServiceSpecificCredential = _UpdateServiceSpecificCredential() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_TagUser.html 
        // 	Creates or modifies the tags on an IAM user.	arn:aws:iam::$account:user/$user-name    
        val TagUser = _TagUser() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_UntagUser.html 
        // 	Removes the tags on an IAM user.	arn:aws:iam::$account:user/$user-name    
        val UntagUser = _UntagUser() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_ListUserTags.html 
        // 	Lists the tags on an IAM user.	arn:aws:iam::$account:user/$user-name    
        val ListUserTags = _ListUserTags() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_TagRole.html 
        // 	Creates or modifies the tags on an IAM role.	arn:aws:iam::$account:role/$role-name    
        val TagRole = _TagRole() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_UntagRole.html 
        // 	Removes the tags on an IAM role.	arn:aws:iam::$account:role/$role-name    
        val UntagRole = _UntagRole() 
        // see https://docs.aws.amazon.com/IAM/latest/APIReference/API_ListRoleTags.html 
        // 	Lists the tags on an IAM role.	arn:aws:iam::$account:role/$role-name    
        val ListRoleTags = _ListRoleTags()
    }
      class _AddRoleToInstanceProfile : IamPolicy.Action("iam:AddRoleToInstanceProfile") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _AddUserToGroup : IamPolicy.Action("iam:AddUserToGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _AddClientIDToOpenIDConnectProvider : IamPolicy.Action("iam:AddClientIDToOpenIDConnectProvider") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _AttachGroupPolicy : IamPolicy.Action("iam:AttachGroupPolicy") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _AttachRolePolicy : IamPolicy.Action("iam:AttachRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _AttachUserPolicy : IamPolicy.Action("iam:AttachUserPolicy") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ChangePassword : IamPolicy.Action("iam:ChangePassword") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _CreateAccessKey : IamPolicy.Action("iam:CreateAccessKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _CreateAccountAlias : IamPolicy.Action("iam:CreateAccountAlias") {

         }       
 
      class _CreateGroup : IamPolicy.Action("iam:CreateGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _CreateInstanceProfile : IamPolicy.Action("iam:CreateInstanceProfile") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _CreateLoginProfile : IamPolicy.Action("iam:CreateLoginProfile") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _CreateOpenIDConnectProvider : IamPolicy.Action("iam:CreateOpenIDConnectProvider") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _CreatePolicy : IamPolicy.Action("iam:CreatePolicy") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _CreatePolicyVersion : IamPolicy.Action("iam:CreatePolicyVersion") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _CreateRole : IamPolicy.Action("iam:CreateRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _CreateSAMLProvider : IamPolicy.Action("iam:CreateSAMLProvider") {
             //arn:aws:iam::$account:saml-provider/$provider-name"
            fun samlprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:saml-provider/$providername")
         }       
 
      class _CreateUser : IamPolicy.Action("iam:CreateUser") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _CreateVirtualMFADevice : IamPolicy.Action("iam:CreateVirtualMFADevice") {
             //arn:aws:iam::$account:mfa/$virtual-device-name"
            fun mfa_byAccountVirtualdevicename(account: String, virtualdevicename: String) = IamPolicy.Resource("arn:aws:iam::$account:mfa/$virtualdevicename")
         }       
 
      class _DeactivateMFADevice : IamPolicy.Action("iam:DeactivateMFADevice") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteAccessKey : IamPolicy.Action("iam:DeleteAccessKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteAccountAlias : IamPolicy.Action("iam:DeleteAccountAlias") {

         }       
 
      class _DeleteAccountPasswordPolicy : IamPolicy.Action("iam:DeleteAccountPasswordPolicy") {

         }       
 
      class _DeleteGroup : IamPolicy.Action("iam:DeleteGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _DeleteGroupPolicy : IamPolicy.Action("iam:DeleteGroupPolicy") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _DeleteInstanceProfile : IamPolicy.Action("iam:DeleteInstanceProfile") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _DeleteLoginProfile : IamPolicy.Action("iam:DeleteLoginProfile") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteOpenIDConnectProvider : IamPolicy.Action("iam:DeleteOpenIDConnectProvider") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _DeletePolicy : IamPolicy.Action("iam:DeletePolicy") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _DeletePolicyVersion : IamPolicy.Action("iam:DeletePolicyVersion") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _DeleteRole : IamPolicy.Action("iam:DeleteRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _DeleteRolePolicy : IamPolicy.Action("iam:DeleteRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _DeleteSAMLProvider : IamPolicy.Action("iam:DeleteSAMLProvider") {
             //arn:aws:iam::$account:saml-provider/$provider-name"
            fun samlprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:saml-provider/$providername")
         }       
 
      class _DeleteSSHPublicKey : IamPolicy.Action("iam:DeleteSSHPublicKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteServerCertificate : IamPolicy.Action("iam:DeleteServerCertificate") {
             //arn:aws:iam::$account:server-certificate/$certificate-name"
            fun servercertificate_byAccountCertificatename(account: String, certificatename: String) = IamPolicy.Resource("arn:aws:iam::$account:server-certificate/$certificatename")
         }       
 
      class _DeleteSigningCertificate : IamPolicy.Action("iam:DeleteSigningCertificate") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteUser : IamPolicy.Action("iam:DeleteUser") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteUserPolicy : IamPolicy.Action("iam:DeleteUserPolicy") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteVirtualMFADevice : IamPolicy.Action("iam:DeleteVirtualMFADevice") {
             //arn:aws:iam::$account:mfa/$virtual-device-name"
            fun mfa_byAccountVirtualdevicename(account: String, virtualdevicename: String) = IamPolicy.Resource("arn:aws:iam::$account:mfa/$virtualdevicename")
         }       
 
      class _DetachGroupPolicy : IamPolicy.Action("iam:DetachGroupPolicy") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _DetachRolePolicy : IamPolicy.Action("iam:DetachRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _DetachUserPolicy : IamPolicy.Action("iam:DetachUserPolicy") {
             //arn:aws:iam::$account:group/$user-name"
            fun group_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$username")
         }       
 
      class _EnableMFADevice : IamPolicy.Action("iam:EnableMFADevice") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GenerateCredentialReport : IamPolicy.Action("iam:GenerateCredentialReport") {

         }       
 
      class _GetAccessKeyLastUsed : IamPolicy.Action("iam:GetAccessKeyLastUsed") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GetAccountAuthorizationDetails : IamPolicy.Action("iam:GetAccountAuthorizationDetails") {

         }       
 
      class _GetAccountPasswordPolicy : IamPolicy.Action("iam:GetAccountPasswordPolicy") {

         }       
 
      class _GetAccountSummary : IamPolicy.Action("iam:GetAccountSummary") {

         }       
 
      class _GetContextKeysForCustomPolicy : IamPolicy.Action("iam:GetContextKeysForCustomPolicy") {

         }       
 
      class _GetContextKeysForPrincipalPolicy : IamPolicy.Action("iam:GetContextKeysForPrincipalPolicy") {

         }       
 
      class _GetCredentialReport : IamPolicy.Action("iam:GetCredentialReport") {

         }       
 
      class _GetGroup : IamPolicy.Action("iam:GetGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _GetGroupPolicy : IamPolicy.Action("iam:GetGroupPolicy") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _GetInstanceProfile : IamPolicy.Action("iam:GetInstanceProfile") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _GetLoginProfile : IamPolicy.Action("iam:GetLoginProfile") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GetOpenIDConnectProvider : IamPolicy.Action("iam:GetOpenIDConnectProvider") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _GetPolicy : IamPolicy.Action("iam:GetPolicy") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _GetPolicyVersion : IamPolicy.Action("iam:GetPolicyVersion") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _GetRole : IamPolicy.Action("iam:GetRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _GetRolePolicy : IamPolicy.Action("iam:GetRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _GetSAMLProvider : IamPolicy.Action("iam:GetSAMLProvider") {
             //arn:aws:iam::$account:saml-provider/$provider-name"
            fun samlprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:saml-provider/$providername")
         }       
 
      class _GetSSHPublicKey : IamPolicy.Action("iam:GetSSHPublicKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GetServerCertificate : IamPolicy.Action("iam:GetServerCertificate") {
             //arn:aws:iam::$account:server-certificate/$certificate-name"
            fun servercertificate_byAccountCertificatename(account: String, certificatename: String) = IamPolicy.Resource("arn:aws:iam::$account:server-certificate/$certificatename")
         }       
 
      class _GetServiceLastAccessedDetailsWithEntities : IamPolicy.Action("iam:GetServiceLastAccessedDetailsWithEntities") {

         }       
 
      class _GetUser : IamPolicy.Action("iam:GetUser") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GetUserPolicy : IamPolicy.Action("iam:GetUserPolicy") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListAccessKeys : IamPolicy.Action("iam:ListAccessKeys") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListAccountAliases : IamPolicy.Action("iam:ListAccountAliases") {

         }       
 
      class _ListAttachedGroupPolicies : IamPolicy.Action("iam:ListAttachedGroupPolicies") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _ListAttachedRolePolicies : IamPolicy.Action("iam:ListAttachedRolePolicies") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _ListAttachedUserPolicies : IamPolicy.Action("iam:ListAttachedUserPolicies") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListEntitiesForPolicy : IamPolicy.Action("iam:ListEntitiesForPolicy") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _ListGroupPolicies : IamPolicy.Action("iam:ListGroupPolicies") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _ListGroups : IamPolicy.Action("iam:ListGroups") {

         }       
 
      class _ListGroupsForUser : IamPolicy.Action("iam:ListGroupsForUser") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListInstanceProfiles : IamPolicy.Action("iam:ListInstanceProfiles") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _ListInstanceProfilesForRole : IamPolicy.Action("iam:ListInstanceProfilesForRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _ListMFADevices : IamPolicy.Action("iam:ListMFADevices") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListOpenIDConnectProviders : IamPolicy.Action("iam:ListOpenIDConnectProviders") {

         }       
 
      class _ListPolicies : IamPolicy.Action("iam:ListPolicies") {

         }       
 
      class _ListPoliciesGrantingServiceAccess : IamPolicy.Action("iam:ListPoliciesGrantingServiceAccess") {

         }       
 
      class _ListPolicyVersions : IamPolicy.Action("iam:ListPolicyVersions") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _ListRolePolicies : IamPolicy.Action("iam:ListRolePolicies") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _ListRoles : IamPolicy.Action("iam:ListRoles") {

         }       
 
      class _ListSAMLProviders : IamPolicy.Action("iam:ListSAMLProviders") {

         }       
 
      class _ListSSHPublicKeys : IamPolicy.Action("iam:ListSSHPublicKeys") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListServerCertificates : IamPolicy.Action("iam:ListServerCertificates") {

         }       
 
      class _ListSigningCertificates : IamPolicy.Action("iam:ListSigningCertificates") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListUserPolicies : IamPolicy.Action("iam:ListUserPolicies") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ListUsers : IamPolicy.Action("iam:ListUsers") {

         }       
 
      class _ListVirtualMFADevices : IamPolicy.Action("iam:ListVirtualMFADevices") {

         }       
 
      class _PutGroupPolicy : IamPolicy.Action("iam:PutGroupPolicy") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _PutRolePolicy : IamPolicy.Action("iam:PutRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _PutUserPolicy : IamPolicy.Action("iam:PutUserPolicy") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _RemoveClientIDFromOpenIDConnectProvider : IamPolicy.Action("iam:RemoveClientIDFromOpenIDConnectProvider") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _RemoveRoleFromInstanceProfile : IamPolicy.Action("iam:RemoveRoleFromInstanceProfile") {
             //arn:aws:iam::$account:instance-profile/$instance-profile-name"
            fun instanceprofile_byAccountInstanceprofilename(account: String, instanceprofilename: String) = IamPolicy.Resource("arn:aws:iam::$account:instance-profile/$instanceprofilename")
         }       
 
      class _RemoveUserFromGroup : IamPolicy.Action("iam:RemoveUserFromGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _ResyncMFADevice : IamPolicy.Action("iam:ResyncMFADevice") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _SetDefaultPolicyVersion : IamPolicy.Action("iam:SetDefaultPolicyVersion") {
             //arn:aws:iam::$account:policy/$policy-name"
            fun policy_byAccountPolicyname(account: String, policyname: String) = IamPolicy.Resource("arn:aws:iam::$account:policy/$policyname")
         }       
 
      class _SimulateCustomPolicy : IamPolicy.Action("iam:SimulateCustomPolicy") {

         }       
 
      class _SimulatePrincipalPolicy : IamPolicy.Action("iam:SimulatePrincipalPolicy") {

         }       
 
      class _UpdateAccessKey : IamPolicy.Action("iam:UpdateAccessKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UpdateAccountPasswordPolicy : IamPolicy.Action("iam:UpdateAccountPasswordPolicy") {

         }       
 
      class _UpdateAssumeRolePolicy : IamPolicy.Action("iam:UpdateAssumeRolePolicy") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _UpdateGroup : IamPolicy.Action("iam:UpdateGroup") {
             //arn:aws:iam::$account:group/$group-name"
            fun group_byAccountGroupname(account: String, groupname: String) = IamPolicy.Resource("arn:aws:iam::$account:group/$groupname")
         }       
 
      class _UpdateLoginProfile : IamPolicy.Action("iam:UpdateLoginProfile") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UpdateOpenIDConnectProviderThumbprint : IamPolicy.Action("iam:UpdateOpenIDConnectProviderThumbprint") {
             //arn:aws:iam::$account:oidc-provider/$provider-name"
            fun oidcprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:oidc-provider/$providername")
         }       
 
      class _UpdateSAMLProvider : IamPolicy.Action("iam:UpdateSAMLProvider") {
             //arn:aws:iam::$account:saml-provider/$provider-name"
            fun samlprovider_byAccountProvidername(account: String, providername: String) = IamPolicy.Resource("arn:aws:iam::$account:saml-provider/$providername")
         }       
 
      class _UpdateSSHPublicKey : IamPolicy.Action("iam:UpdateSSHPublicKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UpdateServerCertificate : IamPolicy.Action("iam:UpdateServerCertificate") {
             //arn:aws:iam::$account:server-certificate/$certificate-name"
            fun servercertificate_byAccountCertificatename(account: String, certificatename: String) = IamPolicy.Resource("arn:aws:iam::$account:server-certificate/$certificatename")
         }       
 
      class _UpdateSigningCertificate : IamPolicy.Action("iam:UpdateSigningCertificate") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UpdateUser : IamPolicy.Action("iam:UpdateUser") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UploadSSHPublicKey : IamPolicy.Action("iam:UploadSSHPublicKey") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UploadServerCertificate : IamPolicy.Action("iam:UploadServerCertificate") {
             //arn:aws:iam::$account:server-certificate/$certificate-name"
            fun servercertificate_byAccountCertificatename(account: String, certificatename: String) = IamPolicy.Resource("arn:aws:iam::$account:server-certificate/$certificatename")
         }       
 
      class _UploadSigningCertificate : IamPolicy.Action("iam:UploadSigningCertificate") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GenerateServiceLastAccessedDetails : IamPolicy.Action("iam:GenerateServiceLastAccessedDetails") {

         }       
 
      class _GetServiceLastAccessedDetails : IamPolicy.Action("iam:GetServiceLastAccessedDetails") {

         }       
 
      class _PassRole : IamPolicy.Action("iam:PassRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _CreateServiceLinkedRole : IamPolicy.Action("iam:CreateServiceLinkedRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _CreateServiceSpecificCredential : IamPolicy.Action("iam:CreateServiceSpecificCredential") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _DeleteServiceLinkedRole : IamPolicy.Action("iam:DeleteServiceLinkedRole") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _DeleteServiceSpecificCredential : IamPolicy.Action("iam:DeleteServiceSpecificCredential") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _GetServiceLinkedRoleDeletionStatus : IamPolicy.Action("iam:GetServiceLinkedRoleDeletionStatus") {

         }       
 
      class _ListServiceSpecificCredentials : IamPolicy.Action("iam:ListServiceSpecificCredentials") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _ResetServiceSpecificCredential : IamPolicy.Action("iam:ResetServiceSpecificCredential") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _UpdateRoleDescription : IamPolicy.Action("iam:UpdateRoleDescription") {
             //arn:aws:iam::$account:role/$role-name"
            fun role_byAccountRolename(account: String, rolename: String) = IamPolicy.Resource("arn:aws:iam::$account:role/$rolename")
         }       
 
      class _UpdateServiceSpecificCredential : IamPolicy.Action("iam:UpdateServiceSpecificCredential") {
             //arn:aws:iam::$account:user/$user-name"
            fun user_byAccountUsername(account: String, username: String) = IamPolicy.Resource("arn:aws:iam::$account:user/$username")
         }       
 
      class _TagUser : IamPolicy.Action("iam:TagUser") {
             //aws:RequestTag"
            fun awsRequestTag() = IamPolicy.Resource("aws:RequestTag")
             //aws:TagKeys"
            fun awsTagKeys() = IamPolicy.Resource("aws:TagKeys")
         }       
 
      class _UntagUser : IamPolicy.Action("iam:UntagUser") {
             //aws:RequestTag"
            fun awsRequestTag() = IamPolicy.Resource("aws:RequestTag")
             //aws:TagKeys"
            fun awsTagKeys() = IamPolicy.Resource("aws:TagKeys")
         }       
 
      class _ListUserTags : IamPolicy.Action("iam:ListUserTags") {

         }       
 
      class _TagRole : IamPolicy.Action("iam:TagRole") {
             //aws:RequestTag"
            fun awsRequestTag() = IamPolicy.Resource("aws:RequestTag")
             //aws:TagKeys"
            fun awsTagKeys() = IamPolicy.Resource("aws:TagKeys")
         }       
 
      class _UntagRole : IamPolicy.Action("iam:UntagRole") {
             //aws:RequestTag"
            fun awsRequestTag() = IamPolicy.Resource("aws:RequestTag")
             //aws:TagKeys"
            fun awsTagKeys() = IamPolicy.Resource("aws:TagKeys")
         }       
 
      class _ListRoleTags : IamPolicy.Action("iam:ListRoleTags") {

         }       


}        
