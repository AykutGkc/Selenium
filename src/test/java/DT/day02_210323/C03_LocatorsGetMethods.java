package DT.day02_210323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_LocatorsGetMethods {
    /*
  Amazon sayfasına gidin
  Search bölümünü locate edip, "Tablet" aratalım
  Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
  Sayfayı kapatın
   */

    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    Amazon sayfasına gidin
        driver.get("https://www.amazon.com/");

//        Search bölümünü locate edip, "Tablet" aratalım
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("tablet");
        aramaKutusu.submit(); //Enter'a basar

//        Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
        WebElement aramaSonucu=driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());
//        Sayfayı kapatın

        driver.close();
    }

}
