package opt02pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Opt02Page 
{
	RemoteWebDriver queen;
	@FindBy(how=How.XPATH, using="(//input[@type='button' and @value='BOOK'])[1]")
	public WebElement book;
	@FindBy(how=How.XPATH, using="(//span[@class='dF alignItemsCenter justifyCenter'])[2]")
	public WebElement duration;
	@FindBy(how=How.XPATH, using="//span[@data-cy='timeFilter2']")
	public WebElement eveflight;
	@FindBy(how=How.XPATH, using="(//span[@class='dF alignItemsCenter justifyCenter'])[4]")
	public WebElement price;
	
	public Opt02Page(RemoteWebDriver queen)
	{
		this.queen=queen;
		PageFactory.initElements(queen, this);
	}
	
	/*public String display()
	{
		String x=null;
		if(book.isDisplayed())
		{
			x="next page displayed";
		}
		return(x);
	}*/
	public void tduration()
	{
		duration.click();
	}
	public void eveningfly()
	{
		eveflight.click();
	}
	public void lowprice()
	{
		price.click();
	}
	public void booking() throws Exception
	{
		book.click();
		Thread.sleep(10000);
	}
	
}
