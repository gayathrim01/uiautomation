package CommonLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class commonOperations {
	
	 static WebDriver driver;
	
	public commonOperations() {
		driver = Drivers.driver;
	}
	
	
	public static void clickXpathElement(String xpath) {
		//WaitLogic.waitForSeconds(6);
		driver.findElement(By.xpath(xpath)).click();
	}

}
