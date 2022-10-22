package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Pin {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@label=\"PIN\"]")
	private WebElement Pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement Continue;
	
	//Variable Initialization
	
	public LogIn_Pin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use 
	
	public void sendPin(String PIN)
	{
		Pin.sendKeys(PIN);
	}
	
	public void ClickonContinue()
	{
		Continue.click();
	}

}
