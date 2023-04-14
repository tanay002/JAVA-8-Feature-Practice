package com.predefined.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee
{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}


}

public class PredefinedFunctionTotalEmployeeSalary3
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
		Function<List<Employee>,Double> func=emp->{
			Double totalSalary=0.0;
			for(Employee ss: emp)
			{
				totalSalary=totalSalary+ss.getSalary();
			}
			return totalSalary;
		};
     System.out.println("Total Salary is " +func.apply(empData));

	}
}
