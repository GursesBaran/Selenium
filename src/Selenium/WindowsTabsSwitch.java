package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static Utilities.WebDriverHelper.driver;

public class WindowsTabsSwitch {

    @Test

    public void WindowTest() {

        driver.get("https://www.selenium.dev/");
        String mainPageHandle = driver.getWindowHandle();

        WebElement watch = driver.findElement(By.xpath("//a[normalize-space()='Watch the Videos']"));
        MyMethods.myWait(2);
        watch.click();

        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(mainPageHandle)) {
                driver.switchTo().window(handle);
            }
        }
            MyMethods.myWait(2);
            System.out.println(driver.getCurrentUrl());
            driver.close();

            MyMethods.myWait(2);
            driver.switchTo().window(mainPageHandle);
            MyMethods.myWait(2);

            System.out.println(driver.getCurrentUrl());
            MyMethods.myWait(2);
            driver.quit();


        }
    }
