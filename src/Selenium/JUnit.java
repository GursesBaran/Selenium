package Selenium;
import Utilities.MyMethods;
import org.junit.Test;
import Utilities.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JUnit extends WebDriverHelper {

    @Test
    public void Test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.manage().window().maximize();
        MyMethods.myWait(2);

        WebElement businessOption = driver.findElement(By.cssSelector("input[value='Business']"));
        businessOption.click();
        MyMethods.myWait(2);

        WebElement element1 = driver.findElement(By.cssSelector("#u_CHw_4588"));
        element1.click();


        WebElement selectName=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        selectName.click();


        WebElement everyDay = driver.findElement(By.cssSelector("#u_CHw_89585_0"));
        everyDay.click();
        MyMethods.myWait(2);

        WebElement goodRadioButton = driver.findElement(By.cssSelector("input[name$='4589'][value='Good']"));
        goodRadioButton.click();
        MyMethods.myWait(2);

        WebElement XYZSelect = driver.findElement(By.cssSelector("#u_CHw_4597"));
        XYZSelect.click();
        MyMethods.myWait(2);

        WebElement experience = driver.findElement(By.cssSelector("option[value=\"I'm not using XYZ yet, but I will in the future\"]"));
        experience.click();

        MyMethods.myWait(3);
        driver.quit();







        driver.quit();
    }
}