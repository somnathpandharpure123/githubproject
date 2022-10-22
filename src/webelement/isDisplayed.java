package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Velocity\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean name =driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
		if(name==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
