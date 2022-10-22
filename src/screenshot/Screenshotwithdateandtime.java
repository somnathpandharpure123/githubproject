package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshotwithdateandtime {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Velocity\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Calendar cal= Calendar.getInstance();
		Date time=cal.getTime();
		
		System.out.println(time);
		
		String timeStamp=time.toString().replace(":"," ").replaceFirst("IST","");
		
		System.out.println(timeStamp);
		for(int i=1;i<=5;i++)
		{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\pandh\\OneDrive\\Desktop\\Screenshot\\Flipkart"+i+timeStamp+".jpg");
		
		FileHandler.copy(src, dest);
		}

	}

}
