package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditLineLocators {

    /************ Self service tool Credit Line page ************/
    @FindBy(xpath="//div[@class='dl-site-header navbar-fixed-top']/div/div[2]/ul/li[3]")
    public static WebElement tab_CreditLine ;

    @FindBy(xpath="//h4[@class='section-title border-botton']")
    public static WebElement label_Credit_Line_Calculation_Options ;
    @FindBy(xpath="//input[@placeholder='Enter Qualified Deposit Amount']")
    public static WebElement txt_Qualified_Deposit_Amount ;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[1]")
    public static WebElement txt_Qualified_Deposit_Amount_Notes ;

    @FindBy(xpath="//input[@id='item-0']")
    public static WebElement Select_SDEK_ACHC ;
    @FindBy(xpath="//input[@id='item-1']")
    public static WebElement Select_SDEK_TELC ;
    @FindBy(xpath="//input[@id='item-2']")
    public static WebElement Select_SDEK_ATMC ;
    @FindBy(xpath="//input[@id='item-3']")
    public static WebElement Select_SDEK_REVD ;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[2]")
    public static WebElement txt_Qualified_Deposit_Type_SDEKs_Notes ;
    @FindBy(xpath="//input[@placeholder='Enter Deposit Percentage']")
    public static WebElement txt_Deposit_Percentage;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[3]")
    public static WebElement txt_Deposit_Percentage_Notes ;
    @FindBy(xpath="//input[@placeholder='Enter Credit Line Increment']")
    public static WebElement txt_Credit_Line_Increment;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[4]")
    public static WebElement txt_Credit_Line_Increment_Notes ;
    @FindBy(xpath="//input[@placeholder='Enter Minimum Credit Line']")
    public static WebElement txt_Minimum_Credit_Line_;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[5]")
    public static WebElement txt_Minimum_Credit_Line_Notes ;
    @FindBy(xpath="//input[@placeholder='Enter Maximum Credit Line']")
    public static WebElement txt_Maximum_Credit_Line_;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[6]")
    public static WebElement txt_Maximum_Credit_Line_Notes ;
    @FindBy(xpath="//input[@placeholder='Enter Fraud Transfer Expiration Period']")
    public static WebElement txt_Fraud_Transfer_Expiration_Period;
    @FindBy(xpath="(//input[@placeholder='Implementation Notes'])[7]")
    public static WebElement txt_Fraud_Transfer_Expiration_Period_Notes ;
    @FindBy(xpath="//*[@id='submit-button']")
    public static WebElement btn_Submit ;



}
