package testingweek;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;

public class JunitExample 
{
	@BeforeClass//Important for message statement
	public static void init()
	{
		System.out.println("Before Class");
	}
	
	@Before // Open variables (URL) (RUNS BEFORE VERY TEST)
	public void setUp()
	{
		System.out.println("Before Test");
	}
	
	@Test//Whatever your test needs to do (MULTIPLE)
	public void prinTest()
	{
		System.out.println("Test");
	}
	@After //clean up any of the connections etc (RUNS AFTER EVERY TEST)
	public void cleanUp()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public static void tearDown()
	{
		System.out.println("After Class");
		
	}
}
