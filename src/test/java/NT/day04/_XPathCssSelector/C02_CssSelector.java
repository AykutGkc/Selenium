package NT.day04._XPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_CssSelector {

    //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //Add Element butonuna basin
    //Delete butonu’nun gorunur oldugunu test edin
    //Delete tusuna basin
    //“Add/Remove Elements” yazisinin gorunur oldugunu test edin

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(3000);

        //Delete butonu’nun gorunur oldugunu test edin
        System.out.println(driver.findElement(By.cssSelector("button[class='added-manually']")).isDisplayed());

        //Delete tusuna basin
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[class='added-manually']")).click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.cssSelector("h3"));
        //Eger xpath ile almak istersek //h3
        System.out.println("addRemoveElement görünür mü= " + addRemoveElement.isDisplayed());


        driver.close();

        /*
        xPath ile cssSelector arasinda ki farklar:
            -Xpath metin ile calisabilir cssSelector ile calismaz
            -Xpath daha fazla kombinasyona sahiptir ve index'e göre arama yapabilir.
            CssSelector index'e göre arama yapamaz ancak daha hizli calisir.
         */

    }
}
