package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readpropertyfile {

	public String readpropertiesFile() throws IOException
	{
		File src=new File("./configuration.properties");
		FileInputStream fis= new FileInputStream(src);
		Properties obj=new Properties();
		obj.load(fis);
		return obj.getProperty("name");
	}
	
	
}
