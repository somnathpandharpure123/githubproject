package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Data_FromWebTable {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1.To Print all data present of WebTables
		
		for(int i=2;i<=7;i++)
		{
			for(int j=1;j<=3;j++)
			{
			WebElement data = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]"));
			
			String text	= data.getText();
			
			System.out.print(text + " ");
			}
			
			System.out.println();
		}
		
}

}
