package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataDynamic {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\WritingDataDynamic.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row count");
		int row=sc.nextInt();

		System.out.println("Enter the cell count");
		int cell=sc.nextInt();

		for(int r=0;r<=row;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<cell;c++)
			{
				currentrow.createCell(c).setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();
		System.out.println("Sucess");
	}

}
