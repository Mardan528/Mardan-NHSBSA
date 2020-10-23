package com.nhs.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

//Singleton design let us use the same version of an object across to whole program.
//Singleton is a pattern, to use the same object everywhere.
public class Driver {

    //This private constructor prevent create object
    private Driver() {
    }

    public static WebDriver driver;

    public static WebDriver get() {

        if (driver == null) {
            //In this if statement we will get the browser name from OS or Configuration properties
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.get("browser");

            //In this case we will set up driver based on browser name
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {

                        throw new WebDriverException("Your OS doesn't support IE browser");
                    } else {

                        WebDriverManager.iedriver().setup();
                        driver = new InternetExplorerDriver();

                    }
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {

                        throw new WebDriverException("Your OS doesn't support Safari browser");
                    } else {

                        WebDriverManager.getInstance(SafariDriver.class).setup();
                        driver = new SafariDriver();

                    }
                    break;


            }


        }


        return driver;
    }

    //This method help us to quite browser
    public static void closeDriver() {

        driver.quit();


    }


}
