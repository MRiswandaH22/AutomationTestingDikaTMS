package com.Juaracoding.tms.page;

import com.Juaracoding.tms.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTMS {
    private WebDriver driver;
    public LoginPageTMS(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@placeholder='NIK'])[1]")
    WebElement username;

    @FindBy(xpath = "(//input[@placeholder='Password'])[1]")
    WebElement password;

    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
    WebElement btnLogin;

    @FindBy(xpath = "(//h1[normalize-space()='Dashboard'])[1]")
    WebElement txtDashboard;

    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void buttonLogin(){
        btnLogin.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
}
