package com.defaultAndStatic;

public class Printer implements Interface1, Interface2
{
	/* If we does not overide printName method then it will give cte (duplicate default method printName with the parameter () and
	 () are inherited for type interface 1 and Interface 2

	 Now in this case we have to override printName Method
	 */

	public void printName()
	{
		System.out.println("Tanny Saxena");
	}
	
	public static void main(String[] args)
	{
		Printer p=new Printer();
		p.printName();
			
		Interface1 i=new Printer();
		i.printName();
		
		Interface1 i2=new Printer();
		i2.printName();
		
		/*Overrided method will be executed in both the case whether we create reference of interface*/	
	}
}
