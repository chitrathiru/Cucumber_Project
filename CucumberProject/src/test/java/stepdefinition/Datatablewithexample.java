package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatablewithexample {
	
	WebDriver driver;
	
	@Given("proceed to login page")
	public void proceed_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}


	

	@When("user enters {string} and {string}")
	public void user_enters_and(String uname, String pwd) {
	
		//List<String> credential =dataTable.asList(String.class);//|Admin|
		//|admin123|
//List<String> credential = dataTable.transpose().asList(String.class);//|Admin|admin123|
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);

	}
	
	@When("clicks login")
	public void clicks_login() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}



}
