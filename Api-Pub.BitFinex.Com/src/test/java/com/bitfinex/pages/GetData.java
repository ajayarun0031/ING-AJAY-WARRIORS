package com.bitfinex.pages;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetData {
	
	String BASE_URI;
	Response response;
	JsonPath jsonpath;
	
	public String GetBaseURL(){
		return BASE_URI = "https://api-pub.bitfinex.com/v2/tickers?symbols=";
	}
	
	public void GetRequest() {
		response = given().when().get(BASE_URI + "tBTCUSD,tLTCBTC");
		System.out.println(response + " From request method @@@@@@@@@");
	}

	public void GetResponse(){
		String tickerResponse = response.andReturn().asString();
		//System.out.println(tickerResponse + " from response method ############");
		JsonPath json = new JsonPath(tickerResponse);
		//System.out.println(json);
		//System.out.println("ticker name 1  "+json.get("[1]"));
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);

		
		System.out.println(statusCode + " @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S");
		String actual = json.get("[1][0]");
		Assert.assertEquals(actual, "tLTCBTC");
		
	}


}
