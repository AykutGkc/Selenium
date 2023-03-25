package selfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class C01_SafariWebDriverConnection {


        public static void main(String[] args) {

// Instantiate a SafariDriver class.
            WebDriver driver = new SafariDriver();
// Launch Website

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




// Close the Browser
           // driver.close();

        }

}
