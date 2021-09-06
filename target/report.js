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
  "name": "Login to swag laps and check the home page is loaded",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@TestA"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter User name and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_StepsDef.enter_User_name_and_Password()"
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
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});