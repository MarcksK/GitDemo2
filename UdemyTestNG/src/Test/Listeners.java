package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITest Listeners which Implements TestNG listeners

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess (ITestResult result)
	{
		System.out.println ("Test passed Listeners"+ result.getName());
		
	}

}
