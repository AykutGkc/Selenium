package DT.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_NavigateMethof {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops);

        //Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com/");
        //driver.get("https://www.amazon.com/");

        //techproeducation sayfasina gidelim
        Thread.sleep(3000); // 3000 ms beker ==>Java methodu
        driver.navigate().to("https://www.techproeducation.com/");
        //driver.get("https://www.techproeducation.com/");

        //Amazon sayfasina geri dönelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Techproeducation sayfasina tekrear gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //sayfayi yenileyiniz(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayi kapat
        driver.close();





    }
}
