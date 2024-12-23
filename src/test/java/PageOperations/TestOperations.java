package PageOperations;

import CommonLogics.Drivers;
import CommonLogics.commonOperations;
//import PageObjects.TestObject;
import PageObjects.TestObject;

public class TestOperations {
	
	TestObject testObject;
	
	public TestOperations() {
		testObject = new TestObject();
	}

	public void launchTheUrl() {
		
		Drivers.driver.navigate().to("https:facebook.com");
		
		
	}

	public void NaviateToTheTab(String tabName) {
		//commonOperations.clickXpathElement(testObject.getTabXpath(tabName));
		commonOperations.clickXpathElement("//a/div[text()='"+tabName+"']");
		
		
	}

}
