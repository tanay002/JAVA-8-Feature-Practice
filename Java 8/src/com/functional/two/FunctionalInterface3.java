package com.functional.two;

@FunctionalInterface
public interface FunctionalInterface3
{
	//There must be atleast one abstract method
	//If there is no abstract method then it will give CTE -> Invalid '@FunctionalInterface' annotation; FunctionalInterface3 is not a functional interface
	public void m1();
}
