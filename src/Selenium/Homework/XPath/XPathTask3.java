package Selenium.Homework.XPath;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class XPathTask3 {

    @Test
    public void Test1() {


        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        MyMethods.myWait(1);
        WebElement search = driver.findElement(By.xpath("//*[@id='inputValEnter']"));
        search.sendKeys("Teddy Bear");

        WebElement searching = driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        searching.click();

        WebElement result = driver.findElement(By.xpath("//*[@id='searchMessageContainer']/div/span"));
        Assert.assertTrue("Test Failed", result.getText().contains("results for Teddy Bear"));

        MyMethods.WaitAndQuit(2);







    }
}

