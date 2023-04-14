package com.lambda.one;

interface Notes
{
	public abstract void printNotes();	
}

public class Lambda6 
{
	public static void main(String[] args)
	{

		Notes n=()->System.out.println("Notes.....");
		n.printNotes();
	}
}
