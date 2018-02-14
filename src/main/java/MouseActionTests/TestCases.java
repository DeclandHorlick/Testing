package MouseActionTests;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class TestCases
{
    private WebDriver webDriver;
    private static final String BASE_URL = "http://demoqa.com/droppable/";
    private static ExtentReports myReport;

    @BeforeClass // Open variables (URL) (RUNS BEFORE VERY TEST)
    public static void before()
    {
        myReport = new ExtentReports();
        String fileName = "MyTestReport" + ".html";
        String filePath = System.getProperty("user.dir") + File.separatorChar + fileName; //seperate char because to do a gap is different in diff OS
        myReport.attachReporter(new ExtentHtmlReporter(filePath));
    }

    @Before // Open variables (URL) (RUNS BEFORE VERY TEST)
    public void setUp()
    {
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
        System.out.println("Chrome Driver Created");
    }
    @Test//Whatever your test needs to do (MULTIPLE)
    public void defaultFunc()
    {
        DroppableControl dropcontrol = PageFactory.initElements(webDriver, DroppableControl.class);
        Actions mouseControl = new Actions(webDriver);

        mouseControl.clickAndHold(dropcontrol.getObjectx()).moveByOffset(100, 0).release().perform();

        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        dropcontrol.selectTask2();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest2()).moveByOffset(100, 0).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }


        dropcontrol.selectTask3();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest3()).moveByOffset(100, 0).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        mouseControl.clickAndHold(dropcontrol.getObjectForTest3()).moveByOffset(250, 0).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        dropcontrol.selectTask4();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest4a()).moveByOffset(200, 0).release().perform();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest4b()).moveByOffset(100, 0).release().perform();

        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }





        dropcontrol.selectTask5();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest5a()).moveByOffset(0, 200).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        dropcontrol.selectTab2();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest5b()).moveByOffset(0, 170).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        dropcontrol.selectTab3();
        mouseControl.clickAndHold(dropcontrol.getObjectForTest5c()).moveByOffset(0, 150).release().perform();
        try
        {
            TimeUnit.MILLISECONDS.sleep(10000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
    @After //clean up any of the connections etc (RUNS AFTER EVERY TEST)
    public void cleanUp()
    {
        webDriver.quit();
    }
    @AfterClass
    public static void flushAway() {
        myReport.flush();
    }

}
