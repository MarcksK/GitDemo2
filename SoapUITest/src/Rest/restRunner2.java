package Rest;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class restRunner2 {

	@Test	
	public void RestTest2() throws XmlException, IOException, SoapUIException
	{
		
			// TODO Auto-generated method stub
			
			//Grab Project
			WsdlProject project = new WsdlProject("C:\\Users\\Marcks\\Downloads\\LibraryAPI.xml");//shows where the file is present
			
			//Grab Test Suite in the project
			for (int j=0; j<project.getTestSuiteCount();j++) // Stands for TestSuite looping 
			{
				WsdlTestSuite testsuite = 	project.getTestSuiteAt(j);
				
				for (int i=0;i<testsuite.getTestCaseCount();i++)  //Stands for Testcase looping 
				{
					
					WsdlTestCase testcase = testsuite.getTestCaseAt(i);
					
					//code to excecute
					TestRunner runner = testcase.run(new PropertiesMap(), false);
					Assert.assertEquals(Status.FINISHED, runner.getStatus());
					
				}
				
				
				
				
			}
			
			
			
			//Grab testcases present in the test suite
			
	
}


}
