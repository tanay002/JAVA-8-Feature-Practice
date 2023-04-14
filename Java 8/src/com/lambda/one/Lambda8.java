package com.lambda.one;

@FunctionalInterface
interface StringLength
{
abstract int getStringLength(String str);

}
public class Lambda8 
{
	
	public static void main(String[] args) 
	{

	/*	StringLength strLen= (String str)-> {
			return str.length();
			};
		strLen.getStringLength("TS");
		
		These above code is concise to below code
		*/
		
		StringLength strLen= str-> str.length(); // If it is taking only one parameter , then these parenthesis are optional (str).
		                                         // These method return something based on situation , compiler can able to guess , so we are not required to write return keyword explicitly
			                                    // If single statement then no curly braces is required.
		                                        // If these contain single statement then no curly braces is required.
		                                       
		int len=	strLen.getStringLength("Tanay Saxena");
		System.out.println(len);
		
	}
}
