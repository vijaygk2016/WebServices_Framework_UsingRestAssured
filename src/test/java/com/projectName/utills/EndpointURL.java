package com.projectName.utills;

public enum EndpointURL {

	LIST_USERS("/api/users?page=2"), 
	SINGLE_USER("/api/users/2"),
	LIST_USERS_PAGE_NUMBERS("/api/users?page=");

	String resourcePath;

	EndpointURL(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public String getResourcePath() {
		return this.resourcePath;
	}

	public String getResourcePath(String data) {
		return this.resourcePath + data;
	}

}
