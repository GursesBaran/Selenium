package Selenium.Homework.XPath;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class XPathTask6 {

    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        MyMethods.myWait(1);

        WebElement fake = driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        fake.click();

        WebElement showmodel = driver.findElement(By.xpath("//*[@id='fakealert']"));
        showmodel.click();

        WebElement ok = driver.findElement(By.xpath("//*[@id='dialog-ok']"));
    }

}