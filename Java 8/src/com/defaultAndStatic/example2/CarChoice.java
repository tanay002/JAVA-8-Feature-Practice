package com.defaultAndStatic.example2;

public class CarChoice implements CarPicker1, CarPicker2
{
	/*CarChoice  class ki myLuxuryCarName method internally invoke CarPicker1,CarPicker2 method ( line No 10 ,11) */
	public void myLuxuryCarName()
	{
		System.out.println("My Personal Exp says Audi Car");

		CarPicker1.super.myLuxuryCarName();
		CarPicker2.super.myLuxuryCarName();

	}
	public static void main(String[] args) 
	{
		CarChoice c=new CarChoice();
		c.myLuxuryCarName();
	}
}
