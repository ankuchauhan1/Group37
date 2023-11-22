package org.sdet;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


   //@RunWith(Cucumber.class)
    @CucumberOptions(features= {"src/test/FeatureFiles"},
            glue = {"src/test/java"},
//plugin = { "html:output", "html:target/cucumber-reports","json:target/JSON/cucumber.json"},
            plugin={"pretty","html:target/cucumber-html-report/"},
            monochrome = true,
            tags="@AdvanceSetting")

    public class TestRunner {
        @AfterClass
        public static void cleanup(){
                System.out.println("--- Execution Completed ---");
        }
    }
