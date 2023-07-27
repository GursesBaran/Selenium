package Selenium.Homework.XPath;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class XPathTask2 {

    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");
        MyMethods.myWait(1);

        WebElement name = driver.findElement(By.xpath("//*[@id='username']"));
        MyMethods.myWait(1);
        name.sendKeys("ttechno@gmail.com");
        System.out.println(name.getAttribute("value"));

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        MyMethods.myWait(1);
        name.sendKeys("techno123.");
        System.out.println(name.getAttribute("value"));

        WebElement signin = driver.findElement(By.xpath("//*[@id='log-in']"));
        signin.click();

        WebElement verify = driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue("Test Failed", verify.getText().contains("Your nearest branch closes in: 30m 5s"));


    }
}
