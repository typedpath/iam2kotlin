
package com.typedpath.iam2kotlin.resources.elasticloadbalancing

import com.typedpath.iam2kotlin.IamPolicy

class ElasticloadbalancingAction() {

    companion object { 
        val All = IamPolicy.Action("elasticloadbalancing:*")    
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_AddTags.html 
        //  Classic Load Balancer: Adds the specified tags to the specified load balancer.    
        val AddTags = _AddTags() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_ApplySecurityGroupsToLoadBalancer.html 
        //  Classic Load Balancer: Associates one or more security groups with your load balancer in a virtual private cloud (VPC).    
        val ApplySecurityGroupsToLoadBalancer = _ApplySecurityGroupsToLoadBalancer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_AttachLoadBalancerToSubnets.html 
        //  Classic Load Balancer: Adds one or more subnets to the set of configured subnets for the specified load balancer.    
        val AttachLoadBalancerToSubnets = _AttachLoadBalancerToSubnets() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_ConfigureHealthCheck.html 
        //  Classic Load Balancer: Specifies the health check settings to use when evaluating the health state of your back-end instances.    
        val ConfigureHealthCheck = _ConfigureHealthCheck() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_CreateAppCookieStickinessPolicy.html 
        //  Classic Load Balancer: Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie.    
        val CreateAppCookieStickinessPolicy = _CreateAppCookieStickinessPolicy() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateListener.html 
        //  Application Load Balancer: Creates a listener for the specified Application Load Balancer.    
        val CreateListener = _CreateListener() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_CreateLBCookieStickinessPolicy.html 
        //  Classic Load Balancer: Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent) or a specified expiration period.    
        val CreateLBCookieStickinessPolicy = _CreateLBCookieStickinessPolicy() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_CreateLoadBalancer.html 
        //  Classic Load Balancer: Creates a load balancer.    
        val CreateLoadBalancer = _CreateLoadBalancer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_CreateLoadBalancerListeners.html 
        //  Classic Load Balancer: Creates one or more listeners for the specified load balancer.    
        val CreateLoadBalancerListeners = _CreateLoadBalancerListeners() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_CreateLoadBalancerPolicy.html 
        //  Classic Load Balancer: Creates a policy with the specified attributes for the specified load balancer.    
        val CreateLoadBalancerPolicy = _CreateLoadBalancerPolicy() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateRule.html 
        //  Application Load Balancer: Creates a rule for the specified listener.    
        val CreateRule = _CreateRule() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html 
        //  Application Load Balancer: Creates a target group.    
        val CreateTargetGroup = _CreateTargetGroup() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DeleteListener.html 
        //  Application Load Balancer: Deletes the specified listener.    
        val DeleteListener = _DeleteListener() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancer.html 
        //  Classic Load Balancer: Deletes the specified load balancer.    
        val DeleteLoadBalancer = _DeleteLoadBalancer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html 
        //  Classic Load Balancer: Deletes the specified listeners from the specified load balancer.    
        val DeleteLoadBalancerListeners = _DeleteLoadBalancerListeners() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerPolicy.html 
        //  Classic Load Balancer: Deletes the specified policy from the specified load balancer.    
        val DeleteLoadBalancerPolicy = _DeleteLoadBalancerPolicy() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DeleteRule.html 
        //  Application Load Balancer: Deletes the specified rule.    
        val DeleteRule = _DeleteRule() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DeleteTargetGroup.html 
        //  Application Load Balancer: Deletes the specified target group.    
        val DeleteTargetGroup = _DeleteTargetGroup() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeregisterInstancesFromLoadBalancer.html 
        //  Classic Load Balancer: Deregisters the specified instances from the specified load balancer.    
        val DeregisterInstancesFromLoadBalancer = _DeregisterInstancesFromLoadBalancer() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DeregisterTargets.html 
        //  Application Load Balancer: Deregisters the specified targets from the specified target group.    
        val DeregisterTargets = _DeregisterTargets() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeInstanceHealth.html 
        //  Classic Load Balancer: Describes the state of the specified instances with respect to the specified load balancer.    
        val DescribeInstanceHealth = _DescribeInstanceHealth() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeListeners.html 
        //  Application Load Balancer: Describes the specified listeners or the listeners for the specified Application Load Balancer.    
        val DescribeListeners = _DescribeListeners() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancerAttributes.html 
        //  Classic Load Balancer: Describes the attributes for the specified load balancer.    
        val DescribeLoadBalancerAttributes = _DescribeLoadBalancerAttributes() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancerPolicyTypes.html 
        //  Classic Load Balancer: Describes the specified load balancer policy types or all load balancer policy types.    
        val DescribeLoadBalancerPolicyTypes = _DescribeLoadBalancerPolicyTypes() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancerPolicies.html 
        //  Classic Load Balancer: Describes the specified policies.    
        val DescribeLoadBalancerPolicies = _DescribeLoadBalancerPolicies() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html 
        //  Classic Load Balancer: Describes the specified the load balancers.    
        val DescribeLoadBalancers = _DescribeLoadBalancers() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeRules.html 
        //  Application Load Balancer: Describes the specified rules or the rules for the specified listener.    
        val DescribeRules = _DescribeRules() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeSSLPolicies.html 
        //  Application Load Balancer: Describes the specified policies or all policies used for SSL negotiation.    
        val DescribeSSLPolicies = _DescribeSSLPolicies() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeTags.html 
        //  Classic Load Balancer: Describes the tags associated with the specified load balancers.    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroupAttributes.html 
        //  Application Load Balancer: Describes the attributes for the specified target group.    
        val DescribeTargetGroupAttributes = _DescribeTargetGroupAttributes() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html 
        //  Application Load Balancer: Describes the specified target groups or all of your target groups.    
        val DescribeTargetGroups = _DescribeTargetGroups() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetHealth.html 
        //  Application Load Balancer: Describes the health of the specified targets or all of your targets.    
        val DescribeTargetHealth = _DescribeTargetHealth() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DetachLoadBalancerFromSubnets.html 
        //  Classic Load Balancer: Removes the specified subnets from the set of configured subnets for the load balancer.    
        val DetachLoadBalancerFromSubnets = _DetachLoadBalancerFromSubnets() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DisableAvailabilityZonesForLoadBalancer.html 
        //  Classic Load Balancer: Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer.    
        val DisableAvailabilityZonesForLoadBalancer = _DisableAvailabilityZonesForLoadBalancer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_EnableAvailabilityZonesForLoadBalancer.html 
        //  Classic Load Balancer: Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer.    
        val EnableAvailabilityZonesForLoadBalancer = _EnableAvailabilityZonesForLoadBalancer() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_ModifyListener.html 
        //  Application Load Balancer: Modifies the specified properties of the specified listener.    
        val ModifyListener = _ModifyListener() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_ModifyLoadBalancerAttributes.html 
        //  Classic Load Balancer: Modifies the attributes of the specified load balancer.    
        val ModifyLoadBalancerAttributes = _ModifyLoadBalancerAttributes() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_ModifyRule.html 
        //  Application Load Balancer: Modifies the specified rule.    
        val ModifyRule = _ModifyRule() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_ModifyTargetGroup.html 
        //  Application Load Balancer: Modifies the health checks used when evaluating the health state of the targets in the specified target group.    
        val ModifyTargetGroup = _ModifyTargetGroup() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_ModifyTargetGroupAttributes.html 
        //  Application Load Balancer: Modifies the specified attributes of the specified target group.    
        val ModifyTargetGroupAttributes = _ModifyTargetGroupAttributes() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_RegisterTargets.html 
        //  Application Load Balancer: Registers the specified targets with the specified target group.    
        val RegisterTargets = _RegisterTargets() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_RegisterInstancesWithLoadBalancer.html 
        //  Classic Load Balancer: Adds the specified instances to the specified load balancer.    
        val RegisterInstancesWithLoadBalancer = _RegisterInstancesWithLoadBalancer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_RemoveTags.html 
        //  Classic Load Balancer: Removes one or more tags from the specified load balancer.    
        val RemoveTags = _RemoveTags() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_SetLoadBalancerListenerSSLCertificate.html 
        //  Classic Load Balancer: Sets the certificate that terminates the specified listener's SSL connections.    
        val SetLoadBalancerListenerSSLCertificate = _SetLoadBalancerListenerSSLCertificate() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_SetLoadBalancerPoliciesForBackendServer.html 
        //  Classic Load Balancer: Replaces the set of policies associated with the specified port on which the back-end server is listening with a new set of policies.    
        val SetLoadBalancerPoliciesForBackendServer = _SetLoadBalancerPoliciesForBackendServer() 
        // see http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_SetLoadBalancerPoliciesOfListener.html 
        //  Classic Load Balancer: Replaces the current set of policies for the specified load balancer port with the specified set of policies.    
        val SetLoadBalancerPoliciesOfListener = _SetLoadBalancerPoliciesOfListener() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_SetRulePriorities.html 
        //  Application Load Balancer: Sets the priorities of the specified rules.    
        val SetRulePriorities = _SetRulePriorities() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_SetSecurityGroups.html 
        //  Application Load Balancer: Associates the specified security groups with the specified load balancer.    
        val SetSecurityGroups = _SetSecurityGroups() 
        // see http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_SetSubnets.html 
        //  Application Load Balancer: Enables the Availability Zone for the specified subnets for the specified load balancer.    
        val SetSubnets = _SetSubnets()
    }
      class _AddTags : IamPolicy.Action("elasticloadbalancing:AddTags") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _ApplySecurityGroupsToLoadBalancer : IamPolicy.Action("elasticloadbalancing:ApplySecurityGroupsToLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _AttachLoadBalancerToSubnets : IamPolicy.Action("elasticloadbalancing:AttachLoadBalancerToSubnets") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _ConfigureHealthCheck : IamPolicy.Action("elasticloadbalancing:ConfigureHealthCheck") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateAppCookieStickinessPolicy : IamPolicy.Action("elasticloadbalancing:CreateAppCookieStickinessPolicy") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateListener : IamPolicy.Action("elasticloadbalancing:CreateListener") {

         }       
 
