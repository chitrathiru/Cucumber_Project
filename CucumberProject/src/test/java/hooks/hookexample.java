package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookexample {
	
	@Before(order=1)
	public void beforeScenario()
	{
	System.out.println("Thanos will collet infinite stone");	
	}

	@After(order=1)
	public void afterScenario()
	{
	System.out.println("He went back to garden");	
	}
	
	@Before(order=0)
	public void beforeBeforeScenario()
	{
		System.out.println("Thanos is born");
	}
	
	@After(order=0)
	public void afterAfterScenario()
	{
		System.out.println("Thanos is dead");
	}
}
