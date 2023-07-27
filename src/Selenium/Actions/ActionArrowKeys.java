package Selenium.Actions;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionArrowKeys {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();

        WebElement inputbox = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(inputbox).click().sendKeys("b").build();
        action.perform();

        MyMethods.myWait(2);

        Action action1 = actions.sendKeys(Keys.ARROW_DOWN).build();
        action1.perform();

        Action action2 = actions.sendKeys(Keys.ENTER).build();
        action2.perform();

        MyMethods.myWait(2);

        driver.quit();

    }
}