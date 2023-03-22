package DT.day02_210323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02_webElementsAndLocators {

    /*
  Amazon sayfasına gidin
  Search kutusunu locate edin
  Search kutusunda iphone aratın
  Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
  Sayfayı kapatınız
  */
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    Amazon sayfasına gidin
        driver.get("https://www.amazon.com/");

//    Search kutusunu locate edin
       WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

//    Search kutusunda iphone aratın
        aramaKutusu.sendKeys("iphone"+ Keys.ENTER);

        /*
        Bir web elementini locate etmek istersek önce sayfayi acip element üzerine incele(inspectt) secenegine tikliyoaruz.
        Karsimiza cikan html kodlarindan essiz olani locator olarak seciyoruz.
        Genellikle "id" attibute'ü essiz olarak kullanilir.
        driver.findElement(By.id("idDegeri"));
          */
//    Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın

        List<WebElement> inputList=driver.findElements(By.tagName("input"));
        System.out.println("Input tag sayisi: "+inputList.size());

        List<WebElement> aTagList=driver.findElements(By.tagName("a"));
        System.out.println( "Link Sayisi:  "+aTagList.size());
//    Sayfayı kapatınız
    driver.close();

    }
}
