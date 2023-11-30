package org.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CommonPagesLocators {

    WebDriver driver;
    public CommonPagesLocators(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /************ DL Landing page ************/
    @FindBy(xpath="//select[@id='roleList']")
    public static WebElement selectUserType ;
    Select select =new Select(selectUserType);

    public void verifyselectUserdisplayed(String User){
        selectUserType.isDisplayed();
    }

    public void selectUser(String User){
        select.selectByVisibleText(User);
    }

    @FindBy(xpath="//h2[contains(text(),'Deposit Line Mock Login')]")
    public static WebElement headerLandingPage;
    @FindBy(xpath="//input[@placeholder='orgid']")
    public static WebElement txtOrgID;
    @FindBy(xpath="//input[@placeholder='userId']")
    public static WebElement txtUserID;

    @FindBy(xpath="//input[@placeholder='firstName']")
    public static WebElement txtFirstName;

    @FindBy(xpath="//input[@placeholder='lastName']")
    public static WebElement txtLastName;

    public  void enterLoginDetails(String OrgID,String UserID, String firstName ,String lastName){
        txtOrgID.sendKeys(OrgID);
        txtUserID.sendKeys(UserID);
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
    }

    @FindBy(xpath="//button[@data-qa='login-button']")
    public static WebElement btnLogin ;
    public void verifyLoginButton() {
        btnLogin.isDisplayed();
    }
    public void clickLoginButton() {
        btnLogin.click();
    }






}
