package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriverHelper {
    public static WebDriver driver;
    public static WebDriver driver1;

    static {

        Logger logger = Logger.getLogger(""); //shows only severe problems on console
        logger.setLevel(Level.SEVERE);

        //driver1 = new EdgeDriver();
        //driver1.manage().window().maximize();
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        //Waits 15 seconds for the page to be loaded. If it takes more than 15 secs for a page to load it will throw an exception
        //PageLoad =Waits all html files are downloaded to our computer but they are not visible in the browser yet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Waits until all elements on a webpage are visible. If it is not done loading in 15 secs it will throw an exception


    }

    public static void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
