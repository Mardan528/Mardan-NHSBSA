package com.nhs.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        glue = "com/nhs/step_defs",
        features = "src/test/java/resources",
        tags = "@test",
        dryRun =false




)

public class CukesRunner {
}
