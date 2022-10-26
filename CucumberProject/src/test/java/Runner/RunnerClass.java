package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="featureFiles/OpenGoogle.feature",glue = "stepdefinition")
//@CucumberOptions(features="featureFiles/LoginOrange.feature",glue = "stepdefinition")


//@CucumberOptions(features="featureFiles/RegularExpression.feature",glue = "stepdefinition")
//@CucumberOptions(features="featureFiles/Loginwithdata.feature",glue="stepdefinition")
//@CucumberOptions(features="featureFiles/Datatablewithoutheader.feature",glue="stepdefinition")
@CucumberOptions(features="featureFiles/Datatablewithheader.feature",glue="stepdefinition")
//@CucumberOptions(features="featureFiles/Datatablewithexample.feature",glue="stepdefinition")
/*@CucumberOptions(features="featureFiles/cucumberhook.feature"
					,glue="stepdefinition"
					,dryRun=true
					,monochrome=true
					,plugin={"html:report/WebReport","json:report/jsonreport.json"}
                    ,tags= "@Hooks"
)*/
//@CucumberOptions(features="featureFiles/cucumberhook.feature",glue={"stepdefinition","hooks"},tags="@Hooks")

//@CucumberOptions(features="featureFiles/taghookexample.feature",glue={"stepdefinition","hooks"},tags="@Taggedhooks")
//@CucumberOptions(features="featureFiles/Backgroundexample.feature",glue={"stepdefinition","hooks"},tags="@BackgroundExample")

//@CucumberOptions(features="featureFiles/cucumbertag.feature",glue= {"stepdefinition"},tags= "@FirstScenario or @ThirdScenario")



public class RunnerClass {
	

}
