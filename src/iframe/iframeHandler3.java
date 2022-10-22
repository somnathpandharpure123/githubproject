package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class iframeHandler3 {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		
		//if id and name is not in dom then 
		
		WebElement outerframe =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"WebTable\"]")).click();
		
}

}
