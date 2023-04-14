package com.predefined.predicate;

import java.util.function.Predicate;

public class Predicate1 
{
	public static void main(String[] args) {
		/*
		  Predicate <Integer> p= 
		  I->  { 
		      if(I>18) 
		       return true; 
		       else 
		       return false; 
		       };

		Simplify this above code
		 */

		Predicate <Integer> p= 
				I-> I>18;
				System.out.println(p.test(31));
				System.out.println(p.test(15));
	}
}
