
package com.typedpath.iam2kotlin.resources.cur

import com.typedpath.iam2kotlin.IamPolicy

class CurAction() {

    companion object { 
        val All = IamPolicy.Action("cur:*")    
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/delete-report-definition.html 
        //  Deletes an AWS Cost and Usage report.    
        val DeleteReportDefinition = _DeleteReportDefinition() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/describe-report-definitions.html 
        //  Describes your AWS Cost and Usage reports.    
        val DescribeReportDefinitions = _DescribeReportDefinitions() 
        // see http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/put-report-definition.html 
        //  Creates an AWS Cost and Usage report.    
        val PutReportDefinition = _PutReportDefinition()
    }
      class _DeleteReportDefinition : IamPolicy.Action("cur:DeleteReportDefinition") {

         }       
 
      class _DescribeReportDefinitions : IamPolicy.Action("cur:DescribeReportDefinitions") {

         }       
 
      class _PutReportDefinition : IamPolicy.Action("cur:PutReportDefinition") {

         }       


}        
