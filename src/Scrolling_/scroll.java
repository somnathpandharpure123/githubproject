package Scrolling_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Velocity\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement close=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		
		Thread.sleep(3000);
		/*1.Method
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");//Scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-300)");//Scroll up*/
		//js.executeScript("window.scrollBy(300,0)");//Scroll right
		//js.executeScript("window.scrollBy(-200,0)");//Scroll left
		
		//2.Method
		
		WebElement TopStories = driver.findElement(By.xpath("/html/body/div/div/footer/div/div[1]/div/div[1]/span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", TopStories);


}
}
