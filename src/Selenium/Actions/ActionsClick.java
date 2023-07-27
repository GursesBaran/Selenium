package Selenium.Actions;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.WebDriverHelper.driver;

public class ActionsClick {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");
        WebElement singleclick = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver); // Created Actions Object
        Action  action  = actions.moveToElement(singleclick).click().build();//Prepares the action
        MyMethods.myWait(3);
        action.perform(); // performs the action





















    }
}