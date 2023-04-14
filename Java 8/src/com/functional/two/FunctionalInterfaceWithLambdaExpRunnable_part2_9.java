package com.functional.two;

public class FunctionalInterfaceWithLambdaExpRunnable_part2_9
{
	public static void main(String[] args) 
	{
		Thread t=new Thread(()->{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Child Thread "+i);
			}
		});
		t.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main Thread "+i);
		}
	}
}
