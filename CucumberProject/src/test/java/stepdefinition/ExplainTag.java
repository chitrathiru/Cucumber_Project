package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExplainTag {
	
	@Given("This is a given statement for first scenario")
	public void this_is_a_given_statement_for_first_scenario() {
		System.out.println("This is first scenario");
		
	}



	@When("This is when statement for first scenario")
	public void this_is_when_statement_for_first_scenario() {
		System.out.println("This is first sceond scenario");
		
	}

	@Given("This is a given statement for second scenario")
	public void this_is_a_given_statement_for_second_scenario() {
		System.out.println("This is second scenario");
	}



	@When("This is when statement for second scenario")
	public void this_is_when_statement_for_second_scenario() {
		System.out.println("This is second second scenario");
	}




}
