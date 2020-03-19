package com.bitfinex.pages;

import static io.restassured.RestAssured.given;

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
		response = given().when().get(BASE_URI + "tBTCUSD");
		System.out.println(response);
	}



}
