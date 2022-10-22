package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_Numeric_data_as_a_String {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Excel Data\\21-May Evening_B.xlsx");
		
		String data = WorkbookFactory.create(file).getSheet("21 - May Evening_B").getRow(6).getCell(5).getStringCellValue();
		
		System.out.println(data);
	}

}
