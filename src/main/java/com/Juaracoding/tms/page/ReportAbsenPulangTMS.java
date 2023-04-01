package com.Juaracoding.tms.page;

import com.Juaracoding.tms.drivers.DriverSingleton;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportAbsenPulangTMS {

    private WebDriver driver;

    public ReportAbsenPulangTMS(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement btnLogout;
    @FindBy(xpath = "//span[normalize-space()='Admin TMS']")
    WebElement btnPofile;
    @FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li[7]/a/span")
    WebElement btnReportAbsen;
    @FindBy(xpath = "//*[@id='sidebar']/div/div[1]/ul/li[7]/ul/li[2]/a")
    WebElement btnAbsenPulang;
    @FindBy(xpath ="//*[@id='content']/div[1]/div/div/div[1]/h4")
    WebElement txtJudulAbsenPulang;

    public void logOut(){
        btnPofile.click();
        btnLogout.click();
    }
    public void goToAbsenPulang(){
        btnReportAbsen.click();
        btnAbsenPulang.click();
    }
    public String setTxtJudulAbsenPulang(){
        return txtJudulAbsenPulang.getText();
    }
}
