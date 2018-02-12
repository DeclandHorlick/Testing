package testingweek;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example 
{

	private WebDriver webDriver;
	private static final String BASE_URL = "https://www.thedemosite.co.uk";
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
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
		WebElement navigate = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
		navigate.click();
		
		
		WebElement myUser = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		myUser.sendKeys("TheShafeeq");
		WebElement myPasword = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		myPasword.sendKeys("Number1");
		WebElement createUserBtn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		createUserBtn.click();
		WebElement userNdPass = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote"));
		//WebElement myUserPassword = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote > b:nth-child(3)"));
		
		System.out.println("CreateUser");
		System.out.println(userNdPass.getText());
		//System.out.println(myUserPassword.getText());
		
		
		
		//webDriver.navigate().to("http://thedemosite.co.uk/login.php");
		WebElement navigate2 = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
		navigate2.click();
		
		WebElement myUserLog = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		myUserLog.sendKeys("TheShafeeq");
		WebElement myPaswordLog = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		myPaswordLog.sendKeys("Number1");
		WebElement logOnBtn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		logOnBtn.click();
		WebElement didYouLogIn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		
		
		//assertEquals("You FAILURE","**Successful Login**",didYouLogIn.getText());
		System.out.println("UserLoggedIn");
		System.out.println(didYouLogIn.getText());
		
		
		
		
		
		
		
		
		
		
		
		//webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
				WebElement navigateNew = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
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
				System.out.println(didYouLogInNew.getText());
		
		
	}
	@Test//Whatever your test needs to do (MULTIPLE)
	public void logIn()
	{
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
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
}
