package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelSheetReader extends BaseClass {
	
	public String urlname() throws IOException {
	FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
	XSSFWorkbook wb=new XSSFWorkbook(fis);   
	XSSFSheet sheet1=wb.getSheetAt(0);
	 String url=sheet1.getRow(0).getCell(1).getStringCellValue();
	 return url;
	}
	
	public String username() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 String uname=sheet1.getRow(1).getCell(1).getStringCellValue();
		 return uname;
		}
	
	public String password() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 String pass=sheet1.getRow(2).getCell(1).getStringCellValue();
		 return pass;
		}
	
	public String dpcnt() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 String dt=sheet1.getRow(3).getCell(1).getStringCellValue();
		 return dt;
		}
	
	public String searchcnt() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 String cn=sheet1.getRow(4).getCell(1).getStringCellValue();
		 return cn;
		}
	
	public double lowpr() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 double low=sheet1.getRow(5).getCell(1).getNumericCellValue();
		 return low;
		}
	
	public double highpr() throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Ganesh\\eclipse-workspace\\MavenProject2\\Data\\data.xlsx"));  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet1=wb.getSheetAt(0);
		 double high=sheet1.getRow(6).getCell(1).getNumericCellValue();
		 return high;
		}
	
	
	
	
	
	

}