      class _CreateLBCookieStickinessPolicy : IamPolicy.Action("elasticloadbalancing:CreateLBCookieStickinessPolicy") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateLoadBalancer : IamPolicy.Action("elasticloadbalancing:CreateLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateLoadBalancerListeners : IamPolicy.Action("elasticloadbalancing:CreateLoadBalancerListeners") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateLoadBalancerPolicy : IamPolicy.Action("elasticloadbalancing:CreateLoadBalancerPolicy") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _CreateRule : IamPolicy.Action("elasticloadbalancing:CreateRule") {

         }       
 
      class _CreateTargetGroup : IamPolicy.Action("elasticloadbalancing:CreateTargetGroup") {

         }       
 
      class _DeleteListener : IamPolicy.Action("elasticloadbalancing:DeleteListener") {

         }       
 
      class _DeleteLoadBalancer : IamPolicy.Action("elasticloadbalancing:DeleteLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _DeleteLoadBalancerListeners : IamPolicy.Action("elasticloadbalancing:DeleteLoadBalancerListeners") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _DeleteLoadBalancerPolicy : IamPolicy.Action("elasticloadbalancing:DeleteLoadBalancerPolicy") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _DeleteRule : IamPolicy.Action("elasticloadbalancing:DeleteRule") {

         }       
 
