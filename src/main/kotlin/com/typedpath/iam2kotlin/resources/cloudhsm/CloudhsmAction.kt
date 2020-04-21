
package com.typedpath.iam2kotlin.resources.cloudhsm

import com.typedpath.iam2kotlin.IamPolicy

class CloudhsmAction() {

    companion object { 
        val All = IamPolicy.Action("cloudhsm:*")    
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_CreateLunaClient.html 
        //  Creates an HSM client.    
        val CreateLunaClient = _CreateLunaClient() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_CreateHapg.html 
        //  Creates a high-availability partition group.    
        val CreateHapg = _CreateHapg() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_CreateHsm.html 
        //  Creates an uninitialized HSM instance.    
        val CreateHsm = _CreateHsm() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DeleteLunaClient.html 
        //  Deletes a client.    
        val DeleteLunaClient = _DeleteLunaClient() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DeleteHapg.html 
        //  Deletes a high-availability partition group.    
        val DeleteHapg = _DeleteHapg() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DeleteHsm.html 
        //  Deletes an HSM.    
        val DeleteHsm = _DeleteHsm() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DescribeLunaClient.html 
        //  Retrieves information about an HSM client.    
        val DescribeLunaClient = _DescribeLunaClient() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DescribeHapg.html 
        //  Retrieves information about a high-availability partition group.    
        val DescribeHapg = _DescribeHapg() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_DescribeHsm.html 
        //  Retrieves information about an HSM.    
        val DescribeHsm = _DescribeHsm() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_GetConfig.html 
        //  Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.    
        val GetConfig = _GetConfig() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ListAvailableZones.html 
        //  Lists the Availability Zones that have available AWS CloudHSM capacity.    
        val ListAvailableZones = _ListAvailableZones() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ListLunaClients.html 
        //  Lists all of the clients.    
        val ListLunaClients = _ListLunaClients() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ListHapgs.html 
        //  Lists the high-availability partition groups for the account.    
        val ListHapgs = _ListHapgs() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ListHsms.html 
        //  Retrieves the identifiers of all of the HSMs provisioned for the current customer.    
        val ListHsms = _ListHsms() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ModifyLunaClient.html 
        //  Modifies the certificate used by the client.    
        val ModifyLunaClient = _ModifyLunaClient() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ModifyHapg.html 
        //  Modifies an existing high-availability partition group.    
        val ModifyHapg = _ModifyHapg() 
        // see http://docs.aws.amazon.com/cloudhsm/latest/dg/API_ModifyHsm.html 
        //  Modifies an HSM.    
        val ModifyHsm = _ModifyHsm()
    }
      class _CreateLunaClient : IamPolicy.Action("cloudhsm:CreateLunaClient") {

         }       
 
      class _CreateHapg : IamPolicy.Action("cloudhsm:CreateHapg") {

         }       
 
      class _CreateHsm : IamPolicy.Action("cloudhsm:CreateHsm") {

         }       
 
      class _DeleteLunaClient : IamPolicy.Action("cloudhsm:DeleteLunaClient") {

         }       
 
      class _DeleteHapg : IamPolicy.Action("cloudhsm:DeleteHapg") {

         }       
 
      class _DeleteHsm : IamPolicy.Action("cloudhsm:DeleteHsm") {

         }       
 
      class _DescribeLunaClient : IamPolicy.Action("cloudhsm:DescribeLunaClient") {

         }       
 
      class _DescribeHapg : IamPolicy.Action("cloudhsm:DescribeHapg") {

         }       
 
      class _DescribeHsm : IamPolicy.Action("cloudhsm:DescribeHsm") {

         }       
 
      class _GetConfig : IamPolicy.Action("cloudhsm:GetConfig") {

         }       
 
      class _ListAvailableZones : IamPolicy.Action("cloudhsm:ListAvailableZones") {

         }       
 
      class _ListLunaClients : IamPolicy.Action("cloudhsm:ListLunaClients") {

         }       
 
      class _ListHapgs : IamPolicy.Action("cloudhsm:ListHapgs") {

         }       
 
      class _ListHsms : IamPolicy.Action("cloudhsm:ListHsms") {

         }       
 
      class _ModifyLunaClient : IamPolicy.Action("cloudhsm:ModifyLunaClient") {

         }       
 
      class _ModifyHapg : IamPolicy.Action("cloudhsm:ModifyHapg") {

         }       
 
      class _ModifyHsm : IamPolicy.Action("cloudhsm:ModifyHsm") {

         }       


}        
