package com.nhs.pages;

import com.nhs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BenefitsPage {

    public BenefitsPage() {
        PageFactory.initElements(Driver.get(), this);
    }


//    //Do you get paid Universal Credit?
//    @FindBy(id = "yes-universal")
//    public WebDriver yesUniversalCheckBox;
//
//    @FindBy(xpath = "//label[@for='yes-universal']")
//    public WebDriver yesUniversalCheckBoxXpath;
//
//
//    @FindBy(xpath = "//label[@for='not-yet']")
//    public WebDriver notYetBTNXpath;
//
//    @FindBy(xpath = "//label[@for='different-benefit']")
//    public WebDriver differentCheckBox;

//    @FindBy(xpath = "//label[@for='taxCredit']")
//    public WebDriver differentCheckBox;


    public WebElement chooseBenefits(String benefitsType) {

        String locator = "//label[contains(.,'" + benefitsType + "')]";

        return Driver.get().findElement(By.xpath(locator));

    }

}
