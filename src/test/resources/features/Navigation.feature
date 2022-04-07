@navigate
Feature: Navigation Menu

  @xxx
  Scenario: Navigating Gehälter
    Given the user is on the start page
    When the user navigates to "Gehälter"
    Then the title should be Gehalt nach Beruf, Branche & Bundesland
  @xxx
  Scenario: Navigating Gehaltscheck
    Given the user is on the start page
    When the user navigates to "Gehaltscheck"
    Then the title should be Gehaltscheck: Verdienen Sie genug? Jetzt vergleichen!
  @xxx
  Scenario: Navigating Gehaltsrechner
    Given the user is on the start page
    When the user navigates to "Gehaltsrechner"
    Then the title should be Ihr Brutto-Netto-Rechner 2022 von Gehaltsvergleich.com

  @xxx
  Scenario: Navigating Jobbörse
    Given the user is on the start page
    When the user navigates to "Jobbörse"
    Then the title should be Jobs und Stellenangebote auf Gehaltsvergleich.com

  @xxx
  Scenario: Navigating Karrierelexion
    Given the user is on the start page
    When the user navigates to "Karrierelexikon"
    Then the title should be Karrierelexikon & Dokumentvorlagen | Gehaltsvergleich.com
  @xxx
  Scenario: Navigating News
    Given the user is on the start page
    When the user navigates to "News"
    Then the title should be Aktuelle News zu Gehalt, Beruf & Karriere | Gehaltsvergleich.com