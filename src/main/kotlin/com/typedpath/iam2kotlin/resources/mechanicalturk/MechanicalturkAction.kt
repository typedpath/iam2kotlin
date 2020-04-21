
package com.typedpath.iam2kotlin.resources.mechanicalturk

import com.typedpath.iam2kotlin.IamPolicy

class MechanicalturkAction() {

    companion object { 
        val All = IamPolicy.Action("mechanicalturk:*")    
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_ApproveAssignmentOperation.html 
        //  The ApproveAssignment operation approves the results of a completed assignment.    
        val ApproveAssignment = _ApproveAssignment() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_ApproveRejectedAssignmentOperation.html 
        //  The ApproveRejectedAssignment operation approves an assignment that was previously rejected.    
        val ApproveRejectedAssignment = _ApproveRejectedAssignment() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_AssignQualificationOperation.html 
        //  The AssignQualification operation gives a Worker a Qualification.    
        val AssignQualification = _AssignQualification() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_BlockWorkerOperation.html 
        //  The BlockWorker operation allows you to prevent a Worker from working on your HITs.    
        val BlockWorker = _BlockWorker() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_ChangeHITTypeOfHITOperation.html 
        //  The ChangeHITTypeOfHIT operation allows you to change the HITType properties of a HIT.    
        val ChangeHITTypeOfHIT = _ChangeHITTypeOfHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_CreateHITOperation.html 
        //  The CreateHIT operation creates a new Human Intelligence Task (HIT).    
        val CreateHIT = _CreateHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_CreateQualificationTypeOperation.html 
        //  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure.    
        val CreateQualificationType = _CreateQualificationType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_DisableHITOperation.html 
        //  The DisableHIT operation removes a HIT from the Amazon Mechanical Turk marketplace, approves any submitted assignments pending approval or rejection, and disposes of the HIT and all assignment data.    
        val DisableHIT = _DisableHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_DisposeHITOperation.html 
        //  The DisposeHIT operation disposes of a HIT that is no longer needed.    
        val DisposeHIT = _DisposeHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_DisposeQualificationTypeOperation.html 
        //  The DisposeQualificationType operation disposes a Qualification type and disposes any HIT types that are associated with the Qualification type.    
        val DisposeQualificationType = _DisposeQualificationType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_ExtendHITOperation.html 
        //  The ExtendHIT operation increases the maximum number of assignments, or extends the expiration date, of an existing HIT.    
        val ExtendHIT = _ExtendHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_ForceExpireHITOperation.html 
        //  The ForceExpireHIT operation causes a HIT to expire immediately, as if the LifetimeInSeconds parameter of the HIT had elapsed.    
        val ForceExpireHIT = _ForceExpireHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetAccountBalanceOperation.html 
        //  The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.    
        val GetAccountBalance = _GetAccountBalance() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetAssignmentOperation.html 
        //  The GetAssignment operation retrieves an assignment with an AssignmentStatus value of Submitted, Approved, or Rejected, using the assignment's ID.    
        val GetAssignment = _GetAssignment() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetAssignmentsForHITOperation.html 
        //  The GetAssignmentsForHIT operation retrieves completed assignments for a HIT.    
        val GetAssignmentsForHIT = _GetAssignmentsForHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetBlockedWorkersOperation.html 
        //  The GetBlockedWorkers operation retrieves a list of Workers who are blocked from working on your HITs.    
        val GetBlockedWorkers = _GetBlockedWorkers() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetBonusPaymentsOperation.html 
        //  The GetBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment.    
        val GetBonusPayments = _GetBonusPayments() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetFileUploadURLOperation.html 
        //  The GetFileUploadURL operation generates and returns a temporary URL.    
        val GetFileUploadURL = _GetFileUploadURL() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetHITOperation.html 
        //  The GetHIT operation retrieves the details of the specified HIT.    
        val GetHIT = _GetHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetHITsForQualificationTypeOperation.html 
        //  The GetHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement.    
        val GetHITsForQualificationType = _GetHITsForQualificationType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetQualificationRequestsOperation.html 
        //  The GetQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type.    
        val GetQualificationRequests = _GetQualificationRequests() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetQualificationScoreOperation.html 
        //  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.    
        val GetQualificationScore = _GetQualificationScore() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetQualificationTypeOperation.html 
        //  The GetQualificationType operation retrieves information about a Qualification type using its ID.    
        val GetQualificationType = _GetQualificationType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetQualificationsForQualificationTypeOperation.html 
        //  The GetQualificationsForQualificationType operation returns all of the Qualifications granted to Workers for a given Qualification type.    
        val GetQualificationsForQualificationType = _GetQualificationsForQualificationType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetRequesterStatisticOperation.html 
        //  The GetRequesterStatistic operation retrieves statistics about you (the Requester calling the operation).    
        val GetRequesterStatistic = _GetRequesterStatistic() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetRequesterWorkerStatisticOperation.html 
        //  The GetRequesterWorkerStatistic operation retrieves statistics about a specific Worker who has completed Human Intelligence Tasks (HITs) for you.    
        val GetRequesterWorkerStatistic = _GetRequesterWorkerStatistic() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetReviewResultsForHITOperation.html 
        //  ???    
        val GetReviewResultsForHIT = _GetReviewResultsForHIT() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GetReviewableHITsOperation.html 
        //  The GetReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation.    
        val GetReviewableHITs = _GetReviewableHITs() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GrantBonusOperation.html 
        //  The GrantBonus operation issues a payment of money from your account to a Worker.    
        val GrantBonus = _GrantBonus() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_GrantQualificationOperation.html 
        //  The GrantQualification operation grants a Worker's request for a Qualification.    
        val GrantQualification = _GrantQualification() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_NotifyWorkersOperation.html 
        //  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID.    
        val NotifyWorkers = _NotifyWorkers() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_RegisterHITTypeOperation.html 
        //  The RegisterHITType operation creates a new HIT type.    
        val RegisterHITType = _RegisterHITType() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_RejectAssignmentOperation.html 
        //  The RejectAssignment operation rejects the results of a completed assignment.    
        val RejectAssignment = _RejectAssignment() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_RejectQualificationRequestOperation.html 
        //  The RejectQualificationRequest operation rejects a user's request for a Qualification.    
        val RejectQualificationRequest = _RejectQualificationRequest() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_RevokeQualificationOperation.html 
        //  The RevokeQualification operation revokes a previously granted Qualification from a user.    
        val RevokeQualification = _RevokeQualification() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_SearchHITsOperation.html 
        //  The SearchHITs operation returns all of a Requester's HITs, on behalf of the Requester.    
        val SearchHITs = _SearchHITs() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_SearchQualificationTypesOperation.html 
        //  The SearchQualificationTypes operation searches for Qualification types using the specified search query, and returns a list of Qualification types.    
        val SearchQualificationTypes = _SearchQualificationTypes() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_SendTestEventNotificationOperation.html 
        //  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification.    
        val SendTestEventNotification = _SendTestEventNotification() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_SetHITAsReviewingOperation.html 
        //  The SetHITAsReviewing operation updates the status of a HIT.    
        val SetHITAsReviewing = _SetHITAsReviewing() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_SetHITTypeNotificationOperation.html 
        //  The SetHITTypeNotification operation creates, updates, disables or re-enables notifications for a HIT type.    
        val SetHITTypeNotification = _SetHITTypeNotification() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_UnblockWorkerOperation.html 
        //  The UnblockWorker operation allows you to reinstate a blocked Worker to work on your HITs.    
        val UnblockWorker = _UnblockWorker() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_UpdateQualificationScoreOperation.html 
        //  The UpdateQualificationScore operation changes the value of a Qualification previously granted to a Worker.    
        val UpdateQualificationScore = _UpdateQualificationScore() 
        // see http://docs.aws.amazon.com/AWSMechTurk/latest/AWSMturkAPI/ApiReference_UpdateQualificationTypeOperation.html 
        //  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure.    
        val UpdateQualificationType = _UpdateQualificationType()
    }
      class _ApproveAssignment : IamPolicy.Action("mechanicalturk:ApproveAssignment") {

         }       
 
