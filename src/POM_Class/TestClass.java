package POM_Class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\pandh\\OneDrive\\Desktop\\Shivkumar Batch\\Kite Apllication.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		LogIn_To_Kite S1 = new LogIn_To_Kite(driver);
		String USERID= sh.getRow(1).getCell(0).getStringCellValue();
		S1.sendUser_ID(USERID);
		String PASS= sh.getRow(1).getCell(1).getStringCellValue();
		S1.sendPassward(PASS);
		S1.ClickonLogIn();
		
		LogIn_Pin S2 = new LogIn_Pin(driver);
		String PIN= sh.getRow(1).getCell(2).getStringCellValue();
		S2.sendPin(PIN);
		S2.ClickonContinue();
		
		Kite_HomePage S3 = new Kite_HomePage(driver);
		String USERCODE=sh.getRow(1).getCell(0).getStringCellValue();
		S3.SeeUserCode(USERCODE);
		
		
	}

}
