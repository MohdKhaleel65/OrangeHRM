package com.Arrays;

public class Double_D_Array {
public static void main(String[] args) {
	
	String array1[][]=new String[2][2];
	array1[0][0]="mohammed";
	array1[0][1]="Khaleel";
	array1[1][0]="Ali";
	array1[1][1]="Sayeed";
	
	int array1_length=array1.length;
	System.out.println(array1_length);
	//System.out.println(array1[1][0]);
	for(int i=0;i<array1_length;i++)
	{
		for(int j=0;j<array1_length;j++)
		{
			System.out.print(array1[i][j]+" ");
		}
		System.out.println();
	}
	}
}


	
	
	

	
	
	

