package com.nhs.pages;

import com.nhs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {


    public ResultPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "FREE-heading")
    public WebElement youGetFreeTxt;


    @FindBy(id = "prescription-tick")
    public WebElement freeTreatment;


}
