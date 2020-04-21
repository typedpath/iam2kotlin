
package com.typedpath.iam2kotlin.resources.lex

import com.typedpath.iam2kotlin.IamPolicy

class LexAction() {

    companion object { 
        val All = IamPolicy.Action("lex:*")    
        // see http://docs.aws.amazon.com/lex/latest/dg/API_CreateBotVersion.html 
        //  Creates a new version of the bot based on the $LATEST version.    
        val CreateBotVersion = _CreateBotVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_CreateIntentVersion.html 
        //  Creates a new version of an intent based on the $LATEST version of the intent.    
        val CreateIntentVersion = _CreateIntentVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_CreateSlotTypeVersion.html 
        //  Creates a new version of a slot type based on the $LATEST version of the specified slot type.    
        val CreateSlotTypeVersion = _CreateSlotTypeVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteBot.html 
        //  Deletes all versions of the bot, including the $LATEST version.    
        val DeleteBot = _DeleteBot() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteBotAlias.html 
        //  Deletes an alias for the specified bot.    
        val DeleteBotAlias = _DeleteBotAlias() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteBotChannelAssociation.html 
        //  Deletes the association between an Amazon Lex bot and a messaging platform.    
        val DeleteBotChannelAssociation = _DeleteBotChannelAssociation() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteBotVersion.html 
        //  Deletes a specific version of a bot.    
        val DeleteBotVersion = _DeleteBotVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteIntent.html 
        //  Deletes all versions of the intent, including the $LATEST version.    
        val DeleteIntent = _DeleteIntent() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteIntentVersion.html 
        //  Deletes a specific version of an intent.    
        val DeleteIntentVersion = _DeleteIntentVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteSlotType.html 
        //  Deletes all versions of the slot type, including the $LATEST version.    
        val DeleteSlotType = _DeleteSlotType() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteSlotTypeVersion.html 
        //  Deletes a specific version of a slot type.    
        val DeleteSlotTypeVersion = _DeleteSlotTypeVersion() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_DeleteUtterances.html 
        //  Deletes stored utterances.    
        val DeleteUtterances = _DeleteUtterances() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBot.html 
        //  Returns metadata information for a specific bot.    
        val GetBot = _GetBot() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBotAlias.html 
        //  Returns information about an Amazon Lex bot alias.    
        val GetBotAlias = _GetBotAlias() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBotAliases.html 
        //  Returns a list of aliases for a specified Amazon Lex bot.    
        val GetBotAliases = _GetBotAliases() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBotChannelAssociation.html 
        //  Returns information about the association between an Amazon Lex bot and a messaging platform.    
        val GetBotChannelAssociation = _GetBotChannelAssociation() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBotChannelAssociations.html 
        //  Returns a list of all of the channels associated with the specified bot.    
        val GetBotChannelAssociations = _GetBotChannelAssociations() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBuiltinIntent.html 
        //  Returns information about a built-in intent.    
        val GetBuiltinIntent = _GetBuiltinIntent() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBuiltinIntents.html 
        //  Gets a list of built-in intents that meet the specified criteria.    
        val GetBuiltinIntents = _GetBuiltinIntents() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBuiltinSlotTypes.html 
        //  Gets a list of built-in slot types that meet the specified criteria.    
        val GetBuiltinSlotTypes = _GetBuiltinSlotTypes() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBots.html 
        //  .    
        val GetBots = _GetBots() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetBotVersions.html 
        //  Gets information about all of the versions of a bot.    
        val GetBotVersions = _GetBotVersions() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetIntent.html 
        //  Returns information about an intent.    
        val GetIntent = _GetIntent() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetIntents.html 
        //  .    
        val GetIntents = _GetIntents() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetIntentVersions.html 
        //  Gets information about all of the versions of an intent.    
        val GetIntentVersions = _GetIntentVersions() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetSlotType.html 
        //  Returns information about a specific version of a slot type.    
        val GetSlotType = _GetSlotType() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetSlotTypes.html 
        //  .    
        val GetSlotTypes = _GetSlotTypes() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetSlotTypeVersions.html 
        //  Gets information about all versions of a slot type.    
        val GetSlotTypeVersions = _GetSlotTypeVersions() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_GetUtterancesView.html 
        //  Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot.    
        val GetUtterancesView = _GetUtterancesView() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PostContent.html 
        //  .    
        val PostContent = _PostContent() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PostText.html 
        //  .    
        val PostText = _PostText() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html 
        //  Creates an Amazon Lex conversational bot or replaces an existing bot.    
        val PutBot = _PutBot() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PutBotAlias.html 
        //  Creates an alias for the specified version of the bot or replaces an alias for the specified bot.    
        val PutBotAlias = _PutBotAlias() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PutIntent.html 
        //  Creates an intent or replaces an existing intent.    
        val PutIntent = _PutIntent() 
        // see http://docs.aws.amazon.com/lex/latest/dg/API_PutSlotType.html 
        //  Creates a custom slot type or replaces an existing custom slot type.    
        val PutSlotType = _PutSlotType()
    }
      class _CreateBotVersion : IamPolicy.Action("lex:CreateBotVersion") {

         }       
 
