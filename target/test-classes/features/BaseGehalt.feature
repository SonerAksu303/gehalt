
Feature: Gehalt rechnen
  @vb
Scenario Outline: Search salary for different <Jobtitle>
Given the user is on the start page
When the user searches for "<Jobtitle>"
Then the min salary should be "<Gehalt>"

Examples:
| Jobtitle           |  Gehalt  |
| Softwaretester     |  2.929 € |
| Investment Manager |  5.157 € |
| Arzt / Ärztin      |  5.139 € |
| Scrum Master       |  3.899 € |