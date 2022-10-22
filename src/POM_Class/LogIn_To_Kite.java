package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_To_Kite {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@id=\"userid\"]")
	private WebElement User_ID;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement Passward;
	
	@FindBy(xpath="//button[text()='Login ']")
	private WebElement LogIn;

	//Variable Initialization
	
	public LogIn_To_Kite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use
	
	public void sendUser_ID(String USERID) 
	{
	User_ID.sendKeys(USERID);
	}
	
	public void sendPassward(String PASS) 
	{
	Passward.sendKeys(PASS);
	}
	
	public void ClickonLogIn() 
	{
	LogIn.click();
	}
}
