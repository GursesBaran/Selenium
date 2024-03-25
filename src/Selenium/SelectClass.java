package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static Utilities.WebDriverHelper.closePreviousDrivers;
import static Utilities.WebDriverHelper.driver;

public class SelectClass {
    @Test
    public void Test1() {


        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement discoverxyz = driver.findElement(By.xpath("//select[@id='u_9TJ_4588']"));


        Select dropdown = new Select(discoverxyz);
        MyMethods.myWait(2);
        dropdown.selectByVisibleText("Online Advertising"); //selects by the displayed text of options
        //dropdown.selectByIndex();                         //selects by the index of options
        //dropdown.selectByValue();                         //

        List<WebElement> optionsList = dropdown.getOptions();
        System.out.println(optionsList.size());

        for (WebElement op : optionsList) {
            System.out.println(op.getText());
            System.out.println("Value = " + op.getAttribute("value"));
        }
        closePreviousDrivers();
    }
}
