import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class readCSVFiles {

	static public void main(String[] args)
	{
	try
	{
	CSVReader csv = new CSVReader(new FileReader("D:\\software\\practise files\\CSVFile.csv"));
	
	List<String[]> li = csv.readAll();
	
	System.out.println("The total number of rows are "+ li.size());
	
	Iterator<String[]> i = li.iterator();
	
	while(i.hasNext())
	{
		String[] str = i.next();
		for(int j=0 ; j <str.length;j++)
		{
			System.out.print(str[j]+ " ");
		}
		System.out.println();
	}
	
	}
	catch(Exception e)
	{
		System.out.println("The exception that came is " + e.getMessage());
	}

	}
	}
