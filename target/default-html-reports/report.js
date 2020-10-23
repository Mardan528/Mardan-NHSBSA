$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/features/us1.feature");
formatter.feature({
  "name": "About the person free treatment",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "About the person circumstances",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from \"Wales\" date of birth \"27\" \"05\" \"1988\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.nhs.step_defs.US1_WalesTestTicket.i_am_a_person_from_date_of_birth(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into the Checker tool",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.nhs.step_defs.US1_WalesTestTicket.i_put_my_circumstances_into_the_Checker_tool(java.util.Map\u003cjava.lang.String, ?\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "com.nhs.step_defs.US1_WalesTestTicket.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});