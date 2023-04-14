package com.lambda.one;

@FunctionalInterface
interface Calculate
{
	public abstract void sum(int i,int j,int k);	
	
}
public class Lambda4
{
	public static void main(String[] args) 
	{
      Calculate c=(int i,int j,int k)->{
    	  System.out.println(i+j+k);
      };
      c.sum(10, 20, 30);
	}
}
