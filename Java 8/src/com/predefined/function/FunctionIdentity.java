package com.predefined.function;

import java.util.function.Function;

public class FunctionIdentity {
public static void main(String[] args) {
	Function<String,String> fun=Function.identity();

	System.out.println(fun.apply("tanay"));
}
}
