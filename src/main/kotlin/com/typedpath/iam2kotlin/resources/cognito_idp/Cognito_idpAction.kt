
package com.typedpath.iam2kotlin.resources.cognito_idp

import com.typedpath.iam2kotlin.IamPolicy

class Cognito_idpAction() {

    companion object { 
        val All = IamPolicy.Action("cognito_idp:*")    
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AddCustomAttributes.html 
        //  Adds additional user attributes to the user pool schema.    
        val AddCustomAttributes = _AddCustomAttributes() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminAddUserToGroup.html 
        //  Adds the specified user to the specified group.    
        val AdminAddUserToGroup = _AdminAddUserToGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminConfirmSignUp.html 
        //  Confirms user registration as an admin without using a confirmation code.    
        val AdminConfirmSignUp = _AdminConfirmSignUp() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminCreateUser.html 
        //  Creates a new user in the specified user pool and sends a welcome message via email or phone (SMS).    
        val AdminCreateUser = _AdminCreateUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminDeleteUser.html 
        //  Deletes a user as an administrator.    
        val AdminDeleteUser = _AdminDeleteUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminDeleteUserAttributes.html 
        //  Deletes the user attributes in a user pool as an administrator.    
        val AdminDeleteUserAttributes = _AdminDeleteUserAttributes() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminDisableUser.html 
        //  Disables the specified user as an administrator.    
        val AdminDisableUser = _AdminDisableUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminEnableUser.html 
        //  Enables the specified user as an administrator.    
        val AdminEnableUser = _AdminEnableUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminForgetDevice.html 
        //  Forgets the device, as an administrator.    
        val AdminForgetDevice = _AdminForgetDevice() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminGetDevice.html 
        //  Gets the device, as an administrator.    
        val AdminGetDevice = _AdminGetDevice() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminGetUser.html 
        //  Gets the specified user by user name in a user pool as an administrator.    
        val AdminGetUser = _AdminGetUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminInitiateAuth.html 
        //  Initiates the authentication flow, as an administrator.    
        val AdminInitiateAuth = _AdminInitiateAuth() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminListDevices.html 
        //  Lists devices, as an administrator.    
        val AdminListDevices = _AdminListDevices() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminListGroupsForUser.html 
        //  Lists the groups that the user belongs to.    
        val AdminListGroupsForUser = _AdminListGroupsForUser() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminRemoveUserFromGroup.html 
        //  Removes the specified user from the specified group.    
        val AdminRemoveUserFromGroup = _AdminRemoveUserFromGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminResetUserPassword.html 
        //  Resets the specified user's password in a user pool as an administrator.    
        val AdminResetUserPassword = _AdminResetUserPassword() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminRespondToAuthChallenge.html 
        //  Responds to an authentication challenge, as an administrator.    
        val AdminRespondToAuthChallenge = _AdminRespondToAuthChallenge() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminSetUserSettings.html 
        //  Sets all the user settings for a specified user name.    
        val AdminSetUserSettings = _AdminSetUserSettings() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateDeviceStatus.html 
        //  Updates the device status as an administrator.    
        val AdminUpdateDeviceStatus = _AdminUpdateDeviceStatus() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html 
        //  Updates the specified user's attributes, including developer attributes, as an administrator.    
        val AdminUpdateUserAttributes = _AdminUpdateUserAttributes() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUserGlobalSignOut.html 
        //  Signs out users from all devices, as an administrator.    
        val AdminUserGlobalSignOut = _AdminUserGlobalSignOut() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateGroup.html 
        //  Creates a new group in the specified user pool.    
        val CreateGroup = _CreateGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserImportJob.html 
        //  Creates the user import job.    
        val CreateUserImportJob = _CreateUserImportJob() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPool.html 
        //  Creates a new Amazon Cognito user pool and sets the password policy for the pool.    
        val CreateUserPool = _CreateUserPool() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPoolClient.html 
        //  Creates the user pool client.    
        val CreateUserPoolClient = _CreateUserPoolClient() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPoolDomain.html 
        //  Creates a new domain for a user pool.    
        val CreateUserPoolDomain = _CreateUserPoolDomain() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DeleteGroup.html 
        //  Deletes a group.    
        val DeleteGroup = _DeleteGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DeleteUserPool.html 
        //  Deletes the specified Amazon Cognito user pool.    
        val DeleteUserPool = _DeleteUserPool() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DeleteUserPoolClient.html 
        //  Allows the developer to delete the user pool client.    
        val DeleteUserPoolClient = _DeleteUserPoolClient() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserImportJob.html 
        //  Describes the user import job.    
        val DescribeUserImportJob = _DescribeUserImportJob() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html 
        //  Returns the configuration information and metadata of the specified user pool.    
        val DescribeUserPool = _DescribeUserPool() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPoolClient.html 
        //  Client method for returning the configuration information and metadata of the specified user pool client.    
        val DescribeUserPoolClient = _DescribeUserPoolClient() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetCSVHeader.html 
        //  Gets the header information for the .    
        val GetCSVHeader = _GetCSVHeader() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetGroup.html 
        //  Gets a group.    
        val GetGroup = _GetGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListGroups.html 
        //  Lists the groups associated with a user pool.    
        val ListGroups = _ListGroups() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListUserImportJobs.html 
        //  Lists the user import jobs.    
        val ListUserImportJobs = _ListUserImportJobs() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListUserPoolClients.html 
        //  Lists the clients that have been created for the specified user pool.    
        val ListUserPoolClients = _ListUserPoolClients() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListUserPools.html 
        //  Lists the user pools associated with an AWS account.    
        val ListUserPools = _ListUserPools() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListUsers.html 
        //  Lists the users in the Amazon Cognito user pool.    
        val ListUsers = _ListUsers() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ListUsersInGroup.html 
        //  Lists the users in the specified group.    
        val ListUsersInGroup = _ListUsersInGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUICustomization.html 
        //  Sets the UI customization information for a user pool's built-in app UI.    
        val SetUICustomization = _SetUICustomization() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_StartUserImportJob.html 
        //  Starts the user import.    
        val StartUserImportJob = _StartUserImportJob() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_StopUserImportJob.html 
        //  Stops the user import job.    
        val StopUserImportJob = _StopUserImportJob() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateGroup.html 
        //  Updates the specified group with the specified attributes.    
        val UpdateGroup = _UpdateGroup() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserPool.html 
        //  Updates the specified user pool with the specified attributes.    
        val UpdateUserPool = _UpdateUserPool() 
        // see http://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserPoolClient.html 
        //  Allows the developer to update the specified user pool client and password policy.    
        val UpdateUserPoolClient = _UpdateUserPoolClient()
    }
      class _AddCustomAttributes : IamPolicy.Action("cognito-idp:AddCustomAttributes") {

         }       
 
