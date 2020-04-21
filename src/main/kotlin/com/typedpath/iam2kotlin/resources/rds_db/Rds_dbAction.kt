
package com.typedpath.iam2kotlin.resources.rds_db

import com.typedpath.iam2kotlin.IamPolicy

class Rds_dbAction() {

    companion object { 
        val All = IamPolicy.Action("rds_db:*")    
        // see https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.IAMPolicy.html 
        //  Allow an IAM user or role to connect to your DB instance or DB cluster.    
        val connect = _connect()
    }
      class _connect : IamPolicy.Action("rds-db:connect") {
             //arn:aws:rds-db:$region:$account:dbuser:$db-instance-or-cluster-id/$engine-user-name"
            fun byRegionAccountDbinstanceorclusteridEngineusername(region: String, account: String, dbinstanceorclusterid: String, engineusername: String) = IamPolicy.Resource("arn:aws:rds-db:$region:$account:dbuser:$dbinstanceorclusterid/$engineusername")
         }       


}        
