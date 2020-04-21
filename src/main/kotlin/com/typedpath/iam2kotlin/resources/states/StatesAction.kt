
package com.typedpath.iam2kotlin.resources.states

import com.typedpath.iam2kotlin.IamPolicy

class StatesAction() {

    companion object { 
        val All = IamPolicy.Action("states:*")    
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateActivity.html 
        //  Creates an activity.    
        val CreateActivity = _CreateActivity() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateStateMachine.html 
        //  Creates a state machine.    
        val CreateStateMachine = _CreateStateMachine() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_DeleteActivity.html 
        //  Deletes an activity.    
        val DeleteActivity = _DeleteActivity() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_DeleteStateMachine.html 
        //  Deletes a state machine.    
        val DeleteStateMachine = _DeleteStateMachine() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_DescribeActivity.html 
        //  Describes an activity.    
        val DescribeActivity = _DescribeActivity() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_DescribeExecution.html 
        //  Describes an execution.    
        val DescribeExecution = _DescribeExecution() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_DescribeStateMachine.html 
        //  Describes a state machine.    
        val DescribeStateMachine = _DescribeStateMachine() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_GetActivityTask.html 
        //  Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine.    
        val GetActivityTask = _GetActivityTask() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_GetExecutionHistory.html 
        //  Returns the history of the specified execution as a list of events.    
        val GetExecutionHistory = _GetExecutionHistory() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_ListActivities.html 
        //  Lists the existing activities.    
        val ListActivities = _ListActivities() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_ListExecutions.html 
        //  Lists the executions of a state machine that meet the filtering criteria.    
        val ListExecutions = _ListExecutions() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_ListStateMachines.html 
        //  Lists the existing state machines.    
        val ListStateMachines = _ListStateMachines() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_SendTaskFailure.html 
        //  Used by workers to report that the task identified by the taskToken failed.    
        val SendTaskFailure = _SendTaskFailure() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_SendTaskHeartbeat.html 
        //  Used by workers to report to the service that the task represented by the specified taskToken is still making progress.    
        val SendTaskHeartbeat = _SendTaskHeartbeat() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_SendTaskSuccess.html 
        //  Used by workers to report that the task identified by the taskToken completed successfully.    
        val SendTaskSuccess = _SendTaskSuccess() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html 
        //  Starts a state machine execution.    
        val StartExecution = _StartExecution() 
        // see http://docs.aws.amazon.com/step-functions/latest/apireference/API_StopExecution.html 
        //  Stops an execution.    
        val StopExecution = _StopExecution()
    }
      class _CreateActivity : IamPolicy.Action("states:CreateActivity") {

         }       
 
      class _CreateStateMachine : IamPolicy.Action("states:CreateStateMachine") {

         }       
 
      class _DeleteActivity : IamPolicy.Action("states:DeleteActivity") {

         }       
 
      class _DeleteStateMachine : IamPolicy.Action("states:DeleteStateMachine") {

         }       
 
      class _DescribeActivity : IamPolicy.Action("states:DescribeActivity") {

         }       
 
      class _DescribeExecution : IamPolicy.Action("states:DescribeExecution") {

         }       
 
      class _DescribeStateMachine : IamPolicy.Action("states:DescribeStateMachine") {

         }       
 
      class _GetActivityTask : IamPolicy.Action("states:GetActivityTask") {

         }       
 
      class _GetExecutionHistory : IamPolicy.Action("states:GetExecutionHistory") {

         }       
 
      class _ListActivities : IamPolicy.Action("states:ListActivities") {

         }       
 
      class _ListExecutions : IamPolicy.Action("states:ListExecutions") {

         }       
 
      class _ListStateMachines : IamPolicy.Action("states:ListStateMachines") {

         }       
 
      class _SendTaskFailure : IamPolicy.Action("states:SendTaskFailure") {

         }       
 
      class _SendTaskHeartbeat : IamPolicy.Action("states:SendTaskHeartbeat") {

         }       
 
      class _SendTaskSuccess : IamPolicy.Action("states:SendTaskSuccess") {

         }       
 
      class _StartExecution : IamPolicy.Action("states:StartExecution") {

         }       
 
      class _StopExecution : IamPolicy.Action("states:StopExecution") {

         }       


}        
