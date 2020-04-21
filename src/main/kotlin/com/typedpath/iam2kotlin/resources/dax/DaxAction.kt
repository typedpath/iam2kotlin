
package com.typedpath.iam2kotlin.resources.dax

import com.typedpath.iam2kotlin.IamPolicy

class DaxAction() {

    companion object { 
        val All = IamPolicy.Action("dax:*")    
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_CreateCluster.html 
        //  Creates a DAX cluster.    
        val CreateCluster = _CreateCluster() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_CreateParameterGroup.html 
        //  Creates a new parameter group.    
        val CreateParameterGroup = _CreateParameterGroup() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_CreateSubnetGroup.html 
        //  Creates a new subnet group.    
        val CreateSubnetGroup = _CreateSubnetGroup() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DecreaseReplicationFactor.html 
        //  Removes one or more nodes from a DAX cluster.    
        val DecreaseReplicationFactor = _DecreaseReplicationFactor() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DeleteCluster.html 
        //  Deletes a previously provisioned DAX cluster.    
        val DeleteCluster = _DeleteCluster() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DeleteParameterGroup.html 
        //  Deletes the specified parameter group.    
        val DeleteParameterGroup = _DeleteParameterGroup() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DeleteSubnetGroup.html 
        //  Deletes a subnet group.    
        val DeleteSubnetGroup = _DeleteSubnetGroup() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeClusters.html 
        //  Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied.    
        val DescribeClusters = _DescribeClusters() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeDefaultParameters.html 
        //  Returns the default system parameter information for the DAX caching software.    
        val DescribeDefaultParameters = _DescribeDefaultParameters() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeEvents.html 
        //  Returns events related to DAX clusters and parameter groups.    
        val DescribeEvents = _DescribeEvents() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeParameterGroups.html 
        //  Returns a list of parameter group descriptions.    
        val DescribeParameterGroups = _DescribeParameterGroups() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeParameters.html 
        //  Returns the detailed parameter list for a particular parameter group.    
        val DescribeParameters = _DescribeParameters() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_DescribeSubnetGroups.html 
        //  Returns a list of subnet group descriptions.    
        val DescribeSubnetGroups = _DescribeSubnetGroups() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_IncreaseReplicationFactor.html 
        //  Adds one or more nodes to a DAX cluster.    
        val IncreaseReplicationFactor = _IncreaseReplicationFactor() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_ListTags.html 
        //  List all of the tags for a DAX cluster.    
        val ListTags = _ListTags() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_RebootNode.html 
        //  Reboots a single node of a DAX cluster.    
        val RebootNode = _RebootNode() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_TagResource.html 
        //  Associates a set of tags with a DAX resource.    
        val TagResource = _TagResource() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_UntagResource.html 
        //  Removes the association of tags from a DAX resource.    
        val UntagResource = _UntagResource() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_UpdateCluster.html 
        //  Modifies the settings for a DAX cluster.    
        val UpdateCluster = _UpdateCluster() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_UpdateParameterGroup.html 
        //  Modifies the parameters of a parameter group.    
        val UpdateParameterGroup = _UpdateParameterGroup() 
        // see http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_dax_UpdateSubnetGroup.html 
        //  Modifies an existing subnet group.    
        val UpdateSubnetGroup = _UpdateSubnetGroup()
    }
      class _CreateCluster : IamPolicy.Action("dax:CreateCluster") {

         }       
 
      class _CreateParameterGroup : IamPolicy.Action("dax:CreateParameterGroup") {

         }       
 
      class _CreateSubnetGroup : IamPolicy.Action("dax:CreateSubnetGroup") {

         }       
 
      class _DecreaseReplicationFactor : IamPolicy.Action("dax:DecreaseReplicationFactor") {

         }       
 
      class _DeleteCluster : IamPolicy.Action("dax:DeleteCluster") {

         }       
 
      class _DeleteParameterGroup : IamPolicy.Action("dax:DeleteParameterGroup") {

         }       
 
      class _DeleteSubnetGroup : IamPolicy.Action("dax:DeleteSubnetGroup") {

         }       
 
      class _DescribeClusters : IamPolicy.Action("dax:DescribeClusters") {

         }       
 
      class _DescribeDefaultParameters : IamPolicy.Action("dax:DescribeDefaultParameters") {

         }       
 
      class _DescribeEvents : IamPolicy.Action("dax:DescribeEvents") {

         }       
 
      class _DescribeParameterGroups : IamPolicy.Action("dax:DescribeParameterGroups") {

         }       
 
      class _DescribeParameters : IamPolicy.Action("dax:DescribeParameters") {

         }       
 
      class _DescribeSubnetGroups : IamPolicy.Action("dax:DescribeSubnetGroups") {

         }       
 
      class _IncreaseReplicationFactor : IamPolicy.Action("dax:IncreaseReplicationFactor") {

         }       
 
      class _ListTags : IamPolicy.Action("dax:ListTags") {

         }       
 
      class _RebootNode : IamPolicy.Action("dax:RebootNode") {

         }       
 
      class _TagResource : IamPolicy.Action("dax:TagResource") {

         }       
 
      class _UntagResource : IamPolicy.Action("dax:UntagResource") {

         }       
 
      class _UpdateCluster : IamPolicy.Action("dax:UpdateCluster") {

         }       
 
      class _UpdateParameterGroup : IamPolicy.Action("dax:UpdateParameterGroup") {

         }       
 
      class _UpdateSubnetGroup : IamPolicy.Action("dax:UpdateSubnetGroup") {

         }       


}        
