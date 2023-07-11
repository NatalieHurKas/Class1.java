package Sel1605;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tigbur2906 {
    static WebDriver driver;

    @BeforeAll
    public static void before(){
        WebDriver driver = new ChromeDriver();
    }


    @AfterAll
    public static void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.supermarker.themarker.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //סעיף א'
        driver.findElement(By.id("txtSearch")).sendKeys("מחשבון");
        Thread.sleep(3000);
        List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//li@class='ui-menu-item']"));
        list.get(1).click();
        //סעיף ב'
        



    }












}
