# feature/US3.feature
Feature: US3
In order to check my operations
As a bank client
I want to see the history (operation, date, amount, balance)  of my operations
Scenario: history of my operations
    Given an existing client with id "ID03"
        And the client deposits "500" EUR into her account in date "01/02/2016"
        And the client deposits "500" EUR into her account in date "10/02/2016"
        And the client withdraws "300" EUR into her account in date "20/02/2016"
        And the client withdraws "200" EUR into her account in date "20/02/2016"
    When client check her account
    Then generate the history of opertions


