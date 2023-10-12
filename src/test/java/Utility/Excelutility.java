package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {

	public static String getCellValue(String xl,String sheet,int r,int c) throws Exception
	{
		try {
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v=cell.getNumericCellValue();
				int val=(int)v;
				return String.valueOf(val);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		}
		
	}
	public static int getRowCount(String xl,String sheet) {
		try {

		FileInputStream fi=new FileInputStream(xl);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		return wb.getSheet(sheet).getLastRowNum();		

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	
	
}			




