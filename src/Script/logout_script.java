package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.utilities;
import POM.actitime_enter_timetrack;
import POM.actitime_login;

public class logout_script extends BaseTest
{
	@Test
	public void logout_script()
	{
		actitime_login ob=new actitime_login(driver);
		ob.setusername(utilities.getdata(excel_path, "sheet1", 0, 0));
		ob.setpassword(utilities.getdata(excel_path, "sheet1", 1, 0));
		ob.clicklogin();
		
		actitime_enter_timetrack ob1=new actitime_enter_timetrack(driver);
		ob1.clicklogot();
		

		
	}
	}




