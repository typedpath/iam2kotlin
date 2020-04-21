
package com.typedpath.iam2kotlin.resources.apigateway

import com.typedpath.iam2kotlin.IamPolicy

class ApigatewayAction() {

    companion object { 
        val All = IamPolicy.Action("apigateway:*")    
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Get information about resources.    
        val GET = _GET() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Primarily used to create child resources..    
        val POST = _POST() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Primarily used to update resources (and, although not recommended, can be used to create child resources)..    
        val PUT = _PUT() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Used to delete resources.    
        val DELETE = _DELETE() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Used to update resources    
        val PATCH = _PATCH() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Same as GET but does not return the resource representation. HEAD is used primarily in testing scenarios.    
        val HEAD = _HEAD() 
        // see http://docs.aws.amazon.com/apigateway/latest/developerguide/permissions.html 
        //  Used by callers to get information about available communication options for the target service.    
        val OPTIONS = _OPTIONS()
    }
      class _GET : IamPolicy.Action("apigateway:GET") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _POST : IamPolicy.Action("apigateway:POST") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _PUT : IamPolicy.Action("apigateway:PUT") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _DELETE : IamPolicy.Action("apigateway:DELETE") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _PATCH : IamPolicy.Action("apigateway:PATCH") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _HEAD : IamPolicy.Action("apigateway:HEAD") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       
 
      class _OPTIONS : IamPolicy.Action("apigateway:OPTIONS") {
             //arn:aws:apigateway:$region::/restapis/*"
            fun restapis_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/*"
            fun restapis_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/*"
            fun restapis_resources_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/*"
            fun restapis_resources_methods_all_byRegionApiidResourceid(region: String, apiid: String, resourceid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/resources/$resource-id/methods/$http-verb"
            fun restapis_resources_methods_byRegionApiidResourceidHttpverb(region: String, apiid: String, resourceid: String, httpverb: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/resources/$resourceid/methods/$httpverb")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/*"
            fun restapis_models_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/models/$model-name"
            fun restapis_models_byRegionApiidModelname(region: String, apiid: String, modelname: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/models/$modelname")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/*"
            fun restapis_stages_all_byRegionApiid(region: String, apiid: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/*")
             //arn:aws:apigateway:$region::/restapis/$api-id/stages/$stage-name"
            fun restapis_stages_byRegionApiidStagename(region: String, apiid: String, stagename: String) = IamPolicy.Resource("arn:aws:apigateway:$region::/restapis/$apiid/stages/$stagename")
         }       


}        
