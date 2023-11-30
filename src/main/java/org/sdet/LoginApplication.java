package org.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.utils.TestConfig;
import java.time.Duration;
import static org.pages.CommonPagesLocators.*;

//@Test
public class LoginApplication{
    //Creating a driver object referencing WebDriver interface
    static WebDriver driver=null;

    public LoginApplication(){
        PageFactory.initElements(driver, this);
    }

    @Test
    public void loginToDL(){
        String dlUI_URL = TestConfig.getConfigDetails().get("DLUI_URL");
        String userType= TestConfig.getConfigDetails().get("UserType");
        String orgID= TestConfig.getConfigDetails().get("OrgID");
        String userID=TestConfig.getConfigDetails().get("UserID");
        String firstName=TestConfig.getConfigDetails().get("FirstName");
        String lastName=TestConfig.getConfigDetails().get("LastName");
        String SearchBank=TestConfig.getConfigDetails().get("SearchBank");

        //Instantiating driver object and launching browser
        driver = new ChromeDriver();

        //Using get() method to open a webpage
        driver.get(dlUI_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;

        Select select=new Select(driver.findElement(By.xpath("//select[@id='roleList']")));
        if(driver.findElement(By.xpath("//select[@id='roleList']")).isDisplayed()){
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;
            select.selectByVisibleText(userType);
        }
        else
            System.out.println("Dropdown is not displayed to select user type");

        System.out.println(userType +" is selected from dropdown");

        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        //wait.until(ExpectedConditions.presenceOfElementLocated(btnLogin));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;

        driver.findElement(By.xpath("//input[@placeholder='orgid']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='orgid']")).sendKeys(orgID);

        driver.findElement(By.xpath("//input[@placeholder='userId']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='userId']")).sendKeys(userID);

        driver.findElement(By.xpath("//input[@placeholder='firstName']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='firstName']")).sendKeys(firstName);

        driver.findElement(By.xpath("//input[@placeholder='lastName']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='lastName']")).sendKeys(lastName);

        if(driver.findElement(By.xpath("//button[@data-qa='login-button']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        }
        else
            System.out.println("Login button is not displayed");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;

        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Deposit Line")){
            System.out.println("Title is: "+ title);
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Title is not matching");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)) ;

        if(driver.findElement(By.xpath("//input[@type='search']")).isDisplayed()){
            System.out.println("Select Bank");
            driver.findElement(By.xpath("//input[@type='search']")).clear();
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys(SearchBank);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;

        if(driver.findElement(By.xpath("//tbody/tr/td[2]")).getText().equalsIgnoreCase(SearchBank)){
            System.out.println("Bank selected");
            driver.findElement(By.xpath("//tbody/tr/td[2]")).click();
        }


    }
}