
package com.typedpath.iam2kotlin.resources.workspaces

import com.typedpath.iam2kotlin.IamPolicy

class WorkspacesAction() {

    companion object { 
        val All = IamPolicy.Action("workspaces:*")    
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_CreateWorkspaces.html 
        //  Creates one or more WorkSpaces.    
        val CreateWorkspaces = _CreateWorkspaces() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_DescribeWorkspaceBundles.html 
        //  Obtains information about the WorkSpace bundles that are available to your account in the specified region.    
        val DescribeWorkspaceBundles = _DescribeWorkspaceBundles() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_DescribeWorkspaceDirectories.html 
        //  Retrieves information about the AWS Directory Service directories in the region that are registered with Amazon WorkSpaces and are available to your account.    
        val DescribeWorkspaceDirectories = _DescribeWorkspaceDirectories() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_DescribeWorkspaces.html 
        //  Obtains information about the specified WorkSpaces.    
        val DescribeWorkspaces = _DescribeWorkspaces() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_RebootWorkspaces.html 
        //  Reboots the specified WorkSpaces.    
        val RebootWorkspaces = _RebootWorkspaces() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_RebuildWorkspaces.html 
        //  Rebuilds the specified WorkSpaces.    
        val RebuildWorkspaces = _RebuildWorkspaces() 
        // see http://docs.aws.amazon.com/workspaces/latest/devguide/API_TerminateWorkspaces.html 
        //  Terminates the specified WorkSpaces.    
        val TerminateWorkspaces = _TerminateWorkspaces()
    }
      class _CreateWorkspaces : IamPolicy.Action("workspaces:CreateWorkspaces") {

         }       
 
      class _DescribeWorkspaceBundles : IamPolicy.Action("workspaces:DescribeWorkspaceBundles") {

         }       
 
      class _DescribeWorkspaceDirectories : IamPolicy.Action("workspaces:DescribeWorkspaceDirectories") {

         }       
 
      class _DescribeWorkspaces : IamPolicy.Action("workspaces:DescribeWorkspaces") {

         }       
 
      class _RebootWorkspaces : IamPolicy.Action("workspaces:RebootWorkspaces") {

         }       
 
      class _RebuildWorkspaces : IamPolicy.Action("workspaces:RebuildWorkspaces") {

         }       
 
      class _TerminateWorkspaces : IamPolicy.Action("workspaces:TerminateWorkspaces") {

         }       


}        
