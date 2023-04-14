package com.predefined.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmployeeDetails
{
	private String name;
	private String designation;
	private Long salary;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city;
	}


	public EmployeeDetails(String name, String designation, Long salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}


	
}
public class PredicateEmployee_10
{
	public static List<EmployeeDetails> populate()
	{
		List<EmployeeDetails> emp=new ArrayList<>();
		emp.add(new EmployeeDetails("Santosh Sahu", "Manager", 160000L, "Indore"));
		emp.add(new EmployeeDetails("Tanay Saxena", "Software Engineer", 50000L, "Rajgarh"));
		emp.add(new EmployeeDetails("Shubham Rajput", "Associate Software Engineer", 35000L, "Bhopal"));
		emp.add(new EmployeeDetails("Samarath Jain", "Software Engineer", 55000L, "Guna"));
		emp.add(new EmployeeDetails("Sooraj Prasad", "Senior Software Engineer", 60000L, "Satna"));
		emp.add(new EmployeeDetails("Nishant Jain", "Senior Software Engineer", 60000L, "Gorakpur"));
		emp.add(new EmployeeDetails("Manas Luktuke", "Associate Software Engineer", 35000L, "Badwani"));
		emp.add(new EmployeeDetails("Abhishek Prajapati", "Associate Software Engineer", 40000L, "Mumbai"));
		emp.add(new EmployeeDetails("Shivam Joshi", "Software Engineer", 50000L, "Bhopal"));
		emp.add(new EmployeeDetails("Kamlesh Chillate", "Senior Software Engineer", 90000L, "Ujjain"));
		emp.add(new EmployeeDetails("Milind Joshi", "Technical Lead", 120000L, "Indore"));
		return emp;
	}

	public static void display(Predicate<EmployeeDetails> empPred,List<EmployeeDetails> emp,String code)
	{
		for(EmployeeDetails empp : emp)
		{
			if(empPred.test(empp))
			{
				System.out.println(code+""+empp);
			}
		}
	}
	
	public static void main(String[] args) {
		List<EmployeeDetails> emp=populate();
		Predicate<EmployeeDetails> empData=empk->empk.getDesignation().equalsIgnoreCase("Manager");
		display(empData, emp, "Employee whose designation is manager is ");
		
		Predicate<EmployeeDetails> empData2=empk->empk.getCity().equalsIgnoreCase("Indore");
		display(empData2, emp, "Employee whose city is indore is ");

		Predicate<EmployeeDetails> empData3=empk->empk.getSalary()>100000L;
		display(empData2, emp, "Employee whose salary is greater than or equal 1 Lakh ");
		
		Predicate<EmployeeDetails> empData5=empk->empk.getSalary()<60000L;
		display(empData5, emp, "Employee whose salary less than 60,000 ");
	
		
		display(empData.and(empData2), emp, "Pink slip ");
		
		display(empData.or(empData5), emp, "Manager with employee whose salary is less than 60,000 ");
		
		display(empData.negate(), emp, "Employee who is not manager ");
	}
}
