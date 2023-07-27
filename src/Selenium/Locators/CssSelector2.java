package Selenium.Locators;

import Utilities.MyMethods;
import Utilities.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector2 extends WebDriverHelper {
    public static void main(String[] args) {

        //    >       -> searches among the immediate children
        //    space   -> searches among all children
        //    +       -> finds the first sibling
        //    ~       -> searches among all siblings
        //
        //
        //    Starts with - Ends with - Contains
        //
        //    input[id^='u_']             -> gives the input tag which has a id that starts with "u_"
        //    input[id*='_b_']            -> gives the input tag which has a class that contains "_b_"
        //    input[id^='u_'][id*='_b_']  -> can be used together
        //    input[class$='form']        -> gives the input tag which has a class that ends with "form"

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.manage().window().maximize();
        MyMethods.myWait(2);

            WebElement businessOption = driver.findElement(By.cssSelector("input[value='Business']"));
            businessOption.click();
        MyMethods.myWait(2);

        WebElement element1 = driver.findElement(By.cssSelector("div[id='section_1'] select[id='u_yQt_4588']"));
        element1.click();
        MyMethods.myWait(2);

        WebElement selectName=driver.findElement(By.cssSelector("select[name=u_yQt_4588] option[value='Online Advertising'"));
        selectName.click();
        MyMethods.myWait(2);

        WebElement everyDay = driver.findElement(By.cssSelector("label[for='u_yQt_89585_0']>span[class='label-body']"));
        everyDay.click();
        MyMethods.myWait(2);

        WebElement goodRadioButton = driver.findElement(By.cssSelector("input[name$='4589'][value='Good']"));
        goodRadioButton.click();
        MyMethods.myWait(2);

        WebElement XYZSelect = driver.findElement(By.cssSelector("select[name^='u_yQt'][id='u_yQt_4588']"));
        XYZSelect.click();
        MyMethods.myWait(2);

        WebElement experience = driver.findElement(By.cssSelector("select[id='u_yQt_4597']>:nth-child(4)"));
        experience.click();
        MyMethods.myWait(2);

        MyMethods.myWait(3);
        driver.quit();







            driver.quit();
        }
    }

