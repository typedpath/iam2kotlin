
package com.typedpath.iam2kotlin.resources.firehose

import com.typedpath.iam2kotlin.IamPolicy

class FirehoseAction() {

    companion object { 
        val All = IamPolicy.Action("firehose:*")    
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_CreateDeliveryStream.html 
        //  Creates a delivery stream.    
        val CreateDeliveryStream = _CreateDeliveryStream() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_DeleteDeliveryStream.html 
        //  Deletes a delivery stream and its data.    
        val DeleteDeliveryStream = _DeleteDeliveryStream() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_DescribeDeliveryStream.html 
        //  Describes the specified delivery stream and gets the status.    
        val DescribeDeliveryStream = _DescribeDeliveryStream() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_ListDeliveryStreams.html 
        //  Lists your delivery streams.    
        val ListDeliveryStreams = _ListDeliveryStreams() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecord.html 
        //  Writes a single data record into an Amazon Kinesis Firehose delivery stream.    
        val PutRecord = _PutRecord() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html 
        //  Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per producer than when writing single records.    
        val PutRecordBatch = _PutRecordBatch() 
        // see http://docs.aws.amazon.com/firehose/latest/APIReference/API_UpdateDestination.html 
        //  Updates the specified destination of the specified delivery stream.    
        val UpdateDestination = _UpdateDestination() 
        // see https://docs.aws.amazon.com/firehose/latest/APIReference/API_ListTagsForDeliveryStream.html 
        //  Lists the tags for the specified delivery stream. .    
        val ListTagsForDeliveryStream  = _ListTagsForDeliveryStream () 
        // see https://docs.aws.amazon.com/firehose/latest/APIReference/API_UntagDeliveryStream.html 
        //  Removes tags from the specified delivery stream. .    
        val UntagDeliveryStream  = _UntagDeliveryStream () 
        // see https://docs.aws.amazon.com/firehose/latest/APIReference/API_TagDeliveryStream.html 
        //  Adds or updates tags for the specified delivery stream. .    
        val TagDeliveryStream  = _TagDeliveryStream () 
        // see https://docs.aws.amazon.com/firehose/latest/APIReference/API_StartDeliveryStreamEncryption.html 
        //  Enables server-side encryption (SSE) for the delivery stream. .    
        val StartDeliveryStreamEncryption  = _StartDeliveryStreamEncryption () 
        // see https://docs.aws.amazon.com/firehose/latest/APIReference/API_StopDeliveryStreamEncryption.html 
        //  Disables the specified destination of the specified delivery stream. .    
        val StopDeliveryStreamEncryption  = _StopDeliveryStreamEncryption ()
    }
      class _CreateDeliveryStream : IamPolicy.Action("firehose:CreateDeliveryStream") {

         }       
 
      class _DeleteDeliveryStream : IamPolicy.Action("firehose:DeleteDeliveryStream") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _DescribeDeliveryStream : IamPolicy.Action("firehose:DescribeDeliveryStream") {

         }       
 
      class _ListDeliveryStreams : IamPolicy.Action("firehose:ListDeliveryStreams") {

         }       
 
      class _PutRecord : IamPolicy.Action("firehose:PutRecord") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _PutRecordBatch : IamPolicy.Action("firehose:PutRecordBatch") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _UpdateDestination : IamPolicy.Action("firehose:UpdateDestination") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _ListTagsForDeliveryStream  : IamPolicy.Action("firehose:ListTagsForDeliveryStream ") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _UntagDeliveryStream  : IamPolicy.Action("firehose:UntagDeliveryStream ") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _TagDeliveryStream  : IamPolicy.Action("firehose:TagDeliveryStream ") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _StartDeliveryStreamEncryption  : IamPolicy.Action("firehose:StartDeliveryStreamEncryption ") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       
 
      class _StopDeliveryStreamEncryption  : IamPolicy.Action("firehose:StopDeliveryStreamEncryption ") {
             //arn:aws:firehose:$region:$account:deliverystream/$delivery-stream-name"
            fun deliverystream_byRegionAccountDeliverystreamname(region: String, account: String, deliverystreamname: String) = IamPolicy.Resource("arn:aws:firehose:$region:$account:deliverystream/$deliverystreamname")
         }       


}        
