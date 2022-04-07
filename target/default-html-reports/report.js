$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BaseGehalt.feature");
formatter.feature({
  "name": "Gehalt rechnen",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search salary for different \u003cJobtitle\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vb"
    }
  ]
});
formatter.step({
  "name": "the user is on the start page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user searches for \"\u003cJobtitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the min salary should be \"\u003cGehalt\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Jobtitle",
        "Gehalt"
      ]
    },
    {
      "cells": [
        "Softwaretester",
        "2.929 €"
      ]
    },
    {
      "cells": [
        "Investment Manager",
        "5.157 €"
      ]
    },
    {
      "cells": [
        "Arzt / Ärztin",
        "5.139 €"
      ]
    },
    {
      "cells": [
        "Scrum Master",
        "3.899 €"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search salary for different Softwaretester",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the start page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.NavigationMenuStepDefs.the_user_is_on_the_start_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches for \"Softwaretester\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.BaseGehaltStepDefs.the_user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the min salary should be \"2.929 €\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehälterStepDefs.the_min_salary_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search salary for different Investment Manager",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the start page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.NavigationMenuStepDefs.the_user_is_on_the_start_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches for \"Investment Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.BaseGehaltStepDefs.the_user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the min salary should be \"5.157 €\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehälterStepDefs.the_min_salary_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search salary for different Arzt / Ärztin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the start page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.NavigationMenuStepDefs.the_user_is_on_the_start_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches for \"Arzt / Ärztin\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.BaseGehaltStepDefs.the_user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the min salary should be \"5.139 €\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehälterStepDefs.the_min_salary_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search salary for different Scrum Master",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vb"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the start page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.NavigationMenuStepDefs.the_user_is_on_the_start_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches for \"Scrum Master\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.BaseGehaltStepDefs.the_user_searches_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the min salary should be \"3.899 €\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehälterStepDefs.the_min_salary_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});