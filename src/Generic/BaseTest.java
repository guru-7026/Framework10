package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements Autoconstant
{
     public WebDriver driver;
     static
	{
		System.setProperty(chromekey,chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
     @Parameters({"browser"})
	@BeforeMethod(alwaysRun=true)
	public void precondition(String br)
	{
    	 if(br.equals("chrome"))
    	 {
		driver=new ChromeDriver();
    	 }
    	 else
    	 {
    		 driver=new FirefoxDriver();
    	 }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod(alwaysRun=true)
	public void postcondition(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getMethod().getMethodName();
		if(status==2)
		{
			Photo.getphoto(driver,name);
		}
		driver.close();
	}

}
