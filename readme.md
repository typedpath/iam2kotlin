# iam2kotlin

 this is a kotlin mapping for AWS IAM  
 The data is taken from  __https://github.com/widdix/complete-aws-iam-reference/tree/master/services__
 which is presented at  __https://iam.cloudonaut.io/__ 
which ultimately derives from 
 __https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html__

### Action Mappings
e.g.  
__LogsAction.CreateLogGroup.id__ => __"logs:CreateLogGroup"__  
__S3Action.All__ => __"s3:*"__

### Resource Mapping
e.g.   
__S3Action.PutObjectTagging.byBucketnameKeyname("mybucket", "*")__ => __"arn:aws:s3:::mybucket/*"__

### IamPolicy model 
```kotlin
    val codeBuildPolicyDocument = IamPolicy {
        statement {
            action ( LogsAction.CreateLogGroup)
            action ( LogsAction.CreateLogStream)
            action ( LogsAction.PutLogEvents)
            effect = IamPolicy.EffectType.Allow
            resource ( IamPolicy.Resource("*"))
        }
        statement {
            action ( CodecommitAction.GitPull)
            effect = IamPolicy.EffectType.Allow
            resource (CodecommitAction.GitPush.byRegionAccountRepositoryname("us-east-1", "987654321", "myrepo")
)
        }
        statement {
            action ( S3Action.PutObject)
            action ( S3Action.GetObject)
            action ( S3Action.GetObjectVersion)
            effect = IamPolicy.EffectType.Allow
            resource (S3Action.PutObject.byBucketnameKeyname("mybucket", "*"))
        }
    }

```
## maven artifact 
```xml
<dependency>
  <groupId>com.typedpath</groupId>
  <artifactId>iam2kotlin</artifactId>
  <version>1.0.0</version>
</dependency>
```

## TODO
Conditions

