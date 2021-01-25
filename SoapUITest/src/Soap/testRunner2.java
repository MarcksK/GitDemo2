package Soap;
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

public class testRunner2 {
	
	@Test
	public void singleTest() throws XmlException, IOException, SoapUIException
	{
		
		//Grab Project
		WsdlProject project = new WsdlProject("C:\\Users\\Marcks\\Downloads\\Employee.xml");//shows where the file is present
		
		//Grab Test Suite in the project
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing");
		
		WsdlTestCase testcase = testsuite.getTestCaseByName("GetEmployee");
		
		TestRunner runner = testcase.run(new PropertiesMap(), false);
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
		
	}

}
