package practice.day01_220323;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.w3c.dom.ls.LSOutput;

public class C04 {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari=driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
    if (sayfaKaynakKodlari.contains("Gateway")){
        System.out.println("KAynak kodlarinda Gateway yaziyor");
    }else {
        System.out.println("Kaynak kodlarinda Gateway yazmiyor");
    }

        // sayfayi kapatiniz
        driver.close();





    }
}
