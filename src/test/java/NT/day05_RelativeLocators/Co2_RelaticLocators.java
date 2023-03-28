package NT.day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Co2_RelaticLocators {
    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html    adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //Berlin’i 3 farkli relative locator ile locate edin
        WebElement NYCWebElement=driver.findElement(By.id("pid3_thumb"));
        WebElement bayAreaWebElement=driver.findElement(By.id("pid8_thumb"));
        WebElement berlinWebElement=driver.findElement(with(By.tagName("img")).below(NYCWebElement).toLeftOf(bayAreaWebElement));

        berlinWebElement.click();

        //Relative locator’larin dogru calistigini test edin

        String actualIdDegeri= berlinWebElement.getAttribute("id");
        String expectedIdDegeri="pid7_thumb";

        if (expectedIdDegeri.equals(actualIdDegeri)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Fail");
        }

        driver.close();
    }
}
