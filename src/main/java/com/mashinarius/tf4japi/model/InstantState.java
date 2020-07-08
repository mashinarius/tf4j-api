package com.mashinarius.tf4japi.model;

public enum InstantState {

	PENDING("pending"), RUNNING("running"), SHUTTING_DOWN("shutting-down"), TERMINATED("terminated"), STOPPING("stopping"), STOPPED("stopped");

	String text;

	InstantState(String text) {
		this.text = text;
	}


}
