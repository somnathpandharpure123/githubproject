package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	
	//variable Declaration
	
	@FindBy(xpath="//span[text()='GP8097']")
	private WebElement UserCode;
	
	//Variable Initialization
	
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use
	
	public void SeeUserCode(String USERCODE)
	{
		String ExpectedCode=USERCODE;
		String Code =UserCode.getText();
		System.out.println(Code);
		if(Code.equals(ExpectedCode))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}


}
