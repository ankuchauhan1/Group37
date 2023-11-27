package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPagesLocators {
    /************ DL Landing page ************/
    @FindBy(xpath="//select[@id='roleList']")
    public static WebElement selectUserType;

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

    @FindBy(xpath="//button[@data-qa='login-button']")
    public static WebElement btnLogin;
}
