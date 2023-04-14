package com.lambda.one;

@FunctionalInterface
interface B
{
	public abstract void demo();
}
public class Lambda1
{

	public static void main(String[] args) 
	{
		   B b= ()->{  
			System.out.println("Rahul");
		};
		b.demo();
	}
}

