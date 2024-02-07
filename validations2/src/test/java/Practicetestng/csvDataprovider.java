package Practicetestng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ReadExcelExample;
import utilities.readExcelfile;

public class csvDataprovider {
	@DataProvider(name="csvdata")
	public Object[][] providedata() throws IOException
	{
		ReadExcelExample read=new ReadExcelExample();
		Object[][] data=read.ReadExceldata("path","sheet");
		
		return data;
	}
	@Test(dataProvider="csvData")
	public void testcase(String Name,String pwd)
	{
		System.out.println(Name);
		System.out.println(pwd);
	}
	

}
