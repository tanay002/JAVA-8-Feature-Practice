package com.functional.two;

public class FunctionalInterfaceWithLambdaExpRunnable9
{
	public static void main(String[] args) 
	{
		Runnable r=()->{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Child Thread "+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main Thread "+i);
		}
	}
}