      class _ApproveRejectedAssignment : IamPolicy.Action("mechanicalturk:ApproveRejectedAssignment") {

         }       
 
      class _AssignQualification : IamPolicy.Action("mechanicalturk:AssignQualification") {

         }       
 
      class _BlockWorker : IamPolicy.Action("mechanicalturk:BlockWorker") {

         }       
 
      class _ChangeHITTypeOfHIT : IamPolicy.Action("mechanicalturk:ChangeHITTypeOfHIT") {

         }       
 
      class _CreateHIT : IamPolicy.Action("mechanicalturk:CreateHIT") {

         }       
 
      class _CreateQualificationType : IamPolicy.Action("mechanicalturk:CreateQualificationType") {

         }       
 
      class _DisableHIT : IamPolicy.Action("mechanicalturk:DisableHIT") {

         }       
 
      class _DisposeHIT : IamPolicy.Action("mechanicalturk:DisposeHIT") {

         }       
 
      class _DisposeQualificationType : IamPolicy.Action("mechanicalturk:DisposeQualificationType") {

         }       
 
      class _ExtendHIT : IamPolicy.Action("mechanicalturk:ExtendHIT") {

         }       
 
      class _ForceExpireHIT : IamPolicy.Action("mechanicalturk:ForceExpireHIT") {

         }       
 
