package TestNG_Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCount_Keyword {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
		@Test
		public void KiteLoginPageTitle() {
			String title=driver.getTitle();
			System.out.println(title);
		}
		
		@Test (invocationCount=10)
		public void KiteLoginPageLogo() {
			boolean b=driver.findElement(By.xpath("//img[@alt=\"Kite\"]")).isDisplayed();
			System.out.println(b);
		}
		
		@Test 
		public void KiteLoginPageLink() {
			String text=driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).getText();
			System.out.println(text);
		}
		
		@AfterMethod
		public void BrowserClose() {
			driver.quit();
		}

}
