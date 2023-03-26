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

    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        //Delete butonu’nun gorunur oldugunu test edin
        System.out.println(driver.findElement(By.cssSelector("button[class='added-manually']")).isDisplayed());
        //Delete tusuna basin
        driver.findElement(By.cssSelector("button[class='added-manually']")).click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println(driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("div[id='content']")).isDisplayed());

    }
}
