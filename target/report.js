$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Login.feature");
formatter.feature({
  "name": "User login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login to swag labs and check the home page is loaded using 2D Datas",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginA"
    },
    {
      "name": "@TestC"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter 2D User name and Password tables",
  "rows": [
    {
      "cells": [
        "Username",
        "standard_user"
      ]
    },
    {
      "cells": [
        "Password",
        "secret_sauce"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_StepsDef.enter_D_User_name_and_Password_tables(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepsDef.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepsDef.verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});