package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utilities.WebDriverHelper.driver;

public class IteraLogin {

    @Test
    public void Test1() {

        driver.get("https://itera-qa.azurewebsites.net/");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='Username']"));
        username.sendKeys("1qaz");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1qaz");
        WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login']"));
        loginbutton.click();

        WebElement genderFemale = driver.findElement(By.cssSelector("//input[@id='female']"));
        System.out.println("genderFemale.isSelected() = " + genderFemale.isSelected());//false
        System.out.println("genderFemale.isDisplayed() = " + genderFemale.isDisplayed());//true
        System.out.println("genderFemale.isEnabled() = " + genderFemale.isEnabled());//true
        genderFemale.click();
        System.out.println("genderFemale.isSelected() = " + genderFemale.isSelected());//true

        WebElement otherRadioBtn = driver.findElement(By.cssSelector("input#other"));
        System.out.println("otherRadioBtn.isEnabled() = " + otherRadioBtn.isEnabled());
        System.out.println("otherRadioBtn.isDisabled() = " + otherRadioBtn.isDisplayed());

        WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));

    }
}