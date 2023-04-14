package com.functional.lambda.sort.three;
import java.util.TreeMap;

public class ComparatorTreeMapWithLambda13
{
	public static void main(String[] args) {

		TreeMap<Integer,String> a=new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		a.put(10,"Tanay Saxena");
		a.put(28,"Raj Verma");
		a.put(18,"Vineet Sharma");
		a.put(78,"Deepesh Verma");
		a.put(16,"Pawan Kalyan");
		
		System.out.println("Asc Order "+a);
	}
}