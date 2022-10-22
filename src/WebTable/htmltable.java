package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		/*1.how to handle the HTML table single data
		
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr[3]//td[2]"));
		System.out.println(ele.get(0).getText());*/
		
		//OR
		
		//WebElement table = ele.get(0);
		//String text = table.getText();
		
	/*	2.how to handle the HTML table all data
		List<WebElement> ele=driver.findElements(By.xpath("(//table[@class='ws-table-all']//td)"));
		
		for(int i=0;i<ele.size();i++)
		{
		System.out.println(ele.get(i).getText());
		}*/
		
		//3.how to handle the HTML table all data in data structure i.e row wise
		
		for(int j =1;j<=6;j++)
		{
		
			List<WebElement> ele=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr["+j+"]//td"));
			
			for(int i =0;i<ele.size();i++)
			{
				System.out.print(ele.get(i).getText()+",");
			}
			System.out.println();
		}
}
}
