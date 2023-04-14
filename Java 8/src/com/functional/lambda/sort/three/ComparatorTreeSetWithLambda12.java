package com.functional.lambda.sort.three;
import java.util.TreeSet;

public class ComparatorTreeSetWithLambda12
{
	public static void main(String[] args) {

		TreeSet<Integer> a=new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		a.add(10);
		a.add(28);
		a.add(18);
		a.add(78);
		a.add(16);
		
		System.out.println("Asc Order "+a);
	}
}