package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({"URL"})
	public void Setup(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@Test
	@Parameters({"USER","PASSWARD"})
	public void LoginTest(String USER,String PASSWARD) {
		WebElement user = driver.findElement (By.xpath("//input[@name='email']")) ;
		 user.sendKeys(USER);
		 
		 WebElement pass = driver.findElement (By.xpath("//input[@type='password']")) ;
		 pass.sendKeys(PASSWARD);
		 
		 WebElement login = driver.findElement (By.xpath("//button[@value='1']")) ;
		 login.click();
		 
		 
	}
	@AfterMethod
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
