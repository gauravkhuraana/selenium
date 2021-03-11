

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
;


public class excelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src = new File("D:\\software\\practise files\\ReadMe.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb1 = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb1.getSheetAt(0);
		
		System.out.println("Firstly lets read the data ");
		for(int i=0;i<6; i++)
		{
			for(int j=0;j<6; j++)
			{
				System.out.print(sh1.getRow(i).getCell(j).getNumericCellValue() + " ");
			}
			System.out.println();
		}
		System.out.println("Lets Write the data now");
		
		for(int i=0;i<6; i++)
		{
			for(int j=0;j<6; j++)
			{
			  sh1.getRow(i).getCell(j).setCellValue(i*j);
			}
			System.out.println();
		}
		
		//FileOutputStream fos = new FileOutputStream("D:\\software\\practise files\\WriteMe.xlsx");
		FileOutputStream fos = new FileOutputStream(new File("D:\\software\\practise files\\WriteMe2.xls"));
		wb1.write(fos);
 }

}
