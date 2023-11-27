package org.sdet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class SelectBank extends LoginApplication{
    WebElement selectBankHeader = driver.findElement(By.xpath("//h4[contains(text(),'Select Bank')]"));
    WebElement searchBank = driver.findElement(By.xpath("//input[@type='search']"));
    /*public SelectBank(){
        PageFactory.initElements(driver, this);
    }*/
    public void selectBank(String selectBank){
        System.out.println("Inside 2nd step");
        if(selectBankHeader.isDisplayed()){
            searchBank.clear();
            searchBank.sendKeys(selectBank);
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        }
    }
}
