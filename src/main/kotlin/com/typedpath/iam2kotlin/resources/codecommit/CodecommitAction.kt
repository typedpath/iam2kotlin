
package com.typedpath.iam2kotlin.resources.codecommit

import com.typedpath.iam2kotlin.IamPolicy

class CodecommitAction() {

    companion object { 
        val All = IamPolicy.Action("codecommit:*")    
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_BatchGetRepositories.html 
        //  Returns information about one or more repositories.    
        val BatchGetRepositories = _BatchGetRepositories() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_CreateBranch.html 
        //  Creates a new branch in a repository and points the branch to a commit.    
        val CreateBranch = _CreateBranch() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_CreateRepository.html 
        //  Creates a new, empty repository.    
        val CreateRepository = _CreateRepository() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_DeleteRepository.html 
        //  Deletes a repository.    
        val DeleteRepository = _DeleteRepository() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetBlob.html 
        //  ???    
        val GetBlob = _GetBlob() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetBranch.html 
        //  Returns information about a repository branch, including its name and the last commit ID.    
        val GetBranch = _GetBranch() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetObjectIdentifier.html 
        //  ???    
        val GetObjectIdentifier = _GetObjectIdentifier() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetRepository.html 
        //  Returns information about a repository.    
        val GetRepository = _GetRepository() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetTree.html 
        //  ???    
        val GetTree = _GetTree() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_codecommit.html 
        //  Pull information from an AWS CodeCommit repository to a local repo. This is an IAM policy permission only, not an API action that can be called.    
        val GitPull = _GitPull() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_codecommit.html 
        //  Push information from a local repo to an AWS CodeCommit repository. This is an IAM policy permission only, not an API action that can be called.    
        val GitPush = _GitPush() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_ListBranches.html 
        //  Gets information about one or more branches in a repository.    
        val ListBranches = _ListBranches() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_ListRepositories.html 
        //  Gets information about one or more repositories.    
        val ListRepositories = _ListRepositories() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_UpdateDefaultBranch.html 
        //  Sets or changes the default branch name for the specified repository.    
        val UpdateDefaultBranch = _UpdateDefaultBranch() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_UpdateRepositoryDescription.html 
        //  Sets or changes the comment or description for a repository.    
        val UpdateRepositoryDescription = _UpdateRepositoryDescription() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_UpdateRepositoryName.html 
        //  Renames a repository.    
        val UpdateRepositoryName = _UpdateRepositoryName() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetCommit.html 
        //  Returns information about a commit, including commit message and committer information.    
        val GetCommit = _GetCommit() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_Operations.html 
        //  ???    
        val GetCommitHistory = _GetCommitHistory() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_Operations.html 
        //  ???    
        val GetReferences = _GetReferences() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_GetRepositoryTriggers.html 
        //  Gets information about triggers configured for a repository.    
        val GetRepositoryTriggers = _GetRepositoryTriggers() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_PutRepositoryTriggers.html 
        //  Replaces all triggers for a repository.    
        val PutRepositoryTriggers = _PutRepositoryTriggers() 
        // see http://docs.aws.amazon.com/codecommit/latest/APIReference/API_TestRepositoryTriggers.html 
        //  Tests the functionality of repository triggers by sending information to the trigger target.    
        val TestRepositoryTriggers = _TestRepositoryTriggers() 
        // see http://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-permissions-reference.html 
        //  Upload repository changes into a pipeline.    
        val UploadArchive = _UploadArchive() 
        // see http://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-permissions-reference.html 
        //  Determine the status of an archive upload.    
        val GetUploadArchiveStatus = _GetUploadArchiveStatus() 
        // see http://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-permissions-reference.html 
        //  Cancel the uploading of an archive to a pipeline.    
        val CancelUploadArchive = _CancelUploadArchive()
    }
      class _BatchGetRepositories : IamPolicy.Action("codecommit:BatchGetRepositories") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _CreateBranch : IamPolicy.Action("codecommit:CreateBranch") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _CreateRepository : IamPolicy.Action("codecommit:CreateRepository") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _DeleteRepository : IamPolicy.Action("codecommit:DeleteRepository") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetBlob : IamPolicy.Action("codecommit:GetBlob") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetBranch : IamPolicy.Action("codecommit:GetBranch") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetObjectIdentifier : IamPolicy.Action("codecommit:GetObjectIdentifier") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetRepository : IamPolicy.Action("codecommit:GetRepository") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetTree : IamPolicy.Action("codecommit:GetTree") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GitPull : IamPolicy.Action("codecommit:GitPull") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GitPush : IamPolicy.Action("codecommit:GitPush") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _ListBranches : IamPolicy.Action("codecommit:ListBranches") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _ListRepositories : IamPolicy.Action("codecommit:ListRepositories") {

         }       
 
      class _UpdateDefaultBranch : IamPolicy.Action("codecommit:UpdateDefaultBranch") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _UpdateRepositoryDescription : IamPolicy.Action("codecommit:UpdateRepositoryDescription") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _UpdateRepositoryName : IamPolicy.Action("codecommit:UpdateRepositoryName") {
             //arn:aws:codecommit:$region:$account:$old-repository-name"
            fun byRegionAccountOldrepositoryname(region: String, account: String, oldrepositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$oldrepositoryname")
             //arn:aws:codecommit:$region:$account:$new-repository-name"
            fun byRegionAccountNewrepositoryname(region: String, account: String, newrepositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$newrepositoryname")
         }       
 
      class _GetCommit : IamPolicy.Action("codecommit:GetCommit") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetCommitHistory : IamPolicy.Action("codecommit:GetCommitHistory") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetReferences : IamPolicy.Action("codecommit:GetReferences") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetRepositoryTriggers : IamPolicy.Action("codecommit:GetRepositoryTriggers") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _PutRepositoryTriggers : IamPolicy.Action("codecommit:PutRepositoryTriggers") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _TestRepositoryTriggers : IamPolicy.Action("codecommit:TestRepositoryTriggers") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _UploadArchive : IamPolicy.Action("codecommit:UploadArchive") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _GetUploadArchiveStatus : IamPolicy.Action("codecommit:GetUploadArchiveStatus") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       
 
      class _CancelUploadArchive : IamPolicy.Action("codecommit:CancelUploadArchive") {
             //arn:aws:codecommit:$region:$account:$repository-name"
            fun byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:codecommit:$region:$account:$repositoryname")
         }       


}        
