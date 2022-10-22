package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Velocity\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createaccount=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		createaccount.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]")).click();
		
		//is female text is selected or not
		boolean result =driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]")).isSelected();
		if(result==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}



