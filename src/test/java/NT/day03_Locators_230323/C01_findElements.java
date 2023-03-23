package NT.day03_Locators_230323;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

public class C01_findElements {

    public static void main(String[] args) {


    EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

    WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();

    //Amazon sayfasinda kac tane link oldugunu konsola yazdirin

        driver.get("https://www.amazon.com/");
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));

        //Linkleri yazdiralim
        System.out.println("linklerListesi = " + linklerListesi.size());

        for (WebElement w : linklerListesi) {
            System.out.println(w.getText());
        }




        //Driveri kapat
        driver.close();
    }
}