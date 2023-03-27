package com.Juaracoding.tms.page;

import com.Juaracoding.tms.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class ReportAbsenMasukTMS {

    private WebDriver driver;

    public ReportAbsenMasukTMS(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //btn submit
    @FindBy(xpath = "//input[@name='submit']")
    WebElement btnSubmit;


    //input startdate and enddate
    @FindBy(id = "datepicker2")
    WebElement inputEndDate;
    @FindBy(id = "datepicker")
    WebElement inputStartDate;
    //input unit
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement inputUnit;
    @FindBy(xpath = "//div[contains(text(),'-- Unit --')]")
    WebElement btnUnit;

    //input branch
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement inputBranch;
    @FindBy(xpath = "//div[contains(text(),'-- Branch --']")
    WebElement btnBranch;

    //input position
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement inputPosition;
    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement btnPosition;

    //memilih menu
    @FindBy(xpath = "//h4[@class='panel-title']")
            ////h4[normalize-space()='Report Masuk!!!']
    WebElement txtJudul;
    @FindBy(xpath = "//span[normalize-space()='Report Absen']")
    WebElement btnReportAbsen;
    @FindBy(linkText = "Absen Masuk")
    WebElement btnAbsenMasuk;


    public void setBtnSubmit(){
        btnSubmit.click();
    }
    public void setInputEndDate(String endDate){
        this.inputEndDate.sendKeys(endDate);
    }
    public void setInputStartDate(String startDate){
        this.inputStartDate.sendKeys(startDate);
    }
    public void setUnit(String unit){
        btnBranch.click();
        this.inputBranch.sendKeys(unit);
    }
    public void setBranch(String branch){
        btnBranch.click();
        this.inputBranch.sendKeys(branch);
    }

    public void setPosition(String position){
        btnPosition.click();
        this.inputPosition.sendKeys(position);
    }

    public void setMenujuReportAbsenMasuk(){
        btnReportAbsen.click();
        btnAbsenMasuk.click();
    }

    public String getTxtJudul(){
        return txtJudul.getText();
    }
}
