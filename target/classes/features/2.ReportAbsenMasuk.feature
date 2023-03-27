Feature: Report absen masuk
  Scenario: Admin succesful download report absen masuk
    Given Admin open browser and url
    When Admin click menu report absen masuk
    And Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get file report absen