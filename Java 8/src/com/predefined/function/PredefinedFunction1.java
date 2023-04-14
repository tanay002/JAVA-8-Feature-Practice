package com.predefined.function;

import java.util.function.Function;

public class PredefinedFunction1
{
	public static void main(String[] args) 
	{
     Function<String,Integer> fun= str->str.length();
     System.out.println(fun.apply("Kunal"));
     
     Function<Integer,Integer> fun2= value-> value*value;
 	System.out.println(fun2.apply(6));
 	
    Function<String,String> fun3= str->str.replace(" ","");
    System.out.println(fun3.apply("Today is holiday so what is the plan"));
    
	
	  Function<String,Integer> fun4= str->str.length()- str.replaceAll(" ","").length();
	    System.out.println(fun4.apply("Today is holiday so what is the plan"));
	
	}

}