      class _DeleteTargetGroup : IamPolicy.Action("elasticloadbalancing:DeleteTargetGroup") {

         }       
 
      class _DeregisterInstancesFromLoadBalancer : IamPolicy.Action("elasticloadbalancing:DeregisterInstancesFromLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _DeregisterTargets : IamPolicy.Action("elasticloadbalancing:DeregisterTargets") {

         }       
 
      class _DescribeInstanceHealth : IamPolicy.Action("elasticloadbalancing:DescribeInstanceHealth") {

         }       
 
      class _DescribeListeners : IamPolicy.Action("elasticloadbalancing:DescribeListeners") {

         }       
 
      class _DescribeLoadBalancerAttributes : IamPolicy.Action("elasticloadbalancing:DescribeLoadBalancerAttributes") {

         }       
 
      class _DescribeLoadBalancerPolicyTypes : IamPolicy.Action("elasticloadbalancing:DescribeLoadBalancerPolicyTypes") {

         }       
 
      class _DescribeLoadBalancerPolicies : IamPolicy.Action("elasticloadbalancing:DescribeLoadBalancerPolicies") {

         }       
 
      class _DescribeLoadBalancers : IamPolicy.Action("elasticloadbalancing:DescribeLoadBalancers") {

         }       
 
      class _DescribeRules : IamPolicy.Action("elasticloadbalancing:DescribeRules") {

         }       
 
