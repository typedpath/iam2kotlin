package com.typedpath.iam2kotlin.sample.s3

import com.typedpath.iam2kotlin.IamPolicy

class S3Action() {

    companion object {
        val ListBucket = _ListBucket()
        val GetBucketLocation = _GetBucketLocation()
        val GetLifecycleConfiguration = _GetLifecycleConfiguration()
        val PutLifecycleConfiguration = _PutLifecycleConfiguration()
    }

    class _ListBucket : IamPolicy.Action("s3:ListBucket") {
        fun byBucketNameByKeyName(bucketName: String, keyName: String) =
            IamPolicy.Resource("arn:aws:s3:::$bucketName/$keyName")

        fun byBucketName(bucketName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName")
    }

    class _GetBucketLocation : IamPolicy.Action("s3:GetBucketLocation") {
        fun byBucketNameByKeyName(bucketName: String, keyName: String) =  IamPolicy.Resource("arn:aws:s3:::$bucketName/$keyName")

        fun byBucketName(bucketName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName")
    }

    class _GetLifecycleConfiguration : IamPolicy.Action("s3:GetLifecycleConfiguration") {
        fun byBucketNameByKeyName(bucketName: String, keyName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName/$keyName")
        fun byBucketName(bucketName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName")
    }

    class _PutLifecycleConfiguration : IamPolicy.Action("s3:PutLifecycleConfiguration") {
        fun byBucketNameByKeyName(bucketName: String, keyName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName/$keyName")
        fun byBucketName(bucketName: String) = IamPolicy.Resource("arn:aws:s3:::$bucketName")
    }

}


