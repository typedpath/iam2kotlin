
package com.typedpath.iam2kotlin.resources.budgets

import com.typedpath.iam2kotlin.IamPolicy

class BudgetsAction() {

    companion object { 
        val All = IamPolicy.Action("budgets:*")    
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html#user-permissions 
        //  Allow or deny IAM users permission to view Budgets. Note that to allow IAM users to view budgets, you must also allow aws-portal:ViewBilling.    
        val ViewBudget = _ViewBudget() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-permissions-ref.html#user-permissions 
        //  Allow or deny IAM users permission to modify Budgets. Note that to allow IAM users to view and modify budgets, you must also allow aws-portal:ViewBilling.    
        val ModifyBudget = _ModifyBudget()
    }
      class _ViewBudget : IamPolicy.Action("budgets:ViewBudget") {

         }       
 
      class _ModifyBudget : IamPolicy.Action("budgets:ModifyBudget") {

         }       


}        
