package Selenium;

import Utilities.MyMethods;
import Utilities.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate extends WebDriverHelper {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element = driver.findElement(By.id("alerttest"));

        MyMethods.myWait(3);

        element.click();
        MyMethods.myWait(3);

        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("Current URL = " + CurrentUrl);

        driver.navigate().back(); //takes us to previous page
        MyMethods.myWait(3);
        // driver.get() - doesn't allow us to go back and forth
        // driver.navigate() - keeps the history so allows us to go back and forth

        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();

        MyMethods.WaitAndQuit(2);




    }
}
