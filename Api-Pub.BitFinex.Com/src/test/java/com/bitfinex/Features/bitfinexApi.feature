Feature: pub bitfinex feature

Scenario: validate bitfinex get request APIs

Given Api to get bitfinex for different ticker names
When user tries to get response for single ticker name
Then validate the response