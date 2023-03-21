package NT.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Sayfadaki her bir web element icin max 20 sn bekler.

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        String actualTitle=driver.getTitle(); //gercek baslik
        String expectedTitle="youtube"; //beklenen baslik
        if(expectedTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed: "+ actualTitle);
        }
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+actualUrl);
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().forward();
        //Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2=driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle2.contains(istenenKelime)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Fail. Gercek baslik: "+ actualTitle2);
        }
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl=driver.getCurrentUrl();
        String istenenUrl="https://www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Fail. Gercek URL: "+gercekUrl);
        }
        //Sayfayi kapatin
       driver.close();

    }
}
