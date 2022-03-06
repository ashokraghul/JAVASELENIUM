import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {
	public static void main(String[] args) throws IOException {
		
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		File file =new File ("C:\\Users\\pc\\eclipse-workspace Ashok\\Framework\\Excel1\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFRow row = sheet.getRow(4);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				XSSFCell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				  case STRING:
					String data = cell.getStringCellValue();
					System.out.println(data);
					break;
				  case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
							
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yy");
						String dateInfo = dateformat.format(date);
						System.out.println(dateInfo);
						
						
					}else {
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String s = b.toString();
					System.out.println(s);
					break;
					}
					default:
					break;
					}
				
				
			
			
			}
		}

}
}
