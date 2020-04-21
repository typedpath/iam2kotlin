
package com.typedpath.iam2kotlin.resources.iot

import com.typedpath.iam2kotlin.IamPolicy

class IotAction() {

    companion object { 
        val All = IamPolicy.Action("iot:*")    
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_AcceptCertificateTransfer.html 
        //  Accepts a pending certificate transfer.    
        val AcceptCertificateTransfer = _AcceptCertificateTransfer() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_AttachPrincipalPolicy.html 
        //  Attaches the specified policy to the specified principal (certificate or other credential).    
        val AttachPrincipalPolicy = _AttachPrincipalPolicy() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_AttachThingPrincipal.html 
        //  Attaches the specified principal to the specified thing.    
        val AttachThingPrincipal = _AttachThingPrincipal() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CancelCertificateTransfer.html 
        //  Cancels a pending transfer for the specified certificate.    
        val CancelCertificateTransfer = _CancelCertificateTransfer() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_Connect.html 
        //  The Connect permission is checked every time a connect request is sent to the broker. The message broker does not allow two clients with the same client ID to stay connected at the same time. After the second client connects, the broker detects this case and disconnects one of the clients. The Connect permission can be used to ensure only authorized clients can connect using a specific client ID.    
        val Connect = _Connect() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html 
        //  Creates an X.    
        val CreateCertificateFromCsr = _CreateCertificateFromCsr() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html 
        //  Creates a 2048-bit RSA key pair and issues an X.    
        val CreateKeysAndCertificate = _CreateKeysAndCertificate() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreatePolicy.html 
        //  Creates an AWS IoT policy.    
        val CreatePolicy = _CreatePolicy() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreatePolicyVersion.html 
        //  Creates a new version of the specified AWS IoT policy.    
        val CreatePolicyVersion = _CreatePolicyVersion() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreateThing.html 
        //  Creates a thing record in the thing registry.    
        val CreateThing = _CreateThing() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_CreateTopicRule.html 
        //  Creates a rule.    
        val CreateTopicRule = _CreateTopicRule() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeleteCertificate.html 
        //  Deletes the specified certificate.    
        val DeleteCertificate = _DeleteCertificate() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeletePolicy.html 
        //  Deletes the specified policy.    
        val DeletePolicy = _DeletePolicy() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeletePolicyVersion.html 
        //  Deletes the specified version of the specified policy.    
        val DeletePolicyVersion = _DeletePolicyVersion() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThing.html 
        //  Deletes the specified thing.    
        val DeleteThing = _DeleteThing() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThingShadow.html 
        //  The DeleteThingShadow permission is checked every time a request is made to delete the thing shadow document.    
        val DeleteThingShadow = _DeleteThingShadow() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DeleteTopicRule.html 
        //  Deletes the specified rule.    
        val DeleteTopicRule = _DeleteTopicRule() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DescribeCertificate.html 
        //  Gets information about the specified certificate.    
        val DescribeCertificate = _DescribeCertificate() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DescribeEndpoint.html 
        //  Returns a unique endpoint specific to the AWS account making the call.    
        val DescribeEndpoint = _DescribeEndpoint() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DescribeThing.html 
        //  Gets information about the specified thing.    
        val DescribeThing = _DescribeThing() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DetachPrincipalPolicy.html 
        //  Removes the specified policy from the specified certificate.    
        val DetachPrincipalPolicy = _DetachPrincipalPolicy() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_DetachThingPrincipal.html 
        //  Detaches the specified principal from the specified thing.    
        val DetachThingPrincipal = _DetachThingPrincipal() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_GetLoggingOptions.html 
        //  Gets the logging options.    
        val GetLoggingOptions = _GetLoggingOptions() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_GetPolicy.html 
        //  Gets information about the specified policy with the policy document of the default version.    
        val GetPolicy = _GetPolicy() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_GetPolicyVersion.html 
        //  Gets information about the specified policy version.    
        val GetPolicyVersion = _GetPolicyVersion() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_GetThingShadow.html 
        //  The GetThingShadow permission is checked every time a request is made to get the state of a thing shadow document.    
        val GetThingShadow = _GetThingShadow() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_GetTopicRule.html 
        //  Gets information about the specified rule.    
        val GetTopicRule = _GetTopicRule() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListCertificates.html 
        //  Lists the certificates registered in your AWS account.    
        val ListCertificates = _ListCertificates() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListPolicies.html 
        //  Lists your policies.    
        val ListPolicies = _ListPolicies() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListPolicyVersions.html 
        //  Lists the versions of the specified policy and identifies the default version.    
        val ListPolicyVersions = _ListPolicyVersions() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListPrincipalPolicies.html 
        //  Lists the policies attached to the specified principal.    
        val ListPrincipalPolicies = _ListPrincipalPolicies() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListPrincipalThings.html 
        //  Lists the things associated with the specified principal.    
        val ListPrincipalThings = _ListPrincipalThings() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListThingPrincipals.html 
        //  Lists the principals associated with the specified thing.    
        val ListThingPrincipals = _ListThingPrincipals() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListThings.html 
        //  Lists your things.    
        val ListThings = _ListThings() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ListTopicRules.html 
        //  Lists the rules for the specific topic.    
        val ListTopicRules = _ListTopicRules() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_Publish.html 
        //  The Publish permission is checked every time a publish request is sent to the broker. The Publish action is used to allow clients to publish to specific topic patterns.    
        val Publish = _Publish() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_Receive.html 
        //  The Receive permission is checked every time a message is delivered to a client. Because the Receive permission is checked on every delivery, it can be used to revoke permissions to clients that are currently subscribed to a topic.    
        val Receive = _Receive() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_RejectCertificateTransfer.html 
        //  Rejects a pending certificate transfer.    
        val RejectCertificateTransfer = _RejectCertificateTransfer() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_ReplaceTopicRule.html 
        //  Replaces the specified rule.    
        val ReplaceTopicRule = _ReplaceTopicRule() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_SetDefaultPolicyVersion.html 
        //  Sets the specified version of the specified policy as the policy's default (operative) version.    
        val SetDefaultPolicyVersion = _SetDefaultPolicyVersion() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_SetLoggingOptions.html 
        //  Sets the logging options.    
        val SetLoggingOptions = _SetLoggingOptions() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_Subscribe.html 
        //  The Subscribe permission is checked every time a subscribe request is sent to the broker. The Subscribe action is used to allow clients to subscribe to topics that match specific topic patterns.    
        val Subscribe = _Subscribe() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_TransferCertificate.html 
        //  Transfers the specified certificate to the specified AWS account.    
        val TransferCertificate = _TransferCertificate() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_UpdateCertificate.html 
        //  Updates the status of the specified certificate.    
        val UpdateCertificate = _UpdateCertificate() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_UpdateThing.html 
        //  Updates the data for a thing.    
        val UpdateThing = _UpdateThing() 
        // see http://docs.aws.amazon.com/iot/latest/apireference/API_UpdateThingShadow.html 
        //  The UpdateThingShadow permission is checked every time a request is made to update the state of a thing shadow document.    
        val UpdateThingShadow = _UpdateThingShadow()
    }
      class _AcceptCertificateTransfer : IamPolicy.Action("iot:AcceptCertificateTransfer") {

         }       
 
