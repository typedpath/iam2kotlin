
package com.typedpath.iam2kotlin.resources.elasticbeanstalk

import com.typedpath.iam2kotlin.IamPolicy

class ElasticbeanstalkAction() {

    companion object { 
        val All = IamPolicy.Action("elasticbeanstalk:*")    
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_AbortEnvironmentUpdate.html 
        //  Cancels in-progress environment configuration update or application version deployment.    
        val AbortEnvironmentUpdate = _AbortEnvironmentUpdate() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CheckDNSAvailability.html 
        //  Checks if the specified CNAME is available.    
        val CheckDNSAvailability = _CheckDNSAvailability() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ComposeEnvironments.html 
        //  Create or update a group of environments that each run a separate component of a single application.    
        val ComposeEnvironments = _ComposeEnvironments() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CreateApplication.html 
        //  Creates an application that has one configuration template named default and no application versions.    
        val CreateApplication = _CreateApplication() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CreateApplicationVersion.html 
        //  Creates an application version for the specified application.    
        val CreateApplicationVersion = _CreateApplicationVersion() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CreateConfigurationTemplate.html 
        //  Creates a configuration template.    
        val CreateConfigurationTemplate = _CreateConfigurationTemplate() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CreateEnvironment.html 
        //  Launches an environment for the specified application using the specified configuration.    
        val CreateEnvironment = _CreateEnvironment() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_CreateStorageLocation.html 
        //  Creates the Amazon S3 storage location for the account.    
        val CreateStorageLocation = _CreateStorageLocation() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DeleteApplication.html 
        //  Deletes the specified application along with all associated versions and configurations.    
        val DeleteApplication = _DeleteApplication() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DeleteApplicationVersion.html 
        //  Deletes the specified version from the specified application.    
        val DeleteApplicationVersion = _DeleteApplicationVersion() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DeleteConfigurationTemplate.html 
        //  Deletes the specified configuration template.    
        val DeleteConfigurationTemplate = _DeleteConfigurationTemplate() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DeleteEnvironmentConfiguration.html 
        //  Deletes the draft configuration associated with the running environment.    
        val DeleteEnvironmentConfiguration = _DeleteEnvironmentConfiguration() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeApplicationVersions.html 
        //  Retrieve a list of application versions stored in your AWS Elastic Beanstalk storage bucket.    
        val DescribeApplicationVersions = _DescribeApplicationVersions() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeApplications.html 
        //  Returns the descriptions of existing applications.    
        val DescribeApplications = _DescribeApplications() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeConfigurationOptions.html 
        //  Describes the configuration options that are used in a particular configuration template or environment, or that a specified solution stack defines.    
        val DescribeConfigurationOptions = _DescribeConfigurationOptions() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeConfigurationSettings.html 
        //  Returns a description of the settings for the specified configuration set, that is, either a configuration template or the configuration set associated with a running environment.    
        val DescribeConfigurationSettings = _DescribeConfigurationSettings() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironmentHealth.html 
        //  Returns information about the overall health of the specified environment.    
        val DescribeEnvironmentHealth = _DescribeEnvironmentHealth() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironmentResources.html 
        //  Returns AWS resources for this environment.    
        val DescribeEnvironmentResources = _DescribeEnvironmentResources() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html 
        //  Returns descriptions for existing environments.    
        val DescribeEnvironments = _DescribeEnvironments() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEvents.html 
        //  Returns list of event descriptions matching criteria up to the last 6 weeks.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeInstancesHealth.html 
        //  Returns more detailed information about the health of the specified instances (for example, CPU utilization, load average, and causes).    
        val DescribeInstancesHealth = _DescribeInstancesHealth() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html 
        //  Returns a list of the available solution stack names.    
        val ListAvailableSolutionStacks = _ListAvailableSolutionStacks() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_RebuildEnvironment.html 
        //  Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.    
        val RebuildEnvironment = _RebuildEnvironment() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_RequestEnvironmentInfo.html 
        //  Initiates a request to compile the specified type of information of the deployed environment.    
        val RequestEnvironmentInfo = _RequestEnvironmentInfo() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_RestartAppServer.html 
        //  Causes the environment to restart the application container server running on each Amazon EC2 instance.    
        val RestartAppServer = _RestartAppServer() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_RetrieveEnvironmentInfo.html 
        //  Retrieves the compiled information from a RequestEnvironmentInfo request.    
        val RetrieveEnvironmentInfo = _RetrieveEnvironmentInfo() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_SwapEnvironmentCNAMEs.html 
        //  Swaps the CNAMEs of two environments.    
        val SwapEnvironmentCNAMEs = _SwapEnvironmentCNAMEs() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_TerminateEnvironment.html 
        //  Terminates the specified environment.    
        val TerminateEnvironment = _TerminateEnvironment() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_UpdateApplication.html 
        //  Updates the specified application to have the specified properties.    
        val UpdateApplication = _UpdateApplication() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_UpdateApplicationVersion.html 
        //  Updates the specified application version to have the specified properties.    
        val UpdateApplicationVersion = _UpdateApplicationVersion() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_UpdateConfigurationTemplate.html 
        //  Updates the specified configuration template to have the specified properties or configuration option values.    
        val UpdateConfigurationTemplate = _UpdateConfigurationTemplate() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_UpdateEnvironment.html 
        //  Updates the environment description, deploys a new application version, updates the configuration settings to an entirely new configuration template, or updates select configuration option values in the running environment.    
        val UpdateEnvironment = _UpdateEnvironment() 
        // see http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ValidateConfigurationSettings.html 
        //  Takes a set of configuration settings and either a configuration template or environment, and determines whether those values are valid.    
        val ValidateConfigurationSettings = _ValidateConfigurationSettings()
    }
      class _AbortEnvironmentUpdate : IamPolicy.Action("elasticbeanstalk:AbortEnvironmentUpdate") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _CheckDNSAvailability : IamPolicy.Action("elasticbeanstalk:CheckDNSAvailability") {

         }       
 
