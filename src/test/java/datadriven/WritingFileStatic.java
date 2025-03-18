package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingFileStatic {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\WriteData.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("information");
		
		//pavankumar way
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("ashutosh");
		row1.createCell(1).setCellValue("patil");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("aryan");
		row2.createCell(1).setCellValue("patil");
		
		
		
		
	/*	XSSFCell cell0=row0.createCell(0);
		XSSFCell cell1=row0.createCell(1);
		XSSFCell cell2=row0.createCell(2);
		cell0.setCellValue("ashu");
		cell1.setCellValue("sanchit");
		cell2.setCellValue("aryan");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("vicks");
		
		/*XSSFRow row1=sheet.createRow(1);
		XSSFCell cell0=row1.createCell(0);
		cell0.setCellValue("patil");*/
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Success");
		
	}

}
