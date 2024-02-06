package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class readcsvfile {

	public static void main(String[] args) throws IOException, CsvException {
		CSVReader reader=new CSVReader(new FileReader("./readcsv.csv"));
		List<String[]> li=reader.readAll();
		System.out.println("total no of rows"+li.size());
		
		//create iterator ref
		Iterator<String[]>i1=li.iterator();
		while(i1.hasNext())
		{
			
			String[] str=i1.next();
			System.out.println("values are");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
				
			}
			System.out.println("");
			
			
		}
		
	}

}
