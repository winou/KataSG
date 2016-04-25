# feature/US1.feature
Feature: US1
In order to save money
As a bank client
I want to make a deposit in my account
Scenario: Deposit money into account
    Given an existing client with id "ID01"
    When the client deposits "100" EUR into her account
    Then the new balance is "100" EUR
