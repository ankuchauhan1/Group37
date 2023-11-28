package org.sdet;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.pages.CreditLineLocators.label_Credit_Line_Calculation_Options;
import static org.pages.CreditLineLocators.tab_CreditLine;

public class CreditLinePage {
    static WebDriver driver;
    public void moveToCreditLinePage(){
        if(tab_CreditLine.isDisplayed()){
            tab_CreditLine.click();
        }
        else {
            System.out.println("User is not in the homepage");
        }
        System.out.println(label_Credit_Line_Calculation_Options.getText());
        Assert.assertEquals(label_Credit_Line_Calculation_Options.getText(),"");
    }
    public void Fill_Details(){

    }

}
