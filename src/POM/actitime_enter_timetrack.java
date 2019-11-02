package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;



public class actitime_enter_timetrack  extends Basepage
{
	@FindBy(xpath="//div[text()='TIME-TRACK']")
	private WebElement timetrack;
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	@FindBy(xpath="//div[text()='REPORTS']")
	private WebElement reports;
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public actitime_enter_timetrack (WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicktime_track()
	{
		this.timetrack.click();
	}
	public void clicktasks()
	{
		this.tasks.click();
	}
	public void clickreports()
	{
		this.reports.click();
	}
	public void clickusers()
	{
		this.users.click();
	}
	public void clicklogot()
	{
		this.element_visiblity(logout);
		this.logout.click();
	}




	

}
