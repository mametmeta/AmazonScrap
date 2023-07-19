package com.amazonscrap;

import com.amazonscrap.pages.DashboardPage;
import com.amazonscrap.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {
    static WebDriver driver;
    static ExtentTest extentTest;
    static DashboardPage dashboardPage = new DashboardPage();
    public TestDashboard(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User enter URL Amazon")
    public void user_enter_url_Amazon() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User enter URL Amazon");
    }
    @When("User click amazon")
    public void user_click_amazon() {
        Hooks.delay(5);
        dashboardPage.Buttonamazon();
        extentTest.log(LogStatus.PASS,"User click amazon");

    }
    @Then("User get text title page amazon")
    public void user_get_title_page_amazon() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(dashboardPage.getTxtAmazon(),"amazon");
    extentTest.log(LogStatus.PASS,"User get text title amazon");
    }
}