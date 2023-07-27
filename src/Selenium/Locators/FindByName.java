package Selenium.Locators;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindByName {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://form.jotform.com/221934510376353");

    //Locators in Selenium
        // Id
        // Name
        // className
        // LinkText
        // PartialLinkText
        // TagName
        // Css Selector
        // XPath

        WebElement nameInput = driver.findElement(By.name("q8_name[first]"));
        nameInput.sendKeys("Baran");
















        MyMethods.myWait(3);
        driver.quit();
    }
}