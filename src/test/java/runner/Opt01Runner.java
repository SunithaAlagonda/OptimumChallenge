package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"E:\\testautomation\\com.optimum.travel\\src\\test\\resources\\features\\feature1.feature"},
		glue= "opt03glue",
		plugin= {"pretty","json:target\\results","rerun:target\\failed.txt"},
		monochrome=true
		)
public class Opt01Runner 
{

}
