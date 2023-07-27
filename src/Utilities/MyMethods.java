package Utilities;
import java.io.IOException;



public class MyMethods extends WebDriverHelper {
    public static void myWait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void WaitAndQuit(int second) {
        MyMethods.myWait(second * 1000);
        driver.quit();
    }
}


