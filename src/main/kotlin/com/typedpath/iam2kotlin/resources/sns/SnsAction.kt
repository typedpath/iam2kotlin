
package com.typedpath.iam2kotlin.resources.sns

import com.typedpath.iam2kotlin.IamPolicy

class SnsAction() {

    companion object { 
        val All = IamPolicy.Action("sns:*")    
        // see http://docs.aws.amazon.com/sns/latest/api/API_AddPermission.html 
        //  Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.    
        val AddPermission = _AddPermission() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ConfirmSubscription.html 
        //  Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action.    
        val ConfirmSubscription = _ConfirmSubscription() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html 
        //  Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register.    
        val CreatePlatformApplication = _CreatePlatformApplication() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformEndpoint.html 
        //  Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS.    
        val CreatePlatformEndpoint = _CreatePlatformEndpoint() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_CreateTopic.html 
        //  Creates a topic to which notifications can be published.    
        val CreateTopic = _CreateTopic() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_DeleteEndpoint.html 
        //  Deletes the endpoint for a device and mobile app from Amazon SNS.    
        val DeleteEndpoint = _DeleteEndpoint() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_DeletePlatformApplication.html 
        //  Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.    
        val DeletePlatformApplication = _DeletePlatformApplication() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_DeleteTopic.html 
        //  Deletes a topic and all its subscriptions.    
        val DeleteTopic = _DeleteTopic() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_GetEndpointAttributes.html 
        //  Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS.    
        val GetEndpointAttributes = _GetEndpointAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_GetPlatformApplicationAttributes.html 
        //  Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM.    
        val GetPlatformApplicationAttributes = _GetPlatformApplicationAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html 
        //  Returns all of the properties of a subscription.    
        val GetSubscriptionAttributes = _GetSubscriptionAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_GetTopicAttributes.html 
        //  Returns all of the properties of a topic.    
        val GetTopicAttributes = _GetTopicAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ListEndpointsByPlatformApplication.html 
        //  Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS.    
        val ListEndpointsByPlatformApplication = _ListEndpointsByPlatformApplication() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ListPlatformApplications.html 
        //  Lists the platform application objects for the supported push notification services, such as APNS and GCM.    
        val ListPlatformApplications = _ListPlatformApplications() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ListSubscriptions.html 
        //  Returns a list of the requester's subscriptions.    
        val ListSubscriptions = _ListSubscriptions() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ListSubscriptionsByTopic.html 
        //  Returns a list of the subscriptions to a specific topic.    
        val ListSubscriptionsByTopic = _ListSubscriptionsByTopic() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html 
        //  Returns a list of the requester's topics.    
        val ListTopics = _ListTopics() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_Publish.html 
        //  Sends a message to all of a topic's subscribed endpoints.    
        val Publish = _Publish() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_RemovePermission.html 
        //  Removes a statement from a topic's access control policy.    
        val RemovePermission = _RemovePermission() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_SetEndpointAttributes.html 
        //  Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS.    
        val SetEndpointAttributes = _SetEndpointAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_SetPlatformApplicationAttributes.html 
        //  Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM.    
        val SetPlatformApplicationAttributes = _SetPlatformApplicationAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_SetSubscriptionAttributes.html 
        //  Allows a subscription owner to set an attribute of the topic to a new value.    
        val SetSubscriptionAttributes = _SetSubscriptionAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_SetTopicAttributes.html 
        //  Allows a topic owner to set an attribute of the topic to a new value.    
        val SetTopicAttributes = _SetTopicAttributes() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html 
        //  Prepares to subscribe an endpoint by sending the endpoint a confirmation message.    
        val Subscribe = _Subscribe() 
        // see http://docs.aws.amazon.com/sns/latest/api/API_Unsubscribe.html 
        //  Deletes a subscription.    
        val Unsubscribe = _Unsubscribe()
    }
      class _AddPermission : IamPolicy.Action("sns:AddPermission") {

         }       
 
      class _ConfirmSubscription : IamPolicy.Action("sns:ConfirmSubscription") {

         }       
 
      class _CreatePlatformApplication : IamPolicy.Action("sns:CreatePlatformApplication") {

         }       
 
      class _CreatePlatformEndpoint : IamPolicy.Action("sns:CreatePlatformEndpoint") {

         }       
 
      class _CreateTopic : IamPolicy.Action("sns:CreateTopic") {

         }       
 
      class _DeleteEndpoint : IamPolicy.Action("sns:DeleteEndpoint") {

         }       
 
      class _DeletePlatformApplication : IamPolicy.Action("sns:DeletePlatformApplication") {

         }       
 
      class _DeleteTopic : IamPolicy.Action("sns:DeleteTopic") {

         }       
 
      class _GetEndpointAttributes : IamPolicy.Action("sns:GetEndpointAttributes") {

         }       
 
      class _GetPlatformApplicationAttributes : IamPolicy.Action("sns:GetPlatformApplicationAttributes") {

         }       
 
      class _GetSubscriptionAttributes : IamPolicy.Action("sns:GetSubscriptionAttributes") {

         }       
 
      class _GetTopicAttributes : IamPolicy.Action("sns:GetTopicAttributes") {

         }       
 
      class _ListEndpointsByPlatformApplication : IamPolicy.Action("sns:ListEndpointsByPlatformApplication") {

         }       
 
      class _ListPlatformApplications : IamPolicy.Action("sns:ListPlatformApplications") {

         }       
 
      class _ListSubscriptions : IamPolicy.Action("sns:ListSubscriptions") {

         }       
 
      class _ListSubscriptionsByTopic : IamPolicy.Action("sns:ListSubscriptionsByTopic") {

         }       
 
      class _ListTopics : IamPolicy.Action("sns:ListTopics") {

         }       
 
      class _Publish : IamPolicy.Action("sns:Publish") {
             //arn:aws:sns:$region:$account:$topic-name"
            fun byRegionAccountTopicname(region: String, account: String, topicname: String) = IamPolicy.Resource("arn:aws:sns:$region:$account:$topicname")
         }       
 
      class _RemovePermission : IamPolicy.Action("sns:RemovePermission") {

         }       
 
      class _SetEndpointAttributes : IamPolicy.Action("sns:SetEndpointAttributes") {

         }       
 
      class _SetPlatformApplicationAttributes : IamPolicy.Action("sns:SetPlatformApplicationAttributes") {

         }       
 
      class _SetSubscriptionAttributes : IamPolicy.Action("sns:SetSubscriptionAttributes") {

         }       
 
      class _SetTopicAttributes : IamPolicy.Action("sns:SetTopicAttributes") {

         }       
 
      class _Subscribe : IamPolicy.Action("sns:Subscribe") {

         }       
 
      class _Unsubscribe : IamPolicy.Action("sns:Unsubscribe") {

         }       


}        
