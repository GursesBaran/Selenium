package Selenium.Homework.XPath;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class XPathTask1 {

    @Test
    public void Test1() {

        driver.get("http://demoqa.com/text-box");
        MyMethods.myWait(1);

        WebElement name = driver.findElement(By.xpath("//*[@id='userName']"));
        MyMethods.myWait(1);
        name.sendKeys("Automation");
        System.out.println(name.getAttribute("value"));


        WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
        MyMethods.myWait(1);
        email.sendKeys("testing@gmail.com");
        System.out.println(email.getAttribute("value"));

        WebElement address = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        MyMethods.myWait(1);
        address.sendKeys("Testing Current Address");

        WebElement paddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        MyMethods.myWait(1);
        paddress.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
        MyMethods.myWait(1);
        try {
            submit.click();

        } catch (Exception e) {

            MyMethods.myWait(2);

        }
        WebElement check1 = driver.findElement(By.cssSelector("p[id='name']"));
        Assert.assertTrue("Test Failed", check1.getText().contains(name.getAttribute("value")));

        WebElement check2 = driver.findElement(By.cssSelector("p[id='email']"));
        Assert.assertTrue("Test Failed", check2.getText().contains(email.getAttribute("value")));

    }
}

