Feature: Login User Admin
  Scenario: Admin successful login into web TMS
    Given Admin open browser and url
    When Admin enter valid username
    And Admin enter valid password
    And User click button login
    Then Admin go to page Dashboard
#    Then Admin get message error
