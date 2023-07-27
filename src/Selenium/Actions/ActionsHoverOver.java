package Selenium.Actions;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionsHoverOver {
    @Test
    public void Test1() {

        driver.get("https://www.ebay.com/");
        WebElement electronics = driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(electronics).build();
        action.perform();

        WebElement headphones = driver.findElement(By.linkText("Headphones"));
        headphones.click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Headphones"));

        MyMethods.WaitAndQuit(2);

    }
}