      class _GetAccountBalance : IamPolicy.Action("mechanicalturk:GetAccountBalance") {

         }       
 
      class _GetAssignment : IamPolicy.Action("mechanicalturk:GetAssignment") {

         }       
 
      class _GetAssignmentsForHIT : IamPolicy.Action("mechanicalturk:GetAssignmentsForHIT") {

         }       
 
      class _GetBlockedWorkers : IamPolicy.Action("mechanicalturk:GetBlockedWorkers") {

         }       
 
      class _GetBonusPayments : IamPolicy.Action("mechanicalturk:GetBonusPayments") {

         }       
 
      class _GetFileUploadURL : IamPolicy.Action("mechanicalturk:GetFileUploadURL") {

         }       
 
      class _GetHIT : IamPolicy.Action("mechanicalturk:GetHIT") {

         }       
 
      class _GetHITsForQualificationType : IamPolicy.Action("mechanicalturk:GetHITsForQualificationType") {

         }       
 
      class _GetQualificationRequests : IamPolicy.Action("mechanicalturk:GetQualificationRequests") {

         }       
 
      class _GetQualificationScore : IamPolicy.Action("mechanicalturk:GetQualificationScore") {

         }       
 
      class _GetQualificationType : IamPolicy.Action("mechanicalturk:GetQualificationType") {

         }       
 
      class _GetQualificationsForQualificationType : IamPolicy.Action("mechanicalturk:GetQualificationsForQualificationType") {

         }       
 
      class _GetRequesterStatistic : IamPolicy.Action("mechanicalturk:GetRequesterStatistic") {

         }       
 
      class _GetRequesterWorkerStatistic : IamPolicy.Action("mechanicalturk:GetRequesterWorkerStatistic") {

         }       
 
      class _GetReviewResultsForHIT : IamPolicy.Action("mechanicalturk:GetReviewResultsForHIT") {

         }       
 
      class _GetReviewableHITs : IamPolicy.Action("mechanicalturk:GetReviewableHITs") {

         }       
 
      class _GrantBonus : IamPolicy.Action("mechanicalturk:GrantBonus") {

         }       
 
      class _GrantQualification : IamPolicy.Action("mechanicalturk:GrantQualification") {

         }       
 
      class _NotifyWorkers : IamPolicy.Action("mechanicalturk:NotifyWorkers") {

         }       
 
      class _RegisterHITType : IamPolicy.Action("mechanicalturk:RegisterHITType") {

         }       
 
      class _RejectAssignment : IamPolicy.Action("mechanicalturk:RejectAssignment") {

         }       
 
      class _RejectQualificationRequest : IamPolicy.Action("mechanicalturk:RejectQualificationRequest") {

         }       
 
      class _RevokeQualification : IamPolicy.Action("mechanicalturk:RevokeQualification") {

         }       
 
      class _SearchHITs : IamPolicy.Action("mechanicalturk:SearchHITs") {

         }       
 
      class _SearchQualificationTypes : IamPolicy.Action("mechanicalturk:SearchQualificationTypes") {

         }       
 
      class _SendTestEventNotification : IamPolicy.Action("mechanicalturk:SendTestEventNotification") {

         }       
 
      class _SetHITAsReviewing : IamPolicy.Action("mechanicalturk:SetHITAsReviewing") {

         }       
 
      class _SetHITTypeNotification : IamPolicy.Action("mechanicalturk:SetHITTypeNotification") {

         }       
 
      class _UnblockWorker : IamPolicy.Action("mechanicalturk:UnblockWorker") {

         }       
 
      class _UpdateQualificationScore : IamPolicy.Action("mechanicalturk:UpdateQualificationScore") {

         }       
 
      class _UpdateQualificationType : IamPolicy.Action("mechanicalturk:UpdateQualificationType") {

         }       


}        
