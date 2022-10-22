package parallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	@SuppressWarnings("deprecation")
	@Test
	public void Setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(3000);
	driver.quit();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void Setup1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(3000);
	driver.quit();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void Setup2() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(3000);
	driver.quit();
	}
	

}
