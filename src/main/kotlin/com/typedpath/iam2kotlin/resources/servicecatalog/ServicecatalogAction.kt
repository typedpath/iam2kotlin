
package com.typedpath.iam2kotlin.resources.servicecatalog

import com.typedpath.iam2kotlin.IamPolicy

class ServicecatalogAction() {

    companion object { 
        val All = IamPolicy.Action("servicecatalog:*")    
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_AcceptPortfolioShare.html 
        //  Accepts an offer to share a portfolio.    
        val AcceptPortfolioShare = _AcceptPortfolioShare() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_AssociatePrincipalWithPortfolio.html 
        //  Associates the specified principal ARN with the specified portfolio.    
        val AssociatePrincipalWithPortfolio = _AssociatePrincipalWithPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_AssociateProductWithPortfolio.html 
        //  Associates a product with a portfolio.    
        val AssociateProductWithPortfolio = _AssociateProductWithPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateConstraint.html 
        //  Creates a new constraint.    
        val CreateConstraint = _CreateConstraint() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreatePortfolio.html 
        //  Creates a new portfolio.    
        val CreatePortfolio = _CreatePortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreatePortfolioShare.html 
        //  Creates a new portfolio share.    
        val CreatePortfolioShare = _CreatePortfolioShare() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html 
        //  Creates a new product.    
        val CreateProduct = _CreateProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProvisioningArtifact.html 
        //  Create a new provisioning artifact for the specified product.    
        val CreateProvisioningArtifact = _CreateProvisioningArtifact() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DeleteConstraint.html 
        //  Deletes the specified constraint.    
        val DeleteConstraint = _DeleteConstraint() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DeletePortfolio.html 
        //  Deletes the specified portfolio.    
        val DeletePortfolio = _DeletePortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DeletePortfolioShare.html 
        //  Deletes the specified portfolio share.    
        val DeletePortfolioShare = _DeletePortfolioShare() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DeleteProduct.html 
        //  Deletes the specified product.    
        val DeleteProduct = _DeleteProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DeleteProvisioningArtifact.html 
        //  Deletes the specified provisioning artifact.    
        val DeleteProvisioningArtifact = _DeleteProvisioningArtifact() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeConstraint.html 
        //  Retrieves detailed information for a specified constraint.    
        val DescribeConstraint = _DescribeConstraint() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribePortfolio.html 
        //  Retrieves detailed information and any tags associated with the specified portfolio.    
        val DescribePortfolio = _DescribePortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeProduct.html 
        //  Retrieves information about a specified product.    
        val DescribeProduct = _DescribeProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeProductAsAdmin.html 
        //  Retrieves information about a specified product, run with administrator access.    
        val DescribeProductAsAdmin = _DescribeProductAsAdmin() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeProductView.html 
        //  Retrieves information about a specified product.    
        val DescribeProductView = _DescribeProductView() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeProvisioningArtifact.html 
        //  Retrieves detailed information about the specified provisioning artifact.    
        val DescribeProvisioningArtifact = _DescribeProvisioningArtifact() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeProvisioningParameters.html 
        //  Provides information about parameters required to provision a specified product in a specified manner.    
        val DescribeProvisioningParameters = _DescribeProvisioningParameters() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeRecord.html 
        //  Retrieves a paginated list of the full details of a specific request.    
        val DescribeRecord = _DescribeRecord() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DisassociatePrincipalFromPortfolio.html 
        //  Disassociates a previously associated principal ARN from a specified portfolio.    
        val DisassociatePrincipalFromPortfolio = _DisassociatePrincipalFromPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_DisassociateProductFromPortfolio.html 
        //  Disassociates the specified product from the specified portfolio.    
        val DisassociateProductFromPortfolio = _DisassociateProductFromPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListAcceptedPortfolioShares.html 
        //  Lists details of all portfolios for which sharing was accepted by this account.    
        val ListAcceptedPortfolioShares = _ListAcceptedPortfolioShares() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListConstraintsForPortfolio.html 
        //  Retrieves detailed constraint information for the specified portfolio and product.    
        val ListConstraintsForPortfolio = _ListConstraintsForPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html 
        //  Returns a paginated list of all paths to a specified product.    
        val ListLaunchPaths = _ListLaunchPaths() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListPortfolioAccess.html 
        //  Lists the account IDs that have been authorized sharing of the specified portfolio.    
        val ListPortfolioAccess = _ListPortfolioAccess() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListPortfolios.html 
        //  Lists all portfolios in the catalog.    
        val ListPortfolios = _ListPortfolios() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListPortfoliosForProduct.html 
        //  Lists all portfolios that the specified product is associated with.    
        val ListPortfoliosForProduct = _ListPortfoliosForProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListPrincipalsForPortfolio.html 
        //  Lists all principal ARNs associated with the specified portfolio.    
        val ListPrincipalsForPortfolio = _ListPrincipalsForPortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListProvisioningArtifacts.html 
        //  Lists all provisioning artifacts associated with the specified product.    
        val ListProvisioningArtifacts = _ListProvisioningArtifacts() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListRecordHistory.html 
        //  Returns a paginated list of all performed requests, in the form of RecordDetails objects that are filtered as specified.    
        val ListRecordHistory = _ListRecordHistory() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisionProduct.html 
        //  Requests a Provision of a specified product.    
        val ProvisionProduct = _ProvisionProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_RejectPortfolioShare.html 
        //  Rejects an offer to share a portfolio.    
        val RejectPortfolioShare = _RejectPortfolioShare() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_ScanProvisionedProducts.html 
        //  Returns a paginated list of all the ProvisionedProduct objects that are currently available (not terminated).    
        val ScanProvisionedProducts = _ScanProvisionedProducts() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_SearchProducts.html 
        //  Returns a paginated list all of the Products objects to which the caller has access.    
        val SearchProducts = _SearchProducts() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_SearchProductsAsAdmin.html 
        //  Retrieves summary and status information about all products created within the caller's account.    
        val SearchProductsAsAdmin = _SearchProductsAsAdmin() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_TerminateProvisionedProduct.html 
        //  Requests termination of an existing ProvisionedProduct object.    
        val TerminateProvisionedProduct = _TerminateProvisionedProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_UpdateConstraint.html 
        //  Updates an existing constraint.    
        val UpdateConstraint = _UpdateConstraint() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_UpdatePortfolio.html 
        //  Updates the specified portfolio's details.    
        val UpdatePortfolio = _UpdatePortfolio() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_UpdateProduct.html 
        //  Updates an existing product.    
        val UpdateProduct = _UpdateProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_UpdateProvisionedProduct.html 
        //  Requests updates to the configuration of an existing ProvisionedProduct object.    
        val UpdateProvisionedProduct = _UpdateProvisionedProduct() 
        // see http://docs.aws.amazon.com/servicecatalog/latest/dg/API_UpdateProvisioningArtifact.html 
        //  Updates an existing provisioning artifact's information.    
        val UpdateProvisioningArtifact = _UpdateProvisioningArtifact()
    }
      class _AcceptPortfolioShare : IamPolicy.Action("servicecatalog:AcceptPortfolioShare") {

         }       
 
