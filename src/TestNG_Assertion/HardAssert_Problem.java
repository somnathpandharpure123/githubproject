package TestNG_Assertion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert_Problem {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void Username()
	{
	WebElement username=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement Passward=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("pandharpure21@gmail.com");
	
	Assert.assertTrue(Passward.isDisplayed());
	Passward.sendKeys("Somnath@123");
	
	Assert.assertTrue(Login.isDisplayed());
	Login.click();
		
	}
	
	@Test
	public void Username1()
	{
	WebElement username=driver.findElement(By.xpath("//input[@id=\"emai\"]"));//wrong xpath
	WebElement Passward=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("pandharpure21@gmail.com");
	
	Assert.assertTrue(Passward.isDisplayed());
	Passward.sendKeys("Somnath@123");
	
	Assert.assertTrue(Login.isDisplayed());
	Login.click();
		
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.close();
	}
	
	
	
	
	

}
