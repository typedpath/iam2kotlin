
package com.typedpath.iam2kotlin.resources.opsworks_cm

import com.typedpath.iam2kotlin.IamPolicy

class Opsworks_cmAction() {

    companion object { 
        val All = IamPolicy.Action("opsworks_cm:*")    
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_AssociateNode.html 
        //  Associates a new node with the Chef server.    
        val AssociateNode = _AssociateNode() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_CreateBackup.html 
        //  Creates an application-level backup of a server.    
        val CreateBackup = _CreateBackup() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_CreateServer.html 
        //  Creates and immedately starts a new server.    
        val CreateServer = _CreateServer() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DeleteBackup.html 
        //  Deletes a backup.    
        val DeleteBackup = _DeleteBackup() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DeleteServer.html 
        //  Deletes the server and the underlying AWS CloudFormation stack (including the server's EC2 instance).    
        val DeleteServer = _DeleteServer() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DescribeAccountAttributes.html 
        //  Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.    
        val DescribeAccountAttributes = _DescribeAccountAttributes() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DescribeBackups.html 
        //  Describes backups.    
        val DescribeBackups = _DescribeBackups() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DescribeEvents.html 
        //  Describes events for a specified server.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DescribeNodeAssociationStatus.html 
        //  Returns the current status of an existing association or disassociation request.    
        val DescribeNodeAssociationStatus = _DescribeNodeAssociationStatus() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DescribeServers.html 
        //  Lists all configuration management servers that are identified with your account.    
        val DescribeServers = _DescribeServers() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_DisassociateNode.html 
        //  Disassociates a node from a Chef server, and removes the node from the Chef server's managed nodes.    
        val DisassociateNode = _DisassociateNode() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_RestoreServer.html 
        //  Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY, RUNNING, UNHEALTHY, or TERMINATED state.    
        val RestoreServer = _RestoreServer() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_StartMaintenance.html 
        //  Manually starts server maintenance.    
        val StartMaintenance = _StartMaintenance() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_UpdateServer.html 
        //  Updates settings for a server.    
        val UpdateServer = _UpdateServer() 
        // see http://docs.aws.amazon.com/opsworks-cm/latest/APIReference/API_UpdateServerEngineAttributes.html 
        //  Updates engine-specific attributes on a specified server.    
        val UpdateServerEngineAttributes = _UpdateServerEngineAttributes()
    }
      class _AssociateNode : IamPolicy.Action("opsworks-cm:AssociateNode") {

         }       
 
      class _CreateBackup : IamPolicy.Action("opsworks-cm:CreateBackup") {

         }       
 
      class _CreateServer : IamPolicy.Action("opsworks-cm:CreateServer") {

         }       
 
      class _DeleteBackup : IamPolicy.Action("opsworks-cm:DeleteBackup") {

         }       
 
      class _DeleteServer : IamPolicy.Action("opsworks-cm:DeleteServer") {

         }       
 
      class _DescribeAccountAttributes : IamPolicy.Action("opsworks-cm:DescribeAccountAttributes") {

         }       
 
      class _DescribeBackups : IamPolicy.Action("opsworks-cm:DescribeBackups") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("opsworks-cm:DescribeEvents") {

         }       
 
      class _DescribeNodeAssociationStatus : IamPolicy.Action("opsworks-cm:DescribeNodeAssociationStatus") {

         }       
 
      class _DescribeServers : IamPolicy.Action("opsworks-cm:DescribeServers") {

         }       
 
      class _DisassociateNode : IamPolicy.Action("opsworks-cm:DisassociateNode") {

         }       
 
      class _RestoreServer : IamPolicy.Action("opsworks-cm:RestoreServer") {

         }       
 
      class _StartMaintenance : IamPolicy.Action("opsworks-cm:StartMaintenance") {

         }       
 
      class _UpdateServer : IamPolicy.Action("opsworks-cm:UpdateServer") {

         }       
 
      class _UpdateServerEngineAttributes : IamPolicy.Action("opsworks-cm:UpdateServerEngineAttributes") {

         }       


}        
