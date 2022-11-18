package com.MethodExample;

public class Method_Example1 extends MethodsExample_Multiple {
	int a=10,b=5;
	//int c=a+b;
	private void method1()
	{
		System.out.println("method1 is executed successfully");
	
	}

	protected void method2()
	{
		System.out.println("method2 is executed successfully");
	}
	public static void main(String[] args) {

		Method_Example1 m2=new Method_Example1();
		m2.addtion();
		m2.subtraction(70, 15);
		m2.division();
		m2.method1();
		m2.method2();
		m2.multiplication();
		m2.addition1();
	}
	void subtraction(int a , int b )
	{
		int x=a-b;
		System.out.println(x);
	}
	public void addition1()
	{
		//int a=5,b=25;
		int c;
		c=a-b;
		System.out.println(c);
	}
		
	
}
