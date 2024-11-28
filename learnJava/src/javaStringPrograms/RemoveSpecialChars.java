package javaStringPrograms;

import java.util.Scanner;

public class RemoveSpecialChars {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String with Special chars: ");
		String str = sc.nextLine();
		
		// ASCII --> A-Z = 65-90 && a-z = 97-122
		// store the string in Char format in char[]
		char[] chars = str.toCharArray();
		String temp = "";
		for(char c : chars) {
			// store the char values in integer
			int a = c;
			if((a>=65 && a<=90) || (a>=97 && a<=122)) {
				// Type Casting to store the integer value in char
				char charValues =(char) a;
				temp = temp+charValues;				
			}
		}
		
		System.out.println("Remove Special chars: "+temp);
		
	}

}
