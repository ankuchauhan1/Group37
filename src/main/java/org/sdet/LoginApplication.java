package org.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.TestConfig;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class LoginApplication{
    @FindBy(xpath="//select[@id='roleList']")
    public static WebElement selectUserType;

    public static void main(String[] args){

        String dlUI_URL = TestConfig.getConfigDetails().get("DLUI_URL");
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        String userType= TestConfig.getConfigDetails().get("UserType");
        String orgID= TestConfig.getConfigDetails().get("OrgID");
        String userID=TestConfig.getConfigDetails().get("UserID");
        String firstName=TestConfig.getConfigDetails().get("FirstName");
        String lastName=TestConfig.getConfigDetails().get("LastName");

        //String path = System.getProperty("user.dir");
        //Setting webdriver.gecko.driver property
       // System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/drivers/chromedriver.exe");

        //Instantiating driver object and launching browser
      driver = new ChromeDriver();

        //Using get() method to open a webpage
        driver.get(dlUI_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)) ;

        Select select = new Select(selectUserType);
        select.selectByVisibleText(userType);

       /* HashMap<String, String> configdetails = TestConfig.getConfigDetails();
        Iterator it = configdetails.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(((String) pair.getKey()).equalsIgnoreCase("username"))
             user = (String) pair.getValue();
            if(((String) pair.getKey()).equalsIgnoreCase("password"))
            		 pass = (String) pair.getValue();
            if(((String) pair.getKey()).equalsIgnoreCase("bankname"))
            	bname = (String) pair.getValue();

        }
        System.out.println(user +" "+ pass +" "+ bname);
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-default']")).click();
        driver.findElement(By.xpath("//*[contains(text(), '"+bname+"')]")).click();*/
        try {
            Alert alert = driver.switchTo().alert();
            alert.getText();

         System.out.println(alert.getText());
            alert.accept();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        String title = driver.getTitle();

		if(title.equalsIgnoreCase("SmartConfig"))
		{
			System.out.println("tITLE "+ title);
			System.out.println("Login Successful");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        //driver.findElement(By.xpath("//*[text()='KEY']")).click();
        //Closing the browser
       // driver.quit();

    }
}
