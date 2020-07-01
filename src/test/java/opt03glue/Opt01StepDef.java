package opt03glue;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import opt01utilities.Opt01Common;
import opt02pages.Opt01Page;
import opt02pages.Opt02Page;

public class Opt01StepDef 
{
	RemoteWebDriver queen;
	Properties p;
	Scenario s;
	Opt01Common util;
	Opt01Page p1;
	Opt02Page p2;
	
	@Before
	public void m1() throws Exception
	{
		p= new Properties();
		FileReader fr= new FileReader("E:\\testautomation\\com.optimum.travel\\src\\test\\resources\\properties\\properties1.properties");
		p.load(fr);
		util= new Opt01Common();
	}
	@Given("^site launched using \"(.*)\"$")
	public void m(String br) 
	{
		queen=util.openBrowser(br);
		p1= new Opt01Page(queen);
		p2= new Opt02Page(queen);
		util.openSite(p.getProperty("url"));
	}
	@When("^enter source city as \"(.*)\"$")
	public void m2(String fcity) throws Exception
	{
		p1.sourceFill(fcity);
	}
	@And("^enter destination city as \"(.*)\"$")
	public void m3(String tcity) throws Exception
	{
		p1.destFill(tcity);
	}
	@And("^select departure date$")
	public void m4()
	{
		p1.depdate();
	}
	@And("^click on search button$")
	public void m5() throws Exception
	{
		p1.search();
	}
	/*@Then("^next page should be open displaying respective flights$")
	public void m6()
	{
		
	}*/
	@And("^Click duration$")
	public void m7()
	{
		p2.tduration();
	}
	@And("^select evening flight$")
	public void m8()
	{
		p2.eveningfly();
	}
	@And("^select lowest price flight$")
	public void m9()
	{
		p2.lowprice();
	}
	@And("^Click on book button$")
	public void m10() throws Exception
	{
		p2.booking();
	}
	@And("^close site$")
	public void m11()
	{
		util.closesite();
	}
}








