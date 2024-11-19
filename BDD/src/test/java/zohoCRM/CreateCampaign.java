package zohoCRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaign {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://192.168.230.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
	driver.findElement(By.linkText("Campaigns")).click();
	driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	driver.findElement(By.name("property(Campaign Name)")).sendKeys("Rashmi");
	driver.findElement(By.name("property(Start Date)")).sendKeys("10/27/2024");
	driver.findElement(By.name("property(End Date)")).sendKeys("10/30/2024");
    WebElement type = driver.findElement(By.name("property(Type)"));
    type.click();
    Select s = new Select(type);
    s.selectByIndex(6);
    WebElement status = driver.findElement(By.name("property(Status)"));
    Select s1 = new Select(status);
    s1.selectByIndex(1);
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    
    
    
     
}
}
