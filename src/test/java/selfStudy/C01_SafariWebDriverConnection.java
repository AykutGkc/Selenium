package selfStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01_SafariWebDriverConnection {


        public static void main(String[] args) {

// Instantiate a SafariDriver class.
            WebDriver driver = new SafariDriver();
// Launch Website
            driver.navigate().to("http://www.google.com/");



// Close the Browser
            driver.close();

        }

}
