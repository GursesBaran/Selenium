package Selenium.Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionsSendKeys {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/auto-complete");
        WebElement inputbox = driver.findElement(By.id("autoCompleteMultipleContainer"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(inputbox).click().keyDown(Keys.SHIFT).sendKeys("j").keyUp(Keys.SHIFT).sendKeys("ohn").build();
        action.perform();
    }
}
