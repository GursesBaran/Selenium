package Selenium.Actions;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static Utilities.WebDriverHelper.driver;

public class Task {

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/");
        MyMethods.myWait(5);
        List <WebElement> urls = driver.findElements(By.xpath("//a[@target='_blank']"));
        for (WebElement url : urls){
            if (!url.getAttribute("href").contains("mailto")){
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", url);
            }
        }
















    }
}
