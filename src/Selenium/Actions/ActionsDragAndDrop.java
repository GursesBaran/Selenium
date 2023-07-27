package Selenium.Actions;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionsDragAndDrop {
    @Test
    public void Test1() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        Actions actions = new Actions(driver);
        //Action action = actions.dragAndDrop(oslo,norway).build();
        //action.perform();

        Action action = actions.clickAndHold(oslo).moveToElement(norway).release().build();
        action.perform();

        MyMethods.myWait(2);

        Assert.assertTrue(oslo.getCssValue("background-color").equals("rgba(0, 255, 0, 1"));

        MyMethods.WaitAndQuit(2);













    }
}