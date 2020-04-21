
package com.typedpath.iam2kotlin.resources.devicefarm

import com.typedpath.iam2kotlin.IamPolicy

class DevicefarmAction() {

    companion object { 
        val All = IamPolicy.Action("devicefarm:*")    
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_CreateDevicePool.html 
        //  Creates a device pool.    
        val CreateDevicePool = _CreateDevicePool() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_CreateProject.html 
        //  Creates a new project.    
        val CreateProject = _CreateProject() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_CreateUpload.html 
        //  Uploads an app or test scripts.    
        val CreateUpload = _CreateUpload() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetDevice.html 
        //  Gets information about a unique device type.    
        val GetDevice = _GetDevice() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetDevicePool.html 
        //  Gets information about a device pool.    
        val GetDevicePool = _GetDevicePool() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetDevicePoolCompatibility.html 
        //  Gets information about compatibility with a device pool.    
        val GetDevicePoolCompatibility = _GetDevicePoolCompatibility() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetJob.html 
        //  Gets information about a job.    
        val GetJob = _GetJob() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetProject.html 
        //  Gets information about a project.    
        val GetProject = _GetProject() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetRun.html 
        //  Gets information about a run.    
        val GetRun = _GetRun() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetSuite.html 
        //  Gets information about a suite.    
        val GetSuite = _GetSuite() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetTest.html 
        //  Gets information about a test.    
        val GetTest = _GetTest() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_GetUpload.html 
        //  Gets information about an upload.    
        val GetUpload = _GetUpload() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListArtifacts.html 
        //  Gets information about artifacts.    
        val ListArtifacts = _ListArtifacts() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListDevicePools.html 
        //  Gets information about device pools.    
        val ListDevicePools = _ListDevicePools() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListDevices.html 
        //  Gets information about unique device types.    
        val ListDevices = _ListDevices() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListJobs.html 
        //  Gets information about jobs.    
        val ListJobs = _ListJobs() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListProjects.html 
        //  Gets information about projects.    
        val ListProjects = _ListProjects() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListRuns.html 
        //  Gets information about runs.    
        val ListRuns = _ListRuns() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListSamples.html 
        //  Gets information about samples.    
        val ListSamples = _ListSamples() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListSuites.html 
        //  Gets information about suites.    
        val ListSuites = _ListSuites() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListTests.html 
        //  Gets information about tests.    
        val ListTests = _ListTests() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListUniqueProblems.html 
        //  Gets information about unique problems.    
        val ListUniqueProblems = _ListUniqueProblems() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ListUploads.html 
        //  Gets information about uploads.    
        val ListUploads = _ListUploads() 
        // see http://docs.aws.amazon.com/devicefarm/latest/APIReference/API_ScheduleRun.html 
        //  Schedules a run.    
        val ScheduleRun = _ScheduleRun()
    }
      class _CreateDevicePool : IamPolicy.Action("devicefarm:CreateDevicePool") {

         }       
 
      class _CreateProject : IamPolicy.Action("devicefarm:CreateProject") {

         }       
 
      class _CreateUpload : IamPolicy.Action("devicefarm:CreateUpload") {

         }       
 
      class _GetDevice : IamPolicy.Action("devicefarm:GetDevice") {

         }       
 
      class _GetDevicePool : IamPolicy.Action("devicefarm:GetDevicePool") {

         }       
 
      class _GetDevicePoolCompatibility : IamPolicy.Action("devicefarm:GetDevicePoolCompatibility") {

         }       
 
      class _GetJob : IamPolicy.Action("devicefarm:GetJob") {

         }       
 
      class _GetProject : IamPolicy.Action("devicefarm:GetProject") {

         }       
 
      class _GetRun : IamPolicy.Action("devicefarm:GetRun") {

         }       
 
      class _GetSuite : IamPolicy.Action("devicefarm:GetSuite") {

         }       
 
      class _GetTest : IamPolicy.Action("devicefarm:GetTest") {

         }       
 
      class _GetUpload : IamPolicy.Action("devicefarm:GetUpload") {

         }       
 
      class _ListArtifacts : IamPolicy.Action("devicefarm:ListArtifacts") {

         }       
 
      class _ListDevicePools : IamPolicy.Action("devicefarm:ListDevicePools") {

         }       
 
      class _ListDevices : IamPolicy.Action("devicefarm:ListDevices") {

         }       
 
      class _ListJobs : IamPolicy.Action("devicefarm:ListJobs") {

         }       
 
      class _ListProjects : IamPolicy.Action("devicefarm:ListProjects") {

         }       
 
      class _ListRuns : IamPolicy.Action("devicefarm:ListRuns") {

         }       
 
      class _ListSamples : IamPolicy.Action("devicefarm:ListSamples") {

         }       
 
      class _ListSuites : IamPolicy.Action("devicefarm:ListSuites") {

         }       
 
      class _ListTests : IamPolicy.Action("devicefarm:ListTests") {

         }       
 
      class _ListUniqueProblems : IamPolicy.Action("devicefarm:ListUniqueProblems") {

         }       
 
      class _ListUploads : IamPolicy.Action("devicefarm:ListUploads") {

         }       
 
      class _ScheduleRun : IamPolicy.Action("devicefarm:ScheduleRun") {

         }       


}        
