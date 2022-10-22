package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_WebDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get() used to launch the application by providing URL as a String Argument
		driver.get("https://www.facebook.com/");
	
		//Thread.sleep() method  is used for Time Delay of 3 Sec,(3000ms=3sec)-ms-millisec
		//Thread.sleep(3000);//3000ms=3sec
		
		//driver.navigate().to() method is used to launch the application & has additional feature to perform forward,backward & Refresh Functionality from the browser
		//driver.navigate().to("https://www.facebook.com/");
		
		//Thread.sleep(3000);//3000ms=3sec
		
		//driver.navigate().back();//for back operation
		
		
		//Thread.sleep(3000);//3000ms=3sec
		
		//driver.navigate().forward();//for forward operation
		
		//Thread.sleep(3000);//3000ms=3sec
		
		//driver.navigate().refresh();//for refresh the browser
		
		//Thread.sleep(3000);//3000ms=3sec
		
		//getCurrentUrl() method is used to get the URL of current page opened in the browser
		//String Url=driver.getCurrentUrl();
		/*System.out.println(Url);
		
		Thread.sleep(3000);//3000ms=3sec
		
		//getTitle() method is used to get the Title of current page opened in the browser
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(3000);//3000ms=3sec
		
		//By using below method we can maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000);//3000ms=3sec
		
		//By using below method we can minimize the browser.In 3.14 we can not minimize the window because this method not available in previous version.After this version means 4.1 in which maximize method is available.
		driver.manage().window().minimize();
		
		Thread.sleep(3000);//3000ms=3sec
		
		//setSize(Length,Height) method used for change the size of the browser.
		//It is a object of dimension class.
		Dimension d = new Dimension(400,600);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());*/
		
		//By b=By.xpath("//*[@id=\"email\"]");
		//WebElement ele=driver.findElement(b);
		//ele.sendKeys("pandharpure21@gmail.com");
		
		//Thread.sleep(3000);
		
		//By c=By.xpath("//*[@id=\"pass\"]");
		//WebElement ele1=driver.findElement(c);
		//ele1.sendKeys("8806009553");
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		//ele2.sendKeys("8806009553");
		
		Thread.sleep(3000);
		ele2.click();
		
	
		
		
		
	
		
		
	}

	

}
