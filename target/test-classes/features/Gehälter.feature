Feature:Gehälter Page

  Scenario:Softwaretester Hamburg
    Given the user is on "Gehälter" Page
    When the user searches for Softwaretester in Hamburg
    Then the min salary should be "<gehalt>"

  @wip
  Scenario Outline: Search for different <Jobtitle> and <Ort>
    Given the user is on "Gehälter" Page
    When the user searches for "<Jobtitle>" "<Ort>"
    Then the min salary should be "<Gehalt>"

    Examples:
      | Jobtitle           | Ort     | Gehalt  |
      | Softwaretester     | Hamburg | 2.913 € |
      | Investment Manager | Berlin  | 4.726 € |
      | Arzt / Ärztin      | Hamburg | 5.371 € |
      | Scrum Master       | Hamburg | 3.597 € |