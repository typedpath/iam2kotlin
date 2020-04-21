
package com.typedpath.iam2kotlin.resources.codebuild

import com.typedpath.iam2kotlin.IamPolicy

class CodebuildAction() {

    companion object { 
        val All = IamPolicy.Action("codebuild:*")    
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_BatchGetBuilds.html 
        //  Gets information about builds.    
        val BatchGetBuilds = _BatchGetBuilds() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_BatchGetProjects.html 
        //  Gets information about build projects.    
        val BatchGetProjects = _BatchGetProjects() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_CreateProject.html 
        //  Creates a build project.    
        val CreateProject = _CreateProject() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteProject.html 
        //  Deletes a build project.    
        val DeleteProject = _DeleteProject() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListBuilds.html 
        //  Gets a list of build IDs, with each build ID representing a single build.    
        val ListBuilds = _ListBuilds() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListBuildsForProject.html 
        //  Gets a list of build IDs for the specified build project, with each build ID representing a single build.    
        val ListBuildsForProject = _ListBuildsForProject() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListCuratedEnvironmentImages.html 
        //  Gets information about Docker images that are managed by AWS CodeBuild.    
        val ListCuratedEnvironmentImages = _ListCuratedEnvironmentImages() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListConnectedOAuthAccounts.html 
        //  ???    
        val ListConnectedOAuthAccounts = _ListConnectedOAuthAccounts() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListProjects.html 
        //  Gets a list of build project names, with each build project name representing a single build project.    
        val ListProjects = _ListProjects() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListRepositories.html 
        //  ???    
        val ListRepositories = _ListRepositories() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_PersistOAuthToken.html 
        //  ???    
        val PersistOAuthToken = _PersistOAuthToken() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_StartBuild.html 
        //  Starts running a build.    
        val StartBuild = _StartBuild() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_StopBuild.html 
        //  Attempts to stop running a build.    
        val StopBuild = _StopBuild() 
        // see http://docs.aws.amazon.com/codebuild/latest/APIReference/API_UpdateProject.html 
        //  Changes the settings of a build project.    
        val UpdateProject = _UpdateProject()
    }
      class _BatchGetBuilds : IamPolicy.Action("codebuild:BatchGetBuilds") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _BatchGetProjects : IamPolicy.Action("codebuild:BatchGetProjects") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _CreateProject : IamPolicy.Action("codebuild:CreateProject") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _DeleteProject : IamPolicy.Action("codebuild:DeleteProject") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _ListBuilds : IamPolicy.Action("codebuild:ListBuilds") {

         }       
 
      class _ListBuildsForProject : IamPolicy.Action("codebuild:ListBuildsForProject") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _ListCuratedEnvironmentImages : IamPolicy.Action("codebuild:ListCuratedEnvironmentImages") {

         }       
 
      class _ListConnectedOAuthAccounts : IamPolicy.Action("codebuild:ListConnectedOAuthAccounts") {

         }       
 
      class _ListProjects : IamPolicy.Action("codebuild:ListProjects") {

         }       
 
      class _ListRepositories : IamPolicy.Action("codebuild:ListRepositories") {

         }       
 
      class _PersistOAuthToken : IamPolicy.Action("codebuild:PersistOAuthToken") {

         }       
 
      class _StartBuild : IamPolicy.Action("codebuild:StartBuild") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _StopBuild : IamPolicy.Action("codebuild:StopBuild") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       
 
      class _UpdateProject : IamPolicy.Action("codebuild:UpdateProject") {
             //arn:aws:codebuild:$region:$account:project/$project-name"
            fun project_byRegionAccountProjectname(region: String, account: String, projectname: String) = IamPolicy.Resource("arn:aws:codebuild:$region:$account:project/$projectname")
         }       


}        
