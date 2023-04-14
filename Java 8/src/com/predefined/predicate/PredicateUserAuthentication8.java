package com.predefined.predicate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class User
{
	private String username;
	private String password;

	User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}

public class PredicateUserAuthentication8
{
	public static void m2(Predicate<User> user,User u)
	{
	     if(user.test(u))
	    	 System.out.println("Valid user");
	     else
	    	 System.out.println("Invalid User");
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username and password for validation");
		String userName=sc.next();
		String pass=sc.next();
		User u=new User(userName, pass);
		Predicate<User> user= us->us.getUsername().equals("Tanay") && us.getPassword().equals("12345");
		m2(user,u);
	}
}
