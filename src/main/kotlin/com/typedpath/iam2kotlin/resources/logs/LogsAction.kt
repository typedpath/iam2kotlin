
package com.typedpath.iam2kotlin.resources.logs

import com.typedpath.iam2kotlin.IamPolicy

class LogsAction() {

    companion object { 
        val All = IamPolicy.Action("logs:*")    
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CancelExportTask.html 
        //  Cancels an export task if it is in PENDING or RUNNING state.    
        val CancelExportTask = _CancelExportTask() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateExportTask.html 
        //  Creates an ExportTask which allows you to efficiently export data from a Log Group to your Amazon S3 bucket.    
        val CreateExportTask = _CreateExportTask() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateLogGroup.html 
        //  Creates a new log group with the specified name.    
        val CreateLogGroup = _CreateLogGroup() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateLogStream.html 
        //  Creates a new log stream in the specified log group.    
        val CreateLogStream = _CreateLogStream() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteDestination.html 
        //  Deletes the destination with the specified name and eventually disables all the subscription filters that publish to it.    
        val DeleteDestination = _DeleteDestination() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteLogGroup.html 
        //  Deletes the log group with the specified name and permanently deletes all the archived log events associated with it.    
        val DeleteLogGroup = _DeleteLogGroup() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteLogStream.html 
        //  Deletes a log stream and permanently deletes all the archived log events associated with it.    
        val DeleteLogStream = _DeleteLogStream() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteMetricFilter.html 
        //  Deletes a metric filter associated with the specified log group.    
        val DeleteMetricFilter = _DeleteMetricFilter() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteRetentionPolicy.html 
        //  Deletes the retention policy of the specified log group.    
        val DeleteRetentionPolicy = _DeleteRetentionPolicy() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DeleteSubscriptionFilter.html 
        //  Deletes a subscription filter associated with the specified log group.    
        val DeleteSubscriptionFilter = _DeleteSubscriptionFilter() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeDestinations.html 
        //  Returns all the destinations that are associated with the AWS account making the request.    
        val DescribeDestinations = _DescribeDestinations() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeExportTasks.html 
        //  Returns all the export tasks that are associated with the AWS account making the request.    
        val DescribeExportTasks = _DescribeExportTasks() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogGroups.html 
        //  Returns all the log groups that are associated with the AWS account making the request.    
        val DescribeLogGroups = _DescribeLogGroups() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeLogStreams.html 
        //  Returns all the log streams that are associated with the specified log group.    
        val DescribeLogStreams = _DescribeLogStreams() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeMetricFilters.html 
        //  Returns all the metrics filters associated with the specified log group.    
        val DescribeMetricFilters = _DescribeMetricFilters() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeSubscriptionFilters.html 
        //  Returns all the subscription filters associated with the specified log group.    
        val DescribeSubscriptionFilters = _DescribeSubscriptionFilters() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_FilterLogEvents.html 
        //  Retrieves log events, optionally filtered by a filter pattern from the specified log group.    
        val FilterLogEvents = _FilterLogEvents() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogEvents.html 
        //  Retrieves log events from the specified log stream.    
        val GetLogEvents = _GetLogEvents() 
        // see https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsLogGroup.html 
        //  Lists the tags for the specified log group.    
        val ListTagsLogGroup = _ListTagsLogGroup() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html 
        //  Creates or updates a Destination.    
        val PutDestination = _PutDestination() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestinationPolicy.html 
        //  Creates or updates an access policy associated with an existing Destination.    
        val PutDestinationPolicy = _PutDestinationPolicy() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutLogEvents.html 
        //  Uploads a batch of log events to the specified log stream.    
        val PutLogEvents = _PutLogEvents() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutMetricFilter.html 
        //  Creates or updates a metric filter and associates it with the specified log group.    
        val PutMetricFilter = _PutMetricFilter() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutRetentionPolicy.html 
        //  Sets the retention of the specified log group.    
        val PutRetentionPolicy = _PutRetentionPolicy() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutSubscriptionFilter.html 
        //  Creates or updates a subscription filter and associates it with the specified log group.    
        val PutSubscriptionFilter = _PutSubscriptionFilter() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TestMetricFilter.html 
        //  Tests the filter pattern of a metric filter against a sample of log event messages.    
        val TestMetricFilter = _TestMetricFilter()
    }
      class _CancelExportTask : IamPolicy.Action("logs:CancelExportTask") {

         }       
 
