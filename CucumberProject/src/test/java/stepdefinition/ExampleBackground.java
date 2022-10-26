package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleBackground {
	
	@Given("The student finished high school")
	public void the_student_finished_high_school() {
		System.out.println("The student finished high school");
	}

	@Given("The student finished higher secondary")
	public void the_student_finished_higher_secondary() {
		System.out.println("The student finished higher secondary");

	}

	
	@Given("Student applied for medical course")
	public void student_applied_for_medical_course() {
		System.out.println("Student applied for medical course");

	}

	
	@When("cleared the entrance exam")
	public void cleared_the_entrance_exam() {
		System.out.println("cleared the entrance exam");

	}

	@Then("Eligible to join Medical college")
	public void eligible_to_join_medical_college() {
		System.out.println("Eligible to join Medical college");
	
	}

	@Given("Student applied for engineering course")
	public void student_applied_for_engineering_course() {
		System.out.println("Student applied for engineering course");

	}


	@When("student cleared the entrance exam")
	public void student_cleared_the_entrance_exam() {
		System.out.println("student cleared the entrance exam");

	}
	
	@Then("Eligible to join Engineering college")
	public void eligible_to_join_engineering_college() {
		System.out.println("Eligible to join Engineering college");
	
	}





}
