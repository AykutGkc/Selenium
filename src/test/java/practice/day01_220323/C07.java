package practice.day01_220323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class C07 {
    public static void main(String[] args) {
        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        WebElement aramaMotoru=driver.findElement(By.id("twotabsearchtextbox"));
        aramaMotoru.sendKeys("nutella"+Keys.ENTER);


        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerListesi =driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi: " + linklerListesi.size());

        // linkleri yazdiriniz
//        int sayi=1;
//        for (WebElement webElement : linklerListesi) {
//            System.out.println(sayi+". link : "+webElement.getText());
//            sayi++;
//        }

        // pencereyi kapatiniz
        driver.close();
    }
}
