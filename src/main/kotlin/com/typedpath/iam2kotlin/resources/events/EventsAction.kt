
package com.typedpath.iam2kotlin.resources.events

import com.typedpath.iam2kotlin.IamPolicy

class EventsAction() {

    companion object { 
        val All = IamPolicy.Action("events:*")    
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_DeleteRule.html 
        //  Deletes a rule.    
        val DeleteRule = _DeleteRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_DescribeRule.html 
        //  Describes the details of the specified rule.    
        val DescribeRule = _DescribeRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_DisableRule.html 
        //  Disables a rule.    
        val DisableRule = _DisableRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_EnableRule.html 
        //  Enables a rule.    
        val EnableRule = _EnableRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_ListRuleNamesByTarget.html 
        //  Lists the names of the rules that the given target is put to.    
        val ListRuleNamesByTarget = _ListRuleNamesByTarget() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_ListRules.html 
        //  Lists the Amazon CloudWatch Events rules in your account.    
        val ListRules = _ListRules() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_ListTargetsByRule.html 
        //  Lists of targets assigned to the rule.    
        val ListTargetsByRule = _ListTargetsByRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_PutEvents.html 
        //  Sends custom events to Amazon CloudWatch Events so that they can be matched to rules.    
        val PutEvents = _PutEvents() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_PutRule.html 
        //  Creates or updates a rule.    
        val PutRule = _PutRule() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_PutTargets.html 
        //  Adds target(s) to a rule.    
        val PutTargets = _PutTargets() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_RemoveTargets.html 
        //  Removes target(s) from a rule so that when the rule is triggered, those targets will no longer be invoked.    
        val RemoveTargets = _RemoveTargets() 
        // see http://docs.aws.amazon.com/AmazonCloudWatchEvents/latest/APIReference/API_TestEventPattern.html 
        //  Tests whether an event pattern matches the provided event.    
        val TestEventPattern = _TestEventPattern()
    }
      class _DeleteRule : IamPolicy.Action("events:DeleteRule") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _DescribeRule : IamPolicy.Action("events:DescribeRule") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _DisableRule : IamPolicy.Action("events:DisableRule") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _EnableRule : IamPolicy.Action("events:EnableRule") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _ListRuleNamesByTarget : IamPolicy.Action("events:ListRuleNamesByTarget") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _ListRules : IamPolicy.Action("events:ListRules") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _ListTargetsByRule : IamPolicy.Action("events:ListTargetsByRule") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _PutEvents : IamPolicy.Action("events:PutEvents") {

         }       
 
      class _PutRule : IamPolicy.Action("events:PutRule") {

         }       
 
      class _PutTargets : IamPolicy.Action("events:PutTargets") {

         }       
 
      class _RemoveTargets : IamPolicy.Action("events:RemoveTargets") {
             //arn:$partition:events:$region:$account:rule/$rulename"
            fun rule_byPartitionRegionAccountRulename(partition: String, region: String, account: String, rulename: String) = IamPolicy.Resource("arn:$partition:events:$region:$account:rule/$rulename")
         }       
 
      class _TestEventPattern : IamPolicy.Action("events:TestEventPattern") {

         }       


}        
