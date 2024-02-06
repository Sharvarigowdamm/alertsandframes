package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import com.opencsv.CSVReader;

public class ReadxmlFile {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
		File src=new File("./readxml.xml");
		FileInputStream fis=new FileInputStream(src);
		
		SAXReader reader=new SAXReader();
		Document doc=reader.read(fis);
		System.out.println(doc);

	}
;
}
