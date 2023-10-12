package TestNg_Group;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("Hi Demo1");
	}
	
	@Test(groups="smoke1")
	public void demo2()
	{
		System.out.println("Hi Demo2");
	}

}
