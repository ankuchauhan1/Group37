package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPagesLocators {

    static WebDriver driver = null;
    /************ DL Landing page ************/
    //@FindBy(xpath="//select[@id='roleList']")
    public static WebElement selectUserType = driver.findElement(By.xpath("//select[@id='roleList']"));

    //@FindBy(xpath="//h2[contains(text(),'Deposit Line Mock Login')]")
   // public static WebElement headerLandingPage;
    public static WebElement headerLandingPage = driver.findElement(By.xpath("//h2[contains(text(),'Deposit Line Mock Login')]"));

    //@FindBy(xpath="//input[@placeholder='orgid']")
    public static WebElement txtOrgID1 = driver.findElement(By.xpath("//input[@placeholder='orgid']"));

    @FindBy(xpath="//input[@placeholder='userId']")
    public static WebElement txtUserID;

    @FindBy(xpath="//input[@placeholder='firstName']")
    public static WebElement txtFirstName;

    @FindBy(xpath="//input[@placeholder='lastName']")
    public static WebElement txtLastName;

    //@FindBy(xpath="//button[@data-qa='login-button']")
    public static WebElement btnLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
}
