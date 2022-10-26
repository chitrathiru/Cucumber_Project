package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDefinition {
	
	
	WebDriver driver;
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   driver.get("http://www.google.com");
	}


	//Some other steps were also undefined:

	@When("user is typing {string} in search box")
	public void user_is_typing_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("q")).sendKeys(string);
	
	}
	
	@When("user is pressing the search button")
	public void user_is_pressing_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
	   //driver.findElement(By.name("q")).sendKeys(Keys.RETURN); // when user press the enter key
	}
	@Then("user is to see the california related results")
	public void user_is_to_see_the_california_related_results() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("Cali")).isDisplayed();
		if (status)
		{
			System.out.println("Result Displayed");
		}
	   
	}


	
}
