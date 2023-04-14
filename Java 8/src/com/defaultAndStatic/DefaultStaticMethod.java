package com.defaultstatic;
interface Left
{
	default void m1()
	{
		System.out.println("Left Method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right Method");
	}
}
public class DefaultStaticMethod implements Left,Right
{

	public void m1() {
		//Left.super.m1();
		//Right.super.m1();
	}
	

}
