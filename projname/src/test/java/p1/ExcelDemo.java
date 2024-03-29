package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {

	public static void main(String[] args) throws RuntimeException, IOException, Exception {
		
		String path = "./data/book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		 String v = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		 
		System.out.println(v);
		
		wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("bhanu");
		wb.write(new FileOutputStream(path));
		wb.close();
		

	}

}
