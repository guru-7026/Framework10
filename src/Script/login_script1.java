package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.utilities;
import POM.actitime_login;

public class login_script1 extends BaseTest {
	@Test
	public void login_script()
	{
		actitime_login ob=new actitime_login(driver);
		ob.setusername(utilities.getdata(excel_path, "sheet1", 0, 0));
		ob.setpassword(utilities.getdata(excel_path, "sheet1", 1, 0));
		ob.clicklogin();
		ob.titlewait("actiTIME - Enter Time-Trac");
	}


}
