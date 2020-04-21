
package com.typedpath.iam2kotlin.resources.lambda

import com.typedpath.iam2kotlin.IamPolicy

class LambdaAction() {

    companion object { 
        val All = IamPolicy.Action("lambda:*")    
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html 
        //  Adds a permission to the resource policy associated with the specified AWS Lambda function.    
        val AddPermission = _AddPermission() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_CreateAlias.html 
        //  Creates an alias that points to the specified Lambda function version.    
        val CreateAlias = _CreateAlias() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_CreateEventSourceMapping.html 
        //  Identifies a stream as an event source for a Lambda function.    
        val CreateEventSourceMapping = _CreateEventSourceMapping() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html 
        //  Creates a new Lambda function.    
        val CreateFunction = _CreateFunction() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_DeleteAlias.html 
        //  Deletes the specified Lambda function alias.    
        val DeleteAlias = _DeleteAlias() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_DeleteEventSourceMapping.html 
        //  Removes an event source mapping.    
        val DeleteEventSourceMapping = _DeleteEventSourceMapping() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_DeleteFunction.html 
        //  Deletes the specified Lambda function code and configuration.    
        val DeleteFunction = _DeleteFunction() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_GetAlias.html 
        //  Returns the specified alias information such as the alias ARN, description, and function version it is pointing to.    
        val GetAlias = _GetAlias() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_GetEventSourceMapping.html 
        //  Returns configuration information for the specified event source mapping (see CreateEventSourceMapping).    
        val GetEventSourceMapping = _GetEventSourceMapping() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_GetFunction.html 
        //  Returns the configuration information of the Lambda function and a presigned URL link to the .    
        val GetFunction = _GetFunction() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_GetFunctionConfiguration.html 
        //  Returns the configuration information of the Lambda function.    
        val GetFunctionConfiguration = _GetFunctionConfiguration() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_GetPolicy.html 
        //  Returns the resource policy associated with the specified Lambda function.    
        val GetPolicy = _GetPolicy() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html 
        //  Invokes a specific Lambda function.    
        val InvokeFunction = _InvokeFunction() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_InvokeAsync.html 
        //  This API is deprecated. We recommend you use Invoke API    
        val InvokeAsync = _InvokeAsync() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_ListAliases.html 
        //  Returns list of aliases created for a Lambda function.    
        val ListAliases = _ListAliases() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_ListEventSourceMappings.html 
        //  Returns a list of event source mappings you created using the CreateEventSourceMapping (see CreateEventSourceMapping).    
        val ListEventSourceMappings = _ListEventSourceMappings() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_ListFunctions.html 
        //  Returns a list of your Lambda functions.    
        val ListFunctions = _ListFunctions() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_ListVersionsByFunction.html 
        //  List all versions of a function.    
        val ListVersionsByFunction = _ListVersionsByFunction() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_PublishVersion.html 
        //  Publishes a version of your function from the current snapshot of $LATEST.    
        val PublishVersion = _PublishVersion() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_RemovePermission.html 
        //  You can remove individual permissions from an resource policy associated with a Lambda function by providing a statement ID that you provided when you added the permission.    
        val RemovePermission = _RemovePermission() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_UpdateAlias.html 
        //  Using this API you can update the function version to which the alias points and the alias description.    
        val UpdateAlias = _UpdateAlias() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_UpdateEventSourceMapping.html 
        //  You can update an event source mapping.    
        val UpdateEventSourceMapping = _UpdateEventSourceMapping() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_UpdateFunctionCode.html 
        //  Updates the code for the specified Lambda function.    
        val UpdateFunctionCode = _UpdateFunctionCode() 
        // see http://docs.aws.amazon.com/lambda/latest/dg/API_UpdateFunctionConfiguration.html 
        //  Updates the configuration parameters for the specified Lambda function by using the values provided in the request.    
        val UpdateFunctionConfiguration = _UpdateFunctionConfiguration()
    }
      class _AddPermission : IamPolicy.Action("lambda:AddPermission") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _CreateAlias : IamPolicy.Action("lambda:CreateAlias") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _CreateEventSourceMapping : IamPolicy.Action("lambda:CreateEventSourceMapping") {

         }       
 
      class _CreateFunction : IamPolicy.Action("lambda:CreateFunction") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _DeleteAlias : IamPolicy.Action("lambda:DeleteAlias") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _DeleteEventSourceMapping : IamPolicy.Action("lambda:DeleteEventSourceMapping") {
             //arn:aws:lambda:$region:$account:event-source-mapping:$event-source-mapping-uuid"
            fun eventsourcemapping_byRegionAccountEventsourcemappinguuid(region: String, account: String, eventsourcemappinguuid: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:event-source-mapping:$eventsourcemappinguuid")
         }       
 
      class _DeleteFunction : IamPolicy.Action("lambda:DeleteFunction") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _GetAlias : IamPolicy.Action("lambda:GetAlias") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _GetEventSourceMapping : IamPolicy.Action("lambda:GetEventSourceMapping") {

         }       
 
      class _GetFunction : IamPolicy.Action("lambda:GetFunction") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _GetFunctionConfiguration : IamPolicy.Action("lambda:GetFunctionConfiguration") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _GetPolicy : IamPolicy.Action("lambda:GetPolicy") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _InvokeFunction : IamPolicy.Action("lambda:InvokeFunction") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _InvokeAsync : IamPolicy.Action("lambda:InvokeAsync") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _ListAliases : IamPolicy.Action("lambda:ListAliases") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _ListEventSourceMappings : IamPolicy.Action("lambda:ListEventSourceMappings") {

         }       
 
      class _ListFunctions : IamPolicy.Action("lambda:ListFunctions") {

         }       
 
      class _ListVersionsByFunction : IamPolicy.Action("lambda:ListVersionsByFunction") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _PublishVersion : IamPolicy.Action("lambda:PublishVersion") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _RemovePermission : IamPolicy.Action("lambda:RemovePermission") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _UpdateAlias : IamPolicy.Action("lambda:UpdateAlias") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _UpdateEventSourceMapping : IamPolicy.Action("lambda:UpdateEventSourceMapping") {
             //arn:aws:lambda:$region:$account:event-source-mapping:$event-source-mapping-uuid"
            fun eventsourcemapping_byRegionAccountEventsourcemappinguuid(region: String, account: String, eventsourcemappinguuid: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:event-source-mapping:$eventsourcemappinguuid")
         }       
 
      class _UpdateFunctionCode : IamPolicy.Action("lambda:UpdateFunctionCode") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       
 
      class _UpdateFunctionConfiguration : IamPolicy.Action("lambda:UpdateFunctionConfiguration") {
             //arn:aws:lambda:$region:$account:function:$function-name"
            fun function_byRegionAccountFunctionname(region: String, account: String, functionname: String) = IamPolicy.Resource("arn:aws:lambda:$region:$account:function:$functionname")
         }       


}        
