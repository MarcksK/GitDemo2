import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	//Identify Test Case Column by scanning the entire 1st row
	//once column is identified then scan the entire test case column
	//after you grab purchase Testcase row pull all the data
	
	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		
			
			
			//fileInputStram Argument
			
			ArrayList <String> a = new ArrayList<String>();
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Marcks\\Pictures\\demodata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			int sheets = workbook.getNumberOfSheets();
			
			for (int i=0; i<sheets; i++)
				
			{
				
				
	      if ( workbook.getSheetName(i).equalsIgnoreCase("testdata"))
	    		  {
	    	  
	    	  XSSFSheet sheet=workbook.getSheetAt(i);
	    	  //Identify Testcases column by scanning the entire 1st row 
	    	  
	    	Iterator <Row> rows = sheet.iterator();  //Sheet is a collection of Rows
	    	Row firstrow = rows.next();
	    	Iterator <Cell> ce = firstrow.cellIterator(); //Row is a collection of cells 
	    	int k=0;
	    	int colomn = 0;
	    	while(ce.hasNext())
	    		
	    	{
	    	Cell value =ce.next();
	    	if (value.getStringCellValue().equalsIgnoreCase("Testcases"))
	    		
	    	{
	    		
	    		colomn =k;
	    		
	    	}
	    	k++;
	    	
	    	}
	 
				System.out.println(colomn);
				
				
		    while (rows.hasNext())
		    {
		    	
		    	Row r = rows.next();
		    	if (r.getCell(colomn).getStringCellValue().equalsIgnoreCase("testcaseName"))
		    		
		    	{
		    		
		    		//After you grab purchase testcase row = pull all the data of that row and feed into test
		    		
		    		Iterator <Cell> cv = r.cellIterator();
		    		while (cv.hasNext())
		    		{
		    			
		    	       a.add(cv.next().getStringCellValue());
		    		}
		    		
		    	}
		    	
		   
		   
		    }
				
				
				
			}
		
			}
			return a;
		}

		
		public static void main (String[] args) throws IOException {
			
		}
		
		
		
		
		
		
	}
	



