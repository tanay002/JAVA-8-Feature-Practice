package com.functional.two;

@FunctionalInterface
public interface FunctionalInterface1
{
	public void m1();
	
	default void demo()
	{
		System.out.println("Test this case");	
	}
	
	static void demo2()
	{
		System.out.println("Test another scenario");
	}
}
