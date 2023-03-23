package NT.day03_Locators_230323;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class C02_getTagNameGetAttribute {
    /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */
    public static void main(String[] args) {
        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));

        //        2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttirute=aramaKutusu.getAttribute("name");
        String expectedAttibute="field-keywords";
        if (actualAttirute.equals(expectedAttibute)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Fail");
        }


        driver.close();


    }
}
