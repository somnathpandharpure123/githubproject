package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column_in_WebTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1.To Identify the Column present in WebTables
		
		List<WebElement> allcolumn	= driver.findElements(By.xpath("//table[@id=\"customers\"]//th"));  //=====by using Relative path
		
		//List<WebElement> allcolumn = driver.findElements(By.xpath("//table[@id=\"customers\"]/tr[1]/th"));  //=====by using Absolute path
		
		int size = allcolumn.size();
		
		System.out.println(size);
	}

}
