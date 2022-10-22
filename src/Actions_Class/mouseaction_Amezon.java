package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction_Amezon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	//1.BY USING METHOD CHAINING
	
	WebElement Accountlist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	WebElement Yourorders=driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[7]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(Accountlist).moveToElement(Yourorders).click().build().perform();
	
	
	System.out.println("Run Successfully");
	
}
}
