package com.amazonscrap.utils;

public enum TestScenarios {
    T1("Dashboard Valid Funcionality Test"),
    T2("Search Valid Funcionality Test");
    private String testCaseName;
    TestScenarios(String value){ testCaseName = value; }
    public String getTestCaseName(){return testCaseName; }

}
