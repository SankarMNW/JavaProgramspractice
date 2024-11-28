package javaArrayPrograms;

import java.util.Arrays;

public class ArraySecondMax {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int first = 0;
		int second = 0;
//		int third = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]>first) {
//				third = second;
				second = first;
				first = arr[i];
			}else if(arr[i]>second) {
				second = arr[i];
			}
//				else if(arr[i]>third) {
//				third = arr[i];
//			}
			
		}
		
		System.out.println("First Maximun is: "+first);
		System.out.println("Second Maximun is: "+second);
//		System.out.println("Third Maximun is: "+third);
	}

}
