package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Parameters("BrowserName")
	@Test
	public void Setup(String BrowserName) {
		
		//Condition for Open chrome Browser
		if(BrowserName.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		//Condition for Open Firefox Browser
		else if(BrowserName.equals("Firefox")) 
		{
		System.setProperty("webdriver.gecko.driver", "F:\\Velocity\\software\\chromedriver_win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	
		driver.findElement (By.xpath("//input[@name='email']")).sendKeys("pandharpure21@gmail.com") ;
		driver.findElement (By.xpath("//input[@type='password']")).sendKeys("Somnath@123");
		driver.findElement (By.xpath("//button[@value='1']")).click();
	
		driver.quit();
	}
	


}
