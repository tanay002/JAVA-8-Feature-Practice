package com.predefined.predicate;

import java.util.function.Predicate;

class SoftwareEngineer
{
	private String name;
	private int age;
	boolean isHavingGF;
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
	public boolean isHavingGF() {
		return isHavingGF;
	}
	public void setHavingGF(boolean isHavingGF) {
		this.isHavingGF = isHavingGF;
	}
	public SoftwareEngineer(String name, int age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}


}

public class PredicateSoftwareEngineerPub9
{
	/* 
	public static void m2(Predicate<SoftwareEngineer> user,SoftwareEngineer u)
	{
		if(user.test(u))
			System.out.println("Allowed in pub "+u.getName());
		    else
	    	 System.out.println("Not allowed");
	}
	 */
	public static void main(String[] args)
	{
		SoftwareEngineer[] sf= {
				new SoftwareEngineer("Tanay Saxena",27,true),
				new SoftwareEngineer("Ravi Verma",17,true),
				new SoftwareEngineer("Deepak Nanda",25,false),
				new SoftwareEngineer("Jitesh Kumar",24,true),
				new SoftwareEngineer("Rajan Verma",16,true),
				new SoftwareEngineer("Diksha Sharma",23,false)
		};

		Predicate<SoftwareEngineer> user= us->us.getAge()>=18 && us.isHavingGF()==Boolean.TRUE;
		for(SoftwareEngineer usere:sf)
		{
			if(user.test(usere))
				System.out.println("Allowed in pub "+usere.getName());	
			//m2(user,usere);
		}	
	}
}
