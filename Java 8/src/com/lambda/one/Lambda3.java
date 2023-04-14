package com.lambda.one;

@FunctionalInterface
interface Beta
{
	public abstract int calculateValue(int i,int j);	
}
public class Lambda3 
{

	public static void main(String[] args) 
	{
		Beta b=(int i,int j)->{
			return i+j;	
		};
		int sum=b.calculateValue(20, 30);
		System.out.println(sum);
	}
}
