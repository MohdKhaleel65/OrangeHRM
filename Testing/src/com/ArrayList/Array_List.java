package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	public static void main(String[] args) {
		List <Object> array1=new ArrayList<>();
		array1.add("hello");
		array1.add(10);
		array1.add('h');
		array1.add(10.123);
		array1.add(122222345);
		array1.add("LiveTech");
		int array1length=array1.size();
		System.out.println(array1length);
		//System.out.println(array1.get(3));
		for(int i=0;i<array1length;i++)
		{
			System.out.println(array1.get(i));
		}
	}

}
