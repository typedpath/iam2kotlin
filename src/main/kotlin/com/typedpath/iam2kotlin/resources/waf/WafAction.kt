
package com.typedpath.iam2kotlin.resources.waf

import com.typedpath.iam2kotlin.IamPolicy

class WafAction() {

    companion object { 
        val All = IamPolicy.Action("waf:*")    
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateByteMatchSet.html 
        //  Creates a ByteMatchSet.    
        val CreateByteMatchSet = _CreateByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateIPSet.html 
        //  Creates an IPSet, which you use to specify which web requests you want to allow or block based on the IP addresses that the requests originate from.    
        val CreateIPSet = _CreateIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateRule.html 
        //  Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block.    
        val CreateRule = _CreateRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateSizeConstraintSet.html 
        //  Creates a SizeConstraintSet.    
        val CreateSizeConstraintSet = _CreateSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateSqlInjectionMatchSet.html 
        //  Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests.    
        val CreateSqlInjectionMatchSet = _CreateSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateWebACL.html 
        //  Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count.    
        val CreateWebACL = _CreateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_CreateXssMatchSet.html 
        //  Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests.    
        val CreateXssMatchSet = _CreateXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteByteMatchSet.html 
        //  Permanently deletes a ByteMatchSet.    
        val DeleteByteMatchSet = _DeleteByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteIPSet.html 
        //  Permanently deletes an IPSet.    
        val DeleteIPSet = _DeleteIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteRule.html 
        //  Permanently deletes a Rule.    
        val DeleteRule = _DeleteRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteSizeConstraintSet.html 
        //  Permanently deletes a SizeConstraintSet.    
        val DeleteSizeConstraintSet = _DeleteSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteSqlInjectionMatchSet.html 
        //  Permanently deletes a SqlInjectionMatchSet.    
        val DeleteSqlInjectionMatchSet = _DeleteSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteWebACL.html 
        //  Permanently deletes a WebACL.    
        val DeleteWebACL = _DeleteWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_DeleteXssMatchSet.html 
        //  Permanently deletes an XssMatchSet.    
        val DeleteXssMatchSet = _DeleteXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetByteMatchSet.html 
        //  Returns the ByteMatchSet specified by ByteMatchSetId.    
        val GetByteMatchSet = _GetByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetChangeToken.html 
        //  When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request.    
        val GetChangeToken = _GetChangeToken() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetChangeTokenStatus.html 
        //  Returns the status of a ChangeToken that you got by calling GetChangeToken.    
        val GetChangeTokenStatus = _GetChangeTokenStatus() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetIPSet.html 
        //  Returns the IPSet that is specified by IPSetId.    
        val GetIPSet = _GetIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetRule.html 
        //  Returns the Rule that is specified by the RuleId that you included in the GetRule request.    
        val GetRule = _GetRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetSampledRequests.html 
        //  Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose.    
        val GetSampledRequests = _GetSampledRequests() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetSizeConstraintSet.html 
        //  Returns the SizeConstraintSet specified by SizeConstraintSetId.    
        val GetSizeConstraintSet = _GetSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetSqlInjectionMatchSet.html 
        //  Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.    
        val GetSqlInjectionMatchSet = _GetSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetWebACL.html 
        //  Returns the WebACL that is specified by WebACLId.    
        val GetWebACL = _GetWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_GetXssMatchSet.html 
        //  Returns the XssMatchSet that is specified by XssMatchSetId.    
        val GetXssMatchSet = _GetXssMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListByteMatchSets.html 
        //  Returns an array of ByteMatchSetSummary objects.    
        val ListByteMatchSets = _ListByteMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListIPSets.html 
        //  Returns an array of IPSetSummary objects in the response.    
        val ListIPSets = _ListIPSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListRules.html 
        //  Returns an array of RuleSummary objects.    
        val ListRules = _ListRules() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListSizeConstraintSets.html 
        //  Returns an array of SizeConstraintSetSummary objects.    
        val ListSizeConstraintSets = _ListSizeConstraintSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListSqlInjectionMatchSets.html 
        //  Returns an array of SqlInjectionMatchSet objects.    
        val ListSqlInjectionMatchSets = _ListSqlInjectionMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListWebACLs.html 
        //  Returns an array of WebACLSummary objects in the response.    
        val ListWebACLs = _ListWebACLs() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_ListXssMatchSets.html 
        //  Returns an array of XssMatchSet objects.    
        val ListXssMatchSets = _ListXssMatchSets() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateByteMatchSet.html 
        //  Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet.    
        val UpdateByteMatchSet = _UpdateByteMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateIPSet.html 
        //  Inserts or deletes IPSetDescriptor objects in an IPSet.    
        val UpdateIPSet = _UpdateIPSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateRule.html 
        //  Inserts or deletes Predicate objects in a Rule.    
        val UpdateRule = _UpdateRule() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateSizeConstraintSet.html 
        //  Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet.    
        val UpdateSizeConstraintSet = _UpdateSizeConstraintSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateSqlInjectionMatchSet.html 
        //  Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet.    
        val UpdateSqlInjectionMatchSet = _UpdateSqlInjectionMatchSet() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateWebACL.html 
        //  Inserts or deletes ActivatedRule objects in a WebACL.    
        val UpdateWebACL = _UpdateWebACL() 
        // see http://docs.aws.amazon.com/waf/latest/APIReference/API_UpdateXssMatchSet.html 
        //  Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet.    
        val UpdateXssMatchSet = _UpdateXssMatchSet()
    }
      class _CreateByteMatchSet : IamPolicy.Action("waf:CreateByteMatchSet") {
             //arn:aws:waf:$region:$account:bytematchset/$entity-id"
            fun bytematchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:bytematchset/$entityid")
         }       
 
