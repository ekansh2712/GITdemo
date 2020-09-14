package WOSpractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IPPS {
	
	@Test
	public void AccesslineNewRequest() 
	{
		System.out.println("Access line new installation request");
	}
	
	@Test
	public void AccesslineDisconnect() 
	{
		System.out.println("Access line Disconnect request");
	}

	@BeforeMethod
	public void EveryTC()
	{
		System.out.println("BEfore every method of IPPS class");
	}
	
	@Test(groups = {"smoke"})
	public void Groups()
	{
		System.out.println("***Understanding group concept in IPPS***");
	}
}
