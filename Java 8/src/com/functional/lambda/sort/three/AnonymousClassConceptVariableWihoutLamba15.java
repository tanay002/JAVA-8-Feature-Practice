package com.functional.lambda.sort.three;

interface Alpha
{
void m1();	
}
public class AnonymousClassConceptVariableWihoutLamba15 {

	int x=888;
	public void m2()
	{
		Alpha a=new Alpha() {
			
			int x=999;
			public void m1() {
			System.out.println(this.x);
				
			}
		};
		a.m1();
	}
	
	public static void main(String[] args) {
		AnonymousClassConceptVariableWihoutLamba15 a =new AnonymousClassConceptVariableWihoutLamba15();
		a.m2();
	}
}
