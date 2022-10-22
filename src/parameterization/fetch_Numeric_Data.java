package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_Numeric_Data {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Excel Data\\21-May Evening_B.xlsx");
		
		double data = WorkbookFactory.create(file).getSheet("21 - May Evening_B").getRow(3).getCell(5).getNumericCellValue();
		
		System.out.println(data);
	}

}
