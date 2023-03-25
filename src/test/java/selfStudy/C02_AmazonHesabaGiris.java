package selfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C02_AmazonHesabaGiris {

    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.navigate().to("https://www.amazon.de");
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click();
        WebElement emailKutusu=driver.findElement(By.id("ap_email"));
        emailKutusu.sendKeys("aykutgokce2016@gmail.com");
        driver.findElement(By.id("continue")).click();
        WebElement passwordKutusu=driver.findElement(By.id("ap_password"));
        passwordKutusu.sendKeys(""+ Keys.ENTER);



    }
}
