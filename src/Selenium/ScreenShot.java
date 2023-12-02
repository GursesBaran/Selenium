package Selenium;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Utilities.WebDriverHelper.driver;

public class ScreenShot {

    @Test
    public  void Test() throws IOException {

       driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.name("user7name"));
        username.sendKeys("Admin1");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginbutton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        if (errorMessage.isDisplayed()){
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;       // Took the screenshot
            File ScreenShotInTheMemory = takesScreenshot.getScreenshotAs(OutputType.FILE);  // Stores the screenshot in the temporary memory as a file

            FileUtils.copyFile(ScreenShotInTheMemory, new File("screenShots\\screenshot" + localDateTime.format(myFormat) +" .png")); // Stores the screenshot in the permanent memory as a file

        }










    }
}
