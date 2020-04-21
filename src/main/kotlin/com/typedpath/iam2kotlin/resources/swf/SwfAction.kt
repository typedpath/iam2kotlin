
package com.typedpath.iam2kotlin.resources.swf

import com.typedpath.iam2kotlin.IamPolicy

class SwfAction() {

    companion object { 
        val All = IamPolicy.Action("swf:*")    
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CancelTimer.html 
        //  ???    
        val CancelTimer = _CancelTimer() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CancelWorkflowExecution.html 
        //  ???    
        val CancelWorkflowExecution = _CancelWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CompleteWorkflowExecution.html 
        //  ???    
        val CompleteWorkflowExecution = _CompleteWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ContinueAsNewWorkflowExecution.html 
        //  ???    
        val ContinueAsNewWorkflowExecution = _ContinueAsNewWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CountClosedWorkflowExecutions.html 
        //  Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.    
        val CountClosedWorkflowExecutions = _CountClosedWorkflowExecutions() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CountOpenWorkflowExecutions.html 
        //  Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.    
        val CountOpenWorkflowExecutions = _CountOpenWorkflowExecutions() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CountPendingActivityTasks.html 
        //  Returns the estimated number of activity tasks in the specified task list.    
        val CountPendingActivityTasks = _CountPendingActivityTasks() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_CountPendingDecisionTasks.html 
        //  Returns the estimated number of decision tasks in the specified task list.    
        val CountPendingDecisionTasks = _CountPendingDecisionTasks() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DeprecateActivityType.html 
        //  Deprecates the specified activity type.    
        val DeprecateActivityType = _DeprecateActivityType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DeprecateDomain.html 
        //  Deprecates the specified domain.    
        val DeprecateDomain = _DeprecateDomain() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DeprecateWorkflowType.html 
        //  Deprecates the specified workflow type.    
        val DeprecateWorkflowType = _DeprecateWorkflowType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DescribeActivityType.html 
        //  Returns information about the specified activity type.    
        val DescribeActivityType = _DescribeActivityType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DescribeDomain.html 
        //  Returns information about the specified domain, including description and status.    
        val DescribeDomain = _DescribeDomain() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DescribeWorkflowExecution.html 
        //  Returns information about the specified workflow execution including its type and some statistics.    
        val DescribeWorkflowExecution = _DescribeWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_DescribeWorkflowType.html 
        //  Returns information about the specified workflow type.    
        val DescribeWorkflowType = _DescribeWorkflowType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_FailWorkflowExecution.html 
        //  ???    
        val FailWorkflowExecution = _FailWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_GetWorkflowExecutionHistory.html 
        //  Returns the history of the specified workflow execution.    
        val GetWorkflowExecutionHistory = _GetWorkflowExecutionHistory() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ListActivityTypes.html 
        //  Returns information about all activities registered in the specified domain that match the specified name and registration status.    
        val ListActivityTypes = _ListActivityTypes() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ListClosedWorkflowExecutions.html 
        //  Returns a list of closed workflow executions in the specified domain that meet the filtering criteria.    
        val ListClosedWorkflowExecutions = _ListClosedWorkflowExecutions() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ListDomains.html 
        //  Returns the list of domains registered in the account.    
        val ListDomains = _ListDomains() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ListOpenWorkflowExecutions.html 
        //  Returns a list of open workflow executions in the specified domain that meet the filtering criteria.    
        val ListOpenWorkflowExecutions = _ListOpenWorkflowExecutions() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ListWorkflowTypes.html 
        //  Returns information about workflow types in the specified domain.    
        val ListWorkflowTypes = _ListWorkflowTypes() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_PollForActivityTask.html 
        //  Used by workers to get an ActivityTask from the specified activity taskList.    
        val PollForActivityTask = _PollForActivityTask() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_PollForDecisionTask.html 
        //  Used by deciders to get a DecisionTask from the specified decision taskList.    
        val PollForDecisionTask = _PollForDecisionTask() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RecordActivityTaskHeartbeat.html 
        //  Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress.    
        val RecordActivityTaskHeartbeat = _RecordActivityTaskHeartbeat() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RecordMarker.html 
        //  ???    
        val RecordMarker = _RecordMarker() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RegisterActivityType.html 
        //  Registers a new activity type along with its configuration settings in the specified domain.    
        val RegisterActivityType = _RegisterActivityType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RegisterDomain.html 
        //  Registers a new domain.    
        val RegisterDomain = _RegisterDomain() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RegisterWorkflowType.html 
        //  Registers a new workflow type and its configuration settings in the specified domain.    
        val RegisterWorkflowType = _RegisterWorkflowType() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RequestCancelActivityTask.html 
        //  ???    
        val RequestCancelActivityTask = _RequestCancelActivityTask() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RequestCancelExternalWorkflowExecution.html 
        //  ???    
        val RequestCancelExternalWorkflowExecution = _RequestCancelExternalWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RequestCancelWorkflowExecution.html 
        //  Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId.    
        val RequestCancelWorkflowExecution = _RequestCancelWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RespondActivityTaskCanceled.html 
        //  Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled.    
        val RespondActivityTaskCanceled = _RespondActivityTaskCanceled() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RespondActivityTaskCompleted.html 
        //  Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided).    
        val RespondActivityTaskCompleted = _RespondActivityTaskCompleted() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RespondActivityTaskFailed.html 
        //  Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified).    
        val RespondActivityTaskFailed = _RespondActivityTaskFailed() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_RespondDecisionTaskCompleted.html 
        //  Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed.    
        val RespondDecisionTaskCompleted = _RespondDecisionTaskCompleted() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_ScheduleActivityTask.html 
        //  ???    
        val ScheduleActivityTask = _ScheduleActivityTask() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_SignalExternalWorkflowExecution.html 
        //  ???    
        val SignalExternalWorkflowExecution = _SignalExternalWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_SignalWorkflowExecution.html 
        //  Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId.    
        val SignalWorkflowExecution = _SignalWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_StartChildWorkflowExecution.html 
        //  ???    
        val StartChildWorkflowExecution = _StartChildWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_StartTimer.html 
        //  ???    
        val StartTimer = _StartTimer() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_StartWorkflowExecution.html 
        //  Starts an execution of the workflow type in the specified domain using the provided workflowId and input data.    
        val StartWorkflowExecution = _StartWorkflowExecution() 
        // see http://docs.aws.amazon.com/amazonswf/latest/apireference/API_TerminateWorkflowExecution.html 
        //  Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId.    
        val TerminateWorkflowExecution = _TerminateWorkflowExecution()
    }
      class _CancelTimer : IamPolicy.Action("swf:CancelTimer") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CancelWorkflowExecution : IamPolicy.Action("swf:CancelWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CompleteWorkflowExecution : IamPolicy.Action("swf:CompleteWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ContinueAsNewWorkflowExecution : IamPolicy.Action("swf:ContinueAsNewWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CountClosedWorkflowExecutions : IamPolicy.Action("swf:CountClosedWorkflowExecutions") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CountOpenWorkflowExecutions : IamPolicy.Action("swf:CountOpenWorkflowExecutions") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CountPendingActivityTasks : IamPolicy.Action("swf:CountPendingActivityTasks") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _CountPendingDecisionTasks : IamPolicy.Action("swf:CountPendingDecisionTasks") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DeprecateActivityType : IamPolicy.Action("swf:DeprecateActivityType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DeprecateDomain : IamPolicy.Action("swf:DeprecateDomain") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DeprecateWorkflowType : IamPolicy.Action("swf:DeprecateWorkflowType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DescribeActivityType : IamPolicy.Action("swf:DescribeActivityType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DescribeDomain : IamPolicy.Action("swf:DescribeDomain") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DescribeWorkflowExecution : IamPolicy.Action("swf:DescribeWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _DescribeWorkflowType : IamPolicy.Action("swf:DescribeWorkflowType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _FailWorkflowExecution : IamPolicy.Action("swf:FailWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _GetWorkflowExecutionHistory : IamPolicy.Action("swf:GetWorkflowExecutionHistory") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ListActivityTypes : IamPolicy.Action("swf:ListActivityTypes") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ListClosedWorkflowExecutions : IamPolicy.Action("swf:ListClosedWorkflowExecutions") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ListDomains : IamPolicy.Action("swf:ListDomains") {

         }       
 
      class _ListOpenWorkflowExecutions : IamPolicy.Action("swf:ListOpenWorkflowExecutions") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ListWorkflowTypes : IamPolicy.Action("swf:ListWorkflowTypes") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _PollForActivityTask : IamPolicy.Action("swf:PollForActivityTask") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _PollForDecisionTask : IamPolicy.Action("swf:PollForDecisionTask") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RecordActivityTaskHeartbeat : IamPolicy.Action("swf:RecordActivityTaskHeartbeat") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RecordMarker : IamPolicy.Action("swf:RecordMarker") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RegisterActivityType : IamPolicy.Action("swf:RegisterActivityType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RegisterDomain : IamPolicy.Action("swf:RegisterDomain") {

         }       
 
      class _RegisterWorkflowType : IamPolicy.Action("swf:RegisterWorkflowType") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RequestCancelActivityTask : IamPolicy.Action("swf:RequestCancelActivityTask") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RequestCancelExternalWorkflowExecution : IamPolicy.Action("swf:RequestCancelExternalWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RequestCancelWorkflowExecution : IamPolicy.Action("swf:RequestCancelWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RespondActivityTaskCanceled : IamPolicy.Action("swf:RespondActivityTaskCanceled") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RespondActivityTaskCompleted : IamPolicy.Action("swf:RespondActivityTaskCompleted") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RespondActivityTaskFailed : IamPolicy.Action("swf:RespondActivityTaskFailed") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _RespondDecisionTaskCompleted : IamPolicy.Action("swf:RespondDecisionTaskCompleted") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _ScheduleActivityTask : IamPolicy.Action("swf:ScheduleActivityTask") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _SignalExternalWorkflowExecution : IamPolicy.Action("swf:SignalExternalWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _SignalWorkflowExecution : IamPolicy.Action("swf:SignalWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _StartChildWorkflowExecution : IamPolicy.Action("swf:StartChildWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _StartTimer : IamPolicy.Action("swf:StartTimer") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _StartWorkflowExecution : IamPolicy.Action("swf:StartWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       
 
      class _TerminateWorkflowExecution : IamPolicy.Action("swf:TerminateWorkflowExecution") {
             //arn:aws:swf:$region:$account:/domain/$domain_name"
            fun domain_byRegionAccountDomain_name(region: String, account: String, domain_name: String) = IamPolicy.Resource("arn:aws:swf:$region:$account:/domain/$domain_name")
         }       


}        
