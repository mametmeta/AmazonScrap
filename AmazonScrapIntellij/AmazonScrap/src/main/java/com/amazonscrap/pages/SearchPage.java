package com.amazonscrap.pages;

import com.amazonscrap.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement inputsearch;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement buttonsearch;
    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//span[1]")
    WebElement buttoniphone;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement buttonadd;
    public void InputSearch(String inputsearch){this.inputsearch.sendKeys(inputsearch);}
    public void ButtonSearch(){ buttonsearch.submit();
    }
    public void ButtonIphone(){ buttoniphone.click();
    }
    public void ButtonAdd(){ buttonadd.click();

    }
}

