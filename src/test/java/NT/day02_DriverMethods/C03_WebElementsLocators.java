package NT.day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C03_WebElementsLocators {
    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com/");

        //Search box bölümünü locate ediniz.
        //Ve amazonda iphone aratiniz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //submit yapmak yerine sendKeys("iphone", Keys.ENTER) olarak kullanabiliriz.

        //WebElement  searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox.submit(); Enter yapmak icin submit kullanilabilir.
        //NOT:Bir web elementi birden fazla kullanilacaksa bir web elemente atama yapilabilir.

        //searchBox.sendKeys("iphone");//Locate ettigimzi searchbox'Sa iphone metnini gönderir






    }

}
