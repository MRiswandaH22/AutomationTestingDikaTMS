package com.juaracoding.tms;

import com.Juaracoding.tms.page.LoginPageTMS;
import com.Juaracoding.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPageTMS loginPage = new LoginPageTMS();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin open browser and url")
    public void admin_open_browser_and_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User open browser and url");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username(){
        loginPage.enterUsername("admin_tms");
        extentTest.log(LogStatus.PASS,"User enter valid username");
    }

    @And("Admin enter valid password")
    public void admin_enter_valid_password(){
        loginPage.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS,"User enter valid password");
    }

    @And("Admin click button login")
    public void admin_click_button_login(){
        loginPage.buttonLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }

    @Then("Admin go to page Dashboard")
    public void admin_go_to_page_Dashboard(){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"User go to page Dashboard");
    }
}
