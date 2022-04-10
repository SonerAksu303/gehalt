Feature: GehaltsrechnerPage

  @zz
  Scenario Outline: Gehalt for different infos
    Given the user is on "Gehaltsrechner" Page
    When the user enters following infos "<Bruttolohn>" "<Jahresbeitrag>" "<Berufsbezeichnung>" "<Jahr>" "<Zeitraum>" "<Geburtsjahr>" "<Steurklasse>" "<Faktor>"  "<Rentenversicherungspflicht>" "<Kirchensteuer>" "<Wohnort>" "<Bundesland>" "<Krankenkasse>" "<Kassensatz>" "<Kinder>"<Kinderfreibetrag> "
    Then the result should be "<Ihrergebnis>"
    Examples:
      | Bruttolohn | Jahresbeitrag | Berufsbezeichnung        | Jahr | Zeitraum | Geburtsjahr | Steurklasse | Faktor | Rentenversicherungspflicht | Kirchensteuer | Wohnort  | Bundesland    | Krankenkasse                 | Kassensatz | Kinder | Kinderfreibetrag |
      | 55000      | 55000         | Test Automation Engineer | 2021 | Jahr     | 1984        | III         |        | Ja (West)                  | Nein          | Hamburg  | Hamburg       | Gesetzlich krankenversichert |            | Ja     | 2                |
