package com.nhs.step_defs;

import com.nhs.pages.BasePage;
import com.nhs.pages.CountryPage;
import com.nhs.pages.DateOfBirthPage;
import com.nhs.pages.ResultPage;
import com.nhs.utilities.BrowserUtilities;
import com.nhs.utilities.ConfigurationReader;
import com.nhs.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.Map;

public class US1_WalesTestTicket {

    String m;
    BasePage basePage = new BasePage();
    CountryPage countryPage = new CountryPage();
    DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
    ResultPage resultPage = new ResultPage();


    @Given("I am a person from {string} date of birth {string} {string} {string}")
    public void i_am_a_person_from_date_of_birth(String country, String day, String month, String year) {


        Driver.get().get(ConfigurationReader.get("url"));
        basePage.verifyFirstPageTitle();

        basePage.startBTN.click();

        basePage.followingPageTitle();

        countryPage.chooseCountry(country).click();

        basePage.nextBTN.click();

        basePage.followingPageTitle();
        dateOfBirthPage.dayInputBox.sendKeys(day);
        dateOfBirthPage.monthInputBox.sendKeys(month);
        dateOfBirthPage.yearInputBox.sendKeys(year);

        basePage.nextBTN.click();

    }


    @When("I put my circumstances into the Checker tool")
    public void i_put_my_circumstances_into_the_Checker_tool(Map<String, ?> circumstances) {


        for (String s : circumstances.keySet()) {

            basePage.information((String) circumstances.get(s));
        }


        BrowserUtilities.waitFor(5);


    }

    @Then("I should get a result of whether I will get help or not")
    public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {


        String actualResult = "You get help with health costs";

        String expectedResult = Driver.get().getTitle();

        Assert.assertEquals(expectedResult, actualResult);

        String resultHeader = resultPage.freeTreatment.getText();
        String resultForFree = resultPage.youGetFreeTxt.getText();


        System.out.println(resultForFree);

        System.out.println(resultHeader);


    }


}
