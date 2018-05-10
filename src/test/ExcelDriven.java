package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\ExcelData.xlsx"); 
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		
		
		
		
	}


}
