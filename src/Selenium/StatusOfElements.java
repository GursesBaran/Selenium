package Selenium;

import Utilities.MyMethods;
import Utilities.WebDriverHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StatusOfElements extends WebDriverHelper {
    @Test
    public void Test1(){
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement tuesday = driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Tuesday-input']"));
        MyMethods.myWait(2);
        System.out.println("tuesday is displayed = " + tuesday.isDisplayed());
        System.out.println("tuesday is enabled = " + tuesday.isEnabled());
        System.out.println("tusday is selected = " + tuesday.isSelected());

        MyMethods.myWait(2);
        tuesday.click();
        MyMethods.myWait(2);

        System.out.println("tuesday1 is displayed after click = " + tuesday.isDisplayed());
        System.out.println("tuesday1 is enabled after click = " + tuesday.isEnabled());
        System.out.println("tuesday1 is selected after click = " + tuesday.isSelected());
    }
}
