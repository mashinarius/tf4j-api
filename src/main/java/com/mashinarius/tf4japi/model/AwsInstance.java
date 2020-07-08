package com.mashinarius.tf4japi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * https://www.terraform.io/docs/providers/aws/d/instance.html
 */
@Data
public class AwsInstance extends AbstractTerraformDataSource {

	// id is set to the ID of the found Instance.
	@JsonProperty("id") private String id;

	// The ID of the AMI used to launch the instance.
	@JsonProperty("ami") private String ami;

	// The ARN of the instance.
	@JsonProperty("arn") private String arn;

	// Whether or not the Instance is associated with a public IP address or not (Boolean).
	@JsonProperty("associate_public_ip_address") private Boolean associatePublicIpAddress;

	// The availability zone of the Instance.
	@JsonProperty("availability_zone") private String availabilityZone;

	// The EBS block device mappings of the Instance.
	@JsonProperty("ebs_block_device") private EbsBlockDevice ebsBlockDevice;

	// Whether the Instance is EBS optimized or not (Boolean).
	@JsonProperty("ebs_optimized") private Boolean ebsOptimized;

	// The ephemeral block device mappings of the Instance.
	@JsonProperty("ephemeral_block_device") private EphemeralBlockDevice ephemeralBlockDevice;

	// The name of the instance profile associated with the Instance.
	@JsonProperty("iam_instance_profile") private String iamInstanceProfile;

	// The IPv6 addresses associated to the Instance, if applicable.
	// NOTE: Unlike the IPv4 address, this doesn't change if you attach an EIP to the instance.
	@JsonProperty("ipv6_addresses") private List<String> ipv6Addresses;

	/**
	 * The state of the instance. One of: pending, running, shutting-down, terminated, stopping, stopped. See
	 * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html
	 * Instance Lifecycle for more information.
	 */
	@JsonProperty("instance_state") private InstantState instanceState;

	// The type of the Instance.
	@JsonProperty("instance_type") private String instanceType;

	// The key name of the Instance.
	@JsonProperty("key_name") private String keyName;

	// Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
	@JsonProperty("monitoring") private Boolean monitoring;

	//  The ID of the network interface that was created with the Instance.
	@JsonProperty("network_interface_id") private String networkInterfaceId;

	/**
	 * Base-64 encoded encrypted password data for the instance.
	 * Useful for getting the administrator password for instances running Microsoft Windows.
	 * This attribute is only exported if get_password_data is true.
	 * See
	 * https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html
	 * GetPasswordData for more information.
	 */
	@JsonProperty("password_data") private String passwordData;

	// The placement group of the Instance.
	@JsonProperty("placement_group") private String placementGroup;

	// The private DNS name assigned to the Instance. Can only be used inside the Amazon EC2, and only available if you've enabled DNS hostnames for your VPC.
	@JsonProperty("private_dns") private String privateDns;

	// The private IP address assigned to the Instance.
	@JsonProperty("private_ip") private String privateIp;

	// The public DNS name assigned to the Instance. For EC2-VPC, this is only available if you've enabled DNS hostnames for your VPC.
	@JsonProperty("public_dns") private String publicDns;

	// The public IP address assigned to the Instance, if applicable. NOTE: If you are using an
	// aws_eip
	// https://www.terraform.io/docs/providers/aws/r/eip.html
	// with your instance, you should refer to the EIP's address directly and not use public_ip, as this field will change after the EIP is attached.
	@JsonProperty("public_ip") private String publicIp;

	// The root block device mappings of the Instance
	@JsonProperty("root_block_device") private RootBlockDevice rootBlockDevice;

	// The associated security groups.
	@JsonProperty("security_groups") private List<String> securityGroups;

	// Whether the network interface performs source/destination checking (Boolean).
	@JsonProperty("source_dest_check") private Boolean sourceDestCheck;

	// The VPC subnet ID.
	@JsonProperty("subnet_id") private String subnetId;

	// The Amazon Resource Name (ARN) of the Outpost.
	@JsonProperty("outpost_arn") private String outpostArn;

	// SHA-1 hash of User Data supplied to the Instance.
	@JsonProperty("user_data") private String userData;

	// Base64 encoded contents of User Data supplied to the Instance. Valid UTF-8 contents can be decoded with the base64decode function.
	// https://www.terraform.io/docs/configuration/functions/base64decode.html
	// This attribute is only exported if get_user_data is true.
	@JsonProperty("user_data_base64") private String userDataBase64;

	// A map of tags assigned to the Instance.
	@JsonProperty("tags") private Map<String, String> tags;

	// The tenancy of the instance: dedicated, default, host.
	@JsonProperty("tenancy") private String tenancy;

	// The Id of the dedicated host the instance will be assigned to.
	@JsonProperty("host_id") private String hostId;

	// The associated security groups in a non-default VPC.
	@JsonProperty("vpc_security_group_ids") private List<String> vpcSecurityGroupIds;

	// The credit specification of the Instance.
	@JsonProperty("credit_specification") private String creditSpecification;

	// The metadata options of the Instance.
	@JsonProperty("metadata_options") private List<MetadataOption> metadataOptions;

}
