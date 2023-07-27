package Selenium.Homework.CSS;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class SeleniumTask6 {
    @Test

    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        MyMethods.myWait(1);

        WebElement fake = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fake.click();

        WebElement show = driver.findElement(By.cssSelector("input[id='modaldialog']"));
        show.click();

        WebElement ok = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        ok.click();

    }
}