      class _CreateExportTask : IamPolicy.Action("logs:CreateExportTask") {

         }       
 
      class _CreateLogGroup : IamPolicy.Action("logs:CreateLogGroup") {

         }       
 
      class _CreateLogStream : IamPolicy.Action("logs:CreateLogStream") {

         }       
 
      class _DeleteDestination : IamPolicy.Action("logs:DeleteDestination") {

         }       
 
      class _DeleteLogGroup : IamPolicy.Action("logs:DeleteLogGroup") {

         }       
 
      class _DeleteLogStream : IamPolicy.Action("logs:DeleteLogStream") {

         }       
 
      class _DeleteMetricFilter : IamPolicy.Action("logs:DeleteMetricFilter") {
             //arn:$region:logs:$region:$account:log-group:$group-name:log-stream:$stream-name"
            fun loggroup_logstream_byRegionAccountGroupnameStreamname(region: String, account: String, groupname: String, streamname: String) = IamPolicy.Resource("arn:$region:logs:$region:$account:log-group:$groupname:log-stream:$streamname")
         }       
 
      class _DeleteRetentionPolicy : IamPolicy.Action("logs:DeleteRetentionPolicy") {

         }       
 
      class _DeleteSubscriptionFilter : IamPolicy.Action("logs:DeleteSubscriptionFilter") {

         }       
 
      class _DescribeDestinations : IamPolicy.Action("logs:DescribeDestinations") {

         }       
 
      class _DescribeExportTasks : IamPolicy.Action("logs:DescribeExportTasks") {

         }       
 
      class _DescribeLogGroups : IamPolicy.Action("logs:DescribeLogGroups") {

         }       
 
      class _DescribeLogStreams : IamPolicy.Action("logs:DescribeLogStreams") {

         }       
 
      class _DescribeMetricFilters : IamPolicy.Action("logs:DescribeMetricFilters") {
             //arn:$region:logs:$region:$account:log-group:$group-name:log-stream:$stream-name"
            fun loggroup_logstream_byRegionAccountGroupnameStreamname(region: String, account: String, groupname: String, streamname: String) = IamPolicy.Resource("arn:$region:logs:$region:$account:log-group:$groupname:log-stream:$streamname")
         }       
 
      class _DescribeSubscriptionFilters : IamPolicy.Action("logs:DescribeSubscriptionFilters") {

         }       
 
      class _FilterLogEvents : IamPolicy.Action("logs:FilterLogEvents") {

         }       
 
      class _GetLogEvents : IamPolicy.Action("logs:GetLogEvents") {

         }       
 
      class _ListTagsLogGroup : IamPolicy.Action("logs:ListTagsLogGroup") {

         }       
 
      class _PutDestination : IamPolicy.Action("logs:PutDestination") {

         }       
 
      class _PutDestinationPolicy : IamPolicy.Action("logs:PutDestinationPolicy") {

         }       
 
      class _PutLogEvents : IamPolicy.Action("logs:PutLogEvents") {

         }       
 
      class _PutMetricFilter : IamPolicy.Action("logs:PutMetricFilter") {
             //arn:$region:logs:$region:$account:log-group:$group-name:log-stream:$stream-name"
            fun loggroup_logstream_byRegionAccountGroupnameStreamname(region: String, account: String, groupname: String, streamname: String) = IamPolicy.Resource("arn:$region:logs:$region:$account:log-group:$groupname:log-stream:$streamname")
         }       
 
      class _PutRetentionPolicy : IamPolicy.Action("logs:PutRetentionPolicy") {

         }       
 
      class _PutSubscriptionFilter : IamPolicy.Action("logs:PutSubscriptionFilter") {

         }       
 
      class _TestMetricFilter : IamPolicy.Action("logs:TestMetricFilter") {

         }       


}        