      class _AttachPrincipalPolicy : IamPolicy.Action("iot:AttachPrincipalPolicy") {

         }       
 
      class _AttachThingPrincipal : IamPolicy.Action("iot:AttachThingPrincipal") {

         }       
 
      class _CancelCertificateTransfer : IamPolicy.Action("iot:CancelCertificateTransfer") {

         }       
 
      class _Connect : IamPolicy.Action("iot:Connect") {
             //arn:aws:iot:$region:$account:client/$client-id"
            fun client_byRegionAccountClientid(region: String, account: String, clientid: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:client/$clientid")
         }       
 
      class _CreateCertificateFromCsr : IamPolicy.Action("iot:CreateCertificateFromCsr") {

         }       
 
      class _CreateKeysAndCertificate : IamPolicy.Action("iot:CreateKeysAndCertificate") {

         }       
 
      class _CreatePolicy : IamPolicy.Action("iot:CreatePolicy") {

         }       
 
      class _CreatePolicyVersion : IamPolicy.Action("iot:CreatePolicyVersion") {

         }       
 
      class _CreateThing : IamPolicy.Action("iot:CreateThing") {

         }       
 
      class _CreateTopicRule : IamPolicy.Action("iot:CreateTopicRule") {

         }       
 
      class _DeleteCertificate : IamPolicy.Action("iot:DeleteCertificate") {

         }       
 
      class _DeletePolicy : IamPolicy.Action("iot:DeletePolicy") {

         }       
 
      class _DeletePolicyVersion : IamPolicy.Action("iot:DeletePolicyVersion") {

         }       
 
