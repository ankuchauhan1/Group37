package org.sdet;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import org.junit.AfterClass;
//import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
    @CucumberOptions(features= {"src/test/FeatureFiles"},
            glue = "src/test/java/org/sdet/stepdef",
//plugin = { "html:output", "html:target/cucumber-reports","json:target/JSON/cucumber.json"},
            plugin={"pretty","html:target/cucumber-html-report/"},
            monochrome = true,
            tags="@AdvanceSettingScreen")

   // @Test
    public class TestRunner  {
    //@AfterClass
        public static void cleanup(){
                System.out.println("--- Execution Completed ---");
        }
    }
