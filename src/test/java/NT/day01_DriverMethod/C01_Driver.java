package NT.day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C01_Driver {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/Drivers/msedgedriver");
        //SystemProperty java uygulamalarinda sistem özelliklerini ayarlamak icin kullanilir
        //Bu method ile classimiza webdriver'in fiziki yerini belirtiriz.
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz.

        System.out.println(System.getProperty("edgeDriver"));
        //getProperty methodu ile "key" degerini girerek "value"ya ulasilabiliriz.

       // EdgeOptions ops = new EdgeOptions();
        // ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.techproeducation.com/"); //get() methodu ile adresini belirttigimiz sayfaya gideriz

        System.out.println("Sayfa basligi: "+driver.getTitle());//icinde bulundugumuz sayfanin basligini verir.

        System.out.println("Sayfa url'i: "+driver.getCurrentUrl());//icinde bulundugumuz sayfanin url'sini verir.

       // System.out.println(driver.getPageSource()); //icinde bulundugumuz sayfanin html kaynak kodlarini verir.





        driver.close();
    }

}
