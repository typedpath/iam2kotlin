
package com.typedpath.iam2kotlin.resources.organizations

import com.typedpath.iam2kotlin.IamPolicy

class OrganizationsAction() {

    companion object { 
        val All = IamPolicy.Action("organizations:*")    
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_AcceptHandshake.html 
        //  Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.    
        val AcceptHandshake = _AcceptHandshake() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_AttachPolicy.html 
        //  Attaches a policy to a root, an organizational unit, or an individual account.    
        val AttachPolicy = _AttachPolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_CancelHandshake.html 
        //  Cancels a handshake.    
        val CancelHandshake = _CancelHandshake() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_CreateAccount.html 
        //  Creates an AWS account that is automatically a member of the organization whose credentials made the request.    
        val CreateAccount = _CreateAccount() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_CreateOrganization.html 
        //  Creates an AWS organization.    
        val CreateOrganization = _CreateOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_CreateOrganizationalUnit.html 
        //  Creates an organizational unit (OU) within a root or parent OU.    
        val CreateOrganizationalUnit = _CreateOrganizationalUnit() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_CreatePolicy.html 
        //  Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual AWS account.    
        val CreatePolicy = _CreatePolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DeclineHandshake.html 
        //  Declines a handshake request.    
        val DeclineHandshake = _DeclineHandshake() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DeleteOrganization.html 
        //  Deletes the organization.    
        val DeleteOrganization = _DeleteOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DeleteOrganizationalUnit.html 
        //  Deletes an organizational unit from a root or another OU.    
        val DeleteOrganizationalUnit = _DeleteOrganizationalUnit() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DeletePolicy.html 
        //  Deletes the specified policy from your organization.    
        val DeletePolicy = _DeletePolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribeAccount.html 
        //  Retrieves Organizations-related information about the specified account.    
        val DescribeAccount = _DescribeAccount() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribeCreateAccountStatus.html 
        //  Retrieves the current status of an asynchronous request to create an account.    
        val DescribeCreateAccountStatus = _DescribeCreateAccountStatus() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribeHandshake.html 
        //  Retrieves information about a previously requested handshake.    
        val DescribeHandshake = _DescribeHandshake() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribeOrganization.html 
        //  Retrieves information about the organization that the user's account belongs to.    
        val DescribeOrganization = _DescribeOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribeOrganizationalUnit.html 
        //  Retrieves information about an organizational unit (OU).    
        val DescribeOrganizationalUnit = _DescribeOrganizationalUnit() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DescribePolicy.html 
        //  Retrieves information about a policy.    
        val DescribePolicy = _DescribePolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DetachPolicy.html 
        //  Detaches a policy from a target root, organizational unit, or account.    
        val DetachPolicy = _DetachPolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_DisablePolicyType.html 
        //  Disables an organizational control policy type in a root.    
        val DisablePolicyType = _DisablePolicyType() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_EnableAllFeatures.html 
        //  Enables all features in an organization.    
        val EnableAllFeatures = _EnableAllFeatures() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_EnablePolicyType.html 
        //  Enables a policy type in a root.    
        val EnablePolicyType = _EnablePolicyType() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_InviteAccountToOrganization.html 
        //  Sends an invitation to another account to join your organization as a member account.    
        val InviteAccountToOrganization = _InviteAccountToOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_LeaveOrganization.html 
        //  Removes a member account from its parent organization.    
        val LeaveOrganization = _LeaveOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListAccounts.html 
        //  Lists all the accounts in the organization.    
        val ListAccounts = _ListAccounts() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListAccountsForParent.html 
        //  Lists the accounts in an organization that are contained by the specified target root or organizational unit (OU).    
        val ListAccountsForParent = _ListAccountsForParent() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListChildren.html 
        //  Lists all of the OUs or accounts that are contained in the specified parent OU or root.    
        val ListChildren = _ListChildren() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListCreateAccountStatus.html 
        //  Lists the account creation requests that match the specified status that is currently being tracked for the organization.    
        val ListCreateAccountStatus = _ListCreateAccountStatus() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListHandshakesForAccount.html 
        //  Lists the current handshakes that are associated with the account of the requesting user.    
        val ListHandshakesForAccount = _ListHandshakesForAccount() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListHandshakesForOrganization.html 
        //  Lists the handshakes that are associated with the organization that the requesting user is part of.    
        val ListHandshakesForOrganization = _ListHandshakesForOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListOrganizationalUnitsForParent.html 
        //  Lists the organizational units (OUs) in a parent organizational unit or root.    
        val ListOrganizationalUnitsForParent = _ListOrganizationalUnitsForParent() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListParents.html 
        //  Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or account.    
        val ListParents = _ListParents() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListPolicies.html 
        //  Retrieves the list of all policies in an organization of a specified type.    
        val ListPolicies = _ListPolicies() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListPoliciesForTarget.html 
        //  Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.    
        val ListPoliciesForTarget = _ListPoliciesForTarget() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListRoots.html 
        //  Lists the roots that are defined in the current organization.    
        val ListRoots = _ListRoots() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_ListTargetsForPolicy.html 
        //  Lists all the roots, OUs, and accounts to which the specified policy is attached.    
        val ListTargetsForPolicy = _ListTargetsForPolicy() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_MoveAccount.html 
        //  Moves an account from its current source parent root or OU to the specified destination parent root or OU.    
        val MoveAccount = _MoveAccount() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_RemoveAccountFromOrganization.html 
        //  Removes the specified account from the organization.    
        val RemoveAccountFromOrganization = _RemoveAccountFromOrganization() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_UpdateOrganizationalUnit.html 
        //  Renames the specified organizational unit (OU).    
        val UpdateOrganizationalUnit = _UpdateOrganizationalUnit() 
        // see http://docs.aws.amazon.com/organizations/latest/APIReference//API_UpdatePolicy.html 
        //  Updates an existing policy with a new name, description, or content.    
        val UpdatePolicy = _UpdatePolicy()
    }
      class _AcceptHandshake : IamPolicy.Action("organizations:AcceptHandshake") {

         }       
 
