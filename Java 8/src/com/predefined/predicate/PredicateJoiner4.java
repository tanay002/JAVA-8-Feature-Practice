package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateJoiner4
{
	public static void m1(Predicate<Integer> p1,int [] x)
	{
		for(int x1:x)
		{
			if(p1.test(x1))
			System.out.print(x1+" ");
		}
	}
	
	public static void main(String[] args) {

		int [] x= {10,12,5,13,7,4};
		
		Predicate<Integer> P1=i->i>10;
		System.out.println("The number greater than 10 are ");
		m1(P1,x);
		
		Predicate<Integer> P2=i->i%2==0;
       System.out.println("\n\nThe even numbers are ");
       m1(P2,x);
		
       System.out.println("\n\nThe number not greater than 10 are");
       m1(P1.negate(),x);
       
       System.out.println("\n\nThe number greater than 10 and even number are");
       m1(P1.and(P2),x);
	
       System.out.println("\n\nThe number greater than 10 or even number are");
       m1(P1.or(P2),x);
	}
}
