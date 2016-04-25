# feature/US2.feature
Feature: US2
In order to retrieve some or all of my savings
As a bank client
I want to make a withdrawal from my account
Scenario: make a withdrawal from my account
    Given an existing client with id "ID02"
    When the client withdraws "500" EUR into her account
    Then the new balance is "-500" EUR