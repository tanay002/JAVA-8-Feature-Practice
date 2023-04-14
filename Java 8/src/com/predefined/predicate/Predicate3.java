package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate3
{
	public static void main(String[] args) {
//Check collection object is empty or not
		Predicate <Collection> p= 
				col-> col.isEmpty();
				
				ArrayList al=new ArrayList<>();
				al.add("Sumit");
				System.out.println(p.test(al));
				
				ArrayList al2=new ArrayList<>();
				System.out.println(p.test(al2));
	}
}
