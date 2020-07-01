package opt02pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Opt01Page
{
	RemoteWebDriver queen;
	@FindBys({@FindBy(how=How.XPATH,using="(//div[@class='mainTxt clearfix'])[1]/span[1]")})
	public List<WebElement> fromcache;
	@FindBy(how=How.XPATH,using="//input[@placeholder='From']")
	public WebElement source;
	@FindBy(how=How.XPATH,using="//input[@placeholder='Destination']")
	public WebElement dest;
	@FindBy(how=How.XPATH,using="(//div[@class='DayPicker DayPicker--en'])/div[2]/div[3]/div[2]/div[4]")
	public WebElement date;
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	public WebElement srch;

	public Opt01Page(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
	}

	public void sourceFill(String src) throws Exception
	{
		source.sendKeys(src);
		Thread.sleep(5000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
	}
	public void destFill(String dst) throws Exception
	{
		dest.sendKeys(dst);
		Thread.sleep(5000);
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);

	}
	public void depdate()
	{
		date.click();
	}
	public void search() throws Exception
	{
		srch.click();
		Thread.sleep(5000);
	}
}

