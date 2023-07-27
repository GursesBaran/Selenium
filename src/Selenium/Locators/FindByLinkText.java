package Selenium.Locators;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.linkText("Careers"));

        System.out.println(element.getText());

        MyMethods.myWait(2);

        System.out.println(element.getAttribute("href")); //attribute of elements
        System.out.println(element.getAttribute("class"));

        WebElement element1 = driver.findElement(By.partialLinkText("Sell products"));
        System.out.println(element1.getText());
        MyMethods.myWait(3);
        driver.quit();


    }
}
