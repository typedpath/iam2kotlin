
package com.typedpath.iam2kotlin.resources.s3

import com.typedpath.iam2kotlin.IamPolicy

class S3Action() {

    companion object { 
        val All = IamPolicy.Action("s3:*")    
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/mpUploadAbort.html 
        //  This operation aborts a multipart upload.    
        val AbortMultipartUpload = _AbortMultipartUpload() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html 
        //  ???    
        val BypassGovernanceRetention = _BypassGovernanceRetention() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUT.html 
        //  This implementation of the PUT operation creates a new bucket.    
        val CreateBucket = _CreateBucket() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketDELETE.html 
        //  This implementation of the DELETE operation deletes the bucket named in the URI.    
        val DeleteBucket = _DeleteBucket() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketDELETEpolicy.html 
        //  This implementation of the DELETE operation uses the policy subresource to delete the policy on a specified bucket.    
        val DeleteBucketPolicy = _DeleteBucketPolicy() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketDELETEwebsite.html 
        //  This operation removes the website configuration for a bucket.    
        val DeleteBucketWebsite = _DeleteBucketWebsite() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectDELETE.html 
        //  The DELETE operation removes the null version (if there is one) of an object and inserts a delete marker, which becomes the current version of the object.    
        val DeleteObject = _DeleteObject() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectDELETE.html 
        //  The DELETE operation removes the null version (if there is one) of an object and inserts a delete marker, which becomes the current version of the object.    
        val DeleteObjectVersion = _DeleteObjectVersion() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETaccelerate.html 
        //  This implementation of the GET operation uses the accelerate subresource to return the Transfer Acceleration state of a bucket, which is either Enabled or Suspended.    
        val GetAccelerateConfiguration = _GetAccelerateConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETacl.html 
        //  This implementation of the GET operation uses the acl subresource to return the access control list (ACL) of a bucket.    
        val GetBucketAcl = _GetBucketAcl() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETcors.html 
        //  Returns the cors configuration information set for the bucket.    
        val GetBucketCORS = _GetBucketCORS() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlocation.html 
        //  This implementation of the GET operation uses the location subresource to return a bucket's region.    
        val GetBucketLocation = _GetBucketLocation() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlogging.html 
        //  This implementation of the GET operation uses the logging subresource to return the logging status of a bucket and the permissions users have to view and modify that status.    
        val GetBucketLogging = _GetBucketLogging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETnotification.html 
        //  This implementation of the GET operation uses the notification subresource to return the notification configuration of a bucket.    
        val GetBucketNotification = _GetBucketNotification() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETObjectLockConfiguration.html 
        //  TGets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.    
        val GetBucketObjectLockConfiguration = _GetBucketObjectLockConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETpolicy.html 
        //  This implementation of the GET operation uses the policy subresource to return the policy of a specified bucket.    
        val GetBucketPolicy = _GetBucketPolicy() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTrequestPaymentGET.html 
        //  This implementation of the GET operation uses the requestPayment subresource to return the request payment configuration of a bucket.    
        val GetBucketRequestPayment = _GetBucketRequestPayment() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETtagging.html 
        //  This implementation of the GET operation uses the tagging subresource to return the tag set associated with the bucket.    
        val GetBucketTagging = _GetBucketTagging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETversioningStatus.html 
        //  This implementation of the GET operation uses the versioning subresource to return the versioning state of a bucket.    
        val GetBucketVersioning = _GetBucketVersioning() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETwebsite.html 
        //  This implementation of the GET operation returns the website configuration associated with a bucket.    
        val GetBucketWebsite = _GetBucketWebsite() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETencryption.html 
        //  Returns the default encryption state of an existing bucket.    
        val GetEncryptionConfiguration = _GetEncryptionConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETlifecycle.html 
        //  Returns the lifecycle configuration information set on the bucket.    
        val GetLifecycleConfiguration = _GetLifecycleConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html 
        //  This implementation of the GET operation retrieves objects from Amazon S3.    
        val GetObject = _GetObject() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETacl.html 
        //  This implementation of the GET operation uses the acl subresource to return the access control list (ACL) of an object.    
        val GetObjectAcl = _GetObjectAcl() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETLegalHold.html 
        //  Gets an object's current Legal Hold status.    
        val GetObjectLegalHold = _GetObjectLegalHold() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETRetention.html 
        //  Retrieves an object's retention settings.    
        val GetObjectRetention = _GetObjectRetention() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETtagging.html 
        //  This implementation of the GET operation returns the tags associated with an object.    
        val GetObjectTagging = _GetObjectTagging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETtorrent.html 
        //  This implementation of the GET operation uses the torrent subresource to return torrent files from a bucket.    
        val GetObjectTorrent = _GetObjectTorrent() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html 
        //  This implementation of the GET operation retrieves objects from Amazon S3.    
        val GetObjectVersion = _GetObjectVersion() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/objectGetAclVersions.html 
        //  By default, GET returns ACL information about the current version of an object.    
        val GetObjectVersionAcl = _GetObjectVersionAcl() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGETtorrent.html 
        //  This implementation of the GET operation uses the torrent subresource to return torrent files from a bucket.    
        val GetObjectVersionTorrent = _GetObjectVersionTorrent() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_s3.html 
        //  ???    
        val GetReplicationConfiguration = _GetReplicationConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTServiceGET.html 
        //  This implementation of the GET operation returns a list of all buckets owned by the authenticated sender of the request.    
        val ListAllMyBuckets = _ListAllMyBuckets() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGET.html 
        //  This API has been revised. We recommend that you use the newer version, GET Bucket (List Objects) version 2, when developing applications.    
        val ListBucket = _ListBucket() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/mpUploadListMPUpload.html 
        //  This operation lists in-progress multipart uploads.    
        val ListBucketMultipartUploads = _ListBucketMultipartUploads() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETVersion.html 
        //  You can use the versions subresource to list metadata about all of the versions of objects in a bucket.    
        val ListBucketVersions = _ListBucketVersions() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/mpUploadListParts.html 
        //  This operation lists the parts that have been uploaded for a specific multipart upload.    
        val ListMultipartUploadParts = _ListMultipartUploadParts() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTaccelerate.html 
        //  This implementation of the PUT operation uses the accelerate subresource to set the Transfer Acceleration state of an existing bucket.    
        val PutAccelerateConfiguration = _PutAccelerateConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTacl.html 
        //  This implementation of the PUT operation uses the acl subresource to set the permissions on an existing bucket using access control lists (ACL).    
        val PutBucketAcl = _PutBucketAcl() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTcors.html 
        //  Sets the cors configuration for your bucket.    
        val PutBucketCORS = _PutBucketCORS() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html 
        //  This implementation of the PUT operation uses the logging subresource to set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters.    
        val PutBucketLogging = _PutBucketLogging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTnotification.html 
        //  The Amazon S3 notification feature enables you to receive notifications when certain events happen in your bucket.    
        val PutBucketNotification = _PutBucketNotification() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTObjectLockConfiguration.html 
        //  Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.    
        val PutBucketObjectLockConfiguration = _PutBucketObjectLockConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTpolicy.html 
        //  This implementation of the PUT operation uses the policy subresource to add to or replace a policy on a bucket.    
        val PutBucketPolicy = _PutBucketPolicy() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTrequestPaymentPUT.html 
        //  This implementation of the PUT operation uses the requestPayment subresource to set the request payment configuration of a bucket.    
        val PutBucketRequestPayment = _PutBucketRequestPayment() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTtagging.html 
        //  This implementation of the PUT operation uses the tagging subresource to add a set of tags to an existing bucket.    
        val PutBucketTagging = _PutBucketTagging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTVersioningStatus.html 
        //  This implementation of the PUT operation uses the versioning subresource to set the versioning state of an existing bucket.    
        val PutBucketVersioning = _PutBucketVersioning() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTwebsite.html 
        //  Sets the configuration of the website that is specified in the website subresource.    
        val PutBucketWebsite = _PutBucketWebsite() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html 
        //  Sets/Deletes the default encryption state of an existing bucket.    
        val PutEncryptionConfiguration = _PutEncryptionConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlifecycle.html 
        //  Creates a new lifecycle configuration for the bucket or replaces an existing lifecycle configuration.    
        val PutLifecycleConfiguration = _PutLifecycleConfiguration() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUT.html 
        //  This implementation of the PUT operation adds an object to a bucket.    
        val PutObject = _PutObject() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html 
        //  This implementation of the PUT operation uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket.    
        val PutObjectAcl = _PutObjectAcl() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTLegalHold.html 
        //  Applies a Legal Hold configuration to the specified object.    
        val PutObjectLegalHold = _PutObjectLegalHold() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTRetention.html 
        //  Places an Object Retention configuration on an object.    
        val PutObjectRetention = _PutObjectRetention() 
        // see https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html 
        //  This implementation of the PUT operation uses the tagging subresource to add a set of tags to an existing object.    
        val PutObjectTagging = _PutObjectTagging() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html#objectPutAclVersions 
        //  This implementation of the PUT operation uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket.    
        val PutObjectVersionAcl = _PutObjectVersionAcl() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_s3.html 
        //  ???    
        val PutReplicationConfiguration = _PutReplicationConfiguration() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_s3.html 
        //  ???    
        val ReplicateDelete = _ReplicateDelete() 
        // see https://docs.aws.amazon.com/IAM/latest/UserGuide/list_s3.html 
        //  ???    
        val ReplicateObject = _ReplicateObject() 
        // see http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html 
        //  Restores a temporary copy of an archived object.    
        val RestoreObject = _RestoreObject()
    }
      class _AbortMultipartUpload : IamPolicy.Action("s3:AbortMultipartUpload") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _BypassGovernanceRetention : IamPolicy.Action("s3:BypassGovernanceRetention") {

         }       
 
