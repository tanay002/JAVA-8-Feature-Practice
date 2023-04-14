package com.functional.lambda.sort.three;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	private int empNo;
	private String empName;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return ""+empNo+" "+empName;
	}
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}


}

public class PredefinedObjectSortWithLambda14
{
	public static void main(String[] args) {
         Employee e1=new Employee(101, "Tanay");
         Employee e2=new Employee(71, "Rahul");
         Employee e3=new Employee(301, "Ravikant");
         Employee e4=new Employee(51, "Navin");
         Employee e5=new Employee(11, "Neeraj");
         
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		
		System.out.println("Before Sorting"+a);
		
		Collections.sort(a,(E1,E2)->(E1.getEmpNo()>E2.getEmpNo())?-1:(E1.getEmpNo()<E1.getEmpNo())?1:0);
		System.out.println("After Desc Order "+a);
		
	}
}