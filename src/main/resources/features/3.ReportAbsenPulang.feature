Feature: Report Absen Pulang

# MR-AP-001
  Scenario: Admin menuju halaman report absen
    When Admin click menu report absen
    And Admin click menu absen pulang
    Then Admin get judul absen pulang

# MR-AP-002
  Scenario: Admin succesful download report absen pulang
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get file report absen

#  invalid scenario

# MR-AP-003
  Scenario: Admin not input data and fail download report absen pulang
    When Admin refresh page
    And Admin click button export data
    Then Admin get allert no data

# MR-AP-004
  Scenario: Admin not input data position fail download report absen pulang
    When Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

# MR-AP-005
  Scenario: Admin not input data branch fail download report absen pulang
    When Admin input valid position
    And Admin input valid unit
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

# MR-AP-006
  Scenario: Admin not input data unit fail download report absen pulang
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid start date
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert no data

# MR-AP-007
  Scenario: Admin not input data start date fail download report absen pulang
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid end date
    And Admin click button export data
    Then Admin get allert over 31 days

# MR-AP-008
  Scenario: Admin not input data end date fail download report absen pulang
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input valid start date
    And Admin click button export data
    Then Admin get allert over 31 days

# MR-AP-009
  Scenario: Admin input data start date and end date over 31 days
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input over start date
    And Admin input over end date
    And Admin click button export data
    Then Admin get allert over 31 days

# MR-AP-010
  Scenario: Admin not input data start date and input data start date (over)
    When Admin input valid position
    And Admin input valid branch
    And Admin input valid unit
    And Admin input over end date
    And Admin click button export data
    And Admin back to proveous page
    Then Admin logout
