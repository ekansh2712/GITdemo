package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstProgram {

	@Test (dataProvider = "dataFetch")
	public void demomethod(String usernameData, String pwddata)
	{
		System.out.println(usernameData);
		System.out.println(pwddata);
		
	}

@Parameters({"url check", "usernameXpath", "pwdXpath"})
@Test  //(dataProvider = "dataFetch")
	public void demomethod2(String linkcheck, String username, String password)  //String usernameData, String pwddata
	{

	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Hello again");
	driver.get(linkcheck);
	driver.findElement(By.xpath(username)).sendKeys("ekansh");
	driver.findElement(By.xpath(password)).sendKeys("raunak");
	Assert.assertFalse(password == username );
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[3]/div[1]/div[1]")).click();
	//System.out.println(usernameData);
	//System.out.println(pwddata);
	}
	
@Test(dependsOnMethods= {"demomethod2"})	
public void TestToFail()				
{		
    System.out.println("This method to test fail and check listeners");					
    Assert.assertTrue(false);	
    System.out.println("This method to test fail and check listeners and assertions");	
}


 @DataProvider
public Object[][] dataFetch()
{
Object [][] data= new Object [2][2];
		data [0] [0] = "ekansh";
		data [0][1] = "raunak";
		data [1][0] = "shyam";
		data [1][1]	= "sundar"	;
		
		return data;			
} 

}
