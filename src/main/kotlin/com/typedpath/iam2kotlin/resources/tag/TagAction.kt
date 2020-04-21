
package com.typedpath.iam2kotlin.resources.tag

import com.typedpath.iam2kotlin.IamPolicy

class TagAction() {

    companion object { 
        val All = IamPolicy.Action("tag:*")    
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_AddResourceTags.html 
        //  .    
        val AddResourceTags = _AddResourceTags() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html 
        //  Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account.    
        val GetResources = _GetResources() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetTagKeys.html 
        //  Returns all tag keys in the specified region for the AWS account.    
        val GetTagKeys = _GetTagKeys() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetTagValues.html 
        //  Returns all tag values for the specified key in the specified region for the AWS account.    
        val GetTagValues = _GetTagValues() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_RemoveResourceTags.html 
        //  .    
        val RemoveResourceTags = _RemoveResourceTags() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_TagResources.html 
        //  Applies one or more tags to the specified resources.    
        val TagResources = _TagResources() 
        // see http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_UntagResources.html 
        //  Removes the specified tags from the specified resources.    
        val UntagResources = _UntagResources()
    }
      class _AddResourceTags : IamPolicy.Action("tag:AddResourceTags") {

         }       
 
      class _GetResources : IamPolicy.Action("tag:GetResources") {

         }       
 
      class _GetTagKeys : IamPolicy.Action("tag:GetTagKeys") {

         }       
 
      class _GetTagValues : IamPolicy.Action("tag:GetTagValues") {

         }       
 
      class _RemoveResourceTags : IamPolicy.Action("tag:RemoveResourceTags") {

         }       
 
      class _TagResources : IamPolicy.Action("tag:TagResources") {

         }       
 
      class _UntagResources : IamPolicy.Action("tag:UntagResources") {

         }       


}        
