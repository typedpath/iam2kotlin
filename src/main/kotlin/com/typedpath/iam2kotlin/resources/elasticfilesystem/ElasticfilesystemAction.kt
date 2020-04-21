
package com.typedpath.iam2kotlin.resources.elasticfilesystem

import com.typedpath.iam2kotlin.IamPolicy

class ElasticfilesystemAction() {

    companion object { 
        val All = IamPolicy.Action("elasticfilesystem:*")    
        // see http://docs.aws.amazon.com/efs/latest/ug/API_CreateFileSystem.html 
        //  Creates a new, empty file system.    
        val CreateFileSystem = _CreateFileSystem() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_CreateTags.html 
        //  Creates or overwrites tags associated with a file system.    
        val CreateTags = _CreateTags() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DescribeTags.html 
        //  Returns the tags associated with a file system.    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DeleteTags.html 
        //  Deletes the specified tags from a file system.    
        val DeleteTags = _DeleteTags() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_CreateMountTarget.html 
        //  Creates a mount target for a file system.    
        val CreateMountTarget = _CreateMountTarget() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_ModifyMountTargetSecurityGroups.html 
        //  Modifies the set of security groups in effect for a mount target.    
        val ModifyMountTargetSecurityGroups = _ModifyMountTargetSecurityGroups() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DescribeMountTargetSecurityGroups.html 
        //  Returns the security groups currently in effect for a mount target.    
        val DescribeMountTargetSecurityGroups = _DescribeMountTargetSecurityGroups() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DescribeFileSystems.html 
        //  Returns the description of a specific Amazon EFS file system if either the file system CreationToken or the FileSystemId is provided.    
        val DescribeFileSystems = _DescribeFileSystems() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DescribeMountTargets.html 
        //  Returns the descriptions of all the current mount targets, or a specific mount target, for a file system.    
        val DescribeMountTargets = _DescribeMountTargets() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DeleteMountTarget.html 
        //  Deletes the specified mount target.    
        val DeleteMountTarget = _DeleteMountTarget() 
        // see http://docs.aws.amazon.com/efs/latest/ug/API_DeleteFileSystem.html 
        //  Deletes a file system, permanently severing access to its contents.    
        val DeleteFileSystem = _DeleteFileSystem()
    }
      class _CreateFileSystem : IamPolicy.Action("elasticfilesystem:CreateFileSystem") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/*"
            fun filesystem_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/*")
         }       
 
      class _CreateTags : IamPolicy.Action("elasticfilesystem:CreateTags") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DescribeTags : IamPolicy.Action("elasticfilesystem:DescribeTags") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DeleteTags : IamPolicy.Action("elasticfilesystem:DeleteTags") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _CreateMountTarget : IamPolicy.Action("elasticfilesystem:CreateMountTarget") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _ModifyMountTargetSecurityGroups : IamPolicy.Action("elasticfilesystem:ModifyMountTargetSecurityGroups") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DescribeMountTargetSecurityGroups : IamPolicy.Action("elasticfilesystem:DescribeMountTargetSecurityGroups") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DescribeFileSystems : IamPolicy.Action("elasticfilesystem:DescribeFileSystems") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
             //arn:aws:elasticfilesystem:$region:$account:file-system/*"
            fun filesystem_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/*")
         }       
 
      class _DescribeMountTargets : IamPolicy.Action("elasticfilesystem:DescribeMountTargets") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DeleteMountTarget : IamPolicy.Action("elasticfilesystem:DeleteMountTarget") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       
 
      class _DeleteFileSystem : IamPolicy.Action("elasticfilesystem:DeleteFileSystem") {
             //arn:aws:elasticfilesystem:$region:$account:file-system/$filesystem-id"
            fun filesystem_byRegionAccountFilesystemid(region: String, account: String, filesystemid: String) = IamPolicy.Resource("arn:aws:elasticfilesystem:$region:$account:file-system/$filesystemid")
         }       


}        
