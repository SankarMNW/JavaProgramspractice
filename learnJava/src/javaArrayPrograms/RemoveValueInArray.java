package javaArrayPrograms;

import java.util.Arrays;
import java.util.List;

public class RemoveValueInArray {
	
	private static int valuesOfArray;

	public static void main(String[] args) {
		
//		Remove particular value in an Array		
		int[] arr = {2,4,3,7,5,8,9};
		int findValue = 4;
		
		int count=0;
		int index = 0;
		
		// first Count the no of find values
		for(int values:arr) {
			if(values == findValue) {
				count++;
			}
		}
		System.out.println(count);
		
		int[] arr1 = new int[arr.length-count];
		for(int valuesOfArray : arr) {
			if(valuesOfArray != findValue) {
				arr1[index++] += valuesOfArray;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
