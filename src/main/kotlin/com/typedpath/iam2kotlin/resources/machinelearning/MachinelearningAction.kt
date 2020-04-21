
package com.typedpath.iam2kotlin.resources.machinelearning

import com.typedpath.iam2kotlin.IamPolicy

class MachinelearningAction() {

    companion object { 
        val All = IamPolicy.Action("machinelearning:*")    
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateBatchPrediction.html 
        //  Generates predictions for a group of observations.    
        val CreateBatchPrediction = _CreateBatchPrediction() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateDataSourceFromRDS.html 
        //  Creates a DataSource object from an Amazon Relational Database Service (Amazon RDS).    
        val CreateDataSourceFromRDS = _CreateDataSourceFromRDS() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateDataSourceFromRedshift.html 
        //  Creates a DataSource from a database hosted on an Amazon Redshift cluster.    
        val CreateDataSourceFromRedshift = _CreateDataSourceFromRedshift() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateDataSourceFromS3.html 
        //  Creates a DataSource object.    
        val CreateDataSourceFromS3 = _CreateDataSourceFromS3() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateEvaluation.html 
        //  Creates a new Evaluation of an MLModel.    
        val CreateEvaluation = _CreateEvaluation() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateMLModel.html 
        //  Creates a new MLModel using the DataSource and the recipe as information sources.    
        val CreateMLModel = _CreateMLModel() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_CreateRealtimeEndpoint.html 
        //  Creates a real-time endpoint for the MLModel.    
        val CreateRealtimeEndpoint = _CreateRealtimeEndpoint() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DeleteBatchPrediction.html 
        //  Assigns the DELETED status to a BatchPrediction, rendering it unusable.    
        val DeleteBatchPrediction = _DeleteBatchPrediction() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DeleteDataSource.html 
        //  Assigns the DELETED status to a DataSource, rendering it unusable.    
        val DeleteDataSource = _DeleteDataSource() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DeleteEvaluation.html 
        //  Assigns the DELETED status to an Evaluation, rendering it unusable.    
        val DeleteEvaluation = _DeleteEvaluation() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DeleteMLModel.html 
        //  Assigns the DELETED status to an MLModel, rendering it unusable.    
        val DeleteMLModel = _DeleteMLModel() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DeleteRealtimeEndpoint.html 
        //  Deletes a real time endpoint of an MLModel.    
        val DeleteRealtimeEndpoint = _DeleteRealtimeEndpoint() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DescribeBatchPredictions.html 
        //  Returns a list of BatchPrediction operations that match the search criteria in the request.    
        val DescribeBatchPredictions = _DescribeBatchPredictions() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DescribeDataSources.html 
        //  Returns a list of DataSource that match the search criteria in the request.    
        val DescribeDataSources = _DescribeDataSources() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DescribeEvaluations.html 
        //  Returns a list of DescribeEvaluations that match the search criteria in the request.    
        val DescribeEvaluations = _DescribeEvaluations() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_DescribeMLModels.html 
        //  Returns a list of MLModel that match the search criteria in the request.    
        val DescribeMLModels = _DescribeMLModels() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_GetBatchPrediction.html 
        //  Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.    
        val GetBatchPrediction = _GetBatchPrediction() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_GetDataSource.html 
        //  Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource.    
        val GetDataSource = _GetDataSource() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_GetEvaluation.html 
        //  Returns an Evaluation that includes metadata as well as the current status of the Evaluation.    
        val GetEvaluation = _GetEvaluation() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_GetMLModel.html 
        //  Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel.    
        val GetMLModel = _GetMLModel() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_Predict.html 
        //  Generates a prediction for the observation using the specified ML Model.    
        val Predict = _Predict() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_UpdateBatchPrediction.html 
        //  Updates the BatchPredictionName of a BatchPrediction.    
        val UpdateBatchPrediction = _UpdateBatchPrediction() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_UpdateDataSource.html 
        //  Updates the DataSourceName of a DataSource.    
        val UpdateDataSource = _UpdateDataSource() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_UpdateEvaluation.html 
        //  Updates the EvaluationName of an Evaluation.    
        val UpdateEvaluation = _UpdateEvaluation() 
        // see http://docs.aws.amazon.com/machine-learning/latest/APIReference/API_UpdateMLModel.html 
        //  Updates the MLModelName and the ScoreThreshold of an MLModel.    
        val UpdateMLModel = _UpdateMLModel()
    }
      class _CreateBatchPrediction : IamPolicy.Action("machinelearning:CreateBatchPrediction") {

         }       
 
      class _CreateDataSourceFromRDS : IamPolicy.Action("machinelearning:CreateDataSourceFromRDS") {

         }       
 
      class _CreateDataSourceFromRedshift : IamPolicy.Action("machinelearning:CreateDataSourceFromRedshift") {

         }       
 
