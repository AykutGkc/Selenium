package NT.day04._XPathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

         /*

    web sayfasına gidin. https://www.amazon.com/
    Search(ara) “city bike”
    Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

     */

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //    Search(ara) “city bike”
        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false">
        XPATH SYNTAX:
                        //tag_name[attributeName='attributeDegeri']
                        //input[@id='twotabsearchtextbox']
        */
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        //   Hybrid bikes bölümüne tiklayin ve görünür olup olmadigini,erisilebilir olup olmadigini ve secilebilir olup olmadigini konsola yazdirin
        /*
        (//*[@class='a-size-base a-color-base'])[17]--> Bu sekilde index kullanarak unique web elementi alabiliriz
        //*[text()='Hybrid Bikes'] --> xpath ile locate alirken html kodlarinda attribute name olmayan yani <tagname class=degeri>text()
        metin varsa bu sekilde locate edebiliriz
         */

        WebElement hybridBike=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));

        System.out.println(hybridBike.isDisplayed()); //WebElement görüntüleniyor mu? --> Görüntülenebiliyor true
        System.out.println(hybridBike.isEnabled());//WebElement erisilebiliyor mu?    --> Erisilebiliyor True
        System.out.println(hybridBike.isSelected());//WebElement secilebiliyor mu?    --> Secilemiyor false

        hybridBike.click();

        WebElement üstYazi=driver.findElement(By.xpath("//*[text()='Price and other details may vary based on product size and color.']"));
        System.out.println("üstYazi.isDisplayed() = " + üstYazi.isDisplayed());
        System.out.println("üstYazi.isEnabled() = " + üstYazi.isEnabled());
        System.out.println("üstYazi.isSelected() = " + üstYazi.isSelected());

        //Sadece sonuc sayisini yazdiralim
        /*
        //*[text()='15 results for']
         */

        WebElement sonucSayisi=driver.findElement(By.xpath("//*[text()='15 results for']"));
        String[] sonuc=sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);

        //    Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();


    }
}
