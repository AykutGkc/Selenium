package DT.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C01_Examples {
    /*
       Browser'ı açıp maximize yapın
       Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
       Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
       Amazon sayfasına geri dönün
       Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
       Sayfanın konumunu ve boyutunu yazdırın
       Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
       İstediğiniz şekilde olup olmadığını test edin
       Sayfayı kapatın
        */
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(ops);

//        Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

//        Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //istenen sayfa acilana kadar ki bekleme süresi.
                                                                            //15 saniye de yüklemez ise exception atar
                                                                            //15 sn den önce acilirsa beklmez devam eder

//        Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://www.amazon.com/");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.youtube.com/");

//        Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

//        Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualUrl=driver.getCurrentUrl(); //asil url
        String expectedUrl="https://www.amazon.com/"; //beklenen url

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url Test Passed");
        }else {
            System.out.println("Url Test Failed");
        }

//        Sayfanın konumunu ve boyutunu yazdırın
        System.out.println("Sayfa Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfa boyutu: "+driver.manage().window().getSize());

//        Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(800,600));
        
//        İstediğiniz şekilde olup olmadığını test edin

//        Sayfayı kapatın
        driver.close();





    }

}
