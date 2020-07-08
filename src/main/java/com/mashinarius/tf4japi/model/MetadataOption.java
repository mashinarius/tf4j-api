package com.mashinarius.tf4japi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The metadata options of the Instance
 * https://www.terraform.io/docs/providers/aws/d/instance.html#metadata_options
 */
@Data
public class MetadataOption {

	// The state of the metadata service: enabled, disabled.
	@JsonProperty("http_endpoint") private String httpEndpoint;

	// If session tokens are required: optional, required.
	@JsonProperty("http_tokens") private String httpTokens;

	// The desired HTTP PUT response hop limit for instance metadata requests.
	@JsonProperty("http_put_response_hop_limit") private Integer httpPutResponseHopLimit;

}
