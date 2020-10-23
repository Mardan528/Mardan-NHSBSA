package com.nhs.step_defs;



import com.nhs.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // Methods that(@Before) execute before each test case.
    @Before
    public void setUp() {
        System.out.println("Before method");

        Driver.get().manage().window().maximize();
        Driver.get().manage().deleteAllCookies();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    // Methods that(@After) execute after each test case.
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After method");

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
         Driver.closeDriver();

    }


}

