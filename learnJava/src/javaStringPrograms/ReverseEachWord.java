package javaStringPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scan.nextLine();
		
		// Split the Every string using space " "
		String[] splitStr = str.split(" ");
		
		String reverseStr = "";
		for(int i=0; i<=splitStr.length-1; i++) {			
			String newStr = splitStr[i];
			newStr += " ";
			for(int j=newStr.length()-1; j>=0; j--) {
				reverseStr += newStr.charAt(j);
			}
		}
		
		System.out.println(reverseStr.trim());
	}	

}