      class _CreateIntentVersion : IamPolicy.Action("lex:CreateIntentVersion") {

         }       
 
      class _CreateSlotTypeVersion : IamPolicy.Action("lex:CreateSlotTypeVersion") {

         }       
 
      class _DeleteBot : IamPolicy.Action("lex:DeleteBot") {

         }       
 
      class _DeleteBotAlias : IamPolicy.Action("lex:DeleteBotAlias") {

         }       
 
      class _DeleteBotChannelAssociation : IamPolicy.Action("lex:DeleteBotChannelAssociation") {

         }       
 
      class _DeleteBotVersion : IamPolicy.Action("lex:DeleteBotVersion") {

         }       
 
      class _DeleteIntent : IamPolicy.Action("lex:DeleteIntent") {

         }       
 
      class _DeleteIntentVersion : IamPolicy.Action("lex:DeleteIntentVersion") {

         }       
 
      class _DeleteSlotType : IamPolicy.Action("lex:DeleteSlotType") {

         }       
 
      class _DeleteSlotTypeVersion : IamPolicy.Action("lex:DeleteSlotTypeVersion") {

         }       
 
      class _DeleteUtterances : IamPolicy.Action("lex:DeleteUtterances") {

         }       
 
      class _GetBot : IamPolicy.Action("lex:GetBot") {

         }       
 
      class _GetBotAlias : IamPolicy.Action("lex:GetBotAlias") {

         }       
 
      class _GetBotAliases : IamPolicy.Action("lex:GetBotAliases") {

         }       
 
      class _GetBotChannelAssociation : IamPolicy.Action("lex:GetBotChannelAssociation") {

         }       
 
      class _GetBotChannelAssociations : IamPolicy.Action("lex:GetBotChannelAssociations") {

         }       
 
      class _GetBuiltinIntent : IamPolicy.Action("lex:GetBuiltinIntent") {

         }       
 
      class _GetBuiltinIntents : IamPolicy.Action("lex:GetBuiltinIntents") {

         }       
 
      class _GetBuiltinSlotTypes : IamPolicy.Action("lex:GetBuiltinSlotTypes") {

         }       
 
      class _GetBots : IamPolicy.Action("lex:GetBots") {

         }       
 
      class _GetBotVersions : IamPolicy.Action("lex:GetBotVersions") {

         }       
 
      class _GetIntent : IamPolicy.Action("lex:GetIntent") {

         }       
 
      class _GetIntents : IamPolicy.Action("lex:GetIntents") {

         }       
 
      class _GetIntentVersions : IamPolicy.Action("lex:GetIntentVersions") {

         }       
 
      class _GetSlotType : IamPolicy.Action("lex:GetSlotType") {

         }       
 
      class _GetSlotTypes : IamPolicy.Action("lex:GetSlotTypes") {

         }       
 
      class _GetSlotTypeVersions : IamPolicy.Action("lex:GetSlotTypeVersions") {

         }       
 
      class _GetUtterancesView : IamPolicy.Action("lex:GetUtterancesView") {

         }       
 
      class _PostContent : IamPolicy.Action("lex:PostContent") {

         }       
 
      class _PostText : IamPolicy.Action("lex:PostText") {

         }       
 
      class _PutBot : IamPolicy.Action("lex:PutBot") {

         }       
 
      class _PutBotAlias : IamPolicy.Action("lex:PutBotAlias") {

         }       
 
      class _PutIntent : IamPolicy.Action("lex:PutIntent") {

         }       
 
      class _PutSlotType : IamPolicy.Action("lex:PutSlotType") {

         }       


}        
