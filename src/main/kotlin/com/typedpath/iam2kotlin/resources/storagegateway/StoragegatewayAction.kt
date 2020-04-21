
package com.typedpath.iam2kotlin.resources.storagegateway

import com.typedpath.iam2kotlin.IamPolicy

class StoragegatewayAction() {

    companion object { 
        val All = IamPolicy.Action("storagegateway:*")    
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ActivateGateway.html 
        //  Activates the gateway you previously deployed on your host.    
        val ActivateGateway = _ActivateGateway() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddCache.html 
        //  Configures one or more gateway local disks as cache for a cached-volume gateway.    
        val AddCache = _AddCache() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddTagsToResource.html 
        //  Adds one or more tags to the specified resource.    
        val AddTagsToResource = _AddTagsToResource() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddUploadBuffer.html 
        //  Configures one or more gateway local disks as upload buffer for a specified gateway.    
        val AddUploadBuffer = _AddUploadBuffer() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_AddWorkingStorage.html 
        //  Configures one or more gateway local disks as working storage for a gateway.    
        val AddWorkingStorage = _AddWorkingStorage() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CancelArchival.html 
        //  Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the archiving process is initiated.    
        val CancelArchival = _CancelArchival() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CancelRetrieval.html 
        //  Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a gateway after the retrieval process is initiated.    
        val CancelRetrieval = _CancelRetrieval() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateCachediSCSIVolume.html 
        //  Creates a cached volume on a specified cached gateway.    
        val CreateCachediSCSIVolume = _CreateCachediSCSIVolume() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateSnapshot.html 
        //  Initiates a snapshot of a volume.    
        val CreateSnapshot = _CreateSnapshot() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateSnapshotFromVolumeRecoveryPoint.html 
        //  Initiates a snapshot of a gateway from a volume recovery point.    
        val CreateSnapshotFromVolumeRecoveryPoint = _CreateSnapshotFromVolumeRecoveryPoint() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateStorediSCSIVolume.html 
        //  Creates a volume on a specified gateway.    
        val CreateStorediSCSIVolume = _CreateStorediSCSIVolume() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateTapes.html 
        //  Creates one or more virtual tapes.    
        val CreateTapes = _CreateTapes() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteBandwidthRateLimit.html 
        //  Deletes the bandwidth rate limits of a gateway.    
        val DeleteBandwidthRateLimit = _DeleteBandwidthRateLimit() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteChapCredentials.html 
        //  Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target and initiator pair.    
        val DeleteChapCredentials = _DeleteChapCredentials() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteGateway.html 
        //  Deletes a gateway.    
        val DeleteGateway = _DeleteGateway() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteSnapshotSchedule.html 
        //  Deletes a snapshot of a volume.    
        val DeleteSnapshotSchedule = _DeleteSnapshotSchedule() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteTape.html 
        //  Deletes the specified virtual tape.    
        val DeleteTape = _DeleteTape() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteTapeArchive.html 
        //  Deletes the specified virtual tape from the virtual tape shelf (VTS).    
        val DeleteTapeArchive = _DeleteTapeArchive() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DeleteVolume.html 
        //  Deletes the specified gateway volume that you previously created using the CreateCachediSCSIVolume or CreateStorediSCSIVolume API.    
        val DeleteVolume = _DeleteVolume() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeBandwidthRateLimit.html 
        //  Returns the bandwidth rate limits of a gateway.    
        val DescribeBandwidthRateLimit = _DescribeBandwidthRateLimit() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeCache.html 
        //  Returns information about the cache of a gateway.    
        val DescribeCache = _DescribeCache() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeCachediSCSIVolumes.html 
        //  Returns a description of the gateway volumes specified in the request.    
        val DescribeCachediSCSIVolumes = _DescribeCachediSCSIVolumes() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeChapCredentials.html 
        //  Returns an array of Challenge-Handshake Authentication Protocol (CHAP) credentials information for a specified iSCSI target, one for each target-initiator pair.    
        val DescribeChapCredentials = _DescribeChapCredentials() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeGatewayInformation.html 
        //  Returns metadata about a gateway such as its name, network interfaces, configured time zone, and the state (whether the gateway is running or not).    
        val DescribeGatewayInformation = _DescribeGatewayInformation() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeMaintenanceStartTime.html 
        //  Returns your gateway's weekly maintenance start time including the day and time of the week.    
        val DescribeMaintenanceStartTime = _DescribeMaintenanceStartTime() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeSnapshotSchedule.html 
        //  Describes the snapshot schedule for the specified gateway volume.    
        val DescribeSnapshotSchedule = _DescribeSnapshotSchedule() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeStorediSCSIVolumes.html 
        //  Returns the description of the gateway volumes specified in the request.    
        val DescribeStorediSCSIVolumes = _DescribeStorediSCSIVolumes() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeTapeArchives.html 
        //  Returns a description of specified virtual tapes in the virtual tape shelf (VTS).    
        val DescribeTapeArchives = _DescribeTapeArchives() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeTapeRecoveryPoints.html 
        //  Returns a list of virtual tape recovery points that are available for the specified gateway-VTL.    
        val DescribeTapeRecoveryPoints = _DescribeTapeRecoveryPoints() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeTapes.html 
        //  Returns a description of the specified Amazon Resource Name (ARN) of virtual tapes.    
        val DescribeTapes = _DescribeTapes() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeUploadBuffer.html 
        //  Returns information about the upload buffer of a gateway.    
        val DescribeUploadBuffer = _DescribeUploadBuffer() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeVTLDevices.html 
        //  Returns a description of virtual tape library (VTL) devices for the specified gateway.    
        val DescribeVTLDevices = _DescribeVTLDevices() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DescribeWorkingStorage.html 
        //  Returns information about the working storage of a gateway.    
        val DescribeWorkingStorage = _DescribeWorkingStorage() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_DisableGateway.html 
        //  Disables a gateway when the gateway is no longer functioning.    
        val DisableGateway = _DisableGateway() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListGateways.html 
        //  Lists gateways owned by an AWS account in a region specified in the request.    
        val ListGateways = _ListGateways() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListLocalDisks.html 
        //  Returns a list of the gateway's local disks.    
        val ListLocalDisks = _ListLocalDisks() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListTagsForResource.html 
        //  Lists the tags that have been added to the specified resource.    
        val ListTagsForResource = _ListTagsForResource() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListVolumeInitiators.html 
        //  Lists iSCSI initiators that are connected to a volume.    
        val ListVolumeInitiators = _ListVolumeInitiators() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListVolumeRecoveryPoints.html 
        //  Lists the recovery points for a specified gateway.    
        val ListVolumeRecoveryPoints = _ListVolumeRecoveryPoints() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ListVolumes.html 
        //  Lists the iSCSI stored volumes of a gateway.    
        val ListVolumes = _ListVolumes() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_RemoveTagsFromResource.html 
        //  Removes one or more tags from the specified resource.    
        val RemoveTagsFromResource = _RemoveTagsFromResource() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ResetCache.html 
        //  Resets all cache disks that have encountered a error and makes the disks available for reconfiguration as cache storage.    
        val ResetCache = _ResetCache() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_RetrieveTapeArchive.html 
        //  Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a gateway-VTL.    
        val RetrieveTapeArchive = _RetrieveTapeArchive() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_RetrieveTapeRecoveryPoint.html 
        //  Retrieves the recovery point for the specified virtual tape.    
        val RetrieveTapeRecoveryPoint = _RetrieveTapeRecoveryPoint() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_ShutdownGateway.html 
        //  Shuts down a gateway.    
        val ShutdownGateway = _ShutdownGateway() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_StartGateway.html 
        //  Starts a gateway that you previously shut down (see ShutdownGateway).    
        val StartGateway = _StartGateway() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateBandwidthRateLimit.html 
        //  Updates the bandwidth rate limits of a gateway.    
        val UpdateBandwidthRateLimit = _UpdateBandwidthRateLimit() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateChapCredentials.html 
        //  Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target.    
        val UpdateChapCredentials = _UpdateChapCredentials() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateGatewayInformation.html 
        //  Updates a gateway's metadata, which includes the gateway's name and time zone.    
        val UpdateGatewayInformation = _UpdateGatewayInformation() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateGatewaySoftwareNow.html 
        //  Updates the gateway virtual machine (VM) software.    
        val UpdateGatewaySoftwareNow = _UpdateGatewaySoftwareNow() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateMaintenanceStartTime.html 
        //  Updates a gateway's weekly maintenance start time information, including day and time of the week.    
        val UpdateMaintenanceStartTime = _UpdateMaintenanceStartTime() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateSnapshotSchedule.html 
        //  Updates a snapshot schedule configured for a gateway volume.    
        val UpdateSnapshotSchedule = _UpdateSnapshotSchedule() 
        // see http://docs.aws.amazon.com/storagegateway/latest/APIReference/API_UpdateVTLDeviceType.html 
        //  Updates the type of medium changer in a gateway-VTL.    
        val UpdateVTLDeviceType = _UpdateVTLDeviceType()
    }
      class _ActivateGateway : IamPolicy.Action("storagegateway:ActivateGateway") {

         }       
 
