package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = driver.findElement(By.xpath("//div[@id=\"box2\"]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id=\"box106\"]"));

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//act.dragAndDrop(src, dest).build().perform();//dragandDrop Operation
		act.clickAndHold(src).moveToElement(dest).release().build().perform();//ClickandHold Operation

}
}
