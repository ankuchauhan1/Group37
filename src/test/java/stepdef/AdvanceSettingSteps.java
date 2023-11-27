package org.sdet.stepdef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.sdet.LoginApplication;
import org.sdet.SelectBank;
import org.utils.TestConfig;

public class AdvanceSettingSteps  {
    LoginApplication loginApp = new LoginApplication();
    SelectBank sb = new SelectBank();
    String searchbank = TestConfig.getConfigDetails().get("SearchBank");
    @Given("User is logged in to DLUI application")
    public void loginToDLApplication() {
        System.out.println("inside a func.");
        loginApp.loginToDL();
    }
  /*  @When ("User search for required bank")
        public void navigateToAdvanceSettingScree(){
        sb.selectBank(searchbank);
        }

    @Then("Input all required fields on the Advance Settings screen")
    public void inputDetailsOnAdvanceSettingScreen(){

    }*/
}