      class _AddCache : IamPolicy.Action("storagegateway:AddCache") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _AddTagsToResource : IamPolicy.Action("storagegateway:AddTagsToResource") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
             //arn:aws:storagegateway:$region:$account:tape/$tapebarcode"
            fun tape_byRegionAccountTapebarcode(region: String, account: String, tapebarcode: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:tape/$tapebarcode")
         }       
 
      class _AddUploadBuffer : IamPolicy.Action("storagegateway:AddUploadBuffer") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _AddWorkingStorage : IamPolicy.Action("storagegateway:AddWorkingStorage") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _CancelArchival : IamPolicy.Action("storagegateway:CancelArchival") {
             //arn:aws:storagegateway:$region:$account:tape/$tapebarcode"
            fun tape_byRegionAccountTapebarcode(region: String, account: String, tapebarcode: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:tape/$tapebarcode")
         }       
 
      class _CancelRetrieval : IamPolicy.Action("storagegateway:CancelRetrieval") {
             //arn:aws:storagegateway:$region:$account:tape/$tapebarcode"
            fun tape_byRegionAccountTapebarcode(region: String, account: String, tapebarcode: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:tape/$tapebarcode")
         }       
 
      class _CreateCachediSCSIVolume : IamPolicy.Action("storagegateway:CreateCachediSCSIVolume") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _CreateSnapshot : IamPolicy.Action("storagegateway:CreateSnapshot") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _CreateSnapshotFromVolumeRecoveryPoint : IamPolicy.Action("storagegateway:CreateSnapshotFromVolumeRecoveryPoint") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _CreateStorediSCSIVolume : IamPolicy.Action("storagegateway:CreateStorediSCSIVolume") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _CreateTapes : IamPolicy.Action("storagegateway:CreateTapes") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DeleteBandwidthRateLimit : IamPolicy.Action("storagegateway:DeleteBandwidthRateLimit") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DeleteChapCredentials : IamPolicy.Action("storagegateway:DeleteChapCredentials") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/target/$iSCSItarget"
            fun gateway_target_byRegionAccountGatewayidISCSItarget(region: String, account: String, gatewayid: String, iSCSItarget: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/target/$iSCSItarget")
         }       
 
