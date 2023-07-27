package Selenium.Locators;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FindByClassName {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        WebElement NameInput = driver.findElement(By.className("form-textbox"));
        NameInput.sendKeys("Baran");

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        for (WebElement e:labels){
            System.out.println(e.getText());
        }








        MyMethods.myWait(3);
        driver.quit();
    }
}
