$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/com/bitfinex/Features/bitfinexApi.feature");
formatter.feature({
  "line": 1,
  "name": "pub bitfinex feature",
  "description": "",
  "id": "pub-bitfinex-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate bitfinex get request APIs",
  "description": "",
  "id": "pub-bitfinex-feature;validate-bitfinex-get-request-apis",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Api to get bitfinex for different ticker names",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user tries to get response for single ticker name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validate the response",
  "keyword": "Then "
});
formatter.match({
  "location": "BitfinexStepDefnition.api_to_get_bitfinex_for_different_ticker_names()"
});
formatter.result({
  "duration": 3462133039,
  "status": "passed"
});
formatter.match({
  "location": "BitfinexStepDefnition.user_tries_to_get_response_for_single_ticker_name()"
});
formatter.result({
  "duration": 3964608274,
  "status": "passed"
});
formatter.match({
  "location": "BitfinexStepDefnition.validate_the_response()"
});
formatter.result({
  "duration": 14222,
  "status": "passed"
});
});