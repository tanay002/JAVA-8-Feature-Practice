package com.lambda.one;

interface Notes2
{
	public abstract void calculateSum(int a,int b);	
}

public class Lambda7 
{
	public static void main(String[] args)
	{

		Notes2 n= (a,b)->System.out.println("Sum= "+(a+b));
		n.calculateSum(20,10);
	}
}
