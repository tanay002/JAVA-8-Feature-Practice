package com.functional.lambda.sort.three;

interface Beta2
{
void m1();	
}
public class AnonymousClassConceptVariableWithLamba16 {

	int x=888;
	public void m2()
	{
		Beta2 a=()->{
			int x=999;
			System.out.println(this.x);
		};
		a.m1();
	}
	
	public static void main(String[] args) {
		AnonymousClassConceptVariableWihoutLamba15 a =new AnonymousClassConceptVariableWihoutLamba15();
		a.m2();
	}
}
