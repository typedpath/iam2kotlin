
package com.typedpath.iam2kotlin.resources.rekognition

import com.typedpath.iam2kotlin.IamPolicy

class RekognitionAction() {

    companion object { 
        val All = IamPolicy.Action("rekognition:*")    
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_CompareFaces.html 
        //  Compares a face in the source input image with each face detected in the target input image.    
        val CompareFaces = _CompareFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_CreateCollection.html 
        //  Creates a collection in an AWS Region.    
        val CreateCollection = _CreateCollection() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_DeleteCollection.html 
        //  Deletes the specified collection.    
        val DeleteCollection = _DeleteCollection() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_DeleteFaces.html 
        //  Deletes faces from a collection.    
        val DeleteFaces = _DeleteFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_DetectFaces.html 
        //  Detects faces within an image (JPEG or PNG) that is provided as input.    
        val DetectFaces = _DetectFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_DetectLabels.html 
        //  Detects instances of real-world labels within an image (JPEG or PNG) provided as input.    
        val DetectLabels = _DetectLabels() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_IndexFaces.html 
        //  Detects faces in the input image and adds them to the specified collection.    
        val IndexFaces = _IndexFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_ListCollections.html 
        //  Returns list of collection IDs in your account.    
        val ListCollections = _ListCollections() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_ListFaces.html 
        //  Returns metadata for faces in the specified collection.    
        val ListFaces = _ListFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_SearchFaces.html 
        //  For a given input face ID, searches for matching faces in the collection the face belongs to.    
        val SearchFaces = _SearchFaces() 
        // see http://docs.aws.amazon.com/rekognition/latest/dg/API_SearchFacesByImage.html 
        //  For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces.    
        val SearchFacesByImage = _SearchFacesByImage()
    }
      class _CompareFaces : IamPolicy.Action("rekognition:CompareFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _CreateCollection : IamPolicy.Action("rekognition:CreateCollection") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _DeleteCollection : IamPolicy.Action("rekognition:DeleteCollection") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _DeleteFaces : IamPolicy.Action("rekognition:DeleteFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _DetectFaces : IamPolicy.Action("rekognition:DetectFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _DetectLabels : IamPolicy.Action("rekognition:DetectLabels") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _IndexFaces : IamPolicy.Action("rekognition:IndexFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _ListCollections : IamPolicy.Action("rekognition:ListCollections") {

         }       
 
      class _ListFaces : IamPolicy.Action("rekognition:ListFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _SearchFaces : IamPolicy.Action("rekognition:SearchFaces") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       
 
      class _SearchFacesByImage : IamPolicy.Action("rekognition:SearchFacesByImage") {
             //arn:aws:rekognition:$region:$account:collection/$collection-id"
            fun collection_byRegionAccountCollectionid(region: String, account: String, collectionid: String) = IamPolicy.Resource("arn:aws:rekognition:$region:$account:collection/$collectionid")
         }       


}        
