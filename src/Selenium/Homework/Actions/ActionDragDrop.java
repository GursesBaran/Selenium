package Selenium.Homework.Actions;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.WebDriverHelper.driver;

public class ActionDragDrop {

    @Test
    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement oslo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='a1']")));
        WebElement rome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='a10']")));
        WebElement washington = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='a4']")));

        WebElement norway = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='questionDiv'][@id='questionDiv']//div[18]")));
        WebElement italy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='questionDiv'][@id='questionDiv']//div[6]")));
        WebElement usa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='questionDiv'][@id='questionDiv']//div[22]")));

        Actions actions = new Actions(driver);

        actions.clickAndHold(oslo).moveToElement(norway).release().build().perform();
        actions.clickAndHold(rome).moveToElement(italy).release().build().perform();
        actions.clickAndHold(washington).moveToElement(usa).release().build().perform();


        String norwayText = norway.getText();
        String italyText = italy.getText();
        String usaText = usa.getText();

        if (norwayText.equals("Oslo") && italyText.equals("Rome") && usaText.equals("Washington")) {
            System.out.println("Drag and drop actions were successful!");
        } else {
            System.out.println("Drag and drop actions failed!");
        }
    }

}