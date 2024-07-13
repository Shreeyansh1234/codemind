package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility {
	public static String readProperty(String key) throws IOException {
		File file=new File("src/test/resources/masterData.properties");
		FileInputStream fileipstream=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fileipstream);
		return properties.getProperty(key);
		
	}
	
	public static void selectValueFromDropdown(WebElement dropdown, String option) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(option);
	}

	public static ArrayList<String> readExcelFile(String sheetName) throws InvalidFormatException, IOException  {

		ArrayList<String> userData = new ArrayList<String>();

		File file = new File("src/test/resources/userRegistrationData.xlsx");

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);

		XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);

		int lastRowNumber = xssfSheet.getLastRowNum();

		for (int i = 1; i <= lastRowNumber; i++) {
			XSSFRow xssfRow = xssfSheet.getRow(i);

			int lastCellNum = xssfRow.getLastCellNum();

			for (int j = 0; j < lastCellNum; j++) {
				userData.add(xssfRow.getCell(j).getStringCellValue());
			}
		}
		xssfWorkbook.close();
		return userData;

	}


}
