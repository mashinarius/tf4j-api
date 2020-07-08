package com.mashinarius.tf4japi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

/**
 * https://www.terraform.io/docs/providers/aws/r/ami.html
 */
@Data
public class AwsAmi extends AbstractTerraformDataSource {

	// name - (Required) A region-unique name for the AMI.
	@JsonProperty("name") private String name;

	// - (Optional) A longer, human-readable description for the AMI.
	@JsonProperty("description") private String description;

	// - (Optional) Specifies whether enhanced networking with ENA is enabled. Defaults to false.
	@JsonProperty("ena_support") private Boolean enaSupport;

	// - (Optional) The name of the root device (for example, /dev/sda1, or /dev/xvda).
	@JsonProperty("root_device_name") private String rootDeviceName;

	// - (Optional) Keyword to choose what virtualization mode created instances will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type changes the set of further arguments that are required, as described below.
	@JsonProperty("virtualization_type") private VirtualizationType virtualizationType = VirtualizationType.paravirtual;

	//- (Optional) Machine architecture for created instances. Defaults to "x86_64".
	@JsonProperty("architecture") private String architecture = "x86_64";

	// - (Optional) Nested block describing an EBS block device that should be attached to created instances.
	@JsonProperty("ebs_block_device") private EbsBlockDevice ebsBlockDevice;

	// - (Optional) Nested block describing an ephemeral block device that should be attached to created instances.
	@JsonProperty("ephemeral_block_device") private EphemeralBlockDevice ephemeralBlockDevice;

	// - (Optional) A map of tags to assign to the resource.
	@JsonProperty("tags") private Map<String, String> tags;

	// When virtualization_type is "paravirtual" the following additional arguments apply:
	// - (Required) Path to an S3 object containing an image manifest, e.g. created by the ec2-upload-bundle command in the EC2 command line tools.
	@JsonProperty("image_location") private String imageLocation;

	// - (Required) The id of the kernel image (AKI) that will be used as the paravirtual kernel in created instances.
	@JsonProperty("kernel_id") private String kernelId;

	// - (Optional) The id of an initrd image (ARI) that will be used when booting the created instances.
	@JsonProperty("ramdisk_id") private String ramdiskId;

	// When virtualization_type is "hvm" the following additional arguments apply:
	// - (Optional) When set to "simple" (the default), enables enhanced networking for created instances. No other value is supported at this time.
	@JsonProperty("sriov_net_support") private String sriovNetSupport = "simple";

}
