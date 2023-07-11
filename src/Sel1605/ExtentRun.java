package sel1605;

import Sel1605.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;

public class ExtentRun {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;
    static ExtentTest test2;

    static ExtentManager exm = new ExtentManager(driver);

    public static void main(String[] args) throws IOException, AWTException {
        extent = exm.GetExtent();
        test = exm.createTest("name1", "description1");
        test2 = exm.createTest("name2", "description2");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.il/");


        test.pass("my test as pass");
        test.pass("my test2 as pass");
        test.pass("my test2 as pass");
        test.info("my info");
        test.skip("skip");
        test.warning("warning");

        test2.pass("my test as pass");
        test2.pass("my test2 as pass");
        test2.pass("my test2 as pass");
        test2.fail("my test fail, look the pictures",
                MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());

        driver.quit();
        extent.flush();



    }
}
