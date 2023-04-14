package com.lambda.one;

import java.util.Scanner;

interface StringCalculator
{
	public abstract int getLength(String name);	
}
public class Lambda5 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		StringCalculator sca=(String name)->{
			return name.length();
		};
		int i=sca.getLength(sc.nextLine());
		System.out.println(i);
	}
}
