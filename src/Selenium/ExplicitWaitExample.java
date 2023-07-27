package Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.WebDriverHelper.driver;

public class ExplicitWaitExample {

    @Test
    public void Test1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().window().maximize();

        WebElement timerButton = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        timerButton.click();

        WebElement message = driver.findElement(By.cssSelector("#demo"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));

        Assert.assertTrue(message.getText().equals("WebDriver"));








    }
}