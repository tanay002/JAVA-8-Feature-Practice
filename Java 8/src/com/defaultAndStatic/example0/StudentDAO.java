package com.defaultAndStatic.example0;

import java.util.HashMap;
import java.util.Map;


public interface StudentDAO 
{

	Map<String,String> studentDetails = new HashMap<String, String>();
	public void getById();
	public void fetchDetailsByCode();
	public static void displayInterfaceName()
	{
		System.out.println("Studennt DAO Interface");
	}
	
	public default void printAllDetails()
	{  
		for(Map.Entry<String,String> entry : studentDetails.entrySet())
		{
			System.out.println("Name is "+entry.getValue()+" and mobileNumber is "+entry.getKey());	
		}
	}
	public default void setStudentNameByMobileNumber(String mobileNumber, String name)
	{
		studentDetails.put(mobileNumber,name);

	}

	public default String getStudentNameByAadharNumber(String mobileNumber)
	{
		return studentDetails.get(mobileNumber);
	}
}
