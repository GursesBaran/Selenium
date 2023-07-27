package Selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.WebDriverHelper.driver;

public class ExplicitWaitExample2 {

    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.xpath("//input[@id='title']"));
        name.click();
        name.sendKeys("Batch 8");
        WebElement comment = driver.findElement(By.xpath("//textarea[@id='description']"));
        comment.click();
        comment.sendKeys("Automation");

        WebElement submit = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id='submit-control']"),"Form submited Successfully!"));

        WebElement verify = driver.findElement(By.xpath("//div[@id='submit-control']"));
        Assert.assertTrue(verify.getText().equals("Form submited Successfully!"));





    }
}