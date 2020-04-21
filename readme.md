# iam2kotlin

 this is a kotlin mapping for 
 The data is taken from  __https://github.com/widdix/complete-aws-iam-reference/tree/master/services__
 which is presented at  __https://iam.cloudonaut.io/__ 
which ultimately derives from 
 __https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html__

### Action Mappings
e.g.  
__LogsAction.CreateLogGroup.id__ => __logs:CreateLogGroup__  
__S3Action.All__ => __s3:*__

### Resource Mapping
e.g.   
__S3Action.PutObjectTagging.byBucketnameKeyname("mybucket", "*")__ => __arn:aws:s3:::mybucket/*__

### IamPolicy model 
```kotlin
    val codeBuildPolicyDocument = IamPolicy {
        statement {
            //TODO make these constants
            action ( LogsAction.CreateLogGroup)
            action ( LogsAction.CreateLogStream)
            action ( LogsAction.PutLogEvents)
            effect = IamPolicy.EffectType.Allow
            resource ( IamPolicy.Resource("*"))
        }
        statement {
            action ( CodecommitAction.GitPull)
            effect = IamPolicy.EffectType.Allow
            resource ( IamPolicy.Resource(join(":", listOf("arn", "aws", "codecommit", refCurrentRegion(), refCurrentAccountId(), defaultReponame))))
        }
        statement {
            action ( S3Action.PutObject)
            action ( S3Action.GetObject)
            action ( S3Action.GetObjectVersion)
            effect = IamPolicy.EffectType.Allow
            resource ( IamPolicy.Resource(join("", listOf("arn:aws:s3:::", ref(artifactsBucket), "/*"))))
        }
    }

```


## TODO
Conditons

