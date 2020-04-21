package com.typedpath.iam2kotlin.apisample.s3

import com.typedpath.iam2kotlin.IamPolicy

/*fun s3StatementEntry(actions: List<S3Action>,
                     effectIn: IamPolicy.EffectType=IamPolicy.EffectType.Allow,
                     resourcesIn: List<String>) : IamPolicy.StatementEntry =
    IamPolicy.StatementEntry().apply {
        action = actions.map{it.name}
        effect = effectIn
        resource = resourcesIn
    }
*/

fun sample() = IamPolicy  {

        statement {
            effect = IamPolicy.EffectType.Allow
           /* action += S3Action.ListBucket
            action += S3Action.GetBucketLocation
            action += S3Action.GetLifecycleConfiguration
            action += S3Action.PutLifecycleConfiguration
            //resource += S3Action.GetLifecycleConfiguration.byBucketNameByKeyName( "aBucketName", "subdir")
            resource += S3Action.ListBucket.byBucketname ("sadasda")
        */}
    }


fun main(args: Array<String>) {
   val s = sample()
    println(s)
}


