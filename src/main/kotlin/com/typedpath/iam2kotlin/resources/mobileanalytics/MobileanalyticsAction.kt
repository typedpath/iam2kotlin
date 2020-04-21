
package com.typedpath.iam2kotlin.resources.mobileanalytics

import com.typedpath.iam2kotlin.IamPolicy

class MobileanalyticsAction() {

    companion object { 
        val All = IamPolicy.Action("mobileanalytics:*")    
        // see http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html 
        //  The PutEvents operation records one or more events.    
        val PutEvents = _PutEvents() 
        // see http://docs.aws.amazon.com/mobileanalytics/latest/ug/using-the-console.html 
        //  ???    
        val GetReports = _GetReports() 
        // see http://docs.aws.amazon.com/mobileanalytics/latest/ug/using-the-console.html 
        //  ???    
        val GetFinancialReports = _GetFinancialReports()
    }
      class _PutEvents : IamPolicy.Action("mobileanalytics:PutEvents") {

         }       
 
      class _GetReports : IamPolicy.Action("mobileanalytics:GetReports") {

         }       
 
      class _GetFinancialReports : IamPolicy.Action("mobileanalytics:GetFinancialReports") {

         }       


}        
