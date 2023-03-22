package practice.day01_220323;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitle=driver.getTitle();
        System.out.println("teknosaTitle: " +teknosaTitle);

        String teknosaUrl=driver.getCurrentUrl();
        System.out.println("teknosaUrl = " + teknosaUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Title teknoloji iceriyor.");
        }else {
            System.out.println("Title teknoloji icermiyor");
        }
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaUrl.contains("teknosa")){
            System.out.println("URL teknosa kelimesi icerir");
        }else {
            System.out.println("URL teknosa kelimesi icermiyor");
        }
        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle=driver.getTitle();
        System.out.println("Medunna Title: "+medunnaTitle);
        String medunnaUrl=driver.getCurrentUrl();
        System.out.println("medunnaUrl = " + medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA iceriyor");
        }else {
            System.out.println("Title MEDUNNA icermiyor");
        }
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("URL medunna iceriyor");
        }else {
            System.out.println("URL medunna icermiyor");
        }
        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

    }
}