      class _AssociatePrincipalWithPortfolio : IamPolicy.Action("servicecatalog:AssociatePrincipalWithPortfolio") {

         }       
 
      class _AssociateProductWithPortfolio : IamPolicy.Action("servicecatalog:AssociateProductWithPortfolio") {

         }       
 
      class _CreateConstraint : IamPolicy.Action("servicecatalog:CreateConstraint") {

         }       
 
      class _CreatePortfolio : IamPolicy.Action("servicecatalog:CreatePortfolio") {

         }       
 
      class _CreatePortfolioShare : IamPolicy.Action("servicecatalog:CreatePortfolioShare") {

         }       
 
      class _CreateProduct : IamPolicy.Action("servicecatalog:CreateProduct") {

         }       
 
      class _CreateProvisioningArtifact : IamPolicy.Action("servicecatalog:CreateProvisioningArtifact") {

         }       
 
      class _DeleteConstraint : IamPolicy.Action("servicecatalog:DeleteConstraint") {

         }       
 
      class _DeletePortfolio : IamPolicy.Action("servicecatalog:DeletePortfolio") {

         }       
 
      class _DeletePortfolioShare : IamPolicy.Action("servicecatalog:DeletePortfolioShare") {

         }       
 
      class _DeleteProduct : IamPolicy.Action("servicecatalog:DeleteProduct") {

         }       
 
