
package com.typedpath.iam2kotlin.resources.ec2

import com.typedpath.iam2kotlin.IamPolicy

class Ec2Action() {

    companion object { 
        val All = IamPolicy.Action("ec2:*")    
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AcceptVpcPeeringConnection.html 
        //  Accept a VPC peering connection request.    
        val AcceptVpcPeeringConnection = _AcceptVpcPeeringConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html 
        //  Associates an IAM instance profile with a running or stopped instance.    
        val AssociateIamInstanceProfile = _AssociateIamInstanceProfile() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AttachClassicLinkVpc.html 
        //  Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or more of the VPC's security groups.    
        val AttachClassicLinkVpc = _AttachClassicLinkVpc() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AttachVolume.html 
        //  Attaches an EBS volume to a running or stopped instance and exposes it to the instance with the specified device name.    
        val AttachVolume = _AttachVolume() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupEgress.html 
        //  [EC2-VPC only] Adds one or more egress rules to a security group for use with a VPC.    
        val AuthorizeSecurityGroupEgress = _AuthorizeSecurityGroupEgress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AuthorizeSecurityGroupIngress.html 
        //  Adds one or more ingress rules to a security group.    
        val AuthorizeSecurityGroupIngress = _AuthorizeSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html 
        //  Adds or overwrites one or more tags for the specified Amazon EC2 resource or resources.    
        val CreateTags = _CreateTags() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVolume.html 
        //  Creates an EBS volume that can be attached to an instance in the same Availability Zone.    
        val CreateVolume = _CreateVolume() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcPeeringConnection.html 
        //  Requests a VPC peering connection between two VPCs.    
        val CreateVpcPeeringConnection = _CreateVpcPeeringConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteCustomerGateway.html 
        //  Deletes the specified customer gateway.    
        val DeleteCustomerGateway = _DeleteCustomerGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteDhcpOptions.html 
        //  Deletes the specified set of DHCP options.    
        val DeleteDhcpOptions = _DeleteDhcpOptions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteInternetGateway.html 
        //  Deletes the specified Internet gateway.    
        val DeleteInternetGateway = _DeleteInternetGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteNetworkAcl.html 
        //  Deletes the specified network ACL.    
        val DeleteNetworkAcl = _DeleteNetworkAcl() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteNetworkAclEntry.html 
        //  Deletes the specified ingress or egress entry (rule) from the specified network ACL.    
        val DeleteNetworkAclEntry = _DeleteNetworkAclEntry() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteRoute.html 
        //  Deletes the specified route from the specified route table.    
        val DeleteRoute = _DeleteRoute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteRouteTable.html 
        //  Deletes the specified route table.    
        val DeleteRouteTable = _DeleteRouteTable() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSecurityGroup.html 
        //  Deletes a security group.    
        val DeleteSecurityGroup = _DeleteSecurityGroup() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteTags.html 
        //  Deletes the specified set of tags from the specified set of resources.    
        val DeleteTags = _DeleteTags() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVolume.html 
        //  Deletes the specified EBS volume.    
        val DeleteVolume = _DeleteVolume() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpcPeeringConnection.html 
        //   Deletes a VPC peering connection.    
        val DeleteVpcPeeringConnection = _DeleteVpcPeeringConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DetachClassicLinkVpc.html 
        //  Unlinks (detaches) a linked EC2-Classic instance from a VPC.    
        val DetachClassicLinkVpc = _DetachClassicLinkVpc() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DetachVolume.html 
        //  Detaches an EBS volume from an instance.    
        val DetachVolume = _DetachVolume() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisableVpcClassicLink.html 
        //  Disables ClassicLink for a VPC.    
        val DisableVpcClassicLink = _DisableVpcClassicLink() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html 
        //  Disassociates an IAM instance profile from a running or stopped instance.    
        val DisassociateIamInstanceProfile = _DisassociateIamInstanceProfile() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableVpcClassicLink.html 
        //  Enables a VPC for ClassicLink.    
        val EnableVpcClassicLink = _EnableVpcClassicLink() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetConsoleScreenshot.html 
        //  Retrieve a JPG-format screenshot of a running instance to help with troubleshooting.    
        val GetConsoleScreenshot = _GetConsoleScreenshot() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RebootInstances.html 
        //  Requests a reboot of one or more instances.    
        val RebootInstances = _RebootInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RejectVpcPeeringConnection.html 
        //  Rejects a VPC peering connection request.    
        val RejectVpcPeeringConnection = _RejectVpcPeeringConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReplaceIamInstanceProfileAssociation.html 
        //  Replaces an IAM instance profile for the specified running instance.    
        val ReplaceIamInstanceProfileAssociation = _ReplaceIamInstanceProfileAssociation() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RevokeSecurityGroupEgress.html 
        //  [EC2-VPC only] Removes one or more egress rules from a security group for EC2-VPC.    
        val RevokeSecurityGroupEgress = _RevokeSecurityGroupEgress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RevokeSecurityGroupIngress.html 
        //  Removes one or more ingress rules from a security group.    
        val RevokeSecurityGroupIngress = _RevokeSecurityGroupIngress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html 
        //  Launches the specified number of instances using an AMI for which you have permissions.    
        val RunInstances = _RunInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StartInstances.html 
        //  Starts an Amazon EBS-backed AMI that you've previously stopped.    
        val StartInstances = _StartInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StopInstances.html 
        //  Stops an Amazon EBS-backed instance.    
        val StopInstances = _StopInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_TerminateInstances.html 
        //  Shuts down one or more instances.    
        val TerminateInstances = _TerminateInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AllocateAddress.html 
        //  Acquires an Elastic IP address.    
        val AllocateAddress = _AllocateAddress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AllocateHosts.html 
        //  Allocates a Dedicated host to your account.    
        val AllocateHosts = _AllocateHosts() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssignPrivateIpAddresses.html 
        //  Assigns one or more secondary private IP addresses to the specified network interface.    
        val AssignPrivateIpAddresses = _AssignPrivateIpAddresses() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateAddress.html 
        //  Associates an Elastic IP address with an instance or a network interface.    
        val AssociateAddress = _AssociateAddress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateDhcpOptions.html 
        //  Associates a set of DHCP options (that you've previously created) with the specified VPC, or associates no DHCP options with the VPC.    
        val AssociateDhcpOptions = _AssociateDhcpOptions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateRouteTable.html 
        //  Associates a subnet with a route table.    
        val AssociateRouteTable = _AssociateRouteTable() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AttachInternetGateway.html 
        //  Attaches an Internet gateway to a VPC, enabling connectivity between the Internet and the VPC.    
        val AttachInternetGateway = _AttachInternetGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AttachNetworkInterface.html 
        //  Attaches a network interface to an instance.    
        val AttachNetworkInterface = _AttachNetworkInterface() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AttachVpnGateway.html 
        //  Attaches a virtual private gateway to a VPC.    
        val AttachVpnGateway = _AttachVpnGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BundleInstance.html 
        //  Bundles an Amazon instance store-backed Windows instance.    
        val BundleInstance = _BundleInstance() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelBundleTask.html 
        //  Cancels a bundling operation for an instance store-backed Windows instance.    
        val CancelBundleTask = _CancelBundleTask() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelConversionTask.html 
        //  Cancels an active conversion task.    
        val CancelConversionTask = _CancelConversionTask() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelExportTask.html 
        //  Cancels an active export task.    
        val CancelExportTask = _CancelExportTask() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelImportTask.html 
        //  Cancels an in-process import virtual machine or import snapshot task.    
        val CancelImportTask = _CancelImportTask() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelReservedInstancesListing.html 
        //  Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.    
        val CancelReservedInstancesListing = _CancelReservedInstancesListing() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotFleetRequests.html 
        //  Cancels the specified Spot fleet requests.    
        val CancelSpotFleetRequests = _CancelSpotFleetRequests() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CancelSpotInstanceRequests.html 
        //  Cancels one or more Spot instance requests.    
        val CancelSpotInstanceRequests = _CancelSpotInstanceRequests() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ConfirmProductInstance.html 
        //  Determines whether a product code is associated with an instance.    
        val ConfirmProductInstance = _ConfirmProductInstance() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CopyImage.html 
        //  Initiates the copy of an AMI from the specified source region to the current region.    
        val CopyImage = _CopyImage() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CopySnapshot.html 
        //  Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3.    
        val CopySnapshot = _CopySnapshot() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateCustomerGateway.html 
        //  Provides information to AWS about your VPN customer gateway device.    
        val CreateCustomerGateway = _CreateCustomerGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateDhcpOptions.html 
        //  Creates a set of DHCP options for your VPC.    
        val CreateDhcpOptions = _CreateDhcpOptions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFlowLogs.html 
        //  Creates one or more flow logs to capture IP traffic for a specific network interface, subnet, or VPC.    
        val CreateFlowLogs = _CreateFlowLogs() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateImage.html 
        //  Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is either running or stopped.    
        val CreateImage = _CreateImage() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateInstanceExportTask.html 
        //  Exports a running or stopped instance to an S3 bucket.    
        val CreateInstanceExportTask = _CreateInstanceExportTask() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateInternetGateway.html 
        //  Creates an Internet gateway for use with a VPC.    
        val CreateInternetGateway = _CreateInternetGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html 
        //  Creates a 2048-bit RSA key pair with the specified name.    
        val CreateKeyPair = _CreateKeyPair() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNatGateway.html 
        //  Creates a NAT gateway in the specified subnet.    
        val CreateNatGateway = _CreateNatGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkAcl.html 
        //  Creates a network ACL in a VPC.    
        val CreateNetworkAcl = _CreateNetworkAcl() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkAclEntry.html 
        //  Creates an entry (a rule) in a network ACL with the specified rule number.    
        val CreateNetworkAclEntry = _CreateNetworkAclEntry() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html 
        //  Creates a network interface in the specified subnet..    
        val CreateNetworkInterface = _CreateNetworkInterface() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreatePlacementGroup.html 
        //  Creates a placement group that you launch cluster instances into.    
        val CreatePlacementGroup = _CreatePlacementGroup() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateReservedInstancesListing.html 
        //  Creates a listing for Amazon EC2 Reserved Instances to be sold in the Reserved Instance Marketplace.    
        val CreateReservedInstancesListing = _CreateReservedInstancesListing() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateRoute.html 
        //  Creates a route in a route table within a VPC.    
        val CreateRoute = _CreateRoute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateRouteTable.html 
        //  Creates a route table for the specified VPC.    
        val CreateRouteTable = _CreateRouteTable() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSecurityGroup.html 
        //  Creates a security group.    
        val CreateSecurityGroup = _CreateSecurityGroup() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshot.html 
        //  Creates a snapshot of an EBS volume and stores it in Amazon S3.    
        val CreateSnapshot = _CreateSnapshot() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSpotDatafeedSubscription.html 
        //  Creates a data feed for Spot instances, enabling you to view Spot instance usage logs.    
        val CreateSpotDatafeedSubscription = _CreateSpotDatafeedSubscription() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSubnet.html 
        //  CreateSubnet    
        val CreateSubnet = _CreateSubnet() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpc.html 
        //  Creates a VPC with the specified CIDR block.    
        val CreateVpc = _CreateVpc() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpoint.html 
        //  Creates a VPC endpoint for a specified AWS service.    
        val CreateVpcEndpoint = _CreateVpcEndpoint() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpnConnection.html 
        //  Creates a VPN connection between an existing virtual private gateway and a VPN customer gateway    
        val CreateVpnConnection = _CreateVpnConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpnConnectionRoute.html 
        //  Creates a static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway.    
        val CreateVpnConnectionRoute = _CreateVpnConnectionRoute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpnGateway.html 
        //  Creates a virtual private gateway.    
        val CreateVpnGateway = _CreateVpnGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteFlowLogs.html 
        //  Deletes one or more flow logs.    
        val DeleteFlowLogs = _DeleteFlowLogs() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteKeyPair.html 
        //  Deletes the specified key pair, by removing the public key from Amazon EC2.    
        val DeleteKeyPair = _DeleteKeyPair() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteNatGateway.html 
        //  Deletes the specified NAT gateway.    
        val DeleteNatGateway = _DeleteNatGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteNetworkInterface.html 
        //  Deletes the specified network interface.    
        val DeleteNetworkInterface = _DeleteNetworkInterface() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeletePlacementGroup.html 
        //  Deletes the specified placement group.    
        val DeletePlacementGroup = _DeletePlacementGroup() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSnapshot.html 
        //  Deletes the specified snapshot.    
        val DeleteSnapshot = _DeleteSnapshot() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSpotDatafeedSubscription.html 
        //  Deletes the data feed for Spot instances.    
        val DeleteSpotDatafeedSubscription = _DeleteSpotDatafeedSubscription() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSubnet.html 
        //  Deletes the specified subnet.    
        val DeleteSubnet = _DeleteSubnet() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpc.html 
        //  Deletes the specified VPC.    
        val DeleteVpc = _DeleteVpc() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpcEndpoints.html 
        //  Deletes one or more specified VPC endpoints.    
        val DeleteVpcEndpoints = _DeleteVpcEndpoints() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpnConnection.html 
        //  Deletes the specified VPN connection.    
        val DeleteVpnConnection = _DeleteVpnConnection() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpnConnectionRoute.html 
        //  Deletes the specified static route associated with a VPN connection between an existing virtual private gateway and a VPN customer gateway.    
        val DeleteVpnConnectionRoute = _DeleteVpnConnectionRoute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteVpnGateway.html 
        //  Deletes the specified virtual private gateway.    
        val DeleteVpnGateway = _DeleteVpnGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeregisterImage.html 
        //  Deregisters the specified AMI.    
        val DeregisterImage = _DeregisterImage() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAccountAttributes.html 
        //  Describes attributes of your AWS account.    
        val DescribeAccountAttributes = _DescribeAccountAttributes() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html 
        //  Describes one or more of your Elastic IP addresses.    
        val DescribeAddresses = _DescribeAddresses() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html 
        //  Describes one or more of the Availability Zones that are available to you.    
        val DescribeAvailabilityZones = _DescribeAvailabilityZones() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeBundleTasks.html 
        //  Describes one or more of your bundling tasks.    
        val DescribeBundleTasks = _DescribeBundleTasks() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeClassicLinkInstances.html 
        //  Describes one or more of your linked EC2-Classic instances.    
        val DescribeClassicLinkInstances = _DescribeClassicLinkInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeConversionTasks.html 
        //  Describes one or more of your linked EC2-Classic instances..    
        val DescribeConversionTasks = _DescribeConversionTasks() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeCustomerGateways.html 
        //  Describes one or more of your VPN customer gateways.    
        val DescribeCustomerGateways = _DescribeCustomerGateways() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeDhcpOptions.html 
        //  Describes one or more of your VPN customer gateways.    
        val DescribeDhcpOptions = _DescribeDhcpOptions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeExportTasks.html 
        //  Describes one or more of your export tasks.    
        val DescribeExportTasks = _DescribeExportTasks() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeHosts.html 
        //  Describes one or more of your Dedicated hosts.    
        val DescribeHosts = _DescribeHosts() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeIdentityIdFormat.html 
        //  Describes the ID format settings for resources for the specified IAM user, IAM role, or root user.    
        val DescribeIdentityIdFormat = _DescribeIdentityIdFormat() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeIdFormat.html 
        //  Describes the ID format settings for your resources on a per-region basis, for example, to view which resource types are enabled for longer IDs.    
        val DescribeIdFormat = _DescribeIdFormat() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html 
        //  Describes the specified attribute of the specified AMI.    
        val DescribeImageAttribute = _DescribeImageAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html 
        //  Describes one or more of the images (AMIs, AKIs, and ARIs) available to you.    
        val DescribeImages = _DescribeImages() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImportImageTasks.html 
        //  Displays details about an import virtual machine or import snapshot tasks that are already created.    
        val DescribeImportImageTasks = _DescribeImportImageTasks() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImportSnapshotTasks.html 
        //  Describes your import snapshot tasks.    
        val DescribeImportSnapshotTasks = _DescribeImportSnapshotTasks() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceAttribute.html 
        //  Describes the specified attribute of the specified instance.    
        val DescribeInstanceAttribute = _DescribeInstanceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html 
        //  Describes one or more of your instances.    
        val DescribeInstances = _DescribeInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceStatus.html 
        //  Describes the status of one or more instances.    
        val DescribeInstanceStatus = _DescribeInstanceStatus() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInternetGateways.html 
        //  Describes one or more of your Internet gateways.    
        val DescribeInternetGateways = _DescribeInternetGateways() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeFlowLogs.html 
        //  Describes one or more flow logs.    
        val DescribeFlowLogs = _DescribeFlowLogs() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeKeyPairs.html 
        //  Describes one or more of your key pairs.    
        val DescribeKeyPairs = _DescribeKeyPairs() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeMovingAddresses.html 
        //  Describes your Elastic IP addresses that are being moved to the EC2-VPC platform, or that are being restored to the EC2-Classic platform.    
        val DescribeMovingAddresses = _DescribeMovingAddresses() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNatGateways.html 
        //  Describes one or more of the your NAT gateways.    
        val DescribeNatGateways = _DescribeNatGateways() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkAcls.html 
        //  Describes one or more of your network ACLs.    
        val DescribeNetworkAcls = _DescribeNetworkAcls() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaceAttribute.html 
        //  Describes a network interface attribute.    
        val DescribeNetworkInterfaceAttribute = _DescribeNetworkInterfaceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html 
        //  Describes one or more of your network interfaces.    
        val DescribeNetworkInterfaces = _DescribeNetworkInterfaces() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePlacementGroups.html 
        //  Describes one or more of your placement groups.    
        val DescribePlacementGroups = _DescribePlacementGroups() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html 
        //  Describes available AWS services in a prefix list format, which includes the prefix list name and prefix list ID of the service and the IP address range for the service.    
        val DescribePrefixLists = _DescribePrefixLists() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeRegions.html 
        //  Describes one or more regions that are currently available to you.    
        val DescribeRegions = _DescribeRegions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeReservedInstances.html 
        //  Describes one or more of the Reserved Instances that you purchased.    
        val DescribeReservedInstances = _DescribeReservedInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeReservedInstancesListings.html 
        //  Describes your account's Reserved Instance listings in the Reserved Instance Marketplace.    
        val DescribeReservedInstancesListings = _DescribeReservedInstancesListings() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeReservedInstancesModifications.html 
        //  Describes the modifications made to your Reserved Instances.    
        val DescribeReservedInstancesModifications = _DescribeReservedInstancesModifications() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeReservedInstancesOfferings.html 
        //  Describes Reserved Instance offerings that are available for purchase.    
        val DescribeReservedInstancesOfferings = _DescribeReservedInstancesOfferings() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeRouteTables.html 
        //  Describes one or more of your route tables.    
        val DescribeRouteTables = _DescribeRouteTables() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeScheduledInstanceAvailability.html 
        //  Finds available schedules that meet the specified criteria.    
        val DescribeScheduledInstanceAvailability = _DescribeScheduledInstanceAvailability() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeScheduledInstances.html 
        //  Describes one or more of your Scheduled Instances.    
        val DescribeScheduledInstances = _DescribeScheduledInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroupReferences.html 
        //  [EC2-VPC only] Describes the VPCs on the other side of a VPC peering connection that are referencing the security groups you've specified in this request.    
        val DescribeSecurityGroupReferences = _DescribeSecurityGroupReferences() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html 
        //  Describes one or more of your security groups.    
        val DescribeSecurityGroups = _DescribeSecurityGroups() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeStaleSecurityGroups.html 
        //  [EC2-VPC only] Describes the stale security group rules for security groups in a specified VPC.    
        val DescribeStaleSecurityGroups = _DescribeStaleSecurityGroups() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshotAttribute.html 
        //  Describes the specified attribute of the specified snapshot.    
        val DescribeSnapshotAttribute = _DescribeSnapshotAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html 
        //  Describes one or more of the EBS snapshots available to you.    
        val DescribeSnapshots = _DescribeSnapshots() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotDatafeedSubscription.html 
        //  Describes the data feed for Spot instances.    
        val DescribeSpotDatafeedSubscription = _DescribeSpotDatafeedSubscription() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotFleetInstances.html 
        //  Describes the running instances for the specified Spot fleet.    
        val DescribeSpotFleetInstances = _DescribeSpotFleetInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotFleetRequestHistory.html 
        //  Describes the events for the specified Spot fleet request during the specified time.    
        val DescribeSpotFleetRequestHistory = _DescribeSpotFleetRequestHistory() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotFleetRequests.html 
        //  Describes your Spot fleet requests.    
        val DescribeSpotFleetRequests = _DescribeSpotFleetRequests() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotInstanceRequests.html 
        //  Describes the Spot instance requests that belong to your account.    
        val DescribeSpotInstanceRequests = _DescribeSpotInstanceRequests() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html 
        //  Describes the Spot price history.    
        val DescribeSpotPriceHistory = _DescribeSpotPriceHistory() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html 
        //  Describes one or more of your subnets.    
        val DescribeSubnets = _DescribeSubnets() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTags.html 
        //  Describes one or more of the tags for your EC2 resources.    
        val DescribeTags = _DescribeTags() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumeAttribute.html 
        //  Describes the specified attribute of the specified volume.    
        val DescribeVolumeAttribute = _DescribeVolumeAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html 
        //  Describes the specified EBS volumes.    
        val DescribeVolumes = _DescribeVolumes() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumeStatus.html 
        //  Describes the status of the specified volumes.    
        val DescribeVolumeStatus = _DescribeVolumeStatus() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcAttribute.html 
        //  Describes the specified attribute of the specified VPC.    
        val DescribeVpcAttribute = _DescribeVpcAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcClassicLink.html 
        //  Describes the ClassicLink status of one or more VPCs.    
        val DescribeVpcClassicLink = _DescribeVpcClassicLink() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcClassicLinkDnsSupport.html 
        //  Describes the ClassicLink DNS support status of one or more VPCs.    
        val DescribeVpcClassicLinkDnsSupport = _DescribeVpcClassicLinkDnsSupport() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcEndpoints.html 
        //  Describes one or more of your VPC endpoints.    
        val DescribeVpcEndpoints = _DescribeVpcEndpoints() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcEndpointServices.html 
        //  Describes all supported AWS services that can be specified when creating a VPC endpoint.    
        val DescribeVpcEndpointServices = _DescribeVpcEndpointServices() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html 
        //  Describes one or more of your VPC peering connections.    
        val DescribeVpcPeeringConnections = _DescribeVpcPeeringConnections() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcs.html 
        //  Describes one or more of your VPCs.    
        val DescribeVpcs = _DescribeVpcs() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnConnections.html 
        //  Describes one or more of your VPN connections.    
        val DescribeVpnConnections = _DescribeVpnConnections() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnGateways.html 
        //  Describes one or more of your virtual private gateways.    
        val DescribeVpnGateways = _DescribeVpnGateways() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DetachInternetGateway.html 
        //  Detaches an Internet gateway from a VPC, disabling connectivity between the Internet and the VPC.    
        val DetachInternetGateway = _DetachInternetGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DetachNetworkInterface.html 
        //  Detaches a network interface from an instance.    
        val DetachNetworkInterface = _DetachNetworkInterface() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DetachVpnGateway.html 
        //  Detaches a virtual private gateway from a VPC.    
        val DetachVpnGateway = _DetachVpnGateway() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisableVgwRoutePropagation.html 
        //  Disables a virtual private gateway (VGW) from propagating routes to a specified route table of a VPC.    
        val DisableVgwRoutePropagation = _DisableVgwRoutePropagation() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisableVpcClassicLinkDnsSupport.html 
        //  Disables ClassicLink DNS support for a VPC.    
        val DisableVpcClassicLinkDnsSupport = _DisableVpcClassicLinkDnsSupport() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateAddress.html 
        //  Disassociates an Elastic IP address from the instance or network interface it's associated with.    
        val DisassociateAddress = _DisassociateAddress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateRouteTable.html 
        //  Disassociates a subnet from a route table.    
        val DisassociateRouteTable = _DisassociateRouteTable() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableVgwRoutePropagation.html 
        //  Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a VPC.    
        val EnableVgwRoutePropagation = _EnableVgwRoutePropagation() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableVolumeIO.html 
        //  Enables I/O operations for a volume that had I/O operations disabled because the data on the volume was potentially inconsistent.    
        val EnableVolumeIO = _EnableVolumeIO() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableVpcClassicLinkDnsSupport.html 
        //  Enables a VPC to support DNS hostname resolution for ClassicLink.    
        val EnableVpcClassicLinkDnsSupport = _EnableVpcClassicLinkDnsSupport() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetConsoleOutput.html 
        //  Gets the console output for the specified instance.    
        val GetConsoleOutput = _GetConsoleOutput() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html 
        //  Retrieves the encrypted administrator password for an instance running Windows.    
        val GetPasswordData = _GetPasswordData() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportImage.html 
        //  Import single or multi-volume disk images or EBS snapshots into an Amazon Machine Image (AMI).    
        val ImportImage = _ImportImage() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html 
        //  Creates an import instance task using metadata from the specified disk image.    
        val ImportInstance = _ImportInstance() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html 
        //  Imports the public key from an RSA key pair that you created with a third-party tool.    
        val ImportKeyPair = _ImportKeyPair() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportSnapshot.html 
        //  Imports a disk into an EBS snapshot.    
        val ImportSnapshot = _ImportSnapshot() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportVolume.html 
        //  Creates an import volume task using metadata from the specified disk image.    
        val ImportVolume = _ImportVolume() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyHosts.html 
        //  Modify the auto-placement setting of a Dedicated host.    
        val ModifyHosts = _ModifyHosts() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyIdentityIdFormat.html 
        //  Modifies the ID format of a resource for the specified IAM user, IAM role, or root user.    
        val ModifyIdentityIdFormat = _ModifyIdentityIdFormat() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyIdFormat.html 
        //  Modifies the ID format for the specified resource on a per-region basis.    
        val ModifyIdFormat = _ModifyIdFormat() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html 
        //  Modifies the specified attribute of the specified AMI.    
        val ModifyImageAttribute = _ModifyImageAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html 
        //  Modifies the specified attribute of the specified instance.    
        val ModifyInstanceAttribute = _ModifyInstanceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstancePlacement.html 
        //  Set the instance affinity value for a specific stopped instance and modify the instance tenancy setting.    
        val ModifyInstancePlacement = _ModifyInstancePlacement() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyNetworkInterfaceAttribute.html 
        //  Modifies the specified network interface attribute.    
        val ModifyNetworkInterfaceAttribute = _ModifyNetworkInterfaceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyReservedInstances.html 
        //  Modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of your Reserved Instances.    
        val ModifyReservedInstances = _ModifyReservedInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySnapshotAttribute.html 
        //  Adds or removes permission settings for the specified snapshot.    
        val ModifySnapshotAttribute = _ModifySnapshotAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySpotFleetRequest.html 
        //  Modifies the specified Spot fleet request.    
        val ModifySpotFleetRequest = _ModifySpotFleetRequest() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySubnetAttribute.html 
        //  Modifies a subnet attribute.    
        val ModifySubnetAttribute = _ModifySubnetAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVolumeAttribute.html 
        //  Modifies a volume attribute.    
        val ModifyVolumeAttribute = _ModifyVolumeAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcAttribute.html 
        //  Modifies the specified attribute of the specified VPC.    
        val ModifyVpcAttribute = _ModifyVpcAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html 
        //  Modifies attributes of a specified VPC endpoint.    
        val ModifyVpcEndpoint = _ModifyVpcEndpoint() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcPeeringConnectionOptions.html 
        //  Modifies the VPC peering connection options on one side of a VPC peering connection.    
        val ModifyVpcPeeringConnectionOptions = _ModifyVpcPeeringConnectionOptions() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_MonitorInstances.html 
        //  Enables monitoring for a running instance.    
        val MonitorInstances = _MonitorInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_MoveAddressToVpc.html 
        //  Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC platform.    
        val MoveAddressToVpc = _MoveAddressToVpc() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PurchaseReservedInstancesOffering.html 
        //  Purchases a Reserved Instance for use with your account.    
        val PurchaseReservedInstancesOffering = _PurchaseReservedInstancesOffering() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PurchaseScheduledInstances.html 
        //  Purchases one or more Scheduled Instances with the specified schedule.    
        val PurchaseScheduledInstances = _PurchaseScheduledInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RegisterImage.html 
        //  Registers an AMI.    
        val RegisterImage = _RegisterImage() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReleaseAddress.html 
        //  Releases the specified Elastic IP address.    
        val ReleaseAddress = _ReleaseAddress() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReleaseHosts.html 
        //  When you no longer want to use a Dedicated host it can be released.    
        val ReleaseHosts = _ReleaseHosts() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReplaceNetworkAclAssociation.html 
        //  Changes which network ACL a subnet is associated with.    
        val ReplaceNetworkAclAssociation = _ReplaceNetworkAclAssociation() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReplaceNetworkAclEntry.html 
        //  Replaces an entry (rule) in a network ACL.    
        val ReplaceNetworkAclEntry = _ReplaceNetworkAclEntry() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReplaceRoute.html 
        //  Replaces an existing route within a route table in a VPC.    
        val ReplaceRoute = _ReplaceRoute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReplaceRouteTableAssociation.html 
        //  Changes the route table associated with a given subnet in a VPC.    
        val ReplaceRouteTableAssociation = _ReplaceRouteTableAssociation() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ReportInstanceStatus.html 
        //  Submits feedback about the status of an instance.    
        val ReportInstanceStatus = _ReportInstanceStatus() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html 
        //  Creates a Spot fleet request.    
        val RequestSpotFleet = _RequestSpotFleet() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html 
        //  Creates a Spot instance request.    
        val RequestSpotInstances = _RequestSpotInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ResetImageAttribute.html 
        //  Resets an attribute of an AMI to its default value.    
        val ResetImageAttribute = _ResetImageAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ResetInstanceAttribute.html 
        //  Resets an attribute of an instance to its default value.    
        val ResetInstanceAttribute = _ResetInstanceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ResetNetworkInterfaceAttribute.html 
        //  Resets a network interface attribute.    
        val ResetNetworkInterfaceAttribute = _ResetNetworkInterfaceAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ResetSnapshotAttribute.html 
        //  Resets permission settings for the specified snapshot.    
        val ResetSnapshotAttribute = _ResetSnapshotAttribute() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RestoreAddressToClassic.html 
        //  Restores an Elastic IP address that was previously moved to the EC2-VPC platform back to the EC2-Classic platform.    
        val RestoreAddressToClassic = _RestoreAddressToClassic() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunScheduledInstances.html 
        //  Launches the specified Scheduled Instances.    
        val RunScheduledInstances = _RunScheduledInstances() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_UnassignPrivateIpAddresses.html 
        //  Unassigns one or more secondary private IP addresses from a network interface.    
        val UnassignPrivateIpAddresses = _UnassignPrivateIpAddresses() 
        // see http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_UnmonitorInstances.html 
        //  Disables monitoring for a running instance.    
        val UnmonitorInstances = _UnmonitorInstances()
    }
      class _AcceptVpcPeeringConnection : IamPolicy.Action("ec2:AcceptVpcPeeringConnection") {
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
             //arn:aws:ec2:$region:$account:vpc-peering-connection/*"
            fun vpcpeeringconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/*")
             //arn:aws:ec2:$region:$account:vpc-peering-connection/$vpc-peering-connection-id"
            fun vpcpeeringconnection_byRegionAccountVpcpeeringconnectionid(region: String, account: String, vpcpeeringconnectionid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/$vpcpeeringconnectionid")
         }       
 
      class _AssociateIamInstanceProfile : IamPolicy.Action("ec2:AssociateIamInstanceProfile") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _AttachClassicLinkVpc : IamPolicy.Action("ec2:AttachClassicLinkVpc") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
         }       
 
      class _AttachVolume : IamPolicy.Action("ec2:AttachVolume") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
             //arn:aws:ec2:$region:$account:volume/$volume-id"
            fun volume_byRegionAccountVolumeid(region: String, account: String, volumeid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/$volumeid")
         }       
 
      class _AuthorizeSecurityGroupEgress : IamPolicy.Action("ec2:AuthorizeSecurityGroupEgress") {
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
         }       
 
      class _AuthorizeSecurityGroupIngress : IamPolicy.Action("ec2:AuthorizeSecurityGroupIngress") {
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
         }       
 
      class _CreateTags : IamPolicy.Action("ec2:CreateTags") {
             //arn:aws:ec2:$region:$account:dhcp-options/*"
            fun dhcpoptions_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/*")
             //arn:aws:ec2:$region:$account:dhcp-options/$dhcp-options-id"
            fun dhcpoptions_byRegionAccountDhcpoptionsid(region: String, account: String, dhcpoptionsid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/$dhcpoptionsid")
             //arn:aws:ec2:$region::image/*"
            fun image_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/*")
             //arn:aws:ec2:$region::image/$image-id"
            fun image_byRegionImageid(region: String, imageid: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/$imageid")
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:internet-gateway/*"
            fun internetgateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/*")
             //arn:aws:ec2:$region:$account:internet-gateway/$igw-id"
            fun internetgateway_byRegionAccountIgwid(region: String, account: String, igwid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/$igwid")
             //arn:aws:ec2:$region:$account:network-acl/*"
            fun networkacl_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/*")
             //arn:aws:ec2:$region:$account:network-acl/$nacl-id"
            fun networkacl_byRegionAccountNaclid(region: String, account: String, naclid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/$naclid")
             //arn:aws:ec2:$region:$account:network-interface/*"
            fun networkinterface_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface/*")
             //arn:aws:ec2:$region:$account:network-interface/$eni-id"
            fun networkinterface_byRegionAccountEniid(region: String, account: String, eniid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface/$eniid")
             //arn:aws:ec2:$region:$account:reserved-instance/*"
            fun reservedinstance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:reserved-instance/*")
             //arn:aws:ec2:$region:$account:reserved-instance/$reservation-id"
            fun reservedinstance_byRegionAccountReservationid(region: String, account: String, reservationid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:reserved-instance/$reservationid")
             //arn:aws:ec2:$region:$account:route-table/*"
            fun routetable_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/*")
             //arn:aws:ec2:$region:$account:route-table/$route-table-id"
            fun routetable_byRegionAccountRoutetableid(region: String, account: String, routetableid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/$routetableid")
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
             //arn:aws:ec2:$region::snapshot/*"
            fun snapshot_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/*")
             //arn:aws:ec2:$region::snapshot/$snapshot-id"
            fun snapshot_byRegionSnapshotid(region: String, snapshotid: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/$snapshotid")
             //arn:aws:ec2:$region:$account:spot-instance-request/*"
            fun spotinstancerequest_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:spot-instance-request/*")
             //arn:aws:ec2:$region:$account:spot-instance-request/$spot-instance-request-id"
            fun spotinstancerequest_byRegionAccountSpotinstancerequestid(region: String, account: String, spotinstancerequestid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:spot-instance-request/$spotinstancerequestid")
             //arn:aws:ec2:$region:$account:subnet/*"
            fun subnet_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/*")
             //arn:aws:ec2:$region:$account:subnet/$subnet-id"
            fun subnet_byRegionAccountSubnetid(region: String, account: String, subnetid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/$subnetid")
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
             //arn:aws:ec2:$region:$account:volume/$volume-id"
            fun volume_byRegionAccountVolumeid(region: String, account: String, volumeid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/$volumeid")
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
             //arn:aws:ec2:$region:$account:vpn-connection/*"
            fun vpnconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-connection/*")
             //arn:aws:ec2:$region:$account:vpn-connection/$vpn-connection-id"
            fun vpnconnection_byRegionAccountVpnconnectionid(region: String, account: String, vpnconnectionid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-connection/$vpnconnectionid")
             //arn:aws:ec2:$region:$account:vpn-gateway/*"
            fun vpngateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-gateway/*")
             //arn:aws:ec2:$region:$account:vpn-gateway/$vpn-gateway-id"
            fun vpngateway_byRegionAccountVpngatewayid(region: String, account: String, vpngatewayid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-gateway/$vpngatewayid")
         }       
 
      class _CreateVolume : IamPolicy.Action("ec2:CreateVolume") {
             //arn:aws:ec2:region:account:volume/*"
            fun arnawsec2regionaccountvolumeAll() = IamPolicy.Resource("arn:aws:ec2:region:account:volume/*")
         }       
 
      class _CreateVpcPeeringConnection : IamPolicy.Action("ec2:CreateVpcPeeringConnection") {
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
             //arn:aws:ec2:$region:$account:vpc-peering-connection/*"
            fun vpcpeeringconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/*")
         }       
 
      class _DeleteCustomerGateway : IamPolicy.Action("ec2:DeleteCustomerGateway") {
             //arn:aws:ec2:$region:$account:customer-gateway/*"
            fun customergateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:customer-gateway/*")
             //arn:aws:ec2:$region:$account:customer-gateway/$cgw-id"
            fun customergateway_byRegionAccountCgwid(region: String, account: String, cgwid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:customer-gateway/$cgwid")
         }       
 
      class _DeleteDhcpOptions : IamPolicy.Action("ec2:DeleteDhcpOptions") {
             //arn:aws:ec2:$region:$account:dhcp-options/*"
            fun dhcpoptions_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/*")
             //arn:aws:ec2:$region:$account:dhcp-options/$dhcp-options-id"
            fun dhcpoptions_byRegionAccountDhcpoptionsid(region: String, account: String, dhcpoptionsid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/$dhcpoptionsid")
         }       
 
      class _DeleteInternetGateway : IamPolicy.Action("ec2:DeleteInternetGateway") {
             //arn:aws:ec2:$region:$account:internet-gateway/*"
            fun internetgateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/*")
             //arn:aws:ec2:$region:$account:internet-gateway/igw-id"
            fun internetgateway_igwid_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/igw-id")
         }       
 
      class _DeleteNetworkAcl : IamPolicy.Action("ec2:DeleteNetworkAcl") {
             //arn:aws:ec2:$region:$account:network-acl/*"
            fun networkacl_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/*")
             //arn:aws:ec2:$region:$account:network-acl/nacl-id"
            fun networkacl_naclid_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/nacl-id")
         }       
 
      class _DeleteNetworkAclEntry : IamPolicy.Action("ec2:DeleteNetworkAclEntry") {
             //arn:aws:ec2:$region:$account:network-acl/*"
            fun networkacl_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/*")
             //arn:aws:ec2:$region:$account:network-acl/$nacl-id"
            fun networkacl_byRegionAccountNaclid(region: String, account: String, naclid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/$naclid")
         }       
 
      class _DeleteRoute : IamPolicy.Action("ec2:DeleteRoute") {
             //arn:aws:ec2:$region:$account:route-table/*"
            fun routetable_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/*")
             //arn:aws:ec2:$region:$account:route-table/$route-table-id"
            fun routetable_byRegionAccountRoutetableid(region: String, account: String, routetableid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/$routetableid")
         }       
 
      class _DeleteRouteTable : IamPolicy.Action("ec2:DeleteRouteTable") {
             //arn:aws:ec2:$region:$account:route-table/*"
            fun routetable_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/*")
             //arn:aws:ec2:$region:$account:route-table/$route-table-id"
            fun routetable_byRegionAccountRoutetableid(region: String, account: String, routetableid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/$routetableid")
         }       
 
      class _DeleteSecurityGroup : IamPolicy.Action("ec2:DeleteSecurityGroup") {
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
         }       
 
      class _DeleteTags : IamPolicy.Action("ec2:DeleteTags") {
             //arn:aws:ec2:$region:$account:dhcp-options/*"
            fun dhcpoptions_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/*")
             //arn:aws:ec2:$region:$account:dhcp-options/$dhcp-options-id"
            fun dhcpoptions_byRegionAccountDhcpoptionsid(region: String, account: String, dhcpoptionsid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:dhcp-options/$dhcpoptionsid")
             //arn:aws:ec2:$region::image/*"
            fun image_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/*")
             //arn:aws:ec2:$region::image/$image-id"
            fun image_byRegionImageid(region: String, imageid: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/$imageid")
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:internet-gateway/*"
            fun internetgateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/*")
             //arn:aws:ec2:$region:$account:internet-gateway/$igw-id"
            fun internetgateway_byRegionAccountIgwid(region: String, account: String, igwid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:internet-gateway/$igwid")
             //arn:aws:ec2:$region:$account:network-acl/*"
            fun networkacl_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/*")
             //arn:aws:ec2:$region:$account:network-acl/$nacl-id"
            fun networkacl_byRegionAccountNaclid(region: String, account: String, naclid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-acl/$naclid")
             //arn:aws:ec2:$region:$account:network-interface/*"
            fun networkinterface_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface/*")
             //arn:aws:ec2:$region:$account:network-interface$eni-id"
            fun networkinterface_byRegionAccountEniid(region: String, account: String, eniid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface$eniid")
             //arn:aws:ec2:$region:$account:reserved-instance/*"
            fun reservedinstance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:reserved-instance/*")
             //arn:aws:ec2:$region:$account:reserved-instance/$reservation-id"
            fun reservedinstance_byRegionAccountReservationid(region: String, account: String, reservationid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:reserved-instance/$reservationid")
             //arn:aws:ec2:$region:$account:route-table/*"
            fun routetable_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/*")
             //arn:aws:ec2:$region:$account:route-table/$route-table-id"
            fun routetable_byRegionAccountRoutetableid(region: String, account: String, routetableid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:route-table/$routetableid")
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
             //arn:aws:ec2:$region::snapshot/*"
            fun snapshot_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/*")
             //arn:aws:ec2:$region::snapshot/$snapshot-id"
            fun snapshot_byRegionSnapshotid(region: String, snapshotid: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/$snapshotid")
             //arn:aws:ec2:$region:$account:spot-instance-request/*"
            fun spotinstancerequest_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:spot-instance-request/*")
             //arn:aws:ec2:$region:$account:spot-instance-request/$spot-instance-request-id"
            fun spotinstancerequest_byRegionAccountSpotinstancerequestid(region: String, account: String, spotinstancerequestid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:spot-instance-request/$spotinstancerequestid")
             //arn:aws:ec2:$region:$account:subnet/*"
            fun subnet_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/*")
             //arn:aws:ec2:$region:$account:subnet/$subnet-id"
            fun subnet_byRegionAccountSubnetid(region: String, account: String, subnetid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/$subnetid")
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
             //arn:aws:ec2:$region:$account:volume/$volume-id"
            fun volume_byRegionAccountVolumeid(region: String, account: String, volumeid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/$volumeid")
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
             //arn:aws:ec2:$region:$account:vpn-connection/*"
            fun vpnconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-connection/*")
             //arn:aws:ec2:$region:$account:vpn-connection/$vpn-connection-id"
            fun vpnconnection_byRegionAccountVpnconnectionid(region: String, account: String, vpnconnectionid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpn-connection/$vpnconnectionid")
             //arn:aws:ec2$region:$account:vpn-gateway/*"
            fun vpngateway_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2$region:$account:vpn-gateway/*")
             //arn:aws:ec2$region:$account:vpn-gateway/$vpn-gateway-id"
            fun vpngateway_byRegionAccountVpngatewayid(region: String, account: String, vpngatewayid: String) = IamPolicy.Resource("arn:aws:ec2$region:$account:vpn-gateway/$vpngatewayid")
         }       
 
      class _DeleteVolume : IamPolicy.Action("ec2:DeleteVolume") {
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
             //arn:aws:ec2:$region:$account:volume/$volume-id"
            fun volume_byRegionAccountVolumeid(region: String, account: String, volumeid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/$volumeid")
         }       
 
      class _DeleteVpcPeeringConnection : IamPolicy.Action("ec2:DeleteVpcPeeringConnection") {
             //arn:aws:ec2:$region:$account:vpc-peering-connection/*"
            fun vpcpeeringconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/*")
             //arn:aws:ec2:$region:$account:vpc-peering-connection/$vpc-peering-connection-id"
            fun vpcpeeringconnection_byRegionAccountVpcpeeringconnectionid(region: String, account: String, vpcpeeringconnectionid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/$vpcpeeringconnectionid")
         }       
 
      class _DetachClassicLinkVpc : IamPolicy.Action("ec2:DetachClassicLinkVpc") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
         }       
 
      class _DetachVolume : IamPolicy.Action("ec2:DetachVolume") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
             //arn:aws:ec2:$region:$account:volume/$volume-id"
            fun volume_byRegionAccountVolumeid(region: String, account: String, volumeid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/$volumeid")
         }       
 
      class _DisableVpcClassicLink : IamPolicy.Action("ec2:DisableVpcClassicLink") {
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
         }       
 
      class _DisassociateIamInstanceProfile : IamPolicy.Action("ec2:DisassociateIamInstanceProfile") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _EnableVpcClassicLink : IamPolicy.Action("ec2:EnableVpcClassicLink") {
             //arn:aws:ec2:$region:$account:vpc/*"
            fun vpc_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/*")
             //arn:aws:ec2:$region:$account:vpc/$vpc-id"
            fun vpc_byRegionAccountVpcid(region: String, account: String, vpcid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc/$vpcid")
         }       
 
      class _GetConsoleScreenshot : IamPolicy.Action("ec2:GetConsoleScreenshot") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _RebootInstances : IamPolicy.Action("ec2:RebootInstances") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _RejectVpcPeeringConnection : IamPolicy.Action("ec2:RejectVpcPeeringConnection") {
             //arn:aws:ec2:$region:$account:vpc-peering-connection/*"
            fun vpcpeeringconnection_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/*")
             //arn:aws:ec2:$region:$account:vpc-peering-connection/$vpc-peering-connection-id"
            fun vpcpeeringconnection_byRegionAccountVpcpeeringconnectionid(region: String, account: String, vpcpeeringconnectionid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:vpc-peering-connection/$vpcpeeringconnectionid")
         }       
 
      class _ReplaceIamInstanceProfileAssociation : IamPolicy.Action("ec2:ReplaceIamInstanceProfileAssociation") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _RevokeSecurityGroupEgress : IamPolicy.Action("ec2:RevokeSecurityGroupEgress") {
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
         }       
 
      class _RevokeSecurityGroupIngress : IamPolicy.Action("ec2:RevokeSecurityGroupIngress") {
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
         }       
 
      class _RunInstances : IamPolicy.Action("ec2:RunInstances") {
             //arn:aws:ec2:$region::image/*"
            fun image_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/*")
             //arn:aws:ec2:$region::image/$image-id"
            fun image_byRegionImageid(region: String, imageid: String) = IamPolicy.Resource("arn:aws:ec2:$region::image/$imageid")
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:key-pair/*"
            fun keypair_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:key-pair/*")
             //arn:aws:ec2:$region:$account:key-pair/$key-pair-name"
            fun keypair_byRegionAccountKeypairname(region: String, account: String, keypairname: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:key-pair/$keypairname")
             //arn:aws:ec2:$region:$account:network-interface/*"
            fun networkinterface_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface/*")
             //arn:aws:ec2:$region:$account:network-interface/$eni-id"
            fun networkinterface_byRegionAccountEniid(region: String, account: String, eniid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:network-interface/$eniid")
             //arn:aws:ec2:$region:$account:placement-group/*"
            fun placementgroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:placement-group/*")
             //arn:aws:ec2:$region:$account:placement-group/$placement-group-name"
            fun placementgroup_byRegionAccountPlacementgroupname(region: String, account: String, placementgroupname: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:placement-group/$placementgroupname")
             //arn:aws:ec2:$region:$account:security-group/*"
            fun securitygroup_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/*")
             //arn:aws:ec2:$region:$account:security-group/$security-group-id"
            fun securitygroup_byRegionAccountSecuritygroupid(region: String, account: String, securitygroupid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:security-group/$securitygroupid")
             //arn:aws:ec2:$region::snapshot/*"
            fun snapshot_all_byRegion(region: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/*")
             //arn:aws:ec2:$region::snapshot/$snapshot-id"
            fun snapshot_byRegionSnapshotid(region: String, snapshotid: String) = IamPolicy.Resource("arn:aws:ec2:$region::snapshot/$snapshotid")
             //arn:aws:ec2:$region:$account:subnet/*"
            fun subnet_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/*")
             //arn:aws:ec2:$region:$account:subnet/$subnet-id"
            fun subnet_byRegionAccountSubnetid(region: String, account: String, subnetid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:subnet/$subnetid")
             //arn:aws:ec2:$region:$account:volume/*"
            fun volume_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:volume/*")
         }       
 
      class _StartInstances : IamPolicy.Action("ec2:StartInstances") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _StopInstances : IamPolicy.Action("ec2:StopInstances") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _TerminateInstances : IamPolicy.Action("ec2:TerminateInstances") {
             //arn:aws:ec2:$region:$account:instance/*"
            fun instance_all_byRegionAccount(region: String, account: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/*")
             //arn:aws:ec2:$region:$account:instance/$instance-id"
            fun instance_byRegionAccountInstanceid(region: String, account: String, instanceid: String) = IamPolicy.Resource("arn:aws:ec2:$region:$account:instance/$instanceid")
         }       
 
      class _AllocateAddress : IamPolicy.Action("ec2:AllocateAddress") {

         }       
 
      class _AllocateHosts : IamPolicy.Action("ec2:AllocateHosts") {

         }       
 
      class _AssignPrivateIpAddresses : IamPolicy.Action("ec2:AssignPrivateIpAddresses") {

         }       
 
      class _AssociateAddress : IamPolicy.Action("ec2:AssociateAddress") {

         }       
 
      class _AssociateDhcpOptions : IamPolicy.Action("ec2:AssociateDhcpOptions") {

         }       
 
      class _AssociateRouteTable : IamPolicy.Action("ec2:AssociateRouteTable") {

         }       
 
      class _AttachInternetGateway : IamPolicy.Action("ec2:AttachInternetGateway") {

         }       
 
      class _AttachNetworkInterface : IamPolicy.Action("ec2:AttachNetworkInterface") {

         }       
 
      class _AttachVpnGateway : IamPolicy.Action("ec2:AttachVpnGateway") {

         }       
 
      class _BundleInstance : IamPolicy.Action("ec2:BundleInstance") {

         }       
 
      class _CancelBundleTask : IamPolicy.Action("ec2:CancelBundleTask") {

         }       
 
      class _CancelConversionTask : IamPolicy.Action("ec2:CancelConversionTask") {

         }       
 
      class _CancelExportTask : IamPolicy.Action("ec2:CancelExportTask") {

         }       
 
      class _CancelImportTask : IamPolicy.Action("ec2:CancelImportTask") {

         }       
 
      class _CancelReservedInstancesListing : IamPolicy.Action("ec2:CancelReservedInstancesListing") {

         }       
 
      class _CancelSpotFleetRequests : IamPolicy.Action("ec2:CancelSpotFleetRequests") {

         }       
 
      class _CancelSpotInstanceRequests : IamPolicy.Action("ec2:CancelSpotInstanceRequests") {

         }       
 
      class _ConfirmProductInstance : IamPolicy.Action("ec2:ConfirmProductInstance") {

         }       
 
      class _CopyImage : IamPolicy.Action("ec2:CopyImage") {

         }       
 
      class _CopySnapshot : IamPolicy.Action("ec2:CopySnapshot") {

         }       
 
      class _CreateCustomerGateway : IamPolicy.Action("ec2:CreateCustomerGateway") {

         }       
 
      class _CreateDhcpOptions : IamPolicy.Action("ec2:CreateDhcpOptions") {

         }       
 
      class _CreateFlowLogs : IamPolicy.Action("ec2:CreateFlowLogs") {

         }       
 
      class _CreateImage : IamPolicy.Action("ec2:CreateImage") {

         }       
 
      class _CreateInstanceExportTask : IamPolicy.Action("ec2:CreateInstanceExportTask") {

         }       
 
      class _CreateInternetGateway : IamPolicy.Action("ec2:CreateInternetGateway") {

         }       
 
      class _CreateKeyPair : IamPolicy.Action("ec2:CreateKeyPair") {

         }       
 
      class _CreateNatGateway : IamPolicy.Action("ec2:CreateNatGateway") {

         }       
 
      class _CreateNetworkAcl : IamPolicy.Action("ec2:CreateNetworkAcl") {

         }       
 
      class _CreateNetworkAclEntry : IamPolicy.Action("ec2:CreateNetworkAclEntry") {

         }       
 
      class _CreateNetworkInterface : IamPolicy.Action("ec2:CreateNetworkInterface") {

         }       
 
      class _CreatePlacementGroup : IamPolicy.Action("ec2:CreatePlacementGroup") {

         }       
 
      class _CreateReservedInstancesListing : IamPolicy.Action("ec2:CreateReservedInstancesListing") {

         }       
 
      class _CreateRoute : IamPolicy.Action("ec2:CreateRoute") {

         }       
 
      class _CreateRouteTable : IamPolicy.Action("ec2:CreateRouteTable") {

         }       
 
      class _CreateSecurityGroup : IamPolicy.Action("ec2:CreateSecurityGroup") {

         }       
 
      class _CreateSnapshot : IamPolicy.Action("ec2:CreateSnapshot") {

         }       
 
      class _CreateSpotDatafeedSubscription : IamPolicy.Action("ec2:CreateSpotDatafeedSubscription") {

         }       
 
      class _CreateSubnet : IamPolicy.Action("ec2:CreateSubnet") {

         }       
 
      class _CreateVpc : IamPolicy.Action("ec2:CreateVpc") {

         }       
 
      class _CreateVpcEndpoint : IamPolicy.Action("ec2:CreateVpcEndpoint") {

         }       
 
      class _CreateVpnConnection : IamPolicy.Action("ec2:CreateVpnConnection") {

         }       
 
      class _CreateVpnConnectionRoute : IamPolicy.Action("ec2:CreateVpnConnectionRoute") {

         }       
 
      class _CreateVpnGateway : IamPolicy.Action("ec2:CreateVpnGateway") {

         }       
 
      class _DeleteFlowLogs : IamPolicy.Action("ec2:DeleteFlowLogs") {

         }       
 
      class _DeleteKeyPair : IamPolicy.Action("ec2:DeleteKeyPair") {

         }       
 
      class _DeleteNatGateway : IamPolicy.Action("ec2:DeleteNatGateway") {

         }       
 
      class _DeleteNetworkInterface : IamPolicy.Action("ec2:DeleteNetworkInterface") {

         }       
 
      class _DeletePlacementGroup : IamPolicy.Action("ec2:DeletePlacementGroup") {

         }       
 
      class _DeleteSnapshot : IamPolicy.Action("ec2:DeleteSnapshot") {

         }       
 
      class _DeleteSpotDatafeedSubscription : IamPolicy.Action("ec2:DeleteSpotDatafeedSubscription") {

         }       
 
      class _DeleteSubnet : IamPolicy.Action("ec2:DeleteSubnet") {

         }       
 
      class _DeleteVpc : IamPolicy.Action("ec2:DeleteVpc") {

         }       
 
      class _DeleteVpcEndpoints : IamPolicy.Action("ec2:DeleteVpcEndpoints") {

         }       
 
      class _DeleteVpnConnection : IamPolicy.Action("ec2:DeleteVpnConnection") {

         }       
 
      class _DeleteVpnConnectionRoute : IamPolicy.Action("ec2:DeleteVpnConnectionRoute") {

         }       
 
      class _DeleteVpnGateway : IamPolicy.Action("ec2:DeleteVpnGateway") {

         }       
 
      class _DeregisterImage : IamPolicy.Action("ec2:DeregisterImage") {

         }       
 
      class _DescribeAccountAttributes : IamPolicy.Action("ec2:DescribeAccountAttributes") {

         }       
 
      class _DescribeAddresses : IamPolicy.Action("ec2:DescribeAddresses") {

         }       
 
      class _DescribeAvailabilityZones : IamPolicy.Action("ec2:DescribeAvailabilityZones") {

         }       
 
      class _DescribeBundleTasks : IamPolicy.Action("ec2:DescribeBundleTasks") {

         }       
 
      class _DescribeClassicLinkInstances : IamPolicy.Action("ec2:DescribeClassicLinkInstances") {

         }       
 
      class _DescribeConversionTasks : IamPolicy.Action("ec2:DescribeConversionTasks") {

         }       
 
      class _DescribeCustomerGateways : IamPolicy.Action("ec2:DescribeCustomerGateways") {

         }       
 
      class _DescribeDhcpOptions : IamPolicy.Action("ec2:DescribeDhcpOptions") {

         }       
 
      class _DescribeExportTasks : IamPolicy.Action("ec2:DescribeExportTasks") {

         }       
 
      class _DescribeHosts : IamPolicy.Action("ec2:DescribeHosts") {

         }       
 
      class _DescribeIdentityIdFormat : IamPolicy.Action("ec2:DescribeIdentityIdFormat") {

         }       
 
      class _DescribeIdFormat : IamPolicy.Action("ec2:DescribeIdFormat") {

         }       
 
      class _DescribeImageAttribute : IamPolicy.Action("ec2:DescribeImageAttribute") {

         }       
 
      class _DescribeImages : IamPolicy.Action("ec2:DescribeImages") {

         }       
 
      class _DescribeImportImageTasks : IamPolicy.Action("ec2:DescribeImportImageTasks") {

         }       
 
      class _DescribeImportSnapshotTasks : IamPolicy.Action("ec2:DescribeImportSnapshotTasks") {

         }       
 
      class _DescribeInstanceAttribute : IamPolicy.Action("ec2:DescribeInstanceAttribute") {

         }       
 
      class _DescribeInstances : IamPolicy.Action("ec2:DescribeInstances") {

         }       
 
      class _DescribeInstanceStatus : IamPolicy.Action("ec2:DescribeInstanceStatus") {

         }       
 
      class _DescribeInternetGateways : IamPolicy.Action("ec2:DescribeInternetGateways") {

         }       
 
      class _DescribeFlowLogs : IamPolicy.Action("ec2:DescribeFlowLogs") {

         }       
 
      class _DescribeKeyPairs : IamPolicy.Action("ec2:DescribeKeyPairs") {

         }       
 
      class _DescribeMovingAddresses : IamPolicy.Action("ec2:DescribeMovingAddresses") {

         }       
 
      class _DescribeNatGateways : IamPolicy.Action("ec2:DescribeNatGateways") {

         }       
 
      class _DescribeNetworkAcls : IamPolicy.Action("ec2:DescribeNetworkAcls") {

         }       
 
      class _DescribeNetworkInterfaceAttribute : IamPolicy.Action("ec2:DescribeNetworkInterfaceAttribute") {

         }       
 
      class _DescribeNetworkInterfaces : IamPolicy.Action("ec2:DescribeNetworkInterfaces") {

         }       
 
      class _DescribePlacementGroups : IamPolicy.Action("ec2:DescribePlacementGroups") {

         }       
 
      class _DescribePrefixLists : IamPolicy.Action("ec2:DescribePrefixLists") {

         }       
 
      class _DescribeRegions : IamPolicy.Action("ec2:DescribeRegions") {

         }       
 
      class _DescribeReservedInstances : IamPolicy.Action("ec2:DescribeReservedInstances") {

         }       
 
      class _DescribeReservedInstancesListings : IamPolicy.Action("ec2:DescribeReservedInstancesListings") {

         }       
 
      class _DescribeReservedInstancesModifications : IamPolicy.Action("ec2:DescribeReservedInstancesModifications") {

         }       
 
      class _DescribeReservedInstancesOfferings : IamPolicy.Action("ec2:DescribeReservedInstancesOfferings") {

         }       
 
      class _DescribeRouteTables : IamPolicy.Action("ec2:DescribeRouteTables") {

         }       
 
      class _DescribeScheduledInstanceAvailability : IamPolicy.Action("ec2:DescribeScheduledInstanceAvailability") {

         }       
 
      class _DescribeScheduledInstances : IamPolicy.Action("ec2:DescribeScheduledInstances") {

         }       
 
      class _DescribeSecurityGroupReferences : IamPolicy.Action("ec2:DescribeSecurityGroupReferences") {

         }       
 
      class _DescribeSecurityGroups : IamPolicy.Action("ec2:DescribeSecurityGroups") {

         }       
 
      class _DescribeStaleSecurityGroups : IamPolicy.Action("ec2:DescribeStaleSecurityGroups") {

         }       
 
      class _DescribeSnapshotAttribute : IamPolicy.Action("ec2:DescribeSnapshotAttribute") {

         }       
 
      class _DescribeSnapshots : IamPolicy.Action("ec2:DescribeSnapshots") {

         }       
 
      class _DescribeSpotDatafeedSubscription : IamPolicy.Action("ec2:DescribeSpotDatafeedSubscription") {

         }       
 
      class _DescribeSpotFleetInstances : IamPolicy.Action("ec2:DescribeSpotFleetInstances") {

         }       
 
      class _DescribeSpotFleetRequestHistory : IamPolicy.Action("ec2:DescribeSpotFleetRequestHistory") {

         }       
 
      class _DescribeSpotFleetRequests : IamPolicy.Action("ec2:DescribeSpotFleetRequests") {

         }       
 
      class _DescribeSpotInstanceRequests : IamPolicy.Action("ec2:DescribeSpotInstanceRequests") {

         }       
 
      class _DescribeSpotPriceHistory : IamPolicy.Action("ec2:DescribeSpotPriceHistory") {

         }       
 
      class _DescribeSubnets : IamPolicy.Action("ec2:DescribeSubnets") {

         }       
 
      class _DescribeTags : IamPolicy.Action("ec2:DescribeTags") {

         }       
 
      class _DescribeVolumeAttribute : IamPolicy.Action("ec2:DescribeVolumeAttribute") {

         }       
 
      class _DescribeVolumes : IamPolicy.Action("ec2:DescribeVolumes") {

         }       
 
      class _DescribeVolumeStatus : IamPolicy.Action("ec2:DescribeVolumeStatus") {

         }       
 
      class _DescribeVpcAttribute : IamPolicy.Action("ec2:DescribeVpcAttribute") {

         }       
 
      class _DescribeVpcClassicLink : IamPolicy.Action("ec2:DescribeVpcClassicLink") {

         }       
 
      class _DescribeVpcClassicLinkDnsSupport : IamPolicy.Action("ec2:DescribeVpcClassicLinkDnsSupport") {

         }       
 
      class _DescribeVpcEndpoints : IamPolicy.Action("ec2:DescribeVpcEndpoints") {

         }       
 
      class _DescribeVpcEndpointServices : IamPolicy.Action("ec2:DescribeVpcEndpointServices") {

         }       
 
      class _DescribeVpcPeeringConnections : IamPolicy.Action("ec2:DescribeVpcPeeringConnections") {

         }       
 
      class _DescribeVpcs : IamPolicy.Action("ec2:DescribeVpcs") {

         }       
 
      class _DescribeVpnConnections : IamPolicy.Action("ec2:DescribeVpnConnections") {

         }       
 
      class _DescribeVpnGateways : IamPolicy.Action("ec2:DescribeVpnGateways") {

         }       
 
      class _DetachInternetGateway : IamPolicy.Action("ec2:DetachInternetGateway") {

         }       
 
      class _DetachNetworkInterface : IamPolicy.Action("ec2:DetachNetworkInterface") {

         }       
 
      class _DetachVpnGateway : IamPolicy.Action("ec2:DetachVpnGateway") {

         }       
 
      class _DisableVgwRoutePropagation : IamPolicy.Action("ec2:DisableVgwRoutePropagation") {

         }       
 
      class _DisableVpcClassicLinkDnsSupport : IamPolicy.Action("ec2:DisableVpcClassicLinkDnsSupport") {

         }       
 
      class _DisassociateAddress : IamPolicy.Action("ec2:DisassociateAddress") {

         }       
 
      class _DisassociateRouteTable : IamPolicy.Action("ec2:DisassociateRouteTable") {

         }       
 
      class _EnableVgwRoutePropagation : IamPolicy.Action("ec2:EnableVgwRoutePropagation") {

         }       
 
      class _EnableVolumeIO : IamPolicy.Action("ec2:EnableVolumeIO") {

         }       
 
      class _EnableVpcClassicLinkDnsSupport : IamPolicy.Action("ec2:EnableVpcClassicLinkDnsSupport") {

         }       
 
      class _GetConsoleOutput : IamPolicy.Action("ec2:GetConsoleOutput") {

         }       
 
      class _GetPasswordData : IamPolicy.Action("ec2:GetPasswordData") {

         }       
 
      class _ImportImage : IamPolicy.Action("ec2:ImportImage") {

         }       
 
      class _ImportInstance : IamPolicy.Action("ec2:ImportInstance") {

         }       
 
      class _ImportKeyPair : IamPolicy.Action("ec2:ImportKeyPair") {

         }       
 
      class _ImportSnapshot : IamPolicy.Action("ec2:ImportSnapshot") {

         }       
 
      class _ImportVolume : IamPolicy.Action("ec2:ImportVolume") {

         }       
 
      class _ModifyHosts : IamPolicy.Action("ec2:ModifyHosts") {

         }       
 
      class _ModifyIdentityIdFormat : IamPolicy.Action("ec2:ModifyIdentityIdFormat") {

         }       
 
      class _ModifyIdFormat : IamPolicy.Action("ec2:ModifyIdFormat") {

         }       
 
      class _ModifyImageAttribute : IamPolicy.Action("ec2:ModifyImageAttribute") {

         }       
 
      class _ModifyInstanceAttribute : IamPolicy.Action("ec2:ModifyInstanceAttribute") {

         }       
 
      class _ModifyInstancePlacement : IamPolicy.Action("ec2:ModifyInstancePlacement") {

         }       
 
      class _ModifyNetworkInterfaceAttribute : IamPolicy.Action("ec2:ModifyNetworkInterfaceAttribute") {

         }       
 
      class _ModifyReservedInstances : IamPolicy.Action("ec2:ModifyReservedInstances") {

         }       
 
      class _ModifySnapshotAttribute : IamPolicy.Action("ec2:ModifySnapshotAttribute") {

         }       
 
      class _ModifySpotFleetRequest : IamPolicy.Action("ec2:ModifySpotFleetRequest") {

         }       
 
      class _ModifySubnetAttribute : IamPolicy.Action("ec2:ModifySubnetAttribute") {

         }       
 
      class _ModifyVolumeAttribute : IamPolicy.Action("ec2:ModifyVolumeAttribute") {

         }       
 
      class _ModifyVpcAttribute : IamPolicy.Action("ec2:ModifyVpcAttribute") {

         }       
 
      class _ModifyVpcEndpoint : IamPolicy.Action("ec2:ModifyVpcEndpoint") {

         }       
 
      class _ModifyVpcPeeringConnectionOptions : IamPolicy.Action("ec2:ModifyVpcPeeringConnectionOptions") {

         }       
 
      class _MonitorInstances : IamPolicy.Action("ec2:MonitorInstances") {

         }       
 
      class _MoveAddressToVpc : IamPolicy.Action("ec2:MoveAddressToVpc") {

         }       
 
      class _PurchaseReservedInstancesOffering : IamPolicy.Action("ec2:PurchaseReservedInstancesOffering") {

         }       
 
      class _PurchaseScheduledInstances : IamPolicy.Action("ec2:PurchaseScheduledInstances") {

         }       
 
      class _RegisterImage : IamPolicy.Action("ec2:RegisterImage") {

         }       
 
      class _ReleaseAddress : IamPolicy.Action("ec2:ReleaseAddress") {

         }       
 
      class _ReleaseHosts : IamPolicy.Action("ec2:ReleaseHosts") {

         }       
 
      class _ReplaceNetworkAclAssociation : IamPolicy.Action("ec2:ReplaceNetworkAclAssociation") {

         }       
 
      class _ReplaceNetworkAclEntry : IamPolicy.Action("ec2:ReplaceNetworkAclEntry") {

         }       
 
      class _ReplaceRoute : IamPolicy.Action("ec2:ReplaceRoute") {

         }       
 
      class _ReplaceRouteTableAssociation : IamPolicy.Action("ec2:ReplaceRouteTableAssociation") {

         }       
 
      class _ReportInstanceStatus : IamPolicy.Action("ec2:ReportInstanceStatus") {

         }       
 
      class _RequestSpotFleet : IamPolicy.Action("ec2:RequestSpotFleet") {

         }       
 
      class _RequestSpotInstances : IamPolicy.Action("ec2:RequestSpotInstances") {

         }       
 
      class _ResetImageAttribute : IamPolicy.Action("ec2:ResetImageAttribute") {

         }       
 
      class _ResetInstanceAttribute : IamPolicy.Action("ec2:ResetInstanceAttribute") {

         }       
 
      class _ResetNetworkInterfaceAttribute : IamPolicy.Action("ec2:ResetNetworkInterfaceAttribute") {

         }       
 
      class _ResetSnapshotAttribute : IamPolicy.Action("ec2:ResetSnapshotAttribute") {

         }       
 
      class _RestoreAddressToClassic : IamPolicy.Action("ec2:RestoreAddressToClassic") {

         }       
 
      class _RunScheduledInstances : IamPolicy.Action("ec2:RunScheduledInstances") {

         }       
 
      class _UnassignPrivateIpAddresses : IamPolicy.Action("ec2:UnassignPrivateIpAddresses") {

         }       
 
      class _UnmonitorInstances : IamPolicy.Action("ec2:UnmonitorInstances") {

         }       


}        
