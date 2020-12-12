package Amazon_StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import amazon_pages._01_HomePage;
import io.cucumber.java.en.*;

public class Amazon_StepDefination {
	public WebDriver driver;
	String Url="https://www.amazon.in/";
	 
	
	_01_HomePage homepage =new _01_HomePage(driver);
	
	//*****************HomePage***********************************************************
	
	@Given("User Is Open The Browser")
	public void user_is_open_the_browser() {
		driver.get(Url);
	}

	@Then("check User Navigate To Home Page Of Amazon or not")
	public void check_user_navigate_to_home_page_of_amazon_or_not() {
		String actual=driver.getTitle();
		String expected ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals("title matched of home page", expected, actual);
	}

	@Then("Check common element on HomePage are displayed")
	public void check_common_element_on_home_page_are_displayed() throws Exception {
		String expected ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		homepage.elementPresentInHeader(expected);
	}
	
    @When("Click On a HomePage Product")
	public void click_on_a_home_page_product() {
    	homepage.HomePageProductClickable();
    }

	@Then("List Of That Product Should Display")
	public void list_of_that_product_should_display() {
	 String ProductTitleexpected ="Amazon.in: Dishwasher store: Home &amp; Kitchen";
	 String producttitleactual =driver.getTitle();
	 Assert.assertEquals("HomePage product list title matched", ProductTitleexpected, producttitleactual);
	}

	@When("User Is On Bottom Of The HomePage")
	public void user_is_on_bottom_of_the_home_page() throws Exception {
		homepage.BackToTopLink();
	}

	

	@Then("Language Link Should Display")
	public void language_link_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("All Required Element Should Display")
	public void all_required_element_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Is On Bottom Of The Page")
	public void user_is_on_bottom_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click On Back To Top Bar")
	public void click_on_back_to_top_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Should Directly goes to top of home page")
	public void user_should_directly_goes_to_top_of_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
