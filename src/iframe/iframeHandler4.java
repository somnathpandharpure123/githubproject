package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandler4 {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		
		String text1 = driver.findElement(By.xpath("//h1[text()=\"This page is displayed in an iframe\"]")).getText();
		
		System.out.println(text1);
		
		driver.switchTo().parentFrame();
		
		String text2=driver.findElement(By.xpath("//p[text()=\"You can use the height and width attributes to specify the size of the iframe:\"]")).getText();
		
		System.out.println(text2);
		
}

}
