package Sel1605;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class Class4 {
    public static void main(String[] args) throws AWTException {
/*      //1
        WebDriver driver = new ChromeDriver();
        driver.get("http://danielauto.net/practice/tabls/tables.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> tr = driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("We have: "+ tr.size()+ "tr in the table");
        List<WebElement> td = driver.findElements(By.xpath("//tr[1]//td"));
        System.out.println("We have: "+ td.size()+ "tr in the table");

        //2
        List<WebElement> group = driver.findElements(By.xpath("//tr//td[2]"));
        int a=0, b=0, c=0;
        for (WebElement element : group){
            if (element.getText().equals ("A")) a++;
            else if (element.getText().equals ("B")) b++;
            else if (element.getText().equals ("C")) c++;
        }
        System.out.println("in group A we have: "+ a);
        System.out.println("in group B we have: "+ b);
        System.out.println("in group C we have: "+ c);

        //3
        List<WebElement> price = driver.findElements(By.xpath("//tr//td[3]"));
        double max = Double.parseDouble(price.get(0).getText().replace(",",""));
        for (int i = 0; i < price.size(); i++) {
            double number = Double.parseDouble(price.get(i).getText().replace(",",""));
            if (number>max){
                max=number;
            }
        }
        System.out.println("The max number is: " + max);
*/

        //מחלקת רובוט ROBOT
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.il/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("q")).sendKeys("hackeru" + Keys.ENTER);

        Robot robot = new Robot();

        //מחלקת סיקיולי SIKULI(בדיקות ויזואליות)
        







    }
}
