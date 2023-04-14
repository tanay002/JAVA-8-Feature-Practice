package com.functional.two;

@FunctionalInterface
interface SquareNumber
{
	public int square(int a);	
}

public class FunctionalInterfaceWithLambdaExp8 
{
	public static void main(String[] args) 
	{
		SquareNumber sn=a->a*a;
		System.out.println(sn.square(8));
	}
}
