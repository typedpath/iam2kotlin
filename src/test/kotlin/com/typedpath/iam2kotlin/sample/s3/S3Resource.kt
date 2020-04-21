package com.typedpath.iam2kotlin.sample.s3

class S3Resource {
    companion object {
        fun byBucketNameByKeyName(bucketName: String, keyName: String) = "arn:aws:s3:::$bucketName/$keyName"
        fun byBucketName(bucketName: String) = "arn:aws:s3:::$bucketName"
    }
}