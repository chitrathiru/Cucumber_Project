package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable;

public class Datatablewithoutheadersd {

   WebDriver driver;
	
	@Given("user navigate to login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


	
	@When("user enter below credentials")
	public void user_enter_below_credentials(DataTable dataTable) {
	
		List<String> credential =dataTable.asList(String.class);//|Admin|
																//|admin123|
		//List<String> credential = dataTable.transpose().asList(String.class);//|Admin|admin123|
		String uname = credential.get(0);
		System.out.println(uname);
		String pwd = credential.get(1);
		System.out.println(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	
	}


	
	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
	}
	
	@Then("user navigate to home page")
	public void user_should_be_navigate_to_home_page() {
	 
		boolean status = driver.findElement(By.partialLinkText("PIM")).isDisplayed();
	  	Assert.assertTrue(status);
		  System.out.println("login successfully");
	
	}



	
	
}
