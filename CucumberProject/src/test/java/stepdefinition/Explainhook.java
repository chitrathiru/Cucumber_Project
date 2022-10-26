package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Explainhook {
	
	@Given("Thanos has inifinite stone")
	public void thanos_has_inifinite_stone() {
		System.out.println("thanos has inifite stone");
	}


	@When("Thanos snap his finger")
	public void thanos_snap_his_finger() {
		System.out.println("Thanos snap his finger");
		
	}

	@Then("Half of the living things died")
	public void half_of_the_living_things_died() {
		System.out.println("Half of the living things died");
	}




}
