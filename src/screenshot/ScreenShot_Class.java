package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_Class {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
//		//Taking ScreenShot of Page at random name every time
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String random=RandomString.make(10);
//	
//		File destination = new File("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Screenshot\\abc"+random+".png");
//	
//		FileHandler.copy(source,destination);
		
		
		//Taking Multiple ScreenShot of Page of every time
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		for(int i=1;i<10;i++)
		{
		File destination = new File("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Screenshot\\abc"+i+".png");
	
		FileHandler.copy(source,destination);
		}

    }
}
