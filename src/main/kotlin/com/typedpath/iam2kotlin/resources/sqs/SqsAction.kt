
package com.typedpath.iam2kotlin.resources.sqs

import com.typedpath.iam2kotlin.IamPolicy

class SqsAction() {

    companion object { 
        val All = IamPolicy.Action("sqs:*")    
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_AddPermission.html 
        //  Adds a permission to a queue for a specific principal.    
        val AddPermission = _AddPermission() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ChangeMessageVisibility.html 
        //  Changes the visibility timeout of a specified message in a queue to a new value.    
        val ChangeMessageVisibility = _ChangeMessageVisibility() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ChangeMessageVisibilityBatch.html 
        //  Changes the visibility timeout of multiple messages.    
        val ChangeMessageVisibilityBatch = _ChangeMessageVisibilityBatch() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html 
        //  Creates a new queue, or returns the URL of an existing one.    
        val CreateQueue = _CreateQueue() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_DeleteMessage.html 
        //  Deletes the specified message from the specified queue.    
        val DeleteMessage = _DeleteMessage() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_DeleteMessageBatch.html 
        //  Deletes up to ten messages from the specified queue.    
        val DeleteMessageBatch = _DeleteMessageBatch() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_DeleteQueue.html 
        //  Deletes the queue specified by the queue URL, regardless of whether the queue is empty.    
        val DeleteQueue = _DeleteQueue() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_GetQueueAttributes.html 
        //  Gets attributes for the specified queue.    
        val GetQueueAttributes = _GetQueueAttributes() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_GetQueueUrl.html 
        //  Returns the URL of an existing queue.    
        val GetQueueUrl = _GetQueueUrl() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ListDeadLetterSourceQueues.html 
        //  Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead letter queue.    
        val ListDeadLetterSourceQueues = _ListDeadLetterSourceQueues() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ListQueues.html 
        //  Returns a list of your queues.    
        val ListQueues = _ListQueues() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_PurgeQueue.html 
        //  Deletes the messages in a queue specified by the queue URL.    
        val PurgeQueue = _PurgeQueue() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_ReceiveMessage.html 
        //  Retrieves one or more messages, with a maximum limit of 10 messages, from the specified queue.    
        val ReceiveMessage = _ReceiveMessage() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_RemovePermission.html 
        //  Revokes any permissions in the queue policy that matches the specified Label parameter.    
        val RemovePermission = _RemovePermission() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html 
        //  Delivers a message to the specified queue.    
        val SendMessage = _SendMessage() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessageBatch.html 
        //  Delivers up to ten messages to the specified queue.    
        val SendMessageBatch = _SendMessageBatch() 
        // see http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SetQueueAttributes.html 
        //  Sets the value of one or more queue attributes.    
        val SetQueueAttributes = _SetQueueAttributes()
    }
      class _AddPermission : IamPolicy.Action("sqs:AddPermission") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _ChangeMessageVisibility : IamPolicy.Action("sqs:ChangeMessageVisibility") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _ChangeMessageVisibilityBatch : IamPolicy.Action("sqs:ChangeMessageVisibilityBatch") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _CreateQueue : IamPolicy.Action("sqs:CreateQueue") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _DeleteMessage : IamPolicy.Action("sqs:DeleteMessage") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _DeleteMessageBatch : IamPolicy.Action("sqs:DeleteMessageBatch") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _DeleteQueue : IamPolicy.Action("sqs:DeleteQueue") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _GetQueueAttributes : IamPolicy.Action("sqs:GetQueueAttributes") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _GetQueueUrl : IamPolicy.Action("sqs:GetQueueUrl") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _ListDeadLetterSourceQueues : IamPolicy.Action("sqs:ListDeadLetterSourceQueues") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _ListQueues : IamPolicy.Action("sqs:ListQueues") {
             //arn:aws:sqs:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:*")
         }       
 
      class _PurgeQueue : IamPolicy.Action("sqs:PurgeQueue") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _ReceiveMessage : IamPolicy.Action("sqs:ReceiveMessage") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _RemovePermission : IamPolicy.Action("sqs:RemovePermission") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _SendMessage : IamPolicy.Action("sqs:SendMessage") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _SendMessageBatch : IamPolicy.Action("sqs:SendMessageBatch") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       
 
      class _SetQueueAttributes : IamPolicy.Action("sqs:SetQueueAttributes") {
             //arn:aws:sqs:$region:$account:$queuename"
            fun byRegionAccountQueuename(region: String, account: String, queuename: String) = IamPolicy.Resource("arn:aws:sqs:$region:$account:$queuename")
         }       


}        
