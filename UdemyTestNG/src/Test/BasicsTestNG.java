package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicsTestNG {


		// TODO Auto-generated method stub
		
	@Test
	public void demo () 
	{
		System.out.println("Hello");
		
	}
	
	@Test(dataProvider="getData")
	public void SecondTest (String username, String password)
	
	{
		
		System.out.println("Bye Bye");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will excecute first");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassord";
		
		return data;
	}


}
