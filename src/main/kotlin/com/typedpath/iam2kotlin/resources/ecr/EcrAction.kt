
package com.typedpath.iam2kotlin.resources.ecr

import com.typedpath.iam2kotlin.IamPolicy

class EcrAction() {

    companion object { 
        val All = IamPolicy.Action("ecr:*")    
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_BatchCheckLayerAvailability.html 
        //  Check the availability of multiple image layers in a specified registry and repository.    
        val BatchCheckLayerAvailability = _BatchCheckLayerAvailability() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_BatchDeleteImage.html 
        //  Deletes a list of specified images within a specified repository.    
        val BatchDeleteImage = _BatchDeleteImage() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_BatchGetImage.html 
        //  Gets detailed information for specified images within a specified repository.    
        val BatchGetImage = _BatchGetImage() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_CompleteLayerUpload.html 
        //  Inform Amazon ECR that the image layer upload for a specified registry, repository name, and upload ID, has completed.    
        val CompleteLayerUpload = _CompleteLayerUpload() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_CreateRepository.html 
        //  Creates an image repository.    
        val CreateRepository = _CreateRepository() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_DeleteRepository.html 
        //  Deletes an existing image repository.    
        val DeleteRepository = _DeleteRepository() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_DeleteRepositoryPolicy.html 
        //  Deletes the repository policy from a specified repository.    
        val DeleteRepositoryPolicy = _DeleteRepositoryPolicy() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_DescribeImages.html 
        //  Describes images in a repository.    
        val DescribeImages = _DescribeImages() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_DescribeRepositories.html 
        //  Describes image repositories in a registry.    
        val DescribeRepositories = _DescribeRepositories() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_GetAuthorizationToken.html 
        //  Retrieves a token that is valid for a specified registry for 12 hours.    
        val GetAuthorizationToken = _GetAuthorizationToken() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_GetDownloadUrlForLayer.html 
        //  Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer.    
        val GetDownloadUrlForLayer = _GetDownloadUrlForLayer() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_GetRepositoryPolicy.html 
        //  Retrieves the repository policy for a specified repository.    
        val GetRepositoryPolicy = _GetRepositoryPolicy() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_InitiateLayerUpload.html 
        //  Notify Amazon ECR that you intend to upload an image layer.    
        val InitiateLayerUpload = _InitiateLayerUpload() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ListImages.html 
        //  Lists all the image IDs for a given repository.    
        val ListImages = _ListImages() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_PutImage.html 
        //  Creates or updates the image manifest associated with an image.    
        val PutImage = _PutImage() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_SetRepositoryPolicy.html 
        //  Applies a repository policy on a specified repository to control access permissions.    
        val SetRepositoryPolicy = _SetRepositoryPolicy() 
        // see http://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_UploadLayerPart.html 
        //  Uploads an image layer part to Amazon ECR.    
        val UploadLayerPart = _UploadLayerPart()
    }
      class _BatchCheckLayerAvailability : IamPolicy.Action("ecr:BatchCheckLayerAvailability") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _BatchDeleteImage : IamPolicy.Action("ecr:BatchDeleteImage") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _BatchGetImage : IamPolicy.Action("ecr:BatchGetImage") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _CompleteLayerUpload : IamPolicy.Action("ecr:CompleteLayerUpload") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _CreateRepository : IamPolicy.Action("ecr:CreateRepository") {

         }       
 
      class _DeleteRepository : IamPolicy.Action("ecr:DeleteRepository") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _DeleteRepositoryPolicy : IamPolicy.Action("ecr:DeleteRepositoryPolicy") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _DescribeImages : IamPolicy.Action("ecr:DescribeImages") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _DescribeRepositories : IamPolicy.Action("ecr:DescribeRepositories") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _GetAuthorizationToken : IamPolicy.Action("ecr:GetAuthorizationToken") {

         }       
 
      class _GetDownloadUrlForLayer : IamPolicy.Action("ecr:GetDownloadUrlForLayer") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _GetRepositoryPolicy : IamPolicy.Action("ecr:GetRepositoryPolicy") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _InitiateLayerUpload : IamPolicy.Action("ecr:InitiateLayerUpload") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _ListImages : IamPolicy.Action("ecr:ListImages") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _PutImage : IamPolicy.Action("ecr:PutImage") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _SetRepositoryPolicy : IamPolicy.Action("ecr:SetRepositoryPolicy") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       
 
      class _UploadLayerPart : IamPolicy.Action("ecr:UploadLayerPart") {
             //arn:aws:ecr:$region:$account:repository/$repository-name"
            fun repository_byRegionAccountRepositoryname(region: String, account: String, repositoryname: String) = IamPolicy.Resource("arn:aws:ecr:$region:$account:repository/$repositoryname")
         }       


}        
