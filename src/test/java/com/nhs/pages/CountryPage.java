package com.nhs.pages;

import com.nhs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountryPage {


    @FindBy(id = "label-wales")
    public WebDriver WalesCheckBox;

    public WebElement chooseCountry(String country) {

        String locator = "//label[contains(.,'" + country + "')]";

        return Driver.get().findElement(By.xpath(locator));

    }


}
