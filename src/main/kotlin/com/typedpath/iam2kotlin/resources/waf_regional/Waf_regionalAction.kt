
package com.typedpath.iam2kotlin.resources.waf_regional

import com.typedpath.iam2kotlin.IamPolicy

class Waf_regionalAction() {

    companion object { 
        val All = IamPolicy.Action("waf_regional:*")    
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_AssociateWebACL.html 
        //  Associates a web ACL with a resource.    
        val AssociateWebACL = _AssociateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateByteMatchSet.html 
        //  Creates a ByteMatchSet.    
        val CreateByteMatchSet = _CreateByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateIPSet.html 
        //  Creates an IPSet, which you use to specify which web requests you want to allow or block based on the IP addresses that the requests originate from.    
        val CreateIPSet = _CreateIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateRule.html 
        //  Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block.    
        val CreateRule = _CreateRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateSizeConstraintSet.html 
        //  Creates a SizeConstraintSet.    
        val CreateSizeConstraintSet = _CreateSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateSqlInjectionMatchSet.html 
        //  Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests.    
        val CreateSqlInjectionMatchSet = _CreateSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateWebACL.html 
        //  Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count.    
        val CreateWebACL = _CreateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_CreateXssMatchSet.html 
        //  Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests.    
        val CreateXssMatchSet = _CreateXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteByteMatchSet.html 
        //  Permanently deletes a ByteMatchSet.    
        val DeleteByteMatchSet = _DeleteByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteIPSet.html 
        //  Permanently deletes an IPSet.    
        val DeleteIPSet = _DeleteIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteRule.html 
        //  Permanently deletes a Rule.    
        val DeleteRule = _DeleteRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteSizeConstraintSet.html 
        //  Permanently deletes a SizeConstraintSet.    
        val DeleteSizeConstraintSet = _DeleteSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteSqlInjectionMatchSet.html 
        //  Permanently deletes a SqlInjectionMatchSet.    
        val DeleteSqlInjectionMatchSet = _DeleteSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteWebACL.html 
        //  Permanently deletes a WebACL.    
        val DeleteWebACL = _DeleteWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DeleteXssMatchSet.html 
        //  Permanently deletes an XssMatchSet.    
        val DeleteXssMatchSet = _DeleteXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_DisassociateWebACL.html 
        //  Removes a web ACL from the specified resource.    
        val DisassociateWebACL = _DisassociateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetByteMatchSet.html 
        //  Returns the ByteMatchSet specified by ByteMatchSetId.    
        val GetByteMatchSet = _GetByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetChangeToken.html 
        //  When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request.    
        val GetChangeToken = _GetChangeToken() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetChangeTokenStatus.html 
        //  Returns the status of a ChangeToken that you got by calling GetChangeToken.    
        val GetChangeTokenStatus = _GetChangeTokenStatus() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetIPSet.html 
        //  Returns the IPSet that is specified by IPSetId.    
        val GetIPSet = _GetIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetRule.html 
        //  Returns the Rule that is specified by the RuleId that you included in the GetRule request.    
        val GetRule = _GetRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetSampledRequests.html 
        //  Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose.    
        val GetSampledRequests = _GetSampledRequests() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetSizeConstraintSet.html 
        //  Returns the SizeConstraintSet specified by SizeConstraintSetId.    
        val GetSizeConstraintSet = _GetSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetSqlInjectionMatchSet.html 
        //  Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.    
        val GetSqlInjectionMatchSet = _GetSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetWebACL.html 
        //  Returns the WebACL that is specified by WebACLId.    
        val GetWebACL = _GetWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetWebACLForResource.html 
        //  Returns the web ACL for the specified resource.    
        val GetWebACLForResource = _GetWebACLForResource() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_GetXssMatchSet.html 
        //  Returns the XssMatchSet that is specified by XssMatchSetId.    
        val GetXssMatchSet = _GetXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListByteMatchSets.html 
        //  Returns an array of ByteMatchSetSummary objects.    
        val ListByteMatchSets = _ListByteMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListIPSets.html 
        //  Returns an array of IPSetSummary objects in the response.    
        val ListIPSets = _ListIPSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListResourcesForWebACL.html 
        //  Returns an array of resources associated with the specified web ACL.    
        val ListResourcesForWebACL = _ListResourcesForWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListRules.html 
        //  Returns an array of RuleSummary objects.    
        val ListRules = _ListRules() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListSizeConstraintSets.html 
        //  Returns an array of SizeConstraintSetSummary objects.    
        val ListSizeConstraintSets = _ListSizeConstraintSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListSqlInjectionMatchSets.html 
        //  Returns an array of SqlInjectionMatchSet objects.    
        val ListSqlInjectionMatchSets = _ListSqlInjectionMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListWebACLs.html 
        //  Returns an array of WebACLSummary objects in the response.    
        val ListWebACLs = _ListWebACLs() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_ListXssMatchSets.html 
        //  Returns an array of XssMatchSet objects.    
        val ListXssMatchSets = _ListXssMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateByteMatchSet.html 
        //  Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet.    
        val UpdateByteMatchSet = _UpdateByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateIPSet.html 
        //  Inserts or deletes IPSetDescriptor objects in an IPSet.    
        val UpdateIPSet = _UpdateIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateRule.html 
        //  Inserts or deletes Predicate objects in a Rule.    
        val UpdateRule = _UpdateRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateSizeConstraintSet.html 
        //  Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet.    
        val UpdateSizeConstraintSet = _UpdateSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateSqlInjectionMatchSet.html 
        //  Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet.    
        val UpdateSqlInjectionMatchSet = _UpdateSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateWebACL.html 
        //  Inserts or deletes ActivatedRule objects in a WebACL.    
        val UpdateWebACL = _UpdateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_regional_UpdateXssMatchSet.html 
        //  Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet.    
        val UpdateXssMatchSet = _UpdateXssMatchSet()
    }
      class _AssociateWebACL : IamPolicy.Action("waf-regional:AssociateWebACL") {

         }       
 
