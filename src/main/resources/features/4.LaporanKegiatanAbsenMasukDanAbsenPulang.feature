Feature: Laporan kegiatan absen masuk dan absen pulang
  Scenario: Staff successful login into web TMS
    Given Admin open browser and url
    When Staff enter valid username
    And Staff enter valid password
    And User click button login
    Then Staff go to dashboard

# MLK-AM-001
  Scenario: Staff go to page laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    Then Staff goto page absen masuk

# MLK-AM-010 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk nama shift D1
    When Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-010 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang nama shift D1
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-011 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk nama shift D2
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-010 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang nama shift D2
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-012 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen masuk
    When Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-012 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-021 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk Tipe Absen WFO
    When Staff click laporan kegiatan
    And Staff click absen masuk
    When Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-021 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang Tipe Absen WFO
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-033 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk tipe shift call center 2 dan nama shift D2
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc2
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-033 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang tipe shift call center 2 dan nama shift D2
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc2
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-086 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk tipe shift call center 3, nama shift D2 dan tipe absen WFO
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc3
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-086 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang tipe shift call center 3, nama shift D2 dan tipe absen WFO
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc3
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-115 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi attraction dan nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi attraction
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-115 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi attraction dan nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi attraction
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-116 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi attraction dan nama shift senin pagi
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi attraction
    And Staff input valid nama shift senin pagi
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-116 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi attraction dan nama shift senin pagi
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi attraction
    And Staff input valid nama shift senin pagi
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-128 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi rent car dan nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-128 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi rent car dan nama shift D3
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-130 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D1 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-130 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D1 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AM-131 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D2 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

# MLK-AP-131 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D2 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D2
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input


  # INVALID TEST (ABSEN MASUK) BELUM DIMASUKAN KE TEST SCENARIOS

# MLK-AM-133 (Absen Masuk)
  Scenario: Staff not input field foto selfie in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input data foto selfie

# MLK-AM-134 (Absen Masuk)
  Scenario: Staff input field foto selfie with data pdf in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie with pdf
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert input not allowed

# MLK-AM-135 (Absen Masuk)
  Scenario: Staff not input field divisi and nama shift in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field divisi

# MLK-AM-136 (Absen Masuk)
  Scenario: Staff not input field tipe shift and nama shift in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input tipe shift

# MLK-AM-137 (Absen Masuk)
  Scenario: Staff not input field nama shift in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field nama shift

# MLK-AM-138 (Absen Masuk)
  Scenario: Staff not input field tipe absen in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D1
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field tipe absen

# MLK-AM-139 (Absen Masuk)
  Scenario: Staff not input all field in laporan kegiatan absen masuk
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff click button submit
    Then Staff get allert not input data foto selfie

# MLK-AM-132 (Absen Masuk)
  Scenario: Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D3 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen masuk
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input

  # INVALID TEST (ABSEN PULANG) BELUM DIMASUKAN KE TEST SCENARIOS

# MLK-AP-133 (Absen Pulang)
  Scenario: Staff not input field foto selfie in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input data foto selfie

# MLK-AP-134 (Absen Pulang)
  Scenario: Staff input field foto selfie with data pdf in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie with pdf
    And Staff input valid divisi rent car
    And Staff input valid nama shift D1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert input not allowed

# MLK-AP-135 (Absen Pulang)
  Scenario: Staff not input field divisi and nama shift in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field divisi

# MLK-AP-136 (Absen Pulang)
  Scenario: Staff not input field tipe shift and nama shift in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input tipe shift

# MLK-AP-137 (Absen Pulang)
  Scenario: Staff not input field nama shift in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid tipe absen WFH
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field nama shift

# MLK-AP-138 (Absen Pulang)
  Scenario: Staff not input field tipe absen in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi call center
    And Staff input valid tipe shift cc1
    And Staff input valid nama shift D1
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert not input field tipe absen

# MLK-AP-139 (Absen Pulang)
  Scenario: Staff not input all field in laporan kegiatan absen pulang
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff click button submit
    Then Staff get allert not input data foto selfie

# MLK-AP-131 (Absen Pulang)
  Scenario: Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D3 dan tipe shift WFO
    When Staff click laporan kegiatan
    And Staff click absen pulang
    And Staff upload valid foto selfie
    And Staff input valid divisi rent car
    And Staff input valid nama shift D3
    And Staff input valid tipe absen WFO
    And Staff input valid tipe keterangan
    And Staff click button submit
    Then Staff get allert succes input




