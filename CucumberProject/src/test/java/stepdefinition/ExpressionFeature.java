package stepdefinition;

import io.cucumber.java.en.Given;

public class ExpressionFeature {
	
	
	@Given("^i have (\\d+) laptop$")
	public void i_have_1_laptop(int count)
	{
		System.out.println("Count  "+ count);
	}
	
	@Given("^i have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float gpa)
	{
	System.out.println("GPA Count  "+gpa);	
	}
	
	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String s1,String s2,String s3)
	{
		System.out.println(s1+"  "+s2+"  "+s3);
	}

}

