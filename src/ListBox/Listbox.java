package ListBox;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		
//		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
//		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
//		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
//		Select s1 = new Select(day);
//		//s1.selectByValue("10");            
//		s1.selectByIndex(9);
//		Select s2 = new Select(month);
//		//s2.selectByValue("4");
//		s2.selectByVisibleText("Apr");
//		Select s3 = new Select(year);
//		s3.selectByValue("1997");
//		
		//to get all Option present in dropdown
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s1 = new Select(day);
		List<WebElement>AllOptions = s1.getOptions();
		int size = AllOptions.size();
		System.out.println(size);
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s2 = new Select(month);
		List<WebElement>AllOptions1 = s2.getOptions();
		int size1 = AllOptions1.size();
		System.out.println(size1);
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s3 = new Select(year);
		List<WebElement>AllOptions2 = s3.getOptions();
		int size2 = AllOptions2.size();
		System.out.println(size2);
		
		//for getting all list present in listbox
		
		for(WebElement str: AllOptions1)
		{
			String text = str.getText();
			System.out.print(text+",");
		}
		
		//for getting all list in alphabetical order
		
		TreeSet tr = new TreeSet();
		
		for(WebElement str: AllOptions1)
		{
			String Text = str.getText();
			tr.add(Text);
		}
		for(Object x:tr)
		{
			System.out.println(x);
		}
	}

}
