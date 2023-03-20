package day01_DT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04_ManageMethod {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);

        //techproeducation sayfasina gidelim
        driver.get("https://www.techproeducation.com/");

        //sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: "+driver.manage().window().getSize());

        //Sayfayi minimize (simge durunu) yapalim.
        Thread.sleep(2000);
        driver.manage().window().minimize();

        //Sayfayi maximize(büyütelim) yapalim
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: "+driver.manage().window().getSize());

        //sayfayi full screen yapalim
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        //sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: "+driver.manage().window().getSize());

        driver.close();
    }
}
