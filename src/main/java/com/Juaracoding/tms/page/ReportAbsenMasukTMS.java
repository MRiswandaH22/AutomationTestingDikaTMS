package com.Juaracoding.tms.page;

import com.Juaracoding.tms.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement inputBranch;
    @FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
    WebElement btnBranch;

    //input position

    @FindBy(xpath = "//input[@class='form-control']")
    WebElement inputPosition;
    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement btnPosition;

    //memilih menu
    @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[1]/h4")
            //h4[@class='panel-title']
            //h4[normalize-space()='Report Masuk!!!']
    WebElement txtJudulAbsenMasuk;
    @FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li[7]/a/span")
    WebElement btnReportAbsen;
    @FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li[7]/ul/li/a")
    WebElement btnAbsenMasuk;


    public String getAllert() {
        Alert alert = driver.switchTo().alert();
        String textAlert = alert.getText();
        alert.accept();
        return textAlert;
    }
//        try {
//            driver.switchTo().alert();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return
//    }

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
        btnUnit.click();
        this.inputUnit.sendKeys(unit);
        this.inputUnit.sendKeys(Keys.RETURN);
    }
    public void setBranch(String branch){
        btnBranch.click();
        this.inputBranch.sendKeys(branch);
        this.inputBranch.sendKeys(Keys.RETURN);
    }

    public void setPosition(String position){
        btnPosition.click();
        this.inputPosition.sendKeys(position);
        this.inputPosition.sendKeys(Keys.RETURN);
    }

    public void setBtnAbsenMasuk(){
        btnAbsenMasuk.click();
    }

    public void setBtnReportAbsen(){
        btnReportAbsen.click();
    }

    public String getTxtJudulAbsenMasuk(){
        return txtJudulAbsenMasuk.getText();
    }
}
