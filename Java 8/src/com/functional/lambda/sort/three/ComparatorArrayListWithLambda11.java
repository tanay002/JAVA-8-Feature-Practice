package com.functional.lambda.sort.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorArrayListWithLambda11
{
	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(28);
		a.add(18);
		a.add(78);
		a.add(16);
		Collections.sort(a,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
       System.out.println("Des Order "+a);

		Collections.sort(a,(I1,I2)->{
			if(I1<I2)
				return -1;
			else if(I1>I2)
				return 1;
			return 0;
		});

		System.out.println("Asc Order "+a);
	}
}