package com.functional.two;

@FunctionalInterface
interface Case3
{
	public void m1();	
}

@FunctionalInterface
public interface FunctionInterfaceWrtInheritanceCase6 extends Case3
{
//	public void m2();	
 // FunctionInterfaceWrtInheritanceCase3 is  a functional interface ,but it contain 2 abstract method.So it is not a valid case
}
