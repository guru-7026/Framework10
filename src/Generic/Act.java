package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Act 
{
	public static void doubleclick(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	public static void contextclick(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
		
	}

}
