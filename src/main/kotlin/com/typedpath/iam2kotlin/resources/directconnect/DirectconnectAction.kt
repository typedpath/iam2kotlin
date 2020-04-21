
package com.typedpath.iam2kotlin.resources.directconnect

import com.typedpath.iam2kotlin.IamPolicy

class DirectconnectAction() {

    companion object { 
        val All = IamPolicy.Action("directconnect:*")    
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateConnectionOnInterconnect.html 
        //  Creates a hosted connection on an interconnect.    
        val AllocateConnectionOnInterconnect = _AllocateConnectionOnInterconnect() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocatePrivateVirtualInterface.html 
        //  Provisions a private virtual interface to be owned by a different customer.    
        val AllocatePrivateVirtualInterface = _AllocatePrivateVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocatePublicVirtualInterface.html 
        //  Provisions a public virtual interface to be owned by a different customer.    
        val AllocatePublicVirtualInterface = _AllocatePublicVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_ConfirmConnection.html 
        //  Confirm the creation of a hosted connection on an interconnect.    
        val ConfirmConnection = _ConfirmConnection() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_ConfirmPrivateVirtualInterface.html 
        //  Accept ownership of a private virtual interface created by another customer.    
        val ConfirmPrivateVirtualInterface = _ConfirmPrivateVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_ConfirmPublicVirtualInterface.html 
        //  Accept ownership of a public virtual interface created by another customer.    
        val ConfirmPublicVirtualInterface = _ConfirmPublicVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_CreateConnection.html 
        //  Creates a new connection between the customer network and a specific AWS Direct Connect location.    
        val CreateConnection = _CreateConnection() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_CreateInterconnect.html 
        //  Creates a new interconnect between a AWS Direct Connect partner's network and a specific AWS Direct Connect location.    
        val CreateInterconnect = _CreateInterconnect() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_CreatePrivateVirtualInterface.html 
        //  Creates a new private virtual interface.    
        val CreatePrivateVirtualInterface = _CreatePrivateVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_CreatePublicVirtualInterface.html 
        //  Creates a new public virtual interface.    
        val CreatePublicVirtualInterface = _CreatePublicVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DeleteConnection.html 
        //  Deletes the connection.    
        val DeleteConnection = _DeleteConnection() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DeleteInterconnect.html 
        //  Deletes the specified interconnect.    
        val DeleteInterconnect = _DeleteInterconnect() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DeleteVirtualInterface.html 
        //  Deletes a virtual interface.    
        val DeleteVirtualInterface = _DeleteVirtualInterface() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeConnections.html 
        //  Displays all connections in this region.    
        val DescribeConnections = _DescribeConnections() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeConnectionsOnInterconnect.html 
        //  Return a list of connections that have been provisioned on the given interconnect.    
        val DescribeConnectionsOnInterconnect = _DescribeConnectionsOnInterconnect() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeInterconnects.html 
        //  Returns a list of interconnects owned by the AWS account.    
        val DescribeInterconnects = _DescribeInterconnects() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html 
        //  Returns the list of AWS Direct Connect locations in the current AWS region.    
        val DescribeLocations = _DescribeLocations() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeVirtualGateways.html 
        //  Returns a list of virtual private gateways owned by the AWS account.    
        val DescribeVirtualGateways = _DescribeVirtualGateways() 
        // see http://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeVirtualInterfaces.html 
        //  Displays all virtual interfaces for an AWS account.    
        val DescribeVirtualInterfaces = _DescribeVirtualInterfaces()
    }
      class _AllocateConnectionOnInterconnect : IamPolicy.Action("directconnect:AllocateConnectionOnInterconnect") {

         }       
 
      class _AllocatePrivateVirtualInterface : IamPolicy.Action("directconnect:AllocatePrivateVirtualInterface") {

         }       
 
      class _AllocatePublicVirtualInterface : IamPolicy.Action("directconnect:AllocatePublicVirtualInterface") {

         }       
 
      class _ConfirmConnection : IamPolicy.Action("directconnect:ConfirmConnection") {

         }       
 
      class _ConfirmPrivateVirtualInterface : IamPolicy.Action("directconnect:ConfirmPrivateVirtualInterface") {

         }       
 
      class _ConfirmPublicVirtualInterface : IamPolicy.Action("directconnect:ConfirmPublicVirtualInterface") {

         }       
 
      class _CreateConnection : IamPolicy.Action("directconnect:CreateConnection") {

         }       
 
      class _CreateInterconnect : IamPolicy.Action("directconnect:CreateInterconnect") {

         }       
 
      class _CreatePrivateVirtualInterface : IamPolicy.Action("directconnect:CreatePrivateVirtualInterface") {

         }       
 
      class _CreatePublicVirtualInterface : IamPolicy.Action("directconnect:CreatePublicVirtualInterface") {

         }       
 
      class _DeleteConnection : IamPolicy.Action("directconnect:DeleteConnection") {

         }       
 
      class _DeleteInterconnect : IamPolicy.Action("directconnect:DeleteInterconnect") {

         }       
 
      class _DeleteVirtualInterface : IamPolicy.Action("directconnect:DeleteVirtualInterface") {

         }       
 
      class _DescribeConnections : IamPolicy.Action("directconnect:DescribeConnections") {

         }       
 
      class _DescribeConnectionsOnInterconnect : IamPolicy.Action("directconnect:DescribeConnectionsOnInterconnect") {

         }       
 
      class _DescribeInterconnects : IamPolicy.Action("directconnect:DescribeInterconnects") {

         }       
 
      class _DescribeLocations : IamPolicy.Action("directconnect:DescribeLocations") {

         }       
 
      class _DescribeVirtualGateways : IamPolicy.Action("directconnect:DescribeVirtualGateways") {

         }       
 
      class _DescribeVirtualInterfaces : IamPolicy.Action("directconnect:DescribeVirtualInterfaces") {

         }       


}        
