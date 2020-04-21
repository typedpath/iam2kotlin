
package com.typedpath.iam2kotlin.resources.cloudsearch

import com.typedpath.iam2kotlin.IamPolicy

class CloudsearchAction() {

    companion object { 
        val All = IamPolicy.Action("cloudsearch:*")    
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_BuildSuggesters.html 
        //  Indexes the search suggestions.    
        val BuildSuggesters = _BuildSuggesters() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_CreateDomain.html 
        //  Creates a new search domain.    
        val CreateDomain = _CreateDomain() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DefineAnalysisScheme.html 
        //  Configures an analysis scheme that can be applied to a text or text-array field to define language-specific text processing options.    
        val DefineAnalysisScheme = _DefineAnalysisScheme() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DefineExpression.html 
        //  Configures an Expression for the search domain.    
        val DefineExpression = _DefineExpression() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DefineIndexField.html 
        //  Configures an IndexField for the search domain.    
        val DefineIndexField = _DefineIndexField() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_document.html 
        //  ???    
        val DefineIndexFields = _DefineIndexFields() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DefineSuggester.html 
        //  Configures a suggester for a domain.    
        val DefineSuggester = _DefineSuggester() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DeleteAnalysisScheme.html 
        //  Deletes an analysis scheme.    
        val DeleteAnalysisScheme = _DeleteAnalysisScheme() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DeleteDomain.html 
        //  Permanently deletes a search domain and all of its data.    
        val DeleteDomain = _DeleteDomain() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DeleteExpression.html 
        //  Removes an Expression from the search domain.    
        val DeleteExpression = _DeleteExpression() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DeleteIndexField.html 
        //  Removes an IndexField from the search domain.    
        val DeleteIndexField = _DeleteIndexField() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DeleteSuggester.html 
        //  Deletes a suggester.    
        val DeleteSuggester = _DeleteSuggester() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeAnalysisSchemes.html 
        //  Gets the analysis schemes configured for a domain.    
        val DescribeAnalysisSchemes = _DescribeAnalysisSchemes() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeAvailabilityOptions.html 
        //  Gets the availability options configured for a domain.    
        val DescribeAvailabilityOptions = _DescribeAvailabilityOptions() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeDomains.html 
        //  Gets information about the search domains owned by this account.    
        val DescribeDomains = _DescribeDomains() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeExpressions.html 
        //  Gets the expressions configured for the search domain.    
        val DescribeExpressions = _DescribeExpressions() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeIndexFields.html 
        //  Gets information about the index fields configured for the search domain.    
        val DescribeIndexFields = _DescribeIndexFields() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeScalingParameters.html 
        //  Gets the scaling parameters configured for a domain.    
        val DescribeScalingParameters = _DescribeScalingParameters() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeServiceAccessPolicies.html 
        //  Gets information about the access policies that control access to the domain's document and search endpoints.    
        val DescribeServiceAccessPolicies = _DescribeServiceAccessPolicies() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DescribeSuggesters.html 
        //  Gets the suggesters configured for a domain.    
        val DescribeSuggesters = _DescribeSuggesters() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_document.html 
        //  ???    
        val document = _document() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_IndexDocuments.html 
        //  Tells the search domain to start indexing its documents using the latest indexing options.    
        val IndexDocuments = _IndexDocuments() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ListDomainNames.html 
        //  Lists all search domains owned by an account.    
        val ListDomainNames = _ListDomainNames() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_search.html 
        //  ???    
        val search = _search() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_suggest.html 
        //  ???    
        val suggest = _suggest() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_UpdateAvailabilityOptions.html 
        //  Configures the availability options for a domain.    
        val UpdateAvailabilityOptions = _UpdateAvailabilityOptions() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_UpdateScalingParameters.html 
        //  Configures scaling parameters for a domain.    
        val UpdateScalingParameters = _UpdateScalingParameters() 
        // see http://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_UpdateServiceAccessPolicies.html 
        //  Configures the access rules that control access to the domain's document and search endpoints.    
        val UpdateServiceAccessPolicies = _UpdateServiceAccessPolicies()
    }
      class _BuildSuggesters : IamPolicy.Action("cloudsearch:BuildSuggesters") {

         }       
 
      class _CreateDomain : IamPolicy.Action("cloudsearch:CreateDomain") {

         }       
 
      class _DefineAnalysisScheme : IamPolicy.Action("cloudsearch:DefineAnalysisScheme") {

         }       
 
      class _DefineExpression : IamPolicy.Action("cloudsearch:DefineExpression") {

         }       
 
      class _DefineIndexField : IamPolicy.Action("cloudsearch:DefineIndexField") {

         }       
 
      class _DefineIndexFields : IamPolicy.Action("cloudsearch:DefineIndexFields") {

         }       
 
      class _DefineSuggester : IamPolicy.Action("cloudsearch:DefineSuggester") {

         }       
 
      class _DeleteAnalysisScheme : IamPolicy.Action("cloudsearch:DeleteAnalysisScheme") {

         }       
 
      class _DeleteDomain : IamPolicy.Action("cloudsearch:DeleteDomain") {

         }       
 
      class _DeleteExpression : IamPolicy.Action("cloudsearch:DeleteExpression") {

         }       
 
      class _DeleteIndexField : IamPolicy.Action("cloudsearch:DeleteIndexField") {

         }       
 
      class _DeleteSuggester : IamPolicy.Action("cloudsearch:DeleteSuggester") {

         }       
 
      class _DescribeAnalysisSchemes : IamPolicy.Action("cloudsearch:DescribeAnalysisSchemes") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeAvailabilityOptions : IamPolicy.Action("cloudsearch:DescribeAvailabilityOptions") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeDomains : IamPolicy.Action("cloudsearch:DescribeDomains") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeExpressions : IamPolicy.Action("cloudsearch:DescribeExpressions") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeIndexFields : IamPolicy.Action("cloudsearch:DescribeIndexFields") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeScalingParameters : IamPolicy.Action("cloudsearch:DescribeScalingParameters") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeServiceAccessPolicies : IamPolicy.Action("cloudsearch:DescribeServiceAccessPolicies") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _DescribeSuggesters : IamPolicy.Action("cloudsearch:DescribeSuggesters") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _document : IamPolicy.Action("cloudsearch:document") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _IndexDocuments : IamPolicy.Action("cloudsearch:IndexDocuments") {

         }       
 
      class _ListDomainNames : IamPolicy.Action("cloudsearch:ListDomainNames") {

         }       
 
      class _search : IamPolicy.Action("cloudsearch:search") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _suggest : IamPolicy.Action("cloudsearch:suggest") {
             //arn:aws:cloudsearch:$region:$account:domain/$domain-name"
            fun domain_byRegionAccountDomainname(region: String, account: String, domainname: String) = IamPolicy.Resource("arn:aws:cloudsearch:$region:$account:domain/$domainname")
         }       
 
      class _UpdateAvailabilityOptions : IamPolicy.Action("cloudsearch:UpdateAvailabilityOptions") {

         }       
 
      class _UpdateScalingParameters : IamPolicy.Action("cloudsearch:UpdateScalingParameters") {

         }       
 
      class _UpdateServiceAccessPolicies : IamPolicy.Action("cloudsearch:UpdateServiceAccessPolicies") {

         }       


}        
