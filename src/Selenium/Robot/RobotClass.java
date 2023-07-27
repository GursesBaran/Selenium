package Selenium.Robot;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.PanelUI;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static Utilities.WebDriverHelper.driver;

public class RobotClass {

    // We use it to deal with windows when we want to download or upload something

    @Test
    public void RobotClass1() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        Actions actions = new Actions(driver);
        actions.click(choosefile).build().perform();
        MyMethods.myWait(4);


        StringSelection filepath = new StringSelection("C:\\Users\\baran\\OneDrive\\Desktop\\RobotClassTest\\New Text Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        //pressed ctrl+V
        MyMethods.myWait(3);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        //released ctrl+V
        MyMethods.myWait(3);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement checkBox = driver.findElement(By.id("terms"));
        checkBox.click();

        MyMethods.myWait(3);

        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        WebElement verify = driver.findElement(By.id("res"));
        MyMethods.myWait(3);
        Assert.assertTrue(verify.getText().contains("successfully uploaded"));

        driver.quit();







    }
}
