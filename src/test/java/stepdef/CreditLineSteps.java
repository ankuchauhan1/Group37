package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.sdet.CreditLinePage;

public class CreditLineSteps {

    CreditLinePage CreditLine = new CreditLinePage();

    @When("User navigates to Credit Line screen")
    public void move_to_CreditLine_page()
    {
        CreditLine.moveToCreditLinePage();
    }


    @Then("Input all required fields on the Credit Line screen")
    public void fill_all_the_details(){
        CreditLine.Fill_Details();
    }



}