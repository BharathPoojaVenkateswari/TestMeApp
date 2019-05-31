package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exa3 {
	WebDriver driver;
	@Given("user navigates to TestMe Application")
	public void user_navigates_to_TestMe_Application() {
		System.out.println("user navigates to TestMe");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.navigate().to("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.un.sendKeys("lalitha");
		LoginPageObjects.psd.sendKeys("password123");
	}

	@Then("performs login")
	public void performs_login() {
		System.out.println("user performs login");
        LoginPageObjects.login.click();
	    
	}


}
