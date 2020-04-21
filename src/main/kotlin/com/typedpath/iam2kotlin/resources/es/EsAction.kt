
package com.typedpath.iam2kotlin.resources.es

import com.typedpath.iam2kotlin.IamPolicy

class EsAction() {

    companion object { 
        val All = IamPolicy.Action("es:*")    
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-addtags 
        //  Attaches resource tags to an Amazon ES domain.    
        val AddTags = _AddTags() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-createelasticsearchdomain 
        //  Creates a new Amazon ES domain.    
        val CreateElasticsearchDomain = _CreateElasticsearchDomain() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-deleteelasticsearchdomain 
        //  Deletes an Amazon ES domain and all of its data.    
        val DeleteElasticsearchDomain = _DeleteElasticsearchDomain() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-describeelasticsearchdomain 
        //  Describes the domain configuration for the specified Amazon ES domain, including the domain ID, domain service endpoint, and domain ARN.    
        val DescribeElasticsearchDomain = _DescribeElasticsearchDomain() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-describeesdomains 
        //  Describes the domain configuration for up to five specified Amazon ES domains.    
        val DescribeElasticsearchDomains = _DescribeElasticsearchDomains() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-describeelasticsearchdomainconfig 
        //  Displays the configuration of an Amazon ES domain.    
        val DescribeElasticsearchDomainConfig = _DescribeElasticsearchDomainConfig() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-listtags 
        //  Displays the names of all Amazon ES domains owned by the current user.    
        val ListDomainNames = _ListDomainNames() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-listtags 
        //  Displays all of the tags for an Amazon ES domain.    
        val ListTags = _ListTags() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-removetags 
        //  Removes the specified resource tags from an Amazon ES domain.    
        val RemoveTags = _RemoveTags() 
        // see http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-api.html#es-configuration-api-actions-updateelasticsearchdomainconfig 
        //  Modifies the configuration of an Amazon ES domain, such as the instance type and the number of instances.    
        val UpdateElasticsearchDomainConfig = _UpdateElasticsearchDomainConfig() 
        // see # 
        //  HTTP DELETE requests to ES API    
        val ESHttpDelete = _ESHttpDelete() 
        // see # 
        //  HTTP GET requests to ES API    
        val ESHttpGet = _ESHttpGet() 
        // see # 
        //  HTTP HEAD requests to ES API    
        val ESHttpHead = _ESHttpHead() 
        // see # 
        //  HTTP POST requests to ES API    
        val ESHttpPost = _ESHttpPost() 
        // see # 
        //  HTTP PUT requests to ES API    
        val ESHttpPut = _ESHttpPut()
    }
      class _AddTags : IamPolicy.Action("es:AddTags") {

         }       
 
      class _CreateElasticsearchDomain : IamPolicy.Action("es:CreateElasticsearchDomain") {

         }       
 
      class _DeleteElasticsearchDomain : IamPolicy.Action("es:DeleteElasticsearchDomain") {

         }       
 
      class _DescribeElasticsearchDomain : IamPolicy.Action("es:DescribeElasticsearchDomain") {

         }       
 
      class _DescribeElasticsearchDomains : IamPolicy.Action("es:DescribeElasticsearchDomains") {

         }       
 
      class _DescribeElasticsearchDomainConfig : IamPolicy.Action("es:DescribeElasticsearchDomainConfig") {

         }       
 
      class _ListDomainNames : IamPolicy.Action("es:ListDomainNames") {

         }       
 
      class _ListTags : IamPolicy.Action("es:ListTags") {

         }       
 
      class _RemoveTags : IamPolicy.Action("es:RemoveTags") {

         }       
 
      class _UpdateElasticsearchDomainConfig : IamPolicy.Action("es:UpdateElasticsearchDomainConfig") {

         }       
 
      class _ESHttpDelete : IamPolicy.Action("es:ESHttpDelete") {
             //arn:aws:es:$region:$account-id:domain/$domain/$path"
            fun domain_byRegionAccountidDomainPath(region: String, accountid: String, domain: String, path: String) = IamPolicy.Resource("arn:aws:es:$region:$accountid:domain/$domain/$path")
         }       
 
      class _ESHttpGet : IamPolicy.Action("es:ESHttpGet") {
             //arn:aws:es:$region:$account-id:domain/$domain/$path"
            fun domain_byRegionAccountidDomainPath(region: String, accountid: String, domain: String, path: String) = IamPolicy.Resource("arn:aws:es:$region:$accountid:domain/$domain/$path")
         }       
 
      class _ESHttpHead : IamPolicy.Action("es:ESHttpHead") {
             //arn:aws:es:$region:$account-id:domain/$domain/$path"
            fun domain_byRegionAccountidDomainPath(region: String, accountid: String, domain: String, path: String) = IamPolicy.Resource("arn:aws:es:$region:$accountid:domain/$domain/$path")
         }       
 
      class _ESHttpPost : IamPolicy.Action("es:ESHttpPost") {
             //arn:aws:es:$region:$account-id:domain/$domain/$path"
            fun domain_byRegionAccountidDomainPath(region: String, accountid: String, domain: String, path: String) = IamPolicy.Resource("arn:aws:es:$region:$accountid:domain/$domain/$path")
         }       
 
      class _ESHttpPut : IamPolicy.Action("es:ESHttpPut") {
             //arn:aws:es:$region:$account-id:domain/$domain/$path"
            fun domain_byRegionAccountidDomainPath(region: String, accountid: String, domain: String, path: String) = IamPolicy.Resource("arn:aws:es:$region:$accountid:domain/$domain/$path")
         }       


}        
