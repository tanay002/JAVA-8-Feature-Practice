package com.functional.two;

@FunctionalInterface
interface Case2
{
	public void m1();	
}

@FunctionalInterface
public interface FunctionInterfaceWrtInheritanceCase5 extends Case2
{
	public void m1();	
 // FunctionInterfaceWrtInheritanceCase1 interface is  a functional interface as it override m1() method of Case1 interface  
}
