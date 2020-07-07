package com.mashinarius.tf4j.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The root block device mappings of the Instance
 * https://www.terraform.io/docs/providers/aws/d/instance.html#root_block_device
 */
public class RootBlockDevice {

	// The physical name of the device.
	@JsonProperty("device_name") private String deviceName;

	// If the root block device will be deleted on termination.
	@JsonProperty("delete_on_termination") private Boolean deleteOnTermination;

	// If the EBS volume is encrypted.
	@JsonProperty("encrypted") private Boolean encrypted;

	// If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
	@JsonProperty("iops") private Integer iops = 0;

	// Amazon Resource Name (ARN) of KMS Key, if EBS volume is encrypted.
	@JsonProperty("kms_key_arn") private String kmsKeyArn;

	// The size of the volume, in GiB.
	@JsonProperty("volume_size") private Integer volumeSize;

	// The type of the volume.
	@JsonProperty("volume_type") private String volumeType;
}
