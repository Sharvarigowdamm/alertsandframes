package Practicetestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import utilities.readpropertyfile;

public class fileoperations {

	/*
	 * public static void main(String[] args) throws IOException { File src=new
	 * File("./configuration.properties"); FileInputStream fis= new
	 * FileInputStream(src); Properties obj=new Properties(); obj.load(fis);
	 * System.out.println(obj.getProperty("name")); }
	 */
	@Test
	public void testcase1() throws IOException
	{
		readpropertyfile read=new readpropertyfile();
		String firstname=read.readpropertiesFile();
		System.out.println(firstname);
	}
	
	

}
