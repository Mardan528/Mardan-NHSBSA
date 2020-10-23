package com.nhs.pages;

import com.nhs.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateOfBirthPage {

    //In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements
    public DateOfBirthPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "dob-day")
    public WebElement dayInputBox;

    @FindBy(id = "dob-month")
    public WebElement monthInputBox;

    @FindBy(id = "dob-year")
    public WebElement yearInputBox;

    @FindBy(css = ".summary")
    public WebElement whyAskDOBHiddenText;


}
