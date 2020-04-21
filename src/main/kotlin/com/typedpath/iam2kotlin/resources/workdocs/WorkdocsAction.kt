
package com.typedpath.iam2kotlin.resources.workdocs

import com.typedpath.iam2kotlin.IamPolicy

class WorkdocsAction() {

    companion object { 
        val All = IamPolicy.Action("workdocs:*")    
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val ActivateUser = _ActivateUser() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val AddUserToGroup = _AddUserToGroup() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val CheckAlias = _CheckAlias() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val CreateInstance = _CreateInstance() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val DeactivateUser = _DeactivateUser() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val DeleteInstance = _DeleteInstance() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val DeregisterDirectory = _DeregisterDirectory() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val DescribeAvailableDirectories = _DescribeAvailableDirectories() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val DescribeInstances = _DescribeInstances() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val RegisterDirectory = _RegisterDirectory() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val RemoveUserFromGroup = _RemoveUserFromGroup() 
        // see http://docs.aws.amazon.com/workdocs/latest/adminguide/setting_up.html#iam_policies 
        //  ???    
        val UpdateInstanceAlias = _UpdateInstanceAlias()
    }
      class _ActivateUser : IamPolicy.Action("workdocs:ActivateUser") {

         }       
 
      class _AddUserToGroup : IamPolicy.Action("workdocs:AddUserToGroup") {

         }       
 
      class _CheckAlias : IamPolicy.Action("workdocs:CheckAlias") {

         }       
 
      class _CreateInstance : IamPolicy.Action("workdocs:CreateInstance") {

         }       
 
      class _DeactivateUser : IamPolicy.Action("workdocs:DeactivateUser") {

         }       
 
      class _DeleteInstance : IamPolicy.Action("workdocs:DeleteInstance") {

         }       
 
      class _DeregisterDirectory : IamPolicy.Action("workdocs:DeregisterDirectory") {

         }       
 
      class _DescribeAvailableDirectories : IamPolicy.Action("workdocs:DescribeAvailableDirectories") {

         }       
 
      class _DescribeInstances : IamPolicy.Action("workdocs:DescribeInstances") {

         }       
 
      class _RegisterDirectory : IamPolicy.Action("workdocs:RegisterDirectory") {

         }       
 
      class _RemoveUserFromGroup : IamPolicy.Action("workdocs:RemoveUserFromGroup") {

         }       
 
      class _UpdateInstanceAlias : IamPolicy.Action("workdocs:UpdateInstanceAlias") {

         }       


}        
