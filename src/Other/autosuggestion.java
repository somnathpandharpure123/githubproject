package Other;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Redmi Mobile");
			
			List<WebElement> option	= driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]"));
			
			System.out.println(option.size());
			
			for(WebElement alloption:option)
			{
			String text = alloption.getText();
				System.out.println(text);
			}
			
	}
			

}
