package techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class firstSeleniumClass {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\Documents\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.hepsiburada.com/");

    }
}