      class _ComposeEnvironments : IamPolicy.Action("elasticbeanstalk:ComposeEnvironments") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
         }       
 
      class _CreateApplication : IamPolicy.Action("elasticbeanstalk:CreateApplication") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
         }       
 
      class _CreateApplicationVersion : IamPolicy.Action("elasticbeanstalk:CreateApplicationVersion") {
             //arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel"
            fun applicationversion_byRegionAccountApplicationnameVersionlabel(region: String, account: String, applicationname: String, versionlabel: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel")
         }       
 
      class _CreateConfigurationTemplate : IamPolicy.Action("elasticbeanstalk:CreateConfigurationTemplate") {
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
         }       
 
      class _CreateEnvironment : IamPolicy.Action("elasticbeanstalk:CreateEnvironment") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _CreateStorageLocation : IamPolicy.Action("elasticbeanstalk:CreateStorageLocation") {

         }       
 
      class _DeleteApplication : IamPolicy.Action("elasticbeanstalk:DeleteApplication") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
         }       
 
      class _DeleteApplicationVersion : IamPolicy.Action("elasticbeanstalk:DeleteApplicationVersion") {
             //arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel"
            fun applicationversion_byRegionAccountApplicationnameVersionlabel(region: String, account: String, applicationname: String, versionlabel: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel")
         }       
 
      class _DeleteConfigurationTemplate : IamPolicy.Action("elasticbeanstalk:DeleteConfigurationTemplate") {
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
         }       
 
      class _DeleteEnvironmentConfiguration : IamPolicy.Action("elasticbeanstalk:DeleteEnvironmentConfiguration") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _DescribeApplicationVersions : IamPolicy.Action("elasticbeanstalk:DescribeApplicationVersions") {
             //arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel"
            fun applicationversion_byRegionAccountApplicationnameVersionlabel(region: String, account: String, applicationname: String, versionlabel: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel")
         }       
 
      class _DescribeApplications : IamPolicy.Action("elasticbeanstalk:DescribeApplications") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
         }       
 
      class _DescribeConfigurationOptions : IamPolicy.Action("elasticbeanstalk:DescribeConfigurationOptions") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
             //arn:aws:elasticbeanstalk:$region::solutionstack/$solutionstackname"
            fun solutionstack_byRegionSolutionstackname(region: String, solutionstackname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region::solutionstack/$solutionstackname")
         }       
 
      class _DescribeConfigurationSettings : IamPolicy.Action("elasticbeanstalk:DescribeConfigurationSettings") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
         }       
 
      class _DescribeEnvironmentHealth : IamPolicy.Action("elasticbeanstalk:DescribeEnvironmentHealth") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _DescribeEnvironmentResources : IamPolicy.Action("elasticbeanstalk:DescribeEnvironmentResources") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _DescribeEnvironments : IamPolicy.Action("elasticbeanstalk:DescribeEnvironments") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _DescribeEvents : IamPolicy.Action("elasticbeanstalk:DescribeEvents") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
             //arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel"
            fun applicationversion_byRegionAccountApplicationnameVersionlabel(region: String, account: String, applicationname: String, versionlabel: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel")
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _DescribeInstancesHealth : IamPolicy.Action("elasticbeanstalk:DescribeInstancesHealth") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _ListAvailableSolutionStacks : IamPolicy.Action("elasticbeanstalk:ListAvailableSolutionStacks") {
             //arn:aws:elasticbeanstalk:$region::solutionstack/$solutionstackname"
            fun solutionstack_byRegionSolutionstackname(region: String, solutionstackname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region::solutionstack/$solutionstackname")
         }       
 
      class _RebuildEnvironment : IamPolicy.Action("elasticbeanstalk:RebuildEnvironment") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _RequestEnvironmentInfo : IamPolicy.Action("elasticbeanstalk:RequestEnvironmentInfo") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _RestartAppServer : IamPolicy.Action("elasticbeanstalk:RestartAppServer") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _RetrieveEnvironmentInfo : IamPolicy.Action("elasticbeanstalk:RetrieveEnvironmentInfo") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _SwapEnvironmentCNAMEs : IamPolicy.Action("elasticbeanstalk:SwapEnvironmentCNAMEs") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _TerminateEnvironment : IamPolicy.Action("elasticbeanstalk:TerminateEnvironment") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _UpdateApplication : IamPolicy.Action("elasticbeanstalk:UpdateApplication") {
             //arn:aws:elasticbeanstalk:$region:$account:application/$applicationname"
            fun application_byRegionAccountApplicationname(region: String, account: String, applicationname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:application/$applicationname")
         }       
 
      class _UpdateApplicationVersion : IamPolicy.Action("elasticbeanstalk:UpdateApplicationVersion") {
             //arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel"
            fun applicationversion_byRegionAccountApplicationnameVersionlabel(region: String, account: String, applicationname: String, versionlabel: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:applicationversion/$applicationname/$versionlabel")
         }       
 
      class _UpdateConfigurationTemplate : IamPolicy.Action("elasticbeanstalk:UpdateConfigurationTemplate") {
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
         }       
 
      class _UpdateEnvironment : IamPolicy.Action("elasticbeanstalk:UpdateEnvironment") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
         }       
 
      class _ValidateConfigurationSettings : IamPolicy.Action("elasticbeanstalk:ValidateConfigurationSettings") {
             //arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname"
            fun environment_byRegionAccountApplicationnameEnvironmentname(region: String, account: String, applicationname: String, environmentname: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:environment/$applicationname/$environmentname")
             //arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename"
            fun configurationtemplate_byRegionAccountApplicationnameTemplatename(region: String, account: String, applicationname: String, templatename: String) = IamPolicy.Resource("arn:aws:elasticbeanstalk:$region:$account:configurationtemplate/$applicationname/$templatename")
         }       


}        
