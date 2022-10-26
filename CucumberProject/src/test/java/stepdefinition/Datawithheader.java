package stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable ;

public class Datawithheader {
	
	WebDriver driver;
	@Given("user navigate to login page with header")
	public void user_navigate_to_login_page_with_header() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
	}


	
	@When("user enter below credentials with header")
	public void user_enter_below_credentials_with_header(DataTable dataTable) {
		
		List<Map<String,String>> dataTablevalue = dataTable.asMaps(String.class,String.class);
		String uname = dataTablevalue.get(0).get("Username");
		String pwd = dataTablevalue.get(0).get("Password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	
		
	}
	
	@When("clicks the login button with header")
	public void clicks_the_login_button_with_header() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}

	@Then("user navigate to home page with header")
	public void user_navigate_to_home_page_with_header() {
		boolean status = driver.findElement(By.partialLinkText("PIM")).isDisplayed();
	  	Assert.assertTrue(status);
		  System.out.println("login successfully");
	

	}


}
