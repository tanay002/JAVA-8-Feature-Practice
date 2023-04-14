package com.predefined.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionEmployeeSalaryIncrement4
{
	public static List<Employee> populate(List<Employee> list)
	{
		list.add(new Employee("Tanay",76000));
		list.add(new Employee("Vijay",56203));
		list.add(new Employee("Ranjeet",66039));
		list.add(new Employee("Shivam",86909));
		list.add(new Employee("Rahul",96367));
		list.add(new Employee("Vinay",46223));
		list.add(new Employee("Shubham",36333));
		list.add(new Employee("Kunal",30342));
		return list;
	}

	public static void main(String[] args)
	{
		List<Employee> empData=populate(new ArrayList<Employee>()); 
		Predicate<Employee> eep=eek->eek.getSalary()<66000;

		Function<Employee,Employee> func=emp->{
			/*	double sal=emp.getSalary();
			if(emp.getSalary()<66000)
				emp.setSalary(sal+5555);

			 */	
			emp.setSalary(emp.getSalary()+5555);
			return emp;

		};
		List<Employee> empp =new ArrayList<Employee>();
		for(Employee ee: empData)
		{
			if(eep.test(ee))
			{
				empp.add(func.apply(ee));
			}
		}
		System.out.println("Employee after increment" + empp);

	}
}
