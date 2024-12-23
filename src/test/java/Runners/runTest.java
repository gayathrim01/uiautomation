package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import CommonLogics.Drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
		features = {"src/test/java/Features"},
		glue= {"StepDefinitions"},
		dryRun =false,
		monochrome=true,
		tags ="@Login"	)

@Listeners(Runners.Listeners.class)
public class runTest extends AbstractTestNGCucumberTests
{
	public static WebDriver driver;
	Drivers drivers = new Drivers();
	//public static ConfigReader configReader = new ConfigReader;
	public runTest() {
		
	}
	
	@BeforeClass
	public void setUP() {
		String browserName = "chrome";
		drivers.instantiateDriver(browserName);
	}
	
	
	
}
		
