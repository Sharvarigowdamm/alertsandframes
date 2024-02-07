package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample {
public Object[][]ReadExceldata(String filepath,String sheetname) throws IOException
{
	File src=new File(filepath);
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb1=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb1.getSheet(sheetname);
	int rowcount=sheet1.getLastRowNum();
	int columncount=sheet1.getRow(0).getLastCellNum();
	Object[][] data =new Object[rowcount][columncount];
	for(int i=0;i<columncount;i++)
	{
		Row row=sheet1.getRow(i+1);
		for(int j=0;j<columncount;j++)
		{
			data[i][j]=row.getCell(j).toString();
		}
	}

   return data;
}
}
