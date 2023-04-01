package com.juaracoding.tms;

import com.Juaracoding.tms.page.ReportAbsenMasukTMS;
import com.Juaracoding.tms.utils.Constants;
import com.Juaracoding.tms.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class TestReportAbsenMasuk {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ReportAbsenMasukTMS ramTms = new ReportAbsenMasukTMS();

    public TestReportAbsenMasuk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin click menu report absen")
    public void admin_click_menu_report_absen(){
        extentTest.log(LogStatus.PASS,"Admin click menu report absen");
        ramTms.setBtnReportAbsen();
    }
    @And("Admin click menu absen masuk")
    public void admin_click_menu_absen_masuk(){
        ramTms.setBtnAbsenMasuk();
        extentTest.log(LogStatus.PASS,"Admin click menu absen masuk");
        Hooks.delay(3);
    }
    @And("Admin input valid position")
    public void admin_input_valid_position(){
        ramTms.setPosition("ALL");
        extentTest.log(LogStatus.PASS,"Admin input valid position");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin input valid branch")
    public void admin_input_valid_branch(){
        ramTms.setBranch("ALL");
        extentTest.log(LogStatus.PASS,"Admin input valid branch");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin input valid unit")
    public void admin_input_valid_unit(){
        ramTms.setUnit("ALL");
        extentTest.log(LogStatus.PASS,"Admin input valid unit");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin input valid start date")
    public void admin_input_valid_start_date(){
        ramTms.setInputStartDate("2022-12-01");
        extentTest.log(LogStatus.PASS,"Admin input valid start date");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin input valid end date")
    public void admin_input_valid_end_date(){
        ramTms.setInputEndDate("2022-12-30");
        extentTest.log(LogStatus.PASS,"Admin input valid end date");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin click button export data")
    public void Admin_click_button_export_data(){
        ramTms.setBtnSubmit();
        extentTest.log(LogStatus.PASS,"Admin click button export data");
        Hooks.delay(Constants.DETIK);
    }
    @Then("Admin get file report absen")
    public void admin_get_file_report_absen() throws IOException {
        extentTest.log(LogStatus.PASS,"Admin get file report absen");
        File fileLocation = new File("C:\\Users\\mrisw\\Downloads");
        File[] totalFiles = fileLocation.listFiles();
        for (File file : totalFiles){
            if (file.getName().contains("data_absen.xls")){
                System.out.println("Data Absen is Downloaded");
                break;
            }
        }
        //untuk verify download
        //Assert.assertTrue(Utils.isFileDownloaded("sample", "csv", 5000));
    }

    @Then("Admin get judul absen masuk")
    public void admin_get_judul_absen_masuk(){
        extentTest.log(LogStatus.PASS,"Admin get judul absen masuk");
        Assert.assertEquals(ramTms.getTxtJudulAbsenMasuk(),"Report Masuk!!!");
    }

    //
    //
    //INVALID

    @When("Admin refresh page")
    public void admin_refresh_page(){
        Hooks.driver.navigate().refresh();
        extentTest.log(LogStatus.PASS,"Admin refresh page");
        Hooks.delay(Constants.DETIK);
    }

    @And("Admin input over start date")
    public void admin_input_over_start_date(){
        ramTms.setInputStartDate("2023-02-01");
        extentTest.log(LogStatus.PASS,"Admin input over start date");
        Hooks.delay(Constants.DETIK);
    }
    @And("Admin input over end date")
    public void admin_input_over_end_date(){
        ramTms.setInputEndDate("2023-03-05");
        extentTest.log(LogStatus.PASS,"Admin input over end date");
        Hooks.delay(Constants.DETIK);
    }

    @Then("Admin get allert no data")
    public void admin_get_allert_no_data(){
        extentTest.log(LogStatus.PASS,"Admin get allert no data");
        Assert.assertEquals(ramTms.getAllert(),"No data...!!!");
        //System.out.println(ramTms.getAllert());
    }

    @Then("Admin get allert over 31 days")
    public void admin_get_allert_over_31_days(){
        extentTest.log(LogStatus.PASS,"Admin get allert over 31 days");
        Assert.assertEquals(ramTms.getAllert(),"Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");

        //kalau error bisa kembali ke page selanjutnya

//        if (ramTms.getAllert().contains("Maximal Penarikan") == true){
//            extentTest.log(LogStatus.PASS,"Admin get allert over 31 days");
//            Assert.assertEquals(ramTms.getAllert(),"Maximal Penarikan Data adalah 1 Bulan / 31 Hari !!!");
//        } else if (ramTms.getAllert().contains("Maximal Penarikan") == true) {
//            Hooks.driver.navigate().back();
//        }
        //System.out.println(ramTms.getAllert());
    }
    @Then("Admin back to proveous page")
    public void admin_back_to_proveous_page(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.history.go(-1)");
//        Hooks.driver.navigate().back();
        Hooks.driver.navigate().to("https://dev.ptdika.com/tiket.com/pro/report2/absen_masuk");
        Hooks.driver.navigate().refresh();
        Hooks.delay(Constants.DETIK);

//
//        driver = webdriver.Chrome()
//        driver.set_page_load_timeout(5)
//        try:
//        driver.get('https://www.tiktok.com/signup/phone-or-email/email')
//        except TimeoutException:
//        print("Proxy: ", proxy_ip_port, "invalid")
    }

}
