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
    T21("Admin not input data start date and input data start date (over)");
    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}