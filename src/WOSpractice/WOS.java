package WOSpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WOS {
	
	@AfterTest
	public void cacheClear()
	{
		System.out.println("Cache Cleared After running 1st test module, , I'm inside WOS Class");
	}
	
	@Test
	public void TrunkOnly()
	{
		System.out.println("Trunk only request submitted");
	}
	
	@Test
	public void PremtoPrem()
	{
		System.out.println("Prem to Prem megalink request submitted");
	}
	@Test
	public void DS1Trunk()
	{
		System.out.println("DS1 with trunks request submitted ");
	}

	@Test(groups = {"smoke"})
	public void Groups()
	{
		System.out.println("***Understanding group concept in WOS***");
	}
	
@Parameters({"url check", "Xpath"})
	@Test
	public void URLcheck(String urlname, String xpathValue)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Checking url**************I'm in WOS class");
		driver.get(urlname);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath(xpathValue)).getAttribute("class"));
	}

	
}


