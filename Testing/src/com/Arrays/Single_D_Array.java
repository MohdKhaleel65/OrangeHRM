package com.Arrays;

public class Single_D_Array {
public static void main(String[] args) {
	
	int array6[]=new int[4];
	int array6length=array6.length;
	System.out.println(array6length);
	
	array6[0]=15; array6[1]=25;array6[2]=35;array6[3]=45;
	/*System.out.println(array6[0]);
	System.out.println(array6[1]);
	System.out.println(array6[2]);
	System.out.println(array6[3]);*/

	for(int i=0;i<=3;i++)
	{
		System.out.println("the value of array6 index "+ i+ " is "+array6[i]);
	
		if(25==array6[1])
		{
			System.out.println("Testing");
		}
	}

	
	
}
	
	
	
	
}
