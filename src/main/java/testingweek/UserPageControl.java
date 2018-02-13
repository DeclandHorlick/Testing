package testingweek;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserPageControl 
{
	ReadMySpreadSheet mySheet = new ReadMySpreadSheet(System.getProperty("user.dir") + "/src/main/resources/Example_Spreadsheet.xlsx");
	List<String> row = mySheet.readRow(1, "Input Data");
	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")
	private WebElement addUserPage;
	
	@FindBy(css ="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement enterUserName;
	
	@FindBy(css ="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	private WebElement enterUserPassWord;
	
	@FindBy(css ="body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	private WebElement createUserButton;
	
	@FindBy(css ="body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote")
	private WebElement userNamePassOutput;
	
	public void selectUserPage()
	{

		addUserPage.click();
	}
	public void enterUser()
	{

		enterUserName.sendKeys(row.get(2));
	}
	public void enterPassWord()
	{
		//enterUserPassWord.sendKeys("Number1");

		enterUserPassWord.sendKeys(row.get(3));
	}
	public void clickCreateUserButton()
	{
		createUserButton.click();
	}
	public void showUserNamePass()
	{
		//System.out.println(userNamePassOutput.getText());
	}
	
	
}