      class _DeleteGateway : IamPolicy.Action("storagegateway:DeleteGateway") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DeleteSnapshotSchedule : IamPolicy.Action("storagegateway:DeleteSnapshotSchedule") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _DeleteTape : IamPolicy.Action("storagegateway:DeleteTape") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DeleteTapeArchive : IamPolicy.Action("storagegateway:DeleteTapeArchive") {

         }       
 
      class _DeleteVolume : IamPolicy.Action("storagegateway:DeleteVolume") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _DescribeBandwidthRateLimit : IamPolicy.Action("storagegateway:DescribeBandwidthRateLimit") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeCache : IamPolicy.Action("storagegateway:DescribeCache") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeCachediSCSIVolumes : IamPolicy.Action("storagegateway:DescribeCachediSCSIVolumes") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _DescribeChapCredentials : IamPolicy.Action("storagegateway:DescribeChapCredentials") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/target/$iSCSItarget"
            fun gateway_target_byRegionAccountGatewayidISCSItarget(region: String, account: String, gatewayid: String, iSCSItarget: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/target/$iSCSItarget")
         }       
 
      class _DescribeGatewayInformation : IamPolicy.Action("storagegateway:DescribeGatewayInformation") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeMaintenanceStartTime : IamPolicy.Action("storagegateway:DescribeMaintenanceStartTime") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeSnapshotSchedule : IamPolicy.Action("storagegateway:DescribeSnapshotSchedule") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _DescribeStorediSCSIVolumes : IamPolicy.Action("storagegateway:DescribeStorediSCSIVolumes") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _DescribeTapeArchives : IamPolicy.Action("storagegateway:DescribeTapeArchives") {

         }       
 
