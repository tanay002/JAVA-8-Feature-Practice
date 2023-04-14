package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCheckNull7
{
	public static void main(String[] args)
	{
		String [] str= {"Tanay"," ","Ranjeet",null,"Rahul",null,"Ashutosh",""};
		
		Predicate<String> P1= strr->strr!=null && strr.trim().length()!=0;
		System.out.println("The names which is not null is  ");
		ArrayList<String> a=new ArrayList<>();
		for(String strr:str)
		{
			if(P1.test(strr))
			{
				a.add(strr);			}
		}
		
		System.out.println(a);
	}
}
