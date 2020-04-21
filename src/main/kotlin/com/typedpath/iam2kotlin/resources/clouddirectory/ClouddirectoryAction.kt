
package com.typedpath.iam2kotlin.resources.clouddirectory

import com.typedpath.iam2kotlin.IamPolicy

class ClouddirectoryAction() {

    companion object { 
        val All = IamPolicy.Action("clouddirectory:*")    
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_AddFacetToObject.html 
        //  Adds a new Facet to an object.    
        val AddFacetToObject = _AddFacetToObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ApplySchema.html 
        //  Copies the input published schema into the Directory with the same name and version as that of the published schema .    
        val ApplySchema = _ApplySchema() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_AttachObject.html 
        //  Attaches an existing object to another object.    
        val AttachObject = _AttachObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_AttachPolicy.html 
        //  Attaches a policy object to a regular object.    
        val AttachPolicy = _AttachPolicy() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_AttachToIndex.html 
        //  Attaches the specified object to the specified index.    
        val AttachToIndex = _AttachToIndex() 
        // see http://docs.aws.amazon.com/amazoncds/latest/APIReference/API_AttachTypedLink.html 
        //  Attaches a typed link to a specified source and target object.    
        val AttachTypedLink = _AttachTypedLink() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_BatchRead.html 
        //  Performs all the read operations in a batch.    
        val BatchRead = _BatchRead() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_BatchWrite.html 
        //  Performs all the write operations in a batch.    
        val BatchWrite = _BatchWrite() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateDirectory.html 
        //  Creates a Directory by copying the published schema into the directory.    
        val CreateDirectory = _CreateDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateFacet.html 
        //  Creates a new Facet in a schema.    
        val CreateFacet = _CreateFacet() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateIndex.html 
        //  Creates an index object.    
        val CreateIndex = _CreateIndex() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateObject.html 
        //  Creates an object in a Directory.    
        val CreateObject = _CreateObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateSchema.html 
        //  Creates a new schema in a development state.    
        val CreateSchema = _CreateSchema() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_CreateTypedLinkFacet.html 
        //  Creates a TypedLinkFacet.    
        val CreateTypedLinkFacet = _CreateTypedLinkFacet() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DeleteDirectory.html 
        //  Deletes a directory.    
        val DeleteDirectory = _DeleteDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DeleteFacet.html 
        //  Deletes a given Facet.    
        val DeleteFacet = _DeleteFacet() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DeleteObject.html 
        //  Deletes an object and its associated attributes.    
        val DeleteObject = _DeleteObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DeleteSchema.html 
        //  Deletes a given schema.    
        val DeleteSchema = _DeleteSchema() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DeleteTypedLinkFacet.html 
        //   Deletes a TypedLinkFacet.    
        val DeleteTypedLinkFacet = _DeleteTypedLinkFacet() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DetachFromIndex.html 
        //  Detaches the specified object from the specified index.    
        val DetachFromIndex = _DetachFromIndex() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DetachObject.html 
        //  Detaches a given object from the parent object.    
        val DetachObject = _DetachObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DetachPolicy.html 
        //  Detaches a policy from an object.    
        val DetachPolicy = _DetachPolicy() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DetachTypedLink.html 
        //   Detaches a typed link from a specified source and target object.    
        val DetachTypedLink = _DetachTypedLink() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_DisableDirectory.html 
        //  Disables the specified directory.    
        val DisableDirectory = _DisableDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_EnableDirectory.html 
        //  Enables the specified directory.    
        val EnableDirectory = _EnableDirectory() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetAppliedSchemaVersion.html 
        //   Returns current applied schema version ARN, including the minor version in use.    
        val GetAppliedSchemaVersion = _GetAppliedSchemaVersion() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetDirectory.html 
        //  Retrieves metadata about a directory.    
        val GetDirectory = _GetDirectory() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetFacet.html 
        //  Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType.    
        val GetFacet = _GetFacet() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetObjectAttributes.html 
        //  Retrieves attributes within a facet that are associated with an object.    
        val GetObjectAttributes = _GetObjectAttributes() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetObjectInformation.html 
        //  Retrieves metadata about an object.    
        val GetObjectInformation = _GetObjectInformation() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetSchemaAsJson.html 
        //  Retrieves a JSON representation of the schema.    
        val GetSchemaAsJson = _GetSchemaAsJson() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_GetTypedLinkFacetInformation.html 
        //  Returns the identity attribute order for a specific TypedLinkFacet.    
        val GetTypedLinkFacetInformation = _GetTypedLinkFacetInformation() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListAppliedSchemaArns.html 
        //  Lists schemas applied to a directory.    
        val ListAppliedSchemaArns = _ListAppliedSchemaArns() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListAttachedIndices.html 
        //  Lists indices attached to the specified object.    
        val ListAttachedIndices = _ListAttachedIndices() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListDevelopmentSchemaArns.html 
        //  Retrieves each Amazon Resource Name (ARN) of schemas in the development state.    
        val ListDevelopmentSchemaArns = _ListDevelopmentSchemaArns() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListDirectories.html 
        //  Lists directories created within an account.    
        val ListDirectories = _ListDirectories() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListFacetAttributes.html 
        //  Retrieves attributes attached to the facet.    
        val ListFacetAttributes = _ListFacetAttributes() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListFacetNames.html 
        //  Retrieves the names of facets that exist in a schema.    
        val ListFacetNames = _ListFacetNames() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListIncomingTypedLinks.html 
        //   Returns a paginated list of all the incoming TypedLinkSpecifier information for an object.    
        val ListIncomingTypedLinks = _ListIncomingTypedLinks() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListIndex.html 
        //  Lists objects and indexed values attached to the index.    
        val ListIndex = _ListIndex() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListObjectAttributes.html 
        //  Lists all attributes that are associated with an object.    
        val ListObjectAttributes = _ListObjectAttributes() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListObjectChildren.html 
        //  Returns a paginated list of child objects that are associated with a given object.    
        val ListObjectChildren = _ListObjectChildren() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListObjectParentPaths.html 
        //  Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects.    
        val ListObjectParentPaths = _ListObjectParentPaths() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListObjectParents.html 
        //  Lists parent objects that are associated with a given object in pagination fashion.    
        val ListObjectParents = _ListObjectParents() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListObjectPolicies.html 
        //  Returns policies attached to an object in pagination fashion.    
        val ListObjectPolicies = _ListObjectPolicies() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListOutgoingTypedLinks.html 
        //  Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object.    
        val ListOutgoingTypedLinks = _ListOutgoingTypedLinks() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListPolicyAttachments.html 
        //  Returns all of the ObjectIdentifiers to which a given policy is attached.    
        val ListPolicyAttachments = _ListPolicyAttachments() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListPublishedSchemaArns.html 
        //  Retrieves each published schema Amazon Resource Name (ARN).    
        val ListPublishedSchemaArns = _ListPublishedSchemaArns() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListTagsForResource.html 
        //  Returns tags for a resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListTypedLinkFacetAttributes.html 
        //   Returns a paginated list of all attribute definitions for a particular TypedLinkFacet.    
        val ListTypedLinkFacetAttributes = _ListTypedLinkFacetAttributes() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_ListTypedLinkFacetNames.html 
        //  Returns a paginated list of TypedLink facet names for a particular schema.    
        val ListTypedLinkFacetNames = _ListTypedLinkFacetNames() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_LookupPolicy.html 
        //  Lists all policies from the root of the Directory to the object specified.    
        val LookupPolicy = _LookupPolicy() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_PublishSchema.html 
        //  Publishes a development schema with a version.    
        val PublishSchema = _PublishSchema() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_PutSchemaFromJson.html 
        //  Allows a schema to be updated using JSON upload.    
        val PutSchemaFromJson = _PutSchemaFromJson() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_RemoveFacetFromObject.html 
        //  Removes the specified facet from the specified object.    
        val RemoveFacetFromObject = _RemoveFacetFromObject() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_TagResource.html 
        //  An API operation for adding tags to a resource.    
        val TagResource = _TagResource() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UntagResource.html 
        //  An API operation for removing tags from a resource.    
        val UntagResource = _UntagResource() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpdateFacet.html 
        //  .    
        val UpdateFacet = _UpdateFacet() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpdateObjectAttributes.html 
        //  Updates a given object's attributes.    
        val UpdateObjectAttributes = _UpdateObjectAttributes() 
        // see http://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpdateSchema.html 
        //  Updates the schema name with a new name.    
        val UpdateSchema = _UpdateSchema() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpdateTypedLinkFacet.html 
        //  Updates a TypedLinkFacet.    
        val UpdateTypedLinkFacet = _UpdateTypedLinkFacet() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpgradeAppliedSchema.html 
        //  Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion.    
        val UpgradeAppliedSchema = _UpgradeAppliedSchema() 
        // see https://docs.aws.amazon.com/directoryservice/latest/APIReference/API_UpgradePublishedSchema.html 
        //  Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.    
        val UpgradePublishedSchema = _UpgradePublishedSchema()
    }
      class _AddFacetToObject : IamPolicy.Action("clouddirectory:AddFacetToObject") {

         }       
 
