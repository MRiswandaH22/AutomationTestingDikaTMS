package com.Juaracoding.tms.page;

import com.Juaracoding.tms.drivers.DriverSingleton;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LaporanKegiatanAbsenMasuk {

    WebDriver driver;

    public LaporanKegiatanAbsenMasuk(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/p")
    WebElement txtFilePDF;
    //input absen masuk

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//input[@id='file']")
    WebElement uploadFile;
    @FindBy(id = "divisi")
    WebElement btnDivisi;
    @FindBy(id = "type_shift")
    WebElement btnTypeShift;
    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    WebElement btnShift;
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement inputNamaShift;
    @FindBy(id = "absen_type")
    WebElement btnAbsenType;
    @FindBy(xpath = "//textarea[@name='keterangan']")
    WebElement inputKeterangan;


    //goto absen masuk
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtJudul;
    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    WebElement btnAbsenMasuk;
    @FindBy(xpath = "//*[@id='sidebar']/div/div[1]/ul/li[3]/a")
    WebElement btnLaporanKegiatan;

    //succes input data absen
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]")
    WebElement txtAllertSuccesInputAbsen;

    @FindBy(xpath = "//a[@class='back']")
    WebElement btnBackAllert;

    //validation message (invalid)

    public String getValidtionMessageFotoSelfiePDF(){
        return txtFilePDF.getText();
    }
    public String getValidationMessageFotoSelfie(){
        String msg1 = driver.findElement(By.xpath("//input[@id='file']")).getAttribute("validationMessage");
        return msg1;
    }
    public String getValidationMessageDivisi(){
        String msg2 = driver.findElement(By.id("divisi")).getAttribute("validationMessage");
        return msg2;
    }
    public String getValidationMessageTipeShift(){
        String msg3 = driver.findElement(By.id("type_shift")).getAttribute("validationMessage");
        return msg3;
    }
    public String getValidationMessageNamaShift(){
        String msg4 = driver.findElement(By.xpath("//select[@id='shift_name']")).getAttribute("validationMessage");
        return msg4;
    }
    public String getValidationMessageTipeAbsen(){
        String msg5 = driver.findElement(By.id("absen_type")).getAttribute("validationMessage");
        return msg5;

        //Please select an item in the list. (dropdown), yg foto selfie belum
    }

    public void setBtnBackAllert(){
        btnBackAllert.click();
    }
    public String setAllertSucces(){
        return txtAllertSuccesInputAbsen.getText();
    }

    //input absen masuk
    public void setBtnSubmit(){
        btnSubmit.click();
    }
    public void setInputKeterangan(String keterangan){
        this.inputKeterangan.sendKeys(keterangan);
    }
    public void setDrpTipeAbsen(String value){
        this.btnAbsenType.sendKeys(value);
//        Select drpTipeAbsen = new Select(driver.findElement(By.id("absen_type")));
//        drpTipeAbsen.selectByValue(value);
    }
    public void setInputNamaShift(String namaShift){
        this.btnShift.click();
        this.inputNamaShift.sendKeys(namaShift);
        this.inputNamaShift.sendKeys(Keys.RETURN);
    }
    public void setDrpTipeShift(String value){
        this.btnTypeShift.sendKeys(value);
//        Select drpTipeShift = new Select(driver.findElement(By.id("type_shift")));
//        drpTipeShift.selectByValue(value);
    }
    public void setDivisi(String value){
        this.btnDivisi.sendKeys(value);
//        Select drpDivisi = new Select(driver.findElement(By.id("divisi")));
//        drpDivisi.selectByValue(value);
    }
    public void setUploadFile(String url){
         this.uploadFile.sendKeys(url);
    }



    //go to page input absen

    public void clickLaporanKegiatan(){
        btnLaporanKegiatan.click();
    }

    public void clickAbsenMasuk(){
        btnAbsenMasuk.click();
    }

    public String getJudulHalaman(){
        return txtJudul.getText();
    }

    public String getAllert() {
        Alert alert = driver.switchTo().alert();
        String textAlert = alert.getText();
        alert.accept();
        return textAlert;
    }
}
