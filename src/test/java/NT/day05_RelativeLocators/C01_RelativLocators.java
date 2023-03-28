package NT.day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativLocators {
    /*
    RELATIV LOCATOR

        -Bir web sayfasinda benzer özelliklere sahip webelementlerin oldugu durumlarda kullanilabilir.
        1)above --> Belirtilen elementin üstünde olan elementi secer.
        2(below -->  Belirtilen elementin altinda olan elementi secer.
        3)to_left_of --> Belirtilen elementin solunda olan elementi secer.
        4)to_right_of --> Belirtilen elementin saginda olan elementi secer.
        5)near -->  Belirtilen elementin yaninda/yakininda olan elementi secer.
     */


    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com/");

        //city bike aratalım
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        WebElement hybridBike=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes= driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();




    }
}
