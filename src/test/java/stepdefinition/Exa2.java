package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exa2 {
	
	@Given("user login")
	public void user_login() {
	    System.out.println("user performs login");
	}

	@When("search product using category")
	public void search_product_using_category() {
		System.out.println("user performs search using category");
	    
	}

	@Then("verify the list of products And close the application")
	public void verify_the_list_of_products_And_close_the_application() {
		System.out.println("user verifies the list of product and close the application");
	    
	}

	@When("search product using sub-category")
	public void search_product_using_sub_category() {
		System.out.println("user performs search using sub-category");
	    
	}

	@When("search product using productname")
	public void search_product_using_productname() {
		System.out.println("user performs search using productname");
	    
	}
	
	

}