      class _CreateBucket : IamPolicy.Action("s3:CreateBucket") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _DeleteBucket : IamPolicy.Action("s3:DeleteBucket") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _DeleteBucketPolicy : IamPolicy.Action("s3:DeleteBucketPolicy") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _DeleteBucketWebsite : IamPolicy.Action("s3:DeleteBucketWebsite") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _DeleteObject : IamPolicy.Action("s3:DeleteObject") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _DeleteObjectVersion : IamPolicy.Action("s3:DeleteObjectVersion") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetAccelerateConfiguration : IamPolicy.Action("s3:GetAccelerateConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketAcl : IamPolicy.Action("s3:GetBucketAcl") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketCORS : IamPolicy.Action("s3:GetBucketCORS") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketLocation : IamPolicy.Action("s3:GetBucketLocation") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketLogging : IamPolicy.Action("s3:GetBucketLogging") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketNotification : IamPolicy.Action("s3:GetBucketNotification") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketObjectLockConfiguration : IamPolicy.Action("s3:GetBucketObjectLockConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketPolicy : IamPolicy.Action("s3:GetBucketPolicy") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketRequestPayment : IamPolicy.Action("s3:GetBucketRequestPayment") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketTagging : IamPolicy.Action("s3:GetBucketTagging") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketVersioning : IamPolicy.Action("s3:GetBucketVersioning") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetBucketWebsite : IamPolicy.Action("s3:GetBucketWebsite") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetEncryptionConfiguration : IamPolicy.Action("s3:GetEncryptionConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetLifecycleConfiguration : IamPolicy.Action("s3:GetLifecycleConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _GetObject : IamPolicy.Action("s3:GetObject") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectAcl : IamPolicy.Action("s3:GetObjectAcl") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectLegalHold : IamPolicy.Action("s3:GetObjectLegalHold") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectRetention : IamPolicy.Action("s3:GetObjectRetention") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectTagging : IamPolicy.Action("s3:GetObjectTagging") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectTorrent : IamPolicy.Action("s3:GetObjectTorrent") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectVersion : IamPolicy.Action("s3:GetObjectVersion") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectVersionAcl : IamPolicy.Action("s3:GetObjectVersionAcl") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetObjectVersionTorrent : IamPolicy.Action("s3:GetObjectVersionTorrent") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _GetReplicationConfiguration : IamPolicy.Action("s3:GetReplicationConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _ListAllMyBuckets : IamPolicy.Action("s3:ListAllMyBuckets") {

         }       
 
      class _ListBucket : IamPolicy.Action("s3:ListBucket") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _ListBucketMultipartUploads : IamPolicy.Action("s3:ListBucketMultipartUploads") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _ListBucketVersions : IamPolicy.Action("s3:ListBucketVersions") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _ListMultipartUploadParts : IamPolicy.Action("s3:ListMultipartUploadParts") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutAccelerateConfiguration : IamPolicy.Action("s3:PutAccelerateConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketAcl : IamPolicy.Action("s3:PutBucketAcl") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketCORS : IamPolicy.Action("s3:PutBucketCORS") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketLogging : IamPolicy.Action("s3:PutBucketLogging") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketNotification : IamPolicy.Action("s3:PutBucketNotification") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketObjectLockConfiguration : IamPolicy.Action("s3:PutBucketObjectLockConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketPolicy : IamPolicy.Action("s3:PutBucketPolicy") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketRequestPayment : IamPolicy.Action("s3:PutBucketRequestPayment") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketTagging : IamPolicy.Action("s3:PutBucketTagging") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketVersioning : IamPolicy.Action("s3:PutBucketVersioning") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutBucketWebsite : IamPolicy.Action("s3:PutBucketWebsite") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutEncryptionConfiguration : IamPolicy.Action("s3:PutEncryptionConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutLifecycleConfiguration : IamPolicy.Action("s3:PutLifecycleConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _PutObject : IamPolicy.Action("s3:PutObject") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutObjectAcl : IamPolicy.Action("s3:PutObjectAcl") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutObjectLegalHold : IamPolicy.Action("s3:PutObjectLegalHold") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutObjectRetention : IamPolicy.Action("s3:PutObjectRetention") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutObjectTagging : IamPolicy.Action("s3:PutObjectTagging") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutObjectVersionAcl : IamPolicy.Action("s3:PutObjectVersionAcl") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _PutReplicationConfiguration : IamPolicy.Action("s3:PutReplicationConfiguration") {
             //arn:aws:s3:::$bucket-name"
            fun byBucketname(bucketname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname")
         }       
 
      class _ReplicateDelete : IamPolicy.Action("s3:ReplicateDelete") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _ReplicateObject : IamPolicy.Action("s3:ReplicateObject") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       
 
      class _RestoreObject : IamPolicy.Action("s3:RestoreObject") {
             //arn:aws:s3:::$bucket-name/$key-name"
            fun byBucketnameKeyname(bucketname: String, keyname: String) = IamPolicy.Resource("arn:aws:s3:::$bucketname/$keyname")
         }       


}        
