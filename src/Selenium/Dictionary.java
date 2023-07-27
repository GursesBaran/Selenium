package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.WebDriverHelper.driver;

public class Dictionary {

    @Test

    public void Test1(){

        driver.get("https://www.dictionary.com/");
        WebElement soundicon = driver.findElement(By.xpath("//img[@class='WsWzH39ZmHVFF4Iu_yJg BUPCpkIZU8Q3Qse3OLFT']"));
        soundicon.click();
    }
}
