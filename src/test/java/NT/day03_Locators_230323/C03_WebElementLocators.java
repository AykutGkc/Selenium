package NT.day03_Locators_230323;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.overlay.model.LineStyle;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebElementLocators {
    /*

    web sayfasına gidin. https://www.amazon.com/
    Search(ara) “city bike”
    Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

     */
    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucYazisi=driver.findElements(By.className("sg-col-inner"));
        System.out.println("Sonuc Yazisi: "+sonucYazisi.get(0).getText());

        //sadece sonuc sayisini yazdiralim
        String sonucSayisi=sonucYazisi.get(0).getText().split(" ")[2];
        System.out.println("Sonuc sayisi: "+sonucSayisi);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> sonuclar=driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
        sonuclar.get(0).click();

        //driver.close();

    }
}
