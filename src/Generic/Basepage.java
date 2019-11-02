package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage 
{
	public WebDriver driver;
	public Basepage(WebDriver d)
	{
		this.driver=d;
	}
	public void titlewait(String expected_title)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.titleIs(expected_title));
		Reporter.log("pass: title is matching");										//parent class
		}
		catch(Throwable e)
		{
			Reporter.log("fail: title is not matching");
			Assert.fail();
		}
		
	}
	public void element_visiblity(WebElement element)
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Throwable e)
		{
			Reporter.log("fail: title is not matching");
			Assert.fail();

			
		}
		
	}
	

}