      class _ApplySchema : IamPolicy.Action("clouddirectory:ApplySchema") {

         }       
 
      class _AttachObject : IamPolicy.Action("clouddirectory:AttachObject") {

         }       
 
      class _AttachPolicy : IamPolicy.Action("clouddirectory:AttachPolicy") {

         }       
 
      class _AttachToIndex : IamPolicy.Action("clouddirectory:AttachToIndex") {

         }       
 
      class _AttachTypedLink : IamPolicy.Action("clouddirectory:AttachTypedLink") {

         }       
 
      class _BatchRead : IamPolicy.Action("clouddirectory:BatchRead") {

         }       
 
      class _BatchWrite : IamPolicy.Action("clouddirectory:BatchWrite") {

         }       
 
      class _CreateDirectory : IamPolicy.Action("clouddirectory:CreateDirectory") {

         }       
 
      class _CreateFacet : IamPolicy.Action("clouddirectory:CreateFacet") {

         }       
 
      class _CreateIndex : IamPolicy.Action("clouddirectory:CreateIndex") {

         }       
 
      class _CreateObject : IamPolicy.Action("clouddirectory:CreateObject") {

         }       
 
      class _CreateSchema : IamPolicy.Action("clouddirectory:CreateSchema") {

         }       
 
      class _CreateTypedLinkFacet : IamPolicy.Action("clouddirectory:CreateTypedLinkFacet") {

         }       
 
