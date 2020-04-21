
package com.typedpath.iam2kotlin.resources.kinesis

import com.typedpath.iam2kotlin.IamPolicy

class KinesisAction() {

    companion object { 
        val All = IamPolicy.Action("kinesis:*")    
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_AddTagsToStream.html 
        //  Adds or updates tags for the specified Amazon Kinesis stream.    
        val AddTagsToStream = _AddTagsToStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_CreateStream.html 
        //  Creates an Amazon Kinesis stream.    
        val CreateStream = _CreateStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DecreaseStreamRetentionPeriod.html 
        //  Decreases the Amazon Kinesis stream's retention period, which is the length of time data records are accessible after they are added to the stream.    
        val DecreaseStreamRetentionPeriod = _DecreaseStreamRetentionPeriod() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DeleteStream.html 
        //  Deletes an Amazon Kinesis stream and all its shards and data.    
        val DeleteStream = _DeleteStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DescribeLimits.html 
        //  Describes the shard limits and usage for the account.    
        val DescribeLimits = _DescribeLimits() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DescribeStream.html 
        //  Describes the specified Amazon Kinesis stream.    
        val DescribeStream = _DescribeStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DescribeStreamSummary.html 
        //   Provides a summarized description of the specified Kinesis stream without the shard list.    
        val DescribeStreamSummary = _DescribeStreamSummary() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_DisableEnhancedMonitoring.html 
        //  Disables enhanced monitoring.    
        val DisableEnhancedMonitoring = _DisableEnhancedMonitoring() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_EnableEnhancedMonitoring.html 
        //  Enables enhanced Kinesis stream monitoring for shard-level metrics.    
        val EnableEnhancedMonitoring = _EnableEnhancedMonitoring() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html 
        //  Gets data records from an Amazon Kinesis stream's shard.    
        val GetRecords = _GetRecords() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html 
        //  Gets an Amazon Kinesis shard iterator.    
        val GetShardIterator = _GetShardIterator() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_IncreaseStreamRetentionPeriod.html 
        //  Increases the Amazon Kinesis stream's retention period, which is the length of time data records are accessible after they are added to the stream.    
        val IncreaseStreamRetentionPeriod = _IncreaseStreamRetentionPeriod() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_ListStreams.html 
        //  Lists your Amazon Kinesis streams.    
        val ListStreams = _ListStreams() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_ListTagsForStream.html 
        //  Lists the tags for the specified Amazon Kinesis stream.    
        val ListTagsForStream = _ListTagsForStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_MergeShards.html 
        //  Merges two adjacent shards in an Amazon Kinesis stream and combines them into a single shard to reduce the stream's capacity to ingest and transport data.    
        val MergeShards = _MergeShards() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html 
        //  Writes a single data record into an Amazon Kinesis stream.    
        val PutRecord = _PutRecord() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecords.html 
        //  Writes multiple data records into an Amazon Kinesis stream in a single call (also referred to as a PutRecords request).    
        val PutRecords = _PutRecords() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_RemoveTagsFromStream.html 
        //  Removes tags from the specified Amazon Kinesis stream.    
        val RemoveTagsFromStream = _RemoveTagsFromStream() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_SplitShard.html 
        //  Splits a shard into two new shards in the Amazon Kinesis stream to increase the stream's capacity to ingest and transport data.    
        val SplitShard = _SplitShard() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_StartStreamEncryption.html 
        //  Enables or updates server-side encryption using an AWS KMS key for a specified stream.    
        val StartStreamEncryption = _StartStreamEncryption() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_StopStreamEncryption.html 
        //  Disables server-side encryption for a specified stream.    
        val StopStreamEncryption = _StopStreamEncryption() 
        // see http://docs.aws.amazon.com/kinesis/latest/APIReference/API_UpdateShardCount.html 
        //  Update the shard count.    
        val UpdateShardCount = _UpdateShardCount()
    }
      class _AddTagsToStream : IamPolicy.Action("kinesis:AddTagsToStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _CreateStream : IamPolicy.Action("kinesis:CreateStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _DecreaseStreamRetentionPeriod : IamPolicy.Action("kinesis:DecreaseStreamRetentionPeriod") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _DeleteStream : IamPolicy.Action("kinesis:DeleteStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _DescribeLimits : IamPolicy.Action("kinesis:DescribeLimits") {

         }       
 
      class _DescribeStream : IamPolicy.Action("kinesis:DescribeStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _DescribeStreamSummary : IamPolicy.Action("kinesis:DescribeStreamSummary") {

         }       
 
      class _DisableEnhancedMonitoring : IamPolicy.Action("kinesis:DisableEnhancedMonitoring") {

         }       
 
      class _EnableEnhancedMonitoring : IamPolicy.Action("kinesis:EnableEnhancedMonitoring") {

         }       
 
      class _GetRecords : IamPolicy.Action("kinesis:GetRecords") {

         }       
 
      class _GetShardIterator : IamPolicy.Action("kinesis:GetShardIterator") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _IncreaseStreamRetentionPeriod : IamPolicy.Action("kinesis:IncreaseStreamRetentionPeriod") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _ListStreams : IamPolicy.Action("kinesis:ListStreams") {

         }       
 
      class _ListTagsForStream : IamPolicy.Action("kinesis:ListTagsForStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _MergeShards : IamPolicy.Action("kinesis:MergeShards") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _PutRecord : IamPolicy.Action("kinesis:PutRecord") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _PutRecords : IamPolicy.Action("kinesis:PutRecords") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _RemoveTagsFromStream : IamPolicy.Action("kinesis:RemoveTagsFromStream") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _SplitShard : IamPolicy.Action("kinesis:SplitShard") {
             //arn:aws:kinesis:$region:$account:stream/$stream-name"
            fun stream_byRegionAccountStreamname(region: String, account: String, streamname: String) = IamPolicy.Resource("arn:aws:kinesis:$region:$account:stream/$streamname")
         }       
 
      class _StartStreamEncryption : IamPolicy.Action("kinesis:StartStreamEncryption") {

         }       
 
      class _StopStreamEncryption : IamPolicy.Action("kinesis:StopStreamEncryption") {

         }       
 
      class _UpdateShardCount : IamPolicy.Action("kinesis:UpdateShardCount") {

         }       


}        
