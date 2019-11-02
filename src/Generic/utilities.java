package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilities 
{
	public static String  getdata(String path,String sheet_no,int row,int column)
	{
		String data=null;
		try {
			FileInputStream f=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			 data = book.getSheet(sheet_no).getRow(row).getCell(column).getStringCellValue();
			
		} catch (Throwable e) {
			
		}
		 return data;
	}

}
