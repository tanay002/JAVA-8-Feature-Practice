package com.predefined.function;

import java.util.function.Function;

public class FunctionChaining5 {

	public static void main(String[] args) {
		Function<String,String> f1= s-> s.toUpperCase();
		Function<String,String> f2=s->s.substring(0,5);
		System.out.println(f1.apply("TanaySaxena"));
		System.out.println(f2.apply("TanaySaxena"));
		
		System.out.println(f1.andThen(f2).apply("TanaySaxena"));
		System.out.println(f2.compose(f1).apply("TanaySaxena"));
	}
}
