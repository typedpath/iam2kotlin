
package com.typedpath.iam2kotlin.resources.execute_api

import com.typedpath.iam2kotlin.IamPolicy

class Execute_apiAction() {

    companion object { 
        val All = IamPolicy.Action("execute_api:*")    
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Invoke an API upon a client request.    
        val Invoke = _Invoke() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Invalidate API cache upon a client request.    
        val InvalidateCache = _InvalidateCache()
    }
      class _Invoke : IamPolicy.Action("execute-api:Invoke") {
             //arn:aws:execute-api:$region:$account:$api-id/$stage-name/$http-verb/$resource-path"
            fun byRegionAccountApiidStagenameHttpverbResourcepath(region: String, account: String, apiid: String, stagename: String, httpverb: String, resourcepath: String) = IamPolicy.Resource("arn:aws:execute-api:$region:$account:$apiid/$stagename/$httpverb/$resourcepath")
         }       
 
      class _InvalidateCache : IamPolicy.Action("execute-api:InvalidateCache") {
             //arn:aws:execute-api:$region:$account:$api-id/$stage-name/$http-verb/$resource-path"
            fun byRegionAccountApiidStagenameHttpverbResourcepath(region: String, account: String, apiid: String, stagename: String, httpverb: String, resourcepath: String) = IamPolicy.Resource("arn:aws:execute-api:$region:$account:$apiid/$stagename/$httpverb/$resourcepath")
         }       


}        
