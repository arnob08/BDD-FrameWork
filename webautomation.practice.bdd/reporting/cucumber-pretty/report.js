$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonCapPage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "A description",
  "description": "",
  "id": "a-description",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@arnob"
    }
  ]
});
formatter.before({
  "duration": 2986669579,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is alreedy in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonCapPageSteps.user_is_alreedy_in_home_page()"
});
formatter.result({
  "duration": 90083069,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Men\u0027s Hat",
  "description": "",
  "id": "a-description;men\u0027s-hat",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "get text from Men\u0027s hat",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Assert Text from Men\u0027s Hat",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonCapPageSteps.get_text_from_Men_s_hat()"
});
formatter.result({
  "duration": 3123590026,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCapPageSteps.assert_Text_from_Men_s_Hat()"
});
formatter.result({
  "duration": 35120253,
  "status": "passed"
});
formatter.after({
  "duration": 78402226,
  "status": "passed"
});
formatter.before({
  "duration": 2618890101,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is alreedy in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonCapPageSteps.user_is_alreedy_in_home_page()"
});
formatter.result({
  "duration": 751862,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Men\u0027s Beany",
  "description": "",
  "id": "a-description;men\u0027s-beany",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "get text from Men\u0027s Hat",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Assert Text from Men\u0027s Beany",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonCapPageSteps.get_text_from_Men_s_Hat()"
});
formatter.result({
  "duration": 2861215211,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCapPageSteps.assert_Text_from_Men_s_Beany()"
});
formatter.result({
  "duration": 104015750,
  "status": "passed"
});
formatter.after({
  "duration": 76042932,
  "status": "passed"
});
formatter.before({
  "duration": 2388944503,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is alreedy in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonCapPageSteps.user_is_alreedy_in_home_page()"
});
formatter.result({
  "duration": 448316,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Scarf",
  "description": "",
  "id": "a-description;scarf",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "ge text from Scarf",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Assert Text From Scarf",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonCapPageSteps.ge_text_from_Scarf()"
});
formatter.result({
  "duration": 2928020187,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCapPageSteps.assert_Text_From_Scarf()"
});
formatter.result({
  "duration": 43758753,
  "error_message": "java.lang.AssertionError: expected [Surf, Skate \u0026 Street Hats \u0026 Cap] but found [Surf, Skate \u0026 Street Hats \u0026 Caps]\n\tat org.testng.Assert.fail(Assert.java:96)\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\n\tat org.testng.Assert.assertEquals(Assert.java:118)\n\tat org.testng.Assert.assertEquals(Assert.java:453)\n\tat org.testng.Assert.assertEquals(Assert.java:463)\n\tat stepDefinitions.AmazonCapPageSteps.assert_Text_From_Scarf(AmazonCapPageSteps.java:62)\n\tat ✽.Then Assert Text From Scarf(AmazonCapPage.feature:20)\n",
  "status": "failed"
});
formatter.after({
  "duration": 721311786,
  "status": "passed"
});
});