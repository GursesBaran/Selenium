package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class IFrame2 {

    @Test

    public void iFrameTest() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@type='text']"));
        topic.sendKeys("USA");

        driver.switchTo().frame(0);

        MyMethods.myWait(2);

        driver.switchTo().frame("frame3");

        WebElement check = driver.findElement(By.xpath("//input[@id='checkbox']"));
        check.click();
    }
}