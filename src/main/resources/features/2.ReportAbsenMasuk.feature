Feature: Report absen masuk

#  MR-AM-001
  Scenario: Admin menuju halaman report absen
    When Admin click menu report absen
    And Admin click menu absen masuk
    Then Admin get judul absen masuk

#  MR-AM-002
  Scenario: Admin succesful download report absen masuk
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get file report absen

#    invalid scenario

#  MR-AM-003
  Scenario: Admin not input data and fail download report absen masuk
    When Admin refresh page
    And Admin click button export data
    Then Admin get allert no data

#  MR-AM-004
  Scenario: Admin not input data position fail download report absen masuk
    When Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

#  MR-AM-005
  Scenario: Admin not input data branch fail download report absen masuk
    When Admin input valid position
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

#  MR-AM-006
  Scenario: Admin not input data unit fail download report absen masuk
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

#  MR-AM-007
  Scenario: Admin not input data start date fail download report absen masuk
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert over 31 days

#  MR-AM-008
  Scenario: Admin not input data end date fail download report absen masuk
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin click button export data
    Then Admin get allert over 31 days

#   MR-AM-009
  Scenario: Admin input data start date and end date over 31 days
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input over start date
    And Admin input over end date
    And Admin click button export data
    Then Admin get allert over 31 days

#   MR-AM-010
  Scenario: Admin not input data start date and input data start date (over)
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input over end date
    And Admin click button export data
    Then Admin back to proveous page