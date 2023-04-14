package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate5
{
	public static void m1(Predicate<String> p1,String [] str)
	{
		for(String st:str)
		{
			if(p1.test(st))
			System.out.print(st+" ");
		}
	}
	
	public static void main(String[] args)
	{
		String [] x= {"Tanay","Raj","Kapil","Kunal","Dheraj","Jatin"};
		Predicate<String> P1=str->str.charAt(0)=='K';
		System.out.println("The names which starts with K are ");
		m1(P1,x);
	}
}
