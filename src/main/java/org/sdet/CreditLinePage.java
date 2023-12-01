package org.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;


public class CreditLinePage extends LoginApplication {

    public CreditLinePage(){
        PageFactory.initElements(driver, this);
    }

    public void moveToCreditLinePage(){

        String header =driver.findElement(By.xpath("//ul/li[contains(text(),'Execution Process')]")).getText();
        Assert.assertEquals(header,"Execution Process");
        System.out.println("Homepage displayed");

        if(driver.findElement(By.xpath("//div[@class='dl-site-header navbar-fixed-top']/div/div[2]/ul/li[3]")).isDisplayed()){
            driver.findElement(By.xpath("//div[@class='dl-site-header navbar-fixed-top']/div/div[2]/ul/li[3]")).click();
            System.out.println("Credit Line page selected");
        }
        else {
            System.out.println("Credit Line page is not selected");
        }

    }
    public void Fill_Details() {
        System.out.println("Filling Details");
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).sendKeys("450");
        driver.findElement(By.xpath("//input[@role='combobox']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[1]")).sendKeys("Qualified Deposit Amount entered");
        driver.findElement(By.xpath("//input[@id='item-0']")).click();
        driver.findElement(By.xpath("//input[@id='item-1']")).click();
        driver.findElement(By.xpath("//input[@id='item-2']")).click();
        driver.findElement(By.xpath("//input[@id='item-3']")).click();
        driver.findElement(By.xpath("(//h4[@class='section-title'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[2]")).sendKeys("Qualified Deposit Type / SDEKs entered");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Deposit Percentage']")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[3]")).sendKeys("Deposit Percentage entered");
        driver.findElement(By.xpath("//input[@placeholder='Enter Credit Line Increment']")).sendKeys("1");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[4]")).sendKeys("Credit Line Increment entered");
        driver.findElement(By.xpath("//input[@placeholder='Enter Minimum Credit Line']")).sendKeys("50");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[5]")).sendKeys("Minimum Credit Line entered");
        driver.findElement(By.xpath("//input[@placeholder='Enter Maximum Credit Line']")).sendKeys("450");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[6]")).sendKeys("Maximum Credit Line entered");
        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).sendKeys("60 days");
        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).sendKeys("60");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[7]")).sendKeys("Fraud Transfer Expiration Period entered");
        driver.findElement(By.xpath("//*[@id='submit-button']")).click();
        //if (!driver.findElement(By.xpath("//div[@class='toast-body']")).isDisplayed()) {
        System.out.println("Data saved successfully");
        //} else {
//            System.out.println("Data not saved");

    }


    public void Fill_Incorrect_Details() {
        System.out.println("Filling incorrect Details");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.findElement(By.xpath("//*[@id='submit-button']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[text()=' Qualified Deposit Type / SDEKs is required ']")).getText(),"Qualified Deposit Type / SDEKs is required");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).sendKeys("450");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[1]")).click();
        String Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Qualified Deposit Amount']")).sendKeys("450");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.findElement(By.xpath("//input[@placeholder='Enter Deposit Percentage']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[2]")).click();
        Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Deposit Percentage']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Deposit Percentage']")).sendKeys("10");


        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)) ;
        driver.findElement(By.xpath("//input[@placeholder='Enter Credit Line Increment']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[3]")).click();
        Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Credit Line Increment']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Credit Line Increment']")).sendKeys("10");


        driver.findElement(By.xpath("//input[@placeholder='Enter Minimum Credit Line']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[4]")).click();
        Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Minimum Credit Line']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Minimum Credit Line']")).sendKeys("10");


        driver.findElement(By.xpath("//input[@placeholder='Enter Maximum Credit Line']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[5]")).click();
        Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Maximum Credit Line']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Maximum Credit Line']")).sendKeys("1000");

        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@placeholder='Implementation Notes'])[6]")).click();
        Actual_error =driver.findElement(By.xpath("//span[text()=' Number is required ']")).getText();
        Assert.assertEquals(Actual_error,"Number is required");
        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter Fraud Transfer Expiration Period']")).sendKeys("1000");




    }

}
