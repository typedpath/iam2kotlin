
package com.typedpath.iam2kotlin.resources.cloudwatch

import com.typedpath.iam2kotlin.IamPolicy

class CloudwatchAction() {

    companion object { 
        val All = IamPolicy.Action("cloudwatch:*")    
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DeleteAlarms.html 
        //  Deletes all specified alarms.    
        val DeleteAlarms = _DeleteAlarms() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DeleteDashboards.html 
        //  Deletes all dashboards that you specify.    
        val DeleteDashboards = _DeleteDashboards() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarmHistory.html 
        //  Retrieves history for the specified alarm.    
        val DescribeAlarmHistory = _DescribeAlarmHistory() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html 
        //  Retrieves alarms with the specified names.    
        val DescribeAlarms = _DescribeAlarms() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarmsForMetric.html 
        //  Retrieves all alarms for a single metric.    
        val DescribeAlarmsForMetric = _DescribeAlarmsForMetric() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DisableAlarmActions.html 
        //  Disables actions for the specified alarms.    
        val DisableAlarmActions = _DisableAlarmActions() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_EnableAlarmActions.html 
        //  Enables actions for the specified alarms.    
        val EnableAlarmActions = _EnableAlarmActions() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetDashboard.html 
        //  Displays the details of the dashboard that you specify.    
        val GetDashboard = _GetDashboard() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricData.html 
        //  ???    
        val GetMetricData = _GetMetricData() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html 
        //  Gets statistics for the specified metric.    
        val GetMetricStatistics = _GetMetricStatistics() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListDashboards.html 
        //  Returns a list of the dashboards for your account.    
        val ListDashboards = _ListDashboards() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html 
        //  Returns a list of valid metrics stored for the AWS account owner.    
        val ListMetrics = _ListMetrics() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutDashboard.html 
        //  Creates a dashboard if it does not already exist, or updates an existing dashboard.    
        val PutDashboard = _PutDashboard() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html 
        //  Creates or updates an alarm and associates it with the specified Amazon CloudWatch metric.    
        val PutMetricAlarm = _PutMetricAlarm() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricData.html 
        //  Publishes metric data points to Amazon CloudWatch.    
        val PutMetricData = _PutMetricData() 
        // see http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_SetAlarmState.html 
        //  Temporarily sets the state of an alarm for testing purposes.    
        val SetAlarmState = _SetAlarmState()
    }
      class _DeleteAlarms : IamPolicy.Action("cloudwatch:DeleteAlarms") {

         }       
 
      class _DeleteDashboards : IamPolicy.Action("cloudwatch:DeleteDashboards") {

         }       
 
      class _DescribeAlarmHistory : IamPolicy.Action("cloudwatch:DescribeAlarmHistory") {

         }       
 
      class _DescribeAlarms : IamPolicy.Action("cloudwatch:DescribeAlarms") {

         }       
 
      class _DescribeAlarmsForMetric : IamPolicy.Action("cloudwatch:DescribeAlarmsForMetric") {

         }       
 
      class _DisableAlarmActions : IamPolicy.Action("cloudwatch:DisableAlarmActions") {

         }       
 
      class _EnableAlarmActions : IamPolicy.Action("cloudwatch:EnableAlarmActions") {

         }       
 
      class _GetDashboard : IamPolicy.Action("cloudwatch:GetDashboard") {

         }       
 
      class _GetMetricData : IamPolicy.Action("cloudwatch:GetMetricData") {

         }       
 
      class _GetMetricStatistics : IamPolicy.Action("cloudwatch:GetMetricStatistics") {

         }       
 
      class _ListDashboards : IamPolicy.Action("cloudwatch:ListDashboards") {

         }       
 
      class _ListMetrics : IamPolicy.Action("cloudwatch:ListMetrics") {

         }       
 
      class _PutDashboard : IamPolicy.Action("cloudwatch:PutDashboard") {

         }       
 
      class _PutMetricAlarm : IamPolicy.Action("cloudwatch:PutMetricAlarm") {

         }       
 
      class _PutMetricData : IamPolicy.Action("cloudwatch:PutMetricData") {

         }       
 
      class _SetAlarmState : IamPolicy.Action("cloudwatch:SetAlarmState") {

         }       


}        
