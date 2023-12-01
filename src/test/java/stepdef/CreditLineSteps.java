package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.sdet.CreditLinePage;
import org.sdet.LoginApplication;


public class CreditLineSteps {
    LoginApplication loginApp = new LoginApplication();
    CreditLinePage creditLine = new CreditLinePage();

    @Given("User is logged in to DLUI application & select Bank")
    public void loginToDLApplication() {
        System.out.println("inside a func.");
        loginApp.loginToDL();
    }

    @When("User navigates to Credit Line screen")
    public void move_to_CreditLine_Page() {
        System.out.println("Inside step 3");
        creditLine.moveToCreditLinePage();
    }

    @Then("Input all required fields on the Credit Line screen")
    public void FillAllFields() {
        creditLine.Fill_Details();
    }

    @Then("Input all required fields with incorrect data on the Credit Line screen")
    public void FillIncorrectData(){
        creditLine.Fill_Incorrect_Details();
    }


}