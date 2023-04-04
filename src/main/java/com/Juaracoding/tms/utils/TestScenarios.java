package com.Juaracoding.tms.utils;

public enum TestScenarios {

    //login
    T1("Admin successful login into web TMS"),

    //report absen masuk
    T2("Admin menuju halaman report absen masuk"),
    T3("Admin succesful download report absen masuk"),
    T4("Admin not input data and fail download report absen masuk"),
    T5("Admin not input data position fail download report absen masuk"),
    T6("Admin not input data branch fail download report absen masuk"),
    T7("Admin not input data unit fail download report absen masuk"),
    T8("Admin not input data start date fail download report absen masuk"),
    T9("Admin not input data end date fail download report absen masuk"),
    T10("Admin input data start date and end date over 31 days"),
    T11("Admin not input data start date and input data start date (over)"),

    //report absen pulang
    T12("Admin menuju halaman report absen pulang"),
    T13("Admin succesful download report absen pulang"),
    T14("Admin not input data and fail download report absen pulang"),
    T15("Admin not input data position fail download report absen pulang"),
    T16("Admin not input data branch fail download report absen pulang"),
    T17("Admin not input data unit fail download report absen pulang"),
    T18("Admin not input data start date fail download report absen pulang"),
    T19("Admin not input data end date fail download report absen pulang"),
    T20("Admin input data start date and end date over 31 days"),
    T21("Admin not input data start date and input data start date (over)"),

//    Laporan Kegiatan
    T22("Staff successful login into web TMS"),
    T23("Staff go to page laporan kegiatan absen masuk"),
    T24("Staff input laporan kegiatan absen masuk nama shift D1"),
    T25("Staff input laporan kegiatan absen pulang nama shift D1"),
    T26("Staff input laporan kegiatan absen masuk nama shift D2"),
    T27("Staff input laporan kegiatan absen pulang nama shift D2"),
    T28("Staff input laporan kegiatan absen masuk nama shift D3"),
    T29("Staff input laporan kegiatan absen pulang nama shift D3"),
    T30("Staff input laporan kegiatan absen masuk Tipe Absen WFO"),
    T31("Staff input laporan kegiatan absen pulang Tipe Absen WFO"),
    T33("Staff input laporan kegiatan absen masuk tipe shift call center 2 dan nama shift D2"),
    T34("Staff input laporan kegiatan absen pulang tipe shift call center 2 dan nama shift D2"),
    T35("Staff input laporan kegiatan absen masuk tipe shift call center 3, nama shift D2 dan tipe absen WFO"),
    T36("Staff input laporan kegiatan absen pulang tipe shift call center 3, nama shift D2 dan tipe absen WFO"),
    T37("Staff input laporan kegiatan absen masuk input divisi attraction dan nama shift D3"),
    T38("Staff input laporan kegiatan absen pulang input divisi attraction dan nama shift D3"),
    T39("Staff input laporan kegiatan absen masuk input divisi attraction dan nama shift senin pagi"),
    T40("Staff input laporan kegiatan absen pulang input divisi attraction dan nama shift senin pagi"),
    T41("Staff input laporan kegiatan absen masuk input divisi rent car dan nama shift D3"),
    T42("Staff input laporan kegiatan absen pulang input divisi rent car dan nama shift D3"),
    T43("Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D1 dan tipe shift WFO"),
    T44("Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D1 dan tipe shift WFO"),
    T45("Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D2 dan tipe shift WFO"),
    T46("Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D2 dan tipe shift WFO"),

    //invalid
    T47("Staff not input field foto selfie in laporan kegiatan absen masuk"),
    T48("Staff input field foto selfie with data pdf in laporan kegiatan absen masuk"),
    T49("Staff not input field divisi and nama shift in laporan kegiatan absen masuk"),
    T50("Staff not input field tipe shift and nama shift in laporan kegiatan absen masuk"),
    T51("Staff not input field nama shift in laporan kegiatan absen masuk"),
    T52("Staff not input field tipe absen in laporan kegiatan absen masuk"),
    T53("Staff not input all field in laporan kegiatan absen masuk"),
    T54("Staff input laporan kegiatan absen masuk input divisi rent car, nama shift D3 dan tipe shift WFO"),
    T55("Staff not input field foto selfie in laporan kegiatan absen pulang"),
    T56("Staff input field foto selfie with data pdf in laporan kegiatan absen pulang"),
    T57("Staff not input field divisi and nama shift in laporan kegiatan absen pulang"),
    T58("Staff not input field tipe shift and nama shift in laporan kegiatan absen pulang"),
    T59("Staff not input field nama shift in laporan kegiatan absen pulang"),
    T60("Staff not input field tipe absen in laporan kegiatan absen pulang"),
    T61("Staff not input all field in laporan kegiatan absen pulang"),
    T62("Staff input laporan kegiatan absen pulang input divisi rent car, nama shift D3 dan tipe shift WFO");
    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}