      class _DescribeSSLPolicies : IamPolicy.Action("elasticloadbalancing:DescribeSSLPolicies") {

         }       
 
      class _DescribeTags : IamPolicy.Action("elasticloadbalancing:DescribeTags") {

         }       
 
      class _DescribeTargetGroupAttributes : IamPolicy.Action("elasticloadbalancing:DescribeTargetGroupAttributes") {

         }       
 
      class _DescribeTargetGroups : IamPolicy.Action("elasticloadbalancing:DescribeTargetGroups") {

         }       
 
      class _DescribeTargetHealth : IamPolicy.Action("elasticloadbalancing:DescribeTargetHealth") {

         }       
 
      class _DetachLoadBalancerFromSubnets : IamPolicy.Action("elasticloadbalancing:DetachLoadBalancerFromSubnets") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _DisableAvailabilityZonesForLoadBalancer : IamPolicy.Action("elasticloadbalancing:DisableAvailabilityZonesForLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _EnableAvailabilityZonesForLoadBalancer : IamPolicy.Action("elasticloadbalancing:EnableAvailabilityZonesForLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _ModifyListener : IamPolicy.Action("elasticloadbalancing:ModifyListener") {

         }       
 
      class _ModifyLoadBalancerAttributes : IamPolicy.Action("elasticloadbalancing:ModifyLoadBalancerAttributes") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _ModifyRule : IamPolicy.Action("elasticloadbalancing:ModifyRule") {

         }       
 
      class _ModifyTargetGroup : IamPolicy.Action("elasticloadbalancing:ModifyTargetGroup") {

         }       
 
      class _ModifyTargetGroupAttributes : IamPolicy.Action("elasticloadbalancing:ModifyTargetGroupAttributes") {

         }       
 
      class _RegisterTargets : IamPolicy.Action("elasticloadbalancing:RegisterTargets") {

         }       
 
      class _RegisterInstancesWithLoadBalancer : IamPolicy.Action("elasticloadbalancing:RegisterInstancesWithLoadBalancer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _RemoveTags : IamPolicy.Action("elasticloadbalancing:RemoveTags") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _SetLoadBalancerListenerSSLCertificate : IamPolicy.Action("elasticloadbalancing:SetLoadBalancerListenerSSLCertificate") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _SetLoadBalancerPoliciesForBackendServer : IamPolicy.Action("elasticloadbalancing:SetLoadBalancerPoliciesForBackendServer") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _SetLoadBalancerPoliciesOfListener : IamPolicy.Action("elasticloadbalancing:SetLoadBalancerPoliciesOfListener") {
             //arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$load-balancer-name"
            fun loadbalancer_byRegionAccountLoadbalancername(region: String, account: String, loadbalancername: String) = IamPolicy.Resource("arn:aws:elasticloadbalancing:$region:$account:loadbalancer/$loadbalancername")
         }       
 
      class _SetRulePriorities : IamPolicy.Action("elasticloadbalancing:SetRulePriorities") {

         }       
 
      class _SetSecurityGroups : IamPolicy.Action("elasticloadbalancing:SetSecurityGroups") {

         }       
 
      class _SetSubnets : IamPolicy.Action("elasticloadbalancing:SetSubnets") {

         }       


}        
