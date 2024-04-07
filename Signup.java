package stepDefiniton;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import browserFactory.Browse_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.SignupPage;

public class Signup {
	WebDriver driver;
	SignupPage sp;
	@Given("User enter the URL as {string}")
	public void user_enter_the_url_as(String URL) {
		driver=Browse_Factory.getDriver();
	    driver.get(URL);
	  
	} 

	@When("User click on Signup\\/Login button")
	public void user_click_on_signup_login_button() {
		sp =new SignupPage(driver);
	sp.setTxtbutton();
	}

	@Then("User should navigate to OR page")
	public void user_should_navigate_to_OR_page() {
		
		assertEquals(sp.setTxtsignuptitle(), "OR");
	
	}
}
