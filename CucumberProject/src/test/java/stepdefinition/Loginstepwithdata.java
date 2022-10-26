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

public class Loginstepwithdata {

	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid credentials {string} and {string}")
	// @When("^user enter valid credentials \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_valid_credentials_and(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(string2);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Then("the user should be able to navigate to home page")
	public void the_user_should_be_able_to_navigate_to_home_page() {
		boolean status = driver.findElement(By.partialLinkText("PIM")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("login successfully");

	}

}
