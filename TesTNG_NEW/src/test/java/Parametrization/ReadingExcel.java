package Parametrization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		
		
		File f = new File("D:\\Selenium\\Java-2019\\FileWritingFromSelenium\\myExcel.xlsx");  //get the fiell locaton
		FileInputStream fi = new FileInputStream(f);  //input class for read
		
		Workbook workbook = WorkbookFactory.create(fi);  //reading
		Sheet sheet0 = workbook.getSheetAt(0);
		for( Row row:sheet0) {
			           for(Cell cell:row) {
			        	   
			        	   switch(cell.getCellType()) {
			        	   case Cell.CELL_TYPE_STRING:
			        		   System.out.print(cell.getStringCellValue()+"\t");
			        		   break;
			        	   case Cell.CELL_TYPE_NUMERIC:
			        		   System.out.print(cell.getNumericCellValue()+"\t");
			        		   break;
			        	   case Cell.CELL_TYPE_BLANK:
			        		   System.out.print("blank cell"+"\t");
			        		   break;
			        	   }
			           }
			           System.out.println();
		}
		
		/*Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);
		
		System.out.println(cellA);*/
		fi.close();

	}

}
