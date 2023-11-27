package org.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvanceSetting{

    static WebDriver driver;
    public static WebElement tabAdvanceSetting = driver.findElement(By.xpath("//a[contains(text(),'Advance Setting')]"));
    public static WebElement labelAdvanceOptions = driver.findElement(By.xpath("//h4[contains(text(),'Advance Options')]"));
    public static WebElement txtAdvanceAmountIncrement = driver.findElement(By.xpath("(//input[@type='text' and @placeholder='$0.00'])[1]"));
    public static WebElement txtMinAdvanceAmount = driver.findElement(By.xpath("(//input[@type='text' and @placeholder='$0.00'])[2]"));

    public void moveToAdvanceSettingScreen(){

    }


}
