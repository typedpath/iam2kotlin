
package com.typedpath.iam2kotlin.resources.cloudfront

import com.typedpath.iam2kotlin.IamPolicy

class CloudfrontAction() {

    companion object { 
        val All = IamPolicy.Action("cloudfront:*")    
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/CreateOAI.html 
        //  This action creates a new CloudFront origin access identity.    
        val CreateCloudFrontOriginAccessIdentity = _CreateCloudFrontOriginAccessIdentity() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/CreateDistribution.html 
        //  This action creates a new web distribution.    
        val CreateDistribution = _CreateDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/CreateInvalidation.html 
        //  This action creates a new invalidation batch request.    
        val CreateInvalidation = _CreateInvalidation() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/CreateStreamingDistribution.html 
        //  This action creates a new RTMP distribution.    
        val CreateStreamingDistribution = _CreateStreamingDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/DeleteOAI.html 
        //  This action deletes a CloudFront origin access identity.    
        val DeleteCloudFrontOriginAccessIdentity = _DeleteCloudFrontOriginAccessIdentity() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/DeleteDistribution.html 
        //  This action deletes a web distribution.    
        val DeleteDistribution = _DeleteDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/DeleteStreamingDistribution.html 
        //  This action deletes an RTMP distribution.    
        val DeleteStreamingDistribution = _DeleteStreamingDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetOAI.html 
        //  ???    
        val GetCloudFrontOriginAccessIdentity = _GetCloudFrontOriginAccessIdentity() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetOAIConfig.html 
        //  ???    
        val GetCloudFrontOriginAccessIdentityConfig = _GetCloudFrontOriginAccessIdentityConfig() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetDistribution.html 
        //  ???    
        val GetDistribution = _GetDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetConfig.html 
        //  ???    
        val GetDistributionConfig = _GetDistributionConfig() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetInvalidation.html 
        //  ???    
        val GetInvalidation = _GetInvalidation() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetStreamingDistribution.html 
        //  ???    
        val GetStreamingDistribution = _GetStreamingDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/GetStreamingDistConfig.html 
        //  ???    
        val GetStreamingDistributionConfig = _GetStreamingDistributionConfig() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/ListOAIs.html 
        //  ???    
        val ListCloudFrontOriginAccessIdentities = _ListCloudFrontOriginAccessIdentities() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/ListDistributions.html 
        //  ???    
        val ListDistributions = _ListDistributions() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_cloudfront.html 
        //  ???    
        val ListDistributionsByWebACLId = _ListDistributionsByWebACLId() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/ListInvalidation.html 
        //  ???    
        val ListInvalidations = _ListInvalidations() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/ListStreamingDistributions.html 
        //  ???    
        val ListStreamingDistributions = _ListStreamingDistributions() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/PutOAIConfig.html 
        //  This action sets the configuration for a CloudFront origin access identity.    
        val UpdateCloudFrontOriginAccessIdentity = _UpdateCloudFrontOriginAccessIdentity() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/PutConfig.html 
        //  This action updates the configuration for a web distribution.    
        val UpdateDistribution = _UpdateDistribution() 
        // see http://docs.aws.amazon.com/AmazonCloudFront/latest/APIReference/PutStreamingDistConfig.html 
        //  This action updates the configuration for an RTMP distribution.    
        val UpdateStreamingDistribution = _UpdateStreamingDistribution() 
        // see https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ListTagsForResource.html 
        //  List tags for a CloudFront resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_TagResource.html 
        //  Add tags to a CloudFront resource.    
        val TagResource = _TagResource() 
        // see https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UntagResource.html 
        //  Remove tags from a CloudFront resource.    
        val UntagResource = _UntagResource()
    }
      class _CreateCloudFrontOriginAccessIdentity : IamPolicy.Action("cloudfront:CreateCloudFrontOriginAccessIdentity") {

         }       
 
      class _CreateDistribution : IamPolicy.Action("cloudfront:CreateDistribution") {

         }       
 
      class _CreateInvalidation : IamPolicy.Action("cloudfront:CreateInvalidation") {

         }       
 
      class _CreateStreamingDistribution : IamPolicy.Action("cloudfront:CreateStreamingDistribution") {

         }       
 
      class _DeleteCloudFrontOriginAccessIdentity : IamPolicy.Action("cloudfront:DeleteCloudFrontOriginAccessIdentity") {

         }       
 
      class _DeleteDistribution : IamPolicy.Action("cloudfront:DeleteDistribution") {

         }       
 
      class _DeleteStreamingDistribution : IamPolicy.Action("cloudfront:DeleteStreamingDistribution") {

         }       
 
      class _GetCloudFrontOriginAccessIdentity : IamPolicy.Action("cloudfront:GetCloudFrontOriginAccessIdentity") {

         }       
 
      class _GetCloudFrontOriginAccessIdentityConfig : IamPolicy.Action("cloudfront:GetCloudFrontOriginAccessIdentityConfig") {

         }       
 
      class _GetDistribution : IamPolicy.Action("cloudfront:GetDistribution") {

         }       
 
      class _GetDistributionConfig : IamPolicy.Action("cloudfront:GetDistributionConfig") {

         }       
 
      class _GetInvalidation : IamPolicy.Action("cloudfront:GetInvalidation") {

         }       
 
      class _GetStreamingDistribution : IamPolicy.Action("cloudfront:GetStreamingDistribution") {

         }       
 
      class _GetStreamingDistributionConfig : IamPolicy.Action("cloudfront:GetStreamingDistributionConfig") {

         }       
 
      class _ListCloudFrontOriginAccessIdentities : IamPolicy.Action("cloudfront:ListCloudFrontOriginAccessIdentities") {

         }       
 
      class _ListDistributions : IamPolicy.Action("cloudfront:ListDistributions") {

         }       
 
      class _ListDistributionsByWebACLId : IamPolicy.Action("cloudfront:ListDistributionsByWebACLId") {

         }       
 
      class _ListInvalidations : IamPolicy.Action("cloudfront:ListInvalidations") {

         }       
 
      class _ListStreamingDistributions : IamPolicy.Action("cloudfront:ListStreamingDistributions") {

         }       
 
      class _UpdateCloudFrontOriginAccessIdentity : IamPolicy.Action("cloudfront:UpdateCloudFrontOriginAccessIdentity") {

         }       
 
      class _UpdateDistribution : IamPolicy.Action("cloudfront:UpdateDistribution") {

         }       
 
      class _UpdateStreamingDistribution : IamPolicy.Action("cloudfront:UpdateStreamingDistribution") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("cloudfront:ListTagsForResource") {

         }       
 
      class _TagResource : IamPolicy.Action("cloudfront:TagResource") {

         }       
 
      class _UntagResource : IamPolicy.Action("cloudfront:UntagResource") {

         }       


}        
