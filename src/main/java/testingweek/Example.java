package testingweek;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;






public class Example 
{
	
	private WebDriver webDriver;
	private static final String BASE_URL = "https://www.thedemosite.co.uk";
	
	
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
	
	//@Test//Whatever your test needs to do (MULTIPLE)
	/*public void printTest()
	{
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		WebElement myElement = webDriver.findElement(By.cssSelector("#select2-chosen-2"));
		myElement.sendKeys("The Shafeeq");
		System.out.println("Test");
	}*/
	
	
	@Test//Whatever your test needs to do (MULTIPLE)
	public void createUser()
	{
		UserPageControl createUserPage = PageFactory.initElements(webDriver, UserPageControl.class);
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
		
		
		ExtentTest test = myReport.createTest("MyFirstTest");
        test.log(Status.INFO, "My First Test is Starting ");
        
       
        
		
		
		
		//The proper way to do it 
		//****************************
		
		//LogInPageControl logInPage = PageFactory.initElements(webDriver,LogInPageControl.class);
		
		createUserPage.selectUserPage();
		test.log(Status.DEBUG,  "Select user page");
		createUserPage.enterUser();
		test.log(Status.DEBUG,  "enter username");
		createUserPage.enterPassWord();
		test.log(Status.DEBUG,  "enter password");
		createUserPage.clickCreateUserButton();
		try
		{
			TimeUnit.MILLISECONDS.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		test.log(Status.DEBUG,  "create the user");
		createUserPage.showUserNamePass();
		test.log(Status.DEBUG,  "user name is shown test passed");
		test.pass("Awesome");


		//The Poor way to do it 
		//*****************************
		//webDriver.navigate().to("http://thedemosite.co.uk/login.php");
		WebElement navigate2 = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
		navigate2.click();
		
		WebElement myUserLog = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		myUserLog.sendKeys("username");
		WebElement myPaswordLog = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		myPaswordLog.sendKeys("password");
		WebElement logOnBtn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		logOnBtn.click();
		WebElement didYouLogIn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		//try
		//{
		//	MyCamera.take(webDriver, "TestPassed");
		//}
		//catch(IOException e)
		//{
		//	e.printStackTrace();
		//}
		
		//assertEquals("You FAILURE","**Successful Login**",didYouLogIn.getText());
		System.out.println("UserLoggedIn");
		System.out.println(didYouLogIn.getText());
		
		
		
		
		
		
		
		//Attempt at writing a failing clause
		//**********************************
		
		
		
		//webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
		/*		WebElement navigateNew = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
				navigateNew.click();
				
				
				WebElement myUserNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
				myUserNew.sendKeys("111");
				WebElement myPaswordNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
				myPaswordNew.sendKeys("111");
				WebElement createUserBtnNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
				createUserBtnNew.click();
				WebElement userNdPassNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote"));
				//WebElement myUserPassword = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote > b:nth-child(3)"));
				assertEquals("You FAILURE","111",myUserNew.getText());
				System.out.println("CreateUser");
				System.out.println(userNdPassNew.getText());
				//System.out.println(myUserPassword.getText());
				
				
				
				//webDriver.navigate().to("http://thedemosite.co.uk/login.php");
				WebElement navigate2New = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
				navigate2New.click();
				
				WebElement myUserLogNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
				myUserLogNew.sendKeys("TheShafeeq");
				WebElement myPaswordLogNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
				myPaswordLogNew.sendKeys("Number1");
				WebElement logOnBtnNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
				logOnBtnNew.click();
				WebElement didYouLogInNew = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
				
				
				assertEquals("You FAILURE","**Successful Login**",didYouLogInNew.getText());
				System.out.println("UserLoggedIn");
				System.out.println(didYouLogInNew.getText());*/
		
		
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
