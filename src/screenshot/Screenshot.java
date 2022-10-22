package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To handle the Screenshot
		
		File Source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("G:\\SC\\img.jpg");
		FileHandler.copy(Source, Dest);
		
		WebElement s = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File a =((TakesScreenshot) s).getScreenshotAs(OutputType.FILE);
		File b = new File("G:\\SC\\photo.jpg");
		FileHandler.copy(a,b);
}
}