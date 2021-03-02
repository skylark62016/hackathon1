package requirement2;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
	    static String data[]=new String[11];
	    
		public static void readFromExcel() {
			
			File file=new File(".\\src/test/resources\\samplehomeloanemi.xlsx");
			XSSFWorkbook myExcelBook = null;
			try {
				myExcelBook = new XSSFWorkbook(new FileInputStream(file));
			} catch (IOException e) {
				System.out.println("File not found!");
			} 
			XSSFSheet myExcelSheet = myExcelBook.getSheet("Data");
			XSSFRow row = myExcelSheet.getRow(1);
			for(int i=0;i!=6;i++) {
				
				data[i]=String.valueOf(row.getCell(i).getNumericCellValue());
			}

			data[6]=row.getCell(6).getStringCellValue().trim();
			
			for(int i=7;i<11;i++) {
				
				data[i]=String.valueOf(row.getCell(i).getNumericCellValue());
			}
		}

}
