package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\Documents\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        /*
    en temel haliyle otomosyon yapmak icin classimiza gerekli olan web driver
    yerini belirtiyoruz. java kutuphanesindeki " System.setProperty" methoduyla
    driverimizin yolunu belirtiyoruz.
        */

        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.google.com/");


    }
}
