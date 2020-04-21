
package com.typedpath.iam2kotlin.resources.aws_marketplace_management

import com.typedpath.iam2kotlin.IamPolicy

class Aws_marketplace_managementAction() {

    companion object { 
        val All = IamPolicy.Action("aws_marketplace_management:*")    
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace-management.html 
        //  Allows a user to access the File Upload page inside the AWS Marketplace Management Portal.    
        val uploadFiles = _uploadFiles() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace-management.html 
        //  Allows a user to access the Marketing page inside the AWS Marketplace Management Portal.    
        val viewMarketing = _viewMarketing() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace-management.html 
        //  Allows a user to access the Reports page inside the AWS Marketplace Management Portal.    
        val viewReports = _viewReports() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_aws-marketplace-management.html 
        //  Allows a user to access the Customer Support Eligibility page inside the AWS Marketplace Management Portal.    
        val viewSupport = _viewSupport()
    }
      class _uploadFiles : IamPolicy.Action("aws-marketplace-management:uploadFiles") {

         }       
 
      class _viewMarketing : IamPolicy.Action("aws-marketplace-management:viewMarketing") {

         }       
 
      class _viewReports : IamPolicy.Action("aws-marketplace-management:viewReports") {

         }       
 
      class _viewSupport : IamPolicy.Action("aws-marketplace-management:viewSupport") {

         }       


}        
