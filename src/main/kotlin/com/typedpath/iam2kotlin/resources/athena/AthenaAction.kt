
package com.typedpath.iam2kotlin.resources.athena

import com.typedpath.iam2kotlin.IamPolicy

class AthenaAction() {

    companion object { 
        val All = IamPolicy.Action("athena:*")    
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_BatchGetNamedQuery.html 
        //  Returns the details of a single named query or a list of up to 50 queries.    
        val BatchGetNamedQuery = _BatchGetNamedQuery() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_BatchGetQueryExecution.html 
        //  Returns the details of a single query execution or a list of up to 50 query executions.    
        val BatchGetQueryExecution = _BatchGetQueryExecution() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_CreateNamedQuery.html 
        //  Creates a named query.    
        val CreateNamedQuery = _CreateNamedQuery() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_DeleteNamedQuery.html 
        //  Deletes a named query.    
        val DeleteNamedQuery = _DeleteNamedQuery() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_GetNamedQuery.html 
        //  Returns information about a single query.    
        val GetNamedQuery = _GetNamedQuery() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_GetQueryExecution.html 
        //  Returns information about a single execution of a query.    
        val GetQueryExecution = _GetQueryExecution() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_GetQueryResults.html 
        //  Returns the results of a single query execution specified by QueryExecutionId.    
        val GetQueryResults = _GetQueryResults() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_ListNamedQueries.html 
        //   Provides a list of all available query IDs.    
        val ListNamedQueries = _ListNamedQueries() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_ListQueryExecutions.html 
        //  Provides a list of all available query execution IDs.    
        val ListQueryExecutions = _ListQueryExecutions() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_StartQueryExecution.html 
        //  Runs (executes) the SQL query statements contained in the Query string.    
        val StartQueryExecution = _StartQueryExecution() 
        // see http://docs.aws.amazon.com/athena/latest/APIReference/API_StopQueryExecution.html 
        //  Stops a query execution.    
        val StopQueryExecution = _StopQueryExecution()
    }
      class _BatchGetNamedQuery : IamPolicy.Action("athena:BatchGetNamedQuery") {

         }       
 
      class _BatchGetQueryExecution : IamPolicy.Action("athena:BatchGetQueryExecution") {

         }       
 
      class _CreateNamedQuery : IamPolicy.Action("athena:CreateNamedQuery") {

         }       
 
      class _DeleteNamedQuery : IamPolicy.Action("athena:DeleteNamedQuery") {

         }       
 
      class _GetNamedQuery : IamPolicy.Action("athena:GetNamedQuery") {

         }       
 
      class _GetQueryExecution : IamPolicy.Action("athena:GetQueryExecution") {

         }       
 
      class _GetQueryResults : IamPolicy.Action("athena:GetQueryResults") {

         }       
 
      class _ListNamedQueries : IamPolicy.Action("athena:ListNamedQueries") {

         }       
 
      class _ListQueryExecutions : IamPolicy.Action("athena:ListQueryExecutions") {

         }       
 
      class _StartQueryExecution : IamPolicy.Action("athena:StartQueryExecution") {

         }       
 
      class _StopQueryExecution : IamPolicy.Action("athena:StopQueryExecution") {

         }       


}        
