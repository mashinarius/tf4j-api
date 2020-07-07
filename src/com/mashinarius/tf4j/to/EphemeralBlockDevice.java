package com.mashinarius.tf4j.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  The ephemeral block device mappings of the Instance
 *  https://www.terraform.io/docs/providers/aws/d/instance.html#ephemeral_block_device
 */
public class EphemeralBlockDevice {

	// The physical name of the device.
	@JsonProperty("device_name") private String deviceName;

	// Whether the specified device included in the device mapping was suppressed or not (Boolean).
	@JsonProperty("no_device") private Boolean noDevice;

	// The virtual device name.
	@JsonProperty("virtual_name") private String virtualName;
}
