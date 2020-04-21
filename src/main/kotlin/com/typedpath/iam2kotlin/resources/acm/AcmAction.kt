
package com.typedpath.iam2kotlin.resources.acm

import com.typedpath.iam2kotlin.IamPolicy

class AcmAction() {

    companion object { 
        val All = IamPolicy.Action("acm:*")    
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_AddTagsToCertificate.html 
        //  Adds one or more tags to an ACM Certificate.    
        val AddTagsToCertificate = _AddTagsToCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_DeleteCertificate.html 
        //  Deletes an ACM Certificate and its associated private key.    
        val DeleteCertificate = _DeleteCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html 
        //  Returns a list of the fields contained in the specified ACM Certificate.    
        val DescribeCertificate = _DescribeCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_GetCertificate.html 
        //  Retrieves an ACM Certificate and certificate chain for the certificate specified by an ARN.    
        val GetCertificate = _GetCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_ImportCertificate.html 
        //  Imports an SSL/TLS certificate into AWS Certificate Manager (ACM) to use with ACM's integrated AWS services.    
        val ImportCertificate = _ImportCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_ListCertificates.html 
        //  Retrieves a list of ACM Certificates and the domain name for each.    
        val ListCertificates = _ListCertificates() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_ListTagsForCertificate.html 
        //  Lists the tags that have been applied to the ACM Certificate.    
        val ListTagsForCertificate = _ListTagsForCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_RemoveTagsFromCertificate.html 
        //  Remove one or more tags from an ACM Certificate.    
        val RemoveTagsFromCertificate = _RemoveTagsFromCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_RequestCertificate.html 
        //  Requests an ACM Certificate for use with other AWS services.    
        val RequestCertificate = _RequestCertificate() 
        // see http://docs.aws.amazon.com/acm/latest/APIReference/API_ResendValidationEmail.html 
        //  Resends the email that requests domain ownership validation.    
        val ResendValidationEmail = _ResendValidationEmail()
    }
      class _AddTagsToCertificate : IamPolicy.Action("acm:AddTagsToCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _DeleteCertificate : IamPolicy.Action("acm:DeleteCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _DescribeCertificate : IamPolicy.Action("acm:DescribeCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _GetCertificate : IamPolicy.Action("acm:GetCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _ImportCertificate : IamPolicy.Action("acm:ImportCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _ListCertificates : IamPolicy.Action("acm:ListCertificates") {

         }       
 
      class _ListTagsForCertificate : IamPolicy.Action("acm:ListTagsForCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _RemoveTagsFromCertificate : IamPolicy.Action("acm:RemoveTagsFromCertificate") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       
 
      class _RequestCertificate : IamPolicy.Action("acm:RequestCertificate") {

         }       
 
      class _ResendValidationEmail : IamPolicy.Action("acm:ResendValidationEmail") {
             //arn:aws:acm:$region:$account:certificate/$certificate-id"
            fun certificate_byRegionAccountCertificateid(region: String, account: String, certificateid: String) = IamPolicy.Resource("arn:aws:acm:$region:$account:certificate/$certificateid")
         }       


}        
