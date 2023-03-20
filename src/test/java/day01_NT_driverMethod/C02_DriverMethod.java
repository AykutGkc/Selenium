package day01_NT_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C02_DriverMethod {
    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.get("https://www.amazon.com/");

        //Sayfa basligini konsola yazdiriniz
        System.out.println("sayfa basligi: "+driver.getTitle());

        //sayfanin url'sini yazdirin
        System.out.println("Sayfa url'si: "+driver.getCurrentUrl());

        //tecproeducation sayfasina gidiniz.
        driver.get("https://www.techproeducation.com/");

        //tecproeducation sayfa basligi ve urlsini yazdirin
        System.out.println("sayfa basligi: "+driver.getTitle());
        System.out.println("Sayfa url'si: "+driver.getCurrentUrl());

        //sayfanin window handle degerini yazriniz
        System.out.println("Sayfanin Handle degeri: "+driver.getWindowHandle());

        driver.close();


    }
}
