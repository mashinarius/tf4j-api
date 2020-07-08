package com.mashinarius.tf4japi.model;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

public interface TerraformDataSource {
	String toJson() throws JsonProcessingException;

	Map toMap();
	// String toJsonWithoutNullValues() throws JsonProcessingException;
}
