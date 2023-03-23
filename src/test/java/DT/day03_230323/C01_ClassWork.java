package DT.day03_230323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01_ClassWork {

    /*
   https://www.amazon.com/ sayfasına gidin.
   “city bike” araması yapın
   Arama sonuç metnini yazdırın
   Sonuç sayısını yazdırın
   Sonuc sayısını LAMBDA ile yazdırın
   Çıkan ilk sonucun resmine tıklayın.
   Sayfayı kapatın
  */
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

        //   Arama sonuç metnini yazdırın
        List<WebElement> aramaSonucu=driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.get(0).getText());

        //   Sonuç sayısını yazdırın
        String sonucSayisi=aramaSonucu.get(0).getText().split(" ")[2];

        //   Sonuc sayısını LAMBDA ile yazdırın
        Arrays.stream(aramaSonucu.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);

        //   Çıkan ilk sonucun resmine tıklayın.
        List<WebElement> urunResimleri=driver.findElements(By.className("s-image"));
        urunResimleri.get(0).click();

        //   Sayfayı kapatın
        driver.close();


    }
}
