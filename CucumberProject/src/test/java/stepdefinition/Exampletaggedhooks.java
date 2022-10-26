package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exampletaggedhooks {
	
	@Given("This is first step")
	public void this_is_first_step() {
		System.out.println("This is first step");
	}


	
	@When("This is second step")
	public void this_is_second_step() {
		System.out.println("This is second step");
	}

	@Then("This is final step")
	public void this_is_final_step() {
		System.out.println("This is third step");
	}



}
