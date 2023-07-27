package Selenium.Mentoring;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static Utilities.WebDriverHelper.driver;

public class W3Schools {

    @Test
    public void Test() {

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        System.out.println(driver.getTitle());

        MyMethods.myWait(1);
        String mainPageWindowHandle = driver.getWindowHandle();
        System.out.println(mainPageWindowHandle);
        MyMethods.myWait(1);

        WebElement iFrame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrame);

        WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Visit W3Schools.com!']"));
        link.click();
        MyMethods.myWait(1);

        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);

        for (String each : windowhandles) {
            if (!each.equals(mainPageWindowHandle)) {
                driver.switchTo().window(each);


            }
        }
    }
}