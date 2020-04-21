
package com.typedpath.iam2kotlin.resources.appstream

import com.typedpath.iam2kotlin.IamPolicy

class AppstreamAction() {

    companion object { 
        val All = IamPolicy.Action("appstream:*")    
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val CreateApplication = _CreateApplication() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val CreateSession = _CreateSession() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val DeleteApplication = _DeleteApplication() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApiRoot = _GetApiRoot() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApplication = _GetApplication() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApplications = _GetApplications() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApplicationError = _GetApplicationError() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApplicationErrors = _GetApplicationErrors() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetApplicationStatus = _GetApplicationStatus() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetSession = _GetSession() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetSessions = _GetSessions() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val GetSessionStatus = _GetSessionStatus() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val UpdateApplication = _UpdateApplication() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val UpdateApplicationState = _UpdateApplicationState() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_appstream.html 
        //  ???    
        val UpdateSessionState = _UpdateSessionState()
    }
      class _CreateApplication : IamPolicy.Action("appstream:CreateApplication") {

         }       
 
      class _CreateSession : IamPolicy.Action("appstream:CreateSession") {

         }       
 
      class _DeleteApplication : IamPolicy.Action("appstream:DeleteApplication") {

         }       
 
      class _GetApiRoot : IamPolicy.Action("appstream:GetApiRoot") {

         }       
 
      class _GetApplication : IamPolicy.Action("appstream:GetApplication") {

         }       
 
      class _GetApplications : IamPolicy.Action("appstream:GetApplications") {

         }       
 
      class _GetApplicationError : IamPolicy.Action("appstream:GetApplicationError") {

         }       
 
      class _GetApplicationErrors : IamPolicy.Action("appstream:GetApplicationErrors") {

         }       
 
      class _GetApplicationStatus : IamPolicy.Action("appstream:GetApplicationStatus") {

         }       
 
      class _GetSession : IamPolicy.Action("appstream:GetSession") {

         }       
 
      class _GetSessions : IamPolicy.Action("appstream:GetSessions") {

         }       
 
      class _GetSessionStatus : IamPolicy.Action("appstream:GetSessionStatus") {

         }       
 
      class _UpdateApplication : IamPolicy.Action("appstream:UpdateApplication") {

         }       
 
      class _UpdateApplicationState : IamPolicy.Action("appstream:UpdateApplicationState") {

         }       
 
      class _UpdateSessionState : IamPolicy.Action("appstream:UpdateSessionState") {

         }       


}        
