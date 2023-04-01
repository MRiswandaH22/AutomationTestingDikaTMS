package com.juaracoding.tms;

import com.Juaracoding.tms.page.ReportAbsenPulangTMS;
import com.Juaracoding.tms.utils.Constants;
import com.relevantcodes.extentreports.Configuration;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReportAbsenPulang {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ReportAbsenPulangTMS rapTms = new ReportAbsenPulangTMS();
    public TestReportAbsenPulang(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @And("Admin click menu absen pulang")
    public void admin_click_menu_absen_pulang(){
        extentTest.log(LogStatus.PASS,"Admin click menu absen pulang");
        rapTms.goToAbsenPulang();
        Hooks.delay(Constants.DETIK);
    }
    @Then("Admin get judul absen pulang")
    public void admin_get_judul_absen_pulang(){
        extentTest.log(LogStatus.PASS,"Admin get judul absen pulang");
        Assert.assertEquals(rapTms.setTxtJudulAbsenPulang(),"Report Pulang!!!");
        Hooks.delay(Constants.DETIK);
    }

}
