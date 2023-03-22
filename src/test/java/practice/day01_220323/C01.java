package practice.day01_220323;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
//
//        EdgeOptions ops = new EdgeOptions();
//        ops.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver=new EdgeDriver(ops);

        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);


        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");
        Thread.sleep(2000);

        // amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // n11 adresine ilerleyiniz
        driver.navigate().forward();

        // sayfayi yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");
    }
}
