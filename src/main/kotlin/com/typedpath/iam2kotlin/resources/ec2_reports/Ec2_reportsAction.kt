
package com.typedpath.iam2kotlin.resources.ec2_reports

import com.typedpath.iam2kotlin.IamPolicy

class Ec2_reportsAction() {

    companion object { 
        val All = IamPolicy.Action("ec2_reports:*")    
        // see http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/usage-reports.html#iam-access-ec2-reports 
        //  View the Reserved Instances utilization report.    
        val ViewReservedInstanceUtilizationReport = _ViewReservedInstanceUtilizationReport() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/usage-reports.html#iam-access-ec2-reports 
        //  View the instance usage report.    
        val ViewInstanceUsageReport = _ViewInstanceUsageReport()
    }
      class _ViewReservedInstanceUtilizationReport : IamPolicy.Action("ec2-reports:ViewReservedInstanceUtilizationReport") {

         }       
 
      class _ViewInstanceUsageReport : IamPolicy.Action("ec2-reports:ViewInstanceUsageReport") {

         }       


}        
