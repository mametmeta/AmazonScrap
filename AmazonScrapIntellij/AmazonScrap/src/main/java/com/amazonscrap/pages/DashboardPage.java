package com.amazonscrap.pages;

import com.amazonscrap.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement buttonamazon;
    @FindBy(xpath = "(//a[@id='nav-logo-sprites'])[1]")
    WebElement txtAmazon;
    public void Buttonamazon(){buttonamazon.click();}
    public String getTxtAmazon(){ return txtAmazon.getText();
    }


}
