package com.predefined.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingUserPasswordValidate7 
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      String username=sc.next();
      String password=sc.next();
      Function<String,String> fun1=str1->str1.substring(0,5);
      Function<String,String> fun2=str1->str1.toLowerCase();
      
      if(fun1.andThen(fun2).apply(username).equals("tanay") && password.equals("password"))
    	  System.out.println("Valid User");
      else
    	  System.out.println("Invalid User");
      
      
	}
}
