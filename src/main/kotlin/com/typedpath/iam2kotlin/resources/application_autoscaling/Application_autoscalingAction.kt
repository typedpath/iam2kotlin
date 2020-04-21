
package com.typedpath.iam2kotlin.resources.application_autoscaling

import com.typedpath.iam2kotlin.IamPolicy

class Application_autoscalingAction() {

    companion object { 
        val All = IamPolicy.Action("application_autoscaling:*")    
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_DeleteScalingPolicy.html 
        //  Deletes the specified Application Auto Scaling scaling policy.    
        val DeleteScalingPolicy = _DeleteScalingPolicy() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_DeregisterScalableTarget.html 
        //  Deregisters a scalable target.    
        val DeregisterScalableTarget = _DeregisterScalableTarget() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_DescribeScalableTargets.html 
        //  Provides descriptive information about the scalable targets in the specified namespace.    
        val DescribeScalableTargets = _DescribeScalableTargets() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_DescribeScalingActivities.html 
        //  Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks.    
        val DescribeScalingActivities = _DescribeScalingActivities() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_DescribeScalingPolicies.html 
        //  Provides descriptive information about the scaling policies in the specified namespace.    
        val DescribeScalingPolicies = _DescribeScalingPolicies() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScalingPolicy.html 
        //  Creates or updates a policy for an Application Auto Scaling scalable target.    
        val PutScalingPolicy = _PutScalingPolicy() 
        // see http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html 
        //  Registers or updates a scalable target.    
        val RegisterScalableTarget = _RegisterScalableTarget()
    }
      class _DeleteScalingPolicy : IamPolicy.Action("application-autoscaling:DeleteScalingPolicy") {

         }       
 
      class _DeregisterScalableTarget : IamPolicy.Action("application-autoscaling:DeregisterScalableTarget") {

         }       
 
      class _DescribeScalableTargets : IamPolicy.Action("application-autoscaling:DescribeScalableTargets") {

         }       
 
      class _DescribeScalingActivities : IamPolicy.Action("application-autoscaling:DescribeScalingActivities") {

         }       
 
      class _DescribeScalingPolicies : IamPolicy.Action("application-autoscaling:DescribeScalingPolicies") {

         }       
 
      class _PutScalingPolicy : IamPolicy.Action("application-autoscaling:PutScalingPolicy") {

         }       
 
      class _RegisterScalableTarget : IamPolicy.Action("application-autoscaling:RegisterScalableTarget") {

         }       


}        
