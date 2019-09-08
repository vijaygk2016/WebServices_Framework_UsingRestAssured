package com.projectName.testscripts;

import org.testng.annotations.Test;

import com.projectName.utills.EndpointURL;
import com.projectName.utills.URL;
import com.projectName.webservices.methods.Webservices;

import io.restassured.response.Response;

public class TC_001 {
	
	Response response;
	
	@Test
	public void verifyGetLIST_USERS(){
		
		System.out.println("-------***********---------");
		String url = URL.fixURL+EndpointURL.LIST_USERS.getResourcePath();
		System.out.println(url);
		response=Webservices.Get(url);
		System.out.println(response.getBody().asString());
		System.out.println("-------***********---------");
		System.out.println("");
	}
	
	@Test
	public void verifyGetSINGLE_USER(){
		
		System.out.println("-------***********---------");
		String url = URL.fixURL+EndpointURL.SINGLE_USER.getResourcePath();
		System.out.println(url);
		response=Webservices.Get(url);
		System.out.println(response.getBody().asString());
		System.out.println("-------***********---------");
		System.out.println("");
	}
	
	@Test
	public void verifyGetLIST_USERS_PAGE_NUMBERS(){
		
		System.out.println("-------***********---------");
		String url = URL.fixURL+EndpointURL.LIST_USERS_PAGE_NUMBERS.getResourcePath("6");
		System.out.println(url);
		response=Webservices.Get(url);
		System.out.println(response.getBody().asString());
		System.out.println("-------***********---------");
		System.out.println("");
	}
	

}
