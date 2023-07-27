package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FindByTagName {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        for (WebElement e : labels) {
            System.out.println(e.getText());

            //List<WebElement> linksonamazon = driver.findElements(By.tagName("a"));
            //for (WebElement e : linksonamazon)
            //System.out.println(e.getAttribute("href"));

        }

    }
}