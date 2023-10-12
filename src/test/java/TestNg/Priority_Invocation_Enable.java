package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation_Enable {

	@Test(priority=-5,invocationCount=3,enabled=false)
	public void Demo1()
	{
		System.out.println("Hi Demo1");
	}
	@Test(priority=2,invocationCount=-2)
	public void Demo2()
	{
		System.out.println("Hi Demo2");
	}
	@Test(priority=-2,invocationCount=4)
	public void Demo3()
	{
		System.out.println("Hi Demo3");
	}

}
