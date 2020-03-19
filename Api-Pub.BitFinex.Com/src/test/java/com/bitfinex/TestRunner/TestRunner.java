package com.bitfinex.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="./src/test/java/com/bitfinex/Features/bitfinexApi.feature", 
glue={"com.bitfinex.StepDefinition"},
plugin={"pretty","html:target/reports","json:target/reports.json"},

monochrome=true)
public class TestRunner {

}
