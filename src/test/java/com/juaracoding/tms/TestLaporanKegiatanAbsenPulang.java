package com.juaracoding.tms;

import com.Juaracoding.tms.page.LaporanKegiatanAbsenPulang;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class TestLaporanKegiatanAbsenPulang {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LaporanKegiatanAbsenPulang lkAP = new LaporanKegiatanAbsenPulang();

    public TestLaporanKegiatanAbsenPulang(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Staff click absen pulang")
    public void staff_click_absen_pulang(){
        lkAP.setBtnAbsenPulang();
    }
}
