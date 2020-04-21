
package com.typedpath.iam2kotlin.resources.gamelift

import com.typedpath.iam2kotlin.IamPolicy

class GameliftAction() {

    companion object { 
        val All = IamPolicy.Action("gamelift:*")    
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateAlias.html 
        //  Creates an alias for a fleet.    
        val CreateAlias = _CreateAlias() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateBuild.html 
        //  Initializes a new build record and generates information required to upload a game build to Amazon GameLift.    
        val CreateBuild = _CreateBuild() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateFleet.html 
        //  Creates a new fleet to run your game servers.    
        val CreateFleet = _CreateFleet() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateGameSession.html 
        //  Creates a multiplayer game session for players.    
        val CreateGameSession = _CreateGameSession() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSession.html 
        //  Adds a player to a game session and creates a player session record.    
        val CreatePlayerSession = _CreatePlayerSession() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSessions.html 
        //  Adds a group of players to a game session.    
        val CreatePlayerSessions = _CreatePlayerSessions() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteAlias.html 
        //  Deletes an alias.    
        val DeleteAlias = _DeleteAlias() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteBuild.html 
        //  Deletes a build.    
        val DeleteBuild = _DeleteBuild() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteFleet.html 
        //  Deletes everything related to a fleet.    
        val DeleteFleet = _DeleteFleet() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeAlias.html 
        //  Retrieves properties for a specified alias.    
        val DescribeAlias = _DescribeAlias() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeBuild.html 
        //  Retrieves properties for a build.    
        val DescribeBuild = _DescribeBuild() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeEC2InstanceLimits.html 
        //  .    
        val DescribeEC2InstanceLimits = _DescribeEC2InstanceLimits() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetAttributes.html 
        //  Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets.    
        val DescribeFleetAttributes = _DescribeFleetAttributes() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html 
        //  Retrieves the current status of fleet capacity for one or more fleets.    
        val DescribeFleetCapacity = _DescribeFleetCapacity() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetEvents.html 
        //  Retrieves entries from the specified fleet's event log.    
        val DescribeFleetEvents = _DescribeFleetEvents() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetPortSettings.html 
        //  Retrieves the inbound connection permissions for a fleet.    
        val DescribeFleetPortSettings = _DescribeFleetPortSettings() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetUtilization.html 
        //  Retrieves utilization statistics for one or more fleets.    
        val DescribeFleetUtilization = _DescribeFleetUtilization() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessions.html 
        //  Retrieves properties for one or more game sessions.    
        val DescribeGameSessions = _DescribeGameSessions() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribePlayerSessions.html 
        //  Retrieves properties for one or more player sessions.    
        val DescribePlayerSessions = _DescribePlayerSessions() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_GetGameSessionLogUrl.html 
        //  Retrieves the location of stored game session logs for a specified game session.    
        val GetGameSessionLogUrl = _GetGameSessionLogUrl() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_ListAliases.html 
        //  Retrieves a collection of alias records for this AWS account.    
        val ListAliases = _ListAliases() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_ListBuilds.html 
        //  Retrieves build records for all builds associated with the AWS account in use.    
        val ListBuilds = _ListBuilds() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_ListFleets.html 
        //  Retrieves a collection of fleet records for this AWS account.    
        val ListFleets = _ListFleets() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_RequestUploadCredentials.html 
        //  Retrieves a fresh set of upload credentials and the assigned Amazon S3 storage location for a specific build.    
        val RequestUploadCredentials = _RequestUploadCredentials() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_ResolveAlias.html 
        //  Retrieves the fleet ID that a specified alias is currently pointing to.    
        val ResolveAlias = _ResolveAlias() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateAlias.html 
        //  Updates properties for an alias.    
        val UpdateAlias = _UpdateAlias() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateBuild.html 
        //  Updates metadata in a build record, including the build name and version.    
        val UpdateBuild = _UpdateBuild() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetAttributes.html 
        //  Updates fleet properties, including name and description, for a fleet.    
        val UpdateFleetAttributes = _UpdateFleetAttributes() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html 
        //  Updates capacity settings for a fleet.    
        val UpdateFleetCapacity = _UpdateFleetCapacity() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings.html 
        //  Updates port settings for a fleet.    
        val UpdateFleetPortSettings = _UpdateFleetPortSettings() 
        // see http://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html 
        //  Updates game session properties.    
        val UpdateGameSession = _UpdateGameSession()
    }
      class _CreateAlias : IamPolicy.Action("gamelift:CreateAlias") {

         }       
 
