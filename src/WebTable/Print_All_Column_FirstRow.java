package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Column_FirstRow {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1.To Print all Column data present in first row of WebTables
		
		List<WebElement> allcolumn	= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));  //=====by using Absolute path
		
		for(WebElement data:allcolumn)
		{
		String print=data.getText();
		
		System.out.print(print + " ");
		}
}
}
