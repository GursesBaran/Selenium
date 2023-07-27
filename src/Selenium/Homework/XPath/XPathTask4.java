package Selenium.Homework.XPath;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class XPathTask4 {
    @Test
    public void Test1() {


        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        MyMethods.myWait(1);

        WebElement calculate = driver.findElement(By.xpath("//*[@id='calculate']"));
        calculate.click();

        WebElement input = driver.findElement(By.xpath("//*[@id='number1']"));
        input.sendKeys("10");

        WebElement input2 = driver.findElement(By.xpath("//*[@id='number2']"));
        input2.sendKeys("20");

        WebElement calculatenow = driver.findElement(By.xpath("//*[@id='calculate']"));
        calculatenow.click();

        WebElement result = driver.findElement(By.xpath("//*[@id='answer']"));
        Assert.assertTrue("Test Failed", result.getText().contains("30"));
    }
}