      class _AdminAddUserToGroup : IamPolicy.Action("cognito-idp:AdminAddUserToGroup") {

         }       
 
      class _AdminConfirmSignUp : IamPolicy.Action("cognito-idp:AdminConfirmSignUp") {

         }       
 
      class _AdminCreateUser : IamPolicy.Action("cognito-idp:AdminCreateUser") {

         }       
 
      class _AdminDeleteUser : IamPolicy.Action("cognito-idp:AdminDeleteUser") {

         }       
 
      class _AdminDeleteUserAttributes : IamPolicy.Action("cognito-idp:AdminDeleteUserAttributes") {

         }       
 
      class _AdminDisableUser : IamPolicy.Action("cognito-idp:AdminDisableUser") {

         }       
 
      class _AdminEnableUser : IamPolicy.Action("cognito-idp:AdminEnableUser") {

         }       
 
      class _AdminForgetDevice : IamPolicy.Action("cognito-idp:AdminForgetDevice") {

         }       
 
      class _AdminGetDevice : IamPolicy.Action("cognito-idp:AdminGetDevice") {

         }       
 
      class _AdminGetUser : IamPolicy.Action("cognito-idp:AdminGetUser") {

         }       
 
      class _AdminInitiateAuth : IamPolicy.Action("cognito-idp:AdminInitiateAuth") {

         }       
 
