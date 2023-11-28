package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.sdet.CreditLinePage;
import org.sdet.LoginApplication;
import org.sdet.SelectBank;
import org.utils.TestConfig;

public class CreditLineSteps {

    CreditLinePage CreditLine = new CreditLinePage();
    @When("User navigates to Credit Line screen")
    public void move_to_CreditLine_page(){
        CreditLine.moveToCreditLinePage();
    }
}