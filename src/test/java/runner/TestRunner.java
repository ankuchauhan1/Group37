package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
    @CucumberOptions(features= {"src/test/FeatureFiles"},
            glue = "stepdef",

            //plugin = { "html:output", "html:target/cucumber-reports","json:target/JSON/cucumber.json"},
            plugin={"pretty","html:target/cucumber-html-report/"},
            monochrome = true,
            tags="@CreditLineScreenInvalidData")

   // @Test
    public class TestRunner extends AbstractTestNGCucumberTests{
    //@AfterClass
        public static void cleanup(){
                System.out.println("--- Execution Completed ---");
        }
    }
