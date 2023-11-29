package org.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;


public class CreditLinePage {
     WebDriver driver;

    public CreditLinePage(){
        PageFactory.initElements(driver, this);
    }


    public void moveToCreditLinePage(){
        System.out.println("19");

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
    public void Fill_Details(){
        System.out.println("Details need to be filled");

    }

}
