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
import org.testng.asserts.SoftAssert;

public class SoftAssert_Problem {
	SoftAssert softassert;
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
	softassert = new SoftAssert();
	
	WebElement username=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement Passward=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("pandharpure21@gmail.com");
	
	softassert.assertTrue(Passward.isDisplayed());
	Passward.sendKeys("Somnath@123");
	
	softassert.assertTrue(Login.isDisplayed());
	Login.click();
	
	softassert.assertAll();
		
	}
	
	@Test
	public void Username1()
	{
		softassert = new SoftAssert();
	WebElement username1=driver.findElement(By.xpath("//input[@id=\"email\"]"));//wrong xpath
	WebElement Passward1=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	WebElement Login1=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	softassert.assertTrue(username1.isDisplayed());
	username1.sendKeys("pandharpure21@gmail.com");
	
	softassert.assertTrue(Passward1.isDisplayed());
	Passward1.sendKeys("Somnath@123");
	
	softassert.assertTrue(Login1.isDisplayed());
	Login1.click();
		System.out.println("hello");
		softassert.assertAll();

	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.close();
	}
	
	
	
	
	

}
