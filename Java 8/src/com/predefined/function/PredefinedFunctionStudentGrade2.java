package com.predefined.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student
{
	private String name;
	private int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}	
	
	public String toString()
	{
		return name+" "+marks;
	}
}

public class PredefinedFunctionStudentGrade2 
{
	public static List<Student> populate(List<Student> list)
	{
		list.add(new Student("Tanay",76));
		list.add(new Student("Vijay",56));
		list.add(new Student("Ranjeet",66));
		list.add(new Student("Shivam",86));
		list.add(new Student("Rahul",96));
		list.add(new Student("Vinay",46));
		list.add(new Student("Shubham",36));
		list.add(new Student("Kunal",30));
		return list;
	}
	
	public static void main(String[] args)
	{
     List<Student> stu=populate(new ArrayList<Student>());
     Function<Student,String> func=stud->{
    	 if(stud.getMarks()>=80)
    		 return "A[Dictinction]";
    	 else if(stud.getMarks()>=60)
    		 return "B[First Class]";
    	 else if(stud.getMarks()>=50)
    		 return "C[Second Class]";
    	 else if(stud.getMarks()>=35)
    		 return "D[Third Class]";
    	 else
    		 return "E[Failed]";
     };
     
     for(Student ss: stu)
     {
    	 System.out.println(ss.getName()+" result is "+func.apply(ss));
     }
	}
}
