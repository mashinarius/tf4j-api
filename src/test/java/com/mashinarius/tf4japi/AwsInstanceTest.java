package com.mashinarius.tf4japi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashinarius.tf4japi.model.AwsInstance;
import com.mashinarius.tf4japi.model.EbsBlockDevice;
import com.mashinarius.tf4japi.model.EphemeralBlockDevice;
import com.mashinarius.tf4japi.model.RootBlockDevice;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

public class AwsInstanceTest {

	@Test
	public void AwsInstanceConstructorTest() {
		AwsInstance awsInstance = new AwsInstance();
		awsInstance.setRootBlockDevice(new RootBlockDevice());
		awsInstance.setEbsBlockDevice(new EbsBlockDevice());
		awsInstance.setMetadataOptions(new ArrayList<>());
		awsInstance.setEphemeralBlockDevice(new EphemeralBlockDevice());

		try {
			String stringRepresentation = awsInstance.toJson();
			assert stringRepresentation.contains("root_block_device");
			assert stringRepresentation.contains("ebs_block_device");
			assert stringRepresentation.contains("ephemeral_block_device");
			assert stringRepresentation.contains("metadata_options");
			assert stringRepresentation.contains("vpc_security_group_ids");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		Map map = awsInstance.toMap();

		assert map.get("root_block_device")!=null;
		assert map.get("ebs_block_device")!=null;
		assert map.get("ephemeral_block_device")!=null;
		assert map.get("metadata_options")!=null;

		assert map.get("vpc_security_group_ids")==null;

		System.out.println(map);
	}
}
