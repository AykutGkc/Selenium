package DT.day01_203023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_DriverMethod {
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.google.com/"); //Gitmek istedigimiz sayfaya gider

        System.out.println("Sayfanin basligini getirir: "+driver.getTitle()); //Sayfa basligini getiirir
        System.out.println("Sayfanin adresi(URL)"+ driver.getCurrentUrl()); //Sayfa adresini getirir.
        //System.out.println(driver.getPageSource()); // Sayfanin kaynak kodlarini getirir
        System.out.println(driver.getWindowHandle()); //Sayfanin hash degerini getirir.
                                                        // Bu hash degerleri ile baska sayfadan bu sayfaya direkt dönebilnmeyi saglar.
                                                        //(Sayfalar arasi gecis)

    }
}
