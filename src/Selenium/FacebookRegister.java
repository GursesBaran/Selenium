package Selenium;

import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Utilities.WebDriverHelper.driver;

public class FacebookRegister {

        @Test
        public void Test1(){

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        MyMethods.myWait(2);
        WebElement Account = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        MyMethods.myWait(1);
        Account.click();

        WebElement firstname = driver.findElement(By.cssSelector("input[id^='u_'][name='firstname']"));
        MyMethods.myWait(1);
        firstname.sendKeys("Abuzittin");

        WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname']"));
        MyMethods.myWait(1);
        lastname.sendKeys("Satilmis");

        WebElement phone = driver.findElement(By.cssSelector("input[id^='u_'][name='reg_email__']"));
        MyMethods.myWait(1);
        phone.sendKeys("2014556352");

        WebElement password = driver.findElement(By.cssSelector("input[id^='password_step_input']"));
        MyMethods.myWait(1);
        password.sendKeys("Baba2023");

        WebElement date = driver.findElement(By.cssSelector("select[aria-label='Month']>option[value='6']"));
        MyMethods.myWait(1);
        date.click();

        WebElement date1 = driver.findElement(By.cssSelector("select[aria-label='Day']>option[value='4']"));
        MyMethods.myWait(1);
        date1.click();

        WebElement date2 = driver.findElement(By.cssSelector("select[aria-label='Year']>option[value='1992']"));
        MyMethods.myWait(1);
        date2.click();

        WebElement gender = driver.findElement(By.cssSelector("input[id^='u_3_5'][name='sex']"));
        gender.click();

        WebElement signup = driver.findElement(By.cssSelector("[name='websubmit']"));
        MyMethods.myWait(1);
        signup.click();


    }
}