      class _CreateBuild : IamPolicy.Action("gamelift:CreateBuild") {

         }       
 
      class _CreateFleet : IamPolicy.Action("gamelift:CreateFleet") {

         }       
 
      class _CreateGameSession : IamPolicy.Action("gamelift:CreateGameSession") {

         }       
 
      class _CreatePlayerSession : IamPolicy.Action("gamelift:CreatePlayerSession") {

         }       
 
      class _CreatePlayerSessions : IamPolicy.Action("gamelift:CreatePlayerSessions") {

         }       
 
      class _DeleteAlias : IamPolicy.Action("gamelift:DeleteAlias") {

         }       
 
      class _DeleteBuild : IamPolicy.Action("gamelift:DeleteBuild") {

         }       
 
      class _DeleteFleet : IamPolicy.Action("gamelift:DeleteFleet") {

         }       
 
      class _DescribeAlias : IamPolicy.Action("gamelift:DescribeAlias") {

         }       
 
      class _DescribeBuild : IamPolicy.Action("gamelift:DescribeBuild") {

         }       
 
      class _DescribeEC2InstanceLimits : IamPolicy.Action("gamelift:DescribeEC2InstanceLimits") {

         }       
 
      class _DescribeFleetAttributes : IamPolicy.Action("gamelift:DescribeFleetAttributes") {

         }       
 
      class _DescribeFleetCapacity : IamPolicy.Action("gamelift:DescribeFleetCapacity") {

         }       
 
      class _DescribeFleetEvents : IamPolicy.Action("gamelift:DescribeFleetEvents") {

         }       
 
      class _DescribeFleetPortSettings : IamPolicy.Action("gamelift:DescribeFleetPortSettings") {

         }       
 
      class _DescribeFleetUtilization : IamPolicy.Action("gamelift:DescribeFleetUtilization") {

         }       
 
      class _DescribeGameSessions : IamPolicy.Action("gamelift:DescribeGameSessions") {

         }       
 
      class _DescribePlayerSessions : IamPolicy.Action("gamelift:DescribePlayerSessions") {

         }       
 
      class _GetGameSessionLogUrl : IamPolicy.Action("gamelift:GetGameSessionLogUrl") {

         }       
 
      class _ListAliases : IamPolicy.Action("gamelift:ListAliases") {

         }       
 
      class _ListBuilds : IamPolicy.Action("gamelift:ListBuilds") {

         }       
 
      class _ListFleets : IamPolicy.Action("gamelift:ListFleets") {

         }       
 
      class _RequestUploadCredentials : IamPolicy.Action("gamelift:RequestUploadCredentials") {

         }       
 
      class _ResolveAlias : IamPolicy.Action("gamelift:ResolveAlias") {

         }       
 
      class _UpdateAlias : IamPolicy.Action("gamelift:UpdateAlias") {

         }       
 
      class _UpdateBuild : IamPolicy.Action("gamelift:UpdateBuild") {

         }       
 
      class _UpdateFleetAttributes : IamPolicy.Action("gamelift:UpdateFleetAttributes") {

         }       
 
      class _UpdateFleetCapacity : IamPolicy.Action("gamelift:UpdateFleetCapacity") {

         }       
 
      class _UpdateFleetPortSettings : IamPolicy.Action("gamelift:UpdateFleetPortSettings") {

         }       
 
      class _UpdateGameSession : IamPolicy.Action("gamelift:UpdateGameSession") {

         }       


}        
