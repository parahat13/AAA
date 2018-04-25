package ExcelData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExcelTest {
	
	
	public static void main(String[] args) throws IOException {

		ExcelUtilClass.openExcelFile("C:\\Users\\Home\\eclipse-workspace\\AAA\\dataFiles\\ExcelData.xlsx", "data");
		System.out.println("To get  data from excel");
		
		List<String> data = new ArrayList<String>();

		for (int i = 0; i <4; i++) {
			data.add(ExcelUtilClass.getCellData(0, i));
			System.out.print(data.get(i)+"\t");
		}

	}

}
