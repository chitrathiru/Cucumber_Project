package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeDefinition {
	
	WebDriver driver;
	@Given("^user is on login page$")
	
	public void user_is_on_login_page()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

    @When("^user enter valid username and pwd$")	
    
    public void user_enter_valid_username_and_pwd()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    
    }
    
  @When("^user click the login button$")	
    
    public void user_click_the_login_button()
    {
    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
  
  @Then("^the user should be navigate to home page$")
 
  public void the_user_should_be_navigate_to_home_page()
  {
  	boolean status = driver.findElement(By.partialLinkText("PIM")).isDisplayed();
  	Assert.assertTrue(status);
	  System.out.println("login successfully");
  }
	
}
