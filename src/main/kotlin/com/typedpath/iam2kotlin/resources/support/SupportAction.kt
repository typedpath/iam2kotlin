
package com.typedpath.iam2kotlin.resources.support

import com.typedpath.iam2kotlin.IamPolicy

class SupportAction() {

    companion object { 
        val All = IamPolicy.Action("support:*")    
        // see http://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#accessing-support 
        //  Support does not let you allow or deny access to individual actions; therefore, the Action element of a policy is always set to support:*. Similarly, Support does not provide resource-level access, so the Resource element is always set to *. An IAM user with Support permissions has access to all Support operations and resources.    
        val SupportAll = _SupportAll()
    }
      class _SupportAll : IamPolicy.Action("support:*") {

         }       


}        
