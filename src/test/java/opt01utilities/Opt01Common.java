package opt01utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Opt01Common 
{
	RemoteWebDriver queen;

	public RemoteWebDriver openBrowser(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			queen= new ChromeDriver();
		}
		else if(br.equals("safari"))
		{
			System.setProperty("webdriver.safari.driver","");
			queen= new SafariDriver();
		}
		queen.manage().window().maximize();
		return(queen);
	}
	public void openSite(String url)
	{
		queen.get(url);
	}
	public void closesite()
	{
		queen.quit();
	}
	public String screenShot() throws Exception
	{
		File src=queen.getScreenshotAs(OutputType.FILE);
		File dest= new File("screenshot.png");
		FileHandler.copy(src,dest);
		return(dest.getAbsolutePath());
		
	}
}
