package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rowcount;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<cellcount;c++)
			{
				//
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"\t\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
