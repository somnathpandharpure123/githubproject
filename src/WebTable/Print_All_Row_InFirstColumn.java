package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Row_InFirstColumn {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1.To Print all Row data present in first Column of WebTables
		
		List<WebElement> allrow	= driver.findElements(By.xpath("//table[@id=\"customers\"]//td[1]"));  //=====by using Relative path
		
		for(WebElement data:allrow)
		{
		String print=data.getText();
		
		System.out.println(print);
		}
}
}
