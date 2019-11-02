package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	public static void getphoto(WebDriver driver,String name)
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/"+name+".png");
		 try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
		
		
		}
		
	}

}
