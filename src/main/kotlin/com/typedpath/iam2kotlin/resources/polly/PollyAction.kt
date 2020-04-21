
package com.typedpath.iam2kotlin.resources.polly

import com.typedpath.iam2kotlin.IamPolicy

class PollyAction() {

    companion object { 
        val All = IamPolicy.Action("polly:*")    
        // see https://docs.aws.amazon.com/polly/latest/dg/API_DeleteLexicon.html 
        //  Deletes the specified pronunciation lexicon stored in an AWS Region.    
        val DeleteLexicon = _DeleteLexicon() 
        // see https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html 
        //  Returns the list of voices that are available for use when requesting speech synthesis.    
        val DescribeVoices = _DescribeVoices() 
        // see https://docs.aws.amazon.com/polly/latest/dg/API_GetLexicon.html 
        //  Returns the content of the specified pronunciation lexicon stored in an AWS Region.    
        val GetLexicon = _GetLexicon() 
        // see https://docs.aws.amazon.com/polly/latest/dg/API_ListLexicons.html 
        //  Returns a list of pronunciation lexicons stored in an AWS Region.    
        val ListLexicons = _ListLexicons() 
        // see https://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html 
        //  Stores a pronunciation lexicon in an AWS Region.    
        val PutLexicon = _PutLexicon() 
        // see https://docs.aws.amazon.com/polly/latest/dg/API_SynthesizeSpeech.html 
        //  Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes.    
        val SynthesizeSpeech = _SynthesizeSpeech()
    }
      class _DeleteLexicon : IamPolicy.Action("polly:DeleteLexicon") {
             //arn:aws:polly:$region:$account:lexicon/$lexicon-name"
            fun lexicon_byRegionAccountLexiconname(region: String, account: String, lexiconname: String) = IamPolicy.Resource("arn:aws:polly:$region:$account:lexicon/$lexiconname")
         }       
 
      class _DescribeVoices : IamPolicy.Action("polly:DescribeVoices") {

         }       
 
      class _GetLexicon : IamPolicy.Action("polly:GetLexicon") {
             //arn:aws:polly:$region:$account:lexicon/$lexicon-name"
            fun lexicon_byRegionAccountLexiconname(region: String, account: String, lexiconname: String) = IamPolicy.Resource("arn:aws:polly:$region:$account:lexicon/$lexiconname")
         }       
 
      class _ListLexicons : IamPolicy.Action("polly:ListLexicons") {

         }       
 
      class _PutLexicon : IamPolicy.Action("polly:PutLexicon") {

         }       
 
      class _SynthesizeSpeech : IamPolicy.Action("polly:SynthesizeSpeech") {

         }       


}        
