package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel 
{
	public static void selectbyindex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
		
	}
	public static void selectbyvalue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByValue(Value);
		
	}

}
