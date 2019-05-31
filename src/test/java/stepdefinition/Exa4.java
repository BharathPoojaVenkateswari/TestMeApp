package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exa4 {
	
	
	
	@Given("user login to TestMeApp")
	public void user_login_to_TestMeApp() {
	    
	}

	@When("user selects product as {string}")
	public void user_selects_product_as(String sb) {
		System.out.println("entered product is "+sb);
	    
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
	    
	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer n) {
		System.out.println("entered quantity as "+n);
	    
	}

	@When("user proceeds checkout")
	public void user_proceeds_checkout() {
	    
	}

	@Then("verify the payment and payment page")
	public void verify_the_payment_and_payment_page() {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
