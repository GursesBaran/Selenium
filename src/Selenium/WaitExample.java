package Selenium;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.WebDriverHelper.driver;

public class WaitExample {

    @Test

    public void WaitExample(){

        driver.get("https://demoblaze.com/index.html");
        MyMethods.myWait(1);

        WebElement s6 = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
        s6.click();

        MyMethods.myWait(2);

        WebElement cart = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
        cart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        WebElement home = driver.findElement(By.xpath("//a[@id='nava']"));
        home.click();

        Assert.assertEquals("Test Failed", "https://demoblaze.com/index.html", driver.getCurrentUrl());

        driver.quit();


    }
}