      class _CreateByteMatchSet : IamPolicy.Action("waf-regional:CreateByteMatchSet") {

         }       
 
      class _CreateIPSet : IamPolicy.Action("waf-regional:CreateIPSet") {

         }       
 
      class _CreateRule : IamPolicy.Action("waf-regional:CreateRule") {

         }       
 
      class _CreateSizeConstraintSet : IamPolicy.Action("waf-regional:CreateSizeConstraintSet") {

         }       
 
      class _CreateSqlInjectionMatchSet : IamPolicy.Action("waf-regional:CreateSqlInjectionMatchSet") {

         }       
 
      class _CreateWebACL : IamPolicy.Action("waf-regional:CreateWebACL") {

         }       
 
      class _CreateXssMatchSet : IamPolicy.Action("waf-regional:CreateXssMatchSet") {

         }       
 
      class _DeleteByteMatchSet : IamPolicy.Action("waf-regional:DeleteByteMatchSet") {

         }       
 
      class _DeleteIPSet : IamPolicy.Action("waf-regional:DeleteIPSet") {

         }       
 
      class _DeleteRule : IamPolicy.Action("waf-regional:DeleteRule") {

         }       
 
      class _DeleteSizeConstraintSet : IamPolicy.Action("waf-regional:DeleteSizeConstraintSet") {

         }       
 
      class _DeleteSqlInjectionMatchSet : IamPolicy.Action("waf-regional:DeleteSqlInjectionMatchSet") {

         }       
 
      class _DeleteWebACL : IamPolicy.Action("waf-regional:DeleteWebACL") {

         }       
 
      class _DeleteXssMatchSet : IamPolicy.Action("waf-regional:DeleteXssMatchSet") {

         }       
 
      class _DisassociateWebACL : IamPolicy.Action("waf-regional:DisassociateWebACL") {

         }       
 
      class _GetByteMatchSet : IamPolicy.Action("waf-regional:GetByteMatchSet") {

         }       
 
      class _GetChangeToken : IamPolicy.Action("waf-regional:GetChangeToken") {

         }       
 
      class _GetChangeTokenStatus : IamPolicy.Action("waf-regional:GetChangeTokenStatus") {

         }       
 
      class _GetIPSet : IamPolicy.Action("waf-regional:GetIPSet") {

         }       
 
      class _GetRule : IamPolicy.Action("waf-regional:GetRule") {

         }       
 
      class _GetSampledRequests : IamPolicy.Action("waf-regional:GetSampledRequests") {

         }       
 
      class _GetSizeConstraintSet : IamPolicy.Action("waf-regional:GetSizeConstraintSet") {

         }       
 
      class _GetSqlInjectionMatchSet : IamPolicy.Action("waf-regional:GetSqlInjectionMatchSet") {

         }       
 
      class _GetWebACL : IamPolicy.Action("waf-regional:GetWebACL") {

         }       
 
      class _GetWebACLForResource : IamPolicy.Action("waf-regional:GetWebACLForResource") {

         }       
 
      class _GetXssMatchSet : IamPolicy.Action("waf-regional:GetXssMatchSet") {

         }       
 
      class _ListByteMatchSets : IamPolicy.Action("waf-regional:ListByteMatchSets") {

         }       
 
      class _ListIPSets : IamPolicy.Action("waf-regional:ListIPSets") {

         }       
 
      class _ListResourcesForWebACL : IamPolicy.Action("waf-regional:ListResourcesForWebACL") {

         }       
 
      class _ListRules : IamPolicy.Action("waf-regional:ListRules") {

         }       
 
      class _ListSizeConstraintSets : IamPolicy.Action("waf-regional:ListSizeConstraintSets") {

         }       
 
      class _ListSqlInjectionMatchSets : IamPolicy.Action("waf-regional:ListSqlInjectionMatchSets") {

         }       
 
      class _ListWebACLs : IamPolicy.Action("waf-regional:ListWebACLs") {

         }       
 
      class _ListXssMatchSets : IamPolicy.Action("waf-regional:ListXssMatchSets") {

         }       
 
      class _UpdateByteMatchSet : IamPolicy.Action("waf-regional:UpdateByteMatchSet") {

         }       
 
      class _UpdateIPSet : IamPolicy.Action("waf-regional:UpdateIPSet") {

         }       
 
      class _UpdateRule : IamPolicy.Action("waf-regional:UpdateRule") {

         }       
 
      class _UpdateSizeConstraintSet : IamPolicy.Action("waf-regional:UpdateSizeConstraintSet") {

         }       
 
      class _UpdateSqlInjectionMatchSet : IamPolicy.Action("waf-regional:UpdateSqlInjectionMatchSet") {

         }       
 
      class _UpdateWebACL : IamPolicy.Action("waf-regional:UpdateWebACL") {

         }       
 
      class _UpdateXssMatchSet : IamPolicy.Action("waf-regional:UpdateXssMatchSet") {

         }       


}        