      class _DeleteProvisioningArtifact : IamPolicy.Action("servicecatalog:DeleteProvisioningArtifact") {

         }       
 
      class _DescribeConstraint : IamPolicy.Action("servicecatalog:DescribeConstraint") {

         }       
 
      class _DescribePortfolio : IamPolicy.Action("servicecatalog:DescribePortfolio") {

         }       
 
      class _DescribeProduct : IamPolicy.Action("servicecatalog:DescribeProduct") {

         }       
 
      class _DescribeProductAsAdmin : IamPolicy.Action("servicecatalog:DescribeProductAsAdmin") {

         }       
 
      class _DescribeProductView : IamPolicy.Action("servicecatalog:DescribeProductView") {

         }       
 
      class _DescribeProvisioningArtifact : IamPolicy.Action("servicecatalog:DescribeProvisioningArtifact") {

         }       
 
      class _DescribeProvisioningParameters : IamPolicy.Action("servicecatalog:DescribeProvisioningParameters") {

         }       
 
      class _DescribeRecord : IamPolicy.Action("servicecatalog:DescribeRecord") {

         }       
 
      class _DisassociatePrincipalFromPortfolio : IamPolicy.Action("servicecatalog:DisassociatePrincipalFromPortfolio") {

         }       
 
      class _DisassociateProductFromPortfolio : IamPolicy.Action("servicecatalog:DisassociateProductFromPortfolio") {

         }       
 
      class _ListAcceptedPortfolioShares : IamPolicy.Action("servicecatalog:ListAcceptedPortfolioShares") {

         }       
 
      class _ListConstraintsForPortfolio : IamPolicy.Action("servicecatalog:ListConstraintsForPortfolio") {

         }       
 
      class _ListLaunchPaths : IamPolicy.Action("servicecatalog:ListLaunchPaths") {

         }       
 
      class _ListPortfolioAccess : IamPolicy.Action("servicecatalog:ListPortfolioAccess") {

         }       
 
      class _ListPortfolios : IamPolicy.Action("servicecatalog:ListPortfolios") {

         }       
 
      class _ListPortfoliosForProduct : IamPolicy.Action("servicecatalog:ListPortfoliosForProduct") {

         }       
 
      class _ListPrincipalsForPortfolio : IamPolicy.Action("servicecatalog:ListPrincipalsForPortfolio") {

         }       
 
      class _ListProvisioningArtifacts : IamPolicy.Action("servicecatalog:ListProvisioningArtifacts") {

         }       
 
      class _ListRecordHistory : IamPolicy.Action("servicecatalog:ListRecordHistory") {

         }       
 
      class _ProvisionProduct : IamPolicy.Action("servicecatalog:ProvisionProduct") {

         }       
 
      class _RejectPortfolioShare : IamPolicy.Action("servicecatalog:RejectPortfolioShare") {

         }       
 
      class _ScanProvisionedProducts : IamPolicy.Action("servicecatalog:ScanProvisionedProducts") {

         }       
 
      class _SearchProducts : IamPolicy.Action("servicecatalog:SearchProducts") {

         }       
 
      class _SearchProductsAsAdmin : IamPolicy.Action("servicecatalog:SearchProductsAsAdmin") {

         }       
 
      class _TerminateProvisionedProduct : IamPolicy.Action("servicecatalog:TerminateProvisionedProduct") {

         }       
 
      class _UpdateConstraint : IamPolicy.Action("servicecatalog:UpdateConstraint") {

         }       
 
      class _UpdatePortfolio : IamPolicy.Action("servicecatalog:UpdatePortfolio") {

         }       
 
      class _UpdateProduct : IamPolicy.Action("servicecatalog:UpdateProduct") {

         }       
 
      class _UpdateProvisionedProduct : IamPolicy.Action("servicecatalog:UpdateProvisionedProduct") {

         }       
 
      class _UpdateProvisioningArtifact : IamPolicy.Action("servicecatalog:UpdateProvisioningArtifact") {

         }       


}        
