package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class find_the_LastCell_number {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\pandh\\eclipse-workspace\\Shivkumar_Batch\\Excel Data\\21-May Evening_B.xlsx");
		
		short cell = WorkbookFactory.create(file).getSheet("21 - May Evening_B").getRow(0).getLastCellNum();
		
		System.out.println(cell);
		
}

}
