package WOSpractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wosGUI {
	
	@Test
	public void AddressValidation()
	{
	System.out.println("Address Validaion Successfully Done");
	}
	
	@BeforeTest
	public void AddressValidation2()
	{
	System.out.println("last execution Successfully Done, I'm inside WOS GUI Class");
	}
	
	
	@BeforeSuite
	public void FirstinSuite()
	{
		System.out.println("First in whole suite, I'm inside WOS GUI Class");
	}

}