      class _CreateIPSet : IamPolicy.Action("waf:CreateIPSet") {
             //arn:aws:waf:$region:$account:ipset/$entity-id"
            fun ipset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:ipset/$entityid")
         }       
 
      class _CreateRule : IamPolicy.Action("waf:CreateRule") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
         }       
 
      class _CreateSizeConstraintSet : IamPolicy.Action("waf:CreateSizeConstraintSet") {
             //arn:aws:waf:$region:$account:sizeconstraintset/$entity-id"
            fun sizeconstraintset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sizeconstraintset/$entityid")
         }       
 
      class _CreateSqlInjectionMatchSet : IamPolicy.Action("waf:CreateSqlInjectionMatchSet") {
             //arn:aws:waf:$region:$account:sqlinjectionmatchset/$entity-id"
            fun sqlinjectionmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sqlinjectionmatchset/$entityid")
         }       
 
      class _CreateWebACL : IamPolicy.Action("waf:CreateWebACL") {
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _CreateXssMatchSet : IamPolicy.Action("waf:CreateXssMatchSet") {
             //arn:aws:waf:$region:$account:xssmatchset/$entity-id"
            fun xssmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:xssmatchset/$entityid")
         }       
 
      class _DeleteByteMatchSet : IamPolicy.Action("waf:DeleteByteMatchSet") {
             //arn:aws:waf:$region:$account:bytematchset/$entity-id"
            fun bytematchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:bytematchset/$entityid")
         }       
 
      class _DeleteIPSet : IamPolicy.Action("waf:DeleteIPSet") {
             //arn:aws:waf:$region:$account:ipset/$entity-id"
            fun ipset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:ipset/$entityid")
         }       
 
      class _DeleteRule : IamPolicy.Action("waf:DeleteRule") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
         }       
 
      class _DeleteSizeConstraintSet : IamPolicy.Action("waf:DeleteSizeConstraintSet") {
             //arn:aws:waf:$region:$account:sizeconstraintset/$entity-id"
            fun sizeconstraintset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sizeconstraintset/$entityid")
         }       
 
      class _DeleteSqlInjectionMatchSet : IamPolicy.Action("waf:DeleteSqlInjectionMatchSet") {
             //arn:aws:waf:$region:$account:sqlinjectionmatchset/$entity-id"
            fun sqlinjectionmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sqlinjectionmatchset/$entityid")
         }       
 
      class _DeleteWebACL : IamPolicy.Action("waf:DeleteWebACL") {
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _DeleteXssMatchSet : IamPolicy.Action("waf:DeleteXssMatchSet") {
             //arn:aws:waf:$region:$account:xssmatchset/$entity-id"
            fun xssmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:xssmatchset/$entityid")
         }       
 
      class _GetByteMatchSet : IamPolicy.Action("waf:GetByteMatchSet") {
             //arn:aws:waf:$region:$account:bytematchset/$entity-id"
            fun bytematchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:bytematchset/$entityid")
         }       
 
      class _GetChangeToken : IamPolicy.Action("waf:GetChangeToken") {
             //arn:aws:waf:$region:$account:changetoken/$entity-id"
            fun changetoken_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:changetoken/$entityid")
         }       
 
      class _GetChangeTokenStatus : IamPolicy.Action("waf:GetChangeTokenStatus") {
             //arn:aws:waf:$region:$account:changetoken/$entity-id"
            fun changetoken_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:changetoken/$entityid")
         }       
 
      class _GetIPSet : IamPolicy.Action("waf:GetIPSet") {
             //arn:aws:waf:$region:$account:ipset/$entity-id"
            fun ipset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:ipset/$entityid")
         }       
 
      class _GetRule : IamPolicy.Action("waf:GetRule") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
         }       
 
      class _GetSampledRequests : IamPolicy.Action("waf:GetSampledRequests") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _GetSizeConstraintSet : IamPolicy.Action("waf:GetSizeConstraintSet") {
             //arn:aws:waf:$region:$account:sizeconstraintset/$entity-id"
            fun sizeconstraintset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sizeconstraintset/$entityid")
         }       
 
      class _GetSqlInjectionMatchSet : IamPolicy.Action("waf:GetSqlInjectionMatchSet") {
             //arn:aws:waf:$region:$account:sqlinjectionmatchset/$entity-id"
            fun sqlinjectionmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sqlinjectionmatchset/$entityid")
         }       
 
      class _GetWebACL : IamPolicy.Action("waf:GetWebACL") {
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _GetXssMatchSet : IamPolicy.Action("waf:GetXssMatchSet") {
             //arn:aws:waf:$region:$account:xssmatchset/$entity-id"
            fun xssmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:xssmatchset/$entityid")
         }       
 
      class _ListByteMatchSets : IamPolicy.Action("waf:ListByteMatchSets") {
             //arn:aws:waf:$region:$account:bytematchset/$entity-id"
            fun bytematchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:bytematchset/$entityid")
         }       
 
      class _ListIPSets : IamPolicy.Action("waf:ListIPSets") {
             //arn:aws:waf:$region:$account:ipset/$entity-id"
            fun ipset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:ipset/$entityid")
         }       
 
      class _ListRules : IamPolicy.Action("waf:ListRules") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
         }       
 
      class _ListSizeConstraintSets : IamPolicy.Action("waf:ListSizeConstraintSets") {
             //arn:aws:waf:$region:$account:sizeconstraintset/$entity-id"
            fun sizeconstraintset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sizeconstraintset/$entityid")
         }       
 
      class _ListSqlInjectionMatchSets : IamPolicy.Action("waf:ListSqlInjectionMatchSets") {
             //arn:aws:waf:$region:$account:sqlinjectionmatchset/$entity-id"
            fun sqlinjectionmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sqlinjectionmatchset/$entityid")
         }       
 
      class _ListWebACLs : IamPolicy.Action("waf:ListWebACLs") {
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _ListXssMatchSets : IamPolicy.Action("waf:ListXssMatchSets") {
             //arn:aws:waf:$region:$account:xssmatchset/$entity-id"
            fun xssmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:xssmatchset/$entityid")
         }       
 
      class _UpdateByteMatchSet : IamPolicy.Action("waf:UpdateByteMatchSet") {
             //arn:aws:waf:$region:$account:bytematchset/$entity-id"
            fun bytematchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:bytematchset/$entityid")
         }       
 
      class _UpdateIPSet : IamPolicy.Action("waf:UpdateIPSet") {
             //arn:aws:waf:$region:$account:ipset/$entity-id"
            fun ipset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:ipset/$entityid")
         }       
 
      class _UpdateRule : IamPolicy.Action("waf:UpdateRule") {
             //arn:aws:waf:$region:$account:rule/$entity-id"
            fun rule_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:rule/$entityid")
         }       
 
      class _UpdateSizeConstraintSet : IamPolicy.Action("waf:UpdateSizeConstraintSet") {
             //arn:aws:waf:$region:$account:sizeconstraintset/$entity-id"
            fun sizeconstraintset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sizeconstraintset/$entityid")
         }       
 
      class _UpdateSqlInjectionMatchSet : IamPolicy.Action("waf:UpdateSqlInjectionMatchSet") {
             //arn:aws:waf:$region:$account:sqlinjectionmatchset/$entity-id"
            fun sqlinjectionmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:sqlinjectionmatchset/$entityid")
         }       
 
      class _UpdateWebACL : IamPolicy.Action("waf:UpdateWebACL") {
             //arn:aws:waf:$region:$account:webacl/$entity-id"
            fun webacl_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:webacl/$entityid")
         }       
 
      class _UpdateXssMatchSet : IamPolicy.Action("waf:UpdateXssMatchSet") {
             //arn:aws:waf:$region:$account:xssmatchset/$entity-id"
            fun xssmatchset_byRegionAccountEntityid(region: String, account: String, entityid: String) = IamPolicy.Resource("arn:aws:waf:$region:$account:xssmatchset/$entityid")
         }       


}        
