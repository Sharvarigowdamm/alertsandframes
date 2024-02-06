package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("./ReadfromExcel.xml");
		FileInputStream fis=new FileInputStream(src);
		//access
		XSSFWorkbook wb1=new XSSFWorkbook(fis);
		//to access the object of the sheet
		XSSFSheet sh1=wb1.getSheet("Sheet1");
		System.out.println(sh1.getLastRowNum());

	}

}
