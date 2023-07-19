package com.amazonscrap;

import com.amazonscrap.pages.SearchPage;
import com.amazonscrap.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestSearch {
    static WebDriver driver;
    static ExtentTest extentTest;
    static SearchPage searchPage = new SearchPage();

    public TestSearch(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User input data")
    public void user_input_data(){
        Hooks.delay(5);
        driver.get(Constants.URL);
        searchPage.InputSearch("iphone xr");
        extentTest.log(LogStatus.PASS,"User input data");

    }
    @And("User click button search")
    public void user_click_button_search(){
        Hooks.delay(2);
        searchPage.ButtonSearch();
        extentTest.log(LogStatus.PASS,"User click button search");
    }
    @And("User click iphone")
    public void user_click_iphone(){
        Hooks.delay(2);
        searchPage.ButtonIphone();
        extentTest.log(LogStatus.PASS,"User click iphone");
    }
    @And("User add to cart")
    public void user_add_to_cart(){
        Hooks.delay(2);
        searchPage.ButtonAdd();
        extentTest.log(LogStatus.PASS,"User add to cart");
    }

}

