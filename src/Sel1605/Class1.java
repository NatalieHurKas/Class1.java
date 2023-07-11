package Sel1605;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
    public static void main(String[] args) {
//        //כל פעם שנרצה לגשת לדפדפן-נרשום driver
//        WebDriver driver = new ChromeDriver(); //פתיחת הדפדפן
//        // driver.manage().window().maximize(); //הגדלה למסך מלא
//        driver.get("https://www.youtube.com/watch?v=Bzzp5Cay7DI"); //פתיחת האתר
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Lofi");

        WebDriver driver = new ChromeDriver();
        driver.get("http://danielauto.net/practice/newLocator/locator.html");
        driver.findElement(By.id("my text")).sendKeys("Natalie");
        driver.findElement(By.id("btn")).click();
        String txt = "Natalie";









    }
}
