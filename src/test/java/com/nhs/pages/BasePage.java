package com.nhs.pages;

import com.nhs.utilities.BrowserUtilities;
import com.nhs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class BasePage {

    //In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

//
    public WebElement firstPageTitle() {

        return Driver.get().findElement(By.className("heading-xlarge"));

    }

    public WebElement followingPageTitle() {

        return Driver.get().findElement(By.id("question-heading"));

    }


    public WebElement yesNoRadio(String yesNo) {


        String locator = "//label[contains(.,'" + yesNo + "')]";

        return Driver.get().findElement(By.xpath(locator));


    }

    public void verifyPageTitle() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = followingPageTitle().getText();

        assertEquals("verify current page title ", expectedTitle, actualTitle);

    }

    public void verifyFirstPageTitle() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = firstPageTitle().getText();

        assertEquals("very current page title ", expectedTitle, actualTitle);

    }

    public WebElement chooseBenefits(String benefitsType) {

        String locator = "//label[contains(.,'" + benefitsType + "')]";

        return Driver.get().findElement(By.xpath(locator));

    }

    public void information(String circumstances) {

        BrowserUtilities.waitFor(1);
        followingPageTitle();
        yesNoRadio((circumstances)).click();

        nextBTN.click();


    }


    @FindBy(id = "next-button")
    public WebElement startBTN;

    @FindBy(id = "back-button")
    public WebElement backBTN;

    @FindBy(id = "next-button")
    public WebElement nextBTN;


     @FindBy(id = "label-no")
    public WebElement noRadio;




}
