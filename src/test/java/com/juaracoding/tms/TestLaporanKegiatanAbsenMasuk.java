package com.juaracoding.tms;

import com.Juaracoding.tms.page.LaporanKegiatanAbsenMasuk;
import com.Juaracoding.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLaporanKegiatanAbsenMasuk {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LaporanKegiatanAbsenMasuk lkAM = new LaporanKegiatanAbsenMasuk();

    public TestLaporanKegiatanAbsenMasuk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Staff click laporan kegiatan")
    public void staff_click_laporan_kegiatan(){
        extentTest.log(LogStatus.PASS,"Staff click laporan kegiatan");
        lkAM.clickLaporanKegiatan();
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff click absen masuk")
    public void staff_click_absen_masuk(){
        extentTest.log(LogStatus.PASS,"staff click absen masuk");
        lkAM.clickAbsenMasuk();
        Hooks.delay(Constants.DETIK);
    }

    @Then("Staff goto page absen masuk")
    public void staff_goto_page_absen_masuk(){
        extentTest.log(LogStatus.PASS,"Staff goto page absen masuk");
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(lkAM.getJudulHalaman(),"Absen Masuk");
    }

    //input absen masuk

    @When("Staff upload valid foto selfie")
    public void staff_upload_valid_foto_selfie(){
        extentTest.log(LogStatus.PASS,"staff upload foto selfie");
        lkAM.setUploadFile("C:\\Users\\mrisw\\OneDrive\\Gambar\\LogoIndomie.png");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid divisi")
    public void staff_input_valid_divisi(){
        extentTest.log(LogStatus.PASS,"Staff input divisi");
        lkAM.setDivisi("Call Center");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid tipe shift")
    public void staff_input_valid_tipe_shift(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe shift");
        lkAM.setDrpTipeShift("Call Center 1");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid nama shift")
    public void staff_input_valid_nama_shift(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        extentTest.log(LogStatus.PASS,"Staff input valid nama shift");
        lkAM.setInputNamaShift("D1");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid tipe absen")
    public void staff_input_valid_tipe_absen(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe absen");
        lkAM.setDrpTipeAbsen("WFH");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid tipe keterangan")
    public void staff_input_valid_tipe_keterangan(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe keterangan");
        lkAM.setInputKeterangan("apa aja");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff click button submit")
    public void staff_click_button_submit(){
        extentTest.log(LogStatus.PASS,"Staff click button submit");
        lkAM.setBtnSubmit();
    }

    @Then("Staff get allert succes input")
    public void staff_get_allert_succes_input(){
        extentTest.log(LogStatus.PASS,"Staff get allert succes input");
        Assert.assertEquals(lkAM.setAllertSucces(),"");
        //Assert.assertTrue(lkAM.setAllertSucces().contains("berhasil"));
        lkAM.setBtnBackAllert();
        Hooks.delay(Constants.DETIK);
        Assert.assertTrue(lkAM.getAllert().contains("Anda sudah melakukan absen"));
        Hooks.delay(Constants.DETIK);
    }
}
