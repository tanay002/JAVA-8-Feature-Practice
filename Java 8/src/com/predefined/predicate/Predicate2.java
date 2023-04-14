package com.predefined.predicate;

import java.util.function.Predicate;

public class Predicate2 
{
	public static void main(String[] args) {
	
		Predicate <String> p= 
				str-> str.length()>5;
				System.out.println(p.test("Tarunesh"));
				System.out.println(p.test("Tarun"));
	}
}
