package com.juaracoding.tms;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/4.LaporanKegiatanAbsenMasukDanAbsenPulang.feature"},
//                "src/main/resources/features/3.ReportAbsenPulang.feature",
//               "src/main/resources/features/2.ReportAbsenMasuk.feature",
//        "src/main/resources/features/1.Login.feature"},
        glue = {"com.juaracoding.tms"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}