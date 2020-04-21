
package com.typedpath.iam2kotlin.resources.codestar

import com.typedpath.iam2kotlin.IamPolicy

class CodestarAction() {

    companion object { 
        val All = IamPolicy.Action("codestar:*")    
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_AssociateTeamMember.html 
        //  Adds an IAM user to the team for an AWS CodeStar project.    
        val AssociateTeamMember = _AssociateTeamMember() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_CreateProject.html 
        //  Reserved for future use.    
        val CreateProject = _CreateProject() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_CreateUserProfile.html 
        //  Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar.    
        val CreateUserProfile = _CreateUserProfile() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DeleteExtendedAccess.html 
        //  .    
        val DeleteExtendedAccess = _DeleteExtendedAccess() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DeleteProject.html 
        //  Deletes a project, including project resources.    
        val DeleteProject = _DeleteProject() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DeleteUserProfile.html 
        //  Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address.    
        val DeleteUserProfile = _DeleteUserProfile() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DescribeProject.html 
        //  Describes a project and its resources.    
        val DescribeProject = _DescribeProject() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DescribeUserProfile.html 
        //  Describes a user in AWS CodeStar and the user attributes across all projects.    
        val DescribeUserProfile = _DescribeUserProfile() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_DisassociateTeamMember.html 
        //  Removes a user from a project.    
        val DisassociateTeamMember = _DisassociateTeamMember() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_GetExtendedAccess.html 
        //  .    
        val GetExtendedAccess = _GetExtendedAccess() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_ListProjects.html 
        //  Lists all projects in AWS CodeStar associated with your AWS account.    
        val ListProjects = _ListProjects() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_ListResources.html 
        //  Lists resources associated with a project in AWS CodeStar.    
        val ListResources = _ListResources() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_ListTeamMembers.html 
        //  Lists all team members associated with a project.    
        val ListTeamMembers = _ListTeamMembers() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_ListUserProfiles.html 
        //  Lists all the user profiles configured for your AWS account in AWS CodeStar.    
        val ListUserProfiles = _ListUserProfiles() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_PutExtendedAccess.html 
        //  .    
        val PutExtendedAccess = _PutExtendedAccess() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_UpdateProject.html 
        //  Updates a project in AWS CodeStar.    
        val UpdateProject = _UpdateProject() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_UpdateTeamMember.html 
        //  Updates a team member's attributes in an AWS CodeStar project.    
        val UpdateTeamMember = _UpdateTeamMember() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_UpdateUserProfile.html 
        //  Updates a user's profile in AWS CodeStar.    
        val UpdateUserProfile = _UpdateUserProfile() 
        // see http://docs.aws.amazon.com/codestar/latest/APIReference/API_VerifyServiceRole.html 
        //  .    
        val VerifyServiceRole = _VerifyServiceRole()
    }
      class _AssociateTeamMember : IamPolicy.Action("codestar:AssociateTeamMember") {

         }       
 
      class _CreateProject : IamPolicy.Action("codestar:CreateProject") {

         }       
 
      class _CreateUserProfile : IamPolicy.Action("codestar:CreateUserProfile") {

         }       
 
      class _DeleteExtendedAccess : IamPolicy.Action("codestar:DeleteExtendedAccess") {

         }       
 
      class _DeleteProject : IamPolicy.Action("codestar:DeleteProject") {

         }       
 
      class _DeleteUserProfile : IamPolicy.Action("codestar:DeleteUserProfile") {

         }       
 
      class _DescribeProject : IamPolicy.Action("codestar:DescribeProject") {

         }       
 
      class _DescribeUserProfile : IamPolicy.Action("codestar:DescribeUserProfile") {

         }       
 
      class _DisassociateTeamMember : IamPolicy.Action("codestar:DisassociateTeamMember") {

         }       
 
      class _GetExtendedAccess : IamPolicy.Action("codestar:GetExtendedAccess") {

         }       
 
      class _ListProjects : IamPolicy.Action("codestar:ListProjects") {

         }       
 
      class _ListResources : IamPolicy.Action("codestar:ListResources") {

         }       
 
      class _ListTeamMembers : IamPolicy.Action("codestar:ListTeamMembers") {

         }       
 
      class _ListUserProfiles : IamPolicy.Action("codestar:ListUserProfiles") {

         }       
 
      class _PutExtendedAccess : IamPolicy.Action("codestar:PutExtendedAccess") {

         }       
 
      class _UpdateProject : IamPolicy.Action("codestar:UpdateProject") {

         }       
 
      class _UpdateTeamMember : IamPolicy.Action("codestar:UpdateTeamMember") {

         }       
 
      class _UpdateUserProfile : IamPolicy.Action("codestar:UpdateUserProfile") {

         }       
 
      class _VerifyServiceRole : IamPolicy.Action("codestar:VerifyServiceRole") {

         }       


}        
