package Selenium;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NoSuchElementException {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement FirstNameInputBox = driver.findElement(By.id("first_8"));
        FirstNameInputBox.sendKeys("Baran");

        WebElement LastNameInputBox = driver.findElement(By.id("last_8"));
        LastNameInputBox.sendKeys("Gurses");
try {


    WebElement WrongLocator = driver.findElement(By.id("Wrong ID"));
}catch (org.openqa.selenium.NoSuchElementException e){
    System.out.println(e.getMessage());
}


        WebElement FirstNameLabel= driver.findElement(By.id("sublabel_8_first"));
        String FirstNameText = FirstNameLabel.getText();
        System.out.println(FirstNameText);

        WebElement SubmitButton = driver.findElement(By.id("input_2"));
        SubmitButton.click();


MyMethods.myWait(3);
        driver.quit();
    }
}
