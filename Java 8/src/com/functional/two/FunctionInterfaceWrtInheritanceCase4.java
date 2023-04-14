package com.functional.two;

@FunctionalInterface
interface Case1
{
	public void m1();	
}

@FunctionalInterface
public interface FunctionInterfaceWrtInheritanceCase4 extends Case1
{
 // FunctionInterfaceWrtInheritanceCase1 interface is  a functional interface as it contain m1() method of Case1 interface  
}