      class _DescribeTapeRecoveryPoints : IamPolicy.Action("storagegateway:DescribeTapeRecoveryPoints") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeTapes : IamPolicy.Action("storagegateway:DescribeTapes") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeUploadBuffer : IamPolicy.Action("storagegateway:DescribeUploadBuffer") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeVTLDevices : IamPolicy.Action("storagegateway:DescribeVTLDevices") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DescribeWorkingStorage : IamPolicy.Action("storagegateway:DescribeWorkingStorage") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _DisableGateway : IamPolicy.Action("storagegateway:DisableGateway") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _ListGateways : IamPolicy.Action("storagegateway:ListGateways") {

         }       
 
      class _ListLocalDisks : IamPolicy.Action("storagegateway:ListLocalDisks") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _ListTagsForResource : IamPolicy.Action("storagegateway:ListTagsForResource") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
             //arn:aws:storagegateway:$region:$account:tape/$tapebarcode"
            fun tape_byRegionAccountTapebarcode(region: String, account: String, tapebarcode: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:tape/$tapebarcode")
         }       
 
      class _ListVolumeInitiators : IamPolicy.Action("storagegateway:ListVolumeInitiators") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _ListVolumeRecoveryPoints : IamPolicy.Action("storagegateway:ListVolumeRecoveryPoints") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _ListVolumes : IamPolicy.Action("storagegateway:ListVolumes") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _RemoveTagsFromResource : IamPolicy.Action("storagegateway:RemoveTagsFromResource") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
             //arn:aws:storagegateway:$region:$account:tape/$tapebarcode"
            fun tape_byRegionAccountTapebarcode(region: String, account: String, tapebarcode: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:tape/$tapebarcode")
         }       
 
      class _ResetCache : IamPolicy.Action("storagegateway:ResetCache") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _RetrieveTapeArchive : IamPolicy.Action("storagegateway:RetrieveTapeArchive") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _RetrieveTapeRecoveryPoint : IamPolicy.Action("storagegateway:RetrieveTapeRecoveryPoint") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _ShutdownGateway : IamPolicy.Action("storagegateway:ShutdownGateway") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _StartGateway : IamPolicy.Action("storagegateway:StartGateway") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _UpdateBandwidthRateLimit : IamPolicy.Action("storagegateway:UpdateBandwidthRateLimit") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _UpdateChapCredentials : IamPolicy.Action("storagegateway:UpdateChapCredentials") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/target/$iSCSItarget"
            fun gateway_target_byRegionAccountGatewayidISCSItarget(region: String, account: String, gatewayid: String, iSCSItarget: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/target/$iSCSItarget")
         }       
 
      class _UpdateGatewayInformation : IamPolicy.Action("storagegateway:UpdateGatewayInformation") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _UpdateGatewaySoftwareNow : IamPolicy.Action("storagegateway:UpdateGatewaySoftwareNow") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _UpdateMaintenanceStartTime : IamPolicy.Action("storagegateway:UpdateMaintenanceStartTime") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id"
            fun gateway_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid")
         }       
 
      class _UpdateSnapshotSchedule : IamPolicy.Action("storagegateway:UpdateSnapshotSchedule") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/volume/$volume-id"
            fun gateway_volume_byRegionAccountGatewayidVolumeid(region: String, account: String, gatewayid: String, volumeid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/volume/$volumeid")
         }       
 
      class _UpdateVTLDeviceType : IamPolicy.Action("storagegateway:UpdateVTLDeviceType") {
             //arn:aws:storagegateway:$region:$account:gateway/$gateway-id/device/vtldevice"
            fun gateway_device_vtldevice_byRegionAccountGatewayid(region: String, account: String, gatewayid: String) = IamPolicy.Resource("arn:aws:storagegateway:$region:$account:gateway/$gatewayid/device/vtldevice")
         }       


}        
