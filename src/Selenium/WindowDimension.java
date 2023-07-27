package Selenium;

import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

import static Utilities.WebDriverHelper.driver;

public class WindowDimension {

    @Test
    public void Test(){

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Dimension dimension = new Dimension(390,844);
        driver.manage().window().setSize(dimension);





    }
}
