package com.predefined.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual_11
{
	public static void main(String[] args) {
		Predicate<String> p= Predicate.isEqual("Tanay");
		boolean b=p.test("Tanay");
		System.out.println(b);

		Employee e=new Employee(1,"Radhe", 34, 67000L);
		Employee  e1=new Employee(1,"Radhe", 34, 67000L);
		Employee e2=new Employee(2,"Kunal", 56, 78000L);
		
		Predicate<Employee> empData= Predicate.isEqual(e);
                             boolean kp=empData.test(e1);
                             System.out.println(kp);
                             
       
	}
}
