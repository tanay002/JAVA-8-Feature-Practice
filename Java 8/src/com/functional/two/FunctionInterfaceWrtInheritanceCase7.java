package com.functional.two;

@FunctionalInterface
interface Case4
{
	public void m1();	
}

public interface FunctionInterfaceWrtInheritanceCase7 extends Case4
{
	public void m2();	
 // Valid case :- FunctionInterfaceWrtInheritanceCase3 is not a functional interface as it contain 2 abstract method.
}
