$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Gehaltsrechner.feature");
formatter.feature({
  "name": "GehaltsrechnerPage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Gehalt for different infos",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@zz"
    }
  ]
});
formatter.step({
  "name": "the user is on \"Gehaltsrechner\" Page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters following infos \"\u003cBruttolohn\u003e\" \"\u003cJahresbeitrag\u003e\" \"\u003cBerufsbezeichnung\u003e\" \"\u003cJahr\u003e\" \"\u003cZeitraum\u003e\" \"\u003cGeburtsjahr\u003e\" \"\u003cSteurklasse\u003e\" \"\u003cFaktor\u003e\"  \"\u003cRentenversicherungspflicht\u003e\" \"\u003cKirchensteuer\u003e\" \"\u003cWohnort\u003e\" \"\u003cBundesland\u003e\" \"\u003cKrankenkasse\u003e\" \"\u003cKassensatz\u003e\" \"\u003cKinder\u003e\"\u003cKinderfreibetrag\u003e \"",
  "keyword": "When "
});
formatter.step({
  "name": "the result should be \"\u003cIhrergebnis\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Bruttolohn",
        "Jahresbeitrag",
        "Berufsbezeichnung",
        "Jahr",
        "Zeitraum",
        "Geburtsjahr",
        "Steurklasse",
        "Faktor",
        "Rentenversicherungspflicht",
        "Kirchensteuer",
        "Wohnort",
        "Bundesland",
        "Krankenkasse",
        "Kassensatz",
        "Kinder",
        "Kinderfreibetrag"
      ]
    },
    {
      "cells": [
        "55000",
        "55000",
        "Test Automation Engineer",
        "2021",
        "Jahr",
        "1984",
        "III",
        "",
        "Ja (West)",
        "Nein",
        "Hamburg",
        "Hamburg",
        "Gesetzlich krankenversichert",
        "",
        "Ja",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Gehalt for different infos",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@zz"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on \"Gehaltsrechner\" Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehälterStepDefs.the_user_is_on_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters following infos \"55000\" \"55000\" \"Test Automation Engineer\" \"2021\" \"Jahr\" \"1984\" \"III\" \"\"  \"Ja (West)\" \"Nein\" \"Hamburg\" \"Hamburg\" \"Gesetzlich krankenversichert\" \"\" \"Ja\"2 \"",
  "keyword": "When "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehaltsrechnerStepDefs.the_user_enters_following_infos_Ja(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the result should be \"\u003cIhrergebnis\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.gehaltsvergleich.step_definitions.GehaltsrechnerStepDefs.the_result_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});