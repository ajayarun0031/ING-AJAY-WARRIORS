package com.bitfinex.StepDefinition;

import com.bitfinex.pages.GetData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

public class BitfinexStepDefnition {
	
	GetData getdata=new GetData();
	
	@Given("^Api to get bitfinex for different ticker names$")
	public void api_to_get_bitfinex_for_different_ticker_names() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//initalization();
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = getdata.GetBaseURL();
	}

	@When("^user tries to get response for single ticker name$")
	public void user_tries_to_get_response_for_single_ticker_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   getdata.GetRequest();
	}

	@Then("^validate the response$")
	public void validate_the_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getdata.GetResponse();
	}

}