      class _DeleteDirectory : IamPolicy.Action("clouddirectory:DeleteDirectory") {

         }       
 
      class _DeleteFacet : IamPolicy.Action("clouddirectory:DeleteFacet") {

         }       
 
      class _DeleteObject : IamPolicy.Action("clouddirectory:DeleteObject") {

         }       
 
      class _DeleteSchema : IamPolicy.Action("clouddirectory:DeleteSchema") {

         }       
 
      class _DeleteTypedLinkFacet : IamPolicy.Action("clouddirectory:DeleteTypedLinkFacet") {

         }       
 
      class _DetachFromIndex : IamPolicy.Action("clouddirectory:DetachFromIndex") {

         }       
 
      class _DetachObject : IamPolicy.Action("clouddirectory:DetachObject") {

         }       
 
      class _DetachPolicy : IamPolicy.Action("clouddirectory:DetachPolicy") {

         }       
 
      class _DetachTypedLink : IamPolicy.Action("clouddirectory:DetachTypedLink") {

         }       
 
      class _DisableDirectory : IamPolicy.Action("clouddirectory:DisableDirectory") {

         }       
 
      class _EnableDirectory : IamPolicy.Action("clouddirectory:EnableDirectory") {

         }       
 
      class _GetAppliedSchemaVersion : IamPolicy.Action("clouddirectory:GetAppliedSchemaVersion") {

         }       
 
      class _GetDirectory : IamPolicy.Action("clouddirectory:GetDirectory") {

         }       
 
      class _GetFacet : IamPolicy.Action("clouddirectory:GetFacet") {

         }       
 
      class _GetObjectAttributes : IamPolicy.Action("clouddirectory:GetObjectAttributes") {

         }       
 
