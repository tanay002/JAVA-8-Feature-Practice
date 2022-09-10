package com.defaultAndStatic.example0;

import java.util.Map;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void getById() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchDetailsByCode() {
		// TODO Auto-generated method stub

	}

	/* Override Method as per requirment */
	public void printAllDetails() 
	{  
		for(Map.Entry<String,String> entry : studentDetails.entrySet())
		{
			System.out.println("Name is "+entry.getValue());	
		}
	}
	public static void main(String[] args) 
	{
		StudentDAO.displayInterfaceName();
		StudentDAO dao=new StudentDAOImpl();
		dao.setStudentNameByMobileNumber("9907820661","Ravikant Namdev");
		dao.setStudentNameByMobileNumber("9098880661","Sumit Kushwah");
		dao.setStudentNameByMobileNumber("887886735","Shiraj Saxena");
		dao.setStudentNameByMobileNumber("9988820661","Kunal Namdev");
		dao.setStudentNameByMobileNumber("90988861","kapil Kushwah");
         
		System.out.print("\n");
		
		dao.printAllDetails();
	}
	

}
