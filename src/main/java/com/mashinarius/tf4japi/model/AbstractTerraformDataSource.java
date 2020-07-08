package com.mashinarius.tf4japi.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class AbstractTerraformDataSource {

	//@Transient
	private String terraformResourceName;

	public String getTerraformResourceName() {
		return terraformResourceName;
	}

	public void setTerraformResourceName(String terraformResourceName) {
		this.terraformResourceName = terraformResourceName;
	}

	public String toJson() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this);
	}

	public Map toMap() {
		return new ObjectMapper().convertValue(this, Map.class);
	}
}
