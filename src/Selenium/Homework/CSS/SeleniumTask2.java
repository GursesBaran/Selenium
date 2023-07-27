package Selenium.Homework.CSS;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class SeleniumTask2 {
    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");
        MyMethods.myWait(1);

        WebElement name = driver.findElement(By.cssSelector("input[id='username']"));
        MyMethods.myWait(1);
        name.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='password']"));
        MyMethods.myWait(1);
        password.sendKeys("techno123");

        WebElement signin = driver.findElement(By.cssSelector("a[id='log-in']"));
        signin.click();

        WebElement time = driver.findElement(By.cssSelector("h6[id='time']"));
        Assert.assertTrue("Test Failed",time.getText().equals("Your nearest branch closes in: 30m 5s"));

    }
}
