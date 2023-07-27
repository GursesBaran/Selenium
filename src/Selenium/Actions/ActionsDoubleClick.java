package Selenium.Actions;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionsDoubleClick {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");
        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(doubleclick).doubleClick().build();
        action.perform();

        MyMethods.WaitAndQuit(2);


    }
}