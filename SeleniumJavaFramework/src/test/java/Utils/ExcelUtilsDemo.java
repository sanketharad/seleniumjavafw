package Utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String projectPath = System.getProperty("user.dir");
		 ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx", "sheet1");
		 excel.getRowCount();
		 excel.getCellDataString(0, 0);
		 
	}

}
