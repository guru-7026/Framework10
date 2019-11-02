package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;


public class actitime_login extends Basepage
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")   									//child class
	private WebElement password;
	
	@FindBy(id="loginButtonContainer")
	private WebElement login;
	


	
	public actitime_login(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);//initializing 
		
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	public void clicklogin()
	{
		this.login.click();
	}
	}


