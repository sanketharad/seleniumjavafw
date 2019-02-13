package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static int getRowCount(){
		
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows: "+rowcount);
			return rowcount;
		
	}
	
	public static int getColumnCount(){
		
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("number of column: "+colCount);
		return colCount;
	
}
	
	public static String getCellDataString(int rowNum, int colNum){
		
			String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldata);
			return celldata;
		
	}
	
	public static void getCellDataNumber(int rowNum, int colNum){
			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
		
		
	}

}
