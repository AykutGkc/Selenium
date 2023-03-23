package DT.day03_230323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

        //   “city bike” araması yapın
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //under 200 olani tiklayiniz
        WebElement we1=driver.findElement(By.xpath("//span[.='Under $200']")); //attibute ismi yoksa .(nokta) konur
        we1.click();
        driver.close();



    }
}
