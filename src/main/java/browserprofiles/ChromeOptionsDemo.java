package browserprofiles;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

    public static void main(String[] args) {
        // http://chromedriver.storage.googleapis.com/index.html
        String baseURL = "http://www.google.com";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "./browser/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Kawthar\\AppData\\Local\\Google\\Chrome\\User\\Data\\Default\\Extensions"));

        driver = new ChromeDriver(options);
        driver.get(baseURL);
    }
}