package practice.day01_220323;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class C06 {
    public static void main(String[] args) {

        // pencere konumunu ve pencere olcusunu yazdiriniz
        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz

       EdgeOptions ops = new EdgeOptions();
       ops.addArguments("--remote-allow-origins=*");

       WebDriver driver=new EdgeDriver(ops);


        // pencere konumunu ve pencere olcusunu yazdiriniz
        System.out.println("Pencere Konumu: "+driver.manage().window().getPosition());
        System.out.println("Pencere ölcüsü: "+driver.manage().window().getSize());

        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(900,600));

        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println("Pencere Konumu: "+driver.manage().window().getPosition());
        System.out.println("Pencere ölcüsü: "+driver.manage().window().getSize());




    }
}