      class _CreateDataSourceFromS3 : IamPolicy.Action("machinelearning:CreateDataSourceFromS3") {

         }       
 
      class _CreateEvaluation : IamPolicy.Action("machinelearning:CreateEvaluation") {

         }       
 
      class _CreateMLModel : IamPolicy.Action("machinelearning:CreateMLModel") {

         }       
 
      class _CreateRealtimeEndpoint : IamPolicy.Action("machinelearning:CreateRealtimeEndpoint") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       
 
      class _DeleteBatchPrediction : IamPolicy.Action("machinelearning:DeleteBatchPrediction") {
             //arn:aws:machinelearning:$region:$account:batchprediction/$batchprediction-id"
            fun batchprediction_byRegionAccountBatchpredictionid(region: String, account: String, batchpredictionid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:batchprediction/$batchpredictionid")
         }       
 
      class _DeleteDataSource : IamPolicy.Action("machinelearning:DeleteDataSource") {
             //arn:aws:machinelearning:$region:$account:datasource/$datasource-id"
            fun datasource_byRegionAccountDatasourceid(region: String, account: String, datasourceid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:datasource/$datasourceid")
         }       
 
      class _DeleteEvaluation : IamPolicy.Action("machinelearning:DeleteEvaluation") {
             //arn:aws:machinelearning:$region:$account:evaluation/$evaluation-id"
            fun evaluation_byRegionAccountEvaluationid(region: String, account: String, evaluationid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:evaluation/$evaluationid")
         }       
 
      class _DeleteMLModel : IamPolicy.Action("machinelearning:DeleteMLModel") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       
 
      class _DeleteRealtimeEndpoint : IamPolicy.Action("machinelearning:DeleteRealtimeEndpoint") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       
 
      class _DescribeBatchPredictions : IamPolicy.Action("machinelearning:DescribeBatchPredictions") {

         }       
 
      class _DescribeDataSources : IamPolicy.Action("machinelearning:DescribeDataSources") {

         }       
 
      class _DescribeEvaluations : IamPolicy.Action("machinelearning:DescribeEvaluations") {

         }       
 
      class _DescribeMLModels : IamPolicy.Action("machinelearning:DescribeMLModels") {

         }       
 
      class _GetBatchPrediction : IamPolicy.Action("machinelearning:GetBatchPrediction") {
             //arn:aws:machinelearning:$region:$account:batchprediction/$batchprediction-id"
            fun batchprediction_byRegionAccountBatchpredictionid(region: String, account: String, batchpredictionid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:batchprediction/$batchpredictionid")
         }       
 
      class _GetDataSource : IamPolicy.Action("machinelearning:GetDataSource") {
             //arn:aws:machinelearning:$region:$account:datasource/$datasource-id"
            fun datasource_byRegionAccountDatasourceid(region: String, account: String, datasourceid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:datasource/$datasourceid")
         }       
 
      class _GetEvaluation : IamPolicy.Action("machinelearning:GetEvaluation") {
             //arn:aws:machinelearning:$region:$account:evaluation/$evaluation-id"
            fun evaluation_byRegionAccountEvaluationid(region: String, account: String, evaluationid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:evaluation/$evaluationid")
         }       
 
      class _GetMLModel : IamPolicy.Action("machinelearning:GetMLModel") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       
 
      class _Predict : IamPolicy.Action("machinelearning:Predict") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       
 
      class _UpdateBatchPrediction : IamPolicy.Action("machinelearning:UpdateBatchPrediction") {
             //arn:aws:machinelearning:$region:$account:batchprediction/$batchprediction-id"
            fun batchprediction_byRegionAccountBatchpredictionid(region: String, account: String, batchpredictionid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:batchprediction/$batchpredictionid")
         }       
 
      class _UpdateDataSource : IamPolicy.Action("machinelearning:UpdateDataSource") {
             //arn:aws:machinelearning:$region:$account:datasource/$datasource-id"
            fun datasource_byRegionAccountDatasourceid(region: String, account: String, datasourceid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:datasource/$datasourceid")
         }       
 
      class _UpdateEvaluation : IamPolicy.Action("machinelearning:UpdateEvaluation") {
             //arn:aws:machinelearning:$region:$account:evaluation/$evaluation-id"
            fun evaluation_byRegionAccountEvaluationid(region: String, account: String, evaluationid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:evaluation/$evaluationid")
         }       
 
      class _UpdateMLModel : IamPolicy.Action("machinelearning:UpdateMLModel") {
             //arn:aws:machinelearning:$region:$account:mlmodel/$mlmodel-id"
            fun mlmodel_byRegionAccountMlmodelid(region: String, account: String, mlmodelid: String) = IamPolicy.Resource("arn:aws:machinelearning:$region:$account:mlmodel/$mlmodelid")
         }       


}        
