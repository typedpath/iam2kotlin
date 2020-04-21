
package com.typedpath.iam2kotlin.resources.dynamodb

import com.typedpath.iam2kotlin.IamPolicy

class DynamodbAction() {

    companion object { 
        val All = IamPolicy.Action("dynamodb:*")    
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchGetItem.html 
        //  The BatchGetItem operation returns the attributes of one or more items from one or more tables.    
        val BatchGetItem = _BatchGetItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html 
        //  The BatchWriteItem operation puts or deletes multiple items in one or more tables.    
        val BatchWriteItem = _BatchWriteItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_CreateTable.html 
        //  The CreateTable operation adds a new table to your account.    
        val CreateTable = _CreateTable() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteItem.html 
        //  Deletes a single item in a table by primary key.    
        val DeleteItem = _DeleteItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DeleteTable.html 
        //  The DeleteTable operation deletes a table and all of its items.    
        val DeleteTable = _DeleteTable() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DescribeLimits.html 
        //  Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole and for any one DynamoDB table that you create there.    
        val DescribeLimits = _DescribeLimits() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DescribeReservedCapacity.html 
        //  ???    
        val DescribeReservedCapacity = _DescribeReservedCapacity() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DescribeReservedCapacityOfferings.html 
        //  ???    
        val DescribeReservedCapacityOfferings = _DescribeReservedCapacityOfferings() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DescribeStream.html 
        //  ???    
        val DescribeStream = _DescribeStream() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_DescribeTable.html 
        //  Returns information about the table, including the current status of the table, when it was created, the primary key schema, and any indexes on the table.    
        val DescribeTable = _DescribeTable() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetItem.html 
        //  The GetItem operation returns a set of attributes for the item with the given primary key.    
        val GetItem = _GetItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetRecords.html 
        //  ???    
        val GetRecords = _GetRecords() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_GetShardIterator.html 
        //  ???    
        val GetShardIterator = _GetShardIterator() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ListStreams.html 
        //  ???    
        val ListStreams = _ListStreams() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ListTables.html 
        //  Returns an array of table names associated with the current account and endpoint.    
        val ListTables = _ListTables() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ListTagsOfResource.html 
        //  List all tags on an Amazon DynamoDB resource    
        val ListTagsOfResource = _ListTagsOfResource() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PurchaseReservedCapacityOfferings.html 
        //  ???    
        val PurchaseReservedCapacityOfferings = _PurchaseReservedCapacityOfferings() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutItem.html 
        //  Creates a new item, or replaces an old item with a new item.    
        val PutItem = _PutItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Query.html 
        //  A Query operation uses the primary key of a table or a secondary index to directly access items from that table or index.    
        val Query = _Query() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Scan.html 
        //  The Scan operation returns one or more items and item attributes by accessing every item in a table or a secondary index.    
        val Scan = _Scan() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_UpdateItem.html 
        //  Edits an existing item's attributes, or adds a new item to the table if it does not already exist.    
        val UpdateItem = _UpdateItem() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_UpdateTable.html 
        //  Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given table.    
        val UpdateTable = _UpdateTable()
    }
      class _BatchGetItem : IamPolicy.Action("dynamodb:BatchGetItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _BatchWriteItem : IamPolicy.Action("dynamodb:BatchWriteItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _CreateTable : IamPolicy.Action("dynamodb:CreateTable") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _DeleteItem : IamPolicy.Action("dynamodb:DeleteItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _DeleteTable : IamPolicy.Action("dynamodb:DeleteTable") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _DescribeLimits : IamPolicy.Action("dynamodb:DescribeLimits") {
             //arn:aws:dynamodb:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:*")
         }       
 
      class _DescribeReservedCapacity : IamPolicy.Action("dynamodb:DescribeReservedCapacity") {
             //arn:aws:dynamodb:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:*")
         }       
 
      class _DescribeReservedCapacityOfferings : IamPolicy.Action("dynamodb:DescribeReservedCapacityOfferings") {
             //arn:aws:dynamodb:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:*")
         }       
 
      class _DescribeStream : IamPolicy.Action("dynamodb:DescribeStream") {
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/$stream-label"
            fun table_stream_byRegionAccountTablenameStreamlabel(region: String, account: String, tablename: String, streamlabel: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/$streamlabel")
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/*"
            fun table_stream_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/*")
         }       
 
      class _DescribeTable : IamPolicy.Action("dynamodb:DescribeTable") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _GetItem : IamPolicy.Action("dynamodb:GetItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _GetRecords : IamPolicy.Action("dynamodb:GetRecords") {
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/$stream-label"
            fun table_stream_byRegionAccountTablenameStreamlabel(region: String, account: String, tablename: String, streamlabel: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/$streamlabel")
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/*"
            fun table_stream_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/*")
         }       
 
      class _GetShardIterator : IamPolicy.Action("dynamodb:GetShardIterator") {
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/$stream-label"
            fun table_stream_byRegionAccountTablenameStreamlabel(region: String, account: String, tablename: String, streamlabel: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/$streamlabel")
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/*"
            fun table_stream_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/*")
         }       
 
      class _ListStreams : IamPolicy.Action("dynamodb:ListStreams") {
             //arn:aws:dynamodb:$region:$account:table/$table-name/stream/*"
            fun table_stream_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/stream/*")
             //arn:aws:dynamodb:$region:$account:table/*/stream/*"
            fun table_all_stream_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*/stream/*")
         }       
 
      class _ListTables : IamPolicy.Action("dynamodb:ListTables") {

         }       
 
      class _ListTagsOfResource : IamPolicy.Action("dynamodb:ListTagsOfResource") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _PurchaseReservedCapacityOfferings : IamPolicy.Action("dynamodb:PurchaseReservedCapacityOfferings") {
             //arn:aws:dynamodb:$region:$account:*"
            fun all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:*")
         }       
 
      class _PutItem : IamPolicy.Action("dynamodb:PutItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _Query : IamPolicy.Action("dynamodb:Query") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
             //arn:aws:dynamodb:$region:$account:table/$table-name/index/$index-name"
            fun table_index_byRegionAccountTablenameIndexname(region: String, account: String, tablename: String, indexname: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/index/$indexname")
             //arn:aws:dynamodb:$region:$account:table/$table-name/index/*"
            fun table_index_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/index/*")
         }       
 
      class _Scan : IamPolicy.Action("dynamodb:Scan") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
             //arn:aws:dynamodb:$region:$account:table/$table-name/index/$index-name"
            fun table_index_byRegionAccountTablenameIndexname(region: String, account: String, tablename: String, indexname: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/index/$indexname")
             //arn:aws:dynamodb:$region:$account:table/$table-name/index/*"
            fun table_index_all_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename/index/*")
         }       
 
      class _UpdateItem : IamPolicy.Action("dynamodb:UpdateItem") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       
 
      class _UpdateTable : IamPolicy.Action("dynamodb:UpdateTable") {
             //arn:aws:dynamodb:$region:$account:table/$table-name"
            fun table_byRegionAccountTablename(region: String, account: String, tablename: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/$tablename")
             //arn:aws:dynamodb:$region:$account:table/*"
            fun table_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:dynamodb:$region:$account:table/*")
         }       


}        
