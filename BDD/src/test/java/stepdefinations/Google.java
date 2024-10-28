package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	WebDriver driver;
	
	@Given("The user should be present in google search page.")
	public void the_user_should_be_present_in_google_search_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	}

	@When("He searches for something.")
	public void he_searches_for_something() {
		driver.findElement(By.name("q")).sendKeys("Qspiders Basavanagudi"+Keys.ENTER);   
	}

	@Then("The search page should be displayed.")
	public void the_search_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	    
	}
	
}
