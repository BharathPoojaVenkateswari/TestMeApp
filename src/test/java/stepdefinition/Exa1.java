package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exa1 {
	WebDriver driver;
	@Given("user launch chrome browser And enters TestMeApp URl")
	public void user_launch_chrome_browser_And_enters_TestMeApp_URl() {
	    
		System.out.println("chrome browser is launched and URL is entered");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.navigate().to("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}

	@When("user enter username in username field")
	public void user_enter_username_in_username_field() {
	    
		System.out.println("user name is entered in the field");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Lalitha");
	
	}

	@When("user enter password in password field")
	public void user_enter_password_in_password_field() {
	    
		System.out.println("password is entered in the field");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
	   
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	   
		System.out.println("clicked OK button");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	  
	}

	@Then("it verifies successful login")
	public void it_verifies_successful_login() {
	   
		System.out.println("verified login");
	   
	}

}
