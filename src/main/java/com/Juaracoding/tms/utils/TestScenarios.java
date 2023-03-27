package com.Juaracoding.tms.utils;

public enum TestScenarios {
    T1("Admin successful login into web TMS");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}