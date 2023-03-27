package com.juaracoding.tms;

import com.Juaracoding.tms.page.ReportAbsenMasukTMS;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReportAbsenMasuk {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ReportAbsenMasukTMS ramTms = new ReportAbsenMasukTMS();

    public TestReportAbsenMasuk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin click menu report absen masuk")
    public void admin_click_menu_report_absen_masuk(){
        ramTms.setMenujuReportAbsenMasuk();
    }
    @And("Admin input valid position")
    public void admin_input_valid_position(){

        ramTms.setPosition("ALL");
    }
    @And("Admin input valid branch")
    public void admin_input_valid_branch(){
        ramTms.setBranch("ALL");
    }
    @And("Admin input valid unit")
    public void admin_input_valid_unit(){
        ramTms.setUnit("ALL");
    }
    @And("Admin input valid start date")
    public void admin_input_valid_start_date(){
        ramTms.setInputStartDate("2022-12-01");
    }
    @And("Admin input valid end date")
    public void admin_input_valid_end_date(){
        ramTms.setInputEndDate("2022-12-30");
    }
    @And("Admin click button export data")
    public void Admin_click_button_export_data(){
        ramTms.setBtnSubmit();
    }
    @Then("Admin get file report absen")
    public void admin_get_file_report_absen(){
        Assert.assertEquals(ramTms.getTxtJudul(),"Report Masuk!!!");
    }
}
