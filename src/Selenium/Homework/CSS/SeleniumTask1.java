package Selenium.Homework.CSS;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static Utilities.WebDriverHelper.driver;

public class SeleniumTask1 {
    @Test
    public void Test1() {

        driver.get("http://demoqa.com/text-box");
        MyMethods.myWait(1);

        WebElement name = driver.findElement(By.cssSelector("input[id='userName']"));
        MyMethods.myWait(1);
        name.sendKeys("Automation");
        System.out.println(name.getAttribute("value"));


        WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
        MyMethods.myWait(1);
        email.sendKeys("testing@gmail.com");
        System.out.println(email.getAttribute("value"));

        WebElement address = driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>textarea[placeholder='Current Address']"));
        MyMethods.myWait(1);
        address.sendKeys("Testing Current Address");

        WebElement paddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        MyMethods.myWait(1);
        paddress.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.cssSelector("div[class='text-right col-md-2 col-sm-12']>button[id='submit']"));
        MyMethods.myWait(1);
        try {
            submit.click();
        } catch (Exception e) {

            WebElement check = driver.findElement(By.cssSelector("p[id='name']"));
            Assert.assertTrue("Test Failed", check.getText().contains(name.getAttribute("value")));

            WebElement check1 = driver.findElement(By.cssSelector("p[id='email']"));
            Assert.assertTrue("Test Failed", check1.getText().contains(email.getAttribute("value")));


        }
    }
}