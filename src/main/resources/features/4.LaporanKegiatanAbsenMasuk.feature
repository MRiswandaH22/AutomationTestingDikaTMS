Feature: Laporan kegiatan absen masuk
  Scenario: Staff successful login into web TMS
    Given Admin open browser and url
    When Staff enter valid username
    And Staff enter valid password
    And User click button login
    Then Staff go to dashboard

  Scenario: Staff go to page laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    Then Staff goto page absen masuk

  Scenario: Staff input laporan kegiatan absen masuk
    When Staff upload valid foto selfie
    And Staff input valid divisi
    And Staff input valid tipe shift
    And Staff input valid nama shift
    And Staff input valid tipe absen
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input