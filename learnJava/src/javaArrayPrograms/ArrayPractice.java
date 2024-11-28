package javaArrayPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayPractice {
	
	public static void main(String[] args) {
		int[] arr = {0,8,2,9,4,6};
		int a = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<a) {
				a= arr[i];
			}
		}
		
		System.out.println(a);
	}

}
