package Selenium.Actions;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.closePreviousDrivers;
import static Utilities.WebDriverHelper.driver;

public class ActionsRightClick {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");
        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(rightclick).contextClick().build();
        action.perform();

        MyMethods.WaitAndQuit(2);










    }
}