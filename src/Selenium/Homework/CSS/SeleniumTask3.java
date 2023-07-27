package Selenium.Homework.CSS;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class SeleniumTask3 {
    @Test
    public void Test1() {

        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        MyMethods.myWait(1);
        WebElement search = driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        search.sendKeys("Teddy Bear");

        WebElement searching = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        searching.click();

        WebElement result = driver.findElement(By.cssSelector("span[class='nnn']"));
        Assert.assertTrue("Test Failed", result.getText().contains("results for Teddy Bear"));

        MyMethods.WaitAndQuit(2);
        MyMethods.closePreviousDrivers();



    }
}
