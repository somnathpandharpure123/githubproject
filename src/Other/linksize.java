package Other;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksize {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> alllist	=driver.findElements(By.xpath("//a"));
	
		int size =	alllist.size();
	
		System.out.println("Total No of Links on Facebook Page =" + size);
	
		//to print all link present on webpage
		
		for(WebElement link:alllist)
		{
		String text	= link.getText();
		
		System.out.println(text);
		}
	}

}
