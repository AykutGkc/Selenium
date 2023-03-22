package practice.day01_220323;

import org.apache.hc.core5.http.nio.entity.DiscardingEntityConsumer;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class C05 {
    public static void main(String[] args) {
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz

        EdgeOptions ops = new EdgeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver=new EdgeDriver(ops);
        driver.manage().window().maximize();

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        Point windowPosition=driver.manage().window().getPosition();
        Dimension windowSize=driver.manage().window().getSize();
        System.out.println("Maximize windowPosition = " + windowPosition);
        System.out.println("Maximize windowSize = " + windowSize);

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        Point fullscreenWindowPosition=driver.manage().window().getPosition();
        Dimension fullscreenWindowSize=driver.manage().window().getSize();
        System.out.println("fullscreenWindowPosition = " + fullscreenWindowPosition);
        System.out.println("fullscreenWindowSize = " + fullscreenWindowSize);

        // sayfayi kapatiniz
        driver.close();

    }
}