      class _GetObjectInformation : IamPolicy.Action("clouddirectory:GetObjectInformation") {

         }       
 
      class _GetSchemaAsJson : IamPolicy.Action("clouddirectory:GetSchemaAsJson") {

         }       
 
      class _GetTypedLinkFacetInformation : IamPolicy.Action("clouddirectory:GetTypedLinkFacetInformation") {

         }       
 
      class _ListAppliedSchemaArns : IamPolicy.Action("clouddirectory:ListAppliedSchemaArns") {

         }       
 
      class _ListAttachedIndices : IamPolicy.Action("clouddirectory:ListAttachedIndices") {

         }       
 
      class _ListDevelopmentSchemaArns : IamPolicy.Action("clouddirectory:ListDevelopmentSchemaArns") {

         }       
 
      class _ListDirectories : IamPolicy.Action("clouddirectory:ListDirectories") {

         }       
 
      class _ListFacetAttributes : IamPolicy.Action("clouddirectory:ListFacetAttributes") {

         }       
 
      class _ListFacetNames : IamPolicy.Action("clouddirectory:ListFacetNames") {

         }       
 
      class _ListIncomingTypedLinks : IamPolicy.Action("clouddirectory:ListIncomingTypedLinks") {

         }       
 
      class _ListIndex : IamPolicy.Action("clouddirectory:ListIndex") {

         }       
 
      class _ListObjectAttributes : IamPolicy.Action("clouddirectory:ListObjectAttributes") {

         }       
 
      class _ListObjectChildren : IamPolicy.Action("clouddirectory:ListObjectChildren") {

         }       
 
      class _ListObjectParentPaths : IamPolicy.Action("clouddirectory:ListObjectParentPaths") {

         }       
 
      class _ListObjectParents : IamPolicy.Action("clouddirectory:ListObjectParents") {

         }       
 
      class _ListObjectPolicies : IamPolicy.Action("clouddirectory:ListObjectPolicies") {

         }       
 
      class _ListOutgoingTypedLinks : IamPolicy.Action("clouddirectory:ListOutgoingTypedLinks") {

         }       
 
      class _ListPolicyAttachments : IamPolicy.Action("clouddirectory:ListPolicyAttachments") {

         }       
 
      class _ListPublishedSchemaArns : IamPolicy.Action("clouddirectory:ListPublishedSchemaArns") {

         }       
 
      class _ListTagsForResource : IamPolicy.Action("clouddirectory:ListTagsForResource") {

         }       
 
      class _ListTypedLinkFacetAttributes : IamPolicy.Action("clouddirectory:ListTypedLinkFacetAttributes") {

         }       
 
      class _ListTypedLinkFacetNames : IamPolicy.Action("clouddirectory:ListTypedLinkFacetNames") {

         }       
 
      class _LookupPolicy : IamPolicy.Action("clouddirectory:LookupPolicy") {

         }       
 
      class _PublishSchema : IamPolicy.Action("clouddirectory:PublishSchema") {

         }       
 
      class _PutSchemaFromJson : IamPolicy.Action("clouddirectory:PutSchemaFromJson") {

         }       
 
      class _RemoveFacetFromObject : IamPolicy.Action("clouddirectory:RemoveFacetFromObject") {

         }       
 
      class _TagResource : IamPolicy.Action("clouddirectory:TagResource") {

         }       
 
      class _UntagResource : IamPolicy.Action("clouddirectory:UntagResource") {

         }       
 
      class _UpdateFacet : IamPolicy.Action("clouddirectory:UpdateFacet") {

         }       
 
      class _UpdateObjectAttributes : IamPolicy.Action("clouddirectory:UpdateObjectAttributes") {

         }       
 
      class _UpdateSchema : IamPolicy.Action("clouddirectory:UpdateSchema") {

         }       
 
      class _UpdateTypedLinkFacet : IamPolicy.Action("clouddirectory:UpdateTypedLinkFacet") {

         }       
 
      class _UpgradeAppliedSchema : IamPolicy.Action("clouddirectory:UpgradeAppliedSchema") {

         }       
 
      class _UpgradePublishedSchema : IamPolicy.Action("clouddirectory:UpgradePublishedSchema") {

         }       


}        
