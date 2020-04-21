
package com.typedpath.iam2kotlin.resources.sdb

import com.typedpath.iam2kotlin.IamPolicy

class SdbAction() {

    companion object { 
        val All = IamPolicy.Action("sdb:*")    
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_BatchDeleteAttributes.html 
        //  Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies.    
        val BatchDeleteAttributes = _BatchDeleteAttributes() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_BatchPutAttributes.html 
        //  With the BatchPutAttributes operation, you can perform multiple PutAttribute operations in a single call.    
        val BatchPutAttributes = _BatchPutAttributes() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_CreateDomain.html 
        //  The CreateDomain operation creates a new domain.    
        val CreateDomain = _CreateDomain() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_DeleteAttributes.html 
        //  Deletes one or more attributes associated with the item.    
        val DeleteAttributes = _DeleteAttributes() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_DeleteDomain.html 
        //  The DeleteDomain operation deletes a domain.    
        val DeleteDomain = _DeleteDomain() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_DomainMetadata.html 
        //  Returns information about the domain, including when the domain was created, the number of items and attributes, and the size of attribute names and values.    
        val DomainMetadata = _DomainMetadata() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_GetAttributes.html 
        //  Returns all of the attributes associated with the item.    
        val GetAttributes = _GetAttributes() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_ListDomains.html 
        //  The ListDomains operation lists all domains associated with the Access Key ID.    
        val ListDomains = _ListDomains() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_PutAttributes.html 
        //  The PutAttributes operation creates or replaces attributes in an item.    
        val PutAttributes = _PutAttributes() 
        // see http://docs.aws.amazon.com/AmazonSimpleDB/latest/DeveloperGuide/SDB_API_Select.html 
        //  The Select operation returns a set of Attributes for ItemNames that match the select expression.    
        val Select = _Select()
    }
      class _BatchDeleteAttributes : IamPolicy.Action("sdb:BatchDeleteAttributes") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _BatchPutAttributes : IamPolicy.Action("sdb:BatchPutAttributes") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _CreateDomain : IamPolicy.Action("sdb:CreateDomain") {

         }       
 
      class _DeleteAttributes : IamPolicy.Action("sdb:DeleteAttributes") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _DeleteDomain : IamPolicy.Action("sdb:DeleteDomain") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _DomainMetadata : IamPolicy.Action("sdb:DomainMetadata") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _GetAttributes : IamPolicy.Action("sdb:GetAttributes") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _ListDomains : IamPolicy.Action("sdb:ListDomains") {

         }       
 
      class _PutAttributes : IamPolicy.Action("sdb:PutAttributes") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       
 
      class _Select : IamPolicy.Action("sdb:Select") {
             //arn:aws:sdb:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:sdb:$region:$account:domain/$domainname")
         }       


}        