      class _DeleteThing : IamPolicy.Action("iot:DeleteThing") {

         }       
 
      class _DeleteThingShadow : IamPolicy.Action("iot:DeleteThingShadow") {
             //arn:aws:iot:$region:$account:thing/$thing-name"
            fun thing_byRegionAccountThingname(region: String, account: String, thingname: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:thing/$thingname")
         }       
 
      class _DeleteTopicRule : IamPolicy.Action("iot:DeleteTopicRule") {

         }       
 
      class _DescribeCertificate : IamPolicy.Action("iot:DescribeCertificate") {

         }       
 
      class _DescribeEndpoint : IamPolicy.Action("iot:DescribeEndpoint") {

         }       
 
      class _DescribeThing : IamPolicy.Action("iot:DescribeThing") {

         }       
 
      class _DetachPrincipalPolicy : IamPolicy.Action("iot:DetachPrincipalPolicy") {

         }       
 
      class _DetachThingPrincipal : IamPolicy.Action("iot:DetachThingPrincipal") {

         }       
 
      class _GetLoggingOptions : IamPolicy.Action("iot:GetLoggingOptions") {

         }       
 
      class _GetPolicy : IamPolicy.Action("iot:GetPolicy") {

         }       
 
      class _GetPolicyVersion : IamPolicy.Action("iot:GetPolicyVersion") {

         }       
 
      class _GetThingShadow : IamPolicy.Action("iot:GetThingShadow") {
             //arn:aws:iot:$region:$account:thing/$thing-name"
            fun thing_byRegionAccountThingname(region: String, account: String, thingname: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:thing/$thingname")
         }       
 
      class _GetTopicRule : IamPolicy.Action("iot:GetTopicRule") {

         }       
 
      class _ListCertificates : IamPolicy.Action("iot:ListCertificates") {

         }       
 
      class _ListPolicies : IamPolicy.Action("iot:ListPolicies") {

         }       
 
      class _ListPolicyVersions : IamPolicy.Action("iot:ListPolicyVersions") {

         }       
 
      class _ListPrincipalPolicies : IamPolicy.Action("iot:ListPrincipalPolicies") {

         }       
 
      class _ListPrincipalThings : IamPolicy.Action("iot:ListPrincipalThings") {

         }       
 
      class _ListThingPrincipals : IamPolicy.Action("iot:ListThingPrincipals") {

         }       
 
      class _ListThings : IamPolicy.Action("iot:ListThings") {

         }       
 
      class _ListTopicRules : IamPolicy.Action("iot:ListTopicRules") {

         }       
 
      class _Publish : IamPolicy.Action("iot:Publish") {
             //arn:aws:iot:$region:$account:topic/$topic-name"
            fun topic_byRegionAccountTopicname(region: String, account: String, topicname: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:topic/$topicname")
         }       
 
      class _Receive : IamPolicy.Action("iot:Receive") {
             //arn:aws:iot:$region:$account:topic/$topic-name"
            fun topic_byRegionAccountTopicname(region: String, account: String, topicname: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:topic/$topicname")
         }       
 
      class _RejectCertificateTransfer : IamPolicy.Action("iot:RejectCertificateTransfer") {

         }       
 
      class _ReplaceTopicRule : IamPolicy.Action("iot:ReplaceTopicRule") {

         }       
 
      class _SetDefaultPolicyVersion : IamPolicy.Action("iot:SetDefaultPolicyVersion") {

         }       
 
      class _SetLoggingOptions : IamPolicy.Action("iot:SetLoggingOptions") {

         }       
 
      class _Subscribe : IamPolicy.Action("iot:Subscribe") {
             //arn:aws:iot:$region:$account:topicfilter/$topic-filter"
            fun topicfilter_byRegionAccountTopicfilter(region: String, account: String, topicfilter: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:topicfilter/$topicfilter")
         }       
 
      class _TransferCertificate : IamPolicy.Action("iot:TransferCertificate") {

         }       
 
      class _UpdateCertificate : IamPolicy.Action("iot:UpdateCertificate") {

         }       
 
      class _UpdateThing : IamPolicy.Action("iot:UpdateThing") {

         }       
 
      class _UpdateThingShadow : IamPolicy.Action("iot:UpdateThingShadow") {
             //arn:aws:iot:$region:$account:thing/$thing-name"
            fun thing_byRegionAccountThingname(region: String, account: String, thingname: String) = IamPolicy.Resource("arn:aws:iot:$region:$account:thing/$thingname")
         }       


}        
