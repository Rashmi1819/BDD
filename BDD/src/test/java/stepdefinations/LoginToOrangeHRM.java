package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToOrangeHRM {
	WebDriver driver;
	
	@Given("We should enter {string} in the browser")
	public void we_should_enter_in_the_browser(String url) {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(url);   
	}
 
	@When("He enter the username as {string}")
	public void he_enter_the_username_as(String username) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 driver.findElement(By.name("username")).sendKeys(username);  
	}
  
	@And("He enter the password as {string}")
	public void he_enter_the_password_as(String password) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.findElement(By.name("password")).sendKeys(password);  
	}
  
	@And("He clicks on Login button")
	public void he_clicks_on_login_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("DemoOrangeHRM home page should be displayed")
	public void demo_orange_hrm_home_page_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   System.out.println(driver.getTitle());
	   WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.quit();
	}
    
    

}
