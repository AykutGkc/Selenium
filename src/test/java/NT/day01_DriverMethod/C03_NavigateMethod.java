package NT.day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000); //java kodlarini bekletmek icin kullaniriz.
        //Sonra techproeducation sayfasina gidelim
        driver.navigate().to("https://www.techproeducation.com/");//get() methodu ile ayni sekilde calisir.
        Thread.sleep(3000);
        //techpro sayfa basligini konsola yazdiralim
        System.out.println("sayfa basligi: "+driver.getTitle());
        //tekrar amazon sayfasina geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
        //Amazons ayfasinin basligini yazdiralim
        System.out.println("Sayfa basligi: " +driver.getTitle());
        //tekrar techpro sayfasina geri gidelim
        driver.navigate().forward();
        //son olarak sayfayi yenileyelim ve sayfayi kapatalim.
        driver.navigate().refresh();//sayfayi yeniler
        driver.close();//sayfayi kapatir.
        //NOT:sayfalar arasi gecisler hizli olacagidan gecisler icin 3 saniye bekletelim





    }
}
