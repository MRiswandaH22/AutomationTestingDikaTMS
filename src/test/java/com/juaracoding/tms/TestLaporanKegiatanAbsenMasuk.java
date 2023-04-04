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

    @And("Staff input valid divisi call center")
    public void staff_input_valid_divisi_call_center(){
        extentTest.log(LogStatus.PASS,"Staff input divisi call center");
        lkAM.setDivisi("Call Center");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid divisi attraction")
    public void staff_input_valid_divisi_attraction(){
        extentTest.log(LogStatus.PASS,"Staff input divisi attraction");
        lkAM.setDivisi("attraction");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid divisi rent car")
    public void staff_input_valid_divisi_rent_car(){
        extentTest.log(LogStatus.PASS,"Staff input divisi rent car");
        lkAM.setDivisi("rent car");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid tipe shift cc1")
    public void staff_input_valid_tipe_shift_cc1(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe shift cc1");
        lkAM.setDrpTipeShift("Call Center 1");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid tipe shift cc2")
    public void staff_input_valid_tipe_shift_cc2(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe shift cc2");
        lkAM.setDrpTipeShift("Call Center 2");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid tipe shift cc3")
    public void staff_input_valid_tipe_shift_cc3(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe shift cc3");
        lkAM.setDrpTipeShift("Call Center 3");
        Hooks.delay(Constants.DETIK);
    }

    @And("Staff input valid nama shift D1")
    public void staff_input_valid_nama_shift_D1(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        extentTest.log(LogStatus.PASS,"Staff input valid nama shift D1");
        lkAM.setInputNamaShift("D1");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid nama shift D2")
    public void staff_input_valid_nama_shift_D2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        extentTest.log(LogStatus.PASS,"Staff input valid nama shift D2");
        lkAM.setInputNamaShift("D2");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid nama shift D3")
    public void staff_input_valid_nama_shift_D3(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        extentTest.log(LogStatus.PASS,"Staff input valid nama shift D3");
        lkAM.setInputNamaShift("D3");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid nama shift senin pagi")
    public void staff_input_valid_nama_shift_senin_pagi(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        extentTest.log(LogStatus.PASS,"Staff input valid nama shift senin pagi");
        lkAM.setInputNamaShift("senin pagi");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid tipe absen WFH")
    public void staff_input_valid_tipe_absen_WFH(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe absen WFH");
        lkAM.setDrpTipeAbsen("WFH");
        Hooks.delay(Constants.DETIK);
    }
    @And("Staff input valid tipe absen WFO")
    public void staff_input_valid_tipe_absen_WFO(){
        extentTest.log(LogStatus.PASS,"Staff input valid tipe absen WFO");
        lkAM.setDrpTipeAbsen("WFO");
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

    //
    //
    // INVALID

    @Then("Staff get allert not input data foto selfie")
    public void staff_get_allert_not_input_data_foto_selfie(){
        extentTest.log(LogStatus.PASS,"Staff get allert not input data foto selfie");
        Assert.assertEquals(lkAM.getValidationMessageFotoSelfie(),"Please select a file.");
        //System.out.println(lkAM.getValidationMessageFotoSelfie());
    }
    @Then("Staff get allert not input field divisi")
    public void staff_get_allert_not_input_field_divisi(){
        extentTest.log(LogStatus.PASS,"Staff get allert not input field divisi");
        Assert.assertEquals(lkAM.getValidationMessageDivisi(),"Please select an item in the list.");
//        System.out.println(lkAM.getValidationMessageDivisi());
    }

    @Then("Staff get allert not input tipe shift")
    public void staff_get_allert_not_input_tipe_shift(){
        extentTest.log(LogStatus.PASS,"Staff get allert not input tipe shift");
        Assert.assertEquals(lkAM.getValidationMessageTipeShift(),"Please select an item in the list.");
//        System.out.println(lkAM.getValidationMessageTipeShift());
    }
    @Then("Staff get allert not input field nama shift")
    public void staff_get_allert_not_input_field_nama_shift(){
        extentTest.log(LogStatus.PASS,"Staff get allert not input field nama shift");
        Assert.assertEquals(lkAM.getValidationMessageNamaShift(),"Please select an item in the list.");
//        System.out.println(lkAM.getValidationMessageNamaShift());
    }
    @Then("Staff get allert not input field tipe absen")
    public void staff_get_allert_not_input_field_tipe_absen(){
        extentTest.log(LogStatus.PASS,"Staff get allert not input field tipe absen");
        Assert.assertEquals(lkAM.getValidationMessageTipeAbsen(),"Please select an item in the list.");
//        System.out.println(lkAM.getValidationMessageTipeAbsen);
    }


    //ini belum
    @And("Staff upload valid foto selfie with pdf")
    public void staff_upload_valid_foto_selfie_with_pdf(){
        extentTest.log(LogStatus.PASS,"staff upload foto selfie");
        lkAM.setUploadFile("C:\\Users\\mrisw\\OneDrive\\Documents\\2A MIRROR-00.pdf");
        Hooks.delay(Constants.DETIK);

    }

    @And("Staff get allert input not allowed")
    public void staff_get_allert_input_not_allowed(){
        extentTest.log(LogStatus.PASS,"Staff get allert input not allowed");
        Assert.assertEquals(lkAM.getValidtionMessageFotoSelfiePDF(),"The filetype you are attempting to upload is not allowed.");
//        System.out.println(lkAM.getValidtionMessageFotoSelfiePDF());
        Hooks.delay(Constants.DETIK);
        Hooks.driver.navigate().to("https://dev.ptdika.com/tiket.com/pro/absen");
        Hooks.driver.navigate().refresh();
        Hooks.delay(Constants.DETIK);

    }

}
