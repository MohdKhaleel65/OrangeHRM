package com.MethodExample;

public class MethodsExample_Multiple {
	public void multiplication()
	{
		int a=2,b=6,c;
		c=a*b;
		System.out.println("The Value Of c After multiplication is : "+c);
	}
	
	
	
	public void Subtraction()
	{
		int x=10,y=5,z;
		z=x-y;
		System.out.println("The Value Of z After Subtraction is : "+z);
	}
	public static void main(String[] args) {
		MethodsExample_Multiple m1=new MethodsExample_Multiple();
		m1.hello();
		m1.multiplication();
		m1.addtion();
		m1.Subtraction();
		m1.division();
	}
	public void addtion()
	{
		int  a=15,b=20,c;
		c=a+b;
		System.out.println("The Value Of c After Addition is : "+c);
	}
	public void division()
	{
		int x=10,y=2;
		int z;
		z=x/y;
		System.out.println("The Value Of z After division is : "+z);
	
	}
	private void hello()
	{
		System.out.println("hello world");
	}

}
