package Selenium.Locators;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Utilities.WebDriverHelper.driver;

public class AmazonLocator {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");
        MyMethods.myWait(1);

        WebElement gift = driver.findElement(By.cssSelector("a[data-csa-c-content-id ='nav_cs_gc']"));
        MyMethods.myWait(1);
        System.out.println(gift.getText());


        WebElement registry = driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_10']"));
        MyMethods.myWait(1);
        System.out.println(registry.getText());

        //driver.findElement(By.cssSelector("a[href*='sell'] span.nav-line-2"));


    }
}

