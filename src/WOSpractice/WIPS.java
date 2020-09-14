package WOSpractice;

import org.testng.annotations.Test;

public class WIPS {
	
	@Test
	public void GITHUB()
	{
		System.out.println("wosGUI class updated for third time ");
	}
	
	@Test
	public void RTCircuits()
	{
		System.out.println("RT circuits execution");
	}

	@Test
	public void MSPLines()
	{
		System.out.println("MSP lines execution");
		
		generalTab();
	}
	
	private void generalTab() {
		System.out.println("Method inside a method is working fine, , I'm inside WIPS Class and method MSP Lines");
		
	}

	@Test
	public void LightGatechannelised()
	{
		System.out.println("Light Gate DS3 channelised execution");
	}

	@Test
	public void LightGateNONchannelised()
	{
		System.out.println("Light Gate DS3 NON channelised execution");
	}
	
	@Test(groups = {"smoke"})
	public void Groups()
	{
		System.out.println("***Understanding group concept in WIPS***");
	}

}
