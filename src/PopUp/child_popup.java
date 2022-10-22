package PopUp;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		//1. How to Handle Child Browser-when ever we click on tab open the new tab
		
		// there are two method for handle the child browser
		//1.String address=driver.getWindowHandle();------------Return type String
		//2.Set<String>address1=driver.getWindowHandles();---------------Return type Set<String>i.e.Set of String
		
		//String address=driver.getWindowHandle();         //address of main Browser
		//Set<String>address1=driver.getWindowHandles();   //address of main Browser+address of all child Browser
		
		//To switch selenium focus from one browser to other browser
		//driver.switchTo().window("address of child browser i.e.object");
		
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		WebElement conform = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		
		WebElement promot = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		
		WebElement linebreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		conform.click();
		promot.click();
		linebreak.click();
		
		String mainpage=driver.getWindowHandle();
		System.out.println(mainpage);
		
		ArrayList<String>address=new ArrayList<String>(driver.getWindowHandles());
		//String a1 = address.get(0) ;
		//System.out.println(a1);
		//or
		System.out.println(address.get(0));
		System.out.println(address.get(1));
		System.out.println(address.get(2));
		System.out.println(address.get(3));
		System.out.println(address.get(4));
		
		//switch
		//driver.switchTo().window(address.get(0));
		// URL
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//OR
		driver.switchTo().window(address.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(3));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(4));
		System.out.println(driver.getCurrentUrl());
		
		

}

}
