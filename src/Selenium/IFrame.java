package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.WebDriverHelper.driver;

public class IFrame {

    @Test

    public void iFrameTest(){

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
        WebElement topic = driver.findElement(By.xpath("//input[@type='text']"));
        topic.sendKeys("USA");

        driver.switchTo().frame("frame3");

        WebElement box = driver.findElement(By.id("a"));
        box.click();

        MyMethods.myWait(2);

        driver.switchTo().defaultContent();
        MyMethods.myWait(1);
        driver.switchTo().frame(1);

        WebElement animal = driver.findElement(By.id("animals"));
        //animals.selectByIndex(3);
        //animals.selectByValue("avatar");
        animal.sendKeys("Avatar");

        MyMethods.myWait(1);



        driver.quit();
















    }
}
