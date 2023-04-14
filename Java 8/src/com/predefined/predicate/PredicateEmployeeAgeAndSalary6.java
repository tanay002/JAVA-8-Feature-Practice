package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

class Employee
{
	private int id;
	private String name;
	private int age;
	private Long salary; 

	Employee(int id,String name,int age,Long salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public int hashCode()
	{
		return (id+""+name+""+age+""+salary).hashCode();
	}

	public boolean equals(Object e1)
	{
		Employee ee= (Employee) e1;
		if(this.hashCode()==ee.hashCode())
			return true;
		else
			return false;
	}
}
public class PredicateEmployeeAgeAndSalary6
{
	public static void m1(Predicate<Employee> p1,ArrayList<Employee> emplist)
	{
		for(Employee emp:emplist)
		{
			if(p1.test(emp))
				System.out.print(emp+" ");
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(0,"Tanay",45,75000L));
		empList.add(new Employee(1,"Raj",65,40000L));
		empList.add(new Employee(2,"Rohal",30,300000L));
		empList.add(new Employee(3,"Kunal",25,60000L));
		empList.add(new Employee(4,"Devish",27,35000L));
		empList.add(new Employee(4,"Dheeraj",70,120000L));

		Predicate<Employee> P1=emp->emp.getAge()>40;

		Predicate<Employee> P2=emp->emp.getSalary()>40000;
		System.out.println("The names of Employee whose age is 40+ and salary is 40000+ ");
		m1(P1.and(P2),empList);
	}
}
