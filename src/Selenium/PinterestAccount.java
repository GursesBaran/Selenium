package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class PinterestAccount {

    @Test
    public void Test1() {

        driver.get("https://www.pinterest.com/");
        driver.manage().window().maximize();

        MyMethods.myWait(2);

        WebElement signup = driver.findElement(By.xpath("//div[@class='tBJ dyH iFc sAJ O2T tg7 H2s']"));
        signup.click();

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("barangurses39@hotmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Pinterest2023");

        WebElement dob = driver.findElement(By.xpath("//input[@id='birthdate']"));
        dob.sendKeys("06/26/1992");

        MyMethods.myWait(2);
        driver.quit();
        }













    }