      class _AttachPolicy : IamPolicy.Action("organizations:AttachPolicy") {

         }       
 
      class _CancelHandshake : IamPolicy.Action("organizations:CancelHandshake") {

         }       
 
      class _CreateAccount : IamPolicy.Action("organizations:CreateAccount") {

         }       
 
      class _CreateOrganization : IamPolicy.Action("organizations:CreateOrganization") {

         }       
 
      class _CreateOrganizationalUnit : IamPolicy.Action("organizations:CreateOrganizationalUnit") {

         }       
 
      class _CreatePolicy : IamPolicy.Action("organizations:CreatePolicy") {

         }       
 
      class _DeclineHandshake : IamPolicy.Action("organizations:DeclineHandshake") {

         }       
 
      class _DeleteOrganization : IamPolicy.Action("organizations:DeleteOrganization") {

         }       
 
      class _DeleteOrganizationalUnit : IamPolicy.Action("organizations:DeleteOrganizationalUnit") {

         }       
 
      class _DeletePolicy : IamPolicy.Action("organizations:DeletePolicy") {

         }       
 
      class _DescribeAccount : IamPolicy.Action("organizations:DescribeAccount") {

         }       
 
      class _DescribeCreateAccountStatus : IamPolicy.Action("organizations:DescribeCreateAccountStatus") {

         }       
 
      class _DescribeHandshake : IamPolicy.Action("organizations:DescribeHandshake") {

         }       
 
      class _DescribeOrganization : IamPolicy.Action("organizations:DescribeOrganization") {

         }       
 
      class _DescribeOrganizationalUnit : IamPolicy.Action("organizations:DescribeOrganizationalUnit") {

         }       
 
      class _DescribePolicy : IamPolicy.Action("organizations:DescribePolicy") {

         }       
 
      class _DetachPolicy : IamPolicy.Action("organizations:DetachPolicy") {

         }       
 
      class _DisablePolicyType : IamPolicy.Action("organizations:DisablePolicyType") {

         }       
 
      class _EnableAllFeatures : IamPolicy.Action("organizations:EnableAllFeatures") {

         }       
 
      class _EnablePolicyType : IamPolicy.Action("organizations:EnablePolicyType") {

         }       
 
      class _InviteAccountToOrganization : IamPolicy.Action("organizations:InviteAccountToOrganization") {

         }       
 
      class _LeaveOrganization : IamPolicy.Action("organizations:LeaveOrganization") {

         }       
 
      class _ListAccounts : IamPolicy.Action("organizations:ListAccounts") {

         }       
 
      class _ListAccountsForParent : IamPolicy.Action("organizations:ListAccountsForParent") {

         }       
 
      class _ListChildren : IamPolicy.Action("organizations:ListChildren") {

         }       
 
      class _ListCreateAccountStatus : IamPolicy.Action("organizations:ListCreateAccountStatus") {

         }       
 
      class _ListHandshakesForAccount : IamPolicy.Action("organizations:ListHandshakesForAccount") {

         }       
 
      class _ListHandshakesForOrganization : IamPolicy.Action("organizations:ListHandshakesForOrganization") {

         }       
 
      class _ListOrganizationalUnitsForParent : IamPolicy.Action("organizations:ListOrganizationalUnitsForParent") {

         }       
 
      class _ListParents : IamPolicy.Action("organizations:ListParents") {

         }       
 
      class _ListPolicies : IamPolicy.Action("organizations:ListPolicies") {

         }       
 
      class _ListPoliciesForTarget : IamPolicy.Action("organizations:ListPoliciesForTarget") {

         }       
 
      class _ListRoots : IamPolicy.Action("organizations:ListRoots") {

         }       
 
      class _ListTargetsForPolicy : IamPolicy.Action("organizations:ListTargetsForPolicy") {

         }       
 
      class _MoveAccount : IamPolicy.Action("organizations:MoveAccount") {

         }       
 
      class _RemoveAccountFromOrganization : IamPolicy.Action("organizations:RemoveAccountFromOrganization") {

         }       
 
      class _UpdateOrganizationalUnit : IamPolicy.Action("organizations:UpdateOrganizationalUnit") {

         }       
 
      class _UpdatePolicy : IamPolicy.Action("organizations:UpdatePolicy") {

         }       


}        
