package com.functional.lambda.sort.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer I1, Integer I2) {
	/*	if(I1>I2)
			return -1;
		else if(I1<I2)
			return +1;
		else
			return 0;
	*/
		return (I1>I2)?-1:(I1<I2)?1:0;
	}
}

public class ComparatorWithoutLambda10 
{
	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(28);
		a.add(18);
		a.add(78);
		a.add(16);
		Collections.sort(a, new Mycomparator());
		System.out.println(a);
	}
}