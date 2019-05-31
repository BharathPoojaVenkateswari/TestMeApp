package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement psd;
	@FindBy(xpath="//input[@name='Login']")
	public static WebElement login;
	
	

}
