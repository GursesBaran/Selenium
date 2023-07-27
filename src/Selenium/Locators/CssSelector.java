package Selenium.Locators;

import Utilities.MyMethods;
import Utilities.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends WebDriverHelper {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement SearchInput = driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Please enter your Message']"));

        MyMethods.myWait(3);
        SearchInput.sendKeys("Baran");

        WebElement sendMessageButton = driver.findElement(By.cssSelector("[class='btn btn-primary'][type='button'][onclick='showInput();']"));
        sendMessageButton.click();

        WebElement MessageDisplay = driver.findElement(By.cssSelector("span[id='display']"));
        String displayedText = MessageDisplay.getText();

        if (displayedText.equals("Baran")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

MyMethods.WaitAndQuit(2);
    }
}
