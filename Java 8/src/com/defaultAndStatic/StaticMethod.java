package com.defaultstatic;
interface StaticConcpet
{
	public static void m1()
	{
		System.out.println("Static Concept");
	}
}

public class StaticMethod implements StaticConcpet
{

	public void m1() {
		//Left.super.m1();
		//Right.super.m1();
	}
	

}
