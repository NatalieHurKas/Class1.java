package Sel1605;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class2 {
    public static void main(String[] args) {
        // תרגיל כיתה
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://simania.co.il/");
//        driver.findElement(By.id("query")).sendKeys("אין ילדים רעים" + Keys.ENTER);
//
//        // שליפת שם מחברת
//        try{
//            String name = driver.findElement(By.tagName("h3")).getText();
//            System.out.println(driver.findElement(name));
//        }catch (Exception e){3
//
//            System.out.println("שליפת שם המחבר/ת נכשלה");
//        }

        WebDriver driver = new ChromeDriver();
        driver.get("https://simania.co.il/");

//        WebElement element = driver.findElement(By.tagName("a"));
//        element.click(); //== driver.findElement(By.tagName("a)).click();
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("number of links:" + links.size());



        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            driver.navigate().back();
            links = driver.findElements(By.tagName("a"));
        }

















    }
}
