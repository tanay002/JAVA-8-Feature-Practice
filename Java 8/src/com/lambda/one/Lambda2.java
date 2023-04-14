package com.lambda.one;

interface Alpha
{
	public  abstract String demo();
}
public class Lambda2 
{
	public static void main(String[] args) 
	{
         Alpha a=()->{
        	 return "Tanay is a developer";
         };
         String info=a.demo();
         System.out.println(info);
         
	}
}
