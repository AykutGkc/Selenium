package NT.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C01_ManageMethods{
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("chromeDriver","src/resources/Drivers/chromedriver");
//        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);

        System.out.println("Sayfa konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutllari: "+driver.manage().window().getSize());
        driver.manage().window().maximize();//açılan browser'i maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutllari: "+driver.manage().window().getSize());
        driver.manage().window().minimize();//sayfayi asagiya indirir.
        Thread.sleep(3000);
       driver.manage().window().fullscreen();
        System.out.println("Sayfa konumu: "+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutllari: "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50)); //istedigimz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600)); //istedigimiz size'a getirir



       // driver.close();


    }
}
