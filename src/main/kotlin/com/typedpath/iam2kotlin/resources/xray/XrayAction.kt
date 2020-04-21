
package com.typedpath.iam2kotlin.resources.xray

import com.typedpath.iam2kotlin.IamPolicy

class XrayAction() {

    companion object { 
        val All = IamPolicy.Action("xray:*")    
        // see http://docs.aws.amazon.com/xray/latest/api/API_BatchGetTraces.html 
        //  Retrieves a list of traces specified by ID.    
        val BatchGetTraces = _BatchGetTraces() 
        // see http://docs.aws.amazon.com/xray/latest/api/API_GetServiceGraph.html 
        //  Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result.    
        val GetServiceGraph = _GetServiceGraph() 
        // see http://docs.aws.amazon.com/xray/latest/api/API_GetTraceGraph.html 
        //  Retrieves a service graph for one or more specific trace IDs.    
        val GetTraceGraph = _GetTraceGraph() 
        // see http://docs.aws.amazon.com/xray/latest/api/API_GetTraceSummaries.html 
        //  Retrieves IDs and metadata for traces available for a specified time frame using an optional filter.    
        val GetTraceSummaries = _GetTraceSummaries() 
        // see http://docs.aws.amazon.com/xray/latest/api/API_PutTelemetryRecords.html 
        //  Used by the AWS X-Ray daemon to upload telemetry.    
        val PutTelemetryRecords = _PutTelemetryRecords() 
        // see http://docs.aws.amazon.com/xray/latest/api/API_PutTraceSegments.html 
        //  Uploads segment documents to AWS X-Ray.    
        val PutTraceSegments = _PutTraceSegments()
    }
      class _BatchGetTraces : IamPolicy.Action("xray:BatchGetTraces") {

         }       
 
      class _GetServiceGraph : IamPolicy.Action("xray:GetServiceGraph") {

         }       
 
      class _GetTraceGraph : IamPolicy.Action("xray:GetTraceGraph") {

         }       
 
      class _GetTraceSummaries : IamPolicy.Action("xray:GetTraceSummaries") {

         }       
 
      class _PutTelemetryRecords : IamPolicy.Action("xray:PutTelemetryRecords") {

         }       
 
      class _PutTraceSegments : IamPolicy.Action("xray:PutTraceSegments") {

         }       


}        
