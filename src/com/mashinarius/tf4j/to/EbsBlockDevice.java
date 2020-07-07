package com.mashinarius.tf4j.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EBS block device mappings of the Instance
 *  https://www.terraform.io/docs/providers/aws/d/instance.html#ebs_block_device
 */
public class EbsBlockDevice {

	// If the EBS volume will be deleted on termination.
	@JsonProperty("delete_on_termination") private Boolean deleteOnTermination;

	// The physical name of the device.
	@JsonProperty("device_name") private String deviceName;

	//If the EBS volume is encrypted.
	@JsonProperty("encrypted") private Boolean encrypted;

	// 0 If the EBS volume is not a provisioned IOPS image, otherwise the supported IOPS count.
	@JsonProperty("iops") private Integer iops;

	// Amazon Resource Name (ARN) of KMS Key, if EBS volume is encrypted.
	@JsonProperty("kms_key_arn") private String kmsKeyArn;

	// The ID of the snapshot.
	@JsonProperty("snapshot_id") private String snapshotId;

	//  The size of the volume, in GiB.
	@JsonProperty("volume_size") private Double volumeSize;

	// The volume type.
	@JsonProperty("volume_type") private String volumeType;

}
