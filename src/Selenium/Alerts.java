package Selenium;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class Alerts {

    //Alert is a javascript code, not part of html code.
    // How to handle alerts in selenium

    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        driver.manage().window().maximize();

        WebElement clickprompbox = driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']"));
        clickprompbox.click();

        MyMethods.myWait(2);

        driver.switchTo().alert().sendKeys("Batch 8");
        driver.switchTo().alert().accept();

        MyMethods.myWait(2);

        WebElement match = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        MyMethods.myWait(1);
        Assert.assertTrue(match.getText().contains("Batch 8"));


    }
}