      class _AdminListDevices : IamPolicy.Action("cognito-idp:AdminListDevices") {

         }       
 
      class _AdminListGroupsForUser : IamPolicy.Action("cognito-idp:AdminListGroupsForUser") {

         }       
 
      class _AdminRemoveUserFromGroup : IamPolicy.Action("cognito-idp:AdminRemoveUserFromGroup") {

         }       
 
      class _AdminResetUserPassword : IamPolicy.Action("cognito-idp:AdminResetUserPassword") {

         }       
 
      class _AdminRespondToAuthChallenge : IamPolicy.Action("cognito-idp:AdminRespondToAuthChallenge") {

         }       
 
      class _AdminSetUserSettings : IamPolicy.Action("cognito-idp:AdminSetUserSettings") {

         }       
 
      class _AdminUpdateDeviceStatus : IamPolicy.Action("cognito-idp:AdminUpdateDeviceStatus") {

         }       
 
      class _AdminUpdateUserAttributes : IamPolicy.Action("cognito-idp:AdminUpdateUserAttributes") {

         }       
 
      class _AdminUserGlobalSignOut : IamPolicy.Action("cognito-idp:AdminUserGlobalSignOut") {

         }       
 
      class _CreateGroup : IamPolicy.Action("cognito-idp:CreateGroup") {

         }       
 
      class _CreateUserImportJob : IamPolicy.Action("cognito-idp:CreateUserImportJob") {

         }       
 
      class _CreateUserPool : IamPolicy.Action("cognito-idp:CreateUserPool") {

         }       
 
      class _CreateUserPoolClient : IamPolicy.Action("cognito-idp:CreateUserPoolClient") {

         }       
 
      class _CreateUserPoolDomain : IamPolicy.Action("cognito-idp:CreateUserPoolDomain") {

         }       
 
      class _DeleteGroup : IamPolicy.Action("cognito-idp:DeleteGroup") {

         }       
 
      class _DeleteUserPool : IamPolicy.Action("cognito-idp:DeleteUserPool") {

         }       
 
      class _DeleteUserPoolClient : IamPolicy.Action("cognito-idp:DeleteUserPoolClient") {

         }       
 
      class _DescribeUserImportJob : IamPolicy.Action("cognito-idp:DescribeUserImportJob") {

         }       
 
      class _DescribeUserPool : IamPolicy.Action("cognito-idp:DescribeUserPool") {

         }       
 
      class _DescribeUserPoolClient : IamPolicy.Action("cognito-idp:DescribeUserPoolClient") {

         }       
 
      class _GetCSVHeader : IamPolicy.Action("cognito-idp:GetCSVHeader") {

         }       
 
      class _GetGroup : IamPolicy.Action("cognito-idp:GetGroup") {

         }       
 
      class _ListGroups : IamPolicy.Action("cognito-idp:ListGroups") {

         }       
 
      class _ListUserImportJobs : IamPolicy.Action("cognito-idp:ListUserImportJobs") {

         }       
 
      class _ListUserPoolClients : IamPolicy.Action("cognito-idp:ListUserPoolClients") {

         }       
 
      class _ListUserPools : IamPolicy.Action("cognito-idp:ListUserPools") {

         }       
 
      class _ListUsers : IamPolicy.Action("cognito-idp:ListUsers") {

         }       
 
      class _ListUsersInGroup : IamPolicy.Action("cognito-idp:ListUsersInGroup") {

         }       
 
      class _SetUICustomization : IamPolicy.Action("cognito-idp:SetUICustomization") {

         }       
 
      class _StartUserImportJob : IamPolicy.Action("cognito-idp:StartUserImportJob") {

         }       
 
      class _StopUserImportJob : IamPolicy.Action("cognito-idp:StopUserImportJob") {

         }       
 
      class _UpdateGroup : IamPolicy.Action("cognito-idp:UpdateGroup") {

         }       
 
      class _UpdateUserPool : IamPolicy.Action("cognito-idp:UpdateUserPool") {

         }       
 
      class _UpdateUserPoolClient : IamPolicy.Action("cognito-idp:UpdateUserPoolClient") {

         }       


}        
