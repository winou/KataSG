$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# feature/US1.feature"
    }
  ],
  "line": 2,
  "name": "US1",
  "description": "In order to save money\r\nAs a bank client\r\nI want to make a deposit in my account",
  "id": "us1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15719994,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Deposit money into account",
  "description": "",
  "id": "us1;deposit-money-into-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "an existing client with id \"ID0s\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the client deposits \"100\" EUR into her account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the new balance is \"100\" EUR",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ID0s",
      "offset": 28
    }
  ],
  "location": "StepsDef.an_existing_client_with_id(String)"
});
formatter.result({
  "duration": 249068176,
  "error_message": "java.lang.Exception: not found account\n\tat application.impl.ServiceAccountImpl.findAccount(ServiceAccountImpl.java:34)\n\tat steps.StepsDef.an_existing_client_with_id(StepsDef.java:43)\n\tat ✽.Given an existing client with id \"ID0s\"(US1.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 21
    }
  ],
  "location": "StepsDef.the_client_deposits_EUR_into_her_account(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 20
    }
  ],
  "location": "StepsDef.the_new_balance_is_EUR(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("US2.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# feature/US2.feature"
    }
  ],
  "line": 2,
  "name": "US2",
  "description": "In order to retrieve some or all of my savings\r\nAs a bank client\r\nI want to make a withdrawal from my account",
  "id": "us2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 503548,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "make a withdrawal from my account",
  "description": "",
  "id": "us2;make-a-withdrawal-from-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "an existing client with id \"ID02\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the client withdraws \"500\" EUR into her account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the new balance is \"-500\" EUR",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ID02",
      "offset": 28
    }
  ],
  "location": "StepsDef.an_existing_client_with_id(String)"
});
formatter.result({
  "duration": 153059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 22
    }
  ],
  "location": "StepsDef.the_client_withdraws_EUR_into_her_account(String)"
});
formatter.result({
  "duration": 442629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-500",
      "offset": 20
    }
  ],
  "location": "StepsDef.the_new_balance_is_EUR(String)"
});
formatter.result({
  "duration": 48830734,
  "status": "passed"
});
formatter.uri("US3.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# feature/US3.feature"
    }
  ],
  "line": 2,
  "name": "US3",
  "description": "In order to check my operations\r\nAs a bank client\r\nI want to see the history (operation, date, amount, balance)  of my operations",
  "id": "us3",
  "keyword": "Feature"
});
formatter.before({
  "duration": 166425,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "history of my operations",
  "description": "",
  "id": "us3;history-of-my-operations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "an existing client with id \"ID03\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the client deposits \"500\" EUR into her account in date \"01/02/2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the client deposits \"500\" EUR into her account in date \"10/02/2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the client withdraws \"300\" EUR into her account in date \"20/02/2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the client withdraws \"200\" EUR into her account in date \"20/02/2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "client check her account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "generate the history of opertions",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ID03",
      "offset": 28
    }
  ],
  "location": "StepsDef.an_existing_client_with_id(String)"
});
formatter.result({
  "duration": 79263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 21
    },
    {
      "val": "01/02/2016",
      "offset": 56
    }
  ],
  "location": "StepsDef.the_client_deposits_EUR_into_her_account_in_date(String,String)"
});
formatter.result({
  "duration": 2958504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 21
    },
    {
      "val": "10/02/2016",
      "offset": 56
    }
  ],
  "location": "StepsDef.the_client_deposits_EUR_into_her_account_in_date(String,String)"
});
formatter.result({
  "duration": 753185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "300",
      "offset": 22
    },
    {
      "val": "20/02/2016",
      "offset": 57
    }
  ],
  "location": "StepsDef.the_client_withdraws_EUR_into_her_account_in_date(String,String)"
});
formatter.result({
  "duration": 5821538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 22
    },
    {
      "val": "20/02/2016",
      "offset": 57
    }
  ],
  "location": "StepsDef.the_client_withdraws_EUR_into_her_account_in_date(String,String)"
});
formatter.result({
  "duration": 1273055,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.client_check_her_account()"
});
formatter.result({
  "duration": 72070,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.generate_the_history_of_opertions()"
});
formatter.write("History of operations : ");
formatter.write("date       | credit   | debit    | balance\n01/02/2016 | 500,00   |          | 500,00\n10/02/2016 | 500,00   |          | 1000,00\n20/02/2016 |          | 300,00   | 700,00\n20/02/2016 |          | 200,00   | 500,00\n");
formatter.result({
  "duration": 8964558,
  "status": "passed"
});
});