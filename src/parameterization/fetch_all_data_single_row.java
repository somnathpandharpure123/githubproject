package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_all_data_single_row {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Excel Data\\21-May Evening_B.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("21 - May Evening_B");
		
		short cellsize= sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<=cellsize-1;i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value+" ");
		}
		
}

}
