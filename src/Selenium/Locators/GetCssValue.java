package Selenium.Locators;

import Utilities.MyMethods;
import Utilities.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends WebDriverHelper {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement SearchInput = driver.findElement(By.id("inputValEnter"));
        System.out.println(SearchInput.getCssValue("color"));
        System.out.println(SearchInput.getCssValue("background"));         //CSS In Style
        System.out.println(SearchInput.getCssValue("text-overflow"));
        MyMethods.WaitAndQuit(2);
    }
}
