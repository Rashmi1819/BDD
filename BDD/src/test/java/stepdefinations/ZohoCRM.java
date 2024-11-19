package stepdefinations;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZohoCRM {
	WebDriver driver;

	@Given("user should enter the url {string}")
	public void user_should_enter_the_url(String string) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.230.128:8080/crm/HomePage.do"); 
	}

	@When("he should enter the username {string}")
	public void he_should_enter_the_username(String string) {
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	    
	}

	@And("he should enter the password {string}")
	public void he_should_enter_the_password(String string) {
		driver.findElement(By.id("passWord")).sendKeys("123456");
	}

	@And("he should click on signin button")
	public void he_should_click_on_signin_button() {
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
	}

	@Then("CRM home page should be displyed")
	public void crm_home_page_should_be_displyed() {
		SoftAssert ele = new SoftAssert()
	    String etitle = "Welcome";
	    String atitle = "Welcome1 ";
	    assert.assertEquals(atitle, etitle);
	    
	    
	}

	@And("click on campaign module")
	public void click_on_campaign_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click on new campaign button")
	public void click_on_new_campaign_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("create campaign page should be displayed")
	public void create_campaign_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the create campaign page")
	public void user_enter_the_create_campaign_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter the details of Campaign Name: {string}")
	public void enter_the_details_of_campaign_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("enter the start date:")
	public void enter_the_start_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter the End date:")
	public void enter_the_end_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select the type")
	public void select_the_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Select the status")
	public void select_the_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Campaign details page should be displayed")
	public void campaign_details_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
