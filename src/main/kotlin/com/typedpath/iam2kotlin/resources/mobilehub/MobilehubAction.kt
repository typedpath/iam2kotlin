
package com.typedpath.iam2kotlin.resources.mobilehub

import com.typedpath.iam2kotlin.IamPolicy

class MobilehubAction() {

    companion object { 
        val All = IamPolicy.Action("mobilehub:*")    
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val CreateProject = _CreateProject() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val CreateServiceRole = _CreateServiceRole() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val DeleteProject = _DeleteProject() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val GenerateProjectParameters = _GenerateProjectParameters() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val GetProject = _GetProject() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val ListAvailableFeatures = _ListAvailableFeatures() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val ListAvailableRegions = _ListAvailableRegions() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val ListProjects = _ListProjects() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val UpdateProject = _UpdateProject() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val ValidateProject = _ValidateProject() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_mobilehub.html 
        //  ???    
        val VerifyServiceRole = _VerifyServiceRole()
    }
      class _CreateProject : IamPolicy.Action("mobilehub:CreateProject") {

         }       
 
      class _CreateServiceRole : IamPolicy.Action("mobilehub:CreateServiceRole") {

         }       
 
      class _DeleteProject : IamPolicy.Action("mobilehub:DeleteProject") {

         }       
 
      class _GenerateProjectParameters : IamPolicy.Action("mobilehub:GenerateProjectParameters") {

         }       
 
      class _GetProject : IamPolicy.Action("mobilehub:GetProject") {

         }       
 
      class _ListAvailableFeatures : IamPolicy.Action("mobilehub:ListAvailableFeatures") {

         }       
 
      class _ListAvailableRegions : IamPolicy.Action("mobilehub:ListAvailableRegions") {

         }       
 
      class _ListProjects : IamPolicy.Action("mobilehub:ListProjects") {

         }       
 
      class _UpdateProject : IamPolicy.Action("mobilehub:UpdateProject") {

         }       
 
      class _ValidateProject : IamPolicy.Action("mobilehub:ValidateProject") {

         }       
 
      class _VerifyServiceRole : IamPolicy.Action("mobilehub:VerifyServiceRole") {

         }       


}        
