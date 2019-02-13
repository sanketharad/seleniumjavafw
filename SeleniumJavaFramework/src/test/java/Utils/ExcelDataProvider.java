package Utils;

public class ExcelDataProvider {

	public void testData(String excelPath, String sheetName){
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowcount = excel.getRowCount();
		int colCount = excel.getColumnCount();
	}
}
