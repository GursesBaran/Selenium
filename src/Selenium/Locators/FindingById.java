package Selenium.Locators;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingById {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://form.jotform.com/221934510376353");

       WebElement FirstNameInputBox = driver.findElement(By.id("first_8"));
        MyMethods.myWait(3);
       FirstNameInputBox.sendKeys("Baran");
       WebElement LastNameInputBox = driver.findElement(By.id("last_8"));
        MyMethods.myWait(3);
       LastNameInputBox.sendKeys("Gurses");


        MyMethods.myWait(3);
       driver.quit();


    }